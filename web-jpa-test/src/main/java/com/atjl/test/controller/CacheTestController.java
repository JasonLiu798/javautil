package com.atjl.test.controller;

import com.atjl.logdb.api.LogDbUtil;
import com.atjl.test.domain.TestDto;
import io.swagger.annotations.Api;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

@Api(value = "缓存测试", description = "缓存测试")
@Controller
@RequestMapping("cache")
public class CacheTestController {

    /**
     * http://localhost:8008/cache/re
     */
    @RequestMapping("re")
    public ResponseEntity<String> re(HttpServletResponse resp) {
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(5, TimeUnit.SECONDS))
                .body("re");
    }

    @RequestMapping("wr")
    @ResponseBody
    public String wr(WebRequest request) {
        long lastModified = 1520245*1000*1000l;//new Date().getTime();
        if (request.checkNotModified(lastModified)) {
            return null;
        }
        return lastModified+"";
    }

    @RequestMapping("p")
    public void print(TestDto testDto, HttpServletResponse resp) {
        System.out.println("res:" + testDto);
        try {
            PrintWriter out = resp.getWriter();
            out.print("123123");
        } catch (Exception var7) {
            LogDbUtil.error("static", "js get writer exception", var7);
        }
    }


}
