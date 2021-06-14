package com.example.pk.mongodbproject.configuration;

import com.example.pk.mongodbproject.repository.BikeRepository;
import com.example.pk.mongodbproject.service.BikeService;
import com.example.pk.mongodbproject.service.BikeServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = BikeRepository.class)
public class MongoDBConfig {

    /*
    @Bean
    CommandLineRunner commandLineRunner(BikeRepository bikeRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                bikeRepository.save(new Bike(1, new Date(System.currentTimeMillis()), 1,2,3,4,"ssss"));
            }
        };
    }
    */

}
