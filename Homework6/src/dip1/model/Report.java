package Homework6.src.dip1.model;

import java.util.ArrayList;
import java.util.List;


public class Report {
    private List<ReportItem> items;	// report data

    public List<ReportItem> getItems() {
        return items;
    }

    // calculate report data
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    
}
