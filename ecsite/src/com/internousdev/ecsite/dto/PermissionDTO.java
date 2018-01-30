package com.internousdev.ecsite.dto;

public class PermissionDTO {
	private String accessTarget;
	private int level;

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
}
