package com.lms.dao.impl;

import com.lms.dao.TransactionDAO;
import com.lms.model.TransactionRecord;
import com.lms.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAOImpl implements TransactionDAO {

    @Override
    public boolean borrowBook(TransactionRecord record) {
        String sql = "INSERT INTO TransactionRecord (book_id, member_id, borrow_date, due_date, status) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, record.getBookId());
            ps.setInt(2, record.getMemberId());
            ps.setDate(3, record.getBorrowDate());
            ps.setDate(4, record.getDueDate());
            ps.setString(5, record.getStatus());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean returnBook(int txnId) {
        String sql = "UPDATE TransactionRecord SET return_date=CURDATE(), status='RETURNED' WHERE txn_id=?";

        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, txnId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<TransactionRecord> getTransactionsByMember(int memberId) {
        List<TransactionRecord> list = new ArrayList<>();
        String sql = "SELECT * FROM TransactionRecord WHERE member_id=?";

        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, memberId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TransactionRecord(
                        rs.getInt("txn_id"),
                        rs.getInt("book_id"),
                        rs.getInt("member_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("due_date"),
                        rs.getDate("return_date"),
                        rs.getString("status")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public List<TransactionRecord> getAllTransactions() {
        List<TransactionRecord> list = new ArrayList<>();
        String sql = "SELECT * FROM TransactionRecord";

        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TransactionRecord(
                        rs.getInt("txn_id"),
                        rs.getInt("book_id"),
                        rs.getInt("member_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("due_date"),
                        rs.getDate("return_date"),
                        rs.getString("status")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
