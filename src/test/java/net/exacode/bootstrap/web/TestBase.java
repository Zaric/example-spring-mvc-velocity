package net.exacode.bootstrap.web;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:test-applicationContext.xml"
})
/*
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional*/
public abstract  class TestBase {
	protected Logger logger = LoggerFactory.getLogger(getClass());

}
