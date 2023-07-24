package com.sparta.springjpa.italian1;

public class ItalianBMT {
    WhiteBread whiteBread;
    MozzarellaCheese mozzarellaCheese;
    ChiliSauce chiliSauce;
    RanchSauce ranchSauce;

    // 재료에 대한 제어권이 ItalianBMT에 있음
    public ItalianBMT() {
        this.whiteBread = new WhiteBread();
        this.mozzarellaCheese = new MozzarellaCheese();
        this.chiliSauce = new ChiliSauce();
        this.ranchSauce = new RanchSauce();
    }
}
