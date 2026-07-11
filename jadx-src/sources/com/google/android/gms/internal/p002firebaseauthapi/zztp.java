package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zztp extends zzaky<zztp, zza> implements zzame {
    private static final zztp zzc;
    private static volatile zzamp<zztp> zzd;
    private int zze;
    private int zzf;
    private zztv zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zztp, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zztp.zza((zztp) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zztp.zzc);
        }

        public final zza zza(zztv zztvVar) {
            zzh();
            zztp.zza((zztp) this.zza, zztvVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zztp zztpVar = new zztp();
        zzc = zztpVar;
        zzaky.zza((Class<zztp>) zztp.class, zztpVar);
    }

    public static zztp zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zztp) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zztp> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zztv zzd() {
        zztv zztvVar = this.zzg;
        return zztvVar == null ? zztv.zzd() : zztvVar;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    private zztp() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzto.zza[i2 - 1]) {
            case 1:
                return new zztp();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztp> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zztp.class) {
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

    static /* synthetic */ void zza(zztp zztpVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zztpVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zztp zztpVar, zztv zztvVar) {
        zztvVar.getClass();
        zztpVar.zzg = zztvVar;
        zztpVar.zze |= 1;
    }
}
