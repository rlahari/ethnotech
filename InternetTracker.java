import java.util.Scanner;

class WebPage {
    String siteName;
    WebPage next;

    WebPage(String siteName) {
        this.siteName = siteName;
        this.next = null;
    }
}

public class InternetTracker {

    WebPage start = null;
    WebPage end = null;

    void addWebsite(String siteName) {
        WebPage newPage = new WebPage(siteName);

        if (start == null) {
            start = end = newPage;
        } else {
            end.next = newPage;
            end = newPage;
        }

        System.out.println("Website Added: " + siteName);
    }

    void showWebsites() {
        if (start == null) {
            System.out.println("No websites stored.");
            return;
        }

        WebPage temp = start;
        int pos = 1;

        System.out.println("\nVisited Websites:");

        while (temp != null) {
            System.out.println(pos + ". " + temp.siteName);
            temp = temp.next;
            pos++;
        }
    }

    void findWebsite(String name) {
        WebPage temp = start;
        int index = 1;

        while (temp != null) {
            if (temp.siteName.equalsIgnoreCase(name)) {
                System.out.println("Website found at position: " + index);
                return;
            }

            temp = temp.next;
            index++;
        }

        System.out.println("Website not available.");
    }

    void removeWebsite(String name) {

        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        if (start.siteName.equalsIgnoreCase(name)) {
            start = start.next;

            if (start == null) {
                end = null;
            }

            System.out.println("Website removed.");
            return;
        }

        WebPage current = start;

        while (current.next != null &&
               !current.next.siteName.equalsIgnoreCase(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Website not found.");
        } else {

            if (current.next == end) {
                end = current;
            }

            current.next = current.next.next;
            System.out.println("Website removed.");
        }
    }

    void totalWebsites() {
        int count = 0;

        WebPage temp = start;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Websites: " + count);
    }

    public static void main(String[] args) {

        InternetTracker tracker = new InternetTracker();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Website Tracker =====");
            System.out.println("1. Add Website");
            System.out.println("2. Show Websites");
            System.out.println("3. Find Website");
            System.out.println("4. Remove Website");
            System.out.println("5. Total Websites");
            System.out.println("6. Exit");

            System.out.print("Choose Option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter Website Name: ");
                    String site = sc.nextLine();
                    tracker.addWebsite(site);
                    break;

                case 2:
                    tracker.showWebsites();
                    break;

                case 3:
                    System.out.print("Enter Website to Find: ");
                    String searchSite = sc.nextLine();
                    tracker.findWebsite(searchSite);
                    break;

                case 4:
                    System.out.print("Enter Website to Remove: ");
                    String removeSite = sc.nextLine();
                    tracker.removeWebsite(removeSite);
                    break;

                case 5:
                    tracker.totalWebsites();
                    break;

                case 6:
                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}