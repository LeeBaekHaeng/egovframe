package egovframework.com.cmm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath*:egovframework/spring/com/**/context-*.xml")
@ActiveProfiles({ "mysql", "dummy" })
public class CmmUseDAOTest {

	protected Logger egovLogger = LoggerFactory.getLogger(CmmUseDAOTest.class);

	@Resource(name = "cmmUseDAO")
//	@Autowired
//	@Qualifier("cmmUseDAO")
	private CmmUseDAO cmmUseDAO;

	@Test
	public void test() {
		egovLogger.info("test");

		ComDefaultCodeVO vo = new ComDefaultCodeVO();
		vo.setCodeId("COM001");

		List<CmmnDetailCode> results = selectCmmCodeDetail(vo);

		for (CmmnDetailCode result : results) {
			egovLogger.debug("code: {}", result.getCode());
		}
	}

	private List<CmmnDetailCode> selectCmmCodeDetail(ComDefaultCodeVO vo) {
		try {
			return cmmUseDAO.selectCmmCodeDetail(vo);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

}
