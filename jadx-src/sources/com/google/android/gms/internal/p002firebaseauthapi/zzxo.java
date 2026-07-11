package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzxo extends zzaky<zzxo, zza> implements zzame {
    private static final zzxo zzc;
    private static volatile zzamp<zzxo> zzd;
    private int zze;
    private int zzf;
    private zzxr zzg;

    public static final class zza extends zzaky.zza<zzxo, zza> implements zzame {
        private zza() {
            super(zzxo.zzc);
        }

        public final zza zza(zzxr zzxrVar) {
            zzh();
            zzxo.zza((zzxo) this.zza, zzxrVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzxo zzxoVar = new zzxo();
        zzc = zzxoVar;
        zzaky.zza((Class<zzxo>) zzxo.class, zzxoVar);
    }

    public static zzxo zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzxo) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzxo> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzxr zzd() {
        zzxr zzxrVar = this.zzg;
        return zzxrVar == null ? zzxr.zzd() : zzxrVar;
    }

    private zzxo() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxn.zza[i2 - 1]) {
            case 1:
                return new zzxo();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxo> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxo.class) {
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

    static /* synthetic */ void zza(zzxo zzxoVar, zzxr zzxrVar) {
        zzxrVar.getClass();
        zzxoVar.zzg = zzxrVar;
        zzxoVar.zze |= 1;
    }
}
