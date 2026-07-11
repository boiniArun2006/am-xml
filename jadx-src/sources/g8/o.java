package g8;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f67113n;
    private static final float rl;

    static {
        float fKN = Dp.KN(500);
        f67113n = fKN;
        rl = Dp.KN(fKN / 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Brush brush, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.QgZ(Canvas, brush, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Brush brush, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.QgZ(Canvas, brush, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        nr(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void nr(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Composer composerKN = composer.KN(-241193088);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-241193088, i5, -1, "com.alightcreative.monetization.stackedintro.components.PaywallBackground (PaywallBackground.kt:19)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            final Brush brushJ2 = Brush.Companion.J2(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.xMQ(ColorKt.nr(2786101623L))), TuplesKt.to(Float.valueOf(0.3f), Color.xMQ(ColorKt.nr(2148567415L))), TuplesKt.to(Float.valueOf(0.5f), Color.xMQ(ColorKt.rl(1494255991))), TuplesKt.to(Float.valueOf(1.0f), Color.xMQ(ColorKt.rl(67108863)))}, 0L, 0.0f, 0, 14, null);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f3 = f67113n;
            Modifier modifierZ = SizeKt.Z(companion3, f3);
            float f4 = rl;
            Modifier modifierN = boxScopeInstance.n(OffsetKt.rl(modifierZ, Dp.KN(-f4), f4), companion.nr());
            composerKN.eF(992605977);
            boolean zP5 = composerKN.p5(brushJ2);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: g8.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.O(brushJ2, (DrawScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            CanvasKt.rl(modifierN, (Function1) objIF, composerKN, 0);
            Modifier modifierN2 = boxScopeInstance.n(OffsetKt.rl(SizeKt.Z(companion3, f3), f4, Dp.KN(-f4)), companion.ty());
            composerKN.eF(992614425);
            boolean zP52 = composerKN.p5(brushJ2);
            Object objIF2 = composerKN.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: g8.aC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.J2(brushJ2, (DrawScope) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            CanvasKt.rl(modifierN2, (Function1) objIF2, composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.Uo(modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
