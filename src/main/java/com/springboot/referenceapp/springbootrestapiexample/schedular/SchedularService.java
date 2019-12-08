package com.springboot.referenceapp.springbootrestapiexample.schedular;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedularService {

    @Scheduled(cron="0 03 14 * * *", zone="Asia/Calcutta")
    public void scheduledTask(){
        System.out.println("This task will happen at 14:03 pm");
    }
}
