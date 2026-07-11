package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzakp implements zzagc {
    public static final zzakp zza = new zzakp(true);
    public static final zzakp zzb = new zzakp(false);
    public final boolean zzc;

    private zzakp(boolean z2) {
        this.zzc = z2;
    }

    public final String toString() {
        boolean z2 = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
