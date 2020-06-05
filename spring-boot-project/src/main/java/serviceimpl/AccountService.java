package serviceimpl;
import java.util.List;
import java.util.Set;

import br.com.jonyfs.credit.card.api.model.Payment;
import br.com.jonyfs.credit.card.api.service.Page;
import br.com.jonyfs.credit.card.api.service.Pageable;
import demo.account.Account;
import demo.account.Address;
	 
public interface AccountService {

    public Create createCard(String name,Set<Address> addresses,String phoneno,String accountNumber);

    public Payment getcreateCard(String credit_limit,string withdraw_limit, int expiry_date);

}


