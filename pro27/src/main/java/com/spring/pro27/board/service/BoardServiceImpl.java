package com.spring.pro27.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pro27.board.dao.BoardDAO;
import com.spring.pro27.board.vo.ArticleVO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<ArticleVO> listArticles() throws Exception {
		List<ArticleVO> articlesList = boardDAO.selectAllArticlesList();
		return articlesList;
	}

	@Override
	public int addNewArticle(Map articleMap) throws Exception {
		return boardDAO.insertNewArticle(articleMap);
	}

	@Override
	public ArticleVO viewArticle(int articleNO) throws Exception {
		ArticleVO articleVO = boardDAO.selectArticle(articleNO);
		return articleVO;
	}

	@Override
	public void modArticle(Map articleMap) throws Exception {
		boardDAO.updateArticle(articleMap);
		
	}

	@Override
	public void removeArticle(int articleNO) throws Exception {
		boardDAO.deleteArticle(articleNO);
	}

	@Override
	public int addReply(Map articleMap) throws Exception {
		return boardDAO.insertNewArticle(articleMap);
	}
	
}

