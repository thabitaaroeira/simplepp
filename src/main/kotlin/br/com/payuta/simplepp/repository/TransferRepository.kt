package br.com.payuta.simplepp.repository

import br.com.payuta.simplepp.model.Transfer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferRepository : JpaRepository<Transfer, Long>, TransferRepositoryCustom {}
