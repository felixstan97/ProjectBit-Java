package it.bit.gestionalecorsi.entities;


public class Address {

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
