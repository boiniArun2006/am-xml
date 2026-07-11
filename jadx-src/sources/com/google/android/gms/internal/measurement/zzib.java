package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzib extends zzme implements zznm {
    private static final zzib zzh;
    private int zzb;
    private zzmn zzd = zzme.zzcv();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    public final List zza() {
        return this.zzd;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    public final String zzg() {
        return this.zzf;
    }

    static {
        zzib zzibVar = new zzib();
        zzh = zzibVar;
        zzme.zzcp(zzib.class, zzibVar);
    }

    public static zzhz zzh() {
        return (zzhz) zzh.zzck();
    }

    public static zzhz zzi(zzib zzibVar) {
        zzma zzmaVarZzck = zzh.zzck();
        zzmaVarZzck.zzbd(zzibVar);
        return (zzhz) zzmaVarZzck;
    }

    private final void zzr() {
        zzmn zzmnVar = this.zzd;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzd = zzme.zzcw(zzmnVar);
    }

    public final int zzb() {
        return this.zzd.size();
    }

    public final zzid zzc(int i2) {
        return (zzid) this.zzd.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", zzid.class, "zze", "zzf", "zzg", zzia.zza});
        }
        if (i3 == 3) {
            return new zzib();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhz(bArr);
        }
        if (i3 == 5) {
            return zzh;
        }
        throw null;
    }

    private zzib() {
    }

    final /* synthetic */ void zzj(int i2, zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.set(i2, zzidVar);
    }

    final /* synthetic */ void zzk(zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.add(zzidVar);
    }

    final /* synthetic */ void zzm(Iterable iterable) {
        zzr();
        zzkr.zzce(iterable, this.zzd);
    }

    final /* synthetic */ void zzn() {
        this.zzd = zzme.zzcv();
    }

    final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
