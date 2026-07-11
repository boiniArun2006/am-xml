package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    final /* synthetic */ void zzc(long j2) {
        this.zzb = j2;
    }

    final /* synthetic */ void zzd(long j2) {
        this.zzc = j2;
    }

    final /* synthetic */ void zze(boolean z2) {
        this.zzd = z2;
    }

    final /* synthetic */ void zzg(long j2) {
        this.zze = j2;
    }

    final /* synthetic */ void zzh(long j2) {
        this.zzf = j2;
    }

    final /* synthetic */ void zzk(int i2) {
        this.zzh = i2 - 2;
    }

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    private zzfpc() {
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
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
                                zzidk zzidkVar = zzj;
                                if (zzidkVar == null) {
                                    synchronized (zzfpc.class) {
                                        try {
                                            zzibmVar = zzj;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzi);
                                                zzj = zzibmVar;
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
                        return zzi;
                    }
                    return new zzfpb(bArr);
                }
                return new zzfpc();
            }
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }
}
