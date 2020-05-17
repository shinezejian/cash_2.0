package com.cash.erp.dao;


import com.cash.erp.entity.KundenContactDAO;

public interface KundenContactDAOMapper {
    int deleteByPrimaryKey(Integer pkKundencontact);

    int insert(KundenContactDAO record);

    int insertSelective(KundenContactDAO record);

    KundenContactDAO selectByPrimaryKey(Integer pkKundencontact);

    int updateByPrimaryKeySelective(KundenContactDAO record);

    int updateByPrimaryKey(KundenContactDAO record);
}