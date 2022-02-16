package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Administrator;

import java.util.List;

public interface AdministratorMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Administrator record);

    Administrator selectByPrimaryKey(long id);

    List<Administrator> selectAll();

    int updateByPrimaryKey(Administrator record);
}