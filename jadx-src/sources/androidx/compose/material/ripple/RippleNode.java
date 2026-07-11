package androidx.compose.material.ripple;

import GJW.C;
import GJW.vd;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010,\u001a\u00020+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010P\u001a\u00020*2\u0006\u0010K\u001a\u00020*8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00104R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", TtmlNode.ATTR_TTS_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction;", "pressInteraction", "", "ZwA", "(Landroidx/compose/foundation/interaction/PressInteraction;)V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "LGJW/vd;", "scope", "kC", "(Landroidx/compose/foundation/interaction/Interaction;LGJW/vd;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "HI", "(J)V", "c", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/ui/geometry/Size;", "", "targetRadius", "W1c", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "jE", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "v", "Landroidx/compose/foundation/interaction/InteractionSource;", "Xw", "Z", "ni", "()Z", "jB", "F", "U", "Landroidx/compose/ui/graphics/ColorProducer;", "P5", "Lkotlin/jvm/functions/Function0;", "GT", "()Lkotlin/jvm/functions/Function0;", "M7", "lRt", "shouldAutoInvalidate", "Landroidx/compose/material/ripple/StateLayer;", "p5", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "eF", "WKb", "()F", "setTargetRadius", "(F)V", "<set-?>", "E", "J", "b", "()J", "rippleSize", "M", "hasValidSize", "Landroidx/collection/MutableObjectList;", "FX", "Landroidx/collection/MutableObjectList;", "pendingInteractions", "Landroidx/compose/ui/graphics/Color;", "Vd", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1516#2:531\n132#3:532\n287#4,6:533\n1#5:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n338#1:531\n346#1:532\n358#1:533,6\n*E\n"})
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final MutableObjectList pendingInteractions;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean hasValidSize;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final Function0 rippleAlpha;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final ColorProducer color;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private StateLayer stateLayer;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InteractionSource interactionSource;

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z2, float f3, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f3, colorProducer, function0);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.hasValidSize = true;
        Density densityGh = DelegatableNodeKt.gh(this);
        this.rippleSize = IntSizeKt.O(size);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.n(densityGh, this.bounded, this.rippleSize) : densityGh.l(this.radius);
        MutableObjectList mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i2 = mutableObjectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ZwA((PressInteraction) objArr[i3]);
        }
        this.pendingInteractions.Z();
    }

    public abstract void W1c(PressInteraction.Press interaction, long size, float targetRadius);

    public abstract void jE(PressInteraction.Press interaction);

    public abstract void pr(DrawScope drawScope);

    private RippleNode(InteractionSource interactionSource, boolean z2, float f3, ColorProducer colorProducer, Function0 function0) {
        this.interactionSource = interactionSource;
        this.bounded = z2;
        this.radius = f3;
        this.color = colorProducer;
        this.rippleAlpha = function0;
        this.rippleSize = Size.INSTANCE.rl();
        this.pendingInteractions = new MutableObjectList(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ZwA(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            W1c((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            jE(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            jE(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kC(Interaction interaction, vd scope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.n(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.t(interaction, scope);
    }

    /* JADX INFO: renamed from: GT, reason: from getter */
    protected final Function0 getRippleAlpha() {
        return this.rippleAlpha;
    }

    public final long Vd() {
        return this.color.n();
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: ni, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.l2();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.rl(contentDrawScope, this.targetRadius, Vd());
        }
        pr(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        C.nr(Xli(), null, null, new RippleNode$onAttach$1(this, null), 3, null);
    }
}
