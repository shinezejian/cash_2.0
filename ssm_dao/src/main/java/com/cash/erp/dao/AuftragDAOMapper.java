package com.cash.erp.dao;


import com.cash.erp.entity.AuftragDAO;

public interface AuftragDAOMapper {
    int insert(AuftragDAO record);

    int insertSelective(AuftragDAO record);
}