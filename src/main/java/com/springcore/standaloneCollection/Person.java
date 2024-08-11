package com.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private List<String> friends;
	private Set<String> skills;
	private Map<String, String> courses;
	private Properties eduInfo;

	public Person() {
		super();
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getEduInfo() {
		return eduInfo;
	}

	public void setEduInfo(Properties eduInfo) {
		this.eduInfo = eduInfo;
	}
}
