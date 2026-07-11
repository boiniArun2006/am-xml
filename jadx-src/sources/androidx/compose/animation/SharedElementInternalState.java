package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\"\u0010&\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010(\u001a\u0004\b \u0010)\"\u0004\b*\u0010+R+\u0010\r\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R+\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010,\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010,\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R+\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\b!\u0010E\"\u0004\bF\u0010GR$\u0010M\u001a\u0004\u0018\u00010H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010I\u001a\u0004\bJ\u0010K\"\u0004\b?\u0010LR*\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010Z\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010V\u001a\u0004\bW\u0010X\"\u0004\bD\u0010YR/\u0010a\u001a\u0004\u0018\u00010[2\b\u0010'\u001a\u0004\u0018\u00010[8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010,\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010#R\u0017\u0010f\u001a\u00020d8Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\be\u0010\u001bR\u0014\u0010g\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0011\u0010h\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "", "renderOnlyWhenVisible", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "overlayClip", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "userState", "", "zIndex", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "", "rl", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/geometry/Offset;", "J2", "()J", "t", "()V", "O", "nr", c.f62177j, "Z", "getFirstFrameDrawn$animation_release", "()Z", "WPU", "(Z)V", "firstFrameDrawn", "<set-?>", "Landroidx/compose/runtime/MutableFloatState;", "()F", "X", "(F)V", "Landroidx/compose/runtime/MutableState;", "ty", "iF", "ck", "()Landroidx/compose/animation/SharedElement;", "E2", "(Landroidx/compose/animation/SharedElement;)V", "r", "Uo", "()Landroidx/compose/animation/BoundsAnimation;", "XQ", "(Landroidx/compose/animation/BoundsAnimation;)V", "o", "az", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "te", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "HI", "fD", "S", "gh", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "nY", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "g", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "e", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", "KN", "()Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "clipPathInOverlay", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/jvm/functions/Function0;", "getLookaheadCoords", "()Lkotlin/jvm/functions/Function0;", "ViF", "(Lkotlin/jvm/functions/Function0;)V", "lookaheadCoords", "Landroidx/compose/animation/SharedElementInternalState;", "qie", "()Landroidx/compose/animation/SharedElementInternalState;", "(Landroidx/compose/animation/SharedElementInternalState;)V", "parentState", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "xMQ", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "aYN", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "Ik", "shouldRenderBasedOnTarget", "Landroidx/compose/ui/geometry/Size;", "mUb", "nonNullLookaheadSize", "shouldRenderInOverlay", "shouldRenderInPlace", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,247:1\n79#2:248\n112#2,2:249\n85#3:251\n113#3,2:252\n85#3:254\n113#3,2:255\n85#3:257\n113#3,2:258\n85#3:260\n113#3,2:261\n85#3:263\n113#3,2:264\n85#3:266\n113#3,2:267\n85#3:269\n113#3,2:270\n85#3:312\n113#3,2:313\n1#4:272\n71#5:273\n65#5:274\n73#5:277\n69#5:278\n60#6:275\n70#6:279\n22#7:276\n221#8,5:280\n249#8,9:285\n120#8,7:294\n259#8,4:301\n120#8,7:305\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n174#1:248\n174#1:249,2\n176#1:251\n176#1:252,2\n177#1:254\n177#1:255,2\n178#1:257\n178#1:258,2\n179#1:260\n179#1:261,2\n180#1:263\n180#1:264,2\n181#1:266\n181#1:267,2\n182#1:269\n182#1:270,2\n223#1:312\n223#1:313,2\n194#1:273\n194#1:274\n194#1:277\n194#1:278\n194#1:275\n194#1:279\n194#1:276\n195#1:280,5\n195#1:285,9\n195#1:294,7\n195#1:301,4\n196#1:305,7\n*E\n"})
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Path clipPathInOverlay;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState sharedElement;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState renderInOverlayDuringTransition;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableState overlayClip;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private SharedElementInternalState parentState;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableState renderOnlyWhenVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableState userState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean firstFrameDrawn;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState placeHolderSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final MutableState boundsAnimation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState zIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0 lookaheadCoords = new Function0() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    };

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final MutableState layer = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
    }

    public final void E2(SharedElement sharedElement) {
        this.sharedElement.setValue(sharedElement);
    }

    public final boolean HI() {
        return ((Boolean) this.renderOnlyWhenVisible.getValue()).booleanValue();
    }

    public final long J2() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        return ck().getScope().mUb().nHg((LayoutCoordinates) objInvoke, Offset.INSTANCE.t());
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Path getClipPathInOverlay() {
        return this.clipPathInOverlay;
    }

    public final void S(Path path) {
        this.clipPathInOverlay = path;
    }

    public final BoundsAnimation Uo() {
        return (BoundsAnimation) this.boundsAnimation.getValue();
    }

    public final void ViF(Function0 function0) {
        this.lookaheadCoords = function0;
    }

    public final void WPU(boolean z2) {
        this.firstFrameDrawn = z2;
    }

    public void X(float f3) {
        this.zIndex.Z(f3);
    }

    public final void XQ(BoundsAnimation boundsAnimation) {
        this.boundsAnimation.setValue(boundsAnimation);
    }

    public final SharedTransitionScope.SharedContentState Z() {
        return (SharedTransitionScope.SharedContentState) this.userState.getValue();
    }

    public final void aYN(GraphicsLayer graphicsLayer) {
        this.layer.setValue(graphicsLayer);
    }

    public final SharedTransitionScope.PlaceHolderSize az() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize.getValue();
    }

    public final SharedElement ck() {
        return (SharedElement) this.sharedElement.getValue();
    }

    public final void e(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState.setValue(sharedContentState);
    }

    public final void fD(boolean z2) {
        this.renderOnlyWhenVisible.setValue(Boolean.valueOf(z2));
    }

    public void g(SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    public final SharedTransitionScope.OverlayClip gh() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip.getValue();
    }

    public final void iF(boolean z2) {
        this.renderInOverlayDuringTransition.setValue(Boolean.valueOf(z2));
    }

    public final long mUb() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke != null) {
            return IntSizeKt.O(((LayoutCoordinates) objInvoke).n());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + ck().getKey() + '.').toString());
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float n() {
        return this.zIndex.n();
    }

    public final void nY(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip.setValue(overlayClip);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public final void te(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize.setValue(placeHolderSize);
    }

    public final boolean ty() {
        return ((Boolean) this.renderInOverlayDuringTransition.getValue()).booleanValue();
    }

    public final GraphicsLayer xMQ() {
        return (GraphicsLayer) this.layer.getValue();
    }

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.OverlayClip overlayClip, boolean z3, SharedTransitionScope.SharedContentState sharedContentState, float f3) {
        this.zIndex = PrimitiveSnapshotStateKt.n(f3);
        this.renderInOverlayDuringTransition = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z3), null, 2, null);
        this.sharedElement = SnapshotStateKt__SnapshotStateKt.O(sharedElement, null, 2, null);
        this.boundsAnimation = SnapshotStateKt__SnapshotStateKt.O(boundsAnimation, null, 2, null);
        this.placeHolderSize = SnapshotStateKt__SnapshotStateKt.O(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z2), null, 2, null);
        this.overlayClip = SnapshotStateKt__SnapshotStateKt.O(overlayClip, null, 2, null);
        this.userState = SnapshotStateKt__SnapshotStateKt.O(sharedContentState, null, 2, null);
    }

    private final boolean Ik() {
        if (!Intrinsics.areEqual(ck().getTargetBoundsProvider(), this) && HI()) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        ck().getScope().XQ(this);
        ck().Z();
    }

    public final boolean o() {
        if (ck().nr()) {
            if (r() || !Ik()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean r() {
        if (Ik() && ck().nr() && ty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void rl(DrawScope drawScope) {
        Offset offsetNr;
        GraphicsLayer graphicsLayerXMQ = xMQ();
        if (graphicsLayerXMQ != null && this.firstFrameDrawn && r()) {
            if (ck().t() != null) {
                Rect rectT = ck().t();
                Unit unit = null;
                if (rectT != null) {
                    offsetNr = Offset.nr(rectT.Z());
                } else {
                    offsetNr = null;
                }
                Intrinsics.checkNotNull(offsetNr);
                long packedValue = offsetNr.getPackedValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & 4294967295L));
                Path path = this.clipPathInOverlay;
                if (path != null) {
                    int iRl = ClipOp.INSTANCE.rl();
                    DrawContext drawContextMx = drawScope.getDrawContext();
                    long jT2 = drawContextMx.t();
                    drawContextMx.KN().O();
                    try {
                        drawContextMx.getTransform().t(path, iRl);
                        drawScope.getDrawContext().getTransform().nr(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            GraphicsLayerKt.n(drawScope, graphicsLayerXMQ);
                            drawContextMx.KN().n();
                            drawContextMx.xMQ(jT2);
                            unit = Unit.INSTANCE;
                        } finally {
                        }
                    } catch (Throwable th) {
                        drawContextMx.KN().n();
                        drawContextMx.xMQ(jT2);
                        throw th;
                    }
                }
                if (unit == null) {
                    drawScope.getDrawContext().getTransform().nr(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.n(drawScope, graphicsLayerXMQ);
                        return;
                    } finally {
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Error: current bounds not set yet.");
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
        ck().getScope().Z(this);
        ck().Z();
    }
}
