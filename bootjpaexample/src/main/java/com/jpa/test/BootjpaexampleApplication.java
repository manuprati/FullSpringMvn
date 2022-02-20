package com.jpa.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
//		User user1 = new User();
//		user1.setName("Adya Gaur");
//		user1.setCity("New Delhi");
//		user1.setStatus("I am an aspiring IAS");
//
//		User user2= new User();
//		user2.setName("Aaradhna Gaur");
//		user2.setCity("Pahasu");
//		user2.setStatus("I am an aspiring Doctor");
////		
//		//Save Multiple user
//		List<User> users = new ArrayList<User>(); 
//				users.add(user1);
//				users.add(user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		System.out.println(user1);
//		System.out.println(user2);
				
		
//		saving single user
//		User user1 = userRepository.save(user);
		
//		Updating the data
		
//		Optional<User> optional = userRepository.findById(7);
//		
//		User user = optional.get();
//		
//		user.setName("Aradhya Gaur");
//		
//		userRepository.save(user);
//		
//		System.out.println(user);

//		finding all element
//		Iterable<User> itr = userRepository.findAll();
		
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		
//			
//		});
		
//		itr.forEach(user->{System.out.println(user);});
		
//		deleting a student
		
//		userRepository.deleteById(4);
//		System.out.println("Done.");

//		deleting all students
		
		Iterable<User> allUsers = userRepository.findAll();
		
		allUsers.forEach(user->System.out.println(user));
		
		userRepository.deleteAll();
		
		System.out.println("All deleted");
	}

}
