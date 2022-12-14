package com.z3db0y.davidlib;

import java.util.*;

public class Vector {
    public double X = 0;
    public double Y = 0;
    public double Z = 0;

    public Vector(double X, double Y, double Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    private double radToDeg(double rad) {
        return rad/Math.PI * 180;
    }

    private double degToRad(double deg) {
        return deg * Math.PI/180;
    }

    // Not 100% sure about this one.
    public List<Double> anglesTo(Vector dst) {
        Vector src = this;
        double toX = radToDeg(Math.atan(
            (dst.X - src.X) /
            (dst.Z - src.Z)
        ));
        double toY = radToDeg(Math.atan(
            (dst.Y - src.Y) /
            (dst.Z - src.Z)
        ));
        return Arrays.asList(toX, toY);
    }

    public double distanceTo(Vector dst) {
        return Math.sqrt(Math.pow(dst.X - this.X, 2) + Math.pow(dst.Z - this.Z, 2));
    }
}
