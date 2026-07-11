package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i2, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        boolean z2 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzgdVar.zzh().zza((String) objZza);
                }
                zzge zzgeVarZzc = zzgdVar.zzc();
                try {
                    zzgc.zza(objZza);
                } catch (zzce e2) {
                    if (e2.zzb() == 8 || e2.zzb() == 6) {
                        z2 = false;
                    } else if (e2.zzb() != 47) {
                        throw e2;
                    }
                }
                zzgeVarZzc.zze(i2, Boolean.valueOf(z2));
            } catch (zzce e3) {
                throw e3;
            }
        } catch (Exception e4) {
            throw new zzce(6, 8, e4);
        }
    }
}
