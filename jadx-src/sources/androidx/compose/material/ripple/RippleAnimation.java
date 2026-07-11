package androidx.compose.material.ripple;

import GJW.Lu;
import GJW.ci;
import GJW.r;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R+\u00101\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b&\u0010,\"\u0004\b0\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Landroidx/compose/ui/geometry/Offset;", "origin", "", "radius", "", "bounded", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "J2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Uo", "nr", "KN", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "O", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", c.f62177j, "Landroidx/compose/ui/geometry/Offset;", "rl", "F", "t", "Z", "Ljava/lang/Float;", "startRadius", "targetCenter", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "LGJW/r;", "xMQ", "LGJW/r;", "finishSignalDeferred", "<set-?>", "mUb", "Landroidx/compose/runtime/MutableState;", "()Z", "qie", "(Z)V", "finishedFadingIn", "gh", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,182:1\n85#2:183\n113#2,2:184\n85#2:186\n113#2,2:187\n225#3,8:189\n272#3,14:197\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:183\n73#1:184,2\n74#1:186\n74#1:187,2\n150#1:189,8\n150#1:197,14\n*E\n"})
public final class RippleAnimation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Animatable animatedAlpha;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Animatable animatedCenterPercent;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Offset targetCenter;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Animatable animatedRadiusPercent;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState finishRequested;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableState finishedFadingIn;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Offset origin;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Float startRadius;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final r finishSignalDeferred;

    public /* synthetic */ RippleAnimation(Offset offset, float f3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f3, z2);
    }

    public final void KN() {
        gh(true);
        this.finishSignalDeferred.eF(Unit.INSTANCE);
    }

    private RippleAnimation(Offset offset, float f3, boolean z2) {
        this.origin = offset;
        this.radius = f3;
        this.bounded = z2;
        this.animatedAlpha = AnimatableKt.rl(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.rl(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.rl(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = ci.n(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.finishRequested = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
    }

    private final Object J2(Continuation continuation) {
        Object objJ2 = Lu.J2(new RippleAnimation$fadeIn$2(this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    private final Object Uo(Continuation continuation) {
        Object objJ2 = Lu.J2(new RippleAnimation$fadeOut$2(this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    private final void gh(boolean z2) {
        this.finishRequested.setValue(Boolean.valueOf(z2));
    }

    private final boolean mUb() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void qie(boolean z2) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z2));
    }

    private final boolean xMQ() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    public final void O(DrawScope drawScope, long j2) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.rl(drawScope.t()));
        }
        if (this.origin == null) {
            this.origin = Offset.nr(drawScope.Co());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.nr(OffsetKt.n(Size.gh(drawScope.t()) / 2.0f, Size.xMQ(drawScope.t()) / 2.0f));
        }
        float fFloatValue = (!xMQ() || mUb()) ? ((Number) this.animatedAlpha.ty()).floatValue() : 1.0f;
        Float f3 = this.startRadius;
        Intrinsics.checkNotNull(f3);
        float fRl = MathHelpersKt.rl(f3.floatValue(), this.radius, ((Number) this.animatedRadiusPercent.ty()).floatValue());
        Offset offset = this.origin;
        Intrinsics.checkNotNull(offset);
        float fAz = Offset.az(offset.getPackedValue());
        Offset offset2 = this.targetCenter;
        Intrinsics.checkNotNull(offset2);
        float fRl2 = MathHelpersKt.rl(fAz, Offset.az(offset2.getPackedValue()), ((Number) this.animatedCenterPercent.ty()).floatValue());
        Offset offset3 = this.origin;
        Intrinsics.checkNotNull(offset3);
        float fTy = Offset.ty(offset3.getPackedValue());
        Offset offset4 = this.targetCenter;
        Intrinsics.checkNotNull(offset4);
        long jN = OffsetKt.n(fRl2, MathHelpersKt.rl(fTy, Offset.ty(offset4.getPackedValue()), ((Number) this.animatedCenterPercent.ty()).floatValue()));
        long jAz = Color.az(j2, Color.ck(j2) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.Lu(drawScope, jAz, fRl, jN, 0.0f, null, null, 0, b.f61769v, null);
            return;
        }
        float fGh = Size.gh(drawScope.t());
        float fXMQ = Size.xMQ(drawScope.t());
        int iRl = ClipOp.INSTANCE.rl();
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().rl(0.0f, 0.0f, fGh, fXMQ, iRl);
            DrawScope.Lu(drawScope, jAz, fRl, jN, 0.0f, null, null, 0, b.f61769v, null);
        } finally {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.Uo(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nr(Continuation continuation) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        RippleAnimation rippleAnimation;
        if (continuation instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) continuation;
            int i2 = rippleAnimation$animate$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, continuation);
            }
        }
        Object obj = rippleAnimation$animate$1.f24013t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = rippleAnimation$animate$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            rippleAnimation$animate$1.f24012n = this;
            rippleAnimation$animate$1.J2 = 1;
            if (J2(rippleAnimation$animate$1) != coroutine_suspended) {
                rippleAnimation = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.f24012n;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.f24012n;
            ResultKt.throwOnFailure(obj);
            rippleAnimation$animate$1.f24012n = null;
            rippleAnimation$animate$1.J2 = 3;
        }
        rippleAnimation.qie(true);
        r rVar = rippleAnimation.finishSignalDeferred;
        rippleAnimation$animate$1.f24012n = rippleAnimation;
        rippleAnimation$animate$1.J2 = 2;
        if (rVar.await(rippleAnimation$animate$1) != coroutine_suspended) {
            rippleAnimation$animate$1.f24012n = null;
            rippleAnimation$animate$1.J2 = 3;
        }
        return coroutine_suspended;
    }
}
