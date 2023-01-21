package com.seunghee.board;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/{num}")
    public String indexParam(@PathVariable int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i ;
        }
        return "total :" + result;
    }
}