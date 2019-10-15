package com.ift.api.impl;

import com.ift.api.IMemberApi;
import com.ift.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufei
 * @since 2019-10-15 16:30
 */
@RestController
public class MemberApiImpl implements IMemberApi {

    @GetMapping("/member")
    @Override
    public User getMember(@RequestParam("name") String name) {
        User user = new User();
        user.setName(name);
        user.setAge(23);
        return user;
    }
}
