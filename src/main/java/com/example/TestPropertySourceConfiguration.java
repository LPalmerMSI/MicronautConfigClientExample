package com.example;

import io.micronaut.context.annotation.BootstrapContextCompatible;
import io.micronaut.context.annotation.ConfigurationProperties;

@RequiresTestPropertySource
@ConfigurationProperties("test-configuration")
@BootstrapContextCompatible
public interface TestPropertySourceConfiguration 
{
    String getTestValue();
}
