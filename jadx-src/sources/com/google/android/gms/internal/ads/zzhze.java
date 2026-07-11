package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhze implements CharSequence {
    private char[] zza;
    private String zzb;

    private zzhze() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new String(this.zza, i2, i3 - i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }

    /* synthetic */ zzhze(byte[] bArr) {
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.zza[i2];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }
}
