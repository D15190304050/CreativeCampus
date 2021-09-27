package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Administrators;

import java.util.List;

public interface AdministratorsMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(Administrators record);

    Administrators selectByPrimaryKey(Long id);

    List<Administrators> selectAll();

    int updateByPrimaryKey(Administrators record);
}