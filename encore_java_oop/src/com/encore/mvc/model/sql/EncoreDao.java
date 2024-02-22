package com.encore.mvc.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.domain.PostResponseDto;

// Dao - DB 관계를 전담하는 객체
public class EncoreDao {
	
	// url, driver , id, pw
	public static final String URL 		= "jdbc:mariadb://localhost:3306/encore";
	public static final String DRIVER 	= "org.mariadb.jdbc.Driver";
	public static final String ID 		= "root";
	public static final String PASSWORD = "123456789";
	
	public EncoreDao() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insertRow(PostRequestDto params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)"; // -> 좋지 않은 구조
		
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.getTitle());
			pstmt.setString(2, params.getContent());
			pstmt.setString(3, params.getWriter());
			flag = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// int flag = executeUpdate();
		return flag;
	}
	
	public int insertRow(Map<String, String> params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)"; // -> 좋지 않은 구조
		
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.get("title"));
			pstmt.setString(2, params.get("content"));
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// int flag = executeUpdate();
		return flag;
	}
	
	// PostResponseDto - idx, title, content, writer
	// return list.add(PostResponseDto)
	public List<PostResponseDto> selectRow(){
		System.out.println(">>> Dao selectRow <<<");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<PostResponseDto> list = new ArrayList<PostResponseDto>();
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			String query = "select idx, title, content, writer from post_tbl";
			
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery(); //db에서 java로의 응답. 가상의 테이블
			
			while(rset.next()) {
				PostResponseDto response = new PostResponseDto();
				response.setIdx(rset.getInt(1));
				response.setTitle(rset.getString(2));
				response.setContent(rset.getString(3));
				response.setWriter(rset.getString(4));
			
				list.add(response);
			}
				
		} catch(Exception e) {
			
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
