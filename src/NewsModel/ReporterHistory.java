/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;

import java.util.ArrayList;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class ReporterHistory {
    
    ArrayList<Reporter> reporterData;
    
    public ReporterHistory() {
        
        this.reporterData = new ArrayList<Reporter>();
    }

    public ArrayList<Reporter> getReporterData() {
        return reporterData;
    }

    public void setReporterData(ArrayList<Reporter> reporterData) {
        this.reporterData = reporterData;
    }
    
    public Reporter addReporter() {

        Reporter newReporterData = new Reporter();
        reporterData.add(newReporterData);
        return newReporterData;

    }
    
    public void deleteReporter(Reporter rp) {
        reporterData.remove(rp);

    }
}
