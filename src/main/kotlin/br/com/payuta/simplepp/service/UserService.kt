package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User? = userRepository.findById(id).orElse(null)

    fun createUser(user: User): User = userRepository.save(user)

    fun updateUser(id: Long, updatedUser: User): User? {
        return if (userRepository.existsById(id)) {
            val userToUpdate = updatedUser.copy(id = id)
            userRepository.save(userToUpdate)
        } else null
    }

    fun deleteUser(id: Long): Boolean {
        return if (userRepository.existsById(id)) {
            userRepository.deleteById(id)
            true
        } else false
    }
}
