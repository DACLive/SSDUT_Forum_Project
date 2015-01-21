package cn.com.ssdut.forum.service.impl;

import java.util.HashMap;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.ssdut.forum.dao.SimpleDao;
import cn.com.ssdut.forum.service.AdminService;

@Transactional
@Service("AdminService")
public class AdminServiceImpl implements AdminService{
	private static final String TABLE = "app_admin";

	@Autowired
	private @Setter
	SimpleDao topicSimpleDao;
	public Map<String, Object> getAdminById(String admin_id) {
		Map<String, Object> conds = new HashMap<String, Object>();
		conds.put("admin_id", admin_id);
		return topicSimpleDao.retrieve(TABLE, conds);
	}
	public Map<String, Object> getAdminByLoginName(String login_name) {
		Map<String, Object> conds = new HashMap<String, Object>();
		conds.put("login_name", login_name);
		return topicSimpleDao.retrieve(TABLE, conds);
	}
	public void updateAdmin(Map<String, Object> admin) {
		Map<String, Object> conds = new HashMap<String, Object>();
		if("".equals(admin.get("entry_time"))){
			admin.put("entry_time", null);
		}
		if("".equals(admin.get("birthday"))){
			admin.put("birthday", null);
		}
		conds.put("admin_id", admin.get("admin_id"));
		admin.remove("admin_id");
		topicSimpleDao.update(TABLE, admin, conds);
	}
	private SimpleDao adminDao;
	public SimpleDao getadminDao(){
		return adminDao;
	}
	public void setadmindao(SimpleDao adminDao){
		this.adminDao = adminDao;
	}
}
