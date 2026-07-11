package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f62709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f62710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f62712d;

    public v(Long l2, Long l5, String str, String str2) {
        this.f62709a = l2;
        this.f62710b = l5;
        this.f62711c = str;
        this.f62712d = str2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TouchEventDetails{ ");
        sb.append(this.f62709a);
        sb.append(", ");
        sb.append(this.f62710b);
        sb.append(", ");
        sb.append(this.f62711c);
        if (this.f62712d != null) {
            str = ", tag :" + this.f62712d;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" }");
        return sb.toString();
    }
}
