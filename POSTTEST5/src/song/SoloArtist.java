package song;

public final class SoloArtist extends Artist {
    private final String realName;

    public SoloArtist(String stageName, String country, String realName) {
        super(stageName, country);
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public final String getArtistType() {
        return "Solo Artist (Real Name: " + this.realName + ")";
    }
}