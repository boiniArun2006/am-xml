package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzvy extends zzaky<zzvy, zza> implements zzame {
    private static final zzvy zzc;
    private static volatile zzamp<zzvy> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzaky.zza<zzvy, zza> implements zzame {
        public final zza zza(zzvt zzvtVar) {
            zzh();
            zzvy.zza((zzvy) this.zza, zzvtVar);
            return this;
        }

        private zza() {
            super(zzvy.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zzvy) this.zza).zzf = i2;
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzvy zzvyVar = new zzvy();
        zzc = zzvyVar;
        zzaky.zza((Class<zzvy>) zzvy.class, zzvyVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvy zze() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwa.zza[i2 - 1]) {
            case 1:
                return new zzvy();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvy> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzvy.class) {
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

    public final zzvt zzb() {
        zzvt zzvtVarZza = zzvt.zza(this.zze);
        return zzvtVarZza == null ? zzvt.UNRECOGNIZED : zzvtVarZza;
    }

    private zzvy() {
    }

    static /* synthetic */ void zza(zzvy zzvyVar, zzvt zzvtVar) {
        zzvyVar.zze = zzvtVar.zza();
    }
}
