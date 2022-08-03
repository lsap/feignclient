//package org.met.connectedservices.client.met;
//
//import feign.FeignException;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//import org.met.connectedservices.api.model.MetResponse;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.concurrent.Callable;
//
//@Component
//@RequiredArgsConstructor
//public class MetClientImpl implements MetClient {
//
//    private final MetFeignClient client;
//
//    @Override
//    public List<MetResponse> getMet() {
//        return unwrap(client::getUrl);
//    }
//
//    @SneakyThrows
//    private <T> T unwrap(Callable<T> callback) {
//        try {
//            var wrapper = callback.call();
//            return handleResult(wrapper);
//        } catch (FeignException e) {
//            throw new Exception(e);
//        }
//    }
//
//    private <T> T handleResult(MetResultWrapper<T> wrapper) {
//        return wrapper.getResult();
//    }
//
//}