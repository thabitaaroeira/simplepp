package br.com.payuta.simplepp.controller

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(private val service: UserService) {
    @GetMapping fun getAll(): List<User> = service.getAll()

    @GetMapping("/{id}") fun getById(@PathVariable id: Long): User? = service.getById(id)

    @PostMapping fun create(@RequestBody created: User): User = service.create(created)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody updated: User): User? =
            service.update(id, updated)

    @DeleteMapping("/{id}") fun delete(@PathVariable id: Long): Boolean = service.delete(id)
}
