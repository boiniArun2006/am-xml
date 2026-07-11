package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzxc extends zzaky<zzxc, zzb> implements zzame {
    private static final zzxc zzc;
    private static volatile zzamp<zzxc> zzd;
    private int zze;
    private zzalc<zza> zzf = zzaky.zzp();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class zza extends zzaky<zza, C0780zza> implements zzame {
        private static final zza zzc;
        private static volatile zzamp<zza> zzd;
        private int zze;
        private zzws zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        public static final class C0780zza extends zzaky.zza<zza, C0780zza> implements zzame {
            public final C0780zza zza(zzws.zzb zzbVar) {
                zzh();
                zza.zza((zza) this.zza, (zzws) ((zzaky) zzbVar.zze()));
                return this;
            }

            private C0780zza() {
                super(zza.zzc);
            }

            public final C0780zza zza(zzws zzwsVar) {
                zzh();
                zza.zza((zza) this.zza, zzwsVar);
                return this;
            }

            public final C0780zza zza(int i2) {
                zzh();
                ((zza) this.zza).zzh = i2;
                return this;
            }

            public final C0780zza zza(zzxu zzxuVar) {
                zzh();
                zza.zza((zza) this.zza, zzxuVar);
                return this;
            }

            public final C0780zza zza(zzwt zzwtVar) {
                zzh();
                zza.zza((zza) this.zza, zzwtVar);
                return this;
            }
        }

        public final int zza() {
            return this.zzh;
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaky.zza((Class<zza>) zza.class, zzaVar);
        }

        public static C0780zza zzd() {
            return (C0780zza) zzc.zzm();
        }

        public final boolean e_() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
        protected final Object zza(int i2, Object obj, Object obj2) {
            zzamp zzcVar;
            switch (zzxb.zza[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0780zza();
                case 3:
                    return zzaky.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", aNrWBQYwFf.MQhgF, "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzamp<zza> zzampVar = zzd;
                    if (zzampVar != null) {
                        return zzampVar;
                    }
                    synchronized (zza.class) {
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

        public final zzws zzb() {
            zzws zzwsVar = this.zzf;
            return zzwsVar == null ? zzws.zzd() : zzwsVar;
        }

        public final zzwt zzc() {
            zzwt zzwtVarZza = zzwt.zza(this.zzg);
            return zzwtVarZza == null ? zzwt.UNRECOGNIZED : zzwtVarZza;
        }

        public final zzxu zzf() {
            zzxu zzxuVarZza = zzxu.zza(this.zzi);
            return zzxuVarZza == null ? zzxu.UNRECOGNIZED : zzxuVarZza;
        }

        private zza() {
        }

        static /* synthetic */ void zza(zza zzaVar, zzws zzwsVar) {
            zzwsVar.getClass();
            zzaVar.zzf = zzwsVar;
            zzaVar.zze |= 1;
        }

        static /* synthetic */ void zza(zza zzaVar, zzxu zzxuVar) {
            zzaVar.zzi = zzxuVar.zza();
        }

        static /* synthetic */ void zza(zza zzaVar, zzwt zzwtVar) {
            zzaVar.zzg = zzwtVar.zza();
        }
    }

    public static final class zzb extends zzaky.zza<zzxc, zzb> implements zzame {
        public final zzb zza(zza zzaVar) {
            zzh();
            zzxc.zza((zzxc) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzxc.zzc);
        }

        public final zzb zza(int i2) {
            zzh();
            ((zzxc) this.zza).zze = i2;
            return this;
        }
    }

    public final int zza() {
        return this.zzf.size();
    }

    static {
        zzxc zzxcVar = new zzxc();
        zzc = zzxcVar;
        zzaky.zza((Class<zzxc>) zzxc.class, zzxcVar);
    }

    public static zzb zzc() {
        return (zzb) zzc.zzm();
    }

    public final zza zza(int i2) {
        return this.zzf.get(i2);
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zza> zze() {
        return this.zzf;
    }

    private zzxc() {
    }

    public static zzxc zza(InputStream inputStream, zzakk zzakkVar) throws IOException {
        return (zzxc) zzaky.zza(zzc, inputStream, zzakkVar);
    }

    public static zzxc zza(byte[] bArr, zzakk zzakkVar) throws zzalf {
        return (zzxc) zzaky.zza(zzc, bArr, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxb.zza[i2 - 1]) {
            case 1:
                return new zzxc();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxc> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxc.class) {
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

    static /* synthetic */ void zza(zzxc zzxcVar, zza zzaVar) {
        zzaVar.getClass();
        zzalc<zza> zzalcVar = zzxcVar.zzf;
        if (!zzalcVar.zzc()) {
            zzxcVar.zzf = zzaky.zza(zzalcVar);
        }
        zzxcVar.zzf.add(zzaVar);
    }
}
