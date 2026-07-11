package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zztj extends zzaky<zztj, zza> implements zzame {
    private static final zztj zzc;
    private static volatile zzamp<zztj> zzd;
    private int zze;
    private zztm zzf;
    private int zzg;

    public static final class zza extends zzaky.zza<zztj, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zztj) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zztj.zzc);
        }

        public final zza zza(zztm zztmVar) {
            zzh();
            zztj.zza((zztj) this.zza, zztmVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzg;
    }

    static {
        zztj zztjVar = new zztj();
        zzc = zztjVar;
        zzaky.zza((Class<zztj>) zztj.class, zztjVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztj zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzti.zza[i2 - 1]) {
            case 1:
                return new zztj();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztj> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zztj.class) {
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

    public final zztm zze() {
        zztm zztmVar = this.zzf;
        return zztmVar == null ? zztm.zzd() : zztmVar;
    }

    private zztj() {
    }

    static /* synthetic */ void zza(zztj zztjVar, zztm zztmVar) {
        zztmVar.getClass();
        zztjVar.zzf = zztmVar;
        zztjVar.zze |= 1;
    }
}
