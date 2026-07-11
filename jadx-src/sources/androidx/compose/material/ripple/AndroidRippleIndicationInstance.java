package androidx.compose.material.ripple;

import GJW.vd;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0011*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R/\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010>\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/material/ripple/RippleHostKey;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "gh", "()V", "Landroidx/compose/material/ripple/RippleContainer;", "az", "()Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "LGJW/vd;", "scope", "rl", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;LGJW/vd;)V", "Uo", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "t", "O", "nr", "NP", "Z", "J2", "F", "r", "Landroidx/compose/runtime/State;", "o", "Landroid/view/ViewGroup;", "S", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "Landroidx/compose/material/ripple/RippleHostView;", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "ty", "()Landroidx/compose/material/ripple/RippleHostView;", "ck", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "E2", "qie", "()Z", "HI", "(Z)V", "invalidateTick", "Landroidx/compose/ui/geometry/Size;", "e", "J", "rippleSize", "", "X", "I", "rippleRadius", "Lkotlin/Function0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/jvm/functions/Function0;", "onInvalidateRipple", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n85#2:363\n113#2,2:364\n85#2:366\n113#2,2:367\n132#3:369\n256#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n215#1:363\n215#1:364,2\n223#1:366\n223#1:367,2\n244#1:369\n258#1:370\n*E\n"})
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final MutableState invalidateTick;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private RippleContainer rippleContainer;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Function0 onInvalidateRipple;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private int rippleRadius;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup view;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableState rippleHostView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final State rippleAlpha;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final State color;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z2, float f3, State state, State state2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f3, state, state2, viewGroup);
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void NP() {
        ck(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
    }

    private AndroidRippleIndicationInstance(boolean z2, float f3, State state, State state2, ViewGroup viewGroup) {
        super(z2, state2);
        this.bounded = z2;
        this.radius = f3;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.invalidateTick = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
        this.rippleSize = Size.INSTANCE.rl();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
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
                this.f23983n.HI(!r0.qie());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void HI(boolean z2) {
        this.invalidateTick.setValue(Boolean.valueOf(z2));
    }

    private final RippleContainer az() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            Intrinsics.checkNotNull(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerT = Ripple_androidKt.t(this.view);
        this.rippleContainer = rippleContainerT;
        Intrinsics.checkNotNull(rippleContainerT);
        return rippleContainerT;
    }

    private final void ck(RippleHostView rippleHostView) {
        this.rippleHostView.setValue(rippleHostView);
    }

    private final void gh() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean qie() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    private final RippleHostView ty() {
        return (RippleHostView) this.rippleHostView.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        gh();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void Uo(PressInteraction.Press interaction) {
        RippleHostView rippleHostViewTy = ty();
        if (rippleHostViewTy != null) {
            rippleHostViewTy.O();
        }
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void n(ContentDrawScope contentDrawScope) throws Throwable {
        int iHow;
        this.rippleSize = contentDrawScope.t();
        if (Float.isNaN(this.radius)) {
            iHow = MathKt.roundToInt(RippleAnimationKt.n(contentDrawScope, this.bounded, contentDrawScope.t()));
        } else {
            iHow = contentDrawScope.How(this.radius);
        }
        this.rippleRadius = iHow;
        long value = ((Color) this.color.getValue()).getValue();
        float pressedAlpha = ((RippleAlpha) this.rippleAlpha.getValue()).getPressedAlpha();
        contentDrawScope.l2();
        J2(contentDrawScope, this.radius, value);
        Canvas canvasKN = contentDrawScope.getDrawContext().KN();
        qie();
        RippleHostView rippleHostViewTy = ty();
        if (rippleHostViewTy != null) {
            rippleHostViewTy.J2(contentDrawScope.t(), this.rippleRadius, value, pressedAlpha);
            rippleHostViewTy.draw(AndroidCanvas_androidKt.nr(canvasKN));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        gh();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void rl(PressInteraction.Press interaction, vd scope) {
        RippleHostView rippleHostViewRl = az().rl(this);
        rippleHostViewRl.rl(interaction, this.bounded, this.rippleSize, this.rippleRadius, ((Color) this.color.getValue()).getValue(), ((RippleAlpha) this.rippleAlpha.getValue()).getPressedAlpha(), this.onInvalidateRipple);
        ck(rippleHostViewRl);
    }
}
