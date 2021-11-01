package com.yiibai;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jack Yao on 2021/10/27 11:18 下午
 */
public class App {
    public static void main(String[] args) throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
        String[] springConfig = {"jobconfig.xml"};

        //Creating the application context object
        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        //Creating the job launcher
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

        //Creating the job
        Job job = (Job) context.getBean("helloWorldJob");

        //Executing the JOB
        JobExecution execution = jobLauncher.run(job,new JobParameters());
        System.out.println("Exit Status : " + execution.getStatus());



    }
}
