package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzts extends zzaky<zzts, zza> implements zzame {
    private static final zzts zzc;
    private static volatile zzamp<zzts> zzd;
    private int zze;
    private zztv zzf;
    private int zzg;

    public static final class zza extends zzaky.zza<zzts, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzts) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zzts.zzc);
        }

        public final zza zza(zztv zztvVar) {
            zzh();
            zzts.zza((zzts) this.zza, zztvVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzg;
    }

    static {
        zzts zztsVar = new zzts();
        zzc = zztsVar;
        zzaky.zza((Class<zzts>) zzts.class, zztsVar);
    }

    public static zzts zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzts) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final zztv zzd() {
        zztv zztvVar = this.zzf;
        return zztvVar == null ? zztv.zzd() : zztvVar;
    }

    private zzts() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zztr.zza[i2 - 1]) {
            case 1:
                return new zzts();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzts> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzts.class) {
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

    static /* synthetic */ void zza(zzts zztsVar, zztv zztvVar) {
        zztvVar.getClass();
        zztsVar.zzf = zztvVar;
        zztsVar.zze |= 1;
    }
}
