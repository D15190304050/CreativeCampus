package com.creativecampus.commons.domain;

import com.creativecampus.commons.ErrorMessageTemplates;
import com.creativecampus.commons.IValidate;
import dataworks.OutString;
import org.springframework.util.StringUtils;

import java.util.Date;

public class Teacher implements IValidate
{
    private long id;

    private String account;

    private String nickname;

    private String avatarUrl;

    private String phoneNumber;

    private String email;

    private String encryptedPassword;

    private int passwordEncryptionAlgorithmId;

    private Date creationTime;

    private Date updateTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account == null ? null : account.trim();
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatarUrl()
    {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl)
    {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email == null ? null : email.trim();
    }

    public String getEncryptedPassword()
    {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword)
    {
        this.encryptedPassword = encryptedPassword == null ? null : encryptedPassword.trim();
    }

    public int getPasswordEncryptionAlgorithmId()
    {
        return passwordEncryptionAlgorithmId;
    }

    public void setPasswordEncryptionAlgorithmId(int passwordEncryptionAlgorithmId)
    {
        this.passwordEncryptionAlgorithmId = passwordEncryptionAlgorithmId;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    @Override
    public boolean validate(OutString errorMessage)
    {
        if (!StringUtils.hasText(account))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("account"));
            return false;
        }

        if (!StringUtils.hasText(nickname))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("nickname"));
            return false;
        }

        if (!StringUtils.hasText(avatarUrl))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("avatarUrl"));
            return false;
        }

        if (!StringUtils.hasText(phoneNumber))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("phoneNumber"));
            return false;
        }

        if (!StringUtils.hasText(email))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("email"));
            return false;
        }

        if (!StringUtils.hasText(encryptedPassword))
        {
            errorMessage.setString(ErrorMessageTemplates.stringEmptyException("encryptedPassword"));
            return false;
        }

        if (creationTime == null)
        {
            errorMessage.setString(ErrorMessageTemplates.memberNullException("creationTime"));
            return false;
        }

        if (updateTime == null)
        {
            errorMessage.setString(ErrorMessageTemplates.memberNullException("updateTime"));
            return false;
        }

        return true;
    }
}