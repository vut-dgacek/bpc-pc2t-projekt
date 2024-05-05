package books;

public class Textbook implements Interface {
	private String Name;
	private String Author;
	private int ReleaseDate;
	private boolean Available;
	private int SuitableYear;

	public Textbook(String BookName, String AuthorName, int ReleaseDate, boolean Available, int SuitableYear) {
		this.Name = BookName;
		this.Author = AuthorName;
		this.ReleaseDate = ReleaseDate;
		this.Available = Available;
		this.SuitableYear = SuitableYear;
	}

	public void setName(String NewBookName) {Name = NewBookName;}
	public void setAuthor(String AuthorName) {Author = AuthorName;}
	public void setReleaseDate(int NewReleaseDate) {ReleaseDate = NewReleaseDate;}
	public void setAvailable(boolean Availability) {Available = Availability;}
	public void setSuitableYear(int NewSuitableYear) {SuitableYear = NewSuitableYear;}

	public String getName() {return Name;}
	public String getAuthor() {return Author;}
	public int getReleaseDate() {return ReleaseDate;}
	public boolean getAvailable() {return Available;}
	public int getSuitableYear() {return SuitableYear;}

}
