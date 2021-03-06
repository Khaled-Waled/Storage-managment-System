package managmentSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class StorageManagmentSystem implements ActionListener {

	//log out button
	private static JButton logOut1,logOut2;
	//Login and sign up screens
	private static JFrame loginFrame,signFrame;
	private static JButton login,sign;

	//Admin Top Right Panel
	private static JComboBox userTypesComBox;
	private static String userTypesBox_selectedItem;
	private static JFrame adminFrame;
	
	//Casher Action Listener
	private static JButton add,remove,check,refund,pay;
	private static JFrame casherFrame;
	
	public static void main(String []args)
	{
		LoginForm();
		
	}
	
	
	
	/**
	 * create the login form
	 */
	public static void LoginForm() {
		
		//initialization
		JPanel loginPanel;
		JLabel username,password,newAcc;
		JPasswordField loginPass;
		JTextField loginusername;
		
		
		loginFrame=new JFrame("تسجيل دخول");
		loginFrame.setResizable(false);
		
		loginFrame.setSize(450,240);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		loginPanel=new JPanel();
		loginPanel.setLayout(null);
		
		loginFrame.add(loginPanel);
		loginFrame.setLocationRelativeTo(null);
		
		//Add labels
		username=new JLabel("الإسم");
		password=new JLabel("كلمة المرور");
		username.setFont(new Font("Serif", Font.BOLD, 22));
		password.setFont(new Font("Serif", Font.BOLD, 22));
		username.setBounds(360, 20, 90, 40);
		password.setBounds(335, 80, 90, 40);
		loginPanel.add(username);
		loginPanel.add(password);

		//Add TextBoxes
		loginusername = new JTextField(100);
		loginusername.setBounds(20, 30, 300, 30);
		//set the writing from right to left
		loginusername.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		loginPanel.add(loginusername);
		
		loginPass = new JPasswordField(100);
		loginPass.setBounds(20, 90, 300, 30);
		//set the writing from right to left
		loginPass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		loginPanel.add(loginPass);
		
		//Add login button
		login=new JButton("دخول");
		login.setBounds(20, 140, 80, 35);
		login.setFont(new Font("Serif", Font.BOLD, 18));
		login.addActionListener(new StorageManagmentSystem());
		loginPanel.add(login);
		
		//Add hyperlink
		newAcc=new JLabel("حساب جديد");
		newAcc.setBounds(350, 165, 100, 20);
		newAcc.setForeground(Color.BLUE.darker());
		//Change mouse shape
		newAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		//react to clicks
		newAcc.addMouseListener(new MouseAdapter() {
			@Override
		    public void mouseClicked(MouseEvent e) {
				loginFrame.dispose();
				SignUpForm();
		    }
		});
		loginPanel.add(newAcc);

		//Show the frame on screen
		loginFrame.setVisible(true);
		
		
	}

	/**
	 * create the sign up form
	 */
	public static void SignUpForm() {
		//initialization
		JPanel signPanel;
		JLabel username,password,newAcc,title,address,phone,email;
		JPasswordField loginPass;
		JTextField loginusername,addText,phoneText,emailText;
		
		
		
		
		
		signFrame=new JFrame("حساب جديد");
		//make the screen unresizable
		signFrame.setResizable(false);
		
		signFrame.setSize(500,460);
		signFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		signPanel=new JPanel();
		signPanel.setLayout(null);
		
		signFrame.add(signPanel);
		signFrame.setLocationRelativeTo(null);
		
		//set the labels
		title=new JLabel("حساب جديد");
		title.setBounds(190, 0, 300, 60);
		title.setFont(new Font("Serif", Font.BOLD, 32));
		signPanel.add(title);
		username=new JLabel("الاسم");
		password=new JLabel("باسوورد");	
		username.setFont(new Font("Serif", Font.PLAIN, 20));
		password.setFont(new Font("Serif", Font.PLAIN, 20));
		username.setBounds(400, 60, 90, 40);
		password.setBounds(375, 110, 90, 40);
		signPanel.add(username);
		signPanel.add(password);
		
		address=new JLabel("محل إقامة");
		phone=new JLabel("هاتف");
		email=new JLabel("ايميل");
		address.setFont(new Font("Serif", Font.PLAIN, 20));
		phone.setFont(new Font("Serif", Font.PLAIN, 20));
		email.setFont(new Font("Serif", Font.PLAIN, 20));
		address.setBounds( 370, 165, 90, 40);
		phone.setBounds(400, 215, 90, 40);
		email.setBounds(400, 265, 90, 40);
		signPanel.add(address);
		signPanel.add(phone);
		signPanel.add(email);
	
	//Adding textfields
		loginusername = new JTextField(100);
		loginusername.setBounds(50, 70, 290, 30);
		//set the writing from right to left
		loginusername.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		signPanel.add(loginusername);				
		loginPass = new JPasswordField(100);
		loginPass.setBounds(50, 120, 290, 30);
		//set the writing from right to left
		loginPass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		signPanel.add(loginPass);
		
		addText = new JTextField(400);
		addText.setBounds(50, 170, 290, 30);
		phoneText = new JTextField(14);
		phoneText.setBounds(140, 220, 200, 30);
		emailText = new JTextField(100);
		emailText.setBounds(140, 270, 200, 30);
		addText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		phoneText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		emailText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		signPanel.add(addText);
		signPanel.add(phoneText);
		signPanel.add(emailText);
		
		//Add hyperlink
		newAcc=new JLabel("لديك حساب");
		newAcc.setBounds(390, 370, 100, 20);
		newAcc.setForeground(Color.BLUE.darker());
		//Change mouse shape
		newAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		//react to clicks
		newAcc.addMouseListener(new MouseAdapter() {
			@Override
		    public void mouseClicked(MouseEvent e) {
				signFrame.dispose();
				LoginForm();
		    }
		});
		signPanel.add(newAcc);
				
		//Add Sign up button
		
		sign=new JButton("تسجيل");	
		sign.setBounds(140, 320, 200, 40);
		sign.setFont(new Font("Serif", Font.BOLD, 22));
		sign.addActionListener(new StorageManagmentSystem());
		signPanel.add(sign);
				
		signFrame.setVisible(true);
	
	}
	
	
	/**
	 * main screen for admin
	 */
	public static void adminScreen()
	{
		//Variables declaration
		
		JTabbedPane mainTabbedPanel;
		JPanel usersTab, statsPanel,transPanel,inventoryPanel ;
		ImageIcon suitcaseIcon = new ImageIcon("images/suitcase.png");
		ImageIcon transIcon = new ImageIcon("images/trans.png");
		ImageIcon statsIcon = new ImageIcon("images/stats.png");
		ImageIcon invIcon = new ImageIcon("images/inventory.png");

		//Admin frame
		adminFrame= new JFrame("المدير");
		adminFrame.setSize(1280,720);
		adminFrame.setResizable(false);
		adminFrame.setLayout(null);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.setVisible(true);
		mainTabbedPanel = new JTabbedPane(JTabbedPane.RIGHT);
		mainTabbedPanel.setBounds(40, 40, 1200, 600);


		//Users Tab
		usersTab =new JPanel();
		usersTab.setLayout(new GridLayout(1,2));

		////Left Half
		JPanel allUsersPanel = new JPanel();
		allUsersPanel.setLayout(null);
		JLabel admin_Label_L1 = new JLabel("جميع المستخدمين");
		admin_Label_L1.setFont(new Font("Serif", Font.BOLD,22));
		admin_Label_L1.setBounds(200,10,200,30);
		allUsersPanel.add(admin_Label_L1);
		String usersTableCol[] = {"الرقم التعريفي","نوع المستخدم","الاسم الاخير","الاسم الاول"};
		String usersTableData[][] = {	{"111","كاشير","وليد","خالد"},
										{"222","مدير","اسامة","عبد الرحمن"},
										{"333","مشرف مخزن","سينا","جون"},
										{"444","مدير","تاني","خالد"}
									};
		JTable allUsersTable = new JTable(usersTableData,usersTableCol);
		JScrollPane scrollPane1 = new JScrollPane(allUsersTable);
		scrollPane1.setBounds(30,40,450,500);
		allUsersPanel.add(scrollPane1);
		/////////


		//Right Half
		JPanel usersEditPanel = new JPanel(new GridLayout(2,1));
		JPanel usersEditPanel_Top = new JPanel(null);
		JPanel usersEditPanel_Bot = new JPanel();
		JLabel admin_Label_RT1 = new JLabel("تعديل صلاحيات مستخدم");
		JLabel admin_Label_RT2 = new JLabel("جعل المستخدم صاحب الرقم التعريفي:");
		JLabel admin_Label_RT3 = new JLabel("يكون في وظيفة:");
		JTextField ID_field1   = new JTextField();
		JButton changeType_Button = new JButton("نفذ");
		String[] userTypes = {"مدير","كاشير","مشرف مخزن"};
		userTypesComBox = new JComboBox(userTypes);

		admin_Label_RT1.setBounds(200,10,200,30);
		admin_Label_RT1.setFont(new Font("Serif", Font.BOLD,22));
		admin_Label_RT2.setBounds(290,60,300,30);
		admin_Label_RT2.setFont(new Font("Serif", Font.PLAIN,16));
		admin_Label_RT3.setBounds(400,110,150,30);
		admin_Label_RT3.setFont(new Font("Serif", Font.PLAIN,16));
		ID_field1.setBounds(180,60,100,30);
		userTypesComBox.setBounds(270,110,120,30);
		userTypesComBox.setFont(new Font("Serif", Font.BOLD,16));
		changeType_Button.setBounds(130,112,100,25);
		changeType_Button.setFont(new Font("Serif", Font.BOLD,15));

		usersEditPanel_Top.add(admin_Label_RT1);
		usersEditPanel_Top.add(admin_Label_RT2);
		usersEditPanel_Top.add(admin_Label_RT3);
		usersEditPanel_Top.add(ID_field1);
		usersEditPanel_Top.add(changeType_Button);
		usersEditPanel_Top.add(userTypesComBox);


		usersEditPanel.add(usersEditPanel_Top,BorderLayout.NORTH);
		usersEditPanel.add(usersEditPanel_Bot,BorderLayout.SOUTH);



		usersTab.add(allUsersPanel);
		usersTab.add(usersEditPanel);
		
		mainTabbedPanel.addTab("قائمة المستخدمين", suitcaseIcon,usersTab);


		
		//inventory Tab
		inventoryPanel =new JPanel();
		inventoryPanel.setLayout(new GridLayout());
		mainTabbedPanel.addTab("عرض  المخزن", invIcon,inventoryPanel);

		String invCol[]= {"الرقم التعريفي","الاسم","السعر","رقم المورد", "اجمالي المخزون", "تاريخ الانتهاء"};
		String invData[][]= {{"1","منظف ارضيات","23 EGP","298","13","23/12/2022"},
							 {"2","بسكويت سادة","5 EGP","666","89","17/09/2021"}};

		JTable invTable= new JTable(invData,invCol);
		JScrollPane scrollPane2 = new JScrollPane(invTable);
		inventoryPanel.add(scrollPane2,BorderLayout.CENTER);


		//Statistics Tab
		statsPanel =new JPanel();
		statsPanel.setLayout(null);

		JLabel adminStat_Title = new JLabel("التقرير العام");
		JLabel adminStat_Label1 = new JLabel("إجمالي عدد الموظفين");
		JLabel adminStat_Label1_data = new JLabel("4");
		JLabel adminStat_Label2 = new JLabel("صافي الارباح البوم  ");
		JLabel adminStat_Label2_data = new JLabel("798 EGP");
		JLabel adminStat_Label3 = new JLabel("صافي ارباح الشهر   ");
		JLabel adminStat_Label3_data = new JLabel("5812 EGP");


		adminStat_Title.setBounds(500,30,100,30);
		adminStat_Title.setFont(new Font("Serif", Font.BOLD, 22));
		
		adminStat_Label1.setBounds(830,100,300,20);
		adminStat_Label1.setFont(new Font("Serif", Font.PLAIN, 20));
		
		adminStat_Label1_data.setBounds (680,100,100,20);
		adminStat_Label1_data.setFont(new Font("Serif",  Font.PLAIN, 20));
		
		adminStat_Label2.setBounds(830,150,300,20);
		adminStat_Label2.setFont(new Font("Serif",  Font.PLAIN, 20));
		
		adminStat_Label2_data.setBounds (680,150,150,20);
		adminStat_Label2_data.setFont(new Font("Serif",  Font.PLAIN, 20));
		
		adminStat_Label3.setBounds(830,200,300,20);
		adminStat_Label3.setFont(new Font("Serif",  Font.PLAIN, 20));
		
		adminStat_Label3_data.setBounds (680,200,100,20);
		adminStat_Label3_data.setFont(new Font("Serif", Font.PLAIN, 20));

		logOut2=new JButton("خروج");
		logOut2.setBounds(850, 500, 120, 40);
		logOut2.setFont(new Font("serif", Font.BOLD, 24));
		logOut2.addActionListener(new StorageManagmentSystem());
		statsPanel.add(logOut2);
		


		statsPanel.add(adminStat_Title);
		statsPanel.add(adminStat_Label1);
		statsPanel.add(adminStat_Label1_data);
		statsPanel.add(adminStat_Label2);
		statsPanel.add(adminStat_Label2_data);
		statsPanel.add(adminStat_Label3);
		statsPanel.add(adminStat_Label3_data);
		mainTabbedPanel.addTab("عرض التقرير العام", statsIcon,statsPanel);

		//Transactions Tab
		transPanel =new JPanel();
		transPanel.setLayout(null);
		JLabel admin_Trans_Label1 = new JLabel("عرض معاملات الموظف رقم:");
		JLabel admin_Trans_Label2 = new JLabel("عرض المعاملات من:      ");
		JLabel admin_Trans_Label3 = new JLabel("عرض المعاملات الي:     ");
		JTextField admin_Trans_TF1 = new JTextField();
		JTextField admin_Trans_TF2 = new JTextField();			//This part could be changed to a calender
		JTextField admin_Trans_TF3 = new JTextField();
		JButton admin_Trans_B1 = new JButton("نفذ");
		JButton admin_Trans_B2 = new JButton("نفذ");
		String transTableCol[]= {"الرقم التعريفي","الكمية","رقم الموظف","رقم المنتج","رقم الخدمة"}; //Needs better translation
		String transTableData[][] = {{"1","3","111","3","1"},{"2","2","111","5","1"},{"3","1","111","4","2"}};
		JTable transTable = new JTable(transTableData,transTableCol);
		JScrollPane scrollPane3 = new JScrollPane(transTable);


		admin_Trans_Label1.setBounds(770,50 ,350,30);
		admin_Trans_Label2.setBounds(780,100,350,30);
		admin_Trans_Label3.setBounds(450,100,350,30);
		admin_Trans_TF1.setBounds(590,55,150,25);
		admin_Trans_TF2.setBounds(630,105,150,25);
		admin_Trans_TF3.setBounds(310,105,150,25);
		admin_Trans_B1.setBounds(350,50,120,30);
		admin_Trans_B2.setBounds(150,100,120,30);
		scrollPane3.setBounds(10,150,970,400);
		
		admin_Trans_Label1.setFont(new Font("Serif", Font.PLAIN, 18));
		admin_Trans_Label2.setFont(new Font("Serif", Font.PLAIN, 18));
		admin_Trans_Label3.setFont(new Font("Serif", Font.PLAIN, 18));
		admin_Trans_B1.setFont(new Font("Serif", Font.BOLD, 18));
		admin_Trans_B2.setFont(new Font("Serif", Font.BOLD, 18));

		transPanel.add(admin_Trans_Label1);
		transPanel.add(admin_Trans_Label2);
		transPanel.add(admin_Trans_Label3);
		transPanel.add(admin_Trans_TF1);
		transPanel.add(admin_Trans_TF2);
		transPanel.add(admin_Trans_TF3);
		transPanel.add(admin_Trans_B1);
		transPanel.add(admin_Trans_B2);
		transPanel.add(scrollPane3);


		mainTabbedPanel.addTab("عرض المعاملات", transIcon,transPanel);



		//finalizing admin screen
		JLabel title = new JLabel("شاشة المدير");
		title.setBounds(560,10,100,30);
		title.setFont(new Font("Serif", Font.BOLD, 20));
		adminFrame.add(title);
		adminFrame.add(mainTabbedPanel);
	}
	
	
	public static void casherScreen() {
		casherFrame=new JFrame("كاشير");
		JTabbedPane casherPanel=new JTabbedPane(JTabbedPane.RIGHT);
		JPanel transcPanel=new JPanel(), refundPanel=new JPanel();
		
		JTextField quantity,prodID,receipt;
		JLabel quantityLabel,prodLabel;
		
		
		casherFrame.setSize(1280, 720);
		casherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		casherFrame.setResizable(false);
		ImageIcon purcheseIcon = new ImageIcon("images/purchese.png");
		ImageIcon refundIcon = new ImageIcon("images/refund.png");
		casherFrame.add(casherPanel);
		transcPanel.setLayout(new GridLayout(1,2));
		refundPanel.setLayout(new GridLayout(1,2));
		

		
	//Purchese Tab
		//Left side for receipt information
		JPanel tablePanel=new JPanel();
		tablePanel.setLayout(null);
		JLabel receiptLabel = new JLabel("المشتريات");
		receiptLabel.setFont(new Font("Serif", Font.BOLD,22));
		receiptLabel.setBounds(210,10,200,20);
		tablePanel.add(receiptLabel);
		String receiptTableCol[] = {"الرقم التعريفي","الاسم","الكمية","السعر"};
		String receiptTableData[][] = {	{"11","مسحوق تنظيف","1","23 EGP"},
										{"125","ديتول","13","140 EGP"},
										
									};
		JTable receiptTable = new JTable(receiptTableData,receiptTableCol);
		JScrollPane scrollPane = new JScrollPane(receiptTable);
		scrollPane.setBounds(30,40,450,500);
		tablePanel.add(scrollPane);
		
		transcPanel.add(tablePanel);
		
		
		
		//right side for input
		JPanel purchJPanel=new JPanel();
		purchJPanel.setLayout(null);
		
		prodLabel=new JLabel("رقم المنتج");
		prodLabel.setFont(new Font("serif",Font.PLAIN , 22));
		prodLabel.setBounds(450, 40, 2000, 40);
		purchJPanel.add(prodLabel);
		transcPanel.add(purchJPanel);
		
		prodID=new JTextField(50);
		prodID.setBounds(350, 80, 150, 30);
		purchJPanel.add(prodID);
		
		quantityLabel=new JLabel("الكمية");
		quantityLabel.setFont(new Font("serif",Font.PLAIN , 22));
		quantityLabel.setBounds(250, 40, 2000, 40);
		purchJPanel.add(quantityLabel);
		
		quantity=new JTextField(50);
		quantity.setBounds(130, 80, 150, 30);
		purchJPanel.add(quantity);
		
		add =new JButton("إضافة");
		add.setBounds(400,130,100,30);
		add.setFont(new Font("serif", Font.BOLD, 18));
		add.addActionListener(new StorageManagmentSystem());
		purchJPanel.add(add);
		
		remove =new JButton("إزالة");
		remove.setBounds(280,130,100,30);
		remove.setFont(new Font("serif", Font.BOLD, 18));
		remove.addActionListener(new StorageManagmentSystem());
		purchJPanel.add(remove);
		
		
		//total
		JLabel total=new JLabel("الثمن");
		JLabel sum=new JLabel("163 EGP");	
		total.setFont(new Font("serif", Font.PLAIN, 35));
		sum.setFont(new Font("serif", Font.PLAIN, 27));
		total.setBounds(200, 300, 150, 40);
		purchJPanel.add(total);
		sum.setBounds(180, 340, 400, 40);
		purchJPanel.add(sum);
		
		pay=new JButton("دفع");
		pay.setFont(new Font("serif", Font.PLAIN, 22));
		pay.setBounds(400, 350, 100, 30);
		purchJPanel.add(pay);
		
		//Log out
		logOut1=new JButton("خروج");
		logOut1.setBounds(410, 600, 120, 40);
		logOut1.setFont(new Font("serif", Font.BOLD, 24));
		logOut1.addActionListener(new StorageManagmentSystem());
		purchJPanel.add(logOut1);
		
		
		
		
	//Refund Tab
		
		//Left side for receipt information
				JPanel refundRecieptPanel=new JPanel();
				refundRecieptPanel.setLayout(null);
				JLabel refundtLabel = new JLabel("وصل");
				refundtLabel.setFont(new Font("Serif", Font.BOLD,22));
				refundtLabel.setBounds(240,10,200,20);
				refundRecieptPanel.add(refundtLabel);
				String refundTableCol[] = {"الرقم التعريفي","الاسم","الكمية","السعر","وصل رقم"};
				String refundTableData[][] = {	{"11","مسحوق تنظيف","1","23 EGP","1498"},
												{"125","ديتول","13","140 EGP","1498"},
												
											};
				JTable refundTable = new JTable(refundTableData,refundTableCol);
				JScrollPane scrollPane2 = new JScrollPane(refundTable);
				scrollPane2.setBounds(30,40,450,500);
				refundRecieptPanel.add(scrollPane2);
				
				refundPanel.add(refundRecieptPanel);
				
		//Right side
				JPanel inputPanel=new JPanel();
				inputPanel.setLayout(null);
				JLabel receiptName=new JLabel("رقم الوصل");
				receiptName.setBounds(450,50,100,30);
				receiptName.setFont(new Font("Serif", Font.PLAIN,20));
				inputPanel.add(receiptName);
				
				JTextField receiptID=new JTextField(150);
				receiptID.setBounds(200, 80, 300, 30);
				inputPanel.add(receiptID);
				
				check =new JButton("بحث");
				check.setBounds(400,130,100,30);
				check.setFont(new Font("serif", Font.BOLD, 18));
				check.addActionListener(new StorageManagmentSystem());
				inputPanel.add(check);
				
				JLabel removeLabel=new JLabel("إزالة");
				removeLabel.setFont(new Font("serif", Font.BOLD, 30));
				removeLabel.setBounds(470,250,150,40);
				inputPanel.add(removeLabel);
				
				JLabel idLabel=new JLabel("رقم المنتج");
				
				idLabel.setFont(new Font("serif",Font.PLAIN , 20));
				idLabel.setBounds(450, 300, 200, 40);
				inputPanel.add(idLabel);
				
				JTextField refProdID= new JTextField(50);
				refProdID.setBounds(350, 335, 150, 30);
				inputPanel.add(refProdID);
				
				
				JLabel quanLabel=new JLabel("الكمية");
				quanLabel.setFont(new Font("serif",Font.PLAIN , 22));
				quanLabel.setBounds(250, 300, 2000, 40);
				inputPanel.add(quanLabel);
				
				JTextField quan=new JTextField(50);
				quan.setBounds(130, 335, 150, 30);
				inputPanel.add(quan);
				
				
				refund=new JButton("إزالة");
				refund.setFont(new Font("serif",Font.BOLD , 18));
				refund.setBounds(400, 380, 100, 30);
				inputPanel.add(refund);
				refundPanel.add(inputPanel);
				
				
		
		
		
		casherPanel.addTab("الدفع",purcheseIcon,transcPanel);
		casherPanel.addTab("استرداد", refundIcon,refundPanel);
		
		casherFrame.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			adminScreen();
			loginFrame.dispose();
			
		}
		if(e.getSource()==sign) {
			casherScreen();
			signFrame.dispose();
			
		}
		if(e.getSource()==logOut1 ) {
			LoginForm();
			casherFrame.dispose();
			
		}
		if(e.getSource()==logOut2) {
			LoginForm();
			
			adminFrame.dispose();
		}
		/*not sure if it can be used later or not
		if(e.getSource()==userTypesBox)

		{
			JComboBox utBox = (JComboBox)e.getSource();
			userTypesBox_selectedItem = (String)utBox.getSelectedItem();
		}
		*/
	}}
