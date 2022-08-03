package org.met.connectedservices.api;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.api.model.MetResponse;
import org.met.connectedservices.client.met.MetFeignClient;
import org.met.connectedservices.client.model.TmeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MetController {

    private MetFeignClient metFeignClient;

    @GetMapping("/met")
    MetResponse getUrl() {
        return getUrl();
    }

    @GetMapping("/test")
    TmeResponse getTest() {
        return metFeignClient.getMet();//tme
    }

}
