package Heaps;

import java.util.PriorityQueue;

public class PriorityQForObject {
    // Inner Student class
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Compare only by rank
        @Override
        public int compareTo(Student other) {
            return this.rank - other.rank; // smaller rank = higher priority
        }

        @Override
        public String toString() {
            return name + " (Rank: " + rank + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Alice", 3));
        pq.add(new Student("Bob", 1));
        pq.add(new Student("Charlie", 2));
        pq.add(new Student("David", 5));
        pq.add(new Student("Eve", 4));

        System.out.println("Students by priority (based on rank):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
    
}
