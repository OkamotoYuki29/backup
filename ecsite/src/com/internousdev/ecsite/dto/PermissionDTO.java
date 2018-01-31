package com.internousdev.ecsite.dto;

import java.util.Map;
import java.util.HashMap;

public class PermissionDTO {
	private String accessTarget;
	private int level;
	private Map<String,Integer> map = new HashMap<>();

	public String getAccessTarget() {
		return accessTarget;
	}
	public void setAccessTarget(String accessTarget) {
		this.accessTarget = accessTarget;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(String accessTarget, Integer level) {
		map.put(accessTarget, level);
	}
}
