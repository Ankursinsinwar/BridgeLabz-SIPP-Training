package Java_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;

public class InsurancePolicyManagementSystem {
    static HashMap<String, Policy> policyMap = new HashMap<>();
    static LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    static TreeMap<LocalDate, List<Policy>> expirySortedMap = new TreeMap<>();

    public static void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);

        expirySortedMap
            .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
            .add(policy);
    }

    public static Policy getPolicyByNumber(String number) {
        return policyMap.get(number);
    }

    public static void listPoliciesExpiringInNext30Days() {
        LocalDate today = LocalDate.now();
        LocalDate next30 = today.plusDays(30);
        System.out.println("\nPolicies expiring in next 30 days : ");
        expirySortedMap.subMap(today, true, next30, true)
            .values().stream()
            .flatMap(List::stream)
            .forEach(System.out::println);
    }

    public static void listPoliciesByHolder(String name) {
        System.out.println("\nPolicies for holder : " + name);
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(name)) {
                System.out.println(policy);
            }
        }
    }

    public static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Policy> entry = it.next();
            if (entry.getValue().getExpiryDate().isBefore(today)) {
                it.remove();
                insertionOrderMap.remove(entry.getKey());

                // Also remove from TreeMap
                LocalDate expDate = entry.getValue().getExpiryDate();
                List<Policy> list = expirySortedMap.get(expDate);
                if (list != null) {
                    list.remove(entry.getValue());
                    if (list.isEmpty()) expirySortedMap.remove(expDate);
                }
            }
        }
        System.out.println("\nExpired policies removed.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter number of policies : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Policy Number : ");
            String number = sc.nextLine();

            System.out.print("Enter Policyholder Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Expiry Date (yyyy-MM-dd) : ");
            LocalDate expiry = LocalDate.parse(sc.nextLine(), formatter);

            Policy policy = new Policy(number, name, expiry);
            addPolicy(policy);
        }

        System.out.print("\nEnter policy number to retrieve : ");
        String queryNumber = sc.nextLine();
        Policy found = getPolicyByNumber(queryNumber);
        System.out.println(found != null ? found : "Policy not found");

        listPoliciesExpiringInNext30Days();

        System.out.print("\nEnter policyholder name to list policies : ");
        String holder = sc.nextLine();
        listPoliciesByHolder(holder);

        removeExpiredPolicies();

        System.out.println("\nRemaining policies : ");
        for (Policy p : policyMap.values()) {
            System.out.println(p);
        }
        sc.close();
    }
}