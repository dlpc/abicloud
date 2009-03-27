/*
* The contents of this file are subject to the Common Public Attribution License

* Version 1.0 (the "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at http://cpal.abiquo.com.



* The License is based on the Mozilla Public License Version 1.1 but Sections 14
* and 15 have been added to cover use of software over a computer network and
* provide for limited attribution for the Original Developer. In addition,



* Exhibit A has been modified to be consistent with Exhibit B.
*
* Software distributed under the License is distributed on an "AS IS" basis,
* WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License



* for the specific language governing rights and limitations under the License.
*
* The Original Code is abiquo,  14 Jul 2008. The Original Developer is the
* Initial Developer. The Initial Developer of the Original Code is Soluciones Grid,



* S.L.. All portions of the code are Copyright © Soluciones Grid, S.L.
* All Rights Reserved.
*/

package net.undf.abicloud.business.managers.notification
{
	import flash.events.Event;
	import flash.events.EventDispatcher;
	
	import mx.collections.ArrayCollection;
	
	/**
	 * This class manages all application's background notifications 
	 * @author Oliver
	 * 
	 */	
	public class NotificationManager extends EventDispatcher
	{
		public function NotificationManager()
		{
			this._notifications = new ArrayCollection();
			this._numUnreadNotifications = 0;
		}
		
		
		/**
		* @private 
		*/
		private var _notifications:ArrayCollection;
		
		/**
		 * Array containing all unread notifications
		 */
		[Bindable(event="notificationsUpdated")]
		public function get notifications():ArrayCollection
		{
			return this._notifications;
		}
		
		/**
		* @private 
		*/
		private var _numUnreadNotifications:int;
		
		/**
		* Number of unread notifications that this NotificationManager has
		*/		
		[Bindable(event="numUnreadNotifications")]
		public function get numUnreadNotifications():int
		{
			return this._numUnreadNotifications;
		}
		
		/**
		 * Adds a new Notification to this NotificationManager 
		 * @param notification The Notification to be added
		 * 
		 */		
		public function addNotification(notification:Notification):void
		{
			this._notifications.addItem(notification);
			dispatchEvent(new Event("notificationsUpdated"));
			
			if(! notification.read)
			{
				this._numUnreadNotifications++;
				dispatchEvent(new Event("numUnreadNotifications"));
			}
		}
		
		/**
		 * Marks a Notification as read 
		 * @param notification The Notification to be marked
		 * 
		 */		
		public function markNotificationAsRead(notification:Notification):void
		{
			if(! notification.read)
			{
				notification.read = true;
				this._numUnreadNotifications--;
				dispatchEvent(new Event("numUnreadNotifications"));
			}
		}
		
		/**
		 * Clears the Notification's array from all notifications that this
		 * NotificationManager contains. The number of unread notifications
		 * will be set to 0 
		 * 
		 */		
		public function clearAllNotifications():void
		{
			this._notifications.removeAll();
			this._numUnreadNotifications = 0;
			
			dispatchEvent(new Event("notificationsUpdated"));
			dispatchEvent(new Event("numUnreadNotifications"));
			
		}
		
		/**
		 * Clears a given notification from the notifications array 
		 * @param notification The notification to be removed from the notifications array
		 * 
		 */		
		public function clearNotification(notification:Notification):void
		{
			var index:int = this._notifications.getItemIndex(notification);
			if(index > -1)
				this._notifications.removeItemAt(index);						
		}
	}
}