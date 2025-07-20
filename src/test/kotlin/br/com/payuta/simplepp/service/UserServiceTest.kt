package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.model.UserType
import br.com.payuta.simplepp.repository.UserRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.beans.factory.annotation.Autowired

@SpringBootTest
class UserServiceTest {
    @Autowired
    private lateinit var userService: UserService

    @MockBean
    private lateinit var userRepository: UserRepository

    @Test
    fun `should create user`() {
        val user = User(1, UserType.USER, "John", "john@example.com")
        Mockito.`when`(userRepository.save(user)).thenReturn(user)
        val created = userService.createUser(user)
        assertEquals(user, created)
    }
}
