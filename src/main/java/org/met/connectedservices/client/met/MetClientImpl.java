package org.met.connectedservices.client.met;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.client.model.MetResultWrapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.Callable;

@Component
@RequiredArgsConstructor
public class MetClientImpl implements UrlClient {

    private final MetFeignClient client;

    @Override
    public List<MetResponse> getMet() {
        return unwrap(() -> client.getUrl());
    }

    @SneakyThrows
    private <T> T unwrap(Callable<MetResultWrapper<T>> callback) {
        try {
            MetResultWrapper<T> wrapper = callback.call();
            return handleResult(wrapper);
        } catch (FeignException e) {
            throw new Exception(e);
        }
    }

    private <T> T handleResult(MetResultWrapper<T> wrapper) {
        return wrapper.getResult();
    }

}