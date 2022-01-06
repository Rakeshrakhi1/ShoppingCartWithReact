package com.rakesh.shopping.cartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.shopping.cartservice.entity.Cart;

import java.util.Optional;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    Optional<Cart> findByCartId(int cartId);
    Cart findTopByOrderByCartIdDesc();

}
