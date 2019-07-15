package com.meiko.service;


import java.util.List;

import com.meiko.domain.Product;

public interface IProductService {
    List<Product> findAll(Integer page,Integer pageSize);
    

}
