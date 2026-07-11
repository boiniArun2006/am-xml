package d3z;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import d3z.C1952c;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class QJ {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(List list, Function1 function1, int i2, Composer composer, int i3) {
        qie(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Modifier modifier, j jVar, Function1 function1, Function1 function12, int i2, int i3, Composer composer, int i5) {
        XQ(modifier, jVar, function1, function12, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void ViF(final List list, final Function1 function1, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i5 = 48;
        Composer composerKN = composer.KN(2133781847);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2133781847, i3, -1, "com.bendingspoons.monopoly.secretmenu.SubscriptionsList (ProductsScreen.kt:86)");
            }
            composerKN.eF(-718488619);
            if (list == null) {
                ProgressIndicatorKt.nr(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2)), 0L, 0.0f, 0L, 0, composerKN, 6, 30);
                composerKN.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: d3z.eO
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return QJ.te(list, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerKN.Xw();
            float f3 = 6;
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(f3));
            int i7 = 0;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            if (list.isEmpty()) {
                composerKN.eF(-822916372);
                composer2 = composerKN;
                TextKt.t("No active products.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 131070);
                composer2.Xw();
            } else {
                composerKN.eF(-822844018);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final Q q2 = (Q) it.next();
                    Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composerKN, i5);
                    int iN2 = ComposablesKt.n(composerKN, i7);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.s7N(function0N2);
                    } else {
                        composerKN.r();
                    }
                    Composer composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyRl, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    Function2 function2Rl2 = companion3.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    float f4 = f3;
                    int i8 = i7;
                    Composer composer3 = composerKN;
                    int i9 = i3;
                    TextKt.t(q2.n(), RowScope.rl(RowScopeInstance.f17780n, companion2, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131068);
                    Modifier modifierN = SizeKt.n(companion2, Dp.KN(1), Dp.KN(f4));
                    composer3.eF(-530755944);
                    int i10 = (composer3.p5(q2) ? 1 : 0) | ((i9 & 112) != 32 ? i8 : 1);
                    Object objIF = composer3.iF();
                    if (i10 != 0 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: d3z.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return QJ.nY(function1, q2);
                            }
                        };
                        composer3.o(objIF);
                    }
                    composer3.Xw();
                    ButtonKt.nr((Function0) objIF, modifierN, false, null, null, null, null, null, null, w6.f63453n.n(), composer3, 805306416, 508);
                    composer3.XQ();
                    composerKN = composer3;
                    i3 = i9;
                    f3 = f4;
                    i7 = i8;
                    i5 = 48;
                }
                composer2 = composerKN;
                composer2.Xw();
            }
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composer2.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2() { // from class: d3z.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.g(list, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void WPU(final String str, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(-1682045246);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1682045246, i3, -1, "com.bendingspoons.monopoly.secretmenu.SectionTitle (ProductsScreen.kt:74)");
            }
            composer2 = composerKN;
            TextKt.t(str, PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composerKN, MaterialTheme.rl).getHeadlineMedium(), composer2, (i3 & 14) | 48, 0, 65532);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: d3z.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.aYN(str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void XQ(Modifier modifier, final j jVar, final Function1 function1, final Function1 function12, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        j jVar2;
        int i7;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1677059087);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                jVar2 = jVar;
                i5 |= composerKN.p5(jVar2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function1) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function12) ? 2048 : 1024;
            }
            i7 = i5;
            if ((i7 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1677059087, i7, -1, "com.bendingspoons.monopoly.secretmenu.ProductsScreenContent (ProductsScreen.kt:52)");
                }
                Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(modifier4, Color.INSTANCE.KN(), null, 2, null), Dp.KN(16));
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.nr(), Alignment.INSTANCE.gh(), composerKN, 6);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                WPU("Active subscriptions", composerKN, 6);
                ViF(jVar2.rl(), function1, composerKN, (i7 >> 3) & 112);
                DividerKt.rl(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(4)), 0.0f, 0L, composerKN, 6, 6);
                WPU("Active one-time products", composerKN, 6);
                qie(jVar2.n(), function12, composerKN, (i7 >> 6) & 112);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: d3z.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QJ.S(modifier3, jVar, function1, function12, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        jVar2 = jVar;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i7 = i5;
        if ((i7 & 1171) == 1170) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierXMQ2 = PaddingKt.xMQ(BackgroundKt.nr(modifier4, Color.INSTANCE.KN(), null, 2, null), Dp.KN(16));
            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.nr(), Alignment.INSTANCE.gh(), composerKN, 6);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierXMQ2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
            function2Rl = companion2.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion2.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                WPU("Active subscriptions", composerKN, 6);
                ViF(jVar2.rl(), function1, composerKN, (i7 >> 3) & 112);
                DividerKt.rl(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(4)), 0.0f, 0L, composerKN, 6, 6);
                WPU("Active one-time products", composerKN, 6);
                qie(jVar2.n(), function12, composerKN, (i7 >> 6) & 112);
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(YV.Wre wre, int i2, Composer composer, int i3) {
        ck(wre, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(String str, int i2, Composer composer, int i3) {
        WPU(str, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(List list, Function1 function1, int i2, Composer composer, int i3) {
        qie(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void ck(final YV.Wre monopoly, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Composer composerKN = composer.KN(-1955236605);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(monopoly) : composerKN.E2(monopoly) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1955236605, i3, -1, "com.bendingspoons.monopoly.secretmenu.ProductsScreen (ProductsScreen.kt:28)");
            }
            final Context applicationContext = ((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo())).getApplicationContext();
            C1952c.j jVar = C1952c.KN;
            String packageName = applicationContext.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            ViewModelProvider.Factory factoryRl = jVar.rl(monopoly, packageName);
            composerKN.te(1729797275);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, 6);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelT = ViewModelKt.t(Reflection.getOrCreateKotlinClass(C1952c.class), viewModelStoreOwnerT, null, factoryRl, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composerKN, 0, 0);
            composerKN = composerKN;
            composerKN.M7();
            final C1952c c1952c = (C1952c) viewModelT;
            j jVarIk = Ik(FlowExtKt.t(c1952c.nr(), null, null, null, composerKN, 0, 7));
            composerKN.eF(-1554839266);
            boolean zE2 = composerKN.E2(c1952c) | composerKN.E2(applicationContext);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: d3z.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QJ.r(c1952c, applicationContext, (Q) obj);
                    }
                };
                composerKN.o(objIF);
            }
            Function1 function1 = (Function1) objIF;
            composerKN.Xw();
            composerKN.eF(-1554835336);
            boolean zE22 = composerKN.E2(c1952c) | composerKN.E2(applicationContext);
            Object objIF2 = composerKN.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: d3z.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QJ.o(c1952c, applicationContext, (Wre) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            XQ(null, jVarIk, function1, (Function1) objIF2, composerKN, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: d3z.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.Z(monopoly, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(List list, Function1 function1, int i2, Composer composer, int i3) {
        ViF(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(C1952c c1952c, Context context, Wre purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNull(context);
        c1952c.J2(context, purchase);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void qie(final List list, final Function1 function1, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composer3;
        int i5 = 48;
        Composer composerKN = composer.KN(1184503574);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1184503574, i3, -1, "com.bendingspoons.monopoly.secretmenu.OneTimeProductsList (ProductsScreen.kt:117)");
            }
            composerKN.eF(-2110411018);
            if (list == null) {
                ProgressIndicatorKt.nr(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2)), 0L, 0.0f, 0L, 0, composerKN, 6, 30);
                composerKN.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: d3z.o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return QJ.az(list, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerKN.Xw();
            float f3 = 6;
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(f3));
            int i7 = 0;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            if (list.isEmpty()) {
                composerKN.eF(-2132986517);
                composer2 = composerKN;
                TextKt.t("No active products.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 131070);
                composer2.Xw();
            } else {
                composerKN.eF(-2132908273);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final Wre wre = (Wre) it.next();
                    Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composerKN, i5);
                    int iN2 = ComposablesKt.n(composerKN, i7);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.s7N(function0N2);
                    } else {
                        composerKN.r();
                    }
                    Composer composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyRl, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    Function2 function2Rl2 = companion3.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    float f4 = f3;
                    int i8 = i7;
                    Composer composer4 = composerKN;
                    int i9 = i3;
                    TextKt.t(wre.n(), RowScope.rl(RowScopeInstance.f17780n, companion2, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131068);
                    composer4.eF(-2063600450);
                    if (wre.t() != n.f63444O) {
                        Modifier modifierN = SizeKt.n(companion2, Dp.KN(1), Dp.KN(f4));
                        boolean z2 = wre.t() == n.f63445n ? 1 : i8;
                        composer4.eF(-2063593702);
                        int i10 = (composer4.p5(wre) ? 1 : 0) | ((i9 & 112) != 32 ? i8 : 1);
                        Object objIF = composer4.iF();
                        if (i10 != 0 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: d3z.qz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QJ.ty(function1, wre);
                                }
                            };
                            composer4.o(objIF);
                        }
                        composer4.Xw();
                        composer3 = composer4;
                        ButtonKt.nr((Function0) objIF, modifierN, z2, null, null, null, null, null, null, w6.f63453n.rl(), composer3, 805306416, 504);
                    } else {
                        composer3 = composer4;
                    }
                    composer3.Xw();
                    composer3.XQ();
                    composerKN = composer3;
                    i3 = i9;
                    f3 = f4;
                    i7 = i8;
                    i5 = 48;
                }
                composer2 = composerKN;
                composer2.Xw();
            }
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composer2.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2() { // from class: d3z.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.HI(list, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(C1952c c1952c, Context context, Q subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNull(context);
        c1952c.O(context, subscription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(List list, Function1 function1, int i2, Composer composer, int i3) {
        ViF(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final j Ik(State state) {
        return (j) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(Function1 function1, Q q2) {
        function1.invoke(q2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(Function1 function1, Wre wre) {
        function1.invoke(wre);
        return Unit.INSTANCE;
    }
}
