package com.creativecampus.commons.domain;

import com.creativecampus.commons.ErrorMessageTemplates;
import com.creativecampus.commons.arguments.validation.MemberValidation;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MemberValidation
public class Teacher
{
    private long id;

    @NotBlank(message = ErrorMessageTemplates.STRING_EMPTY_PREFIX + "account" + ErrorMessageTemplates.STRING_EMPTY_SUFFIX)
    private String account;

    @NotBlank(message = ErrorMessageTemplates.STRING_EMPTY_PREFIX + "nickname" + ErrorMessageTemplates.STRING_EMPTY_SUFFIX)
    private String nickname;

    @NotBlank(message = ErrorMessageTemplates.STRING_EMPTY_PREFIX + "avatarUrl" + ErrorMessageTemplates.STRING_EMPTY_SUFFIX)
    private String avatarUrl;

    @NotBlank(message = ErrorMessageTemplates.STRING_EMPTY_PREFIX + "phoneNumber" + ErrorMessageTemplates.STRING_EMPTY_SUFFIX)
    private String phoneNumber;

    @Email(message = ErrorMessageTemplates.EMAIL_FORMAT_EXCEPTION)
    private String email;

    @NotBlank(message = ErrorMessageTemplates.STRING_EMPTY_PREFIX + "encryptedPassword" + ErrorMessageTemplates.STRING_EMPTY_SUFFIX)
    private String encryptedPassword;

    @Min(1)
    private int passwordEncryptionAlgorithmId;

    @NotNull
    private Date creationTime;

    @NotNull
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
}