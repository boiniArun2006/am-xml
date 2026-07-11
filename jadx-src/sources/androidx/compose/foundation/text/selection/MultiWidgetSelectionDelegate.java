package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010%J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b-\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00108R\u0018\u0010;\u001a\u00020\u001e*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinatesCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "", "qie", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "Landroidx/compose/foundation/text/selection/Selection;", "gh", "()Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "Uo", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "fD", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/AnnotatedString;", c.f62177j, "()Landroidx/compose/ui/text/AnnotatedString;", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "J2", "(I)Landroidx/compose/ui/geometry/Rect;", "", "nr", "(I)F", "rl", "xMQ", "Landroidx/compose/ui/text/TextRange;", "az", "(I)J", "KN", "()I", "t", "J", "mUb", "()J", "Lkotlin/jvm/functions/Function0;", "", "Ljava/lang/Object;", "lock", "O", "Landroidx/compose/ui/text/TextLayoutResult;", "_previousTextLayoutResult", "I", "_previousLastVisibleOffset", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "lastVisibleOffset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 Synchronization.android.kt\nandroidx/compose/foundation/platform/Synchronization_androidKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,366:1\n27#2:367\n32#2,2:368\n59#3:370\n59#3:372\n90#4:371\n90#4:373\n278#5:374\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n*L\n36#1:367\n52#1:368,2\n59#1:370\n68#1:372\n59#1:371\n68#1:373\n87#1:374\n*E\n"})
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult _previousTextLayoutResult;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 coordinatesCallback;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 layoutResultCallback;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Object lock = this;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    private final int O(TextLayoutResult textLayoutResult) {
        int i2;
        int iTy;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (!textLayoutResult.J2() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        iTy = textLayoutResult.ty() - 1;
                    } else {
                        int iCoerceAtMost = RangesKt.coerceAtMost(textLayoutResult.r((int) (textLayoutResult.getSize() & 4294967295L)), textLayoutResult.ty() - 1);
                        while (iCoerceAtMost >= 0 && textLayoutResult.S(iCoerceAtMost) >= ((int) (textLayoutResult.getSize() & 4294967295L))) {
                            iCoerceAtMost--;
                        }
                        iTy = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
                    }
                    this._previousLastVisibleOffset = textLayoutResult.HI(iTy, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i2 = this._previousLastVisibleOffset;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect J2(int offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Rect.INSTANCE.n();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return length < 1 ? Rect.INSTANCE.n() : textLayoutResult.nr(RangesKt.coerceIn(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int KN() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return O(textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long Uo(Selection selection, boolean isStartHandle) {
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.rl();
        }
        if (fD() == null) {
            return Offset.INSTANCE.rl();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Offset.INSTANCE.rl();
        }
        return TextSelectionDelegateKt.rl(textLayoutResult, RangesKt.coerceIn((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, O(textLayoutResult)), isStartHandle, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long az(int offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return TextRange.INSTANCE.n();
        }
        int iO = O(textLayoutResult);
        if (iO < 1) {
            return TextRange.INSTANCE.n();
        }
        int iIk = textLayoutResult.Ik(RangesKt.coerceIn(offset, 0, iO - 1));
        return TextRangeKt.rl(textLayoutResult.XQ(iIk), textLayoutResult.HI(iIk, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates fD() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.nr()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection gh() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResult.t(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResult.t(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString n() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        return textLayoutResult == null ? new AnnotatedString("", null, 2, null) : textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float nr(int offset) {
        int iIk;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (iIk = textLayoutResult.Ik(offset)) < textLayoutResult.ty()) {
            return textLayoutResult.o(iIk);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float rl(int offset) {
        int iIk;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (iIk = textLayoutResult.Ik(offset)) < textLayoutResult.ty()) {
            return textLayoutResult.Z(iIk);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float t(int offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null) {
            return TextLayoutHelperKt.rl(textLayoutResult, offset);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float xMQ(int offset) {
        int iIk;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null || (iIk = textLayoutResult.Ik(offset)) >= textLayoutResult.ty()) {
            return -1.0f;
        }
        float fS = textLayoutResult.S(iIk);
        return ((textLayoutResult.az(iIk) - fS) / 2) + fS;
    }

    public MultiWidgetSelectionDelegate(long j2, Function0 function0, Function0 function02) {
        this.selectableId = j2;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function02;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void qie(SelectionLayoutBuilder builder) {
        TextLayoutResult textLayoutResult;
        long jCk;
        LayoutCoordinates layoutCoordinatesFD = fD();
        if (layoutCoordinatesFD == null || (textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = builder.getContainerCoordinates();
        Offset.Companion companion = Offset.INSTANCE;
        long jNHg = containerCoordinates.nHg(layoutCoordinatesFD, companion.t());
        long jCk2 = Offset.ck(builder.getCurrentPosition(), jNHg);
        if ((builder.getPreviousHandlePosition() & 9223372034707292159L) == 9205357640488583168L) {
            jCk = companion.rl();
        } else {
            jCk = Offset.ck(builder.getPreviousHandlePosition(), jNHg);
        }
        MultiWidgetSelectionDelegateKt.n(builder, textLayoutResult, jCk2, jCk, getSelectableId());
    }
}
