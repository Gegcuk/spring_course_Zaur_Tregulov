package ru.gegcuk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("ru.gegcuk.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
