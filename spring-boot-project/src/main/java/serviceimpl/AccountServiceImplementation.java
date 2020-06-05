package serviceimpl;

import java.util.Set;

import javax.annotation.Resource;

import serviceimpl.AccountService;
@Service
 public class AccountServiceImplementation extends AccountService{
	
	@Autowired
    AccontRepository AccontDao;

    @Override
    public Create createCard(String name,Set<Address> addresses,String phoneno,String accountNumber) {
        User user = AccontDao.updateCustomerById(name,addresses,phoneno,accountNumber);
        return user;
    }

    @Override
    public CreditLimit getcreateCard(int credit_limit,int withdraw_limit, int expiry_date) {
    	User1 user = AccontDao.getCustomerById(credit_limit,withdraw_limit,expiry_date);
    	return user;
    }


}
