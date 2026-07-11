package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmc implements zzbk {
    private zzmc(zzaae zzaaeVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, zzaae zzaaeVar2) {
        zzaaeVar.zzb();
        zzaaeVar2.zzb();
    }

    public static zzbk zza(zzkt zzktVar) throws GeneralSecurityException {
        zzki zzkiVar = (zzki) ((zzlj) zzktVar.zza());
        return new zzmc(zzktVar.zze(), zzmg.zza(zzkiVar.zze()), zzmg.zza(zzkiVar.zzd()), zzmg.zza(zzkiVar.zzb()), zzktVar.zzd());
    }
}
