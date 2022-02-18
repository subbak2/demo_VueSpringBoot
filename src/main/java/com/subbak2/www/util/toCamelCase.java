package com.subbak2.www.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class toCamelCase {

	static StringBuilder sb;
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		String input;
		for (;;) {
			input = br.readLine();
			if (input.equals("0")) {
				break;
			}
			sb.append(toCamelCase(input)+"\n");
		}

		bw.write(sb.toString());
		bw.close();
		br.close();
		return;
	}

	private static String toCamelCase(String phrase) {
		String[] words = phrase.split("_");
		String newPhrase = words[0].toLowerCase();
		for(int i=1; i<words.length; i++){
		  newPhrase += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
		}
		return newPhrase;
	}
}