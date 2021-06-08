package com.huyuya.mapper;

import com.huyuya.entity.Authority;
import com.huyuya.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author huyu
 * @since 2021-06-07
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    User getUserByName(String username);

    List<Authority> getAuthorityByUserName(String username);
}
