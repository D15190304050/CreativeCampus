package com.creativecampus.commons.runtime.interceptors;

import org.springframework.util.StreamUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

public class RepeatableHttpServletRequestWrapper extends HttpServletRequestWrapper
{
    /**
     * Cache http request body.
     */
    private final byte[] requestBody;

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public RepeatableHttpServletRequestWrapper(HttpServletRequest request) throws IOException
    {
        super(request);
        requestBody = StreamUtils.copyToByteArray(request.getInputStream());
    }

    @Override
    public ServletInputStream getInputStream()
    {
        InputStream bodyStream = new ByteArrayInputStream(requestBody);

        // TODO: Figure out what the following methods are.
        return new ServletInputStream()
        {
            @Override
            public boolean isFinished()
            {
                return false;
            }

            @Override
            public boolean isReady()
            {
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener)
            {

            }

            @Override
            public int read() throws IOException
            {
                return bodyStream.read();
            }
        };
    }

    @Override
    public BufferedReader getReader()
    {
        InputStream bodyStream = new ByteArrayInputStream(requestBody);
        return new BufferedReader(new InputStreamReader(bodyStream));
    }
}
