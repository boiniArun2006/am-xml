package androidx.compose.material.ripple;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "mUb", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "LGJW/vd;", "scope", "rl", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;LGJW/vd;)V", "Uo", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "t", "()V", "O", "nr", "Z", "J2", "F", "r", "Landroidx/compose/runtime/State;", "o", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/material/ripple/RippleAnimation;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "ripples", "", "S", "targetRadius", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,173:1\n132#2:174\n215#3,2:175\n215#3,2:177\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n121#1:174\n134#1:175,2\n153#1:177,2\n*E\n"})
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateMap ripples;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final State rippleAlpha;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final State color;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z2, float f3, State state, State state2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f3, state, state2);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
    }

    private CommonRippleIndicationInstance(boolean z2, float f3, State state, State state2) {
        super(z2, state2);
        this.bounded = z2;
        this.radius = f3;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.KN();
        this.targetRadius = Float.NaN;
    }

    private final void mUb(DrawScope drawScope, long j2) {
        long j3;
        Iterator it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            float pressedAlpha = ((RippleAlpha) this.rippleAlpha.getValue()).getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                j3 = j2;
            } else {
                j3 = j2;
                rippleAnimation.O(drawScope, Color.az(j3, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j2 = j3;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void Uo(PressInteraction.Press interaction) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.ripples.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.KN();
        }
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void n(ContentDrawScope contentDrawScope) throws Throwable {
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.n(contentDrawScope, this.bounded, contentDrawScope.t()) : contentDrawScope.l(this.radius);
        long value = ((Color) this.color.getValue()).getValue();
        contentDrawScope.l2();
        J2(contentDrawScope, this.radius, value);
        mUb(contentDrawScope, value);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void rl(PressInteraction.Press interaction, vd scope) {
        Iterator it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            ((RippleAnimation) ((Map.Entry) it.next()).getValue()).KN();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.nr(interaction.getPressPosition()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(interaction, rippleAnimation);
        C.nr(scope, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
    }
}
