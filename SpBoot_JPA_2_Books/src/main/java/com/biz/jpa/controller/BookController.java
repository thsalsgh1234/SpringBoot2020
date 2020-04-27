package com.biz.jpa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.jpa.domain.BookVO;
import com.biz.jpa.service.BookService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value="/book")
@RequiredArgsConstructor
public class BookController {
	
	public String getPageList() {
		
		return "pagelist";
	}
	
	private final BookService bService;
	

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String BookList(Model model) {
		
		List<BookVO> bookList = bService.selectAll();
		
		model.addAttribute("bookList",bookList);
		
		return "layout";
		
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String book(Model model) {
		
		model.addAttribute("book", new BookVO());
		return "bookform";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String book(BookVO bookVO) {
		
		
		BookVO vo = bService.save(bookVO);
		return "redirect:/book/list";
	}
	
}
