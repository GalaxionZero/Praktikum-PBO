package song;

public class SoloArtist extends Artist {
    private String realName;

    public SoloArtist(String stageName, String country, String realName) {
        super(stageName, country);
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String getArtistType() {
        return "Solo Artist (Real Name: " + this.realName + ")";
    }
}