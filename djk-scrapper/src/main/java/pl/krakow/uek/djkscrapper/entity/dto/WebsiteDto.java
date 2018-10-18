package pl.krakow.uek.djkscrapper.entity.dto;

import java.net.URL;

public class WebsiteDto {
    private String url;
    private boolean isMobile;

    public WebsiteDto() { }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public void setMobile(boolean mobile) {
        isMobile = mobile;
    }
}
