package com.revature;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import com.revature.configuration.RibbonConfig;

@EnableDiscoveryClient
@EnableFeignClients
@RibbonClient(name = "flashcard", configuration = RibbonConfig.class)
@SpringBootApplication
public class QuizAppApplication {
	
	@Autowired
	private DiscoveryClient dc;

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
	}
	
	@Bean
	public ServerList<Server> serverList() {
		
		return new ServerList<Server>() {
			
			@Override
			public List<Server> getInitialListOfServers() {
				List<ServiceInstance> instances = dc.getInstances("flashcard");
				List<Server> servers = new ArrayList<>();
				for(ServiceInstance instance : instances) {
					servers.add(new Server(instance.getScheme(), instance.getHost(), instance.getPort()));
				}
				
				return servers;
			}
			
			@Override
			public List<Server> getUpdatedListOfServers() {
				return getInitialListOfServers();
			}
		};
	}
}