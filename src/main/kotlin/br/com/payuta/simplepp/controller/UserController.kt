package br.com.payuta.simplepp.controller

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(private val userService: UserService) {
    @GetMapping fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): User? = userService.getUserById(id)

    @PostMapping fun createUser(@RequestBody user: User): User = userService.createUser(user)

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody updatedUser: User): User? =
            userService.updateUser(id, updatedUser)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long): Boolean = userService.deleteUser(id)
}
