package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzzi extends zzzs implements Comparable {
    private final int zze;
    private final int zzf;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzi zzziVar) {
        return Integer.compare(this.zzf, zzziVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }

    public zzzi(int i2, zzbg zzbgVar, int i3, zzzl zzzlVar, int i5) {
        super(i2, zzbgVar, i3);
        this.zze = zzmn.zzaa(i5, zzzlVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }
}
