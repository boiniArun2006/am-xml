package com.google.firebase.firestore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class QJ implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f60339n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f60340t;

    public boolean equals(Object obj) {
        if (!(obj instanceof QJ)) {
            return false;
        }
        QJ qj = (QJ) obj;
        return this.f60339n == qj.f60339n && this.f60340t == qj.f60340t;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f60339n);
        int i2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f60340t);
        return (i2 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(QJ qj) {
        int iMUb = wqP.Z.mUb(this.f60339n, qj.f60339n);
        return iMUb == 0 ? wqP.Z.mUb(this.f60340t, qj.f60340t) : iMUb;
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f60339n + ", longitude=" + this.f60340t + " }";
    }

    public QJ(double d2, double d4) {
        if (!Double.isNaN(d2) && d2 >= -90.0d && d2 <= 90.0d) {
            if (!Double.isNaN(d4) && d4 >= -180.0d && d4 <= 180.0d) {
                this.f60339n = d2;
                this.f60340t = d4;
                return;
            }
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
    }
}
