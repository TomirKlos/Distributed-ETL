package pl.krakow.uek.djkentrydataproducer.entity;

import java.net.URL;

public class Website {

    private URL url;
    private boolean isMobile;

    public Website(URL url, boolean isMobile) {
        this.url = url;
        this.isMobile = isMobile;
    }

    public Website() {
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public void setMobile(boolean mobile) {
        this.isMobile = mobile;
    }
}
