package com.demo.sk8.k8s_docker_github.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	/**
	 * 获取参数配置列表
	 */
	@GetMapping("/getInfo")
	public String getInfo()
	{
		return "hi";
	}
}
