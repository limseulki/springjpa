package com.sparta.springjpa;

public class A {
    private B b;

    // 1. 직접 객체를 생성하여 코드를 제어
    public A() {
        this.b = new B();
    }

    // 2. 제어의 역전 - 외부로부터 B를 인자로 받아 초기화. 프로그램의 제어의 흐름을 외부에서 관리
    public A(B b) {
        this.b = b;
    }
}
