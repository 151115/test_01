package team_test_01;

public class test_DTO {

	private String memberId ;
	private String memberPw;
	private String review_text;
	
	

	public test_DTO(String memberId, String memberPw) {
		this.memberId = memberId;
		this.memberPw = memberPw;
	} // 회원가입
	
	public test_DTO(String memberId, String memberPw, String review_text) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.review_text = review_text;
	} // 리뷰작성
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getReview_text() {
		return review_text;
	}
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	
}
