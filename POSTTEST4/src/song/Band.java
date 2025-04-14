package song;

public class Band extends Artist {
    private int memberCount;

    public Band(String bandName, String country, int memberCount) {
        super(bandName, country);
        this.memberCount = memberCount;
    }

    public int getMemberCount() {
        return memberCount;
    }

    @Override
    public String getArtistType() {
        return "Band with " + this.memberCount + " members";
    }
}