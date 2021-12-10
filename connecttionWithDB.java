package com.springrest.createconnection;


import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface connecttionWithDB extends JpaRepository<load,Long>  {
	
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	
	//create table
	//public void createTable()  {
//		var query="CREATE TABLE courses(id PRIMARY KEY , title varchar(10) NOT NULL,description varchar(100))";
//		int status=this.jdbcTemplate.update(query);
//		System.out.println(status);
	//}

}
