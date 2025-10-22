package ua.opnu.list;

import java.util.Comparator;

public final class SurnameSorter implements Comparator {
    private final boolean order;


    public SurnameSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student) || !(o2 instanceof Student)) {
            return 0;
        }
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        String a = s1.getLastName() == null ? "" : s1.getLastName();
        String b = s2.getLastName() == null ? "" : s2.getLastName();

        int base = a.compareToIgnoreCase(b);
        return order ? base : -base;
    }
}
