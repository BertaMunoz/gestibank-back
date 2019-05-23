package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Notification;


public interface NotificationService {

	 void saveNotification(Notification notification);
		
		List<Notification> findAllNotifications();
		
		void deleteNotificationById(int id);
		
		Notification findById(int id);
		
		void updateNotification(Notification notification);
}
