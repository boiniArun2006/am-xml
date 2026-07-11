package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000 f*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001gB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u0016*\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0082\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u0016*\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0082\u0010¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u0016*\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u0016*\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0016H\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0016H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0010J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0010J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0010J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J&\u00104\u001a\u00028\u00002\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&01¢\u0006\u0002\b2¢\u0006\u0004\b4\u00105J&\u00106\u001a\u00028\u00002\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&01¢\u0006\u0002\b2¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u0016¢\u0006\u0004\b7\u0010 J\r\u00108\u001a\u00020\u0016¢\u0006\u0004\b8\u0010 J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0010J\u000f\u0010=\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00028\u0000¢\u0006\u0004\b@\u0010\u0010J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\u000f\u0010D\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bD\u0010>J\r\u0010E\u001a\u00028\u0000¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bF\u0010>J\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010\u0010J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010K\u001a\u0004\bL\u0010MR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR(\u0010^\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010N\u001a\u0004\b[\u0010P\"\u0004\b\\\u0010]R\"\u0010a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010K\u001a\u0004\bW\u0010M\"\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "iF", "E2", "", "aYN", "()Z", "", "currentOffset", "ty", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "r", "mUb", "Uo", "linesAmount", "ViF", "eF", "()I", "M", "E", "offset", c.f62177j, "(I)I", "", "M7", "(I)V", TtmlNode.START, TtmlNode.END, "p5", "(II)V", "U", "nr", "g", "N", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "or", "rl", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "t", "Ik", "qie", "wTp", "s7N", "te", "nHg", "az", "()Ljava/lang/Integer;", "Z", "X", "fD", "jB", "nY", "xMQ", "Xw", "J2", "v", "rV9", "bzg", "P5", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getOriginalSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "ck", "()Landroidx/compose/ui/text/input/OffsetMapping;", "O", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "S", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "XQ", "setSelection-5zc-tL8", "(J)V", "selection", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotatedString", "", "WPU", "()Ljava/lang/String;", "text", "KN", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,401:1\n73#1,8:402\n73#1,8:410\n73#1,8:418\n73#1,8:426\n73#1,8:434\n73#1,8:442\n73#1,8:450\n73#1,8:458\n73#1,8:466\n73#1,8:474\n73#1,8:482\n73#1,8:490\n73#1,6:498\n80#1:505\n73#1,8:506\n73#1,8:514\n73#1,8:522\n74#1,7:530\n74#1,7:537\n73#1,8:544\n73#1,8:552\n73#1,8:560\n73#1,8:568\n74#1,7:576\n1#2:504\n30#3:583\n53#4,3:584\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:402,8\n93#1:410,8\n95#1:418,8\n103#1:426,8\n112#1:434,8\n125#1:442,8\n146#1:450,8\n151#1:458,8\n156#1:466,8\n158#1:474,8\n160#1:482,8\n168#1:490,8\n178#1:498,6\n178#1:505\n182#1:506,8\n184#1:514,8\n192#1:522,8\n201#1:530,7\n204#1:537,7\n208#1:544,8\n212#1:552,8\n214#1:560,8\n222#1:568,8\n232#1:576,7\n310#1:583\n310#1:584,3\n*E\n"})
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int xMQ = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TextPreparedSelectionState state;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private AnnotatedString annotatedString;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString originalText;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long originalSelection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult layoutResult;

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j2;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j2;
        this.annotatedString = annotatedString;
    }

    private final int E() {
        return this.offsetMapping.rl(TextRange.gh(this.selection));
    }

    static /* synthetic */ int HI(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.eF();
        }
        return baseTextPreparedSelection.ty(textLayoutResult, i2);
    }

    static /* synthetic */ int KN(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.E();
        }
        return baseTextPreparedSelection.Uo(textLayoutResult, i2);
    }

    private final int M() {
        return this.offsetMapping.rl(TextRange.qie(this.selection));
    }

    private final boolean aYN() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.ViF(eF()) : null) != ResolvedTextDirection.f33909t;
    }

    private final int eF() {
        return this.offsetMapping.rl(TextRange.xMQ(this.selection));
    }

    static /* synthetic */ int gh(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.M();
        }
        return baseTextPreparedSelection.mUb(textLayoutResult, i2);
    }

    static /* synthetic */ int o(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.eF();
        }
        return baseTextPreparedSelection.r(textLayoutResult, i2);
    }

    private final int r(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jIF = textLayoutResult.iF(n(i2));
            if (TextRange.ty(jIF) < i2) {
                return this.offsetMapping.n(TextRange.ty(jIF));
            }
            i2--;
        }
        return 0;
    }

    private final int ty(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.originalText.length()) {
            long jIF = textLayoutResult.iF(n(i2));
            if (TextRange.xMQ(jIF) > i2) {
                return this.offsetMapping.n(TextRange.xMQ(jIF));
            }
            i2++;
        }
        return this.originalText.length();
    }

    public final int Ik() {
        return StringHelpers_androidKt.rl(this.annotatedString.getText(), TextRange.xMQ(this.selection));
    }

    public final Integer J2() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(KN(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    public final String WPU() {
        return this.annotatedString.getText();
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final Integer Z() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer az() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(HI(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final int qie() {
        return StringHelpers_androidKt.n(this.annotatedString.getText(), TextRange.xMQ(this.selection));
    }

    public final Integer xMQ() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(gh(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    private final BaseTextPreparedSelection E2() {
        Integer numAz;
        getState().rl();
        if (WPU().length() > 0 && (numAz = az()) != null) {
            M7(numAz.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection T() {
        Integer numZ;
        getState().rl();
        if (WPU().length() > 0 && (numZ = Z()) != null) {
            M7(numZ.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int Uo(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.n(textLayoutResult.HI(textLayoutResult.Ik(i2), true));
    }

    private final int ViF(TextLayoutResult textLayoutResult, int i2) {
        int iEF = eF();
        if (this.state.getCachedX() == null) {
            this.state.t(Float.valueOf(textLayoutResult.O(iEF).getLeft()));
        }
        int iIk = textLayoutResult.Ik(iEF) + i2;
        if (iIk < 0) {
            return 0;
        }
        if (iIk >= textLayoutResult.ty()) {
            return WPU().length();
        }
        float fAz = textLayoutResult.az(iIk) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((aYN() && fFloatValue >= textLayoutResult.Z(iIk)) || (!aYN() && fFloatValue <= textLayoutResult.o(iIk))) {
            return textLayoutResult.HI(iIk, true);
        }
        return this.offsetMapping.n(textLayoutResult.aYN(Offset.O((((long) Float.floatToRawIntBits(cachedX.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fAz)) & 4294967295L))));
    }

    private final BaseTextPreparedSelection e() {
        int iIk;
        getState().rl();
        if (WPU().length() > 0 && (iIk = Ik()) != -1) {
            M7(iIk);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection iF() {
        int iQie;
        getState().rl();
        if (WPU().length() > 0 && (iQie = qie()) != -1) {
            M7(iQie);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int mUb(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.n(textLayoutResult.XQ(textLayoutResult.Ik(i2)));
    }

    private final int n(int offset) {
        return RangesKt.coerceAtMost(offset, WPU().length() - 1);
    }

    protected final void M7(int offset) {
        p5(offset, offset);
    }

    public final BaseTextPreparedSelection N() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                iF();
            } else {
                e();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection P5() {
        if (WPU().length() > 0) {
            this.selection = TextRangeKt.rl(TextRange.ty(this.originalSelection), TextRange.xMQ(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection U() {
        getState().rl();
        if (WPU().length() > 0) {
            p5(0, WPU().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection X() {
        getState().rl();
        if (WPU().length() > 0) {
            int iRl = StringHelpersKt.rl(WPU(), TextRange.qie(this.selection));
            if (iRl == TextRange.qie(this.selection) && iRl != 0) {
                iRl = StringHelpersKt.rl(WPU(), iRl - 1);
            }
            M7(iRl);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection Xw() {
        Integer numXMQ;
        getState().rl();
        if (WPU().length() > 0 && (numXMQ = xMQ()) != null) {
            M7(numXMQ.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection bzg() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                v();
            } else {
                Xw();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection fD() {
        getState().rl();
        if (WPU().length() > 0) {
            int iN = StringHelpersKt.n(WPU(), TextRange.gh(this.selection));
            if (iN == TextRange.gh(this.selection) && iN != WPU().length()) {
                iN = StringHelpersKt.n(WPU(), iN + 1);
            }
            M7(iN);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection g() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                e();
            } else {
                iF();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection jB() {
        TextLayoutResult textLayoutResult;
        if (WPU().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            M7(ViF(textLayoutResult, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection nHg() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                E2();
            } else {
                T();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection nY() {
        TextLayoutResult textLayoutResult;
        if (WPU().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            M7(ViF(textLayoutResult, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection nr() {
        getState().rl();
        if (WPU().length() > 0) {
            M7(TextRange.xMQ(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void p5(int start, int end) {
        this.selection = TextRangeKt.rl(start, end);
    }

    public final BaseTextPreparedSelection rV9() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                Xw();
            } else {
                v();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection rl(Function1 or) {
        getState().rl();
        if (WPU().length() > 0) {
            if (TextRange.KN(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or.invoke(this);
            } else if (aYN()) {
                M7(TextRange.qie(this.selection));
            } else {
                M7(TextRange.gh(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection s7N() {
        getState().rl();
        if (WPU().length() > 0) {
            M7(WPU().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection t(Function1 or) {
        getState().rl();
        if (WPU().length() > 0) {
            if (TextRange.KN(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or.invoke(this);
            } else if (aYN()) {
                M7(TextRange.gh(this.selection));
            } else {
                M7(TextRange.qie(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection te() {
        getState().rl();
        if (WPU().length() > 0) {
            if (aYN()) {
                T();
            } else {
                E2();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection v() {
        Integer numJ2;
        getState().rl();
        if (WPU().length() > 0 && (numJ2 = J2()) != null) {
            M7(numJ2.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection wTp() {
        getState().rl();
        if (WPU().length() > 0) {
            M7(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
