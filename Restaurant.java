class Restaurant {
	public static void main(String[] args) {
	System.out.println("Restaurant name is Ducasse sur Seine " );  
	// for Manager class
	Manager manager1 = new Manager();
	manager1.setName("Luca");
	System.out.println("Manager name is " + manager1.getName());  
	
	// for Cheff class
	Cheff c1 = new Cheff();
	c1.setName("Alain Ducasse");
	c1.setmichelinStars(17);
	System.out.println("Cheff name is " + c1.getName());  
	System.out.println("Cheff  Alain has " + c1.getmichelinStars() + " Michelin stars");
	
	// for waiter
	Waiter waiter1 = new Waiter();
	waiter1.setName("Mario");
	waiter1.setTable(9);
	System.out.println("Waiter name is " + waiter1.getName());
	System.out.println("He will be serving table No. " + waiter1.getTable());
	
	// for customer class
	Customer customer1 = new Customer();
	customer1.setCustomerTable(9);
	System.out.println("Customer will eat at the table " + customer1.getCustomerTable());
	 // order class
	 Order order1 = new Order();
	 order1.setOrder("lunch");
	 System.out.println("The customer is ordering " + order1.getOrder());  
	 //Drinks
		Drinks drinks1 = new Drinks();
		drinks1.setDrinks("two");
		System.out.println("and "+ drinks1.getDrinks()+" coffee cups");  
	
	// Bill
	Bill bill1 = new Bill();
	bill1.setBillNo(1);
	bill1.setValueBill(170);
	System.out.println("The biil No. " + bill1.getBillNo() + " was printed"+
	" customer will have to pay "+ bill1.getValueBill()+" MDL"); 
	// Cashier 
	Cashier cash1 = new Cashier();
	cash1.setMoney(200);
	cash1.setReturnMoney(30);
	System.out.println("The biil No.1 was paid with a  " + cash1.getMoney() + " bill"+
	", and customer will receive  "+ cash1.getReturnMoney()+ " MDL back");
	
	// for feedback
	Feedback feedback1 = new Feedback();
	feedback1.setFeedback("Everything was good");
	System.out.println( feedback1.getFeedback()); 
	



    }
}
