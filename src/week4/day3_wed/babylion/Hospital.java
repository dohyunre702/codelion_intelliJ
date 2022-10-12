package week4.day3_wed.babylion;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    private void setDistrict() {
        String[] splitted = this.address.split("");
        this.district = splitted[0] + " " + splitted[1];
    }

    public Hospital() {
    };

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
        this.setDistrict();
    }

    public String getDistrict() {
        return null;
    }
}
