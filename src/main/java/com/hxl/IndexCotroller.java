package com.hxl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
@ConfigurationProperties(prefix="stu") //获取全局文件中变量名为stu开头的，然后变量名字跟全局变量点（.）后面的一致
public class IndexCotroller {

	
	@RequestMapping("/")
	@ResponseBody
	public String ss() {
		return "I am  good sdfd df ert Student!";
	}
	
	@Value("${book.name}")
	private String name;
	
	private int age;
	private String sex;
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	@RequestMapping("/D/yyys")
	@ResponseBody
	public String ss2() {
		return name+"：" + age+":"+sex;
	}
	
	
	//入口
	public static void main(String args[]) {
		SpringApplication.run(IndexCotroller.class, args);
	}
}
