package com.subbak2.www.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lotto {
	short drwNo;
	Date drwNoDate;
	long firstWinamnt;
	short firstPrzwnerCo;
	long firstAccumamnt;
	long totSellamnt;
	short drwtNo1;
	short drwtNo2;
	short drwtNo3;
	short drwtNo4;
	short drwtNo5;
	short drwtNo6;
	short bnusNo;
	
	
	@Override
	public String toString() {
		return "Lotto [drwNo=" + drwNo + ", drwNoDate=" + drwNoDate + ", firstWinamnt=" + firstWinamnt
				+ ", firstPrzwnerCo=" + firstPrzwnerCo + ", firstAccumamnt=" + firstAccumamnt + ", totSellamnt="
				+ totSellamnt + ", drwtNo1=" + drwtNo1 + ", drwtNo2=" + drwtNo2 + ", drwtNo3=" + drwtNo3 + ", drwtNo4="
				+ drwtNo4 + ", drwtNo5=" + drwtNo5 + ", drwtNo6=" + drwtNo6 + ", bnusNo=" + bnusNo + "]";
	}

	
}
