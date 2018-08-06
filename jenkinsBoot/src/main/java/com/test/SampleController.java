/**  
*Description: {类的描述}      
*Makedate:2018年8月6日 上午10:44:00  
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