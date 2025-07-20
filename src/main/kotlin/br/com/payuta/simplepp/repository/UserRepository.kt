package br.com.payuta.simplepp.repository

import br.com.payuta.simplepp.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface UserRepository : JpaRepository<User, Long> {}
