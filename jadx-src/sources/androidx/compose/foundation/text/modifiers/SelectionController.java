package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "<init>", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "t", "()V", "O", "nr", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "KN", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Uo", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "rl", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", c.f62177j, "J", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "J2", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Landroidx/compose/foundation/text/selection/Selectable;", "r", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "Landroidx/compose/ui/Modifier;", "o", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n202#2,4:350\n206#2:357\n207#2,3:360\n249#2,14:363\n57#3:354\n61#3:358\n60#4:355\n70#4:359\n22#5:356\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n159#1:350,4\n159#1:357\n159#1:360,3\n159#1:363,14\n159#1:354\n159#1:358\n159#1:355\n159#1:359\n159#1:356\n*E\n"})
public final class SelectionController implements RememberObserver {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private StaticTextSelectionParams params;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Selectable selectable;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, staticTextSelectionParams);
    }

    private SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j2;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j3;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.rl(SelectionControllerKt.rl(selectionRegistrar, j2, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final LayoutCoordinates invoke() {
                return this.f20631n.params.getLayoutCoordinates();
            }
        }), TextPointerIcon_androidKt.rl(), false, 2, null);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final void KN(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !Intrinsics.areEqual(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.O(this.selectableId);
        }
        this.params = StaticTextSelectionParams.t(this.params, null, textLayoutResult, 1, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.nr(selectable);
            this.selectable = null;
        }
    }

    public final void Uo(LayoutCoordinates coordinates) {
        this.params = StaticTextSelectionParams.t(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.t(this.selectableId);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.nr(selectable);
            this.selectable = null;
        }
    }

    public final void rl(DrawScope drawScope) {
        Selection selection = (Selection) this.selectionRegistrar.rl().rl(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int iKN = selectable != null ? selectable.KN() : 0;
        Path pathO = this.params.O(RangesKt.coerceAtMost(offset, iKN), RangesKt.coerceAtMost(offset2, iKN));
        if (pathO == null) {
            return;
        }
        if (!this.params.J2()) {
            DrawScope.EWS(drawScope, pathO, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.t() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.t() & 4294967295L));
        int iRl = ClipOp.INSTANCE.rl();
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().rl(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iRl);
            DrawScope.EWS(drawScope, pathO, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
        this.selectable = this.selectionRegistrar.KN(new MultiWidgetSelectionDelegate(this.selectableId, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final LayoutCoordinates invoke() {
                return this.f20632n.params.getLayoutCoordinates();
            }
        }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TextLayoutResult invoke() {
                return this.f20633n.params.getTextLayoutResult();
            }
        }));
    }

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, (i2 & 8) != 0 ? StaticTextSelectionParams.INSTANCE.n() : staticTextSelectionParams, null);
    }
}
