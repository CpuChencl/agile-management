package com.deppon.mbi.agile.core.service;

import com.deppon.mbi.agile.core.domain.auth.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Service("appUserDetailService")
public class AppUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.deppon.mbi.agile.core.domain.auth.User user = userService.query(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        String password = user.getPwd();
        boolean enabled = user.getStatus() > 0;
        boolean accountNonExpired = user.getStatus() > 0;
        boolean credentialsNonExpired = user.getStatus() > 0;
        boolean accountNonLocked = user.getStatus() > 0;

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new User(user.getId(), password, enabled,
                accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
