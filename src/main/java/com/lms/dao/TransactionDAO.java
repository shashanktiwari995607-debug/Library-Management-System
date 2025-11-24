package com.lms.dao;

import com.lms.model.TransactionRecord;
import java.util.List;

public interface TransactionDAO {
    boolean borrowBook(TransactionRecord record);
    boolean returnBook(int txnId);
    List<TransactionRecord> getTransactionsByMember(int memberId);
    List<TransactionRecord> getAllTransactions();
}
