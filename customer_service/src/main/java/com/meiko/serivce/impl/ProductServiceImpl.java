package com.meiko.serivce.impl;

import com.github.pagehelper.PageHelper;
import com.meiko.dao.IProductDao;
import com.meiko.domain.Product;
import com.meiko.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public  class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao dao;
    //@Override
    public List<Product> findAll(Integer page,Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return dao.findAll();
    }

  
}
