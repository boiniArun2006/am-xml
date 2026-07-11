package androidx.compose.material3;

import GJW.C;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "checked", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Z)V", "", "c", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "GT", "v", "Landroidx/compose/foundation/interaction/InteractionSource;", "W1c", "()Landroidx/compose/foundation/interaction/InteractionSource;", "ni", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "Xw", "Z", "poH", "()Z", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Z)V", "jB", "isPressed", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "U", "Landroidx/compose/animation/core/Animatable;", "offsetAnim", "P5", "sizeAnim", "M7", "F", "initialOffset", "p5", "initialSize", "lRt", "shouldAutoInvalidate", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,625:1\n56#2:626\n68#2:627\n56#2:628\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n*L\n251#1:626\n251#1:627\n253#1:628\n*E\n"})
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Animatable sizeAnim;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Animatable offsetAnim;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean checked;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isPressed;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InteractionSource interactionSource;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private float initialOffset = Float.NaN;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float initialSize = Float.NaN;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void GT() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AnimatableKt.rl(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AnimatableKt.rl(this.initialOffset, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: W1c, reason: from getter */
    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void ni(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    /* JADX INFO: renamed from: poH, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    public final void pr(boolean z2) {
        this.checked = z2;
    }

    public ThumbNode(InteractionSource interactionSource, boolean z2) {
        this.interactionSource = interactionSource;
        this.checked = z2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        C.nr(Xli(), null, null, new ThumbNode$onAttach$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        boolean z2;
        float fXMQ;
        float fFloatValue;
        Float f3;
        Float f4;
        if (measurable.g(Constraints.qie(j2)) != 0 && measurable.Nxk(Constraints.gh(j2)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.isPressed) {
            fXMQ = SwitchTokens.f29933n.ty();
        } else if (!z2 && !this.checked) {
            fXMQ = SwitchKt.mUb();
        } else {
            fXMQ = SwitchKt.xMQ();
        }
        float fL = measureScope.l(fXMQ);
        Animatable animatable = this.sizeAnim;
        if (animatable != null) {
            fFloatValue = ((Number) animatable.ty()).floatValue();
        } else {
            fFloatValue = fL;
        }
        int i2 = (int) fFloatValue;
        final Placeable placeableDR0 = measurable.dR0(Constraints.INSTANCE.t(i2, i2));
        final float fL2 = measureScope.l(Dp.KN(Dp.KN(SwitchKt.nr - measureScope.bzg(fL)) / 2.0f));
        float fL3 = measureScope.l(Dp.KN(Dp.KN(SwitchKt.f28009t - SwitchKt.xMQ()) - SwitchKt.f28007O));
        boolean z3 = this.isPressed;
        if (z3 && this.checked) {
            fL2 = fL3 - measureScope.l(SwitchTokens.f29933n.XQ());
        } else if (z3 && !this.checked) {
            fL2 = measureScope.l(SwitchTokens.f29933n.XQ());
        } else if (this.checked) {
            fL2 = fL3;
        }
        Animatable animatable2 = this.sizeAnim;
        if (animatable2 != null) {
            f3 = (Float) animatable2.qie();
        } else {
            f3 = null;
        }
        if (!Intrinsics.areEqual(f3, fL)) {
            C.nr(Xli(), null, null, new ThumbNode$measure$1(this, fL, null), 3, null);
        }
        Animatable animatable3 = this.offsetAnim;
        if (animatable3 != null) {
            f4 = (Float) animatable3.qie();
        } else {
            f4 = null;
        }
        if (!Intrinsics.areEqual(f4, fL2)) {
            C.nr(Xli(), null, null, new ThumbNode$measure$2(this, fL2, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fL;
            this.initialOffset = fL2;
        }
        return MeasureScope.ER(measureScope, i2, i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ThumbNode$measure$3
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
                Placeable placeable = placeableDR0;
                Animatable animatable4 = this.offsetAnim;
                Placeable.PlacementScope.az(placementScope, placeable, (int) (animatable4 != null ? ((Number) animatable4.ty()).floatValue() : fL2), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
