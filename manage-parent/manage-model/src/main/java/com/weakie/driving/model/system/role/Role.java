package com.weakie.driving.model.system.role;

/**
 * 角色
 * @author weakie,lin
 *
 */
public class Role {

	private String id;
	private String name;
	private Authority auth;
	private String description;
	
	
	public Role() {
		super();
	}
	public Role(String id, String name, Authority auth, String description) {
		super();
		this.id = id;
		this.name = name;
		this.auth = auth;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Authority getAuth() {
		return auth;
	}
	public void setAuth(Authority auth) {
		this.auth = auth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", auth=" + auth + ", description=" + description + "]";
	}
	
	
}
