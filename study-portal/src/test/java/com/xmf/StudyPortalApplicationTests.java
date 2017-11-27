package com.xmf;

import com.xmf.dao.service.UserService;
import com.xmf.entity.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyPortalApplicationTests {

	private static Logger logger= LoggerFactory.getLogger(StudyPortalApplicationTests.class);

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		TbUser tbUser=userService.getByUserId(1);
		logger.info(tbUser.getUserName());
	}

}
