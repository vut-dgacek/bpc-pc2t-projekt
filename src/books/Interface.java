package books;

public interface Interface {	
	public void setName(String NewBookName);
	public void setAuthor(String AuthorName);
	public void setReleaseDate(int NewReleaseDate);
	public void setAvailable(boolean Availability);

	public String getName();
	public String getAuthor();
	public int getReleaseDate();
	public boolean getAvailable();

}
