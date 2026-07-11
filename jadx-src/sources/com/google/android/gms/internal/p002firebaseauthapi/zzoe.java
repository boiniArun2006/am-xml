package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzoe extends zzbm {
    private final zzqe zza;
    private final zzaae zzb;

    private static class zza extends zzce {
        private final String zza;
        private final zzxu zzb;

        private zza(String str, zzxu zzxuVar) {
            this.zza = str;
            this.zzb = zzxuVar;
        }

        public final String toString() {
            String str = this.zza;
            int i2 = zzog.zza[this.zzb.ordinal()];
            return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
        public final boolean zza() {
            return this.zzb != zzxu.RAW;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final zzce zza() {
        return new zza(this.zza.zzf(), this.zza.zzc());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaae zzc() {
        return this.zzb;
    }

    public zzoe(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        zzaae zzaaeVarZza;
        zza(zzqeVar, zzckVar);
        this.zza = zzqeVar;
        if (zzqeVar.zzc().equals(zzxu.RAW)) {
            zzaaeVarZza = zzaae.zza(new byte[0]);
        } else if (zzqeVar.zzc().equals(zzxu.TINK)) {
            zzaaeVarZza = zzpd.zzb(zzqeVar.zze().intValue());
        } else {
            if (!zzqeVar.zzc().equals(zzxu.LEGACY) && !zzqeVar.zzc().equals(zzxu.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            zzaaeVarZza = zzpd.zza(zzqeVar.zze().intValue());
        }
        this.zzb = zzaaeVarZza;
    }

    public final zzqe zza(zzck zzckVar) throws GeneralSecurityException {
        zza(this.zza, zzckVar);
        return this.zza;
    }

    private static void zza(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        int i2 = zzog.zzb[zzqeVar.zza().ordinal()];
        if (i2 == 1 || i2 == 2) {
            zzck.zza(zzckVar);
        }
    }
}
