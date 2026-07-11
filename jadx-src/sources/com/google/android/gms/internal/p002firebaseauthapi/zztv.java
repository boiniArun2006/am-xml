package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zztv extends zzaky<zztv, zza> implements zzame {
    private static final zztv zzc;
    private static volatile zzamp<zztv> zzd;
    private int zze;

    public static final class zza extends zzaky.zza<zztv, zza> implements zzame {
        private zza() {
            super(zztv.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zztv) this.zza).zze = i2;
            return this;
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zztv zztvVar = new zztv();
        zzc = zztvVar;
        zzaky.zza((Class<zztv>) zztv.class, zztvVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztv zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zztu.zza[i2 - 1]) {
            case 1:
                return new zztv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztv> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zztv.class) {
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

    private zztv() {
    }
}
