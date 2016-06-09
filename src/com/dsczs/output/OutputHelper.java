package com.dsczs.output;

import com.dsczs.output.impl.CsvOutputGenerator;

public class OutputHelper {
    IOutputGenerator outputGenerator;
    
    
//    public OutputHelper(){
//        outputGenerator = new CsvOutputGenerator();
//    }
   
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }


    public void generator(){
        outputGenerator.generateOutput();
    }
}
