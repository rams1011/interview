package com.tx.evaluation.config;

import lombok.ToString;

@ToString
public class Endpoint {
    String url;
    String userName;
    String password;
    boolean retry;
}
