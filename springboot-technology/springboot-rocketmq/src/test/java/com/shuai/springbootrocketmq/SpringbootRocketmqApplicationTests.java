package com.shuai.springbootrocketmq;

import com.shuai.springbootrocketmq.springboot.SpringProducer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootRocketmqApplicationTests {

	@Autowired
	private SpringProducer springProducer;


}
