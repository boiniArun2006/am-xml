package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zztd extends zzaky<zztd, zza> implements zzame {
    private static final zztd zzc;
    private static volatile zzamp<zztd> zzd;
    private int zze;
    private zztj zzf;
    private zzvv zzg;

    public static final class zza extends zzaky.zza<zztd, zza> implements zzame {
        public final zza zza(zztj zztjVar) {
            zzh();
            zztd.zza((zztd) this.zza, zztjVar);
            return this;
        }

        private zza() {
            super(zztd.zzc);
        }

        public final zza zza(zzvv zzvvVar) {
            zzh();
            zztd.zza((zztd) this.zza, zzvvVar);
            return this;
        }
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    static {
        zztd zztdVar = new zztd();
        zzc = zztdVar;
        zzaky.zza((Class<zztd>) zztd.class, zztdVar);
    }

    public static zztd zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zztd) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public final zztj zzc() {
        zztj zztjVar = this.zzf;
        return zztjVar == null ? zztj.zzd() : zztjVar;
    }

    public final zzvv zzd() {
        zzvv zzvvVar = this.zzg;
        return zzvvVar == null ? zzvv.zze() : zzvvVar;
    }

    private zztd() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zztc.zza[i2 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztd> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zztd.class) {
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

    static /* synthetic */ void zza(zztd zztdVar, zztj zztjVar) {
        zztjVar.getClass();
        zztdVar.zzf = zztjVar;
        zztdVar.zze |= 1;
    }

    static /* synthetic */ void zza(zztd zztdVar, zzvv zzvvVar) {
        zzvvVar.getClass();
        zztdVar.zzg = zzvvVar;
        zztdVar.zze |= 2;
    }
}
