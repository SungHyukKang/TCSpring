package dto;

public class ques_commentDTO {
	private int comment_num;
	private int qnum;
	private String qcid;
	private String qccontent;
	private int qcdate;
	public int getComment_num() {
		return comment_num;
	}
	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getQcid() {
		return qcid;
	}
	public void setQcid(String qcid) {
		this.qcid = qcid;
	}
	public String getQccontent() {
		return qccontent;
	}
	public void setQccontent(String qccontent) {
		this.qccontent = qccontent;
	}
	public int getQcdate() {
		return qcdate;
	}
	public void setQcdate(int qcdate) {
		this.qcdate = qcdate;
	}
	
}
