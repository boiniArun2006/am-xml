package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zztc extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    private static int zzv(byte b2, byte b4) {
        return (b2 << 8) | (b4 & UByte.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z2) {
        this.zze = z2;
    }

    public final long zzr() {
        return this.zzg;
    }

    private final void zzs(boolean z2) {
        int i2;
        int length;
        int i3 = this.zzk;
        int length2 = this.zzi.length;
        if (i3 != length2) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        if (this.zzh == 0) {
            if (z2) {
                zzu(i3, 3);
                length = i3;
            } else {
                zzgrc.zzi(i3 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i2 = length;
        } else {
            int i5 = length2 >> 1;
            int i7 = i3 - i5;
            if (z2) {
                int iZzt = zzt(i7) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i8 = i5 + i7;
                i2 = iZzt;
                length = i8;
            } else {
                int iZzt2 = zzt(i7);
                zzu(iZzt2, 1);
                i2 = iZzt2;
                length = i7;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgrt.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgrc.zzi(i3 >= i2);
        this.zzk -= length;
        int i9 = this.zzj + length;
        this.zzj = i9;
        this.zzj = i9 % this.zzi.length;
        int i10 = this.zzh;
        int i11 = this.zzd;
        this.zzh = i10 + (i2 / i11);
        this.zzg += (long) ((length - i2) / i11);
    }

    private final void zzu(int i2, int i3) {
        int i5;
        if (i2 == 0) {
            return;
        }
        zzgrc.zza(this.zzk >= i2);
        if (i3 == 2) {
            int i7 = this.zzj;
            int i8 = this.zzk;
            int i9 = i7 + i8;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i9 <= length) {
                System.arraycopy(bArr, i9 - i2, this.zzl, 0, i2);
            } else {
                int i10 = i8 - (length - i7);
                if (i10 >= i2) {
                    System.arraycopy(bArr, i10 - i2, this.zzl, 0, i2);
                } else {
                    int i11 = i2 - i10;
                    System.arraycopy(bArr, length - i11, this.zzl, 0, i11);
                    System.arraycopy(this.zzi, 0, this.zzl, i11, i10);
                }
            }
        } else {
            int i12 = this.zzj;
            int i13 = i12 + i2;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i13 <= length2) {
                System.arraycopy(bArr2, i12, this.zzl, 0, i2);
            } else {
                int i14 = length2 - i12;
                System.arraycopy(bArr2, i12, this.zzl, 0, i14);
                System.arraycopy(this.zzi, 0, this.zzl, i14, i2 - i14);
            }
        }
        zzgrc.zzd(i2 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i2);
        zzgrc.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgrc.zzd(i2 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i2);
        if (i3 != 3) {
            for (int i15 = 0; i15 < i2; i15 += 2) {
                int i16 = i15 + 1;
                int iZzv = zzv(bArr3[i16], bArr3[i15]);
                if (i3 == 0) {
                    i5 = ((((i15 * 1000) / (i2 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i5 = 10;
                    if (i3 == 2) {
                        i5 = 10 + (((90000 * i15) / (i2 - 1)) / 1000);
                    }
                }
                int i17 = (iZzv * i5) / 100;
                if (i17 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = ByteCompanionObject.MAX_VALUE;
                } else if (i17 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = ByteCompanionObject.MIN_VALUE;
                } else {
                    bArr3[i15] = (byte) (i17 & 255);
                    bArr3[i16] = (byte) (i17 >> 8);
                }
            }
        }
        zzk(i2).put(bArr3, 0, i2).flip();
    }

    private final int zzw(long j2) {
        return (int) ((j2 * ((long) this.zzb.zzb)) / 1000000);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    public zztc() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzt(int i2) {
        boolean z2 = true;
        int iZzw = ((zzw(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        if (iZzw < 0) {
            z2 = false;
        }
        zzgrc.zzi(z2);
        int iMin = (int) Math.min((i2 * 0.2f) + 0.5f, iZzw);
        int i3 = this.zzd;
        return (iMin / i3) * i3;
    }

    private static final boolean zzx(byte b2, byte b4) {
        if (Math.abs(zzv(b2, b4)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (super.zzc() && this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        boolean z2;
        int iLimit;
        int i2;
        boolean z3;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            boolean z4 = true;
            if (this.zzf != 0) {
                if (this.zzj < this.zzi.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzgrc.zzi(z2);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 < byteBuffer.limit()) {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i3 = this.zzd;
                            iLimit = i3 * (iPosition2 / i3);
                            break;
                        }
                        iPosition2 += 2;
                    } else {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i5 = this.zzj;
                int i7 = this.zzk;
                int i8 = i5 + i7;
                int length = this.zzi.length;
                if (i8 < length) {
                    i2 = length - i8;
                } else {
                    i8 = i7 - (length - i5);
                    i2 = i5 - i8;
                }
                int iMin = Math.min(iPosition3, i2);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i8, iMin);
                int i9 = this.zzk + iMin;
                this.zzk = i9;
                if (i9 <= this.zzi.length) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzgrc.zzi(z3);
                if (iLimit >= iLimit2 || iPosition3 >= i2) {
                    z4 = false;
                }
                zzs(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 >= byteBuffer.position()) {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i10 = this.zzd;
                            iPosition = ((iLimit4 / i10) * i10) + i10;
                            break;
                        }
                        iLimit4 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (zzc()) {
            int i2 = this.zzb.zzc;
            this.zzd = i2 + i2;
            int iZzw = zzw(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / 2;
            int i3 = this.zzd;
            int i5 = (iZzw / i3) * i3;
            int i7 = i5 + i5;
            if (this.zzi.length != i7) {
                this.zzi = new byte[i7];
                this.zzl = new byte[i7];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }
}
