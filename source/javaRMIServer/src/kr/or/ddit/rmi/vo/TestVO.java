package kr.or.ddit.rmi.vo;

import java.io.Serializable;

/**
 * RMI에서 데이터 전달용으로 사용할 클래스<br>
 * 이 클래스는 네트워크를 통해서 전달되어야 하기 때문에 직렬화가 필요하다.<br>
 * 그래서 Serializable을 구현한 형태로 작성한다.<br>
 */
@SuppressWarnings("serial")
public class TestVO implements Serializable {
	private String testId;
	private int testNum;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public int getTestNum() {
		return testNum;
	}

	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}

}
