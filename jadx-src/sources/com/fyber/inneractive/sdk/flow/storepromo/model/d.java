package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53910c;

    public d(String str, String str2, String str3) {
        String str4;
        this.f53910c = "";
        this.f53908a = str;
        this.f53909b = str2;
        h hVar = new h(str3);
        if (hVar.f57001a == null) {
            str4 = "N/A";
        } else {
            double dLongValue = r11.longValue() / 1024.0d;
            double d2 = dLongValue / 1024.0d;
            double d4 = d2 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(hVar.f57001a) + " bytes";
            if (d2 > 850.0d) {
                str4 = decimalFormat.format(d4) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d2) + " MB";
            } else if (hVar.f57001a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f53910c = str4;
    }
}
