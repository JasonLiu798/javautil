package com.atjl.dbtiming.test;

import com.atjl.dbtiming.api.ITaskExecute;
import org.springframework.stereotype.Component;

@Component("testCron")
public class TestCron implements ITaskExecute {

    private int i=0;

    @Override
    public void execute() {
        System.out.println("test task running "+i);
        i++;
    }

}
