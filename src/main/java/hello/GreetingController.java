package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class GreetingController {

  //  private static final String template = "Hello, %s!";
   // private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:8080/greeting")
    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(@RequestParam(required=false, defaultValue="") String cameraid, DateTime datetime, String filename) {
        System.out.println("==== in greeting ====");
        return new Greeting(cameraid, datetime,filename);
    }

    

	/*@RequestMapping("/greeting-javaconfig")
    public @ResponseBody Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
*/
}
