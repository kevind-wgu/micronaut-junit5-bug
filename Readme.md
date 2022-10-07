The core components of this bug seem to be 
1. OpenApi
2. An annotation(AllowEmpty) with @javax.validation.Constraint(validatedBy = {}) specified on it.
3. A model class that has this annotation(AllowEmpty) marked on the class
4. The openapi annotatoin processor

What appears to happen is my model objects gets added to the application context. Then when I try and write 
a Junit5 provider to provide my own version it conflicts with the one provided by MicronautJunit5Extension.