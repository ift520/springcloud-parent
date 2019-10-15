package com.ift.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liufei
 * @since 2019-10-15 17:24
 */
public interface IOrderApi {

    @GetMapping("/order")
    String getOrder(@RequestParam("name") String name);
}
