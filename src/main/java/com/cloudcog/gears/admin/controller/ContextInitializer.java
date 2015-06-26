package com.cloudcog.gears.admin.controller;

import javax.jcr.RepositoryException;

import org.cloudcog.kani.RepositoryContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudcog.gears.admin.screen.admin.groups.GroupsPanel;
import com.cloudcog.gears.admin.screen.admin.users.UsersPanel;
import com.cloudcog.gears.admin.user.GearsGroup;
import com.cloudcog.gears.admin.user.GearsUser;

//@WebListener
public class ContextInitializer {//implements ServletContextListener {

//	private static final Logger log = LoggerFactory.getLogger(ContextInitializer.class);
//
//	public void contextInitialized(ServletContextEvent event) {
//		try {
//			ObjectWindowMatcher.putWindowMatcher(GearsUser.class, UsersPanel.class);
//			ObjectWindowMatcher.putWindowMatcher(GearsGroup.class, GroupsPanel.class);
//			RepositoryContext.getRepository();
//		} catch (RepositoryException e) {
//			log.error(e.getMessage(), e);
//		}
//	}
//
//	public void contextDestroyed(ServletContextEvent event) {
//		// todo
//	}
}
