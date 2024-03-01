import java.util.Scanner;
import java.util.Random;

public class shinaLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Shinas library management");

        String[] members = {"shina23", "aaliyah23"};   // ADD A PASSWORD ARRAY 
        String[] passwords = {"shina123", "aaliyah345"};

        String[] dystopianBooks = {                                         // I generated themes of books from chat gpt and put them in a list
            "1984 by George Orwell",
            "Brave New World by Aldous Huxley",
            "The Handmaid's Tale by Margaret Atwood",
            "Fahrenheit 451 by Ray Bradbury",
            "The Road by Cormac McCarthy",
            "The Hunger Games by Suzanne Collins",
            "Station Eleven by Emily St. John Mandel",
            "Oryx and Crake by Margaret Atwood",
            "Neuromancer by William Gibson",
            "Snow Crash by Neal Stephenson"
        };
        
        String[] magicalRealismBooks = {
            "One Hundred Years of Solitude by Gabriel Garcia Marquez",
            "The House of the Spirits by Isabel Allende",
            "Midnight's Children by Salman Rushdie",
            "Like Water for Chocolate by Laura Esquivel",
            "The Master and Margarita by Mikhail Bulgakov",
            "Beloved by Toni Morrison",
            "The Night Circus by Erin Morgenstern",
            "Kafka on the Shore by Haruki Murakami",
            "The Wind-Up Bird Chronicle by Haruki Murakami",
            "A Wild Sheep Chase by Haruki Murakami"
        };
        
        String[] historicalFictionBooks = {
            "The Book Thief by Markus Zusak",
            "All the Light We Cannot See by Anthony Doerr",
            "The Nightingale by Kristin Hannah",
            "The Boy in the Striped Pajamas by John Boyne",
            "City of Thieves by David Benioff",
            "The Tattooist of Auschwitz by Heather Morris",
            "Suite Française by Irène Némirovsky",
            "The Guernsey Literary and Potato Peel Pie Society by Mary Ann Shaffer",
            "Beneath a Scarlet Sky by Mark Sullivan",
            "The Alice Network by Kate Quinn"
        };

        String[] sciFiSpaceOperaBooks = {
            "Dune by Frank Herbert",
            "Hyperion by Dan Simmons",
            "Ender's Game by Orson Scott Card",
            "Foundation by Isaac Asimov",
            "The Expanse (Series) by James S.A. Corey",
            "Altered Carbon by Richard K. Morgan",
            "Ancillary Justice by Ann Leckie",
            "The Left Hand of Darkness by Ursula K. Le Guin",
            "Pandora's Star by Peter F. Hamilton",
            "Old Man's War by John Scalzi"
        };

        String[] mysteryDetectiveBooks = {
            "The Girl with the Dragon Tattoo by Stieg Larsson",
            "Gone Girl by Gillian Flynn",
            "The Hound of the Baskervilles by Arthur Conan Doyle",
            "The Da Vinci Code by Dan Brown",
            "Big Little Lies by Liane Moriarty",
            "In the Woods by Tana French",
            "The Maltese Falcon by Dashiell Hammett",
            "The No. 1 Ladies' Detective Agency by Alexander McCall Smith",
            "The Silent Patient by Alex Michaelides",
            "The Cuckoo's Calling by Robert Galbraith (J.K. Rowling)"
        };
        

        
        
        


        boolean password_check = false;
        int password_try = 4;
        int count = 0;
        String booksRead = "";

        System.out.println("Are you a member yet");

        String ans = scan.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("Enter your username");
            String userName = scan.nextLine();
            String pass;
            for (int i = 0; i < members.length; i++) {
                if (userName.equals(members[i])) {
                    do {
                        System.out.println("Enter your password " + members[i]);
                        pass = scan.nextLine();

                        if (pass.equals(passwords[i])) {
                            password_check = true;
                            System.out.println("Welcome back, you have successfully logged in " + members[i]);

                            System.out.println();
                            System.out.println(".THEMES");
                            System.out.println("Dystopian Futures");
                            System.out.println("Magical Realism");
                            System.out.println("Historical Fiction");
                            System.out.println("Sci-Fi");
                            System.out.println("Mystery and Detective");
                            System.out.println("Other");

                            System.out.println();

                            System.out.println("What theme do you feel like reading this month?:");


                            String theme = scan.nextLine();


                            if(theme.equalsIgnoreCase("dystopian Futures")){
                                int randomNum = random.nextInt(dystopianBooks.length);
                                String randomBook = dystopianBooks[randomNum];
                                count = count + 1;
                                booksRead = booksRead +" " +randomBook;
                                System.out.println("Random book for you to read this month :"+ randomBook);
                            }
                            else if(theme.equalsIgnoreCase("Magical Realism")){
                                int randomNum = random.nextInt(magicalRealismBooks.length);
                                String randomBook = magicalRealismBooks[randomNum];
                                count = count + 1;
                                booksRead = booksRead +" " +randomBook;
                                System.out.println("Random book for you to read this month :"+ randomBook);
                            }
                            else if(theme.equalsIgnoreCase("Historical Fiction")){
                                int randomNum = random.nextInt(historicalFictionBooks.length);
                                String randomBook = historicalFictionBooks[randomNum];
                                count = count + 1;
                                booksRead = booksRead +" " +randomBook;
                                System.out.println("Random book for you to read this month :"+ randomBook);
                            }
                            else if(theme.equalsIgnoreCase("Sci-Fi")){
                                int randomNum = random.nextInt(sciFiSpaceOperaBooks.length);
                                String randomBook = sciFiSpaceOperaBooks[randomNum];
                                count = count + 1;
                                booksRead = booksRead +" " +randomBook;
                                System.out.println("Random book for you to read this month :"+ randomBook);
                            }
                            else if(theme.equalsIgnoreCase("Mystery and Detective")){
                                int randomNum = random.nextInt(mysteryDetectiveBooks.length);
                                String randomBook = mysteryDetectiveBooks[randomNum];
                                count = count + 1;
                                booksRead = booksRead +" " +randomBook;
                                System.out.println("Random book for you to read this month :"+ randomBook);
                            }
                            
                            else if(theme.equalsIgnoreCase("Other")){
                                System.out.println("1.History");
                                System.out.println("2.Books read");
                                System.out.println("3.exit");
                                
                                String answer = scan.nextLine();

                                if(answer.equalsIgnoreCase("1")){
                                    System.out.println("These are the books you have read" +booksRead);
                                }
                                else if(answer.equalsIgnoreCase("2")){
                                    System.out.println("You have read "+count+" books");
                                }
                                else if(answer.equalsIgnoreCase("3")){
                                    break;
                                }

                            }
                            
                           // break;

                        } else {
                            password_check = false;
                            password_try--;
                            System.out.println("Incorrect password. Attempts left: " + password_try);
                        }
                    } while (!password_check && password_try > 0);

                    break;  // Exit the loop if the username is found
                }
            }

            if (!password_check) {
                System.out.println("Account locked. Too many incorrect attempts.");
            }
        }
    }
}
