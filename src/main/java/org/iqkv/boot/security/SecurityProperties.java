package org.iqkv.boot.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "iqkv.security", ignoreUnknownFields = false)
public class SecurityProperties {
}
