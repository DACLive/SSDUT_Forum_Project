package cn.com.ssdut.forum.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.ssdut.forum.dao.SimpleDao;
import cn.com.ssdut.forum.service.MessageService;

@Repository
public class MessageServiceImpl implements MessageService{

	@Autowired
	private SimpleDao messageSimpleDao;

	public SimpleDao getMessageSimpleDao() {
		return messageSimpleDao;
	}

	public void setMessageSimpleDao(SimpleDao messageSimpleDao) {
		this.messageSimpleDao = messageSimpleDao;
	}

	@Override
	public List<Map<String, Object>> listMainMessage() {
		// TODO Auto-generated method stub
		String sql = "select * from message_info order by focus_time limit 4";
		return messageSimpleDao.queryForList(sql, new HashMap<String, Object>());
	}
	
}
