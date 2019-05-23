package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.NotificationDao;
import com.wha.spring.iservice.NotificationService;
import com.wha.spring.model.Notification;


@Service("notificationService")
@Transactional
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	private NotificationDao dao;
	
	public void saveNotification(Notification notification) {
		dao.saveNotification( notification);
	}
	
	public List<Notification> findAllNotifications(){
		return dao.findAllNotifications();
	}
	
	public void deleteNotificationById(int id) {
		dao.deleteNotificationById(id);
	}
	
	public Notification findById(int id) {
		return dao.findById(id);
	}
	
	public void updateNotification(Notification notification) {
		dao.updateNotification(notification);
	}
	
}