package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzws extends zzaky<zzws, zzb> implements zzame {
    private static final zzws zzc;
    private static volatile zzamp<zzws> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    private int zzg;

    public enum zza implements zzala {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append(Typography.greater);
            return sb.toString();
        }

        zza(int i2) {
            this.zzh = i2;
        }

        public static zza zza(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    public static final class zzb extends zzaky.zza<zzws, zzb> implements zzame {
        public final zzb zza(zza zzaVar) {
            zzh();
            zzws.zza((zzws) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzws.zzc);
        }

        public final zzb zza(String str) {
            zzh();
            zzws.zza((zzws) this.zza, str);
            return this;
        }

        public final zzb zza(zzajp zzajpVar) {
            zzh();
            zzws.zza((zzws) this.zza, zzajpVar);
            return this;
        }
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    static {
        zzws zzwsVar = new zzws();
        zzc = zzwsVar;
        zzaky.zza((Class<zzws>) zzws.class, zzwsVar);
    }

    public static zzws zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwr.zza[i2 - 1]) {
            case 1:
                return new zzws();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzws> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzws.class) {
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

    public final zza zzb() {
        zza zzaVarZza = zza.zza(this.zzg);
        return zzaVarZza == null ? zza.UNRECOGNIZED : zzaVarZza;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    private zzws() {
    }

    static /* synthetic */ void zza(zzws zzwsVar, zza zzaVar) {
        zzwsVar.zzg = zzaVar.zza();
    }

    static /* synthetic */ void zza(zzws zzwsVar, String str) {
        str.getClass();
        zzwsVar.zze = str;
    }

    static /* synthetic */ void zza(zzws zzwsVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwsVar.zzf = zzajpVar;
    }
}
