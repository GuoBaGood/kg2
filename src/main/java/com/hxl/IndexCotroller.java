package com.hxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ���Ͳ����
 *
 */

//�Զ����ã�����xml�ļ�
@EnableAutoConfiguration
@Controller
public class IndexCotroller {

	@RequestMapping("/")
	@ResponseBody
	public String ss() {
		return "I am a good sdfd  ert Student!";
	}
	
	
	//���
	public static void main(String args[]) {
		SpringApplication.run(IndexCotroller.class, args);
	}
}
