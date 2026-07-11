package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010,R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/foundation/BackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "(JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "NC9", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "W5k", "Landroidx/compose/ui/graphics/Outline;", "ex", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)Landroidx/compose/ui/graphics/Outline;", "N", "UhV", "()V", "v", "J", "getColor-0d7_KjU", "()J", CmcdConfiguration.KEY_PLAYBACK_RATE, "(J)V", "Xw", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "W1c", "(Landroidx/compose/ui/graphics/Brush;)V", "jB", "F", "getAlpha", "()F", "rl", "(F)V", "U", "Landroidx/compose/ui/graphics/Shape;", "poH", "()Landroidx/compose/ui/graphics/Shape;", "pS", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/geometry/Size;", "P5", "lastSize", "Landroidx/compose/ui/unit/LayoutDirection;", "M7", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayoutDirection", "p5", "Landroidx/compose/ui/graphics/Outline;", "lastOutline", "eF", "lastShape", "E", "tmpOutline", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Outline tmpOutline;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private LayoutDirection lastLayoutDirection;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long lastSize;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Shape shape;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Brush brush;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Shape lastShape;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Outline lastOutline;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long color;

    public /* synthetic */ BackgroundNode(long j2, Brush brush, float f3, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, brush, f3, shape);
    }

    private BackgroundNode(long j2, Brush brush, float f3, Shape shape) {
        this.color = j2;
        this.brush = brush;
        this.alpha = f3;
        this.shape = shape;
        this.lastSize = Size.INSTANCE.n();
    }

    private final void NC9(ContentDrawScope contentDrawScope) {
        if (!Color.HI(this.color, Color.INSTANCE.Uo())) {
            DrawScope.h(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.s(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.n()) {
            NC9(contentDrawScope);
        } else {
            W5k(contentDrawScope);
        }
        contentDrawScope.l2();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        this.lastSize = Size.INSTANCE.n();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.n(this);
    }

    public final void W1c(Brush brush) {
        this.brush = brush;
    }

    public final void pS(Shape shape) {
        this.shape = shape;
    }

    /* JADX INFO: renamed from: poH, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    public final void pr(long j2) {
        this.color = j2;
    }

    public final void rl(float f3) {
        this.alpha = f3;
    }

    private final void W5k(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2;
        Outline outlineEx = ex(contentDrawScope);
        if (!Color.HI(this.color, Color.INSTANCE.Uo())) {
            contentDrawScope2 = contentDrawScope;
            OutlineKt.O(contentDrawScope2, outlineEx, this.color, 0.0f, null, null, 0, 60, null);
        } else {
            contentDrawScope2 = contentDrawScope;
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.t(contentDrawScope2, outlineEx, brush, this.alpha, null, null, 0, 56, null);
        }
    }

    private final Outline ex(final ContentDrawScope contentDrawScope) {
        Outline outline;
        if (Size.KN(contentDrawScope.t(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && Intrinsics.areEqual(this.lastShape, this.shape)) {
            outline = this.lastOutline;
            Intrinsics.checkNotNull(outline);
        } else {
            ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.foundation.BackgroundNode$getOutline$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BackgroundNode backgroundNode = this.f15883n;
                    backgroundNode.tmpOutline = backgroundNode.getShape().n(contentDrawScope.t(), contentDrawScope.getLayoutDirection(), contentDrawScope);
                }
            });
            outline = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = outline;
        this.lastSize = contentDrawScope.t();
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
        Intrinsics.checkNotNull(outline);
        return outline;
    }
}
