
package org.example.list;

import java.util.Comparator;

public final class SurnameSorter implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        if (!(a instanceof Student) || !(b instanceof Student)) return 0;
        Student s1 = (Student) a;
        Student s2 = (Student) b;
        String x = s1.getSurname() == null ? "" : s1.getSurname();
        String y = s2.getSurname() == null ? "" : s2.getSurname();
        return x.compareToIgnoreCase(y);
    }
}
