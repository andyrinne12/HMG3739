package com.shutl.model;

public class Quote {
    String pickupPostcode;
    String deliveryPostcode;
    String vehicle;
    Long price;

    public Quote() {
    }

    public Quote(String pickupPostcode, String deliveryPostcode) {
        this.pickupPostcode = pickupPostcode;
        this.deliveryPostcode = deliveryPostcode;
    }

    public Quote(String pickupPostcode, String deliveryPostcode, String vehicle) {
        this.pickupPostcode = pickupPostcode;
        this.deliveryPostcode = deliveryPostcode;
        this.vehicle = vehicle;
    }

    public Quote(String pickupPostcode, String deliveryPostcode, String vehicle, Long price) {
        this.pickupPostcode = pickupPostcode;
        this.deliveryPostcode = deliveryPostcode;
        this.vehicle = vehicle;
        this.price = price;
    }

    public Quote(String pickupPostcode, String deliveryPostcode, Long price) {
        this.pickupPostcode = pickupPostcode;
        this.deliveryPostcode = deliveryPostcode;
        this.price = price;
    }

    public String getPickupPostcode() {
        return pickupPostcode;
    }

    public void setPickupPostcode(String pickupPostcode) {
        this.pickupPostcode = pickupPostcode;
    }

    public String getDeliveryPostcode() {
        return deliveryPostcode;
    }

    public void setDeliveryPostcode(String deliveryPostcode) {
        this.deliveryPostcode = deliveryPostcode;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public double retrieveMarkup() {
        if(vehicle == null){
            return 0;
        }
        switch (vehicle) {
            case "bicycle":
                return 0.10;
            case "motorbike":
                return 0.15;
            case "parcel_car":
                return 0.20;
            case "small_van":
                return 0.30;
            case "large_van":
                return 0.40;
            default:
                return 0;
        }
    }
}
