package com.example.Coupons;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Coupons.Model.User;
import com.example.Coupons.Repository.UserRepository;
import com.example.Coupons.Service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
class CouponsApplicationTests {

	@Autowired 
	private UserService userService;
	
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void getUsersTest() {
		when(userRepository.findAll()).thenReturn(Stream
				.of(new User("12","111","nil","nil","admin"),new User("13","111","nil","nil","admin")).collect(Collectors.toList()));
		
		assertEquals(2,userService.getAllUsers().size());
	}
	@Test
	public void saveUserTest() {
		User user= new User("14","113","vin","vin","admin");
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.addUser(user));
	}
	
	
	
	
	
	
}
