package com.jayden.apipassenger.controller;

import com.jayden.internalcommon.dto.ResponseResult;
import com.jayden.internalcommon.request.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 创建订单
     */
    @PostMapping("/add")
    public ResponseResult add(@RequestBody OrderRequest orderRequest){
        System.out.println(orderRequest);
        return ResponseResult.success();
    }
}
