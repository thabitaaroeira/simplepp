package br.com.payuta.simplepp.model

import jakarta.persistence.*
import java.time.LocalDateTime

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
        @Enumerated(EnumType.STRING) @Column(nullable = false) val type: UserType,
        @Column(nullable = false) val name: String,
        @Column(nullable = false, unique = true) val email: String,
        @Column(nullable = false) var password: String,
        @Column(nullable = false) val createdAt: LocalDateTime = LocalDateTime.now(),
        @Column(nullable = false, unique = true) val document: String,
        @Enumerated(EnumType.STRING) @Column(nullable = false) val documentType: DocumentType
)
