package com.creativecampus.mappers;

import com.creativecampus.commons.domain.HomeworkComments;
import java.util.List;

public interface HomeworkCommentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeworkComments record);

    HomeworkComments selectByPrimaryKey(Long id);

    List<HomeworkComments> selectAll();

    int updateByPrimaryKey(HomeworkComments record);
}