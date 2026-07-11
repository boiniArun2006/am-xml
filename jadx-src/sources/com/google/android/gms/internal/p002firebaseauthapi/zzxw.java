package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzxw extends zzaky<zzxw, zza> implements zzame {
    private static final zzxw zzc;
    private static volatile zzamp<zzxw> zzd;
    private int zze;
    private int zzf;
    private zzyc zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zzxw, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzxw.zza((zzxw) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zzxw.zzc);
        }

        public final zza zza(zzyc zzycVar) {
            zzh();
            zzxw.zza((zzxw) this.zza, zzycVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzxw zzxwVar = new zzxw();
        zzc = zzxwVar;
        zzaky.zza((Class<zzxw>) zzxw.class, zzxwVar);
    }

    public static zzxw zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzxw) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final zzyc zzd() {
        zzyc zzycVar = this.zzg;
        return zzycVar == null ? zzyc.zzd() : zzycVar;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    private zzxw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxy.zza[i2 - 1]) {
            case 1:
                return new zzxw();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxw> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxw.class) {
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

    static /* synthetic */ void zza(zzxw zzxwVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzxwVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zzxw zzxwVar, zzyc zzycVar) {
        zzycVar.getClass();
        zzxwVar.zzg = zzycVar;
        zzxwVar.zze |= 1;
    }
}
