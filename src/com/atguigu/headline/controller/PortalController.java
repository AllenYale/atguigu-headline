package com.atguigu.headline.controller;

import com.atguigu.headline.common.Result;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.service.NewsTypeService;
import com.atguigu.headline.service.impl.NewsTypeServiceImpl;
import com.atguigu.headline.util.WebUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: NewsHeadlineController
 * PackageName: com.atguigu.headline.controller
 * Description:
 *
 * @Author: Hanyu
 * @Date: 2023/12/9 - 19:15
 * @Version: v1.0
 */

/**
 * 门户控制器
 * 不需要登入的请求都到这里
 */
@WebServlet("/portal/*")
public class PortalController extends BaseController{
    private NewsTypeService newsTypeService = new NewsTypeServiceImpl();
    /**
     查询所有新闻类型
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void findAllTypes(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NewsType> newsTypeList =  newsTypeService.findAll();

        Result<List<NewsType>> ok = Result.ok(newsTypeList);

        WebUtil.writeJson(resp,ok);
    }
}
