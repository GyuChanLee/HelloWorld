package co.dodo.notice.service;

import java.util.*;

public interface NoticeServiece 
{
	List<NoticeVO> noticeSelectList(); // 전체 조회
	NoticeVO noticeSelect(NoticeVO vo); // 한글 조회
	int noticeInsert(NoticeVO vo); // 글 작성
	int noticeUpdate(NoticeVO vo); // 글 수정
	int noticeDelete(NoticeVO vo); // 글 삭제
}
