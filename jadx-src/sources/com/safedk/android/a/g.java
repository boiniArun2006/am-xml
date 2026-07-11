package com.safedk.android.a;

import com.safedk.android.utils.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61255e = "POST";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61256f = "PUT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61257g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f61258h = {1000, 2000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f61259d = "ServerUploadFile";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f61260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f61261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f61262k;

    public abstract a a() throws IOException;

    public g(String str, String str2, int i2) {
        this.f61260i = i2;
        this.f61261j = str;
        this.f61262k = str2;
        Logger.d("ServerUploadFile", "object created, File path=", str, ", hash=", str2);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f61263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f61264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f61265c;

        a(String str, int i2, String str2) {
            Logger.d("ServerResponseData", "object created, URL=", str, ", response=", Integer.valueOf(i2), ", file hash=", str2);
            this.f61263a = str;
            this.f61264b = i2;
            this.f61265c = str2;
        }

        public String a() {
            return this.f61263a;
        }

        public int b() {
            return this.f61264b;
        }

        public String c() {
            return this.f61265c;
        }
    }
}
