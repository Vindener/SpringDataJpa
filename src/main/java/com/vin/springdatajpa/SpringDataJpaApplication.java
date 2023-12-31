package com.vin.springdatajpa;

import com.vin.springdatajpa.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository){
        return (args -> {
//            insertJavaAdvocates(repository);
//            System.out.println(repository.findAll());

            System.out.println(repository.findEmployeeByLastNameContaining("al"));
        });
    }

    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new Employee("Vlad","Mal"));
        repository.save(new Employee("Trisha","Gee"));
        repository.save(new Employee("Mala","Gee"));
        repository.save(new Employee("Halen","Gee"));

    }

}
