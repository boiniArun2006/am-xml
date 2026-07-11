package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001`B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u0010*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u0010*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u0010*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u0010*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001fJ&\u0010'\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0000¢\u0006\u0004\b*\u0010\u001fJ\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010\u001fJ\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010\u001fJ\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010\u001fJ\r\u0010.\u001a\u00020\u0000¢\u0006\u0004\b.\u0010\u001fJ\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u0010\u001fJ\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u001fJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u001fJ\r\u00102\u001a\u00020\u0000¢\u0006\u0004\b2\u0010\u001fJ\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u0010\u001fJ\r\u00104\u001a\u00020\u0000¢\u0006\u0004\b4\u0010\u001fJ\r\u00105\u001a\u00020\u0000¢\u0006\u0004\b5\u0010\u001fJ\r\u00106\u001a\u00020\u0000¢\u0006\u0004\b6\u0010\u001fJ\r\u00107\u001a\u00020\u0000¢\u0006\u0004\b7\u0010\u001fJ\r\u00108\u001a\u00020\u0000¢\u0006\u0004\b8\u0010\u001fJ\r\u00109\u001a\u00020\u0000¢\u0006\u0004\b9\u0010\u001fJ\r\u0010:\u001a\u00020\u0000¢\u0006\u0004\b:\u0010\u001fJ\r\u0010;\u001a\u00020\u0000¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u0000¢\u0006\u0004\b<\u0010\u001fJ\r\u0010=\u001a\u00020\u0000¢\u0006\u0004\b=\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010ER\u0017\u0010J\u001a\u00020F8\u0006¢\u0006\f\n\u0004\b)\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b=\u0010L\u001a\u0004\bM\u0010NR(\u0010V\u001a\u00020P8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\\\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010X\u001a\u0004\bC\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "textPreparedSelectionState", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "XQ", "()Z", "", "currentOffset", "HI", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "Ik", "az", "gh", "linesAmount", "S", "pagesAmount", "WPU", "(I)I", "offset", "nr", "U", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "KN", "nY", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "or", "O", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "J2", "E2", "te", "s7N", "nHg", "g", "N", "fD", "X", "e", "iF", "Xw", "aYN", "v", "rV9", "bzg", "wTp", "jB", "ViF", "P5", "Uo", c.f62177j, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "rl", "Landroidx/compose/ui/text/TextLayoutResult;", "t", "Z", "F", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "xMQ", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "mUb", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "initialWedgeAffinity", "Landroidx/compose/ui/text/TextRange;", "J", "o", "()J", "M7", "(J)V", "selection", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "p5", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "wedgeAffinity", "", "Ljava/lang/String;", "text", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n126#1,11:569\n126#1,11:580\n126#1,11:591\n126#1,11:602\n130#1,7:613\n196#1,5:620\n130#1,5:625\n201#1,15:630\n136#1:645\n196#1,5:646\n130#1,5:651\n201#1,15:656\n136#1:671\n196#1,5:672\n130#1,5:677\n201#1,15:682\n136#1:697\n196#1,5:698\n130#1,5:703\n201#1,15:708\n136#1:723\n196#1,5:724\n130#1,5:729\n201#1,15:734\n136#1:749\n196#1,5:750\n130#1,5:755\n201#1,15:760\n136#1:775\n196#1,5:776\n130#1,5:781\n201#1,15:786\n136#1:801\n196#1,5:802\n130#1,5:807\n201#1,15:812\n136#1:827\n200#1:828\n130#1,5:829\n201#1,15:834\n136#1:849\n200#1:850\n130#1,5:851\n201#1,15:856\n136#1:871\n196#1,5:872\n130#1,5:877\n201#1,15:882\n136#1:897\n196#1,5:898\n130#1,5:903\n201#1,15:908\n136#1:923\n200#1:924\n130#1,5:925\n201#1,15:930\n136#1:945\n200#1:946\n130#1,5:947\n201#1,15:952\n136#1:967\n130#1,7:968\n130#1,7:975\n602#2,8:561\n30#3:982\n53#4,3:983\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n139#1:569,11\n141#1:580,11\n158#1:591,11\n171#1:602,11\n200#1:613,7\n217#1:620,5\n217#1:625,5\n217#1:630,15\n217#1:645\n219#1:646,5\n219#1:651,5\n219#1:656,15\n219#1:671\n221#1:672,5\n221#1:677,5\n221#1:682,15\n221#1:697\n223#1:698,5\n223#1:703,5\n223#1:708,15\n223#1:723\n239#1:724,5\n239#1:729,5\n239#1:734,15\n239#1:749\n243#1:750,5\n243#1:755,5\n243#1:760,15\n243#1:775\n247#1:776,5\n247#1:781,5\n247#1:786,15\n247#1:801\n255#1:802,5\n255#1:807,5\n255#1:812,15\n255#1:827\n264#1:828\n264#1:829,5\n264#1:834,15\n264#1:849\n267#1:850\n267#1:851,5\n267#1:856,15\n267#1:871\n283#1:872,5\n283#1:877,5\n283#1:882,15\n283#1:897\n287#1:898,5\n287#1:903,5\n287#1:908,15\n287#1:923\n292#1:924\n292#1:925,5\n292#1:930,15\n292#1:945\n295#1:946\n295#1:947,5\n295#1:952,15\n295#1:967\n299#1:968,7\n304#1:975,7\n106#1:561,8\n395#1:982\n395#1:983,3\n*E\n"})
public final class TextFieldPreparedSelection {
    public static final int qie = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TextFieldCharSequence initialValue;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TextFieldPreparedSelectionState textPreparedSelectionState;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final SelectionWedgeAffinity initialWedgeAffinity;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TransformedTextFieldState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float visibleTextLayoutHeight;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isFromSoftKeyboard;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private WedgeAffinity wedgeAffinity;

    private final int HI(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.initialValue.length()) {
            long jIF = textLayoutResult.iF(nr(i2));
            if (TextRange.xMQ(jIF) > i2) {
                return TextRange.xMQ(jIF);
            }
            i2++;
        }
        return this.initialValue.length();
    }

    private final int Ik(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jIF = textLayoutResult.iF(nr(i2));
            if (TextRange.ty(jIF) < i2) {
                return TextRange.ty(jIF);
            }
            i2--;
        }
        return 0;
    }

    private final int S(TextLayoutResult textLayoutResult, int i2) {
        int iXMQ = TextRange.xMQ(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.t(textLayoutResult.O(iXMQ).getLeft());
        }
        int iIk = textLayoutResult.Ik(iXMQ) + i2;
        if (iIk < 0) {
            return 0;
        }
        if (iIk >= textLayoutResult.ty()) {
            return this.text.length();
        }
        float fAz = textLayoutResult.az(iIk) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((XQ() && cachedX >= textLayoutResult.Z(iIk)) || (!XQ() && cachedX <= textLayoutResult.o(iIk))) {
            return textLayoutResult.HI(iIk, true);
        }
        return textLayoutResult.aYN(Offset.O((((long) Float.floatToRawIntBits(cachedX)) << 32) | (((long) Float.floatToRawIntBits(fAz)) & 4294967295L)));
    }

    private final int WPU(int pagesAmount) {
        int iXMQ = TextRange.xMQ(this.initialValue.getSelection());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iXMQ;
        }
        Rect rectG = this.textLayoutResult.O(iXMQ).g(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float fAz = this.textLayoutResult.az(this.textLayoutResult.r(rectG.getTop()));
        return Math.abs(rectG.getTop() - fAz) > Math.abs(rectG.xMQ() - fAz) ? this.textLayoutResult.aYN(rectG.Z()) : this.textLayoutResult.aYN(rectG.gh());
    }

    private final boolean XQ() {
        ResolvedTextDirection resolvedTextDirectionViF;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (resolvedTextDirectionViF = textLayoutResult.ViF(TextRange.xMQ(this.selection))) == null || resolvedTextDirectionViF == ResolvedTextDirection.f33908n;
    }

    static /* synthetic */ int ck(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.xMQ(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.HI(textLayoutResult, i2);
    }

    private final int nr(int offset) {
        return RangesKt.coerceAtMost(offset, this.text.length() - 1);
    }

    static /* synthetic */ int qie(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.gh(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.gh(textLayoutResult, i2);
    }

    static /* synthetic */ int r(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.xMQ(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.Ik(textLayoutResult, i2);
    }

    static /* synthetic */ int ty(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.qie(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.az(textLayoutResult, i2);
    }

    public final void M7(long j2) {
        this.selection = j2;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final void p5(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z2, float f3, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        Function1 function1Uo;
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z2;
        this.visibleTextLayoutHeight = f3;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        if (snapshotNr != null) {
            function1Uo = snapshotNr.getReadObserver();
        } else {
            function1Uo = null;
        }
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            TextFieldCharSequence textFieldCharSequenceHI = transformedTextFieldState.HI();
            this.initialValue = textFieldCharSequenceHI;
            this.initialWedgeAffinity = transformedTextFieldState.az();
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
            this.selection = textFieldCharSequenceHI.getSelection();
            this.text = textFieldCharSequenceHI.getText().toString();
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    private final int az(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.XQ(textLayoutResult.Ik(i2));
    }

    private final int gh(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.HI(textLayoutResult.Ik(i2), true);
    }

    public final TextFieldPreparedSelection E2() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(StringHelpers_androidKt.rl(this.text, TextRange.xMQ(this.selection)), iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection J2(Function1 or) {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            if (TextRange.KN(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (XQ()) {
                this.selection = TextRangeKt.n(TextRange.gh(this.selection));
                return this;
            }
            this.selection = TextRangeKt.n(TextRange.qie(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection KN() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.n(TextRange.xMQ(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection N() {
        if (XQ()) {
            return fD();
        }
        return X();
    }

    public final TextFieldPreparedSelection O(Function1 or) {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            if (TextRange.KN(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (XQ()) {
                this.selection = TextRangeKt.n(TextRange.qie(this.selection));
                return this;
            }
            this.selection = TextRangeKt.n(TextRange.gh(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection P5() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.rl(TextRange.ty(this.initialValue.getSelection()), TextRange.xMQ(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection T() {
        if (XQ()) {
            return te();
        }
        return E2();
    }

    public final TextFieldPreparedSelection U() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.rl(0, this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection Uo() {
        if (this.text.length() > 0) {
            if (!TextRange.KN(this.initialValue.getSelection())) {
                this.state.gh();
            } else {
                TransformedTextFieldState.nY(this.state, "", TextRangeKt.rl(TextRange.ty(this.initialValue.getSelection()), TextRange.xMQ(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            }
            this.selection = this.state.HI().getSelection();
            this.wedgeAffinity = WedgeAffinity.f20375n;
        }
        return this;
    }

    public final TextFieldPreparedSelection ViF() {
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(WPU(1), iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection X() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            int iR = 0;
            if (textLayoutResult != null) {
                iR = r(this, textLayoutResult, 0, 1, null);
            }
            long jN = TextPreparedSelectionKt.n(iR, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection Xw() {
        int iS;
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                iS = S(textLayoutResult, -1);
            } else {
                iS = 0;
            }
            long jN = TextPreparedSelectionKt.n(iS, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection aYN() {
        int length;
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                length = S(textLayoutResult, 1);
            } else {
                length = this.text.length();
            }
            long jN = TextPreparedSelectionKt.n(length, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection bzg() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            int iTy = 0;
            if (textLayoutResult != null) {
                iTy = ty(this, textLayoutResult, 0, 1, null);
            }
            long jN = TextPreparedSelectionKt.n(iTy, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection e() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            int iRl = StringHelpersKt.rl(this.text, TextRange.qie(this.selection));
            if (iRl == TextRange.qie(this.selection) && iRl != 0) {
                iRl = StringHelpersKt.rl(this.text, iRl - 1);
            }
            long jN = TextPreparedSelectionKt.n(iRl, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection fD() {
        int length;
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                length = ck(this, textLayoutResult, 0, 1, null);
            } else {
                length = this.text.length();
            }
            long jN = TextPreparedSelectionKt.n(length, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection g() {
        if (XQ()) {
            return X();
        }
        return fD();
    }

    public final TextFieldPreparedSelection iF() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            int iN = StringHelpersKt.n(this.text, TextRange.gh(this.selection));
            if (iN == TextRange.gh(this.selection) && iN != this.text.length()) {
                iN = StringHelpersKt.n(this.text, iN + 1);
            }
            long jN = TextPreparedSelectionKt.n(iN, iXMQ, this.state);
            int iN2 = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN2 != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN2));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection jB() {
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(WPU(-1), iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection nHg() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(this.text.length(), iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection nY() {
        if (XQ()) {
            return E2();
        }
        return te();
    }

    public final TextFieldPreparedSelection rV9() {
        if (XQ()) {
            return wTp();
        }
        return bzg();
    }

    public final TextFieldPreparedSelection s7N() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(0, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection te() {
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            long jN = TextPreparedSelectionKt.n(StringHelpers_androidKt.n(this.text, TextRange.xMQ(this.selection)), iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection v() {
        if (XQ()) {
            return bzg();
        }
        return wTp();
    }

    public final TextFieldPreparedSelection wTp() {
        int length;
        this.textPreparedSelectionState.rl();
        if (this.text.length() > 0) {
            int iXMQ = TextRange.xMQ(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                length = qie(this, textLayoutResult, 0, 1, null);
            } else {
                length = this.text.length();
            }
            long jN = TextPreparedSelectionKt.n(length, iXMQ, this.state);
            int iN = CursorAndWedgeAffinity.n(jN);
            WedgeAffinity wedgeAffinityRl = CursorAndWedgeAffinity.rl(jN);
            if (iN != iXMQ || !TextRange.KN(getSelection())) {
                M7(TextRangeKt.n(iN));
            }
            if (wedgeAffinityRl != null) {
                p5(wedgeAffinityRl);
            }
        }
        return this;
    }
}
