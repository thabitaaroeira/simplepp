package br.com.payuta.simplepp.util

import br.com.payuta.simplepp.model.User
import br.com.payuta.simplepp.model.UserType
import br.com.payuta.simplepp.model.DocumentType

object UserTestBuilder {
    fun build(
        id: Long = 1L,
        type: UserType = UserType.USER,
        name: String = "John Doe",
        email: String = "john@example.com",
        password: String = "password",
        createdAt: String = "2025-01-01T00:00:00Z",
        document: String = "123456789",
        documentType: DocumentType = DocumentType.CPF
    ): User {
        return User(
            id = id,
            type = type,
            name = name,
            email = email,
            password = password,
            createdAt = createdAt,
            document = document,
            documentType = documentType
        )
    }
}
