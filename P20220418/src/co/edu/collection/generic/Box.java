package co.edu.collection.generic;

public class Box <T> // <T> : T을 사용할 타입으로 지정 > generics 
{
	T field; // 모든 클래스의 부모클래스. 어떤 타입이든 대입 가능.
	
	public void setField(T field)
	{
		this.field = field;
	}
	
	public T getField() 
	{
		return this.field;
	}
}
