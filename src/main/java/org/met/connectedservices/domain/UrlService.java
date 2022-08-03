package org.met.connectedservices.domain;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.client.met.MetClient;
import org.met.connectedservices.domain.infrastructure.FindMet;
import org.met.connectedservices.domain.model.Met;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UrlService {

    private final FindMet findMet;

    public List<Met> getMet() {
        return findMet.getMet();
    }
}
