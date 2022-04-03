package com.example.artcasper;

public class RoomData {
    private String roomtype;
    private String roomdetail;

    public RoomData(String roomtype, String roomdetail) {
        this.roomtype = roomtype;
        this.roomdetail = roomdetail;
    }

    public String getRoomType() {
        return roomtype;
    }

    public void setRoomType(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomDetail() {
        return roomdetail;
    }

    public void setRoomDetail(String roomdetail) {
        this.roomdetail = roomdetail;
    }
}
