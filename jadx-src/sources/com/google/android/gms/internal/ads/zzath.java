package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzath extends zzijr implements Closeable {
    @Override // com.google.android.gms.internal.ads.zzijr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    static {
        zzijy.zzb(zzath.class);
    }

    @Override // com.google.android.gms.internal.ads.zzijr
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) throws IOException {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }
}
