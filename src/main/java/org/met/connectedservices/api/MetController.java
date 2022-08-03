package org.met.connectedservices.api;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.api.port.MetPort;
import org.met.connectedservices.client.model.MetResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MetController {

    private final MetPort port;

    @GetMapping("/met")
    List<MetResponse> getUrl() {
        return port.getUrl();
    }
}
