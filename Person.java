package sth;




public abstract class Person {
	private int _id;
	private String _name;
	private String _cellNo; 

	public Person(int id,String name,String cellNo){
		_id = id;
		_name = name;
		_cellNo = cellNo;


	}

	public int getID(){
		return _id;
	}

	public String getName(){
		return _name;
	}

	public String getNumber(){
		return _cellNo;
	}

	public void setID(int id){
		_id = id;
	}

	public void setName(String name){
		_name = name;
	}

	public void setNumber(String cellNo){
		_cellNo = cellNo;
	}

	


}