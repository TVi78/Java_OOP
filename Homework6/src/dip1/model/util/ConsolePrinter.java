package Homework6.src.dip1.model.util;

import java.util.List;

import Homework6.src.dip1.model.ReportItem;
import Homework6.src.dip1.model.Printable;

public class ConsolePrinter implements Printable{

    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("Print to console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }  
}
