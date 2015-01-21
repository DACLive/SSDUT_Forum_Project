package cn.com.ssdut.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ssdut.forum.service.MessageService;
import cn.com.ssdut.forum.view.Model;


@Controller("messageController")
@RequestMapping("/message/operate")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value="/enter", method=RequestMethod.GET)
	public String messageEnter(){
		return "message_manage/message_index";
	}
	
	@RequestMapping(value="/getMain", method=RequestMethod.POST)
	public Model getMainMessage(){
		Model model = new Model();
		model.setList(messageService.listMainMessage());
		return model;
	}
}
