package com.subbak2.www.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbak2.www.entity.Lotto;
import com.subbak2.www.service.LottoSVC;

@RestController
@RequestMapping("/lotto")
public class LottoController {
	private final LottoSVC lottoSVC;
	
	public LottoController(LottoSVC lottoSVC) {
		this.lottoSVC = lottoSVC;
	}
	
	@GetMapping("/{drwNo}")
	ResponseEntity<Lotto> findById(@PathVariable String drwNo){
		Lotto lotto = lottoSVC.findByDrwNo(Short.parseShort(drwNo));
		return new ResponseEntity<>(lotto, HttpStatus.OK);
	}
	
}
