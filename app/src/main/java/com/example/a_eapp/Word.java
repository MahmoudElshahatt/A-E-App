package com.example.a_eapp;

public class Word {
    private String arabicword;
    private String Difualtword;
    private int imageresource;
    public Word(String aword,String dword)
    {
        arabicword=aword;
        Difualtword=dword;
    }
    public Word(String aword,String dword,int is)
    {
        arabicword=aword;
        Difualtword=dword;
        imageresource=is;
    }

    //getter methods
    public String getArabicword()
    { return arabicword;}

    public String getDifualtword()
    {return Difualtword;}


    public int getimageresorce()
    {return imageresource;}


}
