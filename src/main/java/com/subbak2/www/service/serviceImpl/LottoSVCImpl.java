package com.subbak2.www.service.serviceImpl;


import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.subbak2.www.entity.Lotto;
import com.subbak2.www.repository.LottoRepository;
import com.subbak2.www.service.LottoSVC;

@Service
public class LottoSVCImpl implements LottoSVC{

	final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	private final LottoRepository lottoRepository;
	
	public LottoSVCImpl(LottoRepository lottoRepository) {
		this.lottoRepository = lottoRepository;
	}
	
	@Override
	public Lotto findByDrwNo(short id) {
		return lottoRepository.findByDrwNo(id);
	}

	@Override
	public Integer insertLotto(Lotto lotto) {
		return lottoRepository.insertLotto(lotto);
	}
}
