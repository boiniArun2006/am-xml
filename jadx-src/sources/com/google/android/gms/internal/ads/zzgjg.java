package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 3);
        sb.append("r: ");
        sb.append(i2);
        super(sb.toString());
    }

    public zzgjg(int i2, Throwable th) {
        super("r: 2", th);
    }
}
