package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Cea608Decoder extends w6 {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;

    @Nullable
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;

    @Nullable
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, b.f61769v, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 235, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<j> cueBuilders = new ArrayList<>();
    private j currentCueBuilder = new j(0, 4);
    private int currentChannel = 0;

    private static final class j {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58267O;
        private int Uo;
        private int nr;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f58268n = new ArrayList();
        private final List rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final StringBuilder f58269t = new StringBuilder();

        private static void ty(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i5) {
            if (i5 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i2, i3, 33);
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.Cea608Decoder$j$j, reason: collision with other inner class name */
        private static class C0770j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final int f58270n;
            public final boolean rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f58271t;

            public C0770j(int i2, boolean z2, int i3) {
                this.f58270n = i2;
                this.rl = z2;
                this.f58271t = i3;
            }
        }

        private static void HI(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        private static void Ik(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        private SpannableString KN() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f58269t);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i5 = -1;
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = false;
            while (i8 < this.f58268n.size()) {
                C0770j c0770j = (C0770j) this.f58268n.get(i8);
                boolean z3 = c0770j.rl;
                int i10 = c0770j.f58270n;
                if (i10 != 8) {
                    boolean z4 = i10 == 7;
                    if (i10 != 7) {
                        i7 = Cea608Decoder.STYLE_COLORS[i10];
                    }
                    z2 = z4;
                }
                int i11 = c0770j.f58271t;
                i8++;
                if (i11 != (i8 < this.f58268n.size() ? ((C0770j) this.f58268n.get(i8)).f58271t : length)) {
                    if (i2 != -1 && !z3) {
                        Ik(spannableStringBuilder, i2, i11);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i11;
                    }
                    if (i3 != -1 && !z2) {
                        HI(spannableStringBuilder, i3, i11);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i11;
                    }
                    if (i7 != i5) {
                        ty(spannableStringBuilder, i9, i11, i5);
                        i5 = i7;
                        i9 = i11;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                Ik(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                HI(spannableStringBuilder, i3, length);
            }
            if (i9 != length) {
                ty(spannableStringBuilder, i9, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void J2() {
            int length = this.f58269t.length();
            if (length > 0) {
                this.f58269t.delete(length - 1, length);
                for (int size = this.f58268n.size() - 1; size >= 0; size--) {
                    C0770j c0770j = (C0770j) this.f58268n.get(size);
                    int i2 = c0770j.f58271t;
                    if (i2 != length) {
                        return;
                    }
                    c0770j.f58271t = i2 - 1;
                }
            }
        }

        public void O(char c2) {
            if (this.f58269t.length() < 32) {
                this.f58269t.append(c2);
            }
        }

        public Cue Uo(int i2) {
            float f3;
            int i3 = this.f58267O + this.J2;
            int i5 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < this.rl.size(); i7++) {
                spannableStringBuilder.append(Util.truncateAscii((CharSequence) this.rl.get(i7), i5));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(Util.truncateAscii(KN(), i5));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i5 - spannableStringBuilder.length();
            int i8 = i3 - length;
            if (i2 == Integer.MIN_VALUE) {
                i2 = (this.Uo != 2 || (Math.abs(i8) >= 3 && length >= 0)) ? (this.Uo != 2 || i8 <= 0) ? 0 : 2 : 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length;
                }
                f3 = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f3 = 0.5f;
            }
            int i9 = this.nr;
            if (i9 > 7) {
                i9 -= 17;
            } else if (this.Uo == 1) {
                i9 -= this.KN - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i9, 1).setPosition(f3).setPositionAnchor(i2).build();
        }

        public void az(int i2) {
            this.KN = i2;
        }

        public void ck(int i2, boolean z2) {
            this.f58268n.add(new C0770j(i2, z2, this.f58269t.length()));
        }

        public void gh() {
            this.rl.add(KN());
            this.f58269t.setLength(0);
            this.f58268n.clear();
            int iMin = Math.min(this.KN, this.nr);
            while (this.rl.size() >= iMin) {
                this.rl.remove(0);
            }
        }

        public void mUb(int i2) {
            this.Uo = i2;
            this.f58268n.clear();
            this.rl.clear();
            this.f58269t.setLength(0);
            this.nr = 15;
            this.f58267O = 0;
            this.J2 = 0;
        }

        public void qie(int i2) {
            this.Uo = i2;
        }

        public boolean xMQ() {
            return this.f58268n.isEmpty() && this.rl.isEmpty() && this.f58269t.length() == 0;
        }

        public j(int i2, int i3) {
            mUb(i2);
            this.KN = i3;
        }
    }

    private static int getChannel(byte b2) {
        return (b2 >> 3) & 1;
    }

    private static boolean isCtrlCode(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b2, byte b4) {
        return (b2 & 246) == 18 && (b4 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b2, byte b4) {
        return (b2 & 247) == 17 && (b4 & 240) == 32;
    }

    private static boolean isMiscCode(byte b2, byte b4) {
        return (b2 & 246) == 20 && (b4 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b2, byte b4) {
        return (b2 & 240) == 16 && (b4 & 192) == 64;
    }

    private static boolean isRepeatable(byte b2) {
        return (b2 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z2, byte b2, byte b4) {
        if (!z2 || !isRepeatable(b2)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b2 && this.repeatableControlCc2 == b4) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b2;
            this.repeatableControlCc2 = b4;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b2) {
        return (b2 & 247) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b2, byte b4) {
        return (b2 & 247) == 17 && (b4 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b2, byte b4) {
        return (b2 & 247) == 23 && b4 >= 33 && b4 <= 35;
    }

    private static boolean isXdsControlCode(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    private static char getBasicChar(byte b2) {
        return (char) BASIC_CHARACTER_SET[(b2 & ByteCompanionObject.MAX_VALUE) - 32];
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueUo = this.cueBuilders.get(i2).Uo(Integer.MIN_VALUE);
            arrayList.add(cueUo);
            if (cueUo != null) {
                iMin = Math.min(iMin, cueUo.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cue = (Cue) arrayList.get(i3);
            if (cue != null) {
                if (cue.positionAnchor != iMin) {
                    cue = (Cue) Assertions.checkNotNull(this.cueBuilders.get(i3).Uo(iMin));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b2) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b2 & 31];
    }

    private static char getExtendedPtDeChar(byte b2) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b2 & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b2, byte b4) {
        return (b2 & 1) == 0 ? getExtendedEsFrChar(b4) : getExtendedPtDeChar(b4);
    }

    private static char getSpecialNorthAmericanChar(byte b2) {
        return (char) SPECIAL_CHARACTER_SET[b2 & 15];
    }

    private void handleMidrowCtrl(byte b2) {
        this.currentCueBuilder.O(' ');
        this.currentCueBuilder.ck((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void handleMiscCode(byte b2) {
        if (b2 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b2 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b2) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i2 = this.captionMode;
                if (i2 != 0) {
                    if (b2 != 33) {
                        switch (b2) {
                            case 44:
                                this.cues = Collections.EMPTY_LIST;
                                if (i2 == 1 || i2 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i2 == 1 && !this.currentCueBuilder.xMQ()) {
                                    this.currentCueBuilder.gh();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.currentCueBuilder.J2();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b2, byte b4) {
        int i2 = ROW_INDICES[b2 & 7];
        if ((b4 & CTRL_RESUME_CAPTION_LOADING) != 0) {
            i2++;
        }
        if (i2 != this.currentCueBuilder.nr) {
            if (this.captionMode != 1 && !this.currentCueBuilder.xMQ()) {
                j jVar = new j(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = jVar;
                this.cueBuilders.add(jVar);
            }
            this.currentCueBuilder.nr = i2;
        }
        boolean z2 = (b4 & 16) == 16;
        boolean z3 = (b4 & 1) == 1;
        int i3 = (b4 >> 1) & 7;
        this.currentCueBuilder.ck(z2 ? 8 : i3, z3);
        if (z2) {
            this.currentCueBuilder.f58267O = COLUMN_INDICES[i3];
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.mUb(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i2) {
        int i3 = this.captionMode;
        if (i3 == i2) {
            return;
        }
        this.captionMode = i2;
        if (i2 == 3) {
            for (int i5 = 0; i5 < this.cueBuilders.size(); i5++) {
                this.cueBuilders.get(i5).qie(i2);
            }
            return;
        }
        resetCueBuilders();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.cues = Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i2) {
        this.captionRowCount = i2;
        this.currentCueBuilder.az(i2);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == -9223372036854775807L || this.lastCueUpdateUs == -9223372036854775807L || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    protected Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new Ml((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // com.google.android.exoplayer2.text.cea.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void decode(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z2 = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i2 = this.packetLength;
            if (iBytesLeft < i2) {
                break;
            }
            byte unsignedByte = i2 == 2 ? CC_IMPLICIT_DATA_HEADER : (byte) this.ccData.readUnsignedByte();
            int unsignedByte2 = this.ccData.readUnsignedByte();
            int unsignedByte3 = this.ccData.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.selectedField) {
                byte b2 = (byte) (unsignedByte2 & 127);
                byte b4 = (byte) (unsignedByte3 & 127);
                if (b2 != 0 || b4 != 0) {
                    boolean z3 = this.isCaptionValid;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        boolean z4 = zArr[unsignedByte2] && zArr[unsignedByte3];
                        this.isCaptionValid = z4;
                        if (!isRepeatedCommand(z4, b2, b4)) {
                            if (this.isCaptionValid) {
                                maybeUpdateIsInCaptionService(b2, b4);
                                if (this.isInCaptionService && updateAndVerifyCurrentChannel(b2)) {
                                    if (!isCtrlCode(b2)) {
                                        this.currentCueBuilder.O(getBasicChar(b2));
                                        if ((b4 & 224) != 0) {
                                            this.currentCueBuilder.O(getBasicChar(b4));
                                        }
                                    } else if (isSpecialNorthAmericanChar(b2, b4)) {
                                        this.currentCueBuilder.O(getSpecialNorthAmericanChar(b4));
                                    } else if (isExtendedWestEuropeanChar(b2, b4)) {
                                        this.currentCueBuilder.J2();
                                        this.currentCueBuilder.O(getExtendedWestEuropeanChar(b2, b4));
                                    } else if (isMidrowCtrlCode(b2, b4)) {
                                        handleMidrowCtrl(b4);
                                    } else if (isPreambleAddressCode(b2, b4)) {
                                        handlePreambleAddressCode(b2, b4);
                                    } else if (isTabCtrlCode(b2, b4)) {
                                        this.currentCueBuilder.J2 = b4 - 32;
                                    } else if (isMiscCode(b2, b4)) {
                                        handleMiscCode(b4);
                                    }
                                    z2 = true;
                                }
                            } else if (z3) {
                                resetCueBuilders();
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
        if (z2) {
            int i3 = this.captionMode;
            if (i3 == 1 || i3 == 3) {
                this.cues = getDisplayCues();
                this.lastCueUpdateUs = getPositionUs();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = -9223372036854775807L;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    protected boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    public Cea608Decoder(String str, int i2, long j2) {
        long j3;
        int i3;
        if (j2 > 0) {
            j3 = j2 * 1000;
        } else {
            j3 = -9223372036854775807L;
        }
        this.validDataChannelTimeoutUs = j3;
        if ("application/x-mp4-cea-608".equals(str)) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        this.packetLength = i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        Log.w(TAG, "Invalid channel. Defaulting to CC1.");
                        this.selectedChannel = 0;
                        this.selectedField = 0;
                    } else {
                        this.selectedChannel = 1;
                        this.selectedField = 1;
                    }
                } else {
                    this.selectedChannel = 0;
                    this.selectedField = 1;
                }
            } else {
                this.selectedChannel = 1;
                this.selectedField = 0;
            }
        } else {
            this.selectedChannel = 0;
            this.selectedField = 0;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    private void maybeUpdateIsInCaptionService(byte b2, byte b4) {
        if (isXdsControlCode(b2)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b2)) {
            if (b4 != 32 && b4 != 47) {
                switch (b4) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b4) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private boolean updateAndVerifyCurrentChannel(byte b2) {
        if (isCtrlCode(b2)) {
            this.currentChannel = getChannel(b2);
        }
        if (this.currentChannel == this.selectedChannel) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.w6
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.w6, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j2) {
        super.setPositionUs(j2);
    }
}
