package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "velocity", "", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", c.f62177j, "(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "nr", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", "F", "DragHandleVerticalPadding", "Landroidx/compose/animation/core/AnimationSpec;", "rl", "Landroidx/compose/animation/core/AnimationSpec;", "BottomSheetAnimationSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n77#2:437\n1223#3,6:438\n148#4:444\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n409#1:437\n421#1:438,6\n432#1:444\n*E\n"})
public final class SheetDefaultsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27525n = Dp.KN(22);
    private static final AnimationSpec rl = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.nr(), 2, null);

    public static final NestedScrollConnection n(final SheetState sheetState, final Orientation orientation, final Function1 function1) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            private final float n(long j2) {
                return orientation == Orientation.f16970t ? Offset.az(j2) : Offset.ty(j2);
            }

            private final long rl(float f3) {
                Orientation orientation2 = orientation;
                float f4 = orientation2 == Orientation.f16970t ? f3 : 0.0f;
                if (orientation2 != Orientation.f16969n) {
                    f3 = 0.0f;
                }
                return OffsetKt.n(f4, f3);
            }

            private final float t(long j2) {
                return orientation == Orientation.f16970t ? Velocity.KN(j2) : Velocity.xMQ(j2);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long F(long consumed, long available, int source) {
                return NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) ? rl(sheetState.getAnchoredDraggableState().ty(n(available))) : Offset.INSTANCE.t();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public Object z(long j2, long j3, Continuation continuation) {
                function1.invoke(Boxing.boxFloat(t(j3)));
                return Velocity.rl(j3);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public Object lS(long j2, Continuation continuation) {
                float fT = t(j2);
                float fTy = sheetState.ty();
                float fO = sheetState.getAnchoredDraggableState().HI().O();
                if (fT < 0.0f && fTy > fO) {
                    function1.invoke(Boxing.boxFloat(fT));
                } else {
                    j2 = Velocity.INSTANCE.n();
                }
                return Velocity.rl(j2);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long tEO(long available, int source) {
                float fN = n(available);
                if (fN < 0.0f && NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl())) {
                    return rl(sheetState.getAnchoredDraggableState().ty(fN));
                }
                return Offset.INSTANCE.t();
            }
        };
    }

    public static final SheetState nr(boolean z2, Function1 function1, SheetValue sheetValue, boolean z3, Composer composer, int i2, int i3) {
        final boolean z4 = (i3 & 1) != 0 ? false : z2;
        if ((i3 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SheetValue sheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final Function1 function12 = function1;
        final SheetValue sheetValue2 = (i3 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z5 = (i3 & 8) != 0 ? false : z3;
        if (ComposerKt.v()) {
            ComposerKt.p5(1032784200, i2, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        Object[] objArr = {Boolean.valueOf(z4), function12, Boolean.valueOf(z5)};
        Saver saverN = SheetState.INSTANCE.n(z4, function12, density, z5);
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.n(z4)) || (i2 & 6) == 4) | composer.p5(density) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(sheetValue2)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 112) ^ 48) > 32 && composer.p5(function12)) || (i2 & 48) == 32) | ((((i2 & 7168) ^ 3072) > 2048 && composer.n(z5)) || (i2 & 3072) == 2048);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            Object obj = new Function0<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final SheetState invoke() {
                    return new SheetState(z4, density, sheetValue2, function12, z5);
                }
            };
            composer.o(obj);
            objIF = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return sheetState;
    }
}
