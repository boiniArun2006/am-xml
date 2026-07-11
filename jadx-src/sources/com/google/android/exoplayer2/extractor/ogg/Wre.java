package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.extractor.ogg.CN3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.nKK;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Wre extends CN3 {
    private static final byte[] HI = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] ck = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean ty;

    private long ty(byte[] bArr) {
        int i2;
        byte b2 = bArr[0];
        int i3 = b2 & UByte.MAX_VALUE;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = bArr[1] & 63;
            }
        } else {
            i2 = 1;
        }
        int i7 = i3 >> 3;
        int i8 = i7 & 3;
        return ((long) i2) * ((long) (i7 >= 16 ? 2500 << i8 : i7 >= 12 ? 10000 << (i7 & 1) : i8 == 3 ? 60000 : 10000 << i8));
    }

    public static boolean ck(ParsableByteArray parsableByteArray) {
        return HI(parsableByteArray, HI);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected boolean xMQ(ParsableByteArray parsableByteArray, long j2, CN3.n nVar) {
        if (HI(parsableByteArray, HI)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = OpusUtil.getChannelCount(bArrCopyOf);
            List<byte[]> listBuildInitializationData = OpusUtil.buildInitializationData(bArrCopyOf);
            if (nVar.f57856n != null) {
                return true;
            }
            nVar.f57856n = new Format.Builder().setSampleMimeType("audio/opus").setChannelCount(channelCount).setSampleRate(48000).setInitializationData(listBuildInitializationData).build();
            return true;
        }
        byte[] bArr = ck;
        if (!HI(parsableByteArray, bArr)) {
            Assertions.checkStateNotNull(nVar.f57856n);
            return false;
        }
        Assertions.checkStateNotNull(nVar.f57856n);
        if (this.ty) {
            return true;
        }
        this.ty = true;
        parsableByteArray.skipBytes(bArr.length);
        Metadata vorbisComments = VorbisUtil.parseVorbisComments(nKK.HI(VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
        if (vorbisComments == null) {
            return true;
        }
        nVar.f57856n = nVar.f57856n.buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(nVar.f57856n.metadata)).build();
        return true;
    }

    Wre() {
    }

    private static boolean HI(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        parsableByteArray.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected long J2(ParsableByteArray parsableByteArray) {
        return t(ty(parsableByteArray.getData()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected void qie(boolean z2) {
        super.qie(z2);
        if (z2) {
            this.ty = false;
        }
    }
}
