package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzte extends zzcp {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzfj.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    public final void zzq(int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j2) {
        return Math.max(0L, j2 - zzfj.zzr(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (!zzfj.zzA(zzclVar.zzd)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcl.zza : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzn() {
        if (this.zzf) {
            int i2 = this.zzi;
            if (i2 > 0) {
                this.zzj += (long) (i2 / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo() {
        if (this.zzf) {
            this.zzf = false;
            int i2 = this.zze;
            int i3 = this.zzb.zze;
            this.zzh = new byte[i2 * i3];
            this.zzg = this.zzd * i3;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zzh = zzfj.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 != 0) {
            int iMin = Math.min(i2, this.zzg);
            this.zzj += (long) (iMin / this.zzb.zze);
            this.zzg -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.zzg <= 0) {
                int i3 = i2 - iMin;
                int length = (this.zzi + i3) - this.zzh.length;
                ByteBuffer byteBufferZzk = zzk(length);
                int i5 = this.zzi;
                String str = zzfj.zza;
                int iMax = Math.max(0, Math.min(length, i5));
                byteBufferZzk.put(this.zzh, 0, iMax);
                int iMax2 = Math.max(0, Math.min(length - iMax, i3));
                byteBuffer.limit(byteBuffer.position() + iMax2);
                byteBufferZzk.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i7 = i3 - iMax2;
                int i8 = this.zzi - iMax;
                this.zzi = i8;
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, iMax, bArr, 0, i8);
                byteBuffer.get(this.zzh, this.zzi, i7);
                this.zzi += i7;
                byteBufferZzk.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final ByteBuffer zzf() {
        int i2;
        if (super.zzg() && (i2 = this.zzi) > 0) {
            zzk(i2).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }
}
