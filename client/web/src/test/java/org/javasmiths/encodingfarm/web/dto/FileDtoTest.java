/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author thomas
 */
@RunWith(MockitoJUnitRunner.class)

public class FileDtoTest {
	
	public FileDtoTest() {
	}

	@Test
	public void testGetId() {
		System.out.println("getId");
		FileDto instance = new FileDto();
		String expResult = "";
		String result = instance.getId();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testSetId() {
		System.out.println("setId");
		String id = "";
		FileDto instance = new FileDto();
		instance.setId(id);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetFilePath() {
		System.out.println("getFilePath");
		FileDto instance = new FileDto();
		String expResult = "";
		String result = instance.getFilePath();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testSetFilePath() {
		System.out.println("setFilePath");
		String filePath = "";
		FileDto instance = new FileDto();
		instance.setFilePath(filePath);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetFileDescription() {
		System.out.println("getFileDescription");
		FileDto instance = new FileDto();
		String expResult = "";
		String result = instance.getFileDescription();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testSetFileDescription() {
		System.out.println("setFileDescription");
		String fileDescription = "";
		FileDto instance = new FileDto();
		instance.setFileDescription(fileDescription);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetFileTitle() {
		System.out.println("getFileTitle");
		FileDto instance = new FileDto();
		String expResult = "";
		String result = instance.getFileTitle();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testSetFileTitle() {
		System.out.println("setFileTitle");
		String fileTitle = "";
		FileDto instance = new FileDto();
		instance.setFileTitle(fileTitle);
		fail("The test case is a prototype.");
	}
	
}
