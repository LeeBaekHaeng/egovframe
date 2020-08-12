package god.core.code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import god.core.code.service.CodeDAO;
import god.core.code.service.CodeVO;
import god.core.code.service.impl.CodeDAOImpl;

public class CodeDAOTest {

	@Test
	public void test() {
		CodeVO vo = new CodeVO();
		vo.setCodeId("codeId");
		vo.setCode("code");
		vo.setCodeNm("codeNm");

		CodeDAO codeDAO = new CodeDAOImpl();

		CodeVO resultCodeVO = codeDAO.create(vo);

		assertEquals(vo, resultCodeVO);
	}

}
