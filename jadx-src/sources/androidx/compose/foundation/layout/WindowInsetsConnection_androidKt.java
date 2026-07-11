package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nr", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", c.f62177j, "F", "PlatformFlingScrollFriction", "", "rl", "D", "DecelerationRate", "t", "DecelMinusOne", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,708:1\n110#2:709\n75#3:710\n75#3:711\n75#3:712\n1247#4,6:713\n1247#4,6:719\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n76#1:709\n110#1:710\n112#1:711\n113#1:712\n115#1:713,6\n118#1:719,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f17836n = ViewConfiguration.getScrollFriction();
    private static final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f17837t;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        rl = dLog;
        f17837t = dLog - 1.0d;
    }

    public static final NestedScrollConnection nr(AndroidWindowInsets androidWindowInsets, int i2, Composer composer, int i3) {
        boolean z2;
        composer.eF(-1011341039);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1011341039, i3, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.f17541n;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return doNothingNestedScrollConnection;
        }
        SideCalculator sideCalculatorN = SideCalculator.INSTANCE.n(i2, (LayoutDirection) composer.ty(CompositionLocalsKt.az()));
        View view = (View) composer.ty(AndroidCompositionLocals_androidKt.gh());
        Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        if ((((i3 & 14) ^ 6) > 4 && composer.p5(androidWindowInsets)) || (i3 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zP5 = z2 | composer.p5(view) | composer.p5(sideCalculatorN) | composer.p5(density);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, sideCalculatorN, density);
            composer.o(objIF);
        }
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objIF;
        boolean zE2 = composer.E2(windowInsetsNestedScrollConnection);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            windowInsetsNestedScrollConnection2.mUb();
                        }
                    };
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.rl(windowInsetsNestedScrollConnection, (Function1) objIF2, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return windowInsetsNestedScrollConnection;
    }
}
