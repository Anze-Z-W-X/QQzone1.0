package com.qqzone.dao;

import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicDAO {
    //获取指定用户的日志列表
    public List<Topic> getTopicList(UserBasic userBasic);
    //添加日志
    public void addTopic(Topic topic);
    //删除日志
    public void delTopic(Topic topic);
    //获取指定日志信息
    Topic getTopic(Integer id);
}
