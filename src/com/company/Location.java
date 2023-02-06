package com.company;

public class Location {

    String coordinateX;
    String coordinateY;
    String city;
    String address;
    String postalCode;

    public Location(String coordinateX, String coordinateY, String address) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
