package com.ruoyi.quartz.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import com.ruoyi.common.utils.StringUtils;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask
{
    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

	/**
	 * 用线程池来管理异步调用  只需bean名称对应
	 * @param params
	 * @throws InterruptedException
	 */
	@Async("threadPoolTaskExecutor")
    public void ryParams(String params) throws InterruptedException {
    	Thread.sleep(5000);
        System.out.println("执行有参方法：" + params);
    }


    public void ryNoParams()
    {
        System.out.println("执行无参方法");
    }
}
