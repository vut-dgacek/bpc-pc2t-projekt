package main;

import books.Book;
import books.Interface;
import books.Novel;
import books.Textbook;
import io.console.Input;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	enum BOOK_TYPE {BOOK, NOVEL, TEXTBOOK}
	
	public static <T> void iterDelete(ArrayList<T> al, String BookName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getName().equals(BookName)) {
				iter.remove();
				System.out.println("# BOOK HAS BEEN REMOVED!                                       #");
			}
		}
	}
	
	public static <T> void iterAvailability(ArrayList<T> al, Scanner sc, String BookName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getName().equals(BookName)) {
				System.out.println("#     Change availability:                                     #");
				if(Input.readBool(sc) == true) {
					((Interface) el).setAvailable(true);
				} else {
					((Interface) el).setAvailable(false);
				}
			}
		}
	}
	
	public static <T> void iterPrintBooks(ArrayList<T> al) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(el instanceof Book) {
				System.out.println(
						"Name: " + ((Interface) el).getName() + " " +
						"Author: " + ((Interface) el).getAuthor() + " " +
						"Release date: " + ((Interface) el).getReleaseDate() + " " +
						"Available: " + ((Interface) el).getAvailable()
						);
			} else if(el instanceof Novel) {
				System.out.println(
						"Name: " + ((Interface) el).getName() + " " +
						"Author: " + ((Interface) el).getAuthor() + " " +
						"Release date: " + ((Interface) el).getReleaseDate() + " " +
						"Available: " + ((Interface) el).getAvailable() + " " +
						"Genre: " + ((Novel) el).getGenre()
						);
			} else if(el instanceof Textbook) {
				System.out.println(
						"Name: " + ((Interface) el).getName() + " " +
						"Author: " + ((Interface) el).getAuthor() + " " +
						"Release date: " + ((Interface) el).getReleaseDate() + " " +
						"Available: " + ((Interface) el).getAvailable() + " " +
						"Suitable year: " + ((Textbook) el).getSuitableYear()
						);
			}
		}
	}
	
	public static <T> void iterPrintBookByName(ArrayList<T> al, String BookName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getName().equals(BookName)) {
				if(el instanceof Book) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable()
							);
				} else if(el instanceof Novel) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Genre: " + ((Novel) el).getGenre()
							);
				} else if(el instanceof Textbook) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Suitable year: " + ((Textbook) el).getSuitableYear()
							);
				}
			}
		}
	}
	
	public static <T> void iterPrintBooksFromAuthor(ArrayList<T> al, String AuthorName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getAuthor().equals(AuthorName)) {
				if(el instanceof Book) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable()
							);
				} else if(el instanceof Novel) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Genre: " + ((Novel) el).getGenre()
							);
				} else if(el instanceof Textbook) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Suitable year: " + ((Textbook) el).getSuitableYear()
							);
				}
			}
		}
	}
	
	public static <T> void iterPrintAvailableBooks(ArrayList<T> al) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getAvailable() == false) {
				if(el instanceof Book) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable()
							);
				} else if(el instanceof Novel) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Genre: " + ((Novel) el).getGenre()
							);
				} else if(el instanceof Textbook) {
					System.out.println(
							"Name: " + ((Interface) el).getName() + " " +
							"Author: " + ((Interface) el).getAuthor() + " " +
							"Release date: " + ((Interface) el).getReleaseDate() + " " +
							"Available: " + ((Interface) el).getAvailable() + " " +
							"Suitable year: " + ((Textbook) el).getSuitableYear()
							);
				}
			}
		}
	}
	
	public static <T> boolean iterFindDuplicate(ArrayList<T> al, String BookName, String AuthorName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getName().equals(BookName) && ((Interface) el).getAuthor().equals(AuthorName)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> void iterModifyBook(ArrayList<T> al, Scanner sc, String BookName) {
		ListIterator<T> iter = al.listIterator();
		while(iter.hasNext()) {
			T el = iter.next();
			if(((Interface) el).getName().equals(BookName)) {
				System.out.println("#     Change author:                                           #");
				String author = sc.next();
				sc.nextLine();
				((Interface) el).setAuthor(author);
				
				System.out.println("#     Change release date:                                     #");
				int releaseDate = Input.readInt(sc);
				((Interface) el).setReleaseDate(releaseDate);
				
				System.out.println("#     Change availability:                                     #");
				if(Input.readBool(sc) == true) {
					((Interface) el).setAvailable(true);
				} else {
					((Interface) el).setAvailable(false);
				}
			}
		}
	}
	
	
	public static BOOK_TYPE selectBookType(Scanner sc) {
		BOOK_TYPE type = null;
		boolean run = true;
		
		while(run) {
			System.out.println("################################################################");
			System.out.println("# Book types:                                                  #");
			System.out.println("#     1. Book                                                  #");
			System.out.println("#     2. Novel                                                 #");
			System.out.println("#     3. Textbook                                              #");
			System.out.println("# Selected option:                                             #");
			int option = Input.readInt(sc);
			
			switch(option) {
				case 1:
					type = BOOK_TYPE.BOOK;
					run = false;
					break;
				case 2:
					type = BOOK_TYPE.NOVEL;
					run = false;
					break;
				case 3:
					type = BOOK_TYPE.TEXTBOOK;
					run = false;
					break;
				default:
					System.out.println("# WARNING: INVALID CHOICE!!!                                   #");
					break;
			}
		}
		return type;
	}
	
	public static void addBook(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		BOOK_TYPE chosenBookType = selectBookType(sc);
		System.out.println("################################################################");
		System.out.println("# Add book:                                                    #");
		System.out.println("#     Book name:                                               #");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("#     Book author:                                             #");
		String author = sc.next();
		sc.nextLine();
		
		System.out.println("#     Book release date (year only):                           #");
		int releaseDate = Input.readInt(sc);
		
		System.out.println("# Set availabilty (0 = Returned, 1 = Borrowed):                #");
		boolean availability = Input.readBool(sc);
		
		switch(chosenBookType) {
			case BOOK:
				if(iterFindDuplicate(books, name, author) == false) {
					books.add(new Book(name, author, releaseDate, availability));
				} else {
					System.out.println("# WARNING: THIS ENTRY ALREADY EXISTS!                          #");
				}
				break;
			case NOVEL:
				if(iterFindDuplicate(novels, name, author) == false) {
					System.out.println("# Add genre:                                                   #");
					String genre = sc.next();
					sc.nextLine();
					novels.add(new Novel(name, author, releaseDate, availability, genre));
				} else {
					System.out.println("# WARNING: THIS ENTRY ALREADY EXISTS!                          #");
				}
				break;
			case TEXTBOOK:
				if(iterFindDuplicate(textbooks, name, author) == false) {
					System.out.println("# Add suitable year:                                           #");
					int suitableYear = Input.readInt(sc);
					textbooks.add(new Textbook(name, author, releaseDate, availability, suitableYear));
				} else {
					System.out.println("# WARNING: THIS ENTRY ALREADY EXISTS!                          #");
				}
				break;
		}
	}
	
	public static void modifyBook(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		BOOK_TYPE type = selectBookType(sc);
		System.out.println("################################################################");
		System.out.println("# Modify book:                                                 #");
		System.out.println("#     Name to search:                                          #");
		String name = sc.next();
		sc.nextLine();
		
		switch (type) {
			case BOOK:
				iterModifyBook(books, sc, name);
				break;
			case NOVEL:
				iterModifyBook(novels, sc, name);
				break;
			case TEXTBOOK:
				iterModifyBook(textbooks, sc, name);
				break;
		}
	}
	
	public static void delBook(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		BOOK_TYPE type = selectBookType(sc);
		System.out.println("################################################################");
		System.out.println("# Delete book:                                                 #");
		System.out.println("#     Name of the book:                                        #");
		String name = sc.next();
		sc.nextLine();
		
		switch(type) {
			case BOOK:
				iterDelete(books, name);
				break;
			case NOVEL:
				iterDelete(novels, name);
				break;
			case TEXTBOOK:
				iterDelete(textbooks, name);
				break;
		}
	}
	
	public static void setAvailability(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		BOOK_TYPE type = selectBookType(sc);
		System.out.println("################################################################");
		System.out.println("# Book name:                                                   #");
		String name = sc.next();
		sc.nextLine();
		
		switch(type) {
			case BOOK:
				iterAvailability(books, sc, name);
				break;
			case NOVEL:
				iterAvailability(novels, sc, name);
				break;
			case TEXTBOOK:
				iterAvailability(textbooks, sc, name);
				break;
		}
	}

	public static void printAllBooks(ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		books.sort((a, b) -> { return a.getName().compareTo(b.getName()); });
		novels.sort((a, b) -> { return a.getName().compareTo(b.getName()); });
		textbooks.sort((a, b) -> { return a.getName().compareTo(b.getName()); });
		
		System.out.println("################################################################");
		System.out.println("# All books are sorted by name                                 #");
		System.out.println("# Books:                                                       #");
		iterPrintBooks(books);
		System.out.println("# Novels:                                                      #");
		iterPrintBooks(novels);
		System.out.println("# Textbooks:                                                   #");
		iterPrintBooks(textbooks);
	}
		
	public static void findBook(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		System.out.println("################################################################");
		System.out.println("# Search book name:                                            #");
		String BookName = sc.next();
		sc.nextLine();

		System.out.println("# Books:                                                       #");
		iterPrintBookByName(books, BookName);
		System.out.println("# Novels:                                                      #");
		iterPrintBookByName(novels, BookName);
		System.out.println("# Textbooks:                                                   #");
		iterPrintBookByName(textbooks, BookName);
	}
	
	public static void printBooksFromAuthor(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		books.sort((a, b) -> {
			String sa = Integer.toString(a.getReleaseDate());
			String sb = Integer.toString(b.getReleaseDate());
			return sa.compareTo(sb);
			});
		novels.sort((a, b) -> {
			String sa = Integer.toString(a.getReleaseDate());
			String sb = Integer.toString(b.getReleaseDate());
			return sa.compareTo(sb);
			});
		textbooks.sort((a, b) -> {
			String sa = Integer.toString(a.getReleaseDate());
			String sb = Integer.toString(b.getReleaseDate());
			return sa.compareTo(sb);
		});
		
		System.out.println("################################################################");
		System.out.println("# Search author:                                               #");
		String AuthorName = sc.next();
		sc.nextLine();
		
		System.out.println("# Books:                                                       #");
		iterPrintBooksFromAuthor(books, AuthorName);
		System.out.println("# Novels:                                                      #");
		iterPrintBooksFromAuthor(novels, AuthorName);
		System.out.println("# Textbooks:                                                   #");
		iterPrintBooksFromAuthor(textbooks, AuthorName);
	}

	public static void printBorrowedBooks(ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		System.out.println("################################################################");
		System.out.println("# Borrowed:                                                    #");
		System.out.println("# Books:                                                       #");
		iterPrintAvailableBooks(books);
		System.out.println("# Novels:                                                      #");
		iterPrintAvailableBooks(novels);
		System.out.println("# Textbooks:                                                   #");
		iterPrintAvailableBooks(textbooks);
	}
	
	public static void printBooksFromGenre(Scanner sc, ArrayList<Novel> novels) {
		System.out.println("################################################################");
		System.out.println("# Name of genre:                                               #");
		String genre = sc.next();
		sc.nextLine();
		
		System.out.println("# Novels:                                                      #");
		for (Novel novel : novels) {
			if (novel.getGenre().equals(genre)) {
				System.out.println(
						"Name: " + novel.getName() + " " +
						"Author: " + novel.getAuthor() + " " +
						"Release date: " + novel.getReleaseDate() + " " +
						"Available: " + novel.getAvailable() + " " +
						"Genre: " + novel.getGenre()
						);
			}
		}
	}
	
	public static void writeBookToFile(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		System.out.println("################################################################");
		System.out.println("# File path to write:                                          #");
	}
	
	public static void loadBookFromFile(Scanner sc, ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {
		System.out.println("################################################################");
		System.out.println("# File path to read:                                           #");
	}
	
	public static void writeDatabase(ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {}
	public static void readDatabase(ArrayList<Book> books, ArrayList<Novel> novels, ArrayList<Textbook> textbooks) {}
	
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		ArrayList<Novel> novels = new ArrayList<>();
		ArrayList<Textbook> textbooks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int mainMenuOption = 0;

		while(true) {
			System.out.println("################################################################");
			System.out.println("#                      Low budget library                      #");
			System.out.println("################################################################");
			System.out.println("# Options:                                                     #");
			System.out.println("#      1. Add new book                                         #");
			System.out.println("#      2. Modify book                                          #");
			System.out.println("#      3. Delete book                                          #");
			System.out.println("#      4. Set borrowed/returned                                #");
			System.out.println("#      5. Print all books                                      #");
			System.out.println("#      6. Find book                                            #");
			System.out.println("#      7. Print all books from author (chronological order)    #");
			System.out.println("#      8. Print all books from genre                           #");
			System.out.println("#      9. Print all borrowed books                             #");
			System.out.println("#     10. Write book information to file                       #");
			System.out.println("#     11. Load book information from file                      #");
			System.out.println("#     12. Exit                                                 #");
			System.out.println("# Selected option:                                             #");
			mainMenuOption = Input.readInt(sc);
			
			switch(mainMenuOption) {
				case 1:
					addBook(sc, books, novels, textbooks);
					break;
				case 2:
					modifyBook(sc, books, novels, textbooks);
					break;
				case 3:
					delBook(sc, books, novels, textbooks);
					break;
				case 4:
					setAvailability(sc, books, novels, textbooks);
					break;
				case 5:
					printAllBooks(books, novels, textbooks);
					break;
				case 6:
					findBook(sc, books, novels, textbooks);
					break;
				case 7:
					printBooksFromAuthor(sc, books, novels, textbooks);
					break;
				case 8:
					printBooksFromGenre(sc, novels);
					break;
				case 9:
					printBorrowedBooks(books, novels, textbooks);
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					System.exit(0);
					break;
				default:
					System.out.println("# WARNING: INVALID CHOICE!!!                                   #");
					break;
			}
		}
	}
}
