package br.com.payuta.simplepp.controller

import br.com.payuta.simplepp.util.UserTestBuilder
import br.com.payuta.simplepp.model.UserType
import br.com.payuta.simplepp.service.UserService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mock
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.http.MediaType
@ExtendWith(MockitoExtension::class)
@WebMvcTest(UserController::class)
class UserControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Mock
    private lateinit var userService: UserService

    @Test
    fun `should return all users`() {
        val users = listOf(UserTestBuilder.build())
        Mockito.`when`(userService.getAllUsers()).thenReturn(users)
        mockMvc.perform(get("/users"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$[0].name").value("John"))
    }
}

