package god.core.code.service;

import java.util.List;

import god.core.CrudDAO;

public interface CodeDAO extends CrudDAO<CodeVO> {

	CodeVO create3(CodeVO vo);

	CodeVO createCode(CodeVO codeVO);

	List<CodeVO> createCode(List<CodeVO> codeVOs);

}
