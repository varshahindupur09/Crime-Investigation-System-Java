/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class Television {
    
    private String channelId;
    private String channelName;
    private String newsId;
    private String newsReportingTime;
    private String newsReporterName;
    
    @Override
    public String toString() {
        return channelId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getNewsReportingTime() {
        return newsReportingTime;
    }

    public void setNewsReportingTime(String newsReportingTime) {
        this.newsReportingTime = newsReportingTime;
    }

    public String getNewsReporterName() {
        return newsReporterName;
    }

    public void setNewsReporterName(String newsReporterName) {
        this.newsReporterName = newsReporterName;
    }
    
    
    
}
