package com.creativecampus.mappers;

import com.creativecampus.commons.domain.FavoriteTypes;
import java.util.List;

public interface FavoriteTypesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FavoriteTypes record);

    FavoriteTypes selectByPrimaryKey(Long id);

    List<FavoriteTypes> selectAll();

    int updateByPrimaryKey(FavoriteTypes record);
}