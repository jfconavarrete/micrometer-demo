package mx.com.geeks.simplemicroservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;

@Controller
public class HelloController {
	
    private Counter helloCounter = Metrics.counter("http.req", "uri4", "hello4");

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
    	helloCounter.increment();
        return "Hello Worl54!";
    }

}