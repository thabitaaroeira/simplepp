package br.com.payuta.simplepp.repository

import br.com.payuta.simplepp.model.Transfer
import java.util.Optional;

interface TransferRepositoryCustom {
    fun findBySender(sender: Long): List<Transfer>
    fun findByRecipient(recipient: Long): List<Transfer>
}
