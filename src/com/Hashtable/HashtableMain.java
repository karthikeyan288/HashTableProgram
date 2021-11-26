package com.Hashtable;

import java.util.Scanner;


public class HashtableMain {
	public void freqencyOfWords() {
		String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = para.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.put(word, value);
		}

		System.out.println(hashMap.get("and"));
	}
	
	public void removeWord() {
		String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = para.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0;i < words.length;i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			}else
				value += 1;
			hashMap.put(word, value);
			hashMap.remove("not");;	
		}
		System.out.println(hashMap);
	}
	
	public static void main(String[] args) {
		HashtableMain hash =new HashtableMain();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice you want 1-> freqency 2-> removeword ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			hash.freqencyOfWords();
			break;
			
		case 2:
			hash.removeWord();
			break;
	
		default:
			System.out.println("enter valid key");
			break;
		}
		
	}
}