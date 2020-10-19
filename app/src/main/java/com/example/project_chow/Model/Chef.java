package com.example.project_chow.Model;

import android.media.Image;
public class Chef {
    private String Name, Image, Description, MenuId;
    public Chef() {
    }
    public Chef(String name, String image, String description, String menuId) {
        Name = name;
        Image = image;
        Description = description;
        MenuId = menuId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getImage() {
        return Image;
    }
    public void setImage(String image) {
        Image = image;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getMenuId() {
        return MenuId;
    }
    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}