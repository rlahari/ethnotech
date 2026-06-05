class Post {
    String content;
    Post prev;
    Post next;

    Post(String content) {
        this.content = content;
        prev = null;
        next = null;
    }
}

class SocialMediaFeed {
    Post head;
    Post current;
    public void addPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = newPost;
            current = head;
            return;
        }

        Post temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newPost;
        newPost.prev = temp;
    }

    
    public void showCurrentPost() {
        if (current == null) {
            System.out.println("No posts available");
            return;
        }

        System.out.println("Current Post: " + current.content);
    }

   
    public void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrentPost();
        } else {
            System.out.println("No next post");
        }
    }

   
    public void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrentPost();
        } else {
            System.out.println("No previous post");
        }
    }

   
    public void deleteCurrentPost() {
        if (current == null) {
            System.out.println("No post to delete");
            return;
        }

        System.out.println("Deleted: " + current.content);

        if (current == head) {
            head = current.next;

            if (head != null) {
                head.prev = null;
            }

            current = head;
            return;
        }

        Post prevNode = current.prev;
        Post nextNode = current.next;

        prevNode.next = nextNode;

        if (nextNode != null) {
            nextNode.prev = prevNode;
        }

        current = nextNode != null ? nextNode : prevNode;
    }

    
    public void insertSponsoredPost(String content) {
        if (current == null) {
            System.out.println("Feed is empty");
            return;
        }

        Post sponsored = new Post("[Sponsored] " + content);

        sponsored.next = current.next;
        sponsored.prev = current;

        if (current.next != null) {
            current.next.prev = sponsored;
        }

        current.next = sponsored;

        System.out.println("Sponsored post inserted");
    }

   
    public void displayFeed() {
        Post temp = head;

        System.out.println("\nFeed:");

        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
}

public class dllmain {
    public static void main(String[] args) {

        SocialMediaFeed feed = new SocialMediaFeed();

        feed.addPost("Lahari uploaded a new photo");
        feed.addPost("Friend liked your post");
        feed.addPost("New Java tutorial available");

        feed.displayFeed();

        System.out.println("\nViewing Posts");
        feed.showCurrentPost();

        feed.nextPost();
        feed.nextPost();

        System.out.println("\nInsert Sponsored Post");
        feed.insertSponsoredPost("Buy Premium Membership");

        feed.displayFeed();

        System.out.println("\nDelete Current Post");
        feed.deleteCurrentPost();

        feed.displayFeed();

        System.out.println("\nMove Previous");
        feed.previousPost();
    }
}