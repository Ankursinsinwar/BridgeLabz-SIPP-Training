package LinkedListProblems;

import java.util.ArrayList;
import java.util.List;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class FriendList {
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode current = head;
            while (current.next != null) current = current.next;
            current.next = newUser;
        }
    }

    public UserNode searchById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) return current;
            current = current.next;
        }
        return null;
    }

    public UserNode searchByName(String name) {
        UserNode current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) return current;
            current = current.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
        if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);
        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove((Integer) userId2);
            user2.friendIds.remove((Integer) userId1);
            System.out.println("\nFriend connection removed between " + user1.name + " and " + user2.name);
        }
    }

    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user == null) {
            System.out.println("\nUser not found.");
            return;
        }
        System.out.println("\nFriends of " + user.name + ":");
        for (int fid : user.friendIds) {
            UserNode friend = searchById(fid);
            if (friend != null) System.out.println(" - " + friend.name + " (ID: " + fid + ")");
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = searchById(userId1);
        UserNode user2 = searchById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("\nOne or both users not found.");
            return;
        }

        System.out.println("\nMutual friends between " + user1.name + " and " + user2.name + ":");
        for (int fid : user1.friendIds) {
            if (user2.friendIds.contains(fid)) {
                UserNode mutual = searchById(fid);
                if (mutual != null) {
                    System.out.println(" - " + mutual.name + " (ID: " + fid + ")");
                }
            }
        }
    }

    public void countFriends() {
        UserNode current = head;
        System.out.println();
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friend(s).");
            current = current.next;
        }
    }

    public void displayAllUsers() {
        UserNode current = head;
        while (current != null) {
            System.out.println("User: " + current.name + ", ID: " + current.userId + ", Age: " + current.age);
            current = current.next;
        }
    }
}

public class SocialMediaFriends {
    public static void main(String[] args) {
        FriendList network = new FriendList();

        // Adding users
        network.addUser(1, "Ankur", 25);
        network.addUser(2, "Tushar", 28);
        network.addUser(3, "Tarun", 22);
        network.addUser(4, "David", 30);

        // Adding friend connections
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        network.addFriend(3, 4);

        // Display friends
        network.displayFriends(1);
        network.displayFriends(4);

        // Mutual friends
        network.findMutualFriends(1, 2);
        network.findMutualFriends(1, 4);

        // Remove a friend
        network.removeFriend(1, 3);

        // Search
        UserNode found = network.searchByName("Charlie");
        if (found != null)
            System.out.println("Found user by name: " + found.name + ", ID: " + found.userId);

        // Count friends
        network.countFriends();
    }
}
