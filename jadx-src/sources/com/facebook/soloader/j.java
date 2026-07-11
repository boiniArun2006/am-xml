package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j extends ci implements QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f53045n;
    private I28 rl;

    private static File J2(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.ci
    protected void O(int i2) {
        this.rl.O(i2);
    }

    @Override // com.facebook.soloader.ci
    public int nr(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return this.rl.nr(str, i2, threadPolicy);
    }

    @Override // com.facebook.soloader.QJ
    public ci rl(Context context) {
        this.rl = new I28(J2(context), this.f53045n | 1);
        return this;
    }

    @Override // com.facebook.soloader.ci
    public String t() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.ci
    public String toString() {
        return t() + "[" + this.rl.toString() + "]";
    }

    public j(Context context, int i2) {
        this.f53045n = i2;
        this.rl = new I28(J2(context), i2);
    }
}
