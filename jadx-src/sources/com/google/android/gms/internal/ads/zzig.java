package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i2, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21 + String.valueOf(i3).length() + 1);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i3);
        sb.append(")");
        super(sb.toString());
    }
}
