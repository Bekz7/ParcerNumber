package pl.bekz.parserNumber;

public enum CountryMarkers {
    PL(48),
    DE(49);

    private int prefix;

    CountryMarkers(int prefix) {
        this.prefix = prefix;
    }

    public int getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return "CountryMarkers{" +
                "prefix=" + String.valueOf( prefix ) +
                '}';
    }
}
