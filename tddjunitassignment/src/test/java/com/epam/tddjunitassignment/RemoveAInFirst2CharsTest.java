package com.epam.tddjunitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAInFirst2CharsTest {
	/* TODO list for my feature
	 * 1. "ABCD" => "BCD" - success
	 * 2. "AACD" => "CD" -success
	 * 3. "BACD" => "BCD" -success
	 * 4. "BBAA" => "BBAA" -success
	 * 5. "AABAA" => "BAA" -success
	 * 6. "A" => "" -success
	 * */
	RemoveAInFirst2Chars removeAInFirst2Chars ;
	
	@BeforeEach
	void setup() {
		removeAInFirst2Chars = new RemoveAInFirst2Chars();
	}
	
	@Test
	void testFirst1A() {
		assertEquals("BCD", removeAInFirst2Chars.remove("ABCD"));	
	}
	
	@Test
	void testFirst2A() {
		assertEquals("CD", removeAInFirst2Chars.remove("AACD"));	
		
		assertEquals("BAA", removeAInFirst2Chars.remove("AABAA"));
		
		assertEquals("", removeAInFirst2Chars.remove("AA"));
		
	}
	
	@Test
	void testSecond1A() {
		
		assertEquals("BCD", removeAInFirst2Chars.remove("BACD"));
	}
	
	@Test
	void testFirstNoA() {
		assertEquals("BBAA", removeAInFirst2Chars.remove("BBAA"));
	}
	
	@Test
	void testSingleA() {
		assertEquals("", removeAInFirst2Chars.remove("A"));
	}
	
	@Test
	void testNullString() {
		assertEquals("", removeAInFirst2Chars.remove(""));
	}
	
	
	
	
	
	
	
	

}
