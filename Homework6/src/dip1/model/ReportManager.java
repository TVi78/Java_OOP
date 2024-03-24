package Homework6.src.dip1.model;

import java.util.List;

public class ReportManager {

Printable reportable;

public ReportManager(Printable reportable) {
    this.reportable = reportable;
}


public void toOutput(List<ReportItem> items) {
    reportable.output(items);

}

    
}
