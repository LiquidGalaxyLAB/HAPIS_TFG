package mihaela.claudia.diosan.hapis_tfg.intro;

public class ScreenItem {

    private String title, description;
    private int screenImg;

    ScreenItem(String title, String description, int screenImg) {
        this.title = title;
        this.description = description;
        this.screenImg = screenImg;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    String getDescription() {
        return description;
    }

    int getScreenImg() {
        return screenImg;
    }

}
