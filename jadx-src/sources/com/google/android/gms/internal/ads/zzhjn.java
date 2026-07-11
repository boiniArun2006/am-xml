package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhjn extends zzhbp {
    private final String zza;
    private final zzhqy zzb;

    /* synthetic */ zzhjn(String str, zzhqy zzhqyVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzb != zzhqy.RAW;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
