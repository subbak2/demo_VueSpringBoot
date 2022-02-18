package com.subbak2.www.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class test {
	Integer column1;
	

	@Override
	public String toString() {
		return "test [column1=" + column1 + "]";
	}
	
}
