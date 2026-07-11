package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzsr extends zzaky<zzsr, zza> implements zzame {
    private static final zzsr zzc;
    private static volatile zzamp<zzsr> zzd;
    private int zze;
    private int zzf;
    private zzajp zzg = zzajp.zza;
    private zzsx zzh;

    public static final class zza extends zzaky.zza<zzsr, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzsr.zza((zzsr) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zzsr.zzc);
        }

        public final zza zza(zzsx zzsxVar) {
            zzh();
            zzsr.zza((zzsr) this.zza, zzsxVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzsr zzsrVar = new zzsr();
        zzc = zzsrVar;
        zzaky.zza((Class<zzsr>) zzsr.class, zzsrVar);
    }

    public static zzsr zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzsr) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzsr> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzsx zzd() {
        zzsx zzsxVar = this.zzh;
        return zzsxVar == null ? zzsx.zzd() : zzsxVar;
    }

    public final zzajp zze() {
        return this.zzg;
    }

    private zzsr() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzsq.zza[i2 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsr> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzsr.class) {
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

    static /* synthetic */ void zza(zzsr zzsrVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzsrVar.zzg = zzajpVar;
    }

    static /* synthetic */ void zza(zzsr zzsrVar, zzsx zzsxVar) {
        zzsxVar.getClass();
        zzsrVar.zzh = zzsxVar;
        zzsrVar.zze |= 1;
    }
}
