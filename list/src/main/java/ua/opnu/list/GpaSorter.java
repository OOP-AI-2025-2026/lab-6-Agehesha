package ua.opnu.list;

import java.util.Comparator;


public final class GpaSorter implements Comparator {
    private final boolean order;

    public GpaSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student) || !(o2 instanceof Student)) {
            return 0;
        }
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        int base = Double.compare(s1.getAvgMark(), s2.getAvgMark());
        return order ? base : -base;
    }
}
