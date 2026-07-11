package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzxf extends zzaky<zzxf, zzb> implements zzame {
    private static final zzxf zzc;
    private static volatile zzamp<zzxf> zzd;
    private int zze;
    private zzalc<zza> zzf = zzaky.zzp();

    public static final class zza extends zzaky<zza, C0781zza> implements zzame {
        private static final zza zzc;
        private static volatile zzamp<zza> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf$zza$zza, reason: collision with other inner class name */
        public static final class C0781zza extends zzaky.zza<zza, C0781zza> implements zzame {
            public final C0781zza zza(int i2) {
                zzh();
                ((zza) this.zza).zzg = i2;
                return this;
            }

            private C0781zza() {
                super(zza.zzc);
            }

            public final C0781zza zza(zzxu zzxuVar) {
                zzh();
                zza.zza((zza) this.zza, zzxuVar);
                return this;
            }

            public final C0781zza zza(zzwt zzwtVar) {
                zzh();
                zza.zza((zza) this.zza, zzwtVar);
                return this;
            }

            public final C0781zza zza(String str) {
                zzh();
                zza.zza((zza) this.zza, str);
                return this;
            }
        }

        public static C0781zza zza() {
            return (C0781zza) zzc.zzm();
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaky.zza((Class<zza>) zza.class, zzaVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
        protected final Object zza(int i2, Object obj, Object obj2) {
            zzamp zzcVar;
            switch (zzxe.zza[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0781zza();
                case 3:
                    return zzaky.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
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

        private zza() {
        }

        static /* synthetic */ void zza(zza zzaVar, zzxu zzxuVar) {
            zzaVar.zzh = zzxuVar.zza();
        }

        static /* synthetic */ void zza(zza zzaVar, zzwt zzwtVar) {
            zzaVar.zzf = zzwtVar.zza();
        }

        static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze = str;
        }
    }

    public static final class zzb extends zzaky.zza<zzxf, zzb> implements zzame {
        public final zzb zza(zza zzaVar) {
            zzh();
            zzxf.zza((zzxf) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzxf.zzc);
        }

        public final zzb zza(int i2) {
            zzh();
            ((zzxf) this.zza).zze = i2;
            return this;
        }
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    static {
        zzxf zzxfVar = new zzxf();
        zzc = zzxfVar;
        zzaky.zza((Class<zzxf>) zzxf.class, zzxfVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxe.zza[i2 - 1]) {
            case 1:
                return new zzxf();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxf> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxf.class) {
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

    private zzxf() {
    }

    static /* synthetic */ void zza(zzxf zzxfVar, zza zzaVar) {
        zzaVar.getClass();
        zzalc<zza> zzalcVar = zzxfVar.zzf;
        if (!zzalcVar.zzc()) {
            zzxfVar.zzf = zzaky.zza(zzalcVar);
        }
        zzxfVar.zzf.add(zzaVar);
    }
}
