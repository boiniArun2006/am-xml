package com.google.android.gms.internal.p002firebaseauthapi;

import cS.Zv.SzFNXybiSxdx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzxz extends zzaky<zzxz, zza> implements zzame {
    private static final zzxz zzc;
    private static volatile zzamp<zzxz> zzd;
    private int zze;
    private int zzf;
    private zzyc zzg;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class zza extends zzaky.zza<zzxz, zza> implements zzame {
        private zza() {
            super(zzxz.zzc);
        }

        public final zza zza(zzyc zzycVar) {
            zzh();
            zzxz.zza((zzxz) this.zza, zzycVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzxz zzxzVar = new zzxz();
        zzc = zzxzVar;
        zzaky.zza((Class<zzxz>) zzxz.class, zzxzVar);
    }

    public static zzxz zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzxz) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final zzyc zzd() {
        zzyc zzycVar = this.zzg;
        return zzycVar == null ? zzyc.zzd() : zzycVar;
    }

    private zzxz() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzyb.zza[i2 - 1]) {
            case 1:
                return new zzxz();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{SzFNXybiSxdx.sLHRSYrIhR, "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxz> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxz.class) {
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

    static /* synthetic */ void zza(zzxz zzxzVar, zzyc zzycVar) {
        zzycVar.getClass();
        zzxzVar.zzg = zzycVar;
        zzxzVar.zze |= 1;
    }
}
