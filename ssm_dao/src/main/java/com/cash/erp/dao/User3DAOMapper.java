package com.cash.erp.dao;


import com.cash.erp.entity.User3DAO;

public interface User3DAOMapper {
    int deleteByPrimaryKey(Integer pkUser);

    int insert(User3DAO record);

    int insertSelective(User3DAO record);

    User3DAO selectByPrimaryKey(Integer pkUser);

    int updateByPrimaryKeySelective(User3DAO record);

    int updateByPrimaryKey(User3DAO record);
}