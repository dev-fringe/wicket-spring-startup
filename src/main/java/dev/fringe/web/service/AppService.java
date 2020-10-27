package dev.fringe.web.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

	public void print() {
		System.out.println("call spring service");
	}
}
