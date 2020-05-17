package com.cash.erp.dao;


import com.cash.erp.entity.KundenDAO;

public interface KundenDAOMapper {
    int deleteByPrimaryKey(Integer pkKunden);

    int insert(KundenDAO record);

    int insertSelective(KundenDAO record);

    KundenDAO selectByPrimaryKey(Integer pkKunden);

    int updateByPrimaryKeySelective(KundenDAO record);

    int updateByPrimaryKeyWithBLOBs(KundenDAO record);

    int updateByPrimaryKey(KundenDAO record);
}