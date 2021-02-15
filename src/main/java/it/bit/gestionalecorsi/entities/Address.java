package it.bit.gestionalecorsi.entities;


public class Address {

    public enum Region {
        ABRUZZO, BASILICATA, CALABRIA, CAMPANIA,
        EMILIA_ROMAGNA, FRIULI_VENEZIA_GIULIA, LAZIO,
        LIGURIA, LOMBARDIA, MARCHE, MOLISE, PIEMONTE,
        PUGLIA, SARDEGNA, SICILIA, TOSCANA, TRENTINO_ALTO_ADIGE,
        UMBRIA, VALLE_DAOSTA, VENETO
    }

    private String streetAddress;
    private String city;
    private String province;
    private Region region;

    public Address(String streetAddress, String city, String province, Region region) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.region = region;
    }


}
