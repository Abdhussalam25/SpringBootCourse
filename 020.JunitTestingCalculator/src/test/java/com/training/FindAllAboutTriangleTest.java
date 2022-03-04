package com.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class FindAllAboutTriangleTest {

	FindAllAboutTriangle rectangle;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//run only once // note static
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//run only once // note static
	}

	@BeforeEach
	void setUp() throws Exception {
		//runs before each test
		 rectangle = new FindAllAboutTriangle();
	}

	@AfterEach
	void tearDown() throws Exception {
		//runs after each test
	}

	@Test
	@Tag("DEV")
	@EnabledOnOs(OS.LINUX)//conditional this test will only work on linux not on windows
	//@Disabled this also same but without condition it will disable
	void testFindRectangleArea() {
		
		assertEquals(120, rectangle.findRectangleArea(10,12) );
	}

	@Test
	@DisplayName("Finding Perimeter")
	void testFindRectanglePerimeter() {
		assertEquals(44, rectangle.findRectanglePerimeter(10,12) );
		
		assertAll(
				() -> assertEquals(44, rectangle.findRectanglePerimeter(10,12) ),
				() -> assertEquals(44, rectangle.findRectanglePerimeter(10,10) ),
				() -> assertEquals(44, rectangle.findRectanglePerimeter(10,12) ),
				() -> assertEquals(43, rectangle.findRectanglePerimeter(10,12) )
				
				);
		
	}

}
