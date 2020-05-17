package com.cash.erp.dao;


import com.cash.erp.entity.KurseDAO;

public interface KurseDAOMapper {
    int insert(KurseDAO record);

    int insertSelective(KurseDAO record);
}