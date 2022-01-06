package com.rakesh.shopping.walletservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.shopping.walletservice.entity.Wallet;

import java.util.Optional;

@Repository
public interface WalletRepository extends MongoRepository<Wallet, String> {

    Optional<Wallet> findByCustomerId(String customerId);
    Optional<Wallet> findByWalletId(int walletId);
    Wallet findTopByOrderByWalletIdDesc();
}
