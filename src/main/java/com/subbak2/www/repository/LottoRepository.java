package com.subbak2.www.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.subbak2.www.entity.Lotto;

@Repository
public interface LottoRepository {
	Lotto findByDrwNo(short id);
	Integer insertLotto(@Param("lotto") Lotto lotto);
}
