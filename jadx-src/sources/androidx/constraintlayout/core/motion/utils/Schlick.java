package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Schlick extends Easing {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    double f35293O;
    double nr;

    private double O(double d2) {
        double d4 = this.f35293O;
        return d2 < d4 ? (d4 * d2) / (d2 + (this.nr * (d4 - d2))) : ((1.0d - d4) * (d2 - 1.0d)) / ((1.0d - d2) - (this.nr * (d4 - d2)));
    }

    private double nr(double d2) {
        double d4 = this.f35293O;
        if (d2 < d4) {
            double d5 = this.nr;
            return ((d5 * d4) * d4) / ((((d4 - d2) * d5) + d2) * ((d5 * (d4 - d2)) + d2));
        }
        double d6 = this.nr;
        return (((d4 - 1.0d) * d6) * (d4 - 1.0d)) / (((((-d6) * (d4 - d2)) - d2) + 1.0d) * ((((-d6) * (d4 - d2)) - d2) + 1.0d));
    }

    Schlick(String str) {
        this.f35265n = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.nr = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i2 = iIndexOf2 + 1;
        this.f35293O = Double.parseDouble(str.substring(i2, str.indexOf(44, i2)).trim());
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double n(double d2) {
        return O(d2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double rl(double d2) {
        return nr(d2);
    }
}
