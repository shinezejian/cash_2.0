package com.cash.erp.dao;


import com.cash.erp.entity.IncoDAO;

public interface IncoDAOMapper {
    int insert(IncoDAO record);

    int insertSelective(IncoDAO record);
}