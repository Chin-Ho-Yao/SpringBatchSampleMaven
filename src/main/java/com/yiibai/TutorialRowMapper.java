package com.yiibai;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

public class TutorialRowMapper implements RowMapper<Tutorial> {
	private final static Logger log = Logger.getLogger(TutorialRowMapper.class);

	@Override
	public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException {
		log.info(" - VVVVV - mapRow - XXXXX - ");
		log.info(" - XXXXX - rs - OOOOO - : " + rs);
		log.info(" - XXXXX - rs.toString() - OOOOO - : " + rs.toString());

		Tutorial tutorial = new Tutorial();
		tutorial.setTutorial_id(rs.getInt("tutorial_id"));
		tutorial.setTutorial_title(rs.getString("tutorial_title"));
		tutorial.setTutorial_author(rs.getString("tutorial_author"));
		tutorial.setSubmission_date(rs.getString("submission_date"));
		log.info(" - XXXXX - tutorial - OOOOO - : " + tutorial);
		log.info(" - _____ - mapRow - XXXXX - ");
		return tutorial;
	}

}
