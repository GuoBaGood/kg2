package com.hxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 锅巴不会糊
 *
 */

//自动配置，无须xml文件
@EnableAutoConfiguration
@Controller
public class IndexCotroller {

	@RequestMapping("/")
	@ResponseBody
	public String ss() {
		return "I am a good sdfd  ert Student!";
	}
	
	
	//入口
	public static void main(String args[]) {
		SpringApplication.run(IndexCotroller.class, args);
	}
}
