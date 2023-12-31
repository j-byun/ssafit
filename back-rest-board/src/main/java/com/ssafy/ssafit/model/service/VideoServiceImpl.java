package com.ssafy.ssafit.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.VideoDao;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService {

	// 필드에 의존성 주입
	@Autowired
	private VideoDao videoDao;
	
	@Override
	public List<Video> getVideoList() {
		return videoDao.selectAll();
	}

	@Override
	public Video getVideo(int no) {
		return videoDao.selectOne(no);
	}

	@Override
	public int getLikeCnt(HashMap<String, String> params) {
		return videoDao.updateLikeCnt(params);
	}

	@Override
	public List<Video> getMyLikeList(int userNo) {
		return videoDao.selectMyLikeList(userNo);
	}

}
