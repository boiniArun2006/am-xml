package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzvs extends zzaky<zzvs, zza> implements zzame {
    private static final zzvs zzc;
    private static volatile zzamp<zzvs> zzd;
    private int zze;
    private int zzf;
    private zzvy zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zzvs, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzvs.zza((zzvs) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zzvs.zzc);
        }

        public final zza zza(zzvy zzvyVar) {
            zzh();
            zzvs.zza((zzvs) this.zza, zzvyVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzvs zzvsVar = new zzvs();
        zzc = zzvsVar;
        zzaky.zza((Class<zzvs>) zzvs.class, zzvsVar);
    }

    public static zzamp<zzvs> c_() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public static zzvs zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzvs) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzvs zzd() {
        return zzc;
    }

    public final zzvy zze() {
        zzvy zzvyVar = this.zzg;
        return zzvyVar == null ? zzvy.zze() : zzvyVar;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    private zzvs() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzvu.zza[i2 - 1]) {
            case 1:
                return new zzvs();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvs> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzvs.class) {
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

    static /* synthetic */ void zza(zzvs zzvsVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzvsVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zzvs zzvsVar, zzvy zzvyVar) {
        zzvyVar.getClass();
        zzvsVar.zzg = zzvyVar;
        zzvsVar.zze |= 1;
    }
}
