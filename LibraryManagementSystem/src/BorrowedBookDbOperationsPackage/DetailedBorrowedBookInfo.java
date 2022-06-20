package BorrowedBookDbOperationsPackage;

import java.sql.Date;

public class DetailedBorrowedBookInfo {
	int id;
	String  customerSocialSecurityId,customerName,customerSurname,bookName,bookAuthor;
	Date issueDate,dueDate;
	int delayedDayCount;
	public DetailedBorrowedBookInfo(int id, String customerSocialSecurityId, String customerName,
			String customerSurname, String bookName, String bookAuthor, Date issueDate, Date dueDate,
			int delayedDayCount) {
		super();
		this.id = id;
		this.customerSocialSecurityId = customerSocialSecurityId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.delayedDayCount = delayedDayCount;
	}
	public String[] toStringArray() {
		return new  String[] {Integer.toString(id), customerSocialSecurityId,customerName,customerSurname,bookName
				,bookAuthor,issueDate.toString(),dueDate.toString(),Integer.toString(delayedDayCount)};
	}

}
