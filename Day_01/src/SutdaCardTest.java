class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	private int length;
	
	SutdaDeck() {
	for (int i = 0; i < cards.length; i++) {
		cards[i] =  new SutdaCard(i % 10 + 1, (i == 0 || i==2 || i==7) ? true : false );
	}
	}
	
	void shuffle(){
	SutdaDeck deck = new SutdaDeck();
	for (int i = 0; i<deck.length; i++) {
		
		}
	}
}


class SutdaCard {
int num;
boolean isKwang;

SutdaCard() {
	this(1, true);
}
SutdaCard(int num, boolean isKwang) {
this.num = num;
this.isKwang = isKwang;
}

// info()대신 Object클래스의 toString()을 오버라이딩했다.
public String toString() {
return num + ( isKwang ? "K":"");
}
}


class SutdaCardTest {
public static void main(String args[]) {
	
SutdaDeck deck = new SutdaDeck();
for(int i=0; i < deck.cards.length;i++)
System.out.print(deck.cards[i]+",");

deck.shuffle();

for(int i=0; i < deck.cards.length;i++)
System.out.print(deck.cards[i]+",");
}
}
