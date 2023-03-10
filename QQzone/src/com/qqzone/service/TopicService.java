package com.qqzone.service;

import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicService {
    List<Topic> getTopicList(UserBasic userBasic);
}
