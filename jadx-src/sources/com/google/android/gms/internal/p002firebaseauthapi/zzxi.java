package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzxi extends zzaky<zzxi, zza> implements zzame {
    private static final zzxi zzc;
    private static volatile zzamp<zzxi> zzd;
    private int zze;
    private int zzf;
    private zzxl zzg;

    public static final class zza extends zzaky.zza<zzxi, zza> implements zzame {
        private zza() {
            super(zzxi.zzc);
        }

        public final zza zza(zzxl zzxlVar) {
            zzh();
            zzxi.zza((zzxi) this.zza, zzxlVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzxi zzxiVar = new zzxi();
        zzc = zzxiVar;
        zzaky.zza((Class<zzxi>) zzxi.class, zzxiVar);
    }

    public static zzxi zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzxi) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzxi> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzxl zzd() {
        zzxl zzxlVar = this.zzg;
        return zzxlVar == null ? zzxl.zzc() : zzxlVar;
    }

    private zzxi() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxh.zza[i2 - 1]) {
            case 1:
                return new zzxi();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxi> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxi.class) {
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

    static /* synthetic */ void zza(zzxi zzxiVar, zzxl zzxlVar) {
        zzxlVar.getClass();
        zzxiVar.zzg = zzxlVar;
        zzxiVar.zze |= 1;
    }
}
