package br.com.payuta.simplepp.controller

import br.com.payuta.simplepp.model.Transfer
import br.com.payuta.simplepp.service.TransferService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/transfers")
class TransferController @Autowired constructor(private val service: TransferService) {
    @GetMapping fun getAll(): List<Transfer> = service.getAll()

    @GetMapping("/{id}") fun getById(@PathVariable id: Long): Transfer? = service.getById(id)

    @PostMapping fun create(@RequestBody created: Transfer): Transfer = service.create(created)

    @GetMapping("/{sender}")
    fun getBySender(@PathVariable sender: Long): List<Transfer> = service.getBySender(sender)

    @GetMapping("/{recipient}")
    fun getByRecipient(@PathVariable recipient: Long): List<Transfer> =
            service.getByRecipient(recipient)
}
