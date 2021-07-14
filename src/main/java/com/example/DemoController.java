package com.example;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class DemoController
{
    @Value("${testProperty}")
    protected String testProperty;

    @Get(value = "/", produces = MediaType.TEXT_PLAIN)
    public String index()
    {
        return testProperty;
    }
}
