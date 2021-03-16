package com.example.tipcal;

public class Tipcal {

    private float tip;
    private float bill;

    public tipCal(float newtip,float newbill)
    {
        if(newtip>0)
        {
            tip=newtip;
        }

    }

    public float getTip() {
        return tip;
    }
    public float getBill(){
        return bill;
    }
    public void setTip(float newtip){
        if(newtip>0)
        {
            tip=newtip;
        }
    }

    public void setBill(float newbill) {
        if(newbill>0)
        {
            bill=newbill;
        }
    }

    public float tipamount()
    {
        return bill*tip;
    }
    public float totalamount()
    {
        return  bill+tipamount();
    }
}
