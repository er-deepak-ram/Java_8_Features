package com.deepak_hcl.stream.count_character_in_stream;

public class CountCharacterInStreamTestDrive {

	public static void main(String[] args) {
		
		String str = "Geeksforgeeks";
		char ch = 'e';
		long count = str.chars()
						.filter(c -> c == ch)
						.count();
		
		System.out.println("'" + ch + "' appeared " + count + " times in '" + str +"'");
	}
}