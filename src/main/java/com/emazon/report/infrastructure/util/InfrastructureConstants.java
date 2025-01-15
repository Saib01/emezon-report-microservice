package com.emazon.report.infrastructure.util;

public class InfrastructureConstants {
    public static final String BEARER_PREFIX = "Bearer ";
    public static final String ID="id";
    public static final String AUTHORITIES = "authorities";
    public static final String JWT_KEY_GENERATOR = "${security.jwt.key.private}";
    public static final String JWT_USER_GENERATOR = "${security.jwt.user.generator}";
    public static final String ACCESS_DENIED = "Access Denied: You do not have permission to access this resource.";
    public static final String UNAUTHORIZED_MESSAGE = "Unauthorized: You need to provide valid credentials to access this resource.";

    public static final String TEMPLATE_RESPONSE_ERROR = "{\"message\": \"%s\"}";

    private InfrastructureConstants() {
    }
}
