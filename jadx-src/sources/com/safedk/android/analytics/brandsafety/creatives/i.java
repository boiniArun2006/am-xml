package com.safedk.android.analytics.brandsafety.creatives;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62411b = "VastAdTagUri";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f62412a;

    public i(String str) {
        this.f62412a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return obj.equals(this.f62412a);
        }
        String str = this.f62412a;
        return (str == null || obj == null || !str.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int iIndexOf;
        String str = this.f62412a;
        if (str != null && (iIndexOf = str.indexOf("//")) >= 0) {
            int i2 = iIndexOf + 2;
            int iIndexOf2 = this.f62412a.indexOf("/", i2);
            if (iIndexOf2 < 0) {
                iIndexOf2 = this.f62412a.length();
            }
            return this.f62412a.substring(i2, iIndexOf2).hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.f62412a;
    }
}
