package com.show.bug;

import com.show.bug.Job;
import com.show.bug.JobExtension;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest
@ExtendWith(JobExtension.class)
public class JobTest {
    @Test
    public void upsert_config(Job job) {
    }
}
