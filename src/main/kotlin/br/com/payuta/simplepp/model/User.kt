package br.com.payuta.simplepp.model

import jakarta.persistence.*

enum class UserType {
    SHOPKEEPER,
    USER
}

enum class DocumentType {
    CPF,
    CNPJ
}

@Entity
@Table(name = "users")
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0,
        @Enumerated(EnumType.STRING) val type: UserType,
        val name: String,
        val email: String,
        var password: String,
        val createdAt: String,
        val document: String,
        @Enumerated(EnumType.STRING) val documentType: DocumentType,
)
