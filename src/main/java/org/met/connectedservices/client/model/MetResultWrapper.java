package org.met.connectedservices.client.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MetResultWrapper<T> {

    private T result;

}
