package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f52438n;

    public static synchronized void n() {
        if (!f52438n) {
            y5Y.j.nr("native-imagetranscoder");
            f52438n = true;
        }
    }
}
