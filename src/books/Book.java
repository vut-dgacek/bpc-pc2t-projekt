package books;

public class Book implements Interface{
	private String Name;
	private String Author;
	private int ReleaseDate;
	private boolean Available;
	
	public Book(String BookName, String AuthorName, int ReleaseDate, boolean Available) {
		this.Name = BookName;
		this.Author = AuthorName;
		this.ReleaseDate = ReleaseDate;
		this.Available = Available;
	}
	
	public void setName(String NewBookName) {Name = NewBookName;}
	public void setAuthor(String AuthorName) {Author = AuthorName;}
	public void setReleaseDate(int NewReleaseDate) {ReleaseDate = NewReleaseDate;}
	public void setAvailable(boolean Availability) {Available = Availability;}

	public String getName() {return Name;}
	public String getAuthor() {return Author;}
	public int getReleaseDate() {return ReleaseDate;}
	public boolean getAvailable() {return Available;}

}
