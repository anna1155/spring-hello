package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/")
	public String hello(){
		return "<!DOCTYPE html>\r\n" + //
						"<html lang=\"en\">\r\n" + //
						"<head>\r\n" + //
						"    <meta charset=\"UTF-8\">\r\n" + //
						"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
						"    <title>Simple Bootstrap Example</title>\r\n" + //
						"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n" + //
						"</head>\r\n" + //
						"<body>\r\n" + //
						"\r\n" + //
						"    <div class=\"container mt-5\">\r\n" + //
						"        <h1>Hello, Spring Boot Developer 💛!</h1>\r\n" + //
						"        <p class=\"lead\">This is a simple example of a Bootstrap-enabled page with spring boot framework.</p>\r\n" + //
						"\r\n" + //
						"        <button type=\"button\" class=\"btn btn-primary\">Primary Button</button>\r\n" + //
						"        <button type=\"button\" class=\"btn btn-secondary\">Secondary Button</button>\r\n" + //
						"\r\n" + //
						"        <div class=\"alert alert-success mt-3\" role=\"alert\">\r\n" + //
						"            A simple success alert—check it out!\r\n" + //
						"        </div>\r\n" + //
						"    </div>\r\n" + //
						"\r\n" + //
						"    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n" + //
						"</body>\r\n" + //
						"</html>";
	}
}
