package org.fcap.example.cxfendpointtest.controller.model;

import org.fcap.example.cxfendpointtest.controller.enums.EUserType;

import java.io.Serializable;

public class UserVO implements Serializable {

	private static final long serialVersionUID = -4982827964969902171L;

	private EUserType type;

	public UserVO(EUserType type) {
		this.type = type;
	}

	public EUserType getType() {
		return type;
	}

	public void setType(EUserType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserVO{" +
				"type=" + type +
				'}';
	}
}
