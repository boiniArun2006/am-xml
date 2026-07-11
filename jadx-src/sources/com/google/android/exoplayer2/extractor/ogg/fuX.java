package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.extractor.ogg.CN3;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class fuX extends CN3 {
    private int HI;
    private VorbisUtil.VorbisIdHeader Ik;
    private boolean ck;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private VorbisUtil.CommentHeader f57860r;
    private j ty;

    static int ck(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static boolean r(ParsableByteArray parsableByteArray) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f57861O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final VorbisUtil.VorbisIdHeader f57862n;
        public final VorbisUtil.Mode[] nr;
        public final VorbisUtil.CommentHeader rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte[] f57863t;

        public j(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i2) {
            this.f57862n = vorbisIdHeader;
            this.rl = commentHeader;
            this.f57863t = bArr;
            this.nr = modeArr;
            this.f57861O = i2;
        }
    }

    private static int HI(byte b2, j jVar) {
        return !jVar.nr[ck(b2, jVar.f57861O, 1)].blockFlag ? jVar.f57862n.blockSize0 : jVar.f57862n.blockSize1;
    }

    j Ik(ParsableByteArray parsableByteArray) throws ParserException {
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.Ik;
        if (vorbisIdHeader == null) {
            this.Ik = VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        VorbisUtil.CommentHeader commentHeader = this.f57860r;
        if (commentHeader == null) {
            this.f57860r = VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        return new j(vorbisIdHeader, commentHeader, bArr, VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels), VorbisUtil.iLog(r4.length - 1));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected boolean xMQ(ParsableByteArray parsableByteArray, long j2, CN3.n nVar) throws ParserException {
        if (this.ty != null) {
            Assertions.checkNotNull(nVar.f57856n);
            return false;
        }
        j jVarIk = Ik(parsableByteArray);
        this.ty = jVarIk;
        if (jVarIk == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = jVarIk.f57862n;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(jVarIk.f57863t);
        nVar.f57856n = new Format.Builder().setSampleMimeType("audio/vorbis").setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(VorbisUtil.parseVorbisComments(nKK.HI(jVarIk.rl.comments))).build();
        return true;
    }

    fuX() {
    }

    static void ty(ParsableByteArray parsableByteArray, long j2) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j2 & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j2 >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j2 >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j2 >>> 24) & 255);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected long J2(ParsableByteArray parsableByteArray) {
        int i2 = 0;
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iHI = HI(parsableByteArray.getData()[0], (j) Assertions.checkStateNotNull(this.ty));
        if (this.ck) {
            i2 = (this.HI + iHI) / 4;
        }
        long j2 = i2;
        ty(parsableByteArray, j2);
        this.ck = true;
        this.HI = iHI;
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected void O(long j2) {
        boolean z2;
        super.O(j2);
        int i2 = 0;
        if (j2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ck = z2;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.Ik;
        if (vorbisIdHeader != null) {
            i2 = vorbisIdHeader.blockSize0;
        }
        this.HI = i2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.CN3
    protected void qie(boolean z2) {
        super.qie(z2);
        if (z2) {
            this.ty = null;
            this.Ik = null;
            this.f57860r = null;
        }
        this.HI = 0;
        this.ck = false;
    }
}
