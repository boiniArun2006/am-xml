package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsl extends zzcp {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable int[] iArr) {
        this.zzd = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    @Override // com.google.android.gms.internal.ads.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(ByteBuffer byteBuffer) {
        ByteOrder byteOrder;
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                int iZzD = (zzfj.zzD(this.zzb.zzd) * i2) + iPosition;
                int i3 = this.zzb.zzd;
                if (i3 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                } else if (i3 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzD));
                } else if (i3 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzD));
                } else if (i3 == 21) {
                    ByteOrder byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    byte b2 = byteBuffer.get(byteOrderOrder != byteOrder ? iZzD : iZzD + 2);
                    byte b4 = byteBuffer.get(iZzD + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzD += 2;
                    }
                    int i5 = ((b2 << 24) & (-16777216)) | ((b4 << 16) & 16711680) | ((byteBuffer.get(iZzD) << 8) & 65280);
                    int i7 = i5 >> 8;
                    zzgrc.zzf((i7 & (-16777216)) != 0 || (i7 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i7));
                    zzgrc.zza(byteBufferZzk.remaining() >= 3);
                    byteBufferZzk.put((byte) (byteBufferZzk.order() != byteOrder ? (i5 >> 24) & 255 : i7 & 255)).put((byte) ((i5 >> 16) & 255)).put((byte) (byteBufferZzk.order() != byteOrder ? i7 & 255 : (i5 >> 24) & 255));
                } else {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                                    sb.append("Unexpected encoding: ");
                                    sb.append(i3);
                                    throw new IllegalStateException(sb.toString());
                                }
                            }
                            ByteOrder byteOrderOrder2 = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b22 = byteBuffer.get(byteOrderOrder2 != byteOrder ? iZzD : iZzD + 2);
                            byte b42 = byteBuffer.get(iZzD + 1);
                            if (byteBuffer.order() == byteOrder) {
                            }
                            int i52 = ((b22 << 24) & (-16777216)) | ((b42 << 16) & 16711680) | ((byteBuffer.get(iZzD) << 8) & 65280);
                            int i72 = i52 >> 8;
                            if ((i72 & (-16777216)) != 0) {
                                zzgrc.zzf((i72 & (-16777216)) != 0 || (i72 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i72));
                                zzgrc.zza(byteBufferZzk.remaining() >= 3);
                                byteBufferZzk.put((byte) (byteBufferZzk.order() != byteOrder ? (i52 >> 24) & 255 : i72 & 255)).put((byte) ((i52 >> 16) & 255)).put((byte) (byteBufferZzk.order() != byteOrder ? i72 & 255 : (i52 >> 24) & 255));
                            }
                        }
                        byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                    }
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzD));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i2 = zzclVar.zzd;
        if (!zzfj.zzA(i2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i3 = zzclVar.zzc;
        boolean z2 = i3 != iArr.length;
        int i5 = 0;
        while (true) {
            int length = iArr.length;
            if (i5 >= length) {
                return z2 ? new zzcl(zzclVar.zzb, length, i2) : zzcl.zza;
            }
            int i7 = iArr[i5];
            if (i7 >= i3) {
                String string = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 59);
                sb.append("Channel map (");
                sb.append(string);
                sb.append(") trying to access non-existent input channel.");
                throw new zzcn(sb.toString(), zzclVar);
            }
            z2 |= i7 != i5;
            i5++;
        }
    }
}
