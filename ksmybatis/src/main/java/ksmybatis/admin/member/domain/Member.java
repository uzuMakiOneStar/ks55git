package ksmybatis.admin.member.domain;

import lombok.Data;

@Data
public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel;
	private String memberLevelName ;
	private String memberAddress;
	private String memberDaddress;
	private String memberZip;
	private String memberTelno;
	private String memberTelno1;
	private String memberTelno2;
	private String memberTelno3;
	private String memberEmail;
	private String memberRegDate;
}
