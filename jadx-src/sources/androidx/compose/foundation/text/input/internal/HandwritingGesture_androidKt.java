package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001b\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001e\u001a\u00020\u0000*\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a6\u0010 \u001a\u00020\u0000*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a(\u0010(\u001a\u00020\u0005*\u00020\u00102\u0006\u0010%\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a&\u0010*\u001a\u00020\u0005*\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\u00020\u0006*\u00020,2\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010.\u001a:\u00102\u001a\u00020\u0000*\u0004\u0018\u00010/2\u0006\u0010\u0012\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a2\u00104\u001a\u00020\u0005*\u00020/2\u0006\u0010%\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a<\u00108\u001a\u00020\u0000*\u0004\u0018\u00010,2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a(\u0010;\u001a\u00020\u0005*\u00020/2\u0006\u0010:\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a#\u0010@\u001a\u00020>2\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=\"\u00020>H\u0002¢\u0006\u0004\b@\u0010A\u001a\"\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "text", "az", "(JLjava/lang/CharSequence;)J", "", "", "g", "(I)Z", "iF", "fD", "te", "Landroid/graphics/PointF;", "Landroidx/compose/ui/geometry/Offset;", "e", "(Landroid/graphics/PointF;)J", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/ui/geometry/Rect;", "rectInScreen", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "WPU", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "startRectInScreen", "endRectInScreen", "ViF", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "S", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "aYN", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "offset", "E2", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "r", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "Ik", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextLayoutResult;", "nY", "(Landroidx/compose/ui/text/TextLayoutResult;I)Z", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "XQ", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "o", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "startPointInScreen", "endPointerInScreen", "Z", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "localPoint", "ck", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "ty", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "HI", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1102:1\n30#2:1103\n53#3,3:1104\n60#3:1108\n60#3:1111\n70#3:1114\n70#3:1117\n70#3:1120\n60#3:1123\n65#4:1107\n65#4:1110\n69#4:1113\n69#4:1116\n69#4:1119\n65#4:1122\n22#5:1109\n22#5:1112\n22#5:1115\n22#5:1118\n22#5:1121\n22#5:1124\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt\n*L\n868#1:1103\n868#1:1104,3\n1054#1:1108\n1056#1:1111\n1072#1:1114\n1075#1:1117\n1076#1:1120\n1081#1:1123\n1054#1:1107\n1056#1:1110\n1072#1:1113\n1075#1:1116\n1076#1:1119\n1081#1:1122\n1054#1:1109\n1056#1:1112\n1072#1:1115\n1075#1:1118\n1076#1:1121\n1081#1:1124\n*E\n"})
public final class HandwritingGesture_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long E2(CharSequence charSequence, int i2) {
        int iCharCount = i2;
        while (iCharCount > 0) {
            int iT = CodepointHelpers_jvmKt.t(charSequence, iCharCount);
            if (!iF(iT)) {
                break;
            }
            iCharCount -= Character.charCount(iT);
        }
        while (i2 < charSequence.length()) {
            int iRl = CodepointHelpers_jvmKt.rl(charSequence, i2);
            if (!iF(iRl)) {
                break;
            }
            i2 += CodepointHelpers_jvmKt.n(iRl);
        }
        return TextRangeKt.rl(iCharCount, i2);
    }

    private static final int o(MultiParagraph multiParagraph, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jR;
        int iCk;
        if (layoutCoordinates == null || (iCk = ck(multiParagraph, (jR = layoutCoordinates.r(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.aYN(Offset.Uo(jR, 0.0f, (multiParagraph.S(iCk) + multiParagraph.qie(iCk)) / 2.0f, 1, null));
    }

    private static final long XQ(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i2, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.INSTANCE.n() : multiParagraph.iF(rect.te(layoutCoordinates.r(Offset.INSTANCE.t())), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Z(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.n();
        }
        long jR = layoutCoordinates.r(j2);
        long jR2 = layoutCoordinates.r(j3);
        int iCk = ck(textLayoutResult.getMultiParagraph(), jR, viewConfiguration);
        int iCk2 = ck(textLayoutResult.getMultiParagraph(), jR2, viewConfiguration);
        if (iCk != -1) {
            if (iCk2 != -1) {
                iCk = Math.min(iCk, iCk2);
            }
            iCk2 = iCk;
        } else if (iCk2 == -1) {
            return TextRange.INSTANCE.n();
        }
        float fS = (textLayoutResult.S(iCk2) + textLayoutResult.az(iCk2)) / 2;
        int i2 = (int) (jR >> 32);
        int i3 = (int) (jR2 >> 32);
        return textLayoutResult.getMultiParagraph().iF(new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fS - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fS + 0.1f), TextGranularity.INSTANCE.n(), TextInclusionStrategy.INSTANCE.Uo());
    }

    private static final int ck(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float fKN = viewConfiguration != null ? viewConfiguration.KN() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int iIk = multiParagraph.Ik(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) >= multiParagraph.S(iIk) - fKN && Float.intBitsToFloat(i2) <= multiParagraph.qie(iIk) + fKN) {
            int i3 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i3) >= (-fKN) && Float.intBitsToFloat(i3) <= multiParagraph.getWidth() + fKN) {
                return iIk;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(PointF pointF) {
        float f3 = pointF.x;
        float f4 = pointF.y;
        return Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand ty(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt$compoundEditCommand$1
            @Override // androidx.compose.ui.text.input.EditCommand
            public void n(EditingBuffer buffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.n(buffer);
                }
            }
        };
    }

    private static final long HI(long j2, long j3) {
        return TextRangeKt.rl(Math.min(TextRange.ty(j2), TextRange.ty(j2)), Math.max(TextRange.xMQ(j3), TextRange.xMQ(j3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Ik(LegacyTextFieldState legacyTextFieldState, long j2, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
        if (textLayoutResultProxyQie != null && (value = textLayoutResultProxyQie.getValue()) != null && (multiParagraph = value.getMultiParagraph()) != null) {
            return o(multiParagraph, j2, legacyTextFieldState.gh(), viewConfiguration);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long S(LegacyTextFieldState legacyTextFieldState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        MultiParagraph multiParagraph;
        TextLayoutResult value;
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
        if (textLayoutResultProxyQie != null && (value = textLayoutResultProxyQie.getValue()) != null) {
            multiParagraph = value.getMultiParagraph();
        } else {
            multiParagraph = null;
        }
        return XQ(multiParagraph, rect, legacyTextFieldState.gh(), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ViF(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jWPU = WPU(textLayoutState, rect, i2, textInclusionStrategy);
        if (TextRange.KN(jWPU)) {
            return TextRange.INSTANCE.n();
        }
        long jWPU2 = WPU(textLayoutState, rect2, i2, textInclusionStrategy);
        if (TextRange.KN(jWPU2)) {
            return TextRange.INSTANCE.n();
        }
        return HI(jWPU, jWPU2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long WPU(TextLayoutState textLayoutState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        MultiParagraph multiParagraph;
        TextLayoutResult textLayoutResultJ2 = textLayoutState.J2();
        if (textLayoutResultJ2 != null) {
            multiParagraph = textLayoutResultJ2.getMultiParagraph();
        } else {
            multiParagraph = null;
        }
        return XQ(multiParagraph, rect, textLayoutState.mUb(), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long aYN(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jS2 = S(legacyTextFieldState, rect, i2, textInclusionStrategy);
        if (TextRange.KN(jS2)) {
            return TextRange.INSTANCE.n();
        }
        long jS3 = S(legacyTextFieldState, rect2, i2, textInclusionStrategy);
        if (TextRange.KN(jS3)) {
            return TextRange.INSTANCE.n();
        }
        return HI(jS2, jS3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long az(long j2, CharSequence charSequence) {
        int iCodePointBefore;
        int iTy = TextRange.ty(j2);
        int iXMQ = TextRange.xMQ(j2);
        int iCodePointAt = 10;
        if (iTy > 0) {
            iCodePointBefore = Character.codePointBefore(charSequence, iTy);
        } else {
            iCodePointBefore = 10;
        }
        if (iXMQ < charSequence.length()) {
            iCodePointAt = Character.codePointAt(charSequence, iXMQ);
        }
        if (fD(iCodePointBefore) && (iF(iCodePointAt) || te(iCodePointAt))) {
            do {
                iTy -= Character.charCount(iCodePointBefore);
                if (iTy == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iTy);
            } while (fD(iCodePointBefore));
            return TextRangeKt.rl(iTy, iXMQ);
        }
        if (fD(iCodePointAt)) {
            if (iF(iCodePointBefore) || te(iCodePointBefore)) {
                do {
                    iXMQ += Character.charCount(iCodePointAt);
                    if (iXMQ == charSequence.length()) {
                        break;
                    }
                    iCodePointAt = Character.codePointAt(charSequence, iXMQ);
                } while (fD(iCodePointAt));
                return TextRangeKt.rl(iTy, iXMQ);
            }
            return j2;
        }
        return j2;
    }

    private static final boolean fD(int i2) {
        if (iF(i2) && !g(i2)) {
            return true;
        }
        return false;
    }

    private static final boolean g(int i2) {
        int type = Character.getType(i2);
        if (type != 14 && type != 13 && i2 != 10) {
            return false;
        }
        return true;
    }

    private static final boolean iF(int i2) {
        if (!Character.isWhitespace(i2) && i2 != 160) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nY(TextLayoutResult textLayoutResult, int i2) {
        int iIk = textLayoutResult.Ik(i2);
        if (i2 != textLayoutResult.XQ(iIk) && i2 != TextLayoutResult.ck(textLayoutResult, iIk, false, 2, null)) {
            if (textLayoutResult.t(i2) != textLayoutResult.t(i2 - 1)) {
                return true;
            }
            return false;
        }
        if (textLayoutResult.ViF(i2) != textLayoutResult.t(i2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(TextLayoutState textLayoutState, long j2, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult textLayoutResultJ2 = textLayoutState.J2();
        if (textLayoutResultJ2 != null && (multiParagraph = textLayoutResultJ2.getMultiParagraph()) != null) {
            return o(multiParagraph, j2, textLayoutState.mUb(), viewConfiguration);
        }
        return -1;
    }

    private static final boolean te(int i2) {
        int type = Character.getType(i2);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }
}
