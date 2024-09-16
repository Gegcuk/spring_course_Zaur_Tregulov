package ru.gegcuk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.gegcuk.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
