package books;

public class Novel implements Interface {
	private String Name;
	private String Author;
	private int ReleaseDate;
	private boolean Available;
	private String Genre;

	public Novel(String BookName, String AuthorName, int ReleaseDate, boolean Available, String Genre) {
		this.Name = BookName;
		this.Author = AuthorName;
		this.ReleaseDate = ReleaseDate;
		this.Available = Available;
		this.Genre = Genre;
	}
	
	public void setName(String NewBookName) {Name = NewBookName;}
	public void setAuthor(String AuthorName) {Author = AuthorName;}
	public void setReleaseDate(int NewReleaseDate) {ReleaseDate = NewReleaseDate;}
	public void setAvailable(boolean Availability) {Available = Availability;}
	public void setGenre(String NewGenre) {Genre = NewGenre;}

	public String getName() {return Name;}
	public String getAuthor() {return Author;}
	public int getReleaseDate() {return ReleaseDate;}
	public boolean getAvailable() {return Available;}	
	public String getGenre() {return Genre;}

}
