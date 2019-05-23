package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Notification;

public interface NotificationDao {
void saveNotification (Notification notification);
	
	List<Notification> findAllNotifications();
			
	void updateNotification(Notification notification);

	Notification findById(int id);

	void deleteNotificationById(int id);	
}
