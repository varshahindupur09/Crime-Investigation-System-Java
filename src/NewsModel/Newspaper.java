/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class Newspaper {
    
    private String npId;
    private String npName;
    private int npPrice;
    private int npNoOfPages;
    private String npDate;
    private String npPublicationId;

    public String getNpId() {
        return npId;
    }

    public String getNpName() {
        return npName;
    }

    public void setNpName(String npName) {
        this.npName = npName;
    }

    public void setNpId(String npId) {
        this.npId = npId;
    }

    public int getNpPrice() {
        return npPrice;
    }

    public void setNpPrice(int npPrice) {
        this.npPrice = npPrice;
    }

    public int getNpNoOfPages() {
        return npNoOfPages;
    }

    public void setNpNoOfPages(int npNoOfPages) {
        this.npNoOfPages = npNoOfPages;
    }

    public String getNpDate() {
        return npDate;
    }

    public void setNpDate(String npDate) {
        this.npDate = npDate;
    }

    public String getNpPublicationId() {
        return npPublicationId;
    }

    public void setNpPublicationId(String npPublicationId) {
        this.npPublicationId = npPublicationId;
    }
    
    
    
}
