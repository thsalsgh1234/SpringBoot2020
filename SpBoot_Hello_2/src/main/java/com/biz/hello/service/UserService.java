package com.biz.hello.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.hello.domain.UserVO;

@Service
public class UserService {

	public List<UserVO> getUserList() {

		List<UserVO> userList = new ArrayList<>();

		userList.add(UserVO.builder().username("홍길동").password("1234").email("hhjkjm123@naver.com")
				.phone("010-1234-1234").address("광주광역시").build());

		userList.add(UserVO.builder().username("이몽룡").password("1234").email("hhjkjm123@nate.com")
				.phone("010-4567-4568").address("서울특별시").build());
		
		userList.add(UserVO.builder().username("성춘향").password("1234").email("hhjkjm123@chollian.com")
				.phone("010-7897-7897").address("대구광역시").build());
		return userList;
	}

}
