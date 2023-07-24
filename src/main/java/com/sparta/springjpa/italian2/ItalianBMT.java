package com.sparta.springjpa.italian2;

import java.util.List;

public class ItalianBMT {
    Bread bread;
    Cheese cheese;
    List<Sauce> sauces;

    // 재료에 대한 제어권이 외부에 있음
    // 역할과 관심을 분리해 응집도를 높이고 결합도를 낮추어 변경에 유연한 코드를 작성할 수 있음
    public ItalianBMT(Bread bread, Cheese cheese, List<Sauce> sauces) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauces = sauces;
    }
}
