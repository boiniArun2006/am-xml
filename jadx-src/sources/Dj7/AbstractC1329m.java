package Dj7;

import Be4.C1309c;
import Be4.vd;
import NBO.j;
import NBO.n;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import c0.Wre;
import com.safedk.android.analytics.brandsafety.b;
import eQ.fuX;
import eQ.n;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: renamed from: Dj7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1329m {

    /* JADX INFO: renamed from: Dj7.m$j */
    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f1835O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f1836n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f1837o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f1838r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f1839t;

        /* JADX INFO: renamed from: Dj7.m$j$j, reason: collision with other inner class name */
        static final class C0062j implements Function2 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f1840O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f1841n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function1 f1842o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f1843r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f1844t;

            C0062j(boolean z2, Function0 function0, List list, Function1 function1, List list2, Function1 function12) {
                this.f1841n = z2;
                this.f1844t = function0;
                this.f1840O = list;
                this.J2 = function1;
                this.f1843r = list2;
                this.f1842o = function12;
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
                    ComposerKt.p5(258714828, i2, -1, "com.alightcreative.common.compose.components.Popup.<anonymous>.<anonymous> (Popup.kt:76)");
                }
                Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                Modifier modifierMUb = PaddingKt.mUb(Modifier.INSTANCE, Dp.KN(16), Dp.KN(32));
                boolean z2 = this.f1841n;
                Function0 function0 = this.f1844t;
                List list = this.f1840O;
                Function1 function1 = this.J2;
                List list2 = this.f1843r;
                Function1 function12 = this.f1842o;
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierMUb);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
                if (composer.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer.T();
                if (composer.getInserting()) {
                    composer.s7N(function0N);
                } else {
                    composer.r();
                }
                Composer composerN = Updater.n(composer);
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                Function2 function2Rl = companion.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                composer.eF(-1176595699);
                if (z2) {
                    AbstractC1329m.HI(function0, composer, 0);
                }
                composer.Xw();
                AbstractC1329m.r(list, function1, composer, 0);
                AbstractC1329m.gh(list2, function12, composer, 0);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(boolean z2, Function0 function0, List list, Function1 function1, List list2, Function1 function12) {
            this.f1836n = z2;
            this.f1839t = function0;
            this.f1835O = list;
            this.J2 = function1;
            this.f1838r = list2;
            this.f1837o = function12;
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
                ComposerKt.p5(-1656038520, i2, -1, "com.alightcreative.common.compose.components.Popup.<anonymous> (Popup.kt:68)");
            }
            SurfaceKt.n(SizeKt.iF(SizeKt.KN(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(32)), 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.t(Dp.KN(12)), aD.w6.z(), 0L, null, 0.0f, ComposableLambdaKt.nr(258714828, true, new C0062j(this.f1836n, this.f1839t, this.f1835O, this.J2, this.f1838r, this.f1837o), composer, 54), composer, 1573254, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(647923990);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(647923990, i3, -1, "com.alightcreative.common.compose.components.PopupDismissButton (Popup.kt:94)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 24;
            Modifier modifierZ = SizeKt.Z(PaddingKt.az(companion, 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null), Dp.KN(f3));
            composerKN.eF(-827077193);
            boolean z2 = (i3 & 14) == 4;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Dj7.Zs
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC1329m.ck(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierZ, false, null, null, (Function0) objIF, 7, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            ImageKt.n(PainterResources_androidKt.t(2131231558, composerKN, 6), null, PaddingKt.xMQ(SizeKt.J2(companion, 0.0f, 1, null), Dp.KN(5)), null, null, 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, aD.w6.piY(), 0, 2, null), composerKN, 1573296, 56);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.P
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1329m.Ik(function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Function0 function0, int i2, Composer composer, int i3) {
        HI(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Wre.n.Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(Function1 function1, NBO.j jVar) {
        function1.invoke(((j.n) jVar).n());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(final List list, final Function1 function1, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(192443896);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 32;
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(192443896, i3, -1, "com.alightcreative.common.compose.components.PopupButtons (Popup.kt:175)");
            }
            Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(8));
            float f3 = 0.0f;
            int i7 = 1;
            Object obj = null;
            Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composerKN, 54);
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
            composerKN.eF(1123289952);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final NBO.j jVar = (NBO.j) it.next();
                if (jVar instanceof j.C0235j) {
                    composerKN.eF(462356538);
                    j.C0235j c0235j = (j.C0235j) jVar;
                    String strT = c0235j.t();
                    CN3 cn3N = c0235j.n();
                    Modifier modifierKN2 = SizeKt.KN(Modifier.INSTANCE, f3, i7, obj);
                    composerKN.eF(1123295350);
                    int i8 = ((i3 & 112) == i5 ? i7 : 0) | (composerKN.E2(jVar) ? 1 : 0);
                    Object objIF = composerKN.iF();
                    if (i8 != 0 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: Dj7.K
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC1329m.qie(function1, jVar);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Composer composer2 = composerKN;
                    eO.J2((Function0) objIF, strT, modifierKN2, null, cn3N, null, 0, 0, 0.0f, null, null, null, false, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8168);
                    composerKN = composer2;
                    composerKN.Xw();
                    i5 = i5;
                    i3 = i3;
                    it = it;
                    f3 = 0.0f;
                    i7 = 1;
                    obj = null;
                } else {
                    Iterator it2 = it;
                    int i9 = i3;
                    int i10 = i5;
                    if (!(jVar instanceof j.n)) {
                        composerKN.eF(1123291120);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(462774108);
                    composerKN.eF(1123309014);
                    boolean zE2 = composerKN.E2(jVar) | ((i9 & 112) == i10);
                    Object objIF2 = composerKN.iF();
                    if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: Dj7.psW
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC1329m.az(function1, jVar);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    j.n nVar = (j.n) jVar;
                    eO.gh((Function0) objIF2, nVar.t(), nVar.rl(), SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), false, composerKN, 3072, 16);
                    composerKN.Xw();
                    i5 = i10;
                    f3 = 0.0f;
                    obj = null;
                    i7 = 1;
                    i3 = i9;
                    it = it2;
                }
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.Md
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC1329m.ty(list, function1, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(boolean z2, List list, List list2, Function1 function1, Function0 function0, Function1 function12, int i2, Composer composer, int i3) {
        xMQ(z2, list, list2, function1, function0, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(List list, Function1 function1, int i2, Composer composer, int i3) {
        r(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Function1 function1, NBO.j jVar) {
        function1.invoke(((j.C0235j) jVar).rl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final List list, final Function1 function1, Composer composer, final int i2) {
        int i3;
        Function1 function12 = function1;
        Composer composerKN = composer.KN(-425476666);
        int i5 = 6;
        int i7 = 2;
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function12) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-425476666, i3, -1, "com.alightcreative.common.compose.components.PopupElements (Popup.kt:116)");
            }
            Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
            float f3 = 8;
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(f3));
            Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(24), 7, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composerKN, 54);
            boolean z2 = false;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
            composerKN.eF(-1420928578);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NBO.n nVar = (NBO.n) it.next();
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (nVar instanceof n.w6) {
                    composerKN.eF(-1099046151);
                    Composer composer2 = composerKN;
                    TextKt.t(((n.w6) nVar).n(), PaddingKt.gh(Modifier.INSTANCE, Dp.KN(f3), 0.0f, i7, null), aD.w6.piY(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, i5).te(), composer2, 432, 0, 65016);
                    composerKN = composer2;
                    composerKN.Xw();
                    z2 = z2;
                    f3 = f3;
                    it = it;
                    i5 = 6;
                    i7 = 2;
                } else {
                    Iterator it2 = it;
                    boolean z3 = z2;
                    float f4 = f3;
                    if (nVar instanceof n.C0236n) {
                        composerKN.eF(-1098612585);
                        x0X.n nVar2 = (x0X.n) function12.invoke(Integer.valueOf(((n.C0236n) nVar).n()));
                        if (!(nVar2 instanceof n.C1266n)) {
                            if (!(nVar2 instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Uri uri = (Uri) ((n.w6) nVar2).n();
                            fuX.j jVar = new fuX.j((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()));
                            n.j jVar2 = new n.j();
                            int i8 = 1;
                            if (Build.VERSION.SDK_INT >= 28) {
                                jVar2.n(new vd.j(z3, i8, defaultConstructorMarker));
                            } else {
                                jVar2.n(new C1309c.n(z3, 1, null));
                            }
                            eQ.fuX fuxNr = jVar.KN(jVar2.O()).nr();
                            composerKN.eF(-1254222099);
                            Object objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1() { // from class: Dj7.Lu
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC1329m.Z((Wre.n.Ml) obj);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            Composer composer3 = composerKN;
                            ImageKt.n(c0.fuX.nr(uri, fuxNr, null, null, null, null, (Function1) objIF, null, null, 0, null, composerKN, 1572864, 0, 1980), null, SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(168)), null, null, 0.0f, null, composer3, 432, b.f61769v);
                            composerKN = composer3;
                        }
                        composerKN.Xw();
                        i5 = 6;
                        z2 = false;
                        i7 = 2;
                        function12 = function1;
                        f3 = f4;
                        it = it2;
                    } else {
                        if (!(nVar instanceof n.j)) {
                            composerKN.eF(-1420927348);
                            composerKN.Xw();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerKN.eF(-1097486727);
                        Composer composer4 = composerKN;
                        TextKt.t(((n.j) nVar).n(), PaddingKt.gh(Modifier.INSTANCE, Dp.KN(f4), 0.0f, 2, null), aD.w6.piY(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).wTp(), composer4, 432, 0, 65016);
                        composerKN = composer4;
                        composerKN.Xw();
                        function12 = function1;
                        i5 = 6;
                        i7 = 2;
                        f3 = f4;
                        it = it2;
                        z2 = false;
                    }
                }
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1329m.o(list, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(List list, Function1 function1, int i2, Composer composer, int i3) {
        gh(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void xMQ(final boolean z2, final List elements, final List buttons, final Function1 onClicked, final Function0 onDismissed, final Function1 getUriFromResource, Composer composer, final int i2) {
        boolean z3;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        Composer composerKN = composer.KN(372046156);
        if ((i2 & 6) == 0) {
            z3 = z2;
            i3 = (composerKN.n(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(elements) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(buttons) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onDismissed) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(getUriFromResource) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(372046156, i3, -1, "com.alightcreative.common.compose.components.Popup (Popup.kt:61)");
            }
            composer2 = composerKN;
            SurfaceKt.n(SizeKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), null, aD.w6.te(), 0L, null, 0.0f, ComposableLambdaKt.nr(-1656038520, true, new j(z3, onDismissed, elements, getUriFromResource, buttons, onClicked), composerKN, 54), composer2, 1573254, 58);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.vd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1329m.mUb(z2, elements, buttons, onClicked, onDismissed, getUriFromResource, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
