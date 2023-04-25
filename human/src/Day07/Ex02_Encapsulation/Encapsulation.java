package Day07.Ex02_Encapsulation;

/**
 * 통장계좌 -예금액 -은행명 -계좌번호 -예금주
 * 
 */

public class Encapsulation {

	private int deposit;
	private String bank;
	private String depoNumber;
	private String deposotor;

	// 기본 생성자
	public Encapsulation() {
		
	}

	// 매개변수 모두 포함하는 생성자

	public Encapsulation(int deposit, String bank, String depoNumber, String deposotor) {
		this.deposit = deposit;
		this.bank = bank;
		this.depoNumber = depoNumber;
		this.deposotor = deposotor;
	}

	

	// getter , setter

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getDeposotor() {
		return deposotor;
	}

	public void setDeposotor(String deposotor) {
		this.deposotor = deposotor;
	}

	// toString
	
@Override
public String toString() {
	return "Encapsulation [deposit=" + deposit + ", bank=" + bank + ", depoNumber=" + depoNumber + ", deposotor="
			+ deposotor + "]";
	
	
}
}


