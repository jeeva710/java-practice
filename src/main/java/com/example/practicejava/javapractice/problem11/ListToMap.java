package com.example.practicejava.javapractice.problem11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
    List<Product> productList= Arrays.asList(
      new Product(101,"mobile"),
      new Product(102,"Television"),
      new Product(103,"Washing machine"),
      new Product(104,"Fan")
    );
    Map<Integer,String> mapList=new HashMap<>();
    public void mapProducts(){

        for(Product list:productList){
            mapList.put(list.getId(), list.getName());
        }
    }
    public void printMapProducts(){
        for(Map.Entry<Integer,String> entry:mapList.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
