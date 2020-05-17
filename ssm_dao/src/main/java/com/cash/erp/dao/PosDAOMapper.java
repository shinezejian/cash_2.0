package com.cash.erp.dao;


import com.cash.erp.entity.PosDAO;

public interface PosDAOMapper {
    int insert(PosDAO record);

    int insertSelective(PosDAO record);
}