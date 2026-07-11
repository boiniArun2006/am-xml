package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zztd extends zzcp {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i2 = zzclVar.zzd;
        String str = zzfj.zza;
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736) {
            if (i2 == 4) {
                return zzcl.zza;
            }
            if (i2 != 2) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.zzb.zzd;
        if (i3 != 2) {
            if (i3 != 1342177280) {
                if (i3 != 1610612736) {
                    if (i3 != 21) {
                        if (i3 == 22) {
                            byteBufferZzk = zzk(i2);
                            while (iPosition < iLimit) {
                                int i5 = byteBuffer.get(iPosition) & UByte.MAX_VALUE;
                                int i7 = (byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 8;
                                zzq(i5 | i7 | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE) << 24), byteBufferZzk);
                                iPosition += 4;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        byteBufferZzk = zzk((i2 / 3) * 4);
                        while (iPosition < iLimit) {
                            zzq(((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 24), byteBufferZzk);
                            iPosition += 3;
                        }
                    }
                } else {
                    byteBufferZzk = zzk(i2);
                    while (iPosition < iLimit) {
                        int i8 = byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE;
                        int i9 = (byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 8;
                        zzq(i8 | i9 | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 24), byteBufferZzk);
                        iPosition += 4;
                    }
                }
            } else {
                byteBufferZzk = zzk((i2 / 3) * 4);
                while (iPosition < iLimit) {
                    zzq(((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 24), byteBufferZzk);
                    iPosition += 3;
                }
            }
        } else {
            byteBufferZzk = zzk(i2 + i2);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 24), byteBufferZzk);
                iPosition += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }
}
