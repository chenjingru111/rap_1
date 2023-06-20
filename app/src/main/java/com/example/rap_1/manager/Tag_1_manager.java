package com.example.rap_1.manager;

import com.example.rap_1.create.Adj_human;
import com.example.rap_1.create.Character;
import com.example.rap_1.create.Country_1;
import com.example.rap_1.create.Space;
import com.example.rap_1.create.V;

public class Tag_1_manager {
    public static String getTag_1(){
        String countryName_1 = Country_1.getCountryName();//芬兰
        String adj = Adj_human.getAdj();//无聊
        String character = Character.getCharacter();//王子
        String v = V.getV();//游荡
        String countryName_2 = Country_1.getCountryName();//几内亚
        String space = Space.getSpace();//购物中心
        String ture_1=countryName_1+adj+character+v+countryName_2+space;
        return ture_1;
    }
}
