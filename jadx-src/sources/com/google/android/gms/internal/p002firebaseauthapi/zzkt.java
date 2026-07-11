package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzkt extends zzll {
    private final zzki zza;
    private final zzaae zzb;
    private final zzaae zzc;
    private final Integer zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzki) zza();
    }

    public static zzkt zza(zzki zzkiVar, zzaae zzaaeVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzaae zzaaeVarZzb;
        zzki.zzf zzfVarZzf = zzkiVar.zzf();
        zzki.zzf zzfVar = zzki.zzf.zzc;
        if (!zzfVarZzf.equals(zzfVar) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzfVarZzf) + " variant.");
        }
        if (zzfVarZzf.equals(zzfVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzki.zzd zzdVarZze = zzkiVar.zze();
        int iZza = zzaaeVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zzdVarZze) + " must be %d, not " + iZza;
        zzki.zzd zzdVar = zzki.zzd.zza;
        if (zzdVarZze == zzdVar) {
            if (iZza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zzdVarZze == zzki.zzd.zzb) {
            if (iZza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zzdVarZze == zzki.zzd.zzc) {
            if (iZza != 133) {
                throw new GeneralSecurityException(String.format(str, Integer.valueOf(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE)));
            }
        } else {
            if (zzdVarZze != zzki.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zzdVarZze));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zzdVarZze == zzdVar || zzdVarZze == zzki.zzd.zzb || zzdVarZze == zzki.zzd.zzc) {
            if (zzdVarZze == zzdVar) {
                curve = zzni.zza.getCurve();
            } else if (zzdVarZze == zzki.zzd.zzb) {
                curve = zzni.zzb.getCurve();
            } else {
                if (zzdVarZze != zzki.zzd.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzdVarZze));
                }
                curve = zzni.zzc.getCurve();
            }
            zzni.zza(zzyz.zza(curve, zzzb.UNCOMPRESSED, zzaaeVar.zzb()), curve);
        }
        zzki.zzf zzfVarZzf2 = zzkiVar.zzf();
        if (zzfVarZzf2 == zzfVar) {
            zzaaeVarZzb = zzpd.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzfVarZzf2));
            }
            if (zzfVarZzf2 == zzki.zzf.zzb) {
                zzaaeVarZzb = zzpd.zza(num.intValue());
            } else {
                if (zzfVarZzf2 != zzki.zzf.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzfVarZzf2));
                }
                zzaaeVarZzb = zzpd.zzb(num.intValue());
            }
        }
        return new zzkt(zzkiVar, zzaaeVar, zzaaeVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzlj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaae zze() {
        return this.zzb;
    }

    private zzkt(zzki zzkiVar, zzaae zzaaeVar, zzaae zzaaeVar2, Integer num) {
        this.zza = zzkiVar;
        this.zzb = zzaaeVar;
        this.zzc = zzaaeVar2;
        this.zzd = num;
    }
}
