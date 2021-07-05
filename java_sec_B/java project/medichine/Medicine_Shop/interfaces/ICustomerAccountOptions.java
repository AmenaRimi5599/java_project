package interfaces;
import java.lang.*;
import classes.*;

public interface ICustomerAccountOptions
{
	void showAllPayments(int accountId);
	boolean deletePaymentHistory(Payment pay);
	Medicine newPayment(String medName, int amount, Payment pay);
}