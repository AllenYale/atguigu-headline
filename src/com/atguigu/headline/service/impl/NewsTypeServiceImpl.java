package com.atguigu.headline.service.impl;

import com.atguigu.headline.dao.NewsTypeDao;
import com.atguigu.headline.dao.impl.NewsTypeDaoImpl;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.service.NewsTypeService;

import java.util.List;

/**
 * ClassName: NewsTypeServiceImpl
 * PackageName: com.atguigu.headline.service.impl
 * Description:
 *
 * @Author: Hanyu
 * @Date: 2023/12/9 - 19:15
 * @Version: v1.0
 */
public class NewsTypeServiceImpl implements NewsTypeService {
    private NewsTypeDao newsTypeDao = new NewsTypeDaoImpl();
    @Override
    public List<NewsType> findAll() {
        return newsTypeDao.findAll();
    }
}
