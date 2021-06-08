package com.huyuya.service;

import com.huyuya.entity.Authority;
import com.huyuya.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyu
 * @version 1.0
 * @date 2021/6/7 10:22
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("进入用户认证)))))))))" + username);
        com.huyuya.entity.User userByName = userMapper.getUserByName(username);
        if (null == userByName) {
            throw new UsernameNotFoundException("用户不存在");
        }
        List<Authority> authorities = userMapper.getAuthorityByUserName(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (int i = 0; i < authorities.size(); i++) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(authorities.get(i).getAuthAlias());
            grantedAuthorities.add(authority);
        }
        System.out.println(grantedAuthorities);
        UserDetails user = new User(username, new BCryptPasswordEncoder().encode(userByName.getUserPass()), grantedAuthorities);
        return user;
    }
}
