package com.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by erhu on 2016/9/22.
 */
public class MyObject extends Object implements Serializable {

    static ObjectMapper mapper = new ObjectMapper();
    static XmlMapper xmlMapper = new XmlMapper();

    public JsonNode toJsonNode(){
        JsonNode jsonNode = null;
        try {
            if(!toJson().trim().equalsIgnoreCase("")) jsonNode = mapper.readTree(toJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNode;
    }

    public String toJson(){
        try {
            return mapper.writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String toString(){
        return toJson();
    }

    public static String mapToJsonStr(Map<String,String> map){
        try {
            String res = mapper.writeValueAsString(map);
            return res;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static <T> T toBean(String jsonStr,Class<T> clas){
        try {
           return mapper.readValue(jsonStr,clas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toXml(Object o){
        try {
            return xmlMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }



}
