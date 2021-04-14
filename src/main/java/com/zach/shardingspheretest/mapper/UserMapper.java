package com.zach.shardingspheretest.mapper;

import com.zach.shardingspheretest.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(@Param("user") UserEntity userEntity);

    UserEntity selectByUserId(@Param("id") Long userId);
}
