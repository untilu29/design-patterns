package com.manhchuc.patterns.behaviours.observer.commons;

import lombok.Data;

@Data
public class HttpClient {
    private String host;
    private Long port;
    private String path;
    private HttpMethod method;
}
