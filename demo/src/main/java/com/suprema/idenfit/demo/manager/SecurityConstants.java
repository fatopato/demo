package com.suprema.idenfit.demo.manager;

public class SecurityConstants {

    public static final long EXPIRATION_TIME = 432_000_000; // 5 days = 5*24*60*60
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String SECRET = "Suprema";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/managers/sign-up";
}
