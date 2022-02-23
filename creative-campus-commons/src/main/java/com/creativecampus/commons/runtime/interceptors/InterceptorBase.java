package com.creativecampus.commons.runtime.interceptors;

import com.creativecampus.commons.ServiceResponse;
import dataworks.Encoding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@Slf4j
public class InterceptorBase
{
    private InterceptorBase() {}

    public static void writeErrorResponse(HttpServletResponse response, ServiceResponse<?> errorResponse)
    {
        response.setCharacterEncoding(Encoding.UTF_8);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        OutputStream out = null;
        try
        {
            out = response.getOutputStream();
            out.write(errorResponse.toString().getBytes(StandardCharsets.UTF_8));
        }
        catch (IllegalStateException | IOException e)
        {
            log.error("Error: ", e);
        }
        finally
        {
            try
            {
                if (out != null)
                    out.close();
            }
            catch (IOException e)
            {
                log.error("Error when trying to close HTTP response output stream: ", e);
            }
        }
    }
}
