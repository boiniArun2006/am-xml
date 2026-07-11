package androidx.compose.foundation.text.input.internal;

import GJW.xuv;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\u0002048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "LGJW/vd;", "monitorScope", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;LGJW/vd;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "", "O", "(ZZZZZZ)V", "J2", "()V", "Landroid/view/inputmethod/CursorAnchorInfo;", "t", "()Landroid/view/inputmethod/CursorAnchorInfo;", "", "cursorUpdateMode", "nr", "(I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "rl", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "LGJW/vd;", "Z", "monitorEnabled", "hasPendingImmediateRequest", "LGJW/xuv;", "Uo", "LGJW/xuv;", "monitorJob", "KN", "xMQ", "mUb", "gh", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "qie", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/graphics/Matrix;", "az", "[F", "matrix", "Landroid/graphics/Matrix;", "ty", "Landroid/graphics/Matrix;", "androidMatrix", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class CursorAnchorInfoController {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean includeInsertionMarker;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private xuv monitorJob;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private boolean includeLineBounds;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private boolean includeEditorBounds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TransformedTextFieldState textFieldState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final GJW.vd monitorScope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextLayoutState textLayoutState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ComposeInputMethodManager composeImm;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean includeCharacterBounds;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final float[] matrix = Matrix.t(null, 1, null);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    private final void J2() {
        if (!this.monitorEnabled) {
            xuv xuvVar = this.monitorJob;
            if (xuvVar != null) {
                xuv.j.rl(xuvVar, null, 1, null);
            }
            this.monitorJob = null;
            return;
        }
        xuv xuvVar2 = this.monitorJob;
        if (xuvVar2 == null || !xuvVar2.isActive()) {
            this.monitorJob = GJW.C.nr(this.monitorScope, null, GJW.h.J2, new CursorAnchorInfoController$startOrStopMonitoring$1(this, null), 1, null);
        }
    }

    private final void O(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        this.includeInsertionMarker = includeInsertionMarker;
        this.includeCharacterBounds = includeCharacterBounds;
        this.includeEditorBounds = includeEditorBounds;
        this.includeLineBounds = includeLineBounds;
        if (immediate) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo cursorAnchorInfoT = t();
            if (cursorAnchorInfoT != null) {
                this.composeImm.t(cursorAnchorInfoT);
            }
        }
        this.monitorEnabled = monitor;
        J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo t() {
        LayoutCoordinates layoutCoordinatesNr;
        LayoutCoordinates layoutCoordinatesO;
        TextLayoutResult textLayoutResultJ2;
        LayoutCoordinates layoutCoordinatesMUb = this.textLayoutState.mUb();
        if (layoutCoordinatesMUb != null) {
            if (!layoutCoordinatesMUb.nr()) {
                layoutCoordinatesMUb = null;
            }
            if (layoutCoordinatesMUb != null && (layoutCoordinatesNr = this.textLayoutState.nr()) != null) {
                if (!layoutCoordinatesNr.nr()) {
                    layoutCoordinatesNr = null;
                }
                if (layoutCoordinatesNr != null && (layoutCoordinatesO = this.textLayoutState.O()) != null) {
                    if (!layoutCoordinatesO.nr()) {
                        layoutCoordinatesO = null;
                    }
                    if (layoutCoordinatesO == null || (textLayoutResultJ2 = this.textLayoutState.J2()) == null) {
                        return null;
                    }
                    TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
                    Matrix.KN(this.matrix);
                    layoutCoordinatesMUb.a(this.matrix);
                    AndroidMatrixConversions_androidKt.n(this.androidMatrix, this.matrix);
                    Rect rectXMQ = SelectionManagerKt.xMQ(layoutCoordinatesNr);
                    Offset.Companion companion = Offset.INSTANCE;
                    return CursorAnchorInfoBuilder_androidKt.rl(this.builder, textFieldCharSequenceHI, textFieldCharSequenceHI.getSelection(), textFieldCharSequenceHI.getComposition(), textLayoutResultJ2, this.androidMatrix, rectXMQ.te(layoutCoordinatesMUb.nHg(layoutCoordinatesNr, companion.t())), SelectionManagerKt.xMQ(layoutCoordinatesO).te(layoutCoordinatesMUb.nHg(layoutCoordinatesO, companion.t())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    public final void nr(int cursorUpdateMode) {
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        boolean z7 = (cursorUpdateMode & 1) != 0;
        boolean z9 = (cursorUpdateMode & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z10 = (cursorUpdateMode & 16) != 0;
            boolean z11 = (cursorUpdateMode & 8) != 0;
            boolean z12 = (cursorUpdateMode & 4) != 0;
            if (i2 >= 34 && (cursorUpdateMode & 32) != 0) {
                z6 = true;
            }
            if (z10 || z11 || z12 || z6) {
                z3 = z6;
                z2 = z12;
                z5 = z11;
                z4 = z10;
                cursorAnchorInfoController = this;
            } else {
                cursorAnchorInfoController = this;
                if (i2 >= 34) {
                    z4 = true;
                    z5 = true;
                    z2 = true;
                    z3 = true;
                } else {
                    z3 = z6;
                    z4 = true;
                    z5 = true;
                    z2 = true;
                }
            }
        } else {
            cursorAnchorInfoController = this;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
        }
        cursorAnchorInfoController.O(z7, z9, z4, z5, z2, z3);
    }

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, GJW.vd vdVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = vdVar;
    }
}
