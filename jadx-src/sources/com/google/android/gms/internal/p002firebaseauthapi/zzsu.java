package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzsu extends zzaky<zzsu, zza> implements zzame {
    private static final zzsu zzc;
    private static volatile zzamp<zzsu> zzd;
    private int zze;
    private int zzf;
    private zzsx zzg;

    public static final class zza extends zzaky.zza<zzsu, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzsu) this.zza).zzf = i2;
            return this;
        }

        private zza() {
            super(zzsu.zzc);
        }

        public final zza zza(zzsx zzsxVar) {
            zzh();
            zzsu.zza((zzsu) this.zza, zzsxVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzsu zzsuVar = new zzsu();
        zzc = zzsuVar;
        zzaky.zza((Class<zzsu>) zzsu.class, zzsuVar);
    }

    public static zzsu zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzsu) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final zzsx zzd() {
        zzsx zzsxVar = this.zzg;
        return zzsxVar == null ? zzsx.zzd() : zzsxVar;
    }

    private zzsu() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzst.zza[i2 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsu> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzsu.class) {
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

    static /* synthetic */ void zza(zzsu zzsuVar, zzsx zzsxVar) {
        zzsxVar.getClass();
        zzsuVar.zzg = zzsxVar;
        zzsuVar.zze |= 1;
    }
}
