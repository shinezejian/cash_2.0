package com.cash.erp.dao;


import com.cash.erp.entity.LaddrDAO;

public interface LaddrDAOMapper {
    int insert(LaddrDAO record);

    int insertSelective(LaddrDAO record);
}