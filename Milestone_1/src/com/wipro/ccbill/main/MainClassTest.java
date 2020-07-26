package com.wipro.ccbill.main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Collection;
import java.util.Arrays;
import org.junit.*;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
import com.wipro.ccbill.entity.CreditCardBill;
import com.wipro.ccbill.entity.Transaction;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.Test;
@RunWith(Parameterized.class)
public class MainClassTest {
	private String creditCardNumber;
	private String customerNo;
	private Date dateofissue;
	private Transaction monthTransactions[];
	private double expected;
	private CreditCardBill cc;
	public MainClassTest(double expected,String creditCardNumber, String customerNo, Date dateofissue, Transaction monthTransactions[]) {
		this.creditCardNumber = creditCardNumber;
		this.customerNo = customerNo;
		this.dateofissue = dateofissue;
		this.monthTransactions = monthTransactions;
		this.expected = expected;
	}
	@Before
	public void initialize() {
		cc= new CreditCardBill(creditCardNumber,customerNo,dateofissue,monthTransactions);
	}
	@Parameterized.Parameters
	@SuppressWarnings("rawtypes")
	public static Collection data()  throws ParseException {
		Transaction monthsTransaction[] = new Transaction[5];
	      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	     
	      monthsTransaction[0]=new Transaction("1111222233334444",formatter.parse("01/02/2016"),"household",8000.0,"DB");
	      monthsTransaction[1]=new Transaction("1111222233334444",formatter.parse("05/02/2016"),"Textile",12000.0,"DB");
	      monthsTransaction[2]=new Transaction("1111222233334444",formatter.parse("12/02/2016"),"movie",2700.0,"DB");
	      monthsTransaction[3]=new Transaction("1111222233334444",formatter.parse("16/02/2016"),"paid",19000.0,"CR");
	      monthsTransaction[4]=new Transaction("1111222233334444",formatter.parse("19/02/2016"),"household",4500.0,"DB");
		return Arrays.asList(new Object[][] {
			{8335.983333333334,"1111222233334444","ABC123",formatter.parse("02/03/2016"),monthsTransaction},
			{0.0,"1111222233334444","ABC12",formatter.parse("02/03/2016"),monthsTransaction},
			{0.0,"11112222333344","ABC12",formatter.parse("02/03/2016"),monthsTransaction},
			{0.0,"1111222233334411","ABC123",formatter.parse("02/03/2016"),null}
		});	
	}
	@Test
	public void test() {
		assertEquals(expected,cc.calculateBillAmount(),0.0);
	}
}