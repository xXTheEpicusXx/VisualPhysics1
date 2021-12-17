package com.example.visualphysics;

public class PhysicsModel {
    double x, y, v, a, m, f;
    public PhysicsModel(double x, double y, double v, double a, double m) {
        this.x = x; //координата x
        this.y = y; //координата y
        this.v = v; //скорость(меняется при a != 0)
        this.a = a; //ускорение(постоянное)
        this.m = m; //масса тела
        this.f = f; //угол наклона между вектором направления движения и осью x
    }
    //изменение скорости(нужно потом разделить скорость на vx и vy)
    public double ChangeVelocity(double v) {
        v = v + a;
        return v;
    }

    public double ChangeLocationX() {
        x = x + v * Math.cos(f);
        return x;
    }

    public double ChangeLocationY() {
        y = y + v * Math.sin(f);
        return y;
    }
}
