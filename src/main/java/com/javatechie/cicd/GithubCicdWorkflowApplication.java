package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdWorkflowApplication {

	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To GitHub Workflow !";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdWorkflowApplication.class, args);
	}

}

//echo "# -github-cicd-workflow" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/subhammohanty/-github-cicd-workflow.git
//git push -u origin main
