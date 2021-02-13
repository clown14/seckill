package com.xxxx.seckill.vo;

import lombok.Data;

/**
 * 登录参数
 */
@Data
public class LoginVo {
    //	@NotNull
//	@IsMobile
    private String mobile;

    //	@NotNull
//	@Length(min = 32)
    private String password;

}