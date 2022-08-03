package org.met.connectedservices.client.met;

import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.client.model.MetResultWrapper;
import org.met.connectedservices.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "met-client", url = "http://localhost:8080/", configuration = FeignConfig.class)
public interface MetFeignClient {

    @GetMapping("/tme")
    MetResultWrapper<List<MetResponse>> getUrl();

}
