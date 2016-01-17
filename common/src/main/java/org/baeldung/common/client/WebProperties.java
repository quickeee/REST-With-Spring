package org.baeldung.common.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class WebProperties {

    @Value("${http.sec.path}")
    private String path;

    @Value("${http.oauthPath}")
    private String oauthPath;

    public WebProperties() {
        super();
    }

    // API

    public final String getPath() {
        return path;
    }

    public final String getOauthPath() {
        return oauthPath;
    }

}
