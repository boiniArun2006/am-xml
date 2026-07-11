package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzew extends zzcv {
    private final zzev zza;
    private final zzaae zzb;
    private final Integer zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzev) zza();
    }

    public static zzew zza(zzev zzevVar, Integer num) throws GeneralSecurityException {
        zzaae zzaaeVarZza;
        if (zzevVar.zzb() == zzev.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzaaeVarZza = zzaae.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzevVar.zzb() != zzev.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzevVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzaaeVarZza = zzaae.zza(new byte[0]);
        }
        return new zzew(zzevVar, zzaaeVarZza, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzb;
    }

    private zzew(zzev zzevVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzevVar;
        this.zzb = zzaaeVar;
        this.zzc = num;
    }
}
