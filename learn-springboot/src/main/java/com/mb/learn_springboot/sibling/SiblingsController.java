package com.mb.learn_springboot.sibling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SiblingsController {

    @RequestMapping("/siblings")
    public List<Siblings> getSiblings(){
        return Arrays.asList(
                new Siblings(1,"Monika","Sister"),
                new Siblings(2,"Puneet","Brother"),
                new Siblings(3,"Sumit","Brother")

        );
    }
}
