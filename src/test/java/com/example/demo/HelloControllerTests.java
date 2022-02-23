package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HelloController.class)
public class HelloControllerTests {


    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("sayHelloTest_noParam_rtnHelloWorld")
    void sayHelloTest() throws Exception {
        // /hello string "Hello World"
        // Arrange
        // Act
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
        // Assert
        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }




}
