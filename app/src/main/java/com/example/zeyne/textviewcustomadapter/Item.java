package com.example.zeyne.textviewcustomadapter;

public class Item {
    private int id;
    private String groupname;
    private String valuename;


    public Item(int id, String groupname, String valuename) {
        this.id = id;
        this.groupname = groupname;
        this.valuename = valuename;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getValuename() {
        return valuename;
    }

    public void setValuename(String valuename) {
        this.valuename = valuename;
    }
}
