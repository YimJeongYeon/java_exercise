package hw9_1;

//***************************
//파일명: Television.java
//작성자: 임정연
//작성일: 22.11.02
//내용: 텔레비젼에 대한 정보 생성
//***************************

class Television {
	private String model; //모델명
	private int price; //가격

	public String getModel() { //모델명의 getter
		return model;
	}

	public void setModel(String model) { //모델명의 setter
		this.model = model;
	}

	public int getPrice() { //가격의 getter
		return price;
	}

	public void setPrice(int price) { //가격의 setter
		this.price = price;
	}

	private int numberOfTVs = 0; //정적변수

	public Television() { //생성자1
		model = "MyTV";
		price = 0;
		numberOfTVs++;
	}
	public Television(String m) { //생성자2
		model = m;
		price = 0;
		numberOfTVs++;
	}
	public Television(String m, int p) {
		model = m;
		price =p;
		numberOfTVs++;
	}
	public int getNumberOfTVs() {
		return numberOfTVs;
	}
	public String toString() {
		return "모델명:" + model + " 가격:" + price;
	}
 
}

