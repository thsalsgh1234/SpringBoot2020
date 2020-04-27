package com.biz.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.biz.jpa.domain.BookVO;
import com.biz.jpa.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookService {
	
	private final BookRepository bookDao;
	
	public Page<BookVO> getPageList(Pageable page){
		
		int pageNum = 0;
		if(page.getPageNumber() == 0) pageNum = 0;
		else pageNum = page.getPageNumber() -1;
		
		page = PageRequest.of(pageNum, 10);
		
		return bookDao.findAll(page);
	}
	
	public BookVO save(BookVO bookVO) {
		
		BookVO vo = bookDao.save(bookVO);
		
		return vo;
		
	}
	
	public List<BookVO> selectAll(){
		List<BookVO> bookList = bookDao.findAll();
		
		return bookList;
	}
	
	public Optional<BookVO> findById(long bookId){
		
		Optional<BookVO> bookVO = bookDao.findById(bookId);
		
		return bookVO;
	}
	
}
