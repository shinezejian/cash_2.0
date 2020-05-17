package com.cash.erp.dao;


import com.cash.erp.entity.InvoiceDAO;

public interface InvoiceDAOMapper {
    int insert(InvoiceDAO record);

    int insertSelective(InvoiceDAO record);
}