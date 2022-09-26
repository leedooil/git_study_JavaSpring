package com.spring.ex02;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.ex01.MemberVO;

public class MemberDAO {
	private static SqlSessionFactory sqlMapper=null;
	public static SqlSessionFactory getInstance() {
		if(sqlMapper==null) {
			try{
								// DB 연동
				String resource = "mybatis/SqlMapConfig.xml";
								// sql명령어 실행하기 위한 준비
				Reader reader = Resources.getResourceAsReader(resource);
								// 최종적으로 db 정보를 읽어와 sql 명령어 실행
				sqlMapper=new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList(){
		//getInstance() 가상객체를 받음
		sqlMapper=getInstance();
		//openSession() 사용해서 가상객체를 연다
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> memlist=null;
		memlist=session.selectList("mapper.member.selectAllMemberList");
		return memlist;
	}
	
	public String selectName() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		String name = (String) session.selectOne("mapper.member.selectName");
		return name;
	}

	public int selectPwd() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int pwd = (int) session.selectOne("mapper.member.selectPwd");
		return pwd;
	}
}








