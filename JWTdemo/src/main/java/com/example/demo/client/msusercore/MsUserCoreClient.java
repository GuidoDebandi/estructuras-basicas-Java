package com.example.demo.client.msusercore;

import com.example.demo.client.msusercore.dto.MsUserCoreResponse;
import com.example.demo.config.msusercoreclient.MsUserCoreClientFeignConfig;
import com.example.demo.model.User;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Ms-User-Core", url = "${ms.user.core.host}", configuration = MsUserCoreClientFeignConfig.class)
@CircuitBreaker(name = "Ms-User-Core")
public interface MsUserCoreClient {
    String FIND_USER_BY_UUID = "/ms-user-core/user/v1/FindByUUID/{UUID}";
    String HEADERS = "content-type=application/json";

    @GetMapping(value = FIND_USER_BY_UUID, produces = MediaType.APPLICATION_JSON_VALUE, headers = HEADERS)
    MsUserCoreResponse<User> findByUUID( @PathVariable("UUID") String UUID);

}
