package com.example.springdocoptionalparameters

import io.swagger.v3.oas.models.OpenAPI
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort

@SpringBootTest(webEnvironment = RANDOM_PORT)
class OptionalHeaderControllerTest(
  @LocalServerPort val port: Int,
  @Autowired val restTemplate: TestRestTemplate,
) {
  @Test
  fun `parameter should be optional`() {
    val result = restTemplate.getForObject(
      "http://localhost:$port/v3/api-docs",
      OpenAPI::class.java
    )
    assert(result.paths["/header"]!!.get.parameters.single().required == false)
  }
}
