package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.model.Transfer
import br.com.payuta.simplepp.repository.TransferRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TransferService @Autowired constructor(private val repository: TransferRepository) {
    fun getAll(): List<Transfer> = repository.findAll()

    fun getById(id: Long): Transfer? = repository.findById(id).orElse(null)

    fun create(created: Transfer): Transfer = repository.save(created)

    fun getBySender(sender: Long): List<Transfer> = repository.findBySender(sender)

    fun getByRecipient(recipient: Long): List<Transfer> = repository.findByRecipient(recipient)
}
