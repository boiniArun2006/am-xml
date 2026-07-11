package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzgqq implements zzgrd {
    protected zzgqq() {
    }

    public static zzgqq zzc(char c2) {
        return new zzgqn(c2);
    }

    public abstract boolean zzb(char c2);

    @Override // com.google.android.gms.internal.ads.zzgrd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }
}
