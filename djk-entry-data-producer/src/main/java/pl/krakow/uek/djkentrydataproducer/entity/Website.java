package pl.krakow.uek.djkentrydataproducer.entity;

import java.net.URL;

public class Website {

    private String url;
    private boolean isMobile;

    public Website(String url, boolean isMobile) {
        this.url = url;
        this.isMobile = isMobile;
    }

    public Website() {
    }

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
        this.isMobile = mobile;
    }
}
