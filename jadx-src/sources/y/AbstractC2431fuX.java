package y;

import Dj7.Ew;
import Dj7.eO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: y.fuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC2431fuX {

    /* JADX INFO: renamed from: y.fuX$j */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f75533O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ okd.j f75534n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f75535t;

        j(okd.j jVar, float f3, Function0 function0) {
            this.f75534n = jVar;
            this.f75535t = f3;
            this.f75533O = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-2123514357, i2, -1, "com.alightcreative.backup.ui.components.LoadingScreen.<anonymous> (LoadingScreen.kt:60)");
            }
            AbstractC2431fuX.Uo(this.f75534n, this.f75535t, this.f75533O, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: y.fuX$n */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[okd.j.values().length];
            try {
                iArr[okd.j.f71566n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[okd.j.f71567t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(okd.j jVar, float f3, Function0 function0, int i2, Composer composer, int i3) {
        nr(jVar, f3, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(okd.j jVar, float f3, Function0 function0, int i2, Composer composer, int i3) {
        Uo(jVar, f3, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final okd.j jVar, final float f3, Function0 function0, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Composer composer2;
        final Function0 function02 = function0;
        Composer composerKN = composer.KN(-1328424712);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(jVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function02) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1328424712, i3, -1, "com.alightcreative.backup.ui.components.LoadingScreenContent (LoadingScreen.kt:70)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f4 = 20;
            Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.nr(SizeKt.J2(companion, 0.0f, 1, null), aD.w6.W(), null, 2, null), Dp.KN(16), Dp.KN(f4));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composerKN, 0);
            int i8 = i3;
            ProgressIndicatorKt.rl(SizeKt.Z(PaddingKt.az(companion, 0.0f, Dp.KN(52), 0.0f, Dp.KN(32), 5, null), Dp.KN(48)), aD.w6.gh(), Dp.KN(8), aD.w6.O(), StrokeCap.INSTANCE.rl(), composerKN, 3510, 0);
            String str = RangesKt.coerceIn(MathKt.roundToInt(100 * f3), 0, 100) + "%";
            Modifier modifierAz = PaddingKt.az(companion, 0.0f, 0.0f, 0.0f, Dp.KN(f4), 7, null);
            H9N.j jVar2 = H9N.j.f3810n;
            TextKt.t(str, modifierAz, aD.w6.gh(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).Xw(), composerKN, 432, 0, 65528);
            int[] iArr = n.$EnumSwitchMapping$0;
            int i9 = iArr[jVar.ordinal()];
            if (i9 == 1) {
                i5 = 2132020389;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2132017706;
            }
            TextKt.t(StringResources_androidKt.t(i5, composerKN, 0), companion, aD.w6.gh(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).N(), composerKN, 432, 0, 65016);
            SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composerKN, 0);
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            int i10 = iArr[jVar.ordinal()];
            if (i10 == 1) {
                i7 = 2132020388;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = 2132017705;
            }
            String strT = StringResources_androidKt.t(i7, composerKN, 0);
            Dj7.CN3 cn3 = Dj7.CN3.f1600t;
            composer2 = composerKN;
            function02 = function0;
            eO.J2(function02, strT, modifierKN, null, cn3, TextStyle.t(Dj7.fuX.O(cn3, composerKN, 6), aD.w6.F(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), 0, 0, 0.0f, null, null, null, false, composer2, ((i8 >> 6) & 14) | 24960, 0, 8136);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: y.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2431fuX.KN(jVar, f3, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void nr(final okd.j operation, final float f3, final Function0 onUploadCancelled, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(onUploadCancelled, "onUploadCancelled");
        Composer composerKN = composer.KN(1019403091);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(operation) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onUploadCancelled) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1019403091, i3, -1, "com.alightcreative.backup.ui.components.LoadingScreen (LoadingScreen.kt:48)");
            }
            Ew.t(composerKN, 0);
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            DialogProperties dialogProperties = new DialogProperties(false, false, null, false, false, 7, null);
            Shape shapeN = RectangleShapeKt.n();
            long jW = aD.w6.W();
            composerKN.eF(-755482979);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: y.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2431fuX.O();
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            composer2 = composerKN;
            AndroidAlertDialog_androidKt.rl((Function0) objIF, ComposableLambdaKt.nr(-2123514357, true, new j(operation, f3, onUploadCancelled), composerKN, 54), modifierJ2, null, null, shapeN, 0L, jW, dialogProperties, composer2, 113443254, 88);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: y.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2431fuX.J2(operation, f3, onUploadCancelled, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
