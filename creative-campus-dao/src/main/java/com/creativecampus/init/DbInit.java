package com.creativecampus.init;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * Run the main() method of this class to generate scripts for database initialization.
 */
public class DbInit
{
    private final static String SQL_FILE_SUFFIX = ".sql";
    private final static String DB_INIT_ROOT_DIRECTORY_PATH = "creative-campus-dao/src/resources/";
    private final static String TABLE_CREATION_ROOT_DIRECTORY_PATH = "creative-campus-dao/src/main/resources/database-initialization/table-creation";
    private final static String DATA_PREPARATION_ROOT_DIRECTORY_PATH = "creative-campus-dao/src/main/resources/database-initialization/data-preparation";
    private final static String[] EXCEPTION_FILE_NAMES = {"template_create_table.sql"};
    private final static String OUTPUT_FILE_PATH = "creative-campus-dao/src/main/resources/database-initialization/db-init.sql";

    private static boolean isExceptionalFilePath(String filePath)
    {
        for (String exceptionalFilePath : EXCEPTION_FILE_NAMES)
        {
            if (filePath.contains(exceptionalFilePath))
                return true;
        }

        return false;
    }

    private static boolean validateTableCreationCommand(String cmdTableCreation)
    {
        return true;
    }

    private static StringBuilder generateMySqlCommand(String rootDirectoryPath) throws IOException
    {
        StringBuilder cmdTableCreations = new StringBuilder();

        // TODO: Replace this directory operation with the Directory class in DataWorks.
        File dbInitRootDirectory = new File(rootDirectoryPath);
        for (File tableCreationFile : Objects.requireNonNull(dbInitRootDirectory.listFiles()))
        {
            if (tableCreationFile.isFile())
            {
                String tableCreationFilePath = tableCreationFile.getAbsolutePath();
                if (tableCreationFilePath.endsWith(SQL_FILE_SUFFIX) && (!isExceptionalFilePath(tableCreationFilePath)))
                {
                    String cmdTableCreation = dataworks.io.File.readAllText(tableCreationFilePath);
                    if (validateTableCreationCommand(cmdTableCreation))
                        cmdTableCreations.append(cmdTableCreation);
                }
            }
        }

        return cmdTableCreations;
    }

    private static StringBuilder generateTableCreationCommands() throws IOException
    {
        return generateMySqlCommand(TABLE_CREATION_ROOT_DIRECTORY_PATH);
    }

    private static StringBuilder generateDataPreparationCommands() throws IOException
    {
        return generateMySqlCommand(DATA_PREPARATION_ROOT_DIRECTORY_PATH);
    }

    public static void main(String[] args) throws IOException
    {
        String cmdDbInit = String.valueOf(generateTableCreationCommands()) + generateDataPreparationCommands();
        dataworks.io.File.writeAllText(new File(".").getAbsolutePath() + "/" + OUTPUT_FILE_PATH, cmdDbInit);
    }
}