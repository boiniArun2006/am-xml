package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhpg extends zzibr implements zzidd {
    private static final zzhpg zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    public static zzhpg zzc() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzg() {
        int i2 = this.zzb;
        int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzh() {
        int i2 = this.zzc;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    static {
        zzhpg zzhpgVar = new zzhpg();
        zzd = zzhpgVar;
        zzibr.zzbu(zzhpg.class, zzhpgVar);
    }

    public static zzhpf zzb() {
        return (zzhpf) zzd.zzbn();
    }

    private zzhpg() {
    }

    final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzidk zzidkVar = zze;
                                if (zzidkVar == null) {
                                    synchronized (zzhpg.class) {
                                        try {
                                            zzibmVar = zze;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzd);
                                                zze = zzibmVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return zzibmVar;
                                }
                                return zzidkVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzhpf(bArr);
                }
                return new zzhpg();
            }
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzi(int i2) {
        this.zzb = zzhps.zza(i2);
    }

    final /* synthetic */ void zzj(int i2) {
        this.zzc = zzhpl.zza(i2);
    }
}
