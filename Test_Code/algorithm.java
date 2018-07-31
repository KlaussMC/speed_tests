// package com.kraken.hash;
import java.util.Scanner;
class hash {
	static String in(String msg) {
		System.out.println(msg);
		return new Scanner(System.in).nextLine();
	}
	static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		if (args.length == 0)
			print(respond(in("Type Text To Hash")));
		else {
			print(respond(join(args)));
		}
	}
	public static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	static String respond(String input) {
		String answer = "";
		int len = input.length();
		int casingFactor = 0;
		for (int i = 0; i < input.length(); i++) {
			String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			if (uppercase.indexOf(input.charAt(i)) > -1) {
				casingFactor++;
			}
		}
		casingFactor *= len;
		for (int i = 0; i < input.length(); i++) {
			answer += getChar((((i * casingFactor) + 1) * (alphabet.indexOf(input.charAt(i)) * i)) + len);
		}
		return formatAnswer(casingFactor, input.charAt(0), answer);
		// return answer;
	}
	static char getChar(int index) {
		int i = index;
		while (i >= alphabet.length()) {
			i -= alphabet.length();
		}
		if (i < 0) {
			i = 0;
		}
		return alphabet.charAt(i);
	}
	static String formatAnswer(int casingFactor, char firstChar, String answer) {
		String newAnswer = "";
		newAnswer += firstChar;
		for (int i = 1; i < answer.length(); i++) {
			newAnswer += answer.charAt(i);
		}
		// newAnswer += alphabet.charAt(casingFactor);
		return newAnswer + alphabet.charAt(casingFactor);
	}
	static String join(String [] args) {
		String newStr = "";
		for (int i = 0; i < args.length; i++) {
			newStr+=args[i];
		}
		// newStr = newStr.splice(newStr.length() - 2, 1);
		return newStr;
	}
}
