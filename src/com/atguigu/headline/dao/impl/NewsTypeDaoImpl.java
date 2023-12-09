package com.atguigu.headline.dao.impl;

import com.atguigu.headline.dao.BaseDao;
import com.atguigu.headline.dao.NewsHeadlineDao;
import com.atguigu.headline.dao.NewsTypeDao;
import com.atguigu.headline.pojo.NewsType;

import java.util.List;

/**
 * ClassName: NewsUserDaoImpl
 * PackageName: com.atguigu.headline.dao.impl
 * Description:
 *
 * @Author: Hanyu
 * @Date: 2023/12/9 - 18:55
 * @Version: v1.0
 */
public class NewsTypeDaoImpl extends BaseDao implements NewsTypeDao {
    @Override
    public List<NewsType> findAll() {
        String sql = "select tid, tname from news_type";
        List<NewsType> newsTypeList = baseQuery(NewsType.class, sql);
        return newsTypeList;
    }
}
