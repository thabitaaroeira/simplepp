package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.repository.UserRepository
import br.com.payuta.simplepp.util.UserTestBuilder
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

//@SpringBootTest
class UserServiceTest {
    @Autowired private lateinit var userService: UserService

    @Mock private lateinit var userRepository: UserRepository

    //@Test
    fun `should create user`() {
        val user = UserTestBuilder.build()
        Mockito.`when`(userRepository.save(user)).thenReturn(user)
        val created = userService.createUser(user)
        assertEquals(user, created)
    }
}
