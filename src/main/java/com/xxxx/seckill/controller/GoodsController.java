package com.xxxx.seckill.controller;

import com.xxxx.seckill.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @program: seckill-demo
 * @author: onion
 * @create: 2021-02-14 23:28
 **/

@Controller
@RequestMapping("/goods")
public class GoodsController {

    /**
     * 功能描述: 跳转商品列表页
     *
     * @param session
     * @param model
     * @param ticket
     * @return
     */
    @RequestMapping(value = "/toList")
    public String toList(HttpSession session, Model model, @CookieValue("userTicket") String ticket) {
        if (StringUtils.isEmpty(ticket)) {
            return "login";
        }
        User user = (User) session.getAttribute(ticket);
        if (user == null) {
            return "login";
        }
        model.addAttribute("user", user);
        return "goodsList";
    }
}

    