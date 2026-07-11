package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import com.google.android.gms.internal.p002firebaseauthapi.zzxf;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzcl {
    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static zzxf zza(zzxc zzxcVar) {
        zzxf.zzb zzbVarZza = zzxf.zza().zza(zzxcVar.zzb());
        for (zzxc.zza zzaVar : zzxcVar.zze()) {
            zzbVarZza.zza((zzxf.zza) ((zzaky) zzxf.zza.zza().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zze()));
        }
        return (zzxf) ((zzaky) zzbVarZza.zze());
    }

    public static void zzb(zzxc zzxcVar) throws GeneralSecurityException {
        int iZzb = zzxcVar.zzb();
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (zzxc.zza zzaVar : zzxcVar.zze()) {
            if (zzaVar.zzc() == zzwt.ENABLED) {
                if (zzaVar.e_()) {
                    if (zzaVar.zzf() != zzxu.UNKNOWN_PREFIX) {
                        if (zzaVar.zzc() != zzwt.UNKNOWN_STATUS) {
                            if (zzaVar.zza() == iZzb) {
                                if (!z2) {
                                    z2 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzaVar.zzb().zzb() != zzws.zza.ASYMMETRIC_PUBLIC) {
                                z3 = false;
                            }
                            i2++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
            }
        }
        if (i2 != 0) {
            if (!z2 && !z3) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
