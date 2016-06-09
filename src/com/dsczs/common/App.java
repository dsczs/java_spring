package com.dsczs.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dsczs.output.OutputHelper;
import com.dsczs.output.impl.CsvOutputGenerator;

public class App {
    public static void main(String[] args) {
//        CsvOutputGenerator csv = new CsvOutputGenerator();
//        csv.generateOutput();
        
//        OutputHelper out = new OutputHelper();
        ApplicationContext apx = new ClassPathXmlApplicationContext("Bean.xml");
        OutputHelper out = (OutputHelper)apx.getBean("outputHelper");
        out.generator();
    }
}
