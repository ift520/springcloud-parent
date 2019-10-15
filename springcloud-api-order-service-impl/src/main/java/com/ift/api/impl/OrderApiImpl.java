package com.ift.api.impl;

import com.ift.api.IOrderApi;
import com.ift.entity.User;
import com.ift.feign.MemberApiFeign;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufei
 * @since 2019-10-15 17:25
 */
@RestController
public class OrderApiImpl implements IOrderApi {

    @Autowired
    private MemberApiFeign memberApiFeign;

    @GetMapping("/order")
    @Override
    public String getOrder(@RequestParam("name") String name) {
        User user = memberApiFeign.getMember(name);
        return user.toString();
    }
}
