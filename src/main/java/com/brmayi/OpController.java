package com.brmayi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiexiaojing on 2017/9/21.
 */
@RestController
@RequestMapping("")
public class OpController {
    @RequestMapping("/view")
    @ResponseBody
    public String view() {

        return "OK";
    }
}
