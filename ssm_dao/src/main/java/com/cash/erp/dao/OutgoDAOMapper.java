package com.cash.erp.dao;


import com.cash.erp.entity.OutgoDAO;

public interface OutgoDAOMapper {
    int insert(OutgoDAO record);

    int insertSelective(OutgoDAO record);
}