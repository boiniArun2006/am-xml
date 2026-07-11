package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziah extends zziak {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zziah(byte[] bArr, int i2, int i3) {
        super(null);
        zzian.zzC(i2, i2 + i3, bArr.length);
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i2) {
        zzian.zzB(i2, this.zzd);
        return this.zzb[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i2) {
        return this.zzb[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i2, int i3) {
        int iZzC = zzian.zzC(i2, i3, this.zzd);
        return iZzC == 0 ? zzian.zza : new zziah(this.zzb, this.zzc + i2, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(this.zzb, this.zzc + i2, bArr, i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        zziaeVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        return zzier.zzb(bArr, i2, this.zzd + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzj(zzian zzianVar) {
        return ((zzianVar instanceof zzial) || (zzianVar instanceof zziah)) ? zzk(zzianVar, 0, this.zzd) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i2, int i3, int i5) {
        return zzice.zzc(i2, this.zzb, this.zzc + i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        return zziaq.zzG(this.zzb, this.zzc, this.zzd, true);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    final boolean zzk(zzian zzianVar, int i2, int i3) {
        if (i3 <= zzianVar.zzc()) {
            int i5 = i2 + i3;
            if (i5 <= zzianVar.zzc()) {
                if (zzianVar instanceof zzial) {
                    return zzian.zzD(this.zzb, this.zzc, ((zzial) zzianVar).zzn(), i2, i3);
                }
                if (zzianVar instanceof zziah) {
                    zziah zziahVar = (zziah) zzianVar;
                    return zzian.zzD(this.zzb, this.zzc, zziahVar.zzb, zziahVar.zzc + i2, i3);
                }
                zzian zzianVarZzd = zzianVar.zzd(i2, i5);
                int i7 = this.zzc;
                return zzianVarZzd.equals(zzd(i7, i3 + i7));
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
        int i8 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 18 + String.valueOf(i8).length());
        sb2.append("Length too large: ");
        sb2.append(i3);
        sb2.append(i8);
        throw new IllegalArgumentException(sb2.toString());
    }
}
