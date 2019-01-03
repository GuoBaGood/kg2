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

//自动配置，无须xml文件,排除：@EnableAutoConfiguration(exclude={xxx.class})——排除这个类的自动配置
@EnableAutoConfiguration
@Controller
public class IndexCotroller {

	@RequestMapping("/")
	@ResponseBody
	public String ss() {
		return "I am sofdflsjdfsldfsjfl a good sdfd df ert Student!";
	}
	
	
	//入口
	public static void main(String args[]) {
		SpringApplication.run(IndexCotroller.class, args);
	}
}
