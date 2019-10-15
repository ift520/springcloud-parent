package com.ift.api;

import com.ift.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liufei
 * @since 2019-10-15 16:19
 */
public interface IMemberApi {

    @GetMapping("/member")
    User getMember(@RequestParam("name") String name);

}
