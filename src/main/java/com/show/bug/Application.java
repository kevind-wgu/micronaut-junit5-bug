package com.show.bug;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "score-processor",
                description = "Score processor job API"
        )
)
public class Application {
    public static ApplicationContext CONTEXT;

    public static void main(String[] args) {

        CONTEXT = Micronaut.build(args)
                .classes(Application.class)
                .start();
    }
}
