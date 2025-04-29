package song;

public final class Band implements Artist {
    private final String name;
    private final String country;
    private final int memberCount;

    public Band(String name, String country, int memberCount) {
        this.name = name;
        this.country = country;
        this.memberCount = memberCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }~

    public int getMemberCount() {
        return memberCount;
    }

    @Override
    public String getArtistType() {
        return "Band with " + memberCount + " members";
    }
}