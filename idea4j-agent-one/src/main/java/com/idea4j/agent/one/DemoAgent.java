package com.idea4j.agent.one;

import java.lang.instrument.Instrumentation;

public class DemoAgent {

    /**
     * 两个方法都存在时，优先使用这个
     * @param agentArgs
     * @param inst
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("premain two args" + agentArgs);
    }


    public static void premain(String agentArgs) {
        System.out.println("premain one args" + agentArgs);
    }
}
