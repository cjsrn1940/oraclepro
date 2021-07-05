package com.javaex.phone;

public class PersonVo {
	
	private String name;
	private int person_id;
	private String hp;
	private String company;
	
	
	public PersonVo() {
	}
	
	public PersonVo(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public PersonVo(String name, int person_id, String hp, String company) {
		super();
		this.name = name;
		this.person_id = person_id;
		this.hp = hp;
		this.company = company;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	@Override
	public String toString() {
		return "PersonVo [name=" + name + ", person_id=" + person_id + ", hp=" + hp + ", company=" + company + "]";
	}
	
	
	
	

}
