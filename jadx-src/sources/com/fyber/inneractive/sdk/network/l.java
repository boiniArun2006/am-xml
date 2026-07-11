package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f54272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f54273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f54274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f54275f = new ArrayList();

    public l() {
    }

    public void a() {
        InputStream inputStream = this.f54272c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l(FilterInputStream filterInputStream, int i2, String str, Map map, String str2) {
        this.f54272c = filterInputStream;
        this.f54270a = i2;
        this.f54271b = str;
        this.f54273d = map;
        this.f54274e = str2;
    }
}
