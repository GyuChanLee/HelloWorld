package co.edu.Board;

import java.util.ArrayList;

public interface BoardService 
{
	int ADD = 1;
	int MOD = 2;
	int DEL = 3;
	int LISTONE = 4;
	int LIST = 5;
	
	public abstract Board regist();
	public abstract void modify();
	public abstract void delete();
	public abstract Board listDetail();
	public abstract ArrayList<Board> list();
}
