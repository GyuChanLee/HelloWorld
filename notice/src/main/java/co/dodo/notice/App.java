package co.dodo.notice;

import java.util.Arrays;
import java.util.List;

import co.dodo.notice.service.NoticeVO;
import co.dodo.notice.serviceImpl.NoticeServiceImpl;


public class App 
{
    public static void main( String[] args )
    {
//    	System.out.println("======================================공지사항=================================================");
//    	// 전체 리스트 뽑아오기.
//    	NoticeServiceImpl notice = new NoticeServiceImpl();
//    	List<NoticeVO> list = notice.noticeSelectList();
//    	for(NoticeVO vo : list)
//    	{
//    		vo.toString();
//    	}
//    	System.out.println("===============================================================================================");
//    	NoticeVO vo = new NoticeVO();
//    	vo.setId(1);
//    	NoticeVO result = notice.noticeSelect(vo);
//    	result.toString();
//    	System.out.println(result.getSubject());
//    	System.out.println("===============================================================================================");
    	
    	Menu menu = new Menu();
    	menu.run();
    	
    }
}
