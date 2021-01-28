package _05_vault;

public class Vault {

	Vault(int code){
		this.code=code;
	}
	int code;
	boolean tryCode(int num) {
		if(num == code) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Vault vault = new Vault(4);
		System.out.println(vault.tryCode(5));
		JamesBond james = new JamesBond();
		System.out.println(james.findCode(vault));
	}
}
