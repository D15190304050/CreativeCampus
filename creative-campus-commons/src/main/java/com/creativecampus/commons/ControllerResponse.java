package com.creativecampus.commons;

import dataworks.data.json.JsonSerializer;

import java.util.HashMap;

public class ControllerResponse<TData>
{
    public static final int SUCCESS_CODE = 0;

    private int code;
    private boolean success;
    private TData data;
    private String message;
    private HashMap<String, Object> other;

    public ControllerResponse()
    {
    }

    public ControllerResponse(int code, boolean success, TData data, String message, HashMap<String, Object> other)
    {
        this.code = code;
        this.success = success;
        this.data = data;
        this.message = message;
        this.other = other;
    }

    public static<TData> ControllerResponse<TData> buildSuccessResponse(TData data)
    {
        return new ControllerResponse<>(0, true, data, "", null);
    }

    public static<TData> ControllerResponse<TData> buildSuccessResponse(TData data, String message)
    {
        return new ControllerResponse<>(0, true, data, message, null);
    }

    public static<TData> ControllerResponse<TData> buildFailureResponse(int code, String message)
    {
        return new ControllerResponse<>(code, false, null, message, null);
    }

    public static<TData> ControllerResponse<TData> buildFailureResponse(CommonFailureResponses response)
    {
        return new ControllerResponse<>(response.getCode(), false, null, response.getMessage(), null);
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public TData getData()
    {
        return data;
    }

    public void setData(TData data)
    {
        this.data = data;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public HashMap<String, Object> getOther()
    {
        return other;
    }

    public void setOther(HashMap<String, Object> other)
    {
        this.other = other;
    }

    @Override
    public String toString()
    {
        return JsonSerializer.serialize(this);
    }
}
