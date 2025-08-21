package com.example.JPA_Demo;

import com.example.JPA_Demo.entity.User;
import com.example.JPA_Demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;
	public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
	}

    @Override
    public void run(String... args){
        if(userRepository.count()==0){
            userRepository.save(new User("Santosh","santosh05@gmail.com"));
            userRepository.save(new User("Koyel","koyel21@gmail.com"));
        }
        System.out.println("Users in DB");
        userRepository.findAll().forEach(System.out::println);
    }

}
