package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54101d;

    public a(String str, String str2, String str3) {
        String strTrim;
        String strTrim2;
        boolean z2;
        if (str != null) {
            strTrim = str.trim();
        } else {
            strTrim = null;
        }
        this.f54098a = strTrim;
        if (str2 != null) {
            strTrim2 = str2.trim();
        } else {
            strTrim2 = null;
        }
        this.f54099b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f54100c = strTrim3;
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim3) && strTrim3.contains("[TIME]")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f54101d = z2;
    }
}
