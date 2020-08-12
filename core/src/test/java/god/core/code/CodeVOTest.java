package god.core.code;

import org.junit.Test;

import god.core.code.service.CodeVO;

public class CodeVOTest {

	@Test
	public void test() {
		CodeVO codeVO = new CodeVO();
		codeVO.setCodeId("codeId");
		codeVO.setCode("code");
		codeVO.setCodeNm("codeNm");
	}

}
