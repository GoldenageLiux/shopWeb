package org.example.controller;

import org.example.error.BusinessException;
import org.example.error.EmBusinessError;
import org.example.response.CommonReturnType;
import org.example.service.OrderService;
import org.example.service.model.OrderModel;
import org.example.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liuxin on 2021/7/8
 */
@Controller("order")
@RequestMapping("/order")
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class OrderController extends BaseController{

        @Autowired
        private OrderService orderService;

        @Autowired
        private HttpServletRequest httpServletRequest;

        //封装下单请求
        @RequestMapping(value = "/createorder", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
        @ResponseBody
        public CommonReturnType createOrder(@RequestParam(name = "itemId") Integer itemId,
                                            @RequestParam(name = "amount") Integer amount,
                                            @RequestParam(name = "promoId", required = false) Integer promoId) throws BusinessException {
            // 获取用户的登录信息
            Boolean isLogin = (Boolean)httpServletRequest.getSession().getAttribute("IS_LOGIN");
            //将登陆信息打印出来
            System.out.println("<--order-->");
            System.out.println(httpServletRequest.getSession().getId());
            System.out.println(httpServletRequest.getSession().getAttribute("IS_LOGIN"));
            if (isLogin == null || !isLogin.booleanValue()) {
                throw new BusinessException(EmBusinessError.USER_NOT_LOGIN, "用户还未登录，不能下单");
            }
            UserModel userModel = (UserModel)httpServletRequest.getSession().getAttribute("LOGIN_USER");

            OrderModel orderModel = orderService.createOrder(userModel.getId(), itemId, promoId, amount);

            return CommonReturnType.create(null);
        }
    }

