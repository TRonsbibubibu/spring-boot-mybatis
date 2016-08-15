package com.trons.mapper;


import com.trons.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by trons on 16-4-17.
 */
public interface UserMapper {
    User get(@Param("id") long id);

    User getByMobile(@Param("mobile") String mobile);

    User getByStuCode(@Param("stuCode") String stuCode);

    int update(@Param("user") User user);
}