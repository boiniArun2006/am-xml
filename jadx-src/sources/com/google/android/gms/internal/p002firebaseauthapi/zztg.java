package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zztg extends zzaky<zztg, zza> implements zzame {
    private static final zztg zzc;
    private static volatile zzamp<zztg> zzd;
    private int zze;
    private int zzf;
    private zztm zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zztg, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zztg.zza((zztg) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zztg.zzc);
        }

        public final zza zza(zztm zztmVar) {
            zzh();
            zztg.zza((zztg) this.zza, zztmVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zztg zztgVar = new zztg();
        zzc = zztgVar;
        zzaky.zza((Class<zztg>) zztg.class, zztgVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztg zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zztf.zza[i2 - 1]) {
            case 1:
                return new zztg();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztg> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zztg.class) {
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
        zztm zztmVar = this.zzg;
        return zztmVar == null ? zztm.zzd() : zztmVar;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    private zztg() {
    }

    static /* synthetic */ void zza(zztg zztgVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zztgVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zztg zztgVar, zztm zztmVar) {
        zztmVar.getClass();
        zztgVar.zzg = zztmVar;
        zztgVar.zze |= 1;
    }
}
