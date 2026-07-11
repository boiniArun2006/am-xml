package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Easing {
    static Easing rl = new Easing();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String[] f35264t = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f35265n = "identity";

    static class CubicEasing extends Easing {
        private static double KN = 0.01d;
        private static double xMQ = 1.0E-4d;
        double J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        double f35266O;
        double Uo;
        double nr;

        private double O(double d2) {
            double d4 = 1.0d - d2;
            double d5 = 3.0d * d4;
            return (this.f35266O * d4 * d5 * d2) + (this.Uo * d5 * d2 * d2) + (d2 * d2 * d2);
        }

        private double nr(double d2) {
            double d4 = 1.0d - d2;
            double d5 = 3.0d * d4;
            return (this.nr * d4 * d5 * d2) + (this.J2 * d5 * d2 * d2) + (d2 * d2 * d2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double n(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double d4 = 0.5d;
            double d5 = 0.5d;
            while (d4 > KN) {
                d4 *= 0.5d;
                d5 = nr(d5) < d2 ? d5 + d4 : d5 - d4;
            }
            double d6 = d5 - d4;
            double dNr = nr(d6);
            double d7 = d5 + d4;
            double dNr2 = nr(d7);
            double dO = O(d6);
            return (((O(d7) - dO) * (d2 - dNr)) / (dNr2 - dNr)) + dO;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double rl(double d2) {
            double d4 = 0.5d;
            double d5 = 0.5d;
            while (d4 > xMQ) {
                d4 *= 0.5d;
                d5 = nr(d5) < d2 ? d5 + d4 : d5 - d4;
            }
            double d6 = d5 - d4;
            double d7 = d5 + d4;
            return (O(d7) - O(d6)) / (nr(d7) - nr(d6));
        }

        CubicEasing(String str) {
            this.f35265n = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.nr = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i2 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i2);
            this.f35266O = Double.parseDouble(str.substring(i2, iIndexOf3).trim());
            int i3 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i3);
            this.J2 = Double.parseDouble(str.substring(i3, iIndexOf4).trim());
            int i5 = iIndexOf4 + 1;
            this.Uo = Double.parseDouble(str.substring(i5, str.indexOf(41, i5)).trim());
        }
    }

    public double n(double d2) {
        return d2;
    }

    public double rl(double d2) {
        return 1.0d;
    }

    public static Easing t(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        switch (str) {
            case "accelerate":
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f35264t));
                return rl;
        }
    }

    public String toString() {
        return this.f35265n;
    }
}
