	package com.example.crud;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.Data;

public class Student {
	

	

	@Data
	@Entity
	@Table(name="students")
	public class Account {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id ; 
		
		@Column(name="eng_name",nullable = false)
		private String eng_name;
		
		@Column(name="faculty",nullable = false)
		private String faculty;
		
		@Column(name="type",nullable = false)
		private String type;
		
		
		@Column(name = "user_name", nullable = false)
		private String userName ; 
		
		
			}

}

