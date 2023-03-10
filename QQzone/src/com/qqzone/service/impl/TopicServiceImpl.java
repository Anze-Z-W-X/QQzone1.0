package com.qqzone.service.impl;

import com.qqzone.dao.TopicDAO;
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;
import com.qqzone.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO = null;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
