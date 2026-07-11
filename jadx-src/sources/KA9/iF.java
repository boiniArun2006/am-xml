package KA9;

import Dj7.AbstractC1328c;
import Dj7.CM;
import KA9.iF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.persist.j;
import com.safedk.android.analytics.brandsafety.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class iF {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f4952n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f4953O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f4954n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ u f4955t;

        j(List list, u uVar, Function1 function1) {
            this.f4954n = list;
            this.f4955t = uVar;
            this.f4953O = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void t(Composer composer, int i2) {
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-175994608, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.SortChoices.<anonymous> (SortChoices.kt:76)");
            }
            List<u> list = this.f4954n;
            u uVar = this.f4955t;
            final Function1 function1 = this.f4953O;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = 0;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer2.mUb() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.J2()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.J2() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composer2.eF(-162342160);
            for (final u uVar2 : list) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                boolean z2 = uVar2 == uVar ? 1 : i3;
                composer2.eF(-1669404415);
                boolean zP5 = composer2.p5(function1) | composer2.p5(uVar2);
                Object objIF = composer2.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: KA9.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return iF.j.nr(function1, uVar2);
                        }
                    };
                    composer2.o(objIF);
                }
                composer2.Xw();
                Modifier modifierMUb = PaddingKt.mUb(SelectableKt.nr(companion3, z2, false, null, (Function0) objIF, 6, null), Dp.KN(16), Dp.KN(12));
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer2, 48);
                int iN2 = ComposablesKt.n(composer2, i3);
                CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierMUb);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion4.n();
                if (composer2.mUb() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.J2()) {
                    composer2.s7N(function0N2);
                } else {
                    composer2.r();
                }
                Composer composerN2 = Updater.n(composer2);
                Updater.O(composerN2, measurePolicyRl, companion4.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                Function2 function2Rl2 = companion4.rl();
                if (composerN2.J2() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion4.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                final Function1 function12 = function1;
                u uVar3 = uVar;
                int i5 = i3;
                CM.S(iF.O(uVar2, composer2, i3), H9N.j.f3810n.rl(composer2, 6).N(), null, 0L, null, null, null, 0, false, 0, null, composer2, 0, 0, 2044);
                Composer composer3 = composer2;
                SpacerKt.n(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), composer3, i5);
                Modifier modifierZ = SizeKt.Z(companion3, Dp.KN(24));
                boolean z3 = uVar2 == uVar3 ? 1 : i5;
                composer3.eF(1407659904);
                boolean zP52 = composer3.p5(function12) | composer3.p5(uVar2);
                Object objIF2 = composer3.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: KA9.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return iF.j.O(function12, uVar2);
                        }
                    };
                    composer3.o(objIF2);
                }
                composer3.Xw();
                RadioButtonKt.n(z3, (Function0) objIF2, modifierZ, false, null, null, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 56);
                composer.XQ();
                composer2 = composer;
                i3 = i5;
                function1 = function12;
                uVar = uVar3;
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, u uVar) {
            function1.invoke(uVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Function1 function1, u uVar) {
            function1.invoke(uVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[j.qz.values().length];
            try {
                iArr[j.qz.f45870n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[u.values().length];
            try {
                iArr2[u.f5007n.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[u.f5008t.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final j.qz J2(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        int i2 = n.$EnumSwitchMapping$1[uVar.ordinal()];
        if (i2 == 1) {
            return j.qz.f45870n;
        }
        if (i2 == 2) {
            return j.qz.f45869O;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u Uo(j.qz qzVar) {
        Intrinsics.checkNotNullParameter(qzVar, "<this>");
        return n.$EnumSwitchMapping$0[qzVar.ordinal()] == 1 ? u.f5007n : u.f5008t;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final BoxScope SortChoices, final u selectedOption, final Function1 onSortSelected, float f3, Composer composer, final int i2, final int i3) {
        int i5;
        float f4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(SortChoices, "$this$SortChoices");
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(onSortSelected, "onSortSelected");
        Composer composerKN = composer.KN(1952271059);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(SortChoices) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(selectedOption) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSortSelected) ? 256 : 128;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                f4 = f3;
                i5 |= composerKN.rl(f4) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                float fKN = i7 == 0 ? Dp.KN(0) : f4;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1952271059, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.SortChoices (SortChoices.kt:56)");
                }
                List listListOf = CollectionsKt.listOf((Object[]) new u[]{u.f5007n, u.f5008t});
                Modifier modifierN = SortChoices.n(PaddingKt.gh(OffsetKt.t(Modifier.INSTANCE, 0.0f, fKN, 1, null), Dp.KN(16), 0.0f, 2, null), Alignment.INSTANCE.ty());
                long jKN = Color.INSTANCE.KN();
                float f6 = f4952n;
                float f7 = 0;
                Modifier modifierN2 = AbstractC1328c.n(SizeKt.Uo(BackgroundKt.t(modifierN, jKN, RoundedCornerShapeKt.t(f6)), 0.6f), aD.w6.VwL(), Dp.KN(f7), f6, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
                float fKN2 = Dp.KN(f7);
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(f6);
                ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-175994608, true, new j(listListOf, selectedOption, onSortSelected), composerKN, 54);
                float f8 = fKN;
                CardKt.n(modifierN2, roundedCornerShapeT, 0L, 0L, null, fKN2, composableLambdaNr, composerKN, 1769472, 28);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                f5 = f8;
            } else {
                composerKN.wTp();
                f5 = f4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: KA9.Zs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return iF.t(SortChoices, selectedOption, onSortSelected, f5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        f4 = f3;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            List listListOf2 = CollectionsKt.listOf((Object[]) new u[]{u.f5007n, u.f5008t});
            Modifier modifierN3 = SortChoices.n(PaddingKt.gh(OffsetKt.t(Modifier.INSTANCE, 0.0f, fKN, 1, null), Dp.KN(16), 0.0f, 2, null), Alignment.INSTANCE.ty());
            long jKN2 = Color.INSTANCE.KN();
            float f62 = f4952n;
            float f72 = 0;
            Modifier modifierN22 = AbstractC1328c.n(SizeKt.Uo(BackgroundKt.t(modifierN3, jKN2, RoundedCornerShapeKt.t(f62)), 0.6f), aD.w6.VwL(), Dp.KN(f72), f62, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
            float fKN22 = Dp.KN(f72);
            RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(f62);
            ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-175994608, true, new j(listListOf2, selectedOption, onSortSelected), composerKN, 54);
            float f82 = fKN;
            CardKt.n(modifierN22, roundedCornerShapeT2, 0L, 0L, null, fKN22, composableLambdaNr2, composerKN, 1769472, 28);
            if (ComposerKt.v()) {
            }
            f5 = f82;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(BoxScope boxScope, u uVar, Function1 function1, float f3, int i2, int i3, Composer composer, int i5) {
        rl(boxScope, uVar, function1, f3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(u uVar, Composer composer, int i2) {
        String strT;
        composer.eF(-1121437515);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1121437515, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.name (SortChoices.kt:46)");
        }
        int i3 = n.$EnumSwitchMapping$1[uVar.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                composer.eF(-220637257);
                strT = StringResources_androidKt.t(2132017644, composer, 6);
                composer.Xw();
            } else {
                composer.eF(-220640820);
                composer.Xw();
                throw new NoWhenBranchMatchedException();
            }
        } else {
            composer.eF(-220639433);
            strT = StringResources_androidKt.t(2132019708, composer, 6);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strT;
    }
}
