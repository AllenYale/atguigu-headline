package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsType;

import java.util.List;

/**
 * ClassName: NewsTypeService
 * PackageName: com.atguigu.headline.service
 * Description:
 *
 * @Author: Hanyu
 * @Date: 2023/12/9 - 19:14
 * @Version: v1.0
 */
public interface NewsTypeService {
    /**
     * 查询所有头条类型
     * @return 多个头条类型，以List<NewsType>类型集合返回
     */
    List<NewsType> findAll();
}
