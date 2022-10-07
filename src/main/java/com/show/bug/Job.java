package com.show.bug;

import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;

@AllowEmpty
@Introspected
public class Job {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;

    public void someRandomMethod() {
    }
}
