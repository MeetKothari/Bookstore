package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
We will use Controllers to map routes to our application.
The Controller’s objective is to implement the logic behind serving a data to a user.
*/

@Controller // @Controller will tell Spring to consider the HelloController class as a controller.
public class BookController {
    @RequestMapping("/") // @RequestMapping will map the route '/' to the function helloMessage().
    // So every time a GET request is send to '/' , the function helloMessage() is called.
    public String helloMessage(Model model){
        return "/books"; // The return value is a template named books/hello.
        // This string is a reference to the html template that we will build in the next paragraph.
    }

}

