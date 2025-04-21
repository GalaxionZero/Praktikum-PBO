package song;

public abstract class Artist {
    private final String name;
    private final String country;

    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public abstract String getArtistType();
}