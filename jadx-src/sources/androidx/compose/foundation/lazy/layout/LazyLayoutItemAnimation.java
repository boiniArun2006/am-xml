package androidx.compose.foundation.lazy.layout;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001]B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R+\u0010;\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b/\u00101\"\u0004\b:\u00107R+\u0010?\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00101\"\u0004\b>\u00107R+\u0010B\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\b@\u00101\"\u0004\bA\u00107R(\u0010H\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010K\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR(\u0010P\u001a\u0004\u0018\u00010L2\b\u0010-\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010OR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020U0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010SR1\u0010Z\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010E\"\u0004\bY\u0010GR(\u0010\\\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u0010C\u001a\u0004\bW\u0010E\"\u0004\b[\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(LGJW/vd;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function0;)V", "ty", "()V", "Landroidx/compose/ui/unit/IntOffset;", "delta", "", "isMovingAway", "az", "(JZ)V", "gh", "qie", "ViF", c.f62177j, "LGJW/vd;", "rl", "Landroidx/compose/ui/graphics/GraphicsContext;", "t", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "nr", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "iF", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "fadeInSpec", "O", "getPlacementSpec", "N", "placementSpec", "J2", "getFadeOutSpec", "fD", "fadeOutSpec", "<set-?>", "Uo", "Z", "aYN", "()Z", "isRunningMovingAwayAnimation", "KN", "Landroidx/compose/runtime/MutableState;", "WPU", "X", "(Z)V", "isPlacementAnimationInProgress", "xMQ", "nY", "isAppearanceAnimationInProgress", "mUb", "S", "te", "isDisappearanceAnimationInProgress", "XQ", "g", "isDisappearanceAnimationFinished", "J", "o", "()J", "nHg", "(J)V", "rawOffset", "HI", "E2", "finalOffset", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "ck", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Animatable;", "placementDeltaAnimation", "Landroidx/compose/animation/core/AnimationVector1D;", "visibilityAnimation", "Ik", "r", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "placementDelta", "e", "lookaheadOffset", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,281:1\n85#2:282\n113#2,2:283\n85#2:285\n113#2,2:286\n85#2:288\n113#2,2:289\n85#2:291\n113#2,2:292\n85#2:294\n113#2,2:295\n1#3:297\n32#4:298\n80#5:299\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n*L\n57#1:282\n57#1:283,2\n61#1:285\n61#1:286,2\n65#1:288\n65#1:289,2\n69#1:291\n69#1:292,2\n99#1:294\n99#1:295,2\n239#1:298\n239#1:299\n*E\n"})
public final class LazyLayoutItemAnimation {
    private static final long XQ;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Animatable placementDeltaAnimation;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final MutableState placementDelta;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private FiniteAnimationSpec fadeOutSpec;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState isPlacementAnimationInProgress;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private FiniteAnimationSpec placementSpec;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private long finalOffset;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final Animatable visibilityAnimation;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState isDisappearanceAnimationFinished;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableState isDisappearanceAnimationInProgress;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private FiniteAnimationSpec fadeInSpec;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long rawOffset;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final GraphicsContext graphicsContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 onLayerPropertyChanged;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private GraphicsLayer layer;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState isAppearanceAnimationInProgress;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f18413Z = 8;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f18419n = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "NotInitialized", "J", c.f62177j, "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return LazyLayoutItemAnimation.XQ;
        }
    }

    static {
        long j2 = Integer.MAX_VALUE;
        XQ = IntOffset.J2((j2 & 4294967295L) | (j2 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j2) {
        this.placementDelta.setValue(IntOffset.t(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(boolean z2) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean z2) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nY(boolean z2) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void te(boolean z2) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z2));
    }

    public final void E2(long j2) {
        this.finalOffset = j2;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    public final void N(FiniteAnimationSpec finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public final boolean S() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    public final boolean WPU() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    public final boolean XQ() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    public final boolean Z() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void az(long delta, boolean isMovingAway) {
        FiniteAnimationSpec finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long jTy = IntOffset.ty(r(), delta);
        T(jTy);
        X(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, jTy, null), 3, null);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    public final void e(long j2) {
        this.lookaheadOffset = j2;
    }

    public final void fD(FiniteAnimationSpec finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    public final void gh() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec finiteAnimationSpec = this.fadeInSpec;
        if (Z() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (S()) {
                if (graphicsLayer != null) {
                    graphicsLayer.wTp(1.0f);
                }
                C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3, null);
                return;
            }
            return;
        }
        nY(true);
        boolean zS = S();
        boolean z2 = !zS;
        if (!zS) {
            graphicsLayer.wTp(0.0f);
        }
        C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z2, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void iF(FiniteAnimationSpec finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void nHg(long j2) {
        this.rawOffset = j2;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    public final void qie() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || S() || finiteAnimationSpec == null) {
            return;
        }
        te(true);
        C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateDisappearance$1(this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final long r() {
        return ((IntOffset) this.placementDelta.getValue()).getPackedValue();
    }

    public LazyLayoutItemAnimation(vd vdVar, GraphicsContext graphicsContext, Function0 function0) {
        GraphicsLayer graphicsLayerN;
        this.coroutineScope = vdVar;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = function0;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        long j2 = XQ;
        this.rawOffset = j2;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.finalOffset = companion.rl();
        if (graphicsContext != null) {
            graphicsLayerN = graphicsContext.n();
        } else {
            graphicsLayerN = null;
        }
        this.layer = graphicsLayerN;
        String str = null;
        this.placementDeltaAnimation = new Animatable(IntOffset.t(companion.rl()), VectorConvertersKt.Uo(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), str, null, 12, null);
        this.placementDelta = SnapshotStateKt__SnapshotStateKt.O(IntOffset.t(companion.rl()), null, 2, null);
        this.lookaheadOffset = j2;
    }

    public final void ViF() {
        GraphicsContext graphicsContext;
        if (WPU()) {
            X(false);
            C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3, null);
        }
        if (Z()) {
            nY(false);
            C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3, null);
        }
        if (S()) {
            te(false);
            C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        T(IntOffset.INSTANCE.rl());
        this.rawOffset = XQ;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.rl(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    public final void ty() {
        if (WPU()) {
            C.nr(this.coroutineScope, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }
}
