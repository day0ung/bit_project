package com.palette.model;

/**
 * MemberDto
 */
public class MemberDto {

	private int memberSeq;
	private String memberId;
	private String pwd;
	private String memberName;
	private String birth;
	private String address;
	private String location;
	private String email;
	private int myMoney;
	private int cv;
	private String companyInfo;
	private String companyLogo;
	private int auth;
	private int del;
	private int dislike;

	public MemberDto() {
	}

	public MemberDto(int memberSeq, String memberId, String pwd, String memberName, String birth, String address,
			String location, String email, int myMoney, int cv, String companyInfo, String companyLogo, int auth,
			int del, int dislike) {
		super();
		this.memberSeq = memberSeq;
		this.memberId = memberId;
		this.pwd = pwd;
		this.memberName = memberName;
		this.birth = birth;
		this.address = address;
		this.location = location;
		this.email = email;
		this.myMoney = myMoney;
		this.cv = cv;
		this.companyInfo = companyInfo;
		this.companyLogo = companyLogo;
		this.auth = auth;
		this.del = del;
		this.dislike = dislike;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	@Override
	public String toString() {
		return "MemberDto [memberSeq=" + memberSeq + ", memberId=" + memberId + ", pwd=" + pwd + ", memberName="
				+ memberName + ", birth=" + birth + ", address=" + address + ", location=" + location + ", email="
				+ email + ", myMoney=" + myMoney + ", cv=" + cv + ", companyInfo=" + companyInfo + ", companyLogo="
				+ companyLogo + ", auth=" + auth + ", del=" + del + ", dislike=" + dislike + "]";
	}

}