package br.com.payuta.simplepp.controller

import br.com.payuta.simplepp.service.UserService
import br.com.payuta.simplepp.util.UserTestBuilder
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

//@ExtendWith(MockitoExtension::class)
//@WebMvcTest(UserController::class)
class UserControllerTest {
    @Autowired private lateinit var mockMvc: MockMvc

    @Mock private lateinit var userService: UserService

    //@Test
    fun `should return all users`() {
        val users = listOf(UserTestBuilder.build())
        Mockito.`when`(userService.getAllUsers()).thenReturn(users)
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk)
                .andExpect(jsonPath("$[0].name").value("John"))
    }
}
