package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhs extends zzme implements zznm {
    private static final zzhs zzi;
    private int zzb;
    private zzmn zzd = zzme.zzcv();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    public final List zza() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzb & 2) != 0;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 4) != 0;
    }

    public final long zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zzb & 8) != 0;
    }

    public final int zzj() {
        return this.zzh;
    }

    final /* synthetic */ void zzs(long j2) {
        this.zzb |= 2;
        this.zzf = j2;
    }

    final /* synthetic */ void zzt(long j2) {
        this.zzb |= 4;
        this.zzg = j2;
    }

    static {
        zzhs zzhsVar = new zzhs();
        zzi = zzhsVar;
        zzme.zzcp(zzhs.class, zzhsVar);
    }

    public static zzhr zzk() {
        return (zzhr) zzi.zzck();
    }

    private final void zzv() {
        zzmn zzmnVar = this.zzd;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzd = zzme.zzcw(zzmnVar);
    }

    public final int zzb() {
        return this.zzd.size();
    }

    public final zzhw zzc(int i2) {
        return (zzhw) this.zzd.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzb", "zzd", zzhw.class, "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzhs();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhr(bArr);
        }
        if (i3 == 5) {
            return zzi;
        }
        throw null;
    }

    private zzhs() {
    }

    final /* synthetic */ void zzm(int i2, zzhw zzhwVar) {
        zzhwVar.getClass();
        zzv();
        this.zzd.set(i2, zzhwVar);
    }

    final /* synthetic */ void zzn(zzhw zzhwVar) {
        zzhwVar.getClass();
        zzv();
        this.zzd.add(zzhwVar);
    }

    final /* synthetic */ void zzo(Iterable iterable) {
        zzv();
        zzkr.zzce(iterable, this.zzd);
    }

    final /* synthetic */ void zzp() {
        this.zzd = zzme.zzcv();
    }

    final /* synthetic */ void zzq(int i2) {
        zzv();
        this.zzd.remove(i2);
    }

    final /* synthetic */ void zzr(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
