public class LegoItem {

    private String item_number;
    private String name;
    private String year;
    private String theme;
    private String subtheme;
    private String pieces;
    private String minifigures;
    private String image_url;
    private String gbp_msrp;
    private String usd_msrp;
    private String cad_msrp;
    private String eur_msrp;
    private String packaging;
    private String availability;

    public LegoItem(String item_number, String name, String year, String theme, String subtheme, String pieces, String minifigures,
                    String image_url, String gbp_msrp, String usd_msrp, String cad_msrp, String eur_msrp, String packaging,
                    String availability){

        this.item_number = item_number;
        this.name = name;
        this.year = year;
        this.theme = theme;
        this.subtheme = subtheme;
        this.pieces = pieces;
        this.minifigures = minifigures;
        this.image_url = image_url;
        this.gbp_msrp = gbp_msrp;
        this.usd_msrp = usd_msrp;
        this.cad_msrp = cad_msrp;
        this.eur_msrp = eur_msrp;
        this.packaging = packaging;
        this.availability = availability;
    }

    public String getItem_number() {
        return item_number;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getTheme() {
        return theme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public String getPieces() {
        return pieces;
    }

    public String getMinifigures() {
        return minifigures;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getGbp_msrp() {
        return gbp_msrp;
    }

    public String getUsd_msrp() {
        return usd_msrp;
    }

    public String getCad_msrp() {
        return cad_msrp;
    }

    public String getEur_msrp() {
        return eur_msrp;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getAvailability() {
        return availability;
    }
}
