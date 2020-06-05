package serviceimpl;

import java.util.HashSet;
import java.util.Set;

public class Create {
	
	private String name;
    private String phoneno;
    private Set<Address> addresses;
    private String accountNumber;
	
	
	    public Create() {
	    }

	    public Create(String name,Set<Address> addresses,String phoneno,String accountNumber) {
	        this.name = name;
	        this.phoneno = phoneno;
	        this.accountNumber = accountNumber;
	        this.addresses = new HashSet<>();
	    }


	    public String getName() {
	        return name;
	    }

	    public void setNmae(String name) {
	        this.name = name;
	    }

	    public String getPhoneno() {
	        return phoneno;
	    }

	    public void setPhoneno(String phoneno) {
	        this.phoneno = phoneno;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public Set<Address> getAddresses() {
	        return addresses;
	    }

	    public void setAddresses(Set<Address> addresses) {
	        this.addresses = addresses;
	    }

	    @Override
	    public String toString() {
	        return "Account{" +
	                "name=" + name +
	                "phoneno=" + phoneno +
	                ", accountNumber='" + accountNumber + '\'' +
	                ", addresses=" + addresses +
	                "} " + super.toString();
	    }
	}