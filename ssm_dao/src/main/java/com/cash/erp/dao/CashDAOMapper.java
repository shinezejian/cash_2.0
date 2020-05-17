package com.cash.erp.dao;


import com.cash.erp.entity.CashDAO;

public interface CashDAOMapper {
    int deleteByPrimaryKey(Integer pkCash);

    int insert(CashDAO record);

    int insertSelective(CashDAO record);

    CashDAO selectByPrimaryKey(Integer pkCash);

    int updateByPrimaryKeySelective(CashDAO record);

    int updateByPrimaryKeyWithBLOBs(CashDAO record);

    int updateByPrimaryKey(CashDAO record);
}