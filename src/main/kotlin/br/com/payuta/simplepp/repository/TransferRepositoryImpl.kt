package br.com.payuta.simplepp.repository

import br.com.payuta.simplepp.model.Transfer
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.stereotype.Repository

@Repository
class TransferRepositoryImpl(@PersistenceContext private val entityManager: EntityManager) :
        TransferRepositoryCustom {

    override fun findBySender(sender: Long): List<Transfer> {
        val query =
                """
            SELECT t FROM Transfer t
            WHERE t.sender = :sender
        """
        return entityManager
                .createQuery(query, Transfer::class.java)
                .setParameter("sender", sender)
                .resultList
    }

    override fun findByRecipient(recipient: Long): List<Transfer> {
        val query =
                """
            SELECT t FROM Transfer t
            WHERE t.recipient = :recipient
        """
        return entityManager
                .createQuery(query, Transfer::class.java)
                .setParameter("recipient", recipient)
                .resultList
    }
}
