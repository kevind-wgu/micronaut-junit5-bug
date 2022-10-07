package com.show.bug;

import com.show.bug.Job;
import io.micronaut.test.extensions.junit5.MicronautJunit5Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class JobExtension implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(Job.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        try {
            ExtensionContext.Store micronautStore = extensionContext.getRoot().getStore(ExtensionContext.Namespace.create(MicronautJunit5Extension.class));
            io.micronaut.context.ApplicationContext appContext = (io.micronaut.context.ApplicationContext) micronautStore.get(io.micronaut.context.ApplicationContext.class);
            Job job = new Job();
            return job;
        } catch (Exception ex) {
            return null;
        }
    }
}
