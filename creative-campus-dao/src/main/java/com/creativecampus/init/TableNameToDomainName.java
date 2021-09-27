package com.creativecampus.init;

import java.io.File;
import java.util.Objects;

public class TableNameToDomainName
{
    private final static String TABLE_CREATION_ROOT_DIRECTORY_PATH = "creative-campus-dao/src/main/resources/database-initialization/table-creation";

    public static void main(String[] args)
    {
        String prefix = "<table tableName=\"";
        String suffix = "\" enableCountByExample=\"false\" enableUpdateByExample=\"false\" enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\"/>";

        File dbInitRootDirectory = new File(TABLE_CREATION_ROOT_DIRECTORY_PATH);
        for (File tableCreationFile : Objects.requireNonNull(dbInitRootDirectory.listFiles()))
        {
            if (tableCreationFile.isFile())
            {
                String fileName = tableCreationFile.getName();
                String tableName = fileName.substring(0, fileName.indexOf("."));
                String tag = prefix + tableName + suffix;
                System.out.println(tag);
            }
        }
    }
}
