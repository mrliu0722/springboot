/**  
*Description: {�������}      
*Makedate:2018��8��6�� ����10:44:00  
* @author liuguolin  
*  
*/  
package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}