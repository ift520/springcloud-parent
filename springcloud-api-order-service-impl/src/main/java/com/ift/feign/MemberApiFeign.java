package com.ift.feign;

import com.ift.api.IMemberApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author liufei
 * @since 2019-10-15 17:27
 */
@FeignClient("member-service")
public interface MemberApiFeign extends IMemberApi {
}
