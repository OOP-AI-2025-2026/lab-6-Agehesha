
package org.example.list;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public final class ControllerFragment {
    private boolean ascendingByName = true;
    private boolean ascendingBySurname = true;
    private boolean ascendingByGpa = true;

    private final JButton btnSortByName;
    private final JButton btnSortBySurname;
    private final JButton btnSortByGpa;
    private final List<Student> model;
    private final Runnable refreshTable;

    public ControllerFragment(JButton btnSortByName,
                              JButton btnSortBySurname,
                              JButton btnSortByGpa,
                              List<Student> model,
                              Runnable refreshTable) {
        this.btnSortByName = btnSortByName;
        this.btnSortBySurname = btnSortBySurname;
        this.btnSortByGpa = btnSortByGpa;
        this.model = model;
        this.refreshTable = refreshTable;
        bind();
    }

    private void bind() {
        btnSortByName.addActionListener(e -> {
            Collections.sort(model, new NameSorter());
            if (!ascendingByName) Collections.reverse(model);
            ascendingByName = !ascendingByName;
            refreshTable.run();
        });

        btnSortBySurname.addActionListener(e -> {
            Collections.sort(model, new SurnameSorter());
            if (!ascendingBySurname) Collections.reverse(model);
            ascendingBySurname = !ascendingBySurname;
            refreshTable.run();
        });

        btnSortByGpa.addActionListener(e -> {
            Collections.sort(model, new GpaSorter());
            if (!ascendingByGpa) Collections.reverse(model);
            ascendingByGpa = !ascendingByGpa;
            refreshTable.run();
        });
    }
}
