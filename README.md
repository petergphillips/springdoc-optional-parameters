# springdoc-optional-parameters

Example project demonstrating https://github.com/springdoc/springdoc-openapi/issues/2170

Sample controller can be found at https://github.com/petergphillips/springdoc-optional-parameters/blob/main/src/main/java/com/example/springdocoptionalparameters/OptionalController.java

Failing test can be found at https://github.com/petergphillips/springdoc-optional-parameters/blob/main/src/test/kotlin/com/example/springdocoptionalparameters/ExampleControllerTest.kt

Setting https://github.com/petergphillips/springdoc-optional-parameters/blob/main/src/main/resources/application.yaml#L2 to `false` or downgrading spring docs to 2.0.2 then fixes the test.
