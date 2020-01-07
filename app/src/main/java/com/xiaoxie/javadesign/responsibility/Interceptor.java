package com.xiaoxie.javadesign.responsibility;

/**
 * 用于处理任务
 * create by ${xieshengqi}
 * create time 2020-01-07
 */
public interface Interceptor {



    void process(Chain chain);
}
