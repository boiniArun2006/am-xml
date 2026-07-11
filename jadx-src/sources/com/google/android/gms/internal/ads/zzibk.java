package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzibk implements zzida {
    private static final zzibk zza = new zzibk();

    private zzibk() {
    }

    public static zzibk zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        return zzibr.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        if (!zzibr.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzicz) zzibr.zzbt(cls.asSubclass(zzibr.class)).zzbs();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }
}
