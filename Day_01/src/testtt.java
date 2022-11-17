class Entry{
	String word;
	
	void Entry(){
		System.out.println("****약어사전****");
	}
	
	void Entry(String w){
		Entry();
	}


	public void writeView() {
		System.out.println("약어 : " +word);
	};
}

class SubClass extends Entry{
	String definition;
	int year;

	public void SubClass(String w) {
		Entry(w);
	}
		
	public SubClass(String w, String d, int y) {
		super.word = w;
		this.definition = d;
		this.year = y;
		SubClass(w);
	}
	
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year + "년");
	}
}

public class testtt {

	public static void main(String[] args) {
		SubClass pp = new SubClass("OOP","Object Oriented Programming",1991);
		pp.writeView();
		pp.printView();
	}

}
