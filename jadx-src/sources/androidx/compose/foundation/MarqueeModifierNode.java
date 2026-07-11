package androidx.compose.foundation;

import GJW.C;
import GJW.xuv;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J@\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010*J#\u0010-\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010*J#\u0010.\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010*J\u0013\u00100\u001a\u00020\u0011*\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00102R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00105R+\u0010=\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010A\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R+\u0010I\u001a\u00020B2\u0006\u00106\u001a\u00020B8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR+\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010D\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR1\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010D\u001a\u0004\bX\u0010:\"\u0004\bY\u0010<R \u0010^\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010]R\u001b\u0010b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010:R\u0014\u0010e\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "VK2", "()V", "R3E", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Sax", "yUZ", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "B", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "U", "width", "nHg", "r", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "I", "Xw", "jB", "F", "<set-?>", "P5", "Landroidx/compose/runtime/MutableIntState;", "jE", "()I", "f11", "(I)V", "contentWidth", "M7", "ZwA", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "containerWidth", "", "p5", "Landroidx/compose/runtime/MutableState;", "eOa", "()Z", "cAB", "(Z)V", "hasFocus", "LGJW/xuv;", "eF", "LGJW/xuv;", "animationJob", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "E", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "marqueeLayer", "M", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "kR", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "FX", "WKb", "Yq", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "offset", "J", "Landroidx/compose/runtime/State;", "i7", "spacingPx", "kC", "()F", "direction", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,535:1\n78#2:536\n107#2,2:537\n78#2:539\n107#2,2:540\n85#3:542\n113#3,2:543\n85#3:545\n113#3,2:546\n85#3:548\n113#3,2:549\n85#3:551\n61#4:552\n61#4:562\n70#5:553\n80#5:556\n70#5:563\n22#6:554\n22#6:564\n30#7:555\n202#8,5:557\n207#8,3:565\n249#8,9:568\n119#8,8:577\n119#8,8:585\n259#8,4:593\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n211#1:536\n211#1:537,2\n212#1:539\n212#1:540,2\n213#1:542\n213#1:543,2\n216#1:545\n216#1:546,2\n217#1:548\n217#1:549,2\n228#1:551\n343#1:552\n349#1:562\n343#1:553\n345#1:556\n349#1:563\n343#1:554\n349#1:564\n345#1:555\n349#1:557,5\n349#1:565,3\n349#1:568,9\n359#1:577,8\n366#1:585,8\n349#1:593,4\n*E\n"})
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Animatable offset;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer marqueeLayer;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final MutableState animationMode;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final State spacingPx;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final MutableState spacing;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final MutableIntState containerWidth;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final MutableIntState contentWidth;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float velocity;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int delayMillis;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private xuv animationJob;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private int initialDelayMillis;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final MutableState hasFocus;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int iterations;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i2, int i3, int i5, int i7, MarqueeSpacing marqueeSpacing, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, i7, marqueeSpacing, f3);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return 0;
    }

    private MarqueeModifierNode(int i2, int i3, int i5, int i7, final MarqueeSpacing marqueeSpacing, float f3) {
        this.iterations = i2;
        this.delayMillis = i5;
        this.initialDelayMillis = i7;
        this.velocity = f3;
        this.contentWidth = SnapshotIntStateKt.n(0);
        this.containerWidth = SnapshotIntStateKt.n(0);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.O(marqueeSpacing, null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.O(MarqueeAnimationMode.rl(i3), null, 2, null);
        this.offset = AnimatableKt.rl(0.0f, 0.0f, 2, null);
        this.spacingPx = SnapshotStateKt.O(new Function0<Integer>() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                MarqueeModifierNode marqueeModifierNode = this;
                return Integer.valueOf(marqueeSpacing2.n(DelegatableNodeKt.gh(marqueeModifierNode), marqueeModifierNode.jE(), marqueeModifierNode.ZwA()));
            }
        });
    }

    private final void G(int i2) {
        this.containerWidth.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R3E(Continuation continuation) {
        if (this.iterations <= 0) {
            return Unit.INSTANCE;
        }
        Object objUo = GJW.Dsr.Uo(FixedMotionDurationScale.f16110n, new MarqueeModifierNode$runAnimation$2(this, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    private final void VK2() {
        xuv xuvVar = this.animationJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        if (getIsAttached()) {
            this.animationJob = C.nr(Xli(), null, null, new MarqueeModifierNode$restartAnimation$1(xuvVar, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ZwA() {
        return this.containerWidth.J2();
    }

    private final void cAB(boolean z2) {
        this.hasFocus.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean eOa() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    private final void f11(int i2) {
        this.contentWidth.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i7() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int jE() {
        return this.contentWidth.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float kC() {
        float fSignum = Math.signum(this.velocity);
        int i2 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.ty(this).ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = -1;
        }
        return fSignum * i3;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(final ContentDrawScope contentDrawScope) {
        float fFloatValue = ((Number) this.offset.ty()).floatValue() * kC();
        boolean z2 = kC() != 1.0f ? ((Number) this.offset.ty()).floatValue() < ((float) ZwA()) : ((Number) this.offset.ty()).floatValue() < ((float) jE());
        boolean z3 = kC() != 1.0f ? ((Number) this.offset.ty()).floatValue() > ((float) i7()) : ((Number) this.offset.ty()).floatValue() > ((float) ((jE() + i7()) - ZwA()));
        float fJE = kC() == 1.0f ? jE() + i7() : (-jE()) - i7();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.t() & 4294967295L));
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            contentDrawScope.rxp(graphicsLayer, IntSize.t((((long) jE()) << 32) | (((long) MathKt.roundToInt(fIntBitsToFloat)) & 4294967295L)), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifierNode$draw$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    n(drawScope);
                    return Unit.INSTANCE;
                }

                public final void n(DrawScope drawScope) {
                    contentDrawScope.l2();
                }
            });
        }
        float fZwA = fFloatValue + ZwA();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & contentDrawScope.t()));
        int iRl = ClipOp.INSTANCE.rl();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().rl(fFloatValue, 0.0f, fZwA, fIntBitsToFloat2, iRl);
            GraphicsLayer graphicsLayer2 = this.marqueeLayer;
            if (graphicsLayer2 != null) {
                if (z2) {
                    GraphicsLayerKt.n(contentDrawScope, graphicsLayer2);
                }
                if (z3) {
                    contentDrawScope.getDrawContext().getTransform().nr(fJE, 0.0f);
                    try {
                        GraphicsLayerKt.n(contentDrawScope, graphicsLayer2);
                        contentDrawScope.getDrawContext().getTransform().nr(-fJE, -0.0f);
                    } finally {
                    }
                }
            } else {
                if (z2) {
                    contentDrawScope.l2();
                }
                if (z3) {
                    contentDrawScope.getDrawContext().getTransform().nr(fJE, 0.0f);
                    try {
                        contentDrawScope.l2();
                        contentDrawScope.getDrawContext().getTransform().nr(-fJE, -0.0f);
                    } finally {
                    }
                }
            }
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        } catch (Throwable th) {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        xuv xuvVar = this.animationJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.qie(this).rl(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    public final int WKb() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    public final void Yq(int i2) {
        this.animationMode.setValue(MarqueeAnimationMode.rl(i2));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext graphicsContextQie = DelegatableNodeKt.qie(this);
        if (graphicsLayer != null) {
            graphicsContextQie.rl(graphicsLayer);
        }
        this.marqueeLayer = graphicsContextQie.n();
        VK2();
    }

    public final void kR(MarqueeSpacing marqueeSpacing) {
        this.spacing.setValue(marqueeSpacing);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        G(ConstraintsKt.Uo(j2, placeableDR0.getWidth()));
        f11(placeableDR0.getWidth());
        return MeasureScope.ER(measureScope, ZwA(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
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
                Placeable.PlacementScope.WPU(placementScope, placeableDR0, MathKt.roundToInt((-((Number) this.offset.ty()).floatValue()) * this.kC()), 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void B(FocusState focusState) {
        cAB(focusState.rl());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Nxk(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.FX(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.g(Integer.MAX_VALUE);
    }

    public final void yUZ(int iterations, int animationMode, int delayMillis, int initialDelayMillis, MarqueeSpacing spacing, float velocity) {
        kR(spacing);
        Yq(animationMode);
        if (this.iterations == iterations && this.delayMillis == delayMillis && this.initialDelayMillis == initialDelayMillis && Dp.mUb(this.velocity, velocity)) {
            return;
        }
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        VK2();
    }
}
