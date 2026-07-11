package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgl extends zzme implements zznm {
    private static final zzgl zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private zzgf zzp;
    private zzgp zzq;
    private zzgv zzr;
    private zzgr zzs;
    private zzgn zzt;
    private String zze = "";
    private zzmn zzg = zzme.zzcv();
    private zzmn zzh = zzme.zzcv();
    private zzmn zzi = zzme.zzcv();
    private String zzj = "";
    private zzmn zzl = zzme.zzcv();
    private zzmn zzm = zzme.zzcv();
    private String zzn = "";
    private String zzo = "";

    public static zzgl zzs() {
        return zzu;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final long zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List zze() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzl;
    }

    public final List zzk() {
        return this.zzm;
    }

    public final String zzm() {
        return this.zzn;
    }

    public final boolean zzn() {
        return (this.zzb & 128) != 0;
    }

    public final boolean zzp() {
        return (this.zzb & 512) != 0;
    }

    static {
        zzgl zzglVar = new zzgl();
        zzu = zzglVar;
        zzme.zzcp(zzgl.class, zzglVar);
    }

    public static zzgk zzr() {
        return (zzgk) zzu.zzck();
    }

    public final int zzf() {
        return this.zzh.size();
    }

    public final zzgj zzg(int i2) {
        return (zzgj) this.zzh.get(i2);
    }

    public final int zzj() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", zzgt.class, "zzh", zzgj.class, "zzi", zzfd.class, "zzj", "zzk", "zzl", zzja.class, "zzm", zzgh.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i3 == 3) {
            return new zzgl();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzgk(bArr);
        }
        if (i3 == 5) {
            return zzu;
        }
        throw null;
    }

    public final zzgf zzo() {
        zzgf zzgfVar = this.zzp;
        return zzgfVar == null ? zzgf.zzg() : zzgfVar;
    }

    public final zzgv zzq() {
        zzgv zzgvVar = this.zzr;
        return zzgvVar == null ? zzgv.zze() : zzgvVar;
    }

    private zzgl() {
    }

    final /* synthetic */ void zzt(int i2, zzgj zzgjVar) {
        zzgjVar.getClass();
        zzmn zzmnVar = this.zzh;
        if (!zzmnVar.zza()) {
            this.zzh = zzme.zzcw(zzmnVar);
        }
        this.zzh.set(i2, zzgjVar);
    }

    final /* synthetic */ void zzu() {
        this.zzi = zzme.zzcv();
    }

    final /* synthetic */ void zzv() {
        this.zzl = zzme.zzcv();
    }
}
