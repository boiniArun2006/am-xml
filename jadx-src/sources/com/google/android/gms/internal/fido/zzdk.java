package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzdk(String str, Class cls, boolean z2) {
        this(str, cls, z2, true);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z2, boolean z3) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z2;
        System.identityHashCode(this);
        for (int i2 = 0; i2 < 5; i2++) {
        }
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        return getClass().getName() + "/" + this.zza + "[" + cls.getName() + "]";
    }
}
