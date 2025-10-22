
package org.example.list;

import java.util.Comparator;

public final class GpaSorter implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        if (!(a instanceof Student) || !(b instanceof Student)) return 0;
        Student s1 = (Student) a;
        Student s2 = (Student) b;
        double d = s1.getGpa() - s2.getGpa();
        return d == 0 ? 0 : (d < 0 ? -1 : 1);
    }
}
