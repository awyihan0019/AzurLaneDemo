package com.example.azurlanedemo;

/**
 * Created by yihan on 2017/7/26.
 */

public class RowItem {
    private String kantaiName;
    private int kantaiImageID;
    private String shipType;
    private String shipCamp;

    public RowItem(String kantaiName, int kantaiImageID, String shipType, String camp)
    {
        this.kantaiName = kantaiName;
        this.kantaiImageID = kantaiImageID;
        this.shipType = shipType;
        this.shipCamp = camp;
    }

    public String getKantaiName(){return kantaiName;}
    public void setKantaiName(String kantaiName){this.kantaiName = kantaiName;}

    public int getKantaiImageID(){return kantaiImageID;}
    public void setKantaiImageID(int kantaiImageID){this.kantaiImageID = kantaiImageID;}

    public String getShipType(){return shipType;}
    public void setShipType(String shipType){this.shipType = shipType;}

    public String getShipCamp(){return shipCamp;}
    public void setShipCamp(String shipCamp){this.shipCamp = shipCamp;}
}
