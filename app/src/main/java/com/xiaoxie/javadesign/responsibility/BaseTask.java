package com.xiaoxie.javadesign.responsibility;

/**
 * create by ${xieshengqi}
 * create time 2020-01-07
 */
public abstract class BaseTask {

//判断当前节点有没有执行能力
    private boolean isTask;

//下一节点
    private BaseTask nextTask;

}
