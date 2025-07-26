package br.com.payuta.simplepp.model

import jakarta.persistence.*
import java.time.LocalDateTime

enum class TransferType {
    DEBIT,
    CREDIT
}

@Entity
@Table(name = "transfers")
data class Transfer(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0,
        @ManyToOne
        @JoinColumn(name = "sender_id", foreignKey = ForeignKey(name = "fk_sender_user"))
        val sender: User,
        @ManyToOne
        @JoinColumn(name = "recipient_id", foreignKey = ForeignKey(name = "fk_recipient_user"))
        val recipient: User,
        var amount: Double,
        @Enumerated(EnumType.STRING) val type: TransferType,
        val createdAt: LocalDateTime = LocalDateTime.now()
)
