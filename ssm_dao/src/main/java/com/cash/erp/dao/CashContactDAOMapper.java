package com.cash.erp.dao;


import com.cash.erp.entity.CashContactDAO;

public interface CashContactDAOMapper {
    int deleteByPrimaryKey(Integer pkCashcontact);

    int insert(CashContactDAO record);

    int insertSelective(CashContactDAO record);

    CashContactDAO selectByPrimaryKey(Integer pkCashcontact);

    int updateByPrimaryKeySelective(CashContactDAO record);

    int updateByPrimaryKey(CashContactDAO record);
}