public class Artist extends Act{
    public Artist(String name, String country){
        super(name, country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist art = (Artist) o;
        return super.getName().equals(art.getName()) && super.getCountry().equals(art.getCountry());
    }
}
