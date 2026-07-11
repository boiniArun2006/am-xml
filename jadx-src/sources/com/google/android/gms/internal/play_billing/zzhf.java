package com.google.android.gms.internal.play_billing;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzhf implements zzik {
    private static final zzhf zza = new zzhf();

    private zzhf() {
    }

    public static zzhf zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final zzij zzb(Class cls) {
        if (!zzhk.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(YmsTEL.TxEirdfpRClfuNH.concat(cls.getName()));
        }
        try {
            return (zzij) zzhk.zzo(cls.asSubclass(zzhk.class)).zzd(3, null, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final boolean zzc(Class cls) {
        return zzhk.class.isAssignableFrom(cls);
    }
}
