package com.palette.model;

import java.util.HashMap;

public class AdminstatisticsDto {

    //for Gender Rate count
    private int ManCount;
    private int WomanCount;
    

    //InterBig count
    private HashMap<String, String> HashInterBig;
    
    //Inter Samll Count
    private HashMap<String, String> HashInterSmall;

    // //InterBig count
    // private HashMap<String, String> HashInterBig = new HashMap<String, String>();
    
    // //Inter Samll Count
    // private HashMap<String, String> HashInterSmall  = new HashMap<String, String>();


    public AdminstatisticsDto(){

    }


    public AdminstatisticsDto(int manCount, int womanCount, HashMap<String, String> hashInterBig,
            HashMap<String, String> hashInterSmall) {
        ManCount = manCount;
        WomanCount = womanCount;
        HashInterBig = hashInterBig;
        HashInterSmall = hashInterSmall;
    }


    public AdminstatisticsDto(int manCount, int womanCount) {
        ManCount = manCount;
        WomanCount = womanCount;
    }

    public AdminstatisticsDto(HashMap<String, String> hashInterBig, HashMap<String, String> hashInterSmall) {
		HashInterBig = hashInterBig;
		HashInterSmall = hashInterSmall;
	}



    public int getManCount() {
        return ManCount;
    }

    public void setManCount(int manCount) {
        ManCount = manCount;
    }

    public int getWomanCount() {
        return WomanCount;
    }

    public void setWomanCount(int womanCount) {
        WomanCount = womanCount;
    }

    public HashMap<String, String> getHashInterBig() {
        return HashInterBig;
    }

    public void setHashInterBig(HashMap<String, String> hashInterBig) {
        HashInterBig = hashInterBig;
    }

    public HashMap<String, String> getHashInterSmall() {
        return HashInterSmall;
    }

    public void setHashInterSmall(HashMap<String, String> hashInterSmall) {
        HashInterSmall = hashInterSmall;
    }

    @Override
    public String toString() {
        return "AdminstatisticsDto [HashInterBig=" + HashInterBig + ", HashInterSmall=" + HashInterSmall + ", ManCount="
                + ManCount + ", WomanCount=" + WomanCount + "]";
    }



    


}// end of AdminstatisticsDto class