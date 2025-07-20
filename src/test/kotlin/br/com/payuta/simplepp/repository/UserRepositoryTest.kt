package br.com.payuta.simplepp.repository

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.model.UserType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private lateinit var userRepository: UserRepository

    @Test
    fun `should save and find user`() {
        val user = User(type = UserType.USER, name = "John", email = "john@example.com")
        val saved = userRepository.save(user)
        val found = userRepository.findById(saved.id).orElse(null)
        assertNotNull(found)
        assertEquals("John", found?.name)
    }
}
