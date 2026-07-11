package androidx.compose.foundation.text.input.internal;

import GJW.xuv;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BO\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001f\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010 J\"\u0010&\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J6\u0010.\u001a\u00020-*\u00020(2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J&\u00104\u001a\u00020-*\u0002002\u0006\u00101\u001a\u00020\"2\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J/\u00109\u001a\u00020-*\u0002002\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\"062\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020-*\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010=\u001a\u00020-*\u000200H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020-H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020-H\u0016¢\u0006\u0004\bA\u0010@JU\u0010B\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bB\u0010\u0018J&\u0010C\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010 J\u0013\u0010E\u001a\u00020-*\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020-2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0013\u0010L\u001a\u00020-*\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010QR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010f\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "isFocused", "isDragHovered", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "writeable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "R3E", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "VK2", "Landroidx/compose/ui/text/TextRange;", "currSelection", "", "currTextLayoutSize", "WKb", "(JI)I", "Landroidx/compose/ui/unit/Density;", "containerSize", "textLayoutSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "f11", "(Landroidx/compose/ui/unit/Density;IIJLandroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "selection", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "kC", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/text/TextLayoutResult;)V", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlight", "jE", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/Pair;Landroidx/compose/ui/text/TextLayoutResult;)V", "eOa", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;)V", "ZwA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Yq", "()V", "c", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "nr", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "jB", "Z", "U", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "M7", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p5", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "eF", "Landroidx/compose/ui/graphics/Brush;", "E", "M", "Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "B", "Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "cursorAnimation", "LGJW/xuv;", "J", "LGJW/xuv;", "changeObserverJob", "D", "Landroidx/compose/ui/text/TextRange;", "previousSelection", "Landroidx/compose/ui/geometry/Rect;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/ui/geometry/Rect;", "previousCursorRect", "I", "previousTextLayoutSize", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "GR", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "textFieldMagnifierNode", "i7", "()Z", "showCursor", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,623:1\n1#2:624\n646#3:625\n635#3:626\n233#4:627\n56#5:628\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n483#1:625\n483#1:626\n497#1:627\n518#1:628\n*E\n"})
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private CursorAnimationState cursorAnimation;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private TextRange previousSelection;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean writeable;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final TextFieldMagnifierNode textFieldMagnifierNode;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int previousTextLayoutSize;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private xuv changeObserverJob;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private ScrollState scrollState;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private TransformedTextFieldState textFieldState;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private TextLayoutState textLayoutState;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isDragHovered;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Brush cursorBrush;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isFocused;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private TextFieldSelectionState textFieldSelectionState;

    private final MeasureResult R3E(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableDR0.getHeight(), Constraints.gh(j2));
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), iMin, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                this.f20217n.f11(measureScope, iMin, placeableDR0.getHeight(), this.f20217n.textFieldState.HI().getSelection(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.az(placementScope, placeableDR0, 0, -this.f20217n.scrollState.ty(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final MeasureResult VK2(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableDR0.getWidth(), Constraints.qie(j2));
        return MeasureScope.ER(measureScope, iMin, placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                this.f20214n.f11(measureScope, iMin, placeableDR0.getWidth(), this.f20214n.textFieldState.HI().getSelection(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.az(placementScope, placeableDR0, -this.f20214n.scrollState.ty(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final int WKb(long currSelection, int currTextLayoutSize) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.xMQ(currSelection) != TextRange.xMQ(textRange.getPackedValue())) {
            return TextRange.xMQ(currSelection);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.ty(currSelection) != TextRange.ty(textRange2.getPackedValue())) {
            return TextRange.ty(currSelection);
        }
        if (currTextLayoutSize != this.previousTextLayoutSize) {
            return TextRange.ty(currSelection);
        }
        return -1;
    }

    private final void Yq() {
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.n(this, CompositionLocalsKt.O())).booleanValue());
            DrawModifierNodeKt.n(this);
        }
        this.changeObserverJob = GJW.C.nr(Xli(), null, null, new TextFieldCoreModifierNode$startCursorJob$1(this, null), 3, null);
    }

    private final void ZwA(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float fO = cursorAnimationState != null ? cursorAnimationState.O() : 0.0f;
        if (fO != 0.0f && i7()) {
            Rect rectE = this.textFieldSelectionState.E();
            DrawScope.c32(drawScope, this.cursorBrush, rectE.o(), rectE.mUb(), rectE.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rectE.getLeft(), 0, null, fO, null, 0, 432, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f11(Density density, int i2, int i3, long j2, LayoutDirection layoutDirection) {
        TextLayoutResult textLayoutResultJ2;
        float f3;
        this.scrollState.ck(i3 - i2);
        int iWKb = WKb(j2, i3);
        if (iWKb < 0 || !i7() || (textLayoutResultJ2 = this.textLayoutState.J2()) == null) {
            return;
        }
        Rect rectO = textLayoutResultJ2.O(RangesKt.coerceIn(iWKb, (ClosedRange<Integer>) new IntRange(0, textLayoutResultJ2.getLayoutInput().getText().length())));
        Rect rectNr = TextFieldCoreModifierKt.nr(density, rectO, layoutDirection == LayoutDirection.f34161t, i3);
        if (rectNr.getLeft() == this.previousCursorRect.getLeft() && rectNr.getTop() == this.previousCursorRect.getTop() && i3 == this.previousTextLayoutSize) {
            return;
        }
        boolean z2 = this.orientation == Orientation.f16969n;
        float top = z2 ? rectNr.getTop() : rectNr.getLeft();
        float fXMQ = z2 ? rectNr.xMQ() : rectNr.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        int iTy = this.scrollState.ty();
        float f4 = iTy + i2;
        if (fXMQ > f4) {
            f3 = fXMQ - f4;
        } else {
            float f5 = iTy;
            if (top >= f5 || fXMQ - top <= i2) {
                f3 = (top >= f5 || fXMQ - top > ((float) i2)) ? 0.0f : top - f5;
            }
        }
        this.previousSelection = TextRange.rl(j2);
        this.previousCursorRect = rectNr;
        this.previousTextLayoutSize = i3;
        GJW.C.nr(Xli(), null, GJW.h.J2, new TextFieldCoreModifierNode$updateScrollState$1(this, f3, rectO, null), 1, null);
    }

    private final boolean i7() {
        if (this.writeable) {
            return (this.isFocused || this.isDragHovered) && TextFieldCoreModifierKt.O(this.cursorBrush);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.FX(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        this.textLayoutState.az(coordinates);
        this.textFieldMagnifierNode.P5(coordinates);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        if (this.isFocused && i7()) {
            Yq();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.orientation == Orientation.f16969n ? R3E(measureScope, measurable, j2) : VK2(measureScope, measurable, j2);
    }

    public TextFieldCoreModifierNode(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        boolean z5;
        this.isFocused = z2;
        this.isDragHovered = z3;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z4;
        this.scrollState = scrollState;
        this.orientation = orientation;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        if (!this.isFocused && !this.isDragHovered) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) UR(AndroidTextFieldMagnifier_androidKt.n(transformedTextFieldState2, textFieldSelectionState2, textLayoutState2, z5));
    }

    private final void eOa(DrawScope drawScope, TextLayoutResult textLayoutResult) throws Throwable {
        TextPainter.f33513n.n(drawScope.getDrawContext().KN(), textLayoutResult);
    }

    private final void jE(DrawScope drawScope, Pair pair, TextLayoutResult textLayoutResult) {
        int value = ((TextHighlightType) pair.component1()).getValue();
        long packedValue = ((TextRange) pair.component2()).getPackedValue();
        if (TextRange.KN(packedValue)) {
            return;
        }
        Path pathNY = textLayoutResult.nY(TextRange.qie(packedValue), TextRange.gh(packedValue));
        if (TextHighlightType.J2(value, TextHighlightType.INSTANCE.n())) {
            Brush brushUo = textLayoutResult.getLayoutInput().getStyle().Uo();
            if (brushUo != null) {
                DrawScope.Ro(drawScope, pathNY, brushUo, 0.2f, null, null, 0, 56, null);
                return;
            }
            long jKN = textLayoutResult.getLayoutInput().getStyle().KN();
            if (jKN == 16) {
                jKN = Color.INSTANCE.n();
            }
            long j2 = jKN;
            DrawScope.EWS(drawScope, pathNY, Color.az(j2, Color.ck(j2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
            return;
        }
        DrawScope.EWS(drawScope, pathNY, ((SelectionColors) CompositionLocalConsumerModifierNodeKt.n(this, TextSelectionColorsKt.rl())).getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
    }

    private final void kC(DrawScope drawScope, long j2, TextLayoutResult textLayoutResult) {
        int iQie = TextRange.qie(j2);
        int iGh = TextRange.gh(j2);
        if (iQie != iGh) {
            DrawScope.EWS(drawScope, textLayoutResult.nY(iQie, iGh), ((SelectionColors) CompositionLocalConsumerModifierNodeKt.n(this, TextSelectionColorsKt.rl())).getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
        }
    }

    public final void G(boolean isFocused, boolean isDragHovered, TextLayoutState textLayoutState, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, Brush cursorBrush, boolean writeable, ScrollState scrollState, Orientation orientation) {
        boolean z2;
        boolean zI7 = i7();
        boolean z3 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = isFocused;
        this.isDragHovered = isDragHovered;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        TextFieldMagnifierNode textFieldMagnifierNode = this.textFieldMagnifierNode;
        if (!isFocused && !isDragHovered) {
            z2 = false;
        } else {
            z2 = true;
        }
        textFieldMagnifierNode.pr(textFieldState, textFieldSelectionState, textLayoutState, z2);
        if (!i7()) {
            xuv xuvVar = this.changeObserverJob;
            if (xuvVar != null) {
                xuv.j.rl(xuvVar, null, 1, null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.t();
            }
        } else if (!z3 || !Intrinsics.areEqual(transformedTextFieldState, textFieldState) || !zI7) {
            Yq();
        }
        if (Intrinsics.areEqual(transformedTextFieldState, textFieldState) && Intrinsics.areEqual(textLayoutState2, textLayoutState) && Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState) && Intrinsics.areEqual(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.rl(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.l2();
        TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null) {
            return;
        }
        Pair highlight = textFieldCharSequenceHI.getHighlight();
        if (highlight != null) {
            jE(contentDrawScope, highlight, textLayoutResultJ2);
        }
        if (TextRange.KN(textFieldCharSequenceHI.getSelection())) {
            eOa(contentDrawScope, textLayoutResultJ2);
            if (textFieldCharSequenceHI.xMQ()) {
                ZwA(contentDrawScope);
            }
        } else {
            if (textFieldCharSequenceHI.xMQ()) {
                kC(contentDrawScope, textFieldCharSequenceHI.getSelection(), textLayoutResultJ2);
            }
            eOa(contentDrawScope, textLayoutResultJ2);
        }
        this.textFieldMagnifierNode.N(contentDrawScope);
    }
}
