package com.kitec.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kitec.demo.domain.entity.User;
import com.kitec.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;

	public Optional<User> selectById(Long id) {
		return userRepository.findById(id);
	}
	
}
