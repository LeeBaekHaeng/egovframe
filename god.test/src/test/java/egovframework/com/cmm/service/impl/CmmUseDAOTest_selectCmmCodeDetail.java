package egovframework.com.cmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;
import god.test.GodTestAbstract;

public class CmmUseDAOTest_selectCmmCodeDetail extends GodTestAbstract {

	@Resource(name = "cmmUseDAO")
//	@Autowired
//	@Qualifier("cmmUseDAO")
	private CmmUseDAO cmmUseDAO;

	@Override
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
			return new ArrayList<>();
		}
	}

}
