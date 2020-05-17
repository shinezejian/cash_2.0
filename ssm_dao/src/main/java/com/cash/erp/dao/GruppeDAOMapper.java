package com.cash.erp.dao;


import com.cash.erp.entity.GruppeDAO;

public interface GruppeDAOMapper {
    int deleteByPrimaryKey(Integer pkGruppe);

    int insert(GruppeDAO record);

    int insertSelective(GruppeDAO record);

    GruppeDAO selectByPrimaryKey(Integer pkGruppe);

    int updateByPrimaryKeySelective(GruppeDAO record);

    int updateByPrimaryKey(GruppeDAO record);
}