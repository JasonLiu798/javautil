package com.atjl.test.controller;

import com.atjl.logdb.api.LogDbUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Api(value = "静态内容", description = "静态内容")
@Controller
@RequestMapping("st")
public class TestController {

    @ApiOperation(value = "print", httpMethod = "POST")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "成功")})
    @RequestMapping("p")
    public void print(HttpServletResponse resp) {
        try {
            PrintWriter out = resp.getWriter();
            out.print("123123");
        } catch (Exception var7) {
            LogDbUtil.error("static", "js get writer exception", var7);
        }
    }

    @RequestMapping("ok")
    public void ok(HttpServletResponse resp) {
        PrintWriter out = null;
        try {
            out = resp.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print("123123");
        System.out.println("ok");
    }

}
