package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final ParsableByteArray buffer;
    private final j cueBuilder;
    private final ParsableByteArray inflatedBuffer;

    @Nullable
    private Inflater inflater;

    private static final class j {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58313O;
        private int Uo;
        private int nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58315t;
        private int xMQ;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ParsableByteArray f58314n = new ParsableByteArray();
        private final int[] rl = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void O(ParsableByteArray parsableByteArray, int i2) {
            int unsignedInt24;
            if (i2 < 4) {
                return;
            }
            parsableByteArray.skipBytes(3);
            int i3 = i2 - 4;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                if (i3 < 7 || (unsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.KN = parsableByteArray.readUnsignedShort();
                this.xMQ = parsableByteArray.readUnsignedShort();
                this.f58314n.reset(unsignedInt24 - 4);
                i3 = i2 - 11;
            }
            int position = this.f58314n.getPosition();
            int iLimit = this.f58314n.limit();
            if (position >= iLimit || i3 <= 0) {
                return;
            }
            int iMin = Math.min(i3, iLimit - position);
            parsableByteArray.readBytes(this.f58314n.getData(), position, iMin);
            this.f58314n.setPosition(position + iMin);
        }

        public void KN() {
            this.nr = 0;
            this.f58313O = 0;
            this.J2 = 0;
            this.Uo = 0;
            this.KN = 0;
            this.xMQ = 0;
            this.f58314n.reset(0);
            this.f58315t = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2(ParsableByteArray parsableByteArray, int i2) {
            if (i2 < 19) {
                return;
            }
            this.nr = parsableByteArray.readUnsignedShort();
            this.f58313O = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(11);
            this.J2 = parsableByteArray.readUnsignedShort();
            this.Uo = parsableByteArray.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Uo(ParsableByteArray parsableByteArray, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            parsableByteArray.skipBytes(2);
            Arrays.fill(this.rl, 0);
            int i3 = i2 / 5;
            for (int i5 = 0; i5 < i3; i5++) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                double d2 = unsignedByte2;
                double d4 = unsignedByte3 - 128;
                double d5 = unsignedByte4 - 128;
                this.rl[unsignedByte] = (Util.constrainValue((int) ((d2 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255) << 8) | (parsableByteArray.readUnsignedByte() << 24) | (Util.constrainValue((int) ((1.402d * d4) + d2), 0, 255) << 16) | Util.constrainValue((int) (d2 + (d5 * 1.772d)), 0, 255);
            }
            this.f58315t = true;
        }

        public Cue nr() {
            int unsignedByte;
            if (this.nr == 0 || this.f58313O == 0 || this.KN == 0 || this.xMQ == 0 || this.f58314n.limit() == 0 || this.f58314n.getPosition() != this.f58314n.limit() || !this.f58315t) {
                return null;
            }
            this.f58314n.setPosition(0);
            int i2 = this.KN * this.xMQ;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int unsignedByte2 = this.f58314n.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i3 + 1;
                    iArr[i3] = this.rl[unsignedByte2];
                } else {
                    int unsignedByte3 = this.f58314n.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.f58314n.readUnsignedByte()) + i3;
                        Arrays.fill(iArr, i3, unsignedByte, (unsignedByte3 & 128) == 0 ? 0 : this.rl[this.f58314n.readUnsignedByte()]);
                    }
                }
                i3 = unsignedByte;
            }
            return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, this.KN, this.xMQ, Bitmap.Config.ARGB_8888)).setPosition(this.J2 / this.nr).setPositionAnchor(0).setLine(this.Uo / this.f58313O, 0).setLineAnchor(0).setSize(this.KN / this.nr).setBitmapHeight(this.xMQ / this.f58313O).build();
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.buffer = new ParsableByteArray();
        this.inflatedBuffer = new ParsableByteArray();
        this.cueBuilder = new j();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
        this.buffer.reset(bArr, i2);
        maybeInflateData(this.buffer);
        this.cueBuilder.KN();
        ArrayList arrayList = new ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            Cue nextSection = readNextSection(this.buffer, this.cueBuilder);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        return new com.google.android.exoplayer2.text.pgs.j(Collections.unmodifiableList(arrayList));
    }

    private void maybeInflateData(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120) {
            if (this.inflater == null) {
                this.inflater = new Inflater();
            }
            if (Util.inflate(parsableByteArray, this.inflatedBuffer, this.inflater)) {
                parsableByteArray.reset(this.inflatedBuffer.getData(), this.inflatedBuffer.limit());
            }
        }
    }

    @Nullable
    private static Cue readNextSection(ParsableByteArray parsableByteArray, j jVar) {
        int iLimit = parsableByteArray.limit();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition() + unsignedShort;
        Cue cueNr = null;
        if (position > iLimit) {
            parsableByteArray.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    jVar.Uo(parsableByteArray, unsignedShort);
                    break;
                case 21:
                    jVar.O(parsableByteArray, unsignedShort);
                    break;
                case 22:
                    jVar.J2(parsableByteArray, unsignedShort);
                    break;
            }
        } else {
            cueNr = jVar.nr();
            jVar.KN();
        }
        parsableByteArray.setPosition(position);
        return cueNr;
    }
}
