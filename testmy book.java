package com.cg.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.bean.Book;
import com.cg.service.BookCollectionHelper;

public class TestBook {

    static BookCollectionHelper bookSet;
    static Book book;
	
	
	@Test
	public void testGetTotalBookCount() 
	{
		assertTrue(bookSet.getTotalBookCount() == 5);
	}

	@Test
	public void testAddBookDetails()
	{
		int len=bookSet.getTotalBookCount();
		book.setBookId(1234);
		book.setBookName("Java");
		book.setBookPrice(300.00f);
		bookSet.addBookDetail(book);
		
		assertTrue(bookSet.getTotalBookCount()>len);
		
	}
	
	@Test
	public void testGetBookId(){
		
		book.setBookId(123);
		assertEquals(123,book.getBookId());
		
	}
	
	@Test
	public void testGetBookName(){
		
		book.setBookName("Java");
		assertEquals("Java",book.getBookName());
		
	}
	
	@Test
	public void testGetBookPrice(){
		float val=123.00f;
		book.setBookPrice(val);
		assertTrue(book.getBookPrice()==val);
		
	}


	@Before
	
	public void init()
	{
		bookSet=new BookCollectionHelper();
		book=new Book();

	}
	
	@After
	public void destroy()
	{
		bookSet=null;
		book = null;
	}

	

}
