package com.epam.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharactersTest {
 /* TODO LIST
  * 1. 4 chars :ABCD => BCD
  * 2. 4 chars :AACD => CD
  * 3. 4 chars :BACD => BCD
  * 4. 4 char : BBAA => BBAA
  * 5. 5 char : AABAA => BAA
  */
	@Test
	void test2Chars() {
		RemoveFirst2Chars removefirst2chars = new RemoveFirst2Chars();
		String actual =removefirst2chars.remove("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test4Chars() {
		RemoveFirst2Chars removefirst2chars = new RemoveFirst2Chars();
		String actual =removefirst2chars.remove("AACD");
		assertEquals("CD",actual);
		
	}
	@Test
	void test4Char() {
		RemoveFirst2Chars removefirst2chars = new RemoveFirst2Chars();
		String actual =removefirst2chars.remove("BACD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test4Ch() {
		RemoveFirst2Chars removefirst2chars = new RemoveFirst2Chars();
		String actual =removefirst2chars.remove("BBAA");
		assertEquals("BBAA",actual);
		
	}
	@Test
	void test5Chars() {
		RemoveFirst2Chars removefirst2chars = new RemoveFirst2Chars();
		String actual =removefirst2chars.remove("AABAA");
		assertEquals("BAA",actual);
		
	}



}
