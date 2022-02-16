package com.creativecampus.mappers;

import com.creativecampus.commons.domain.FavoriteType;
import java.util.List;

public interface FavoriteTypeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(FavoriteType record);

    FavoriteType selectByPrimaryKey(long id);

    List<FavoriteType> selectAll();

    int updateByPrimaryKey(FavoriteType record);
}