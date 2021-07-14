package com.example;


import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.context.env.PropertySource;
import io.micronaut.discovery.config.ConfigurationClient;
import io.reactivex.Flowable;
import org.reactivestreams.Publisher;

import javax.inject.Singleton;


@Singleton
public class TestPropertySource implements ConfigurationClient
{
    public TestPropertySource(ApplicationContext applicationContext)
    {
        System.out.println(applicationContext.getEnvironment().getPropertySources());
    }
    @Override
    public Publisher<PropertySource> getPropertySources(Environment environment)
    {
        return Flowable.just(PropertySource.of("dev", "testProperty", "bob"));
    }

    @Override
    public String getDescription()
    {
        return "Test Test Test";
    }
}
