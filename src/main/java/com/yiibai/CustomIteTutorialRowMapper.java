package com.yiibai;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

public class CustomIteTutorialRowMapper implements RowMapper<Tutorial>{
    private final static Logger log  = Logger.getLogger(CustomIteTutorialRowMapper.class);


	@Override
	public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException {
	    
	    log.info(" - VVVVV - mapRow - XXXXX - ");

		Tutorial tutorial = new Tutorial();
		tutorial.setTutorial_id(rs.getInt("tutorial_id"));
//	      tutorial.setTutorial_author(rs.getString("tutorial_author")); 
//	      tutorial.setTutorial_title(rs.getString("tutorial_title")); 
//	      tutorial.setSubmission_date(rs.getString("submission_date"));  
		    
		    log.info(" - XXXXX - tutorial - OOOOO - : " + tutorial);
			log.info(" - _____ - mapRow - XXXXX - ");
		return tutorial;
	}

}
