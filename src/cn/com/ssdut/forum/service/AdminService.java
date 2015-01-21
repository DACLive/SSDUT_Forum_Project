package cn.com.ssdut.forum.service;

import java.util.Map;

import org.springframework.stereotype.Service;






@Service
public interface AdminService {
	public Map<String, Object> getAdminById(String admin_id);
	
	public Map<String, Object> getAdminByLoginName(String login_name);
	
	public void updateAdmin(Map<String, Object> admin);
	
}
