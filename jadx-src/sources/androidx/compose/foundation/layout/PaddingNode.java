package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/PaddingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "F", "W5k", "()F", CmcdConfiguration.KEY_PLAYBACK_RATE, "(F)V", "Xw", "NC9", "ni", "jB", "getEnd-D9Ej5fM", "poH", "U", "getBottom-D9Ej5fM", "ex", "P5", "Z", "UR", "()Z", "W1c", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n386#1:473\n387#1:474\n388#1:475\n389#1:476\n*E\n"})
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float start;

    public /* synthetic */ PaddingNode(float f3, float f4, float f5, float f6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, z2);
    }

    private PaddingNode(float f3, float f4, float f5, float f6, boolean z2) {
        this.start = f3;
        this.top = f4;
        this.end = f5;
        this.bottom = f6;
        this.rtlAware = z2;
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void W1c(boolean z2) {
        this.rtlAware = z2;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    public final void ex(float f3) {
        this.bottom = f3;
    }

    public final void ni(float f3) {
        this.top = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        int iHow = measureScope.How(this.start) + measureScope.How(this.end);
        int iHow2 = measureScope.How(this.top) + measureScope.How(this.bottom);
        final Placeable placeableDR0 = measurable.dR0(ConstraintsKt.xMQ(j2, -iHow, -iHow2));
        return MeasureScope.ER(measureScope, ConstraintsKt.Uo(j2, placeableDR0.getWidth() + iHow), ConstraintsKt.J2(j2, placeableDR0.getHeight() + iHow2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
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
                if (this.f17753n.getRtlAware()) {
                    Placeable.PlacementScope.az(placementScope, placeableDR0, measureScope.How(this.f17753n.getStart()), measureScope.How(this.f17753n.getTop()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.xMQ(placementScope, placeableDR0, measureScope.How(this.f17753n.getStart()), measureScope.How(this.f17753n.getTop()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void poH(float f3) {
        this.end = f3;
    }

    public final void pr(float f3) {
        this.start = f3;
    }
}
