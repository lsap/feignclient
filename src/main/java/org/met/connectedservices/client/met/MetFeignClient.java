package org.met.connectedservices.client.met;

import org.met.connectedservices.client.model.TmeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "met-client")
public interface MetFeignClient {

    @GetMapping("http://localhost:8080/tme")
    TmeResponse getMet();

}
