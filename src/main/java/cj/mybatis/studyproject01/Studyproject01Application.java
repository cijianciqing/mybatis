package cj.mybatis.studyproject01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cj.mybatis.studyproject01.dao")
@SpringBootApplication
public class Studyproject01Application {

    public static void main(String[] args) {
        SpringApplication.run(Studyproject01Application.class, args);
    }

}
