package br.com.payuta.simplepp.service

import br.com.payuta.simplepp.model.Transfer
import br.com.payuta.simplepp.repository.TransferRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TransferService @Autowired constructor(private val transferRepository: TransferRepository) {
    fun getAllTransfers(): List<Transfer> = transferRepository.findAll()

    fun getTransferById(id: Long): Transfer? = transferRepository.findById(id).orElse(null)

    fun createTransfer(transfer: Transfer): Transfer = transferRepository.save(transfer)

    fun getTransfersBySender(sender: Long): List<Transfer> = transferRepository.findBySender(sender)

    fun getTransfersByRecipient(recipient: Long): List<Transfer> =
            transferRepository.findByRecipient(recipient)
}
