package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
        mockMvc.perform(get("/hello"))
        // Assert
        .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

    @Test
    @DisplayName("sayHelloMyNameTest_rtnHelloName")
    void sayHelloMyNameTest() throws Exception {
        mockMvc.perform(get("/hello?name=Christoph"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Christoph"));
    }




}
