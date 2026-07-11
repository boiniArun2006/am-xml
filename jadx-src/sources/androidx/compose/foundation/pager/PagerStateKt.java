package androidx.compose.foundation.pager;

import GJW.Lu;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0005*\u0001-\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aQ\u0010!\u001a\u00020\r*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\b\u001fH\u0082@¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\"\u001a\u0010,\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "qie", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "currentPage", "currentPageOffsetFraction", c.f62177j, "(IFLkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/pager/PagerState;", "", "J2", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Uo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "KN", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;I)J", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "xMQ", "(Landroidx/compose/foundation/pager/PagerMeasureResult;I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "targetPage", "targetPageOffsetToSnappedPosition", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "updateTargetPage", "O", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "F", "mUb", "()F", "DefaultPositionThreshold", "rl", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "gh", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "EmptyLayoutInfo", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "t", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "UnitDensity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,994:1\n897#1,4:1006\n897#1,4:1014\n897#1,4:1018\n1247#2,6:995\n1#3:1001\n54#4:1002\n59#4:1004\n54#4:1010\n59#4:1012\n85#5:1003\n90#5:1005\n85#5:1011\n90#5:1013\n113#6:1022\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n928#1:1006,4\n974#1:1014,4\n985#1:1018,4\n89#1:995,6\n908#1:1002\n908#1:1004\n938#1:1010\n938#1:1012\n908#1:1003\n908#1:1005\n938#1:1011\n938#1:1013\n854#1:1022\n*E\n"})
public final class PagerStateKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f19020n = Dp.KN(56);
    private static final PagerMeasureResult rl = new PagerMeasureResult(CollectionsKt.emptyList(), 0, 0, 0, Orientation.f16970t, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.f17335n, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Map alignmentLines = MapsKt.emptyMap();

        @Override // androidx.compose.ui.layout.MeasureResult
        public void Z() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        /* JADX INFO: renamed from: o, reason: from getter */
        public Map getAlignmentLines() {
            return this.alignmentLines;
        }
    }, false, null, null, Lu.n(EmptyCoroutineContext.INSTANCE), 393216, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final PagerStateKt$UnitDensity$1 f19021t = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float density = 1.0f;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: yAc, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    };

    public static final PagerMeasureResult gh() {
        return rl;
    }

    public static final float mUb() {
        return f19020n;
    }

    public static final PagerState n(int i2, float f3, Function0 function0) {
        return new DefaultPagerState(i2, f3, function0);
    }

    public static final PagerState qie(final int i2, final float f3, final Function0 function0, Composer composer, int i3, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1210768637, i3, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = DefaultPagerState.INSTANCE.n();
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.t(i2)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.rl(f3)) || (i3 & 48) == 32) | ((((i3 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function0)) || (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<DefaultPagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i2, f3, function0);
                }
            };
            composer.o(objIF);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(function0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultPagerState;
    }

    public static final Object J2(PagerState pagerState, Continuation continuation) {
        if (pagerState.S() + 1 < pagerState.T()) {
            Object objTy = PagerState.ty(pagerState, pagerState.S() + 1, 0.0f, null, continuation, 6, null);
            if (objTy == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objTy;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final long KN(PagerLayoutInfo pagerLayoutInfo, int i2) {
        long jRl;
        long jMUb = (((((long) i2) * ((long) (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize()))) + ((long) pagerLayoutInfo.nr())) + ((long) pagerLayoutInfo.getAfterContentPadding())) - ((long) pagerLayoutInfo.getPageSpacing());
        if (pagerLayoutInfo.getOrientation() == Orientation.f16970t) {
            jRl = pagerLayoutInfo.rl() >> 32;
        } else {
            jRl = pagerLayoutInfo.rl() & 4294967295L;
        }
        int i3 = (int) jRl;
        return RangesKt.coerceAtLeast(jMUb - ((long) (i3 - RangesKt.coerceIn(pagerLayoutInfo.getSnapPosition().n(i3, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.nr(), pagerLayoutInfo.getAfterContentPadding(), i2 - 1, i2), 0, i3))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(final LazyLayoutScrollScope lazyLayoutScrollScope, int i2, float f3, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        boolean z2;
        int iCoerceAtMost;
        function2.invoke(lazyLayoutScrollScope, Boxing.boxInt(i2));
        if (i2 > lazyLayoutScrollScope.KN()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int iRl = (lazyLayoutScrollScope.rl() - lazyLayoutScrollScope.KN()) + 1;
        if (((z2 && i2 > lazyLayoutScrollScope.rl()) || (!z2 && i2 < lazyLayoutScrollScope.KN())) && Math.abs(i2 - lazyLayoutScrollScope.KN()) >= 3) {
            if (z2) {
                iCoerceAtMost = RangesKt.coerceAtLeast(i2 - iRl, lazyLayoutScrollScope.KN());
            } else {
                iCoerceAtMost = RangesKt.coerceAtMost(iRl + i2, lazyLayoutScrollScope.KN());
            }
            lazyLayoutScrollScope.t(iCoerceAtMost, 0);
        }
        float fO = LazyLayoutScrollScope.O(lazyLayoutScrollScope, i2, 0, 2, null) + f3;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        Object objO = SuspendAnimationKt.O(0.0f, fO, 0.0f, animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f4, Float f5) {
                n(f4.floatValue(), f5.floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f4, float f5) {
                floatRef.element += lazyLayoutScrollScope.nr(f4 - floatRef.element);
            }
        }, continuation, 4, null);
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objO;
        }
        return Unit.INSTANCE;
    }

    public static final Object Uo(PagerState pagerState, Continuation continuation) {
        if (pagerState.S() - 1 >= 0) {
            Object objTy = PagerState.ty(pagerState, pagerState.S() - 1, 0.0f, null, continuation, 6, null);
            if (objTy == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objTy;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long xMQ(PagerMeasureResult pagerMeasureResult, int i2) {
        long jRl;
        if (pagerMeasureResult.getOrientation() == Orientation.f16970t) {
            jRl = pagerMeasureResult.rl() >> 32;
        } else {
            jRl = pagerMeasureResult.rl() & 4294967295L;
        }
        int i3 = (int) jRl;
        return RangesKt.coerceIn(pagerMeasureResult.getSnapPosition().n(i3, pagerMeasureResult.getPageSize(), pagerMeasureResult.nr(), pagerMeasureResult.getAfterContentPadding(), 0, i2), 0, i3);
    }
}
