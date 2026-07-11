package zRY;

import Dj7.CM;
import Dj7.FKk;
import Dj7.pq;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import zRY.Ew;

/* JADX INFO: renamed from: zRY.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC2495c {

    /* JADX INFO: renamed from: zRY.c$j */
    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, g9s.class, "onCategorySelected", "onCategorySelected(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((g9s) this.receiver).Ik(p0);
        }
    }

    /* JADX INFO: renamed from: zRY.c$n */
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, g9s.class, "onTypeFilterSelected", "onTypeFilterSelected(Lcom/alightcreative/app/motion/premade/domain/entities/PremadeContentTypeFilter;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((tN.fuX) obj);
            return Unit.INSTANCE;
        }

        public final void n(tN.fuX p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((g9s) this.receiver).r(p0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final g9s viewModel, Function1 onItemClicked, final Function0 onCloseButtonClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        Modifier modifier3;
        Ew ew;
        final Function1 function1;
        Modifier modifier4;
        int i8;
        boolean zE2;
        Object objIF;
        boolean zE22;
        Object objIF2;
        boolean z2;
        Object objIF3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Composer composerKN = composer.KN(220646969);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onItemClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onCloseButtonClicked) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i5;
            if ((i7 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(220646969, i7, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentScreen (PremadeContentScreen.kt:39)");
                }
                float f3 = 12;
                Modifier modifierT = BackgroundKt.t(SizeKt.KN(SizeKt.t(modifier5, 0.98f), 0.0f, 1, null), aD.w6.W(), RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null));
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.Vertical verticalUo = arrangement.Uo();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                composer2 = composerKN;
                modifier3 = modifier5;
                Dj7.Ml.rl(ColumnScopeInstance.f17468n, 0L, composer2, 6, 1);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(44)), composer2, 6);
                ew = (Ew) LiveDataAdapterKt.n(viewModel.t(), composer2, 0).getValue();
                composer2.eF(-96657949);
                if (Intrinsics.areEqual(ew, Ew.n.f76470n) && (ew instanceof Ew.j)) {
                    float f4 = 16;
                    Modifier modifierGh = PaddingKt.gh(companion3, Dp.KN(f4), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion.qie(), composer2, 0);
                    int iN2 = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierGh);
                    Function0 function0N2 = companion2.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N2);
                    } else {
                        composer2.r();
                    }
                    Composer composerN2 = Updater.n(composer2);
                    Updater.O(composerN2, measurePolicyRl, companion2.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                    Function2 function2Rl2 = companion2.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion2.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    modifier4 = modifier3;
                    E.I28.rl(SizeKt.ViF(companion3, Dp.KN(24)), onCloseButtonClicked, null, 2131231603, null, false, 0L, 0L, composer2, ((i7 >> 3) & 112) | 3078, 244);
                    SpacerKt.n(SizeKt.ViF(companion3, Dp.KN(f4)), composer2, 6);
                    Ew.j jVar = (Ew.j) ew;
                    List listNr = jVar.nr();
                    if (listNr == null || !listNr.isEmpty()) {
                        Iterator it = listNr.iterator();
                        while (it.hasNext()) {
                            if (((tN.fuX) it.next()).nr() != tN.CN3.f73455t) {
                                List listNr2 = jVar.nr();
                                if (listNr2 == null || !listNr2.isEmpty()) {
                                    Iterator it2 = listNr2.iterator();
                                    while (it2.hasNext()) {
                                        if (((tN.fuX) it2.next()).nr() != tN.CN3.f73454n) {
                                            i8 = 2132020316;
                                            break;
                                        }
                                    }
                                    i8 = 2132020317;
                                    String strT = StringResources_androidKt.t(i8, composer2, 0);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    CM.S(strT, H9N.j.f3810n.rl(composer2, 6).fD(), rowScopeInstance.t(companion4, Alignment.INSTANCE.xMQ()), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composer2, 3072, 0, 1968);
                                    composer2.XQ();
                                    SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(f4)), composer2, 6);
                                    eQ.fuX fuxCk = viewModel.ck();
                                    composer2.eF(-96602177);
                                    zE2 = composer2.E2(viewModel);
                                    objIF = composer2.iF();
                                    if (!zE2 || objIF == Composer.INSTANCE.n()) {
                                        objIF = new j(viewModel);
                                        composer2.o(objIF);
                                    }
                                    composer2.Xw();
                                    Function1 function12 = (Function1) ((KFunction) objIF);
                                    composer2.eF(-96599807);
                                    zE22 = composer2.E2(viewModel);
                                    objIF2 = composer2.iF();
                                    if (!zE22 || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new n(viewModel);
                                        composer2.o(objIF2);
                                    }
                                    composer2.Xw();
                                    Function1 function13 = (Function1) ((KFunction) objIF2);
                                    composer2.eF(-96597565);
                                    z2 = (i7 & 112) == 32;
                                    objIF3 = composer2.iF();
                                    if (!z2 || objIF3 == Composer.INSTANCE.n()) {
                                        function1 = onItemClicked;
                                        objIF3 = new Function1() { // from class: zRY.z
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AbstractC2495c.Uo(function1, (tN.n) obj);
                                            }
                                        };
                                        composer2.o(objIF3);
                                    } else {
                                        function1 = onItemClicked;
                                    }
                                    composer2.Xw();
                                    nr(jVar, fuxCk, function12, function13, (Function1) objIF3, composer2, 0);
                                    composer2 = composer2;
                                } else {
                                    i8 = 2132020317;
                                    String strT2 = StringResources_androidKt.t(i8, composer2, 0);
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    CM.S(strT2, H9N.j.f3810n.rl(composer2, 6).fD(), rowScopeInstance.t(companion42, Alignment.INSTANCE.xMQ()), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composer2, 3072, 0, 1968);
                                    composer2.XQ();
                                    SpacerKt.n(SizeKt.xMQ(companion42, Dp.KN(f4)), composer2, 6);
                                    eQ.fuX fuxCk2 = viewModel.ck();
                                    composer2.eF(-96602177);
                                    zE2 = composer2.E2(viewModel);
                                    objIF = composer2.iF();
                                    if (!zE2) {
                                        objIF = new j(viewModel);
                                        composer2.o(objIF);
                                        composer2.Xw();
                                        Function1 function122 = (Function1) ((KFunction) objIF);
                                        composer2.eF(-96599807);
                                        zE22 = composer2.E2(viewModel);
                                        objIF2 = composer2.iF();
                                        if (!zE22) {
                                            objIF2 = new n(viewModel);
                                            composer2.o(objIF2);
                                            composer2.Xw();
                                            Function1 function132 = (Function1) ((KFunction) objIF2);
                                            composer2.eF(-96597565);
                                            if ((i7 & 112) == 32) {
                                            }
                                            objIF3 = composer2.iF();
                                            if (z2) {
                                                function1 = onItemClicked;
                                                objIF3 = new Function1() { // from class: zRY.z
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return AbstractC2495c.Uo(function1, (tN.n) obj);
                                                    }
                                                };
                                                composer2.o(objIF3);
                                                composer2.Xw();
                                                nr(jVar, fuxCk2, function122, function132, (Function1) objIF3, composer2, 0);
                                                composer2 = composer2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i8 = 2132019905;
                        String strT22 = StringResources_androidKt.t(i8, composer2, 0);
                        Modifier.Companion companion422 = Modifier.INSTANCE;
                        CM.S(strT22, H9N.j.f3810n.rl(composer2, 6).fD(), rowScopeInstance.t(companion422, Alignment.INSTANCE.xMQ()), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composer2, 3072, 0, 1968);
                        composer2.XQ();
                        SpacerKt.n(SizeKt.xMQ(companion422, Dp.KN(f4)), composer2, 6);
                        eQ.fuX fuxCk22 = viewModel.ck();
                        composer2.eF(-96602177);
                        zE2 = composer2.E2(viewModel);
                        objIF = composer2.iF();
                        if (!zE2) {
                        }
                    } else {
                        i8 = 2132019905;
                        String strT222 = StringResources_androidKt.t(i8, composer2, 0);
                        Modifier.Companion companion4222 = Modifier.INSTANCE;
                        CM.S(strT222, H9N.j.f3810n.rl(composer2, 6).fD(), rowScopeInstance.t(companion4222, Alignment.INSTANCE.xMQ()), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composer2, 3072, 0, 1968);
                        composer2.XQ();
                        SpacerKt.n(SizeKt.xMQ(companion4222, Dp.KN(f4)), composer2, 6);
                        eQ.fuX fuxCk222 = viewModel.ck();
                        composer2.eF(-96602177);
                        zE2 = composer2.E2(viewModel);
                        objIF = composer2.iF();
                        if (!zE2) {
                        }
                    }
                } else {
                    function1 = onItemClicked;
                    modifier4 = modifier3;
                }
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier4;
            } else {
                composerKN.wTp();
                function1 = onItemClicked;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                final Function1 function14 = function1;
                final Modifier modifier6 = modifier2;
                scopeUpdateScopeGh.n(new Function2() { // from class: zRY.QJ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2495c.KN(viewModel, function14, onCloseButtonClicked, modifier6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        i7 = i5;
        if ((i7 & 1171) == 1170) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            float f32 = 12;
            Modifier modifierT2 = BackgroundKt.t(SizeKt.KN(SizeKt.t(modifier5, 0.98f), 0.0f, 1, null), aD.w6.W(), RoundedCornerShapeKt.O(Dp.KN(f32), Dp.KN(f32), 0.0f, 0.0f, 12, null));
            Arrangement arrangement2 = Arrangement.f17400n;
            Arrangement.Vertical verticalUo2 = arrangement2.Uo();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion5.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N3 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                composer2 = composerKN;
                modifier3 = modifier5;
                Dj7.Ml.rl(ColumnScopeInstance.f17468n, 0L, composer2, 6, 1);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion32, Dp.KN(44)), composer2, 6);
                ew = (Ew) LiveDataAdapterKt.n(viewModel.t(), composer2, 0).getValue();
                composer2.eF(-96657949);
                if (Intrinsics.areEqual(ew, Ew.n.f76470n)) {
                    function1 = onItemClicked;
                    modifier4 = modifier3;
                    composer2.Xw();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier2 = modifier4;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(g9s g9sVar, Function1 function1, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        J2(g9sVar, function1, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Ew.j jVar, eQ.fuX fux, Function1 function1, Function1 function12, Function1 function13, int i2, Composer composer, int i3) {
        nr(jVar, fux, function1, function12, function13, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function1 function1, tN.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    public static final void nr(final Ew.j viewState, final eQ.fuX imageLoader, final Function1 onCategorySelected, final Function1 onTypeFilterSelected, final Function1 onItemClicked, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onCategorySelected, "onCategorySelected");
        Intrinsics.checkNotNullParameter(onTypeFilterSelected, "onTypeFilterSelected");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Composer composerKN = composer.KN(1937178662);
        int i3 = (i2 & 6) == 0 ? (composerKN.E2(viewState) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(imageLoader) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onCategorySelected) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onTypeFilterSelected) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onItemClicked) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1937178662, i3, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentList (PremadeContentScreen.kt:106)");
            }
            Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            List<tN.j> listN = viewState.n();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
            for (tN.j jVar : listN) {
                arrayList.add(new FKk(jVar.t(), jVar.n(), false));
            }
            int i5 = i3;
            pq.J2(arrayList, viewState.t(), onCategorySelected, null, true, 0.0f, 0.0f, 0.0f, composerKN, (i3 & 896) | 24576, 232);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f3 = 16;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
            composerKN.eF(292995644);
            if (viewState.nr().size() > 1) {
                SPz.KN(viewState.nr(), onTypeFilterSelected, composerKN, (i5 >> 6) & 112);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
            }
            composerKN.Xw();
            Pl.O(viewState.rl(), imageLoader, onItemClicked, composerKN, (i5 & 112) | ((i5 >> 6) & 896), 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2495c.O(viewState, imageLoader, onCategorySelected, onTypeFilterSelected, onItemClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
