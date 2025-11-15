package com.aashay.banking.mapper;

import com.aashay.banking.dto.TransactionDto;
import com.aashay.banking.entity.Transaction;

public class TransactionMapper {

    public static TransactionDto convertEntityToDto(Transaction transaction){
        return new TransactionDto(
                transaction.getId(),
                transaction.getAccountId(),
                transaction.getAmount(),
                transaction.getTransactionType(),
                transaction.getTimestamp()
        );
    }
}
