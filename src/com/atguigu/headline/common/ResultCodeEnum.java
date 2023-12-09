package com.atguigu.headline.common;

/**
 * ClassName: ResultCodeEnum
 * PackageName: com.atguigu.headline.common
 * Description:
 *3.5.1 异步响应规范格式类 - 枚举类
 * @Author: Hanyu
 * @Date: 2023/12/9 - 13:53
 * @Version: v1.0
 */

public enum ResultCodeEnum {
    SUCCESS(200,"success"),
    USERNAME_ERROR(501,"usernameError"),
    PASSWORD_ERROR(503,"passwordError"),
    NOTLOGIN(504,"notLogin"),
    USERNAME_USED(505,"userNameUsed")
    ;

    private Integer code;
    //返回消息
    private String message;

    ResultCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
