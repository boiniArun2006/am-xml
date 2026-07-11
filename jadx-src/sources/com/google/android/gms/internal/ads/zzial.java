package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzial extends zziak {
    private final byte[] zzb;

    zzial(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i2, int i3) {
        byte[] bArr = this.zzb;
        int iZzC = zzian.zzC(i2, i3, bArr.length);
        return iZzC == 0 ? zzian.zza : new zziah(bArr, i2, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(this.zzb, i2, bArr, i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        byte[] bArr = this.zzb;
        zziaeVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        return zzier.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzj(zzian zzianVar) {
        return zzianVar instanceof zzial ? Arrays.equals(this.zzb, ((zzial) zzianVar).zzb) : zzianVar instanceof zziah ? zzk(zzianVar, 0, this.zzb.length) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i2, int i3, int i5) {
        return zzice.zzc(i2, this.zzb, i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        byte[] bArr = this.zzb;
        return zziaq.zzG(bArr, 0, bArr.length, true);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    final boolean zzk(zzian zzianVar, int i2, int i3) {
        if (i3 <= zzianVar.zzc()) {
            int i5 = i2 + i3;
            if (i5 <= zzianVar.zzc()) {
                if (zzianVar instanceof zzial) {
                    return zzian.zzD(this.zzb, 0, ((zzial) zzianVar).zzb, i2, i3);
                }
                if (zzianVar instanceof zziah) {
                    zziah zziahVar = (zziah) zzianVar;
                    return zzian.zzD(this.zzb, 0, zziahVar.zzn(), zziahVar.zzo() + i2, i3);
                }
                return zzianVar.zzd(i2, i5).equals(zzd(0, i3));
            }
            int iZzc = zzianVar.zzc();
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(length + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iZzc).length());
            sb.append("Ran off end of other: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(iZzc);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] bArr = this.zzb;
        int length2 = String.valueOf(i3).length();
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(length2 + 18 + String.valueOf(length3).length());
        sb2.append("Length too large: ");
        sb2.append(i3);
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}
