package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.nKK;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class VobsubParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DEFAULT_DURATION_US = 5000000;
    private static final String TAG = "VobsubParser";
    private final CueBuilder cueBuilder;

    @Nullable
    private Inflater inflater;
    private final ParsableByteArray scratch = new ParsableByteArray();
    private final ParsableByteArray inflatedScratch = new ParsableByteArray();

    private static final class CueBuilder {
        private static final int CMD_ALPHA = 4;
        private static final int CMD_AREA = 5;
        private static final int CMD_COLORS = 3;
        private static final int CMD_END = 255;
        private static final int CMD_FORCE_START = 0;
        private static final int CMD_OFFSETS = 6;
        private static final int CMD_START = 1;
        private static final int CMD_STOP = 2;

        @Nullable
        private Rect boundingBox;
        private final int[] colors = new int[4];
        private int dataOffset0 = -1;
        private int dataOffset1 = -1;
        private boolean hasColors;
        private boolean hasPlane;
        private int[] palette;
        private int planeHeight;
        private int planeWidth;

        private static final class Run {
            public int colorIndex;
            public int length;

            private Run() {
            }
        }

        private static void parseRun(ParsableBitArray parsableBitArray, int i2, Run run) {
            int bits = 0;
            for (int i3 = 1; bits < i3 && i3 <= 64; i3 <<= 2) {
                if (parsableBitArray.bitsLeft() < 4) {
                    run.colorIndex = -1;
                    run.length = 0;
                    return;
                }
                bits = (bits << 4) | parsableBitArray.readBits(4);
            }
            run.colorIndex = bits & 3;
            if (bits >= 4) {
                i2 = bits >> 2;
            }
            run.length = i2;
        }

        private static int setAlpha(int i2, int i3) {
            return (i2 & 16777215) | ((i3 * 17) << 24);
        }

        public void reset() {
            this.hasColors = false;
            this.boundingBox = null;
            this.dataOffset0 = -1;
            this.dataOffset1 = -1;
        }

        private static int getColor(int[] iArr, int i2) {
            return (i2 < 0 || i2 >= iArr.length) ? iArr[0] : iArr[i2];
        }

        private static int parseColor(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        @Nullable
        public Cue build(ParsableByteArray parsableByteArray) {
            Rect rect;
            if (this.palette == null || !this.hasPlane || !this.hasColors || (rect = this.boundingBox) == null || this.dataOffset0 == -1 || this.dataOffset1 == -1 || rect.width() < 2 || this.boundingBox.height() < 2) {
                return null;
            }
            Rect rect2 = this.boundingBox;
            int[] iArr = new int[rect2.width() * rect2.height()];
            ParsableBitArray parsableBitArray = new ParsableBitArray();
            parsableByteArray.setPosition(this.dataOffset0);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, true, rect2, iArr);
            parsableByteArray.setPosition(this.dataOffset1);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, false, rect2, iArr);
            return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).setPosition(rect2.left / this.planeWidth).setPositionAnchor(0).setLine(rect2.top / this.planeHeight, 0).setLineAnchor(0).setSize(rect2.width() / this.planeWidth).setBitmapHeight(rect2.height() / this.planeHeight).build();
        }

        public void parseSpu(ParsableByteArray parsableByteArray) {
            int[] iArr = this.palette;
            if (iArr == null || !this.hasPlane) {
                return;
            }
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() - 2);
            parseControl(iArr, parsableByteArray, parsableByteArray.readUnsignedShort());
        }

        private void parseControl(int[] iArr, ParsableByteArray parsableByteArray, int i2) {
            while (parsableByteArray.getPosition() < i2 && parsableByteArray.bytesLeft() > 0) {
                switch (parsableByteArray.readUnsignedByte()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!parseControlColors(iArr, parsableByteArray)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!parseControlAlpha(parsableByteArray)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!parseControlArea(parsableByteArray)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!parseControlOffsets(parsableByteArray)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean parseControlAlpha(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2 || !this.hasColors) {
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int[] iArr = this.colors;
            iArr[3] = setAlpha(iArr[3], unsignedByte >> 4);
            int[] iArr2 = this.colors;
            iArr2[2] = setAlpha(iArr2[2], unsignedByte & 15);
            int[] iArr3 = this.colors;
            iArr3[1] = setAlpha(iArr3[1], unsignedByte2 >> 4);
            int[] iArr4 = this.colors;
            iArr4[0] = setAlpha(iArr4[0], unsignedByte2 & 15);
            return true;
        }

        private boolean parseControlArea(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 6) {
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int i2 = (unsignedByte << 4) | (unsignedByte2 >> 4);
            int unsignedByte3 = ((unsignedByte2 & 15) << 8) | parsableByteArray.readUnsignedByte();
            int unsignedByte4 = parsableByteArray.readUnsignedByte();
            int unsignedByte5 = parsableByteArray.readUnsignedByte();
            this.boundingBox = new Rect(i2, (unsignedByte4 << 4) | (unsignedByte5 >> 4), unsignedByte3 + 1, (parsableByteArray.readUnsignedByte() | ((unsignedByte5 & 15) << 8)) + 1);
            return true;
        }

        private boolean parseControlColors(int[] iArr, ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            this.colors[3] = getColor(iArr, unsignedByte >> 4);
            this.colors[2] = getColor(iArr, unsignedByte & 15);
            this.colors[1] = getColor(iArr, unsignedByte2 >> 4);
            this.colors[0] = getColor(iArr, unsignedByte2 & 15);
            this.hasColors = true;
            return true;
        }

        private boolean parseControlOffsets(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 4) {
                return false;
            }
            this.dataOffset0 = parsableByteArray.readUnsignedShort();
            this.dataOffset1 = parsableByteArray.readUnsignedShort();
            return true;
        }

        private void parseRleData(ParsableBitArray parsableBitArray, boolean z2, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i2 = !z2 ? 1 : 0;
            int i3 = i2 * iWidth;
            Run run = new Run();
            while (true) {
                int i5 = 0;
                do {
                    parseRun(parsableBitArray, iWidth, run);
                    int iMin = Math.min(run.length, iWidth - i5);
                    if (iMin > 0) {
                        int i7 = i3 + iMin;
                        Arrays.fill(iArr, i3, i7, this.colors[run.colorIndex]);
                        i5 += iMin;
                        i3 = i7;
                    }
                } while (i5 < iWidth);
                i2 += 2;
                if (i2 >= iHeight) {
                    return;
                }
                i3 = i2 * iWidth;
                parsableBitArray.byteAlign();
            }
        }

        public void parseIdx(String str) {
            for (String str2 : Util.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrSplit = Util.split(str2.substring(9), ",");
                    this.palette = new int[strArrSplit.length];
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        this.palette[i2] = parseColor(strArrSplit[i2].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrSplit2 = Util.split(str2.substring(6).trim(), "x");
                    if (strArrSplit2.length == 2) {
                        try {
                            this.planeWidth = Integer.parseInt(strArrSplit2[0]);
                            this.planeHeight = Integer.parseInt(strArrSplit2[1]);
                            this.hasPlane = true;
                        } catch (RuntimeException e2) {
                            Log.w(VobsubParser.TAG, "Parsing IDX failed", e2);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.scratch.reset(bArr, i3 + i2);
        this.scratch.setPosition(i2);
        Cue cue = parse();
        consumer.accept(new CuesWithTiming(cue != null ? nKK.o(cue) : nKK.r(), -9223372036854775807L, DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US));
    }

    public VobsubParser(List<byte[]> list) {
        CueBuilder cueBuilder = new CueBuilder();
        this.cueBuilder = cueBuilder;
        cueBuilder.parseIdx(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @Nullable
    private Cue parse() {
        if (this.inflater == null) {
            this.inflater = new Inflater();
        }
        if (Util.maybeInflate(this.scratch, this.inflatedScratch, this.inflater)) {
            this.scratch.reset(this.inflatedScratch.getData(), this.inflatedScratch.limit());
        }
        this.cueBuilder.reset();
        int iBytesLeft = this.scratch.bytesLeft();
        if (iBytesLeft < 2 || this.scratch.readUnsignedShort() != iBytesLeft) {
            return null;
        }
        this.cueBuilder.parseSpu(this.scratch);
        return this.cueBuilder.build(this.scratch);
    }
}
