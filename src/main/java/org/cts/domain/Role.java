package org.cts.domain;

import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
public class Role implements GrantedAuthority {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAuthority() {
		return this.name;
	}
}
