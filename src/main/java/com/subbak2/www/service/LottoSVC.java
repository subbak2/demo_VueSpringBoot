package com.subbak2.www.service;

import com.subbak2.www.entity.Lotto;

public interface LottoSVC {
	public Lotto findByDrwNo(short id);
	Integer insertLotto(Lotto lotto);
}
