package com.ham.backend.controller;

import com.ham.backend.service.ApiService;
import com.ham.backend.service.YeboService;
import com.ham.backend.vo.YeboVO;
import jakarta.annotation.Resource;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
public class ApiController {

    //멤버변수
    @Resource(name = "yeboService")
    private YeboService yeboService;
    @Resource(name = "apiService")
    private ApiService apiService;

    // 요청처리 로직
    @GetMapping("/yebo")
    public String yebo(YeboVO vo, ModelAndView model) throws Exception {
        JSONObject yeboObj=new JSONObject();

        vo.setYeboDate("2022-03-30");
        vo.setSchedule("nit");

        List<HashMap<YeboVO,YeboVO>> yeboList=yeboService.getYeboList(vo);
        yeboObj.put("yeboObj", yeboList);

        return yeboObj.toString();
    }

    @GetMapping("/ask")
    public List<YeboVO> ask() throws Exception {
        List<YeboVO> yeboList=yeboService.getAsk();
        return yeboList;
    }

    @GetMapping("/api")
    public String test() throws Exception {
        String testList=apiService.getList();
        return testList;
    }
}
