package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzatz implements zzaty {
    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i2) {
        return zzaukVar.zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i2, int i3) {
        byte[] bArr;
        int length;
        if (i2 < 0 || i2 > i3 || i3 > (length = (bArr = zzaukVar.zza).length) || i2 > i3 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzauk(zzauk.zzh(bArr, i2, i3 - i2));
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzaty zzc() {
        return new zzatz();
    }
}
