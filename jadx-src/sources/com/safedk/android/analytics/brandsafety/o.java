package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CreativeInfo f62690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f62691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f62692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f62693d;

    public o(CreativeInfo creativeInfo, String str) {
        this(creativeInfo, str, null, null);
    }

    public o(CreativeInfo creativeInfo, String str, String str2) {
        this(creativeInfo, str, str2, null);
    }

    public o(CreativeInfo creativeInfo, String str, String str2, String str3) {
        this.f62690a = creativeInfo;
        this.f62691b = str;
        this.f62692c = str2 == null ? creativeInfo.aa() : str2;
        this.f62693d = str3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(" how ? : ");
        sb.append(this.f62691b);
        if (this.f62692c != null) {
            str = "_" + this.f62692c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", debugInfo : ");
        sb.append(this.f62693d);
        sb.append(", creative info : ");
        sb.append(this.f62690a.ac());
        sb.append(", ci matching object address : ");
        sb.append(this.f62690a.ak());
        return sb.toString();
    }
}
