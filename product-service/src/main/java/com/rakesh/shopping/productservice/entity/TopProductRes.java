package com.rakesh.shopping.productservice.entity;

import lombok.Value;

@Value
public class TopProductRes {

    String _id, name, image;
    Double price;
}
