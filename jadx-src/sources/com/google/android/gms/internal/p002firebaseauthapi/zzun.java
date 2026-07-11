package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzun extends zzaky<zzun, zza> implements zzame {
    private static final zzun zzc;
    private static volatile zzamp<zzun> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzaky.zza<zzun, zza> implements zzame {
        private zza() {
            super(zzun.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zzun) this.zza).zze = i2;
            return this;
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zzun zzunVar = new zzun();
        zzc = zzunVar;
        zzaky.zza((Class<zzun>) zzun.class, zzunVar);
    }

    public static zzun zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzun) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zzb() {
        return this.zzf;
    }

    private zzun() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzum.zza[i2 - 1]) {
            case 1:
                return new zzun();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzun> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzun.class) {
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
}
