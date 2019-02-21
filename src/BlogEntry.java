import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class BlogEntry {

	private String userName;
	private String text;
	private Date date;

	public BlogEntry(String user, String txt, Date date) {

		userName = user;
		text = txt;
		this.date = date;

	}
	
	public void setUserName(String userName) {
		this.userName =  userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setText(String text) {
		this.text =  text;
	}
	
	public String gettext() {
		return text;
	}
	
	public void setdate(Date date) {
		this.date =  date;
	}
	
	public Date getDate() {
		return date;
	}

	public void displayEntry() {
		System.out.println(toString());
	}

	@Override
	public boolean equals(Object obj) {
		String callingObjUserName = this.userName;
		String callingObjText = this.text;
		Date callingObjDate = this.date;

		BlogEntry otherBlogEntry = (BlogEntry) obj;
		String otherObjUserName = otherBlogEntry.userName;
		String otherObjText = otherBlogEntry.text;
		Date otherObjDate = otherBlogEntry.date;

		if (callingObjUserName.equals(otherObjUserName) && callingObjText.equals(otherObjText)
				&& callingObjDate.equals(otherObjDate)) {
			return true;
		}
		
		return false;

	}
	
	public String getSummary() {
		StringTokenizer strTkz = new StringTokenizer(text);

		int count = 0;
		String tempText = "";
		while (strTkz.hasMoreTokens() && count < 10) {

			tempText += strTkz.nextToken() + " ";
			count++;
		}

		return tempText;
	}

	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String description = "User Name: " + this.userName + "\nText: " + this.text + "\nDate: " + df.format(this.date);
		return description;
	}

	public static void main(String[] args) {
		
		String userName = "JulesP";
		String txt = "Lorem Ipsum is simply dummy text othe printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy";
		Date date = new Date();
		BlogEntry blog1 = new BlogEntry(userName, txt, date);
		
		BlogEntry blog2 = new BlogEntry(userName, txt, date);
		
		if (blog1.equals(blog2)) {
			System.out.println("blog1 == blog2");
		} else {
			System.out.println("blog1 != blog2");
		}
		
		blog1.displayEntry();
		
		String summary = blog1.getSummary();
		System.out.println("Summary: " + summary);
		
	}

}
