package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzwj extends zzaky<zzwj, zza> implements zzame {
    private static final zzwj zzc;
    private static volatile zzamp<zzwj> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public static final class zza extends zzaky.zza<zzwj, zza> implements zzame {
        public final zza zza(zzwb zzwbVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzwbVar);
            return this;
        }

        private zza() {
            super(zzwj.zzc);
        }

        public final zza zza(zzwe zzweVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzweVar);
            return this;
        }

        public final zza zza(zzwd zzwdVar) {
            zzh();
            zzwj.zza((zzwj) this.zza, zzwdVar);
            return this;
        }
    }

    public final zzwb zza() {
        zzwb zzwbVarZza = zzwb.zza(this.zzg);
        return zzwbVarZza == null ? zzwb.UNRECOGNIZED : zzwbVarZza;
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzaky.zza((Class<zzwj>) zzwj.class, zzwjVar);
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzwj zzf() {
        return zzc;
    }

    public final zzwe zzb() {
        zzwe zzweVarZza = zzwe.zza(this.zzf);
        return zzweVarZza == null ? zzwe.UNRECOGNIZED : zzweVarZza;
    }

    public final zzwd zzc() {
        zzwd zzwdVarZza = zzwd.zza(this.zze);
        return zzwdVarZza == null ? zzwd.UNRECOGNIZED : zzwdVarZza;
    }

    private zzwj() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwi.zza[i2 - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwj> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzwj.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzaky.zzc(zzc);
                            zzd = zzcVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    static /* synthetic */ void zza(zzwj zzwjVar, zzwb zzwbVar) {
        zzwjVar.zzg = zzwbVar.zza();
    }

    static /* synthetic */ void zza(zzwj zzwjVar, zzwe zzweVar) {
        zzwjVar.zzf = zzweVar.zza();
    }

    static /* synthetic */ void zza(zzwj zzwjVar, zzwd zzwdVar) {
        zzwjVar.zze = zzwdVar.zza();
    }
}
