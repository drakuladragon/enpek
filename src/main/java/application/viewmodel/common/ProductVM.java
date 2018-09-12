package application.viewmodel.common;

public class ProductVM {
    private String url;
    private String link;

    public ProductVM(String url, String link) {
        this.url = url;
        this.link = link;
    }

    public ProductVM() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
