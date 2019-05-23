package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.NotificationDao;
import com.wha.spring.model.Notification;


@Repository("notificationDao")
public class NotificationDaoImpl extends AbstractDao implements NotificationDao{
 
	
		public void saveNotification(Notification notification) {
			save(notification);
		}
		
		public void updateNotification(Notification notification) {
			getSession().update(notification);
		}
		
		public List<Notification>findAllNotifications(){
			return null;
		}
		
		public void deleteNotificationById(int id) {
			
		}
		

		public List<Notification> findAllNotification() {
			
			return getSession().createQuery("From Notification").list();
		}
		public Notification findById(int id){
			return (Notification) getSession().get(Notification.class, id);
		}

		
}
