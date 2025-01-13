package himedia.hellospring.vo;

//	파라미터 전달을 위한 Vo 객체
public class RequestVo {
	private String name;
	private Long no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "RequestVo [name=" + name + ", no=" + no + "]";
	}
}
