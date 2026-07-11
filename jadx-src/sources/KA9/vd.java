package KA9;

import Dj7.AbstractC1328c;
import Dj7.CM;
import KA9.vd;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f5009n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f5010O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f5011n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f5012t;

        j(List list, boolean z2, Function0 function0) {
            this.f5011n = list;
            this.f5012t = z2;
            this.f5010O = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1118703348, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectMenuChoices.<anonymous> (ProjectMenuChoices.kt:120)");
            }
            List list = this.f5011n;
            boolean z2 = this.f5012t;
            final Function0 function0 = this.f5010O;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer2.eF(-730286343);
            int i3 = 0;
            for (Object obj : list) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Lu lu = (Lu) obj;
                composer2.eF(-730284910);
                if (i3 != 0 && z2) {
                    BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(1)), aD.w6.qm(), null, 2, null), composer2, 6);
                }
                composer2.Xw();
                String strT = StringResources_androidKt.t(lu.t(), composer2, 0);
                int iN2 = lu.n();
                composer2.eF(600900532);
                boolean zP5 = composer2.p5(lu) | composer2.p5(function0);
                Object objIF = composer2.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: KA9.rv6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return vd.j.t(lu, function0);
                        }
                    };
                    composer2.o(objIF);
                }
                composer2.Xw();
                vd.J2(strT, iN2, z2, (Function0) objIF, composer2, 0);
                composer2 = composer;
                i3 = i5;
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Lu lu, Function0 function0) {
            lu.rl().invoke();
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final String str, final int i2, final boolean z2, final Function0 function0, Composer composer, final int i3) {
        String str2;
        int i5;
        Composer composerKN = composer.KN(1616980539);
        if ((i3 & 6) == 0) {
            str2 = str;
            i5 = (composerKN.p5(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1616980539, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectMenuChoice (ProjectMenuChoices.kt:151)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            composerKN.eF(-1663615332);
            boolean z3 = (i5 & 7168) == 2048;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: KA9.iwV
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return vd.Uo(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierMUb = PaddingKt.mUb(ClickableKt.J2(modifierKN, false, null, null, (Function0) objIF, 7, null), Dp.KN(16), Dp.KN(12));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierN = boxScopeInstance.n(PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(24), 0.0f, 11, null), companion2.KN());
            long jFcU = z2 ? aD.w6.fcU() : Color.INSTANCE.Uo();
            composerKN.eF(-1479351894);
            List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{10, 12, 14, 16});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).N(), 0L, TextUnitKt.KN(((Number) it.next()).intValue()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            composerKN.Xw();
            CM.ty(str2, arrayList, modifierN, jFcU, null, null, 0, false, 1, composerKN, (i5 & 14) | 100663296, 240);
            composerKN = composerKN;
            IconKt.n(PainterResources_androidKt.t(i2, composerKN, (i5 >> 3) & 14), null, boxScopeInstance.n(Modifier.INSTANCE, Alignment.INSTANCE.J2()), z2 ? aD.w6.fcU() : Color.INSTANCE.Uo(), composerKN, 48, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vd.KN(str, i2, z2, function0, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(String str, int i2, boolean z2, Function0 function0, int i3, Composer composer, int i5) {
        J2(str, i2, z2, function0, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier gh(Modifier runIf) {
        Intrinsics.checkNotNullParameter(runIf, "$this$runIf");
        return AbstractC1328c.n(runIf, aD.w6.QZ6(), Dp.KN(0), f5009n, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Modifier modifier, boolean z2, Function0 function0, List list, int i2, int i3, Composer composer, int i5) {
        xMQ(modifier, z2, function0, list, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(Modifier modifier, final boolean z2, Function0 function0, final List projectMenuItems, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Function0 function02;
        final Modifier modifier3;
        final Function0 function03;
        Object objIF;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(projectMenuItems, "projectMenuItems");
        Composer composerKN = composer.KN(-263441303);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(projectMenuItems) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (i8 == 0) {
                    composerKN.eF(-38479482);
                    Object objIF2 = composerKN.iF();
                    if (objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: KA9.qf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.mUb();
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    function03 = (Function0) objIF2;
                    composerKN.Xw();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-263441303, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectMenuChoices (ProjectMenuChoices.kt:105)");
                }
                Modifier modifierUo = SizeKt.Uo(modifier3, 0.7f);
                boolean z3 = !z2;
                composerKN.eF(-38474432);
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: KA9.Ln
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return vd.gh((Modifier) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                CardKt.n(N.o.n(modifierUo, z3, (Function1) objIF), RoundedCornerShapeKt.t(f5009n), !z2 ? aD.w6.ofS() : Color.INSTANCE.KN(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1118703348, true, new j(projectMenuItems, z2, function03), composerKN, 54), composerKN, 1769472, 24);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                function03 = function02;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: KA9.lej
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vd.qie(modifier3, z2, function03, projectMenuItems, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        function02 = function0;
        if ((i3 & 8) == 0) {
        }
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierUo2 = SizeKt.Uo(modifier3, 0.7f);
            boolean z32 = !z2;
            composerKN.eF(-38474432);
            objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
            }
            composerKN.Xw();
            CardKt.n(N.o.n(modifierUo2, z32, (Function1) objIF), RoundedCornerShapeKt.t(f5009n), !z2 ? aD.w6.ofS() : Color.INSTANCE.KN(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1118703348, true, new j(projectMenuItems, z2, function03), composerKN, 54), composerKN, 1769472, 24);
            if (ComposerKt.v()) {
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
