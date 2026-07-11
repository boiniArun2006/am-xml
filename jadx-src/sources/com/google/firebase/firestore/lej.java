package com.google.firebase.firestore;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double[] f60364n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f60364n, ((lej) obj).f60364n);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f60364n);
    }

    lej(double[] dArr) {
        double[] dArr2;
        if (dArr == null) {
            dArr2 = new double[0];
        } else {
            dArr2 = (double[]) dArr.clone();
        }
        this.f60364n = dArr2;
    }
}
