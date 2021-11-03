package com.yiibai;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class YourTasklet implements Tasklet {
    private final static Logger log  = Logger.getLogger(MyTasklet.class);


    @Override
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
        
        log.info(" - VVVVV - execute - XXXXX - ");
        
        log.info(" - XXXXX -  Hello This is a sample example of spring batch in YourTasklet - OOOOO - ");
    	log.info(" - _____ - execute - XXXXX - ");
    	
        return RepeatStatus.FINISHED;
    }
}