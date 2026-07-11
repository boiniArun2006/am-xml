package androidx.compose.material3;

import GJW.vd;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.view.compose.PredictiveBackHandlerKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u001a\u0010\u0013\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/DrawerState;", "drawerState", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "F", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "PredictiveBackDrawerMaxScaleXDistanceGrow", "rl", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleXDistanceShrink", "t", "getPredictiveBackDrawerMaxScaleYDistance", "PredictiveBackDrawerMaxScaleYDistance", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n1223#2,6:103\n1223#2,3:114\n1226#2,3:120\n1223#2,6:126\n1223#2,6:132\n488#3:109\n487#3,4:110\n491#3,2:117\n495#3:123\n487#4:119\n77#5:124\n77#5:125\n148#6:138\n148#6:139\n148#6:140\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n*L\n46#1:103,6\n47#1:114,3\n47#1:120,3\n58#1:126,6\n90#1:132,6\n47#1:109\n47#1:110,4\n47#1:117,2\n47#1:123\n47#1:119\n48#1:124\n52#1:125\n99#1:138\n100#1:139\n101#1:140\n*E\n"})
public final class NavigationDrawer_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26638n = Dp.KN(12);
    private static final float rl = Dp.KN(24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26639t = Dp.KN(48);

    public static final void n(final DrawerState drawerState, final Function3 function3, Composer composer, final int i2) {
        int i3;
        Object navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
        int i5;
        boolean z2;
        int i7;
        Composer composerKN = composer.KN(1444817207);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(drawerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function3) ? 32 : 16;
        }
        int i8 = i3;
        if ((i8 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1444817207, i8, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new DrawerPredictiveBackState();
                composerKN.o(objIF);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF2 = compositionScopedCoroutineScopeCanceller;
            }
            vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF2).getCoroutineScope();
            boolean z3 = composerKN.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Ref.FloatRef floatRef3 = new Ref.FloatRef();
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            floatRef.element = density.l(f26638n);
            floatRef2.element = density.l(rl);
            floatRef3.element = density.l(f26639t);
            boolean zMUb = drawerState.mUb();
            int i9 = i8 & 14;
            boolean zN = composerKN.n(z3) | composerKN.rl(floatRef.element) | composerKN.rl(floatRef2.element) | composerKN.rl(floatRef3.element) | composerKN.E2(coroutineScope) | (i9 == 4);
            Object objIF3 = composerKN.iF();
            if (zN || objIF3 == companion.n()) {
                i5 = i8;
                z2 = zMUb;
                i7 = 0;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z3, floatRef, floatRef2, floatRef3, null);
                composerKN.o(navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1);
            } else {
                i5 = i8;
                z2 = zMUb;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = objIF3;
                i7 = 0;
            }
            PredictiveBackHandlerKt.n(z2, (Function2) navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, composerKN, i7, i7);
            Boolean boolValueOf = Boolean.valueOf(drawerState.xMQ());
            int i10 = i9 == 4 ? 1 : i7;
            Object objIF4 = composerKN.iF();
            if (i10 != 0 || objIF4 == companion.n()) {
                objIF4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerKN.o(objIF4);
            }
            EffectsKt.O(boolValueOf, (Function2) objIF4, composerKN, i7);
            function3.invoke(drawerPredictiveBackState, composerKN, Integer.valueOf((i5 & 112) | 6));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    NavigationDrawer_androidKt.n(drawerState, function3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
