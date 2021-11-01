package com.yiibai;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created by Jack Yao on 2021/10/27 11:18 下午
 */
public class Mytasklet implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
        System.out.println("Hello This is a sample example of spring batch");
        return RepeatStatus.FINISHED;
    }
}
