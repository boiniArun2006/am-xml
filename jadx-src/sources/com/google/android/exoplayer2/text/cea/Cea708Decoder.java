package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Cea708Decoder extends com.google.android.exoplayer2.text.cea.w6 {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final String TAG = "Cea708Decoder";
    private final n[] cueInfoBuilders;

    @Nullable
    private List<Cue> cues;
    private n currentCueInfoBuilder;

    @Nullable
    private w6 currentDtvCcPacket;
    private int currentWindow;
    private final boolean isWideAspectRatio;

    @Nullable
    private List<Cue> lastCues;
    private final int selectedServiceNumber;
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ParsableBitArray captionChannelPacketData = new ParsableBitArray();
    private int previousSequenceNumber = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class j {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Comparator f58272t = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Cea708Decoder.j) obj2).rl, ((Cea708Decoder.j) obj).rl);
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Cue f58273n;
        public final int rl;

        public j(CharSequence charSequence, Layout.Alignment alignment, float f3, int i2, int i3, float f4, int i5, float f5, boolean z2, int i7, int i8) {
            Cue.Builder size = new Cue.Builder().setText(charSequence).setTextAlignment(alignment).setLine(f3, i2).setLineAnchor(i3).setPosition(f4).setPositionAnchor(i5).setSize(f5);
            if (z2) {
                size.setWindowColor(i7);
            }
            this.f58273n = size.build();
            this.rl = i8;
        }
    }

    private static final class n {
        private static final int[] E2;
        public static final int ViF;
        public static final int WPU = KN(2, 2, 2, 0);

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final int[] f58274X;
        public static final int aYN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f58275e;
        private static final int[] fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f58276g;
        private static final boolean[] iF;
        private static final int[] nY;
        private static final int[] te;
        private int HI;
        private int Ik;
        private boolean J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58277O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f58278S;
        private int Uo;
        private int XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f58279Z;
        private int az;
        private int ck;
        private boolean gh;
        private int mUb;
        private boolean nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f58281o;
        private int qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f58282r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58283t;
        private int ty;
        private int xMQ;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f58280n = new ArrayList();
        private final SpannableStringBuilder rl = new SpannableStringBuilder();

        static {
            int iKN = KN(0, 0, 0, 0);
            aYN = iKN;
            int iKN2 = KN(0, 0, 0, 3);
            ViF = iKN2;
            nY = new int[]{0, 0, 0, 0, 0, 2, 0};
            f58276g = new int[]{0, 0, 0, 0, 0, 0, 2};
            te = new int[]{3, 3, 3, 3, 3, 3, 1};
            iF = new boolean[]{false, false, false, true, true, true, false};
            fD = new int[]{iKN, iKN2, iKN, iKN, iKN2, iKN, iKN};
            E2 = new int[]{0, 1, 2, 3, 4, 3, 4};
            f58275e = new int[]{0, 0, 0, 0, 0, 3, 3};
            f58274X = new int[]{iKN, iKN, iKN, iKN, iKN, iKN2, iKN2};
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int KN(int i2, int i3, int i5, int i7) {
            int i8;
            Assertions.checkIndex(i2, 0, 4);
            Assertions.checkIndex(i3, 0, 4);
            Assertions.checkIndex(i5, 0, 4);
            Assertions.checkIndex(i7, 0, 4);
            if (i7 == 0 || i7 == 1) {
                i8 = 255;
            } else if (i7 == 2) {
                i8 = 127;
            } else if (i7 == 3) {
                i8 = 0;
            }
            return Color.argb(i8, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i5 > 1 ? 255 : 0);
        }

        public static int Uo(int i2, int i3, int i5) {
            return KN(i2, i3, i5, 0);
        }

        public void HI(int i2, int i3) {
            if (this.f58278S != i2) {
                n('\n');
            }
            this.f58278S = i2;
        }

        public void Ik(int i2, int i3, boolean z2, int i5, int i7, int i8, int i9) {
            this.HI = i2;
            this.qie = i9;
        }

        public void J2(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
            this.f58283t = true;
            this.nr = z2;
            this.gh = z3;
            this.f58277O = i2;
            this.J2 = z5;
            this.Uo = i3;
            this.KN = i5;
            this.xMQ = i9;
            int i12 = i7 + 1;
            if (this.mUb != i12) {
                this.mUb = i12;
                while (true) {
                    if ((!z3 || this.f58280n.size() < this.mUb) && this.f58280n.size() < 15) {
                        break;
                    } else {
                        this.f58280n.remove(0);
                    }
                }
            }
            if (i10 != 0 && this.az != i10) {
                this.az = i10;
                int i13 = i10 - 1;
                Ik(fD[i13], ViF, iF[i13], 0, f58276g[i13], te[i13], nY[i13]);
            }
            if (i11 == 0 || this.ty == i11) {
                return;
            }
            this.ty = i11;
            int i14 = i11 - 1;
            az(0, 1, 1, false, false, f58275e[i14], E2[i14]);
            ty(WPU, f58274X[i14], aYN);
        }

        public void O() {
            this.f58280n.clear();
            this.rl.clear();
            this.ck = -1;
            this.Ik = -1;
            this.f58282r = -1;
            this.f58279Z = -1;
            this.f58278S = 0;
        }

        public void az(int i2, int i3, int i5, boolean z2, boolean z3, int i7, int i8) {
            if (this.ck != -1) {
                if (!z2) {
                    this.rl.setSpan(new StyleSpan(2), this.ck, this.rl.length(), 33);
                    this.ck = -1;
                }
            } else if (z2) {
                this.ck = this.rl.length();
            }
            if (this.Ik == -1) {
                if (z3) {
                    this.Ik = this.rl.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.rl.setSpan(new UnderlineSpan(), this.Ik, this.rl.length(), 33);
                this.Ik = -1;
            }
        }

        public void ck(boolean z2) {
            this.nr = z2;
        }

        public boolean gh() {
            return this.nr;
        }

        public void n(char c2) {
            if (c2 != '\n') {
                this.rl.append(c2);
                return;
            }
            this.f58280n.add(nr());
            this.rl.clear();
            if (this.ck != -1) {
                this.ck = 0;
            }
            if (this.Ik != -1) {
                this.Ik = 0;
            }
            if (this.f58282r != -1) {
                this.f58282r = 0;
            }
            if (this.f58279Z != -1) {
                this.f58279Z = 0;
            }
            while (true) {
                if ((!this.gh || this.f58280n.size() < this.mUb) && this.f58280n.size() < 15) {
                    return;
                } else {
                    this.f58280n.remove(0);
                }
            }
        }

        public SpannableString nr() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.rl);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.ck != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.ck, length, 33);
                }
                if (this.Ik != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.Ik, length, 33);
                }
                if (this.f58282r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f58281o), this.f58282r, length, 33);
                }
                if (this.f58279Z != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.XQ), this.f58279Z, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void rl() {
            int length = this.rl.length();
            if (length > 0) {
                this.rl.delete(length - 1, length);
            }
        }

        public void ty(int i2, int i3, int i5) {
            if (this.f58282r != -1 && this.f58281o != i2) {
                this.rl.setSpan(new ForegroundColorSpan(this.f58281o), this.f58282r, this.rl.length(), 33);
            }
            if (i2 != WPU) {
                this.f58282r = this.rl.length();
                this.f58281o = i2;
            }
            if (this.f58279Z != -1 && this.XQ != i3) {
                this.rl.setSpan(new BackgroundColorSpan(this.XQ), this.f58279Z, this.rl.length(), 33);
            }
            if (i3 != aYN) {
                this.f58279Z = this.rl.length();
                this.XQ = i3;
            }
        }

        public boolean xMQ() {
            return this.f58283t;
        }

        public n() {
            qie();
        }

        public boolean mUb() {
            if (xMQ()) {
                if (!this.f58280n.isEmpty() || this.rl.length() != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public void qie() {
            O();
            this.f58283t = false;
            this.nr = false;
            this.f58277O = 4;
            this.J2 = false;
            this.Uo = 0;
            this.KN = 0;
            this.xMQ = 0;
            this.mUb = 15;
            this.gh = true;
            this.qie = 0;
            this.az = 0;
            this.ty = 0;
            int i2 = aYN;
            this.HI = i2;
            this.f58281o = WPU;
            this.XQ = i2;
        }

        public j t() {
            Layout.Alignment alignment;
            float f3;
            float f4;
            int i2;
            float f5;
            int i3;
            boolean z2;
            if (mUb()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f58280n.size(); i5++) {
                spannableStringBuilder.append((CharSequence) this.f58280n.get(i5));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) nr());
            int i7 = this.qie;
            int i8 = 2;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.qie);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.J2) {
                f3 = this.KN / 99.0f;
                f4 = this.Uo / 99.0f;
            } else {
                f3 = this.KN / 209.0f;
                f4 = this.Uo / 74.0f;
            }
            float f6 = (f3 * 0.9f) + 0.05f;
            float f7 = (f4 * 0.9f) + 0.05f;
            int i9 = this.xMQ;
            if (i9 / 3 == 0) {
                i2 = i9;
                f5 = f6;
                i3 = 0;
            } else if (i9 / 3 == 1) {
                i2 = i9;
                f5 = f6;
                i3 = 1;
            } else {
                i2 = i9;
                f5 = f6;
                i3 = 2;
            }
            if (i2 % 3 == 0) {
                i8 = 0;
            } else if (i2 % 3 == 1) {
                i8 = 1;
            }
            if (this.HI != aYN) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new j(spannableStringBuilder, alignment, f7, 0, i3, f5, i8, -3.4028235E38f, z2, this.HI, this.f58277O);
        }
    }

    private void handleC2Command(int i2) {
        if (i2 <= 7) {
            return;
        }
        if (i2 <= 15) {
            this.captionChannelPacketData.skipBits(8);
        } else if (i2 <= 23) {
            this.captionChannelPacketData.skipBits(16);
        } else if (i2 <= 31) {
            this.captionChannelPacketData.skipBits(24);
        }
    }

    private void resetCueBuilders() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.cueInfoBuilders[i2].qie();
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58284n;
        int nr = 0;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte[] f58285t;

        public w6(int i2, int i3) {
            this.f58284n = i2;
            this.rl = i3;
            this.f58285t = new byte[(i3 * 2) - 1];
        }
    }

    private void finalizeCurrentPacket() {
        if (this.currentDtvCcPacket == null) {
            return;
        }
        processCurrentPacket();
        this.currentDtvCcPacket = null;
    }

    private List<Cue> getDisplayCues() {
        j jVarT;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.cueInfoBuilders[i2].mUb() && this.cueInfoBuilders[i2].gh() && (jVarT = this.cueInfoBuilders[i2].t()) != null) {
                arrayList.add(jVarT);
            }
        }
        Collections.sort(arrayList, j.f58272t);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((j) arrayList.get(i3)).f58273n);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void handleC0Command(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.cues = getDisplayCues();
                return;
            }
            if (i2 == 8) {
                this.currentCueInfoBuilder.rl();
                return;
            }
            switch (i2) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.currentCueInfoBuilder.n('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i2 >= 17 && i2 <= 23) {
                        Log.w(TAG, "Currently unsupported COMMAND_EXT1 Command: " + i2);
                        this.captionChannelPacketData.skipBits(8);
                    } else if (i2 >= 24 && i2 <= 31) {
                        Log.w(TAG, "Currently unsupported COMMAND_P16 Command: " + i2);
                        this.captionChannelPacketData.skipBits(16);
                    } else {
                        Log.w(TAG, "Invalid C0 command: " + i2);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void handleC1Command(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i5 = i2 - 128;
                if (this.currentWindow != i5) {
                    this.currentWindow = i5;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i5];
                }
                break;
            case 136:
                while (i3 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i3].O();
                    }
                    i3++;
                }
                break;
            case 137:
                for (int i7 = 1; i7 <= 8; i7++) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i7].ck(true);
                    }
                }
                break;
            case 138:
                while (i3 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i3].ck(false);
                    }
                    i3++;
                }
                break;
            case 139:
                for (int i8 = 1; i8 <= 8; i8++) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i8].ck(!r0.gh());
                    }
                }
                break;
            case COMMAND_DLW /* 140 */:
                while (i3 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i3].qie();
                    }
                    i3++;
                }
                break;
            case COMMAND_DLY /* 141 */:
                this.captionChannelPacketData.skipBits(8);
                break;
            case COMMAND_DLC /* 142 */:
                break;
            case COMMAND_RST /* 143 */:
                resetCueBuilders();
                break;
            case COMMAND_SPA /* 144 */:
                if (this.currentCueInfoBuilder.xMQ()) {
                    handleSetPenAttributes();
                } else {
                    this.captionChannelPacketData.skipBits(16);
                }
                break;
            case COMMAND_SPC /* 145 */:
                if (this.currentCueInfoBuilder.xMQ()) {
                    handleSetPenColor();
                } else {
                    this.captionChannelPacketData.skipBits(24);
                }
                break;
            case COMMAND_SPL /* 146 */:
                if (this.currentCueInfoBuilder.xMQ()) {
                    handleSetPenLocation();
                } else {
                    this.captionChannelPacketData.skipBits(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                Log.w(TAG, "Invalid C1 command: " + i2);
                break;
            case COMMAND_SWA /* 151 */:
                if (this.currentCueInfoBuilder.xMQ()) {
                    handleSetWindowAttributes();
                } else {
                    this.captionChannelPacketData.skipBits(32);
                }
                break;
            case 152:
            case COMMAND_DF1 /* 153 */:
            case COMMAND_DF2 /* 154 */:
            case COMMAND_DF3 /* 155 */:
            case COMMAND_DF4 /* 156 */:
            case COMMAND_DF5 /* 157 */:
            case COMMAND_DF6 /* 158 */:
            case 159:
                int i9 = i2 - 152;
                handleDefineWindow(i9);
                if (this.currentWindow != i9) {
                    this.currentWindow = i9;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i9];
                }
                break;
        }
    }

    private void handleC3Command(int i2) {
        if (i2 <= 135) {
            this.captionChannelPacketData.skipBits(32);
            return;
        }
        if (i2 <= COMMAND_RST) {
            this.captionChannelPacketData.skipBits(40);
        } else if (i2 <= 159) {
            this.captionChannelPacketData.skipBits(2);
            this.captionChannelPacketData.skipBits(this.captionChannelPacketData.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i2) {
        n nVar = this.cueInfoBuilders[i2];
        this.captionChannelPacketData.skipBits(2);
        boolean bit = this.captionChannelPacketData.readBit();
        boolean bit2 = this.captionChannelPacketData.readBit();
        boolean bit3 = this.captionChannelPacketData.readBit();
        int bits = this.captionChannelPacketData.readBits(3);
        boolean bit4 = this.captionChannelPacketData.readBit();
        int bits2 = this.captionChannelPacketData.readBits(7);
        int bits3 = this.captionChannelPacketData.readBits(8);
        int bits4 = this.captionChannelPacketData.readBits(4);
        int bits5 = this.captionChannelPacketData.readBits(4);
        this.captionChannelPacketData.skipBits(2);
        int bits6 = this.captionChannelPacketData.readBits(6);
        this.captionChannelPacketData.skipBits(2);
        nVar.J2(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.captionChannelPacketData.readBits(3), this.captionChannelPacketData.readBits(3));
    }

    private void handleG0Character(int i2) {
        if (i2 == 127) {
            this.currentCueInfoBuilder.n((char) 9835);
        } else {
            this.currentCueInfoBuilder.n((char) (i2 & 255));
        }
    }

    private void handleG1Character(int i2) {
        this.currentCueInfoBuilder.n((char) (i2 & 255));
    }

    private void handleG2Character(int i2) {
        if (i2 == 32) {
            this.currentCueInfoBuilder.n(' ');
            return;
        }
        if (i2 == 33) {
            this.currentCueInfoBuilder.n(Typography.nbsp);
            return;
        }
        if (i2 == 37) {
            this.currentCueInfoBuilder.n(Typography.ellipsis);
            return;
        }
        if (i2 == 42) {
            this.currentCueInfoBuilder.n((char) 352);
            return;
        }
        if (i2 == 44) {
            this.currentCueInfoBuilder.n((char) 338);
            return;
        }
        if (i2 == 63) {
            this.currentCueInfoBuilder.n((char) 376);
            return;
        }
        if (i2 == 57) {
            this.currentCueInfoBuilder.n(Typography.tm);
            return;
        }
        if (i2 == 58) {
            this.currentCueInfoBuilder.n((char) 353);
            return;
        }
        if (i2 == 60) {
            this.currentCueInfoBuilder.n((char) 339);
            return;
        }
        if (i2 == 61) {
            this.currentCueInfoBuilder.n((char) 8480);
            return;
        }
        switch (i2) {
            case 48:
                this.currentCueInfoBuilder.n((char) 9608);
                break;
            case 49:
                this.currentCueInfoBuilder.n(Typography.leftSingleQuote);
                break;
            case 50:
                this.currentCueInfoBuilder.n(Typography.rightSingleQuote);
                break;
            case 51:
                this.currentCueInfoBuilder.n(Typography.leftDoubleQuote);
                break;
            case 52:
                this.currentCueInfoBuilder.n(Typography.rightDoubleQuote);
                break;
            case 53:
                this.currentCueInfoBuilder.n(Typography.bullet);
                break;
            default:
                switch (i2) {
                    case 118:
                        this.currentCueInfoBuilder.n((char) 8539);
                        break;
                    case 119:
                        this.currentCueInfoBuilder.n((char) 8540);
                        break;
                    case 120:
                        this.currentCueInfoBuilder.n((char) 8541);
                        break;
                    case 121:
                        this.currentCueInfoBuilder.n((char) 8542);
                        break;
                    case 122:
                        this.currentCueInfoBuilder.n((char) 9474);
                        break;
                    case 123:
                        this.currentCueInfoBuilder.n((char) 9488);
                        break;
                    case 124:
                        this.currentCueInfoBuilder.n((char) 9492);
                        break;
                    case 125:
                        this.currentCueInfoBuilder.n((char) 9472);
                        break;
                    case 126:
                        this.currentCueInfoBuilder.n((char) 9496);
                        break;
                    case 127:
                        this.currentCueInfoBuilder.n((char) 9484);
                        break;
                    default:
                        Log.w(TAG, "Invalid G2 character: " + i2);
                        break;
                }
                break;
        }
    }

    private void handleG3Character(int i2) {
        if (i2 == 160) {
            this.currentCueInfoBuilder.n((char) 13252);
            return;
        }
        Log.w(TAG, "Invalid G3 character: " + i2);
        this.currentCueInfoBuilder.n('_');
    }

    private void handleSetPenAttributes() {
        this.currentCueInfoBuilder.az(this.captionChannelPacketData.readBits(4), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBit(), this.captionChannelPacketData.readBit(), this.captionChannelPacketData.readBits(3), this.captionChannelPacketData.readBits(3));
    }

    private void handleSetPenColor() {
        int iKN = n.KN(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        int iKN2 = n.KN(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        this.captionChannelPacketData.skipBits(2);
        this.currentCueInfoBuilder.ty(iKN, iKN2, n.Uo(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.captionChannelPacketData.skipBits(4);
        int bits = this.captionChannelPacketData.readBits(4);
        this.captionChannelPacketData.skipBits(2);
        this.currentCueInfoBuilder.HI(bits, this.captionChannelPacketData.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int iKN = n.KN(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        int bits = this.captionChannelPacketData.readBits(2);
        int iUo = n.Uo(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        if (this.captionChannelPacketData.readBit()) {
            bits |= 4;
        }
        boolean bit = this.captionChannelPacketData.readBit();
        int bits2 = this.captionChannelPacketData.readBits(2);
        int bits3 = this.captionChannelPacketData.readBits(2);
        int bits4 = this.captionChannelPacketData.readBits(2);
        this.captionChannelPacketData.skipBits(8);
        this.currentCueInfoBuilder.Ik(iKN, iUo, bit, bits, bits2, bits3, bits4);
    }

    private void processCurrentPacket() {
        w6 w6Var = this.currentDtvCcPacket;
        if (w6Var.nr != (w6Var.rl * 2) - 1) {
            Log.d(TAG, "DtvCcPacket ended prematurely; size is " + ((this.currentDtvCcPacket.rl * 2) - 1) + ", but current index is " + this.currentDtvCcPacket.nr + " (sequence number " + this.currentDtvCcPacket.f58284n + ");");
        }
        ParsableBitArray parsableBitArray = this.captionChannelPacketData;
        w6 w6Var2 = this.currentDtvCcPacket;
        parsableBitArray.reset(w6Var2.f58285t, w6Var2.nr);
        boolean z2 = false;
        while (true) {
            if (this.captionChannelPacketData.bitsLeft() <= 0) {
                break;
            }
            int bits = this.captionChannelPacketData.readBits(3);
            int bits2 = this.captionChannelPacketData.readBits(5);
            if (bits == 7) {
                this.captionChannelPacketData.skipBits(2);
                bits = this.captionChannelPacketData.readBits(6);
                if (bits < 7) {
                    Log.w(TAG, "Invalid extended service number: " + bits);
                }
            }
            if (bits2 == 0) {
                if (bits != 0) {
                    Log.w(TAG, "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                }
            } else if (bits != this.selectedServiceNumber) {
                this.captionChannelPacketData.skipBytes(bits2);
            } else {
                int position = this.captionChannelPacketData.getPosition() + (bits2 * 8);
                while (this.captionChannelPacketData.getPosition() < position) {
                    int bits3 = this.captionChannelPacketData.readBits(8);
                    if (bits3 == 16) {
                        int bits4 = this.captionChannelPacketData.readBits(8);
                        if (bits4 <= 31) {
                            handleC2Command(bits4);
                        } else {
                            if (bits4 <= 127) {
                                handleG2Character(bits4);
                            } else if (bits4 <= 159) {
                                handleC3Command(bits4);
                            } else if (bits4 <= 255) {
                                handleG3Character(bits4);
                            } else {
                                Log.w(TAG, "Invalid extended command: " + bits4);
                            }
                            z2 = true;
                        }
                    } else if (bits3 <= 31) {
                        handleC0Command(bits3);
                    } else {
                        if (bits3 <= 127) {
                            handleG0Character(bits3);
                        } else if (bits3 <= 159) {
                            handleC1Command(bits3);
                        } else if (bits3 <= 255) {
                            handleG1Character(bits3);
                        } else {
                            Log.w(TAG, "Invalid base command: " + bits3);
                        }
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            this.cues = getDisplayCues();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    protected Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new Ml((List) Assertions.checkNotNull(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    protected void decode(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.ccData.bytesLeft() >= 3) {
            int unsignedByte = this.ccData.readUnsignedByte();
            int i2 = unsignedByte & 3;
            boolean z2 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.ccData.readUnsignedByte();
            byte unsignedByte3 = (byte) this.ccData.readUnsignedByte();
            if (i2 == 2 || i2 == 3) {
                if (z2) {
                    if (i2 == 3) {
                        finalizeCurrentPacket();
                        int i3 = (unsignedByte2 & 192) >> 6;
                        int i5 = this.previousSequenceNumber;
                        if (i5 != -1 && i3 != (i5 + 1) % 4) {
                            resetCueBuilders();
                            Log.w(TAG, "Sequence number discontinuity. previous=" + this.previousSequenceNumber + " current=" + i3);
                        }
                        this.previousSequenceNumber = i3;
                        int i7 = unsignedByte2 & 63;
                        if (i7 == 0) {
                            i7 = 64;
                        }
                        w6 w6Var = new w6(i3, i7);
                        this.currentDtvCcPacket = w6Var;
                        byte[] bArr = w6Var.f58285t;
                        int i8 = w6Var.nr;
                        w6Var.nr = i8 + 1;
                        bArr[i8] = unsignedByte3;
                    } else {
                        Assertions.checkArgument(i2 == 2);
                        w6 w6Var2 = this.currentDtvCcPacket;
                        if (w6Var2 == null) {
                            Log.e(TAG, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = w6Var2.f58285t;
                            int i9 = w6Var2.nr;
                            int i10 = i9 + 1;
                            w6Var2.nr = i10;
                            bArr2[i9] = unsignedByte2;
                            w6Var2.nr = i9 + 2;
                            bArr2[i10] = unsignedByte3;
                        }
                    }
                    w6 w6Var3 = this.currentDtvCcPacket;
                    if (w6Var3.nr == (w6Var3.rl * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    protected boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    public Cea708Decoder(int i2, @Nullable List<byte[]> list) {
        this.selectedServiceNumber = i2 == -1 ? 1 : i2;
        this.isWideAspectRatio = list != null && CodecSpecificDataUtil.parseCea708InitializationData(list);
        this.cueInfoBuilders = new n[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.cueInfoBuilders[i3] = new n();
        }
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        this.currentWindow = 0;
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
        resetCueBuilders();
        this.currentDtvCcPacket = null;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j2) {
        super.setPositionUs(j2);
    }
}
