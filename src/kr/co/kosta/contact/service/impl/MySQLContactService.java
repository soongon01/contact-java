package kr.co.kosta.contact.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import kr.co.kosta.contact.model.Contact;
import kr.co.kosta.contact.service.ContactService;
import kr.co.kosta.contact.util.ConnectionUtil;

public class MySQLContactService implements ContactService {

	@Override
	public void registContact(Contact contact) throws SQLException {
		
		//1. Connection 확보
		Connection conn = ConnectionUtil.getConnection("dev");
		//2. 쿼리 준비
		String sql = "INSERT INTO contacts (name,email,age,addr) VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, contact.getName());
		pstmt.setString(2, contact.getEmail());
		pstmt.setInt(3, contact.getAge());
		pstmt.setString(4, contact.getAddr());
		//3.쿼리 수행
		pstmt.executeUpdate();
		//4.컨넥션 반환
		ConnectionUtil.releaseConnection(conn);
	}

	@Override
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact detailContact(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeContact(String name) {
		// TODO Auto-generated method stub

	}

}
