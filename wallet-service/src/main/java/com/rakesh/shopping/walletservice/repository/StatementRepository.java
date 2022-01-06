package com.rakesh.shopping.walletservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.shopping.walletservice.entity.Statement;

import java.util.List;

@Repository
public interface StatementRepository extends MongoRepository<Statement, String> {

    List<Statement> findByWalletId(int walletId);
}
