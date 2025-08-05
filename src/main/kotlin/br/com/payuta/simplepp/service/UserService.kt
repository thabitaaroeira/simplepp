package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val repository: UserRepository) {
    fun getAll(): List<User> = repository.findAll()

    fun getById(id: Long): User? = repository.findById(id).orElse(null)

    fun create(created: User): User = repository.save(created)

    fun update(id: Long, updated: User): User? {
        return if (repository.existsById(id)) {
            val toUpdate = updated.copy(id = id)
            repository.save(toUpdate)
        } else null
    }

    fun delete(id: Long): Boolean {
        return if (repository.existsById(id)) {
            repository.deleteById(id)
            true
        } else false
    }
}
