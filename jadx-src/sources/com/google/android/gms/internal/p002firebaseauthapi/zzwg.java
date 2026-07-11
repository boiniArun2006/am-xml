package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzwg extends zzaky<zzwg, zza> implements zzame {
    private static final zzwg zzc;
    private static volatile zzamp<zzwg> zzd;
    private int zze;
    private zzwj zzf;

    public static final class zza extends zzaky.zza<zzwg, zza> implements zzame {
        private zza() {
            super(zzwg.zzc);
        }

        public final zza zza(zzwj zzwjVar) {
            zzh();
            zzwg.zza((zzwg) this.zza, zzwjVar);
            return this;
        }
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzaky.zza((Class<zzwg>) zzwg.class, zzwgVar);
    }

    public static zzwg zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzwg) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public final zzwj zzc() {
        zzwj zzwjVar = this.zzf;
        return zzwjVar == null ? zzwj.zzf() : zzwjVar;
    }

    private zzwg() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwf.zza[i2 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwg> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzwg.class) {
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

    static /* synthetic */ void zza(zzwg zzwgVar, zzwj zzwjVar) {
        zzwjVar.getClass();
        zzwgVar.zzf = zzwjVar;
        zzwgVar.zze |= 1;
    }
}
