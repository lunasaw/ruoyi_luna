package com.ruoyi.quartz.task;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Luna@win10
 * @date 2020/3/16 20:19
 */
@Component
public class TestTask {

	@Scheduled(fixedRate = 1000 * 10)
	public void Start(){
		System.out.println(DateUtils.getTime() +  "\t 每10秒执行一次");
	}

	@Scheduled(cron = "0/20 * * * * ?")
	public void StartTwentySecond(){
		System.out.println(DateUtils.getTime() +  "\t根据cron配置 每20秒执行一次");
	}

}
