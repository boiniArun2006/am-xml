package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62542e = "ClickUrlCandidate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f62544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f62546d;

    public h(long j2, String str, String str2, String str3) {
        this.f62543a = 0L;
        this.f62546d = null;
        Logger.d(f62542e, "click url candidate, currentTime=", Long.valueOf(j2), ", clickUrl=", str, ", ");
        this.f62543a = j2;
        this.f62544b = str;
        this.f62545c = str2;
        this.f62546d = str3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ClickUrlCandidate{ ");
        sb.append(this.f62545c);
        sb.append(", ");
        sb.append(this.f62543a);
        sb.append(", ");
        sb.append(this.f62545c);
        if (this.f62546d != null) {
            str = ", tag :" + this.f62546d;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" }");
        return sb.toString();
    }
}
