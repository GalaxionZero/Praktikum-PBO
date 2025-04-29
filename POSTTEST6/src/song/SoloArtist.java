package song;

public final class SoloArtist implements Artist {
    private final String name;
    private final String country;
    private final String realName;

    public SoloArtist(String name, String country, String realName) {
        this.name = name;
        this.country = country;
        this.realName = realName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String getArtistType() {
        return "Solo Artist (Real Name: " + realName + ")";
    }
}