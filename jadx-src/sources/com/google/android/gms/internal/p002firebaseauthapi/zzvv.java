package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzvv extends zzaky<zzvv, zza> implements zzame {
    private static final zzvv zzc;
    private static volatile zzamp<zzvv> zzd;
    private int zze;
    private zzvy zzf;
    private int zzg;
    private int zzh;

    public static final class zza extends zzaky.zza<zzvv, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzvv) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zzvv.zzc);
        }

        public final zza zza(zzvy zzvyVar) {
            zzh();
            zzvv.zza((zzvv) this.zza, zzvyVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzg;
    }

    static {
        zzvv zzvvVar = new zzvv();
        zzc = zzvvVar;
        zzaky.zza((Class<zzvv>) zzvv.class, zzvvVar);
    }

    public static zzvv zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzvv) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvv zze() {
        return zzc;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzvy zzf() {
        zzvy zzvyVar = this.zzf;
        return zzvyVar == null ? zzvy.zze() : zzvyVar;
    }

    private zzvv() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzvx.zza[i2 - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvv> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzvv.class) {
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

    static /* synthetic */ void zza(zzvv zzvvVar, zzvy zzvyVar) {
        zzvyVar.getClass();
        zzvvVar.zzf = zzvyVar;
        zzvvVar.zze |= 1;
    }
}
