package com.springboot.referenceapp.springbootrestapiexample.schedular;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedularService {

    @Scheduled(cron = "0 58 23 * * *", zone = "Asia/Calcutta")
    public void scheduledTask(){
        System.out.println("This task will happen at 23:58 pm");
    }
}
