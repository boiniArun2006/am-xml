package pTd;

import Dj7.AbstractC1328c;
import Dj7.CM;
import Dj7.YzO;
import Dj7.xZD;
import XFr.j;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f71939n;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mg4.w6.values().length];
            try {
                iArr[mg4.w6.f70997n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mg4.w6.f70998t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        mg4.w6 w6Var = mg4.w6.f70997n;
        j.C0428j c0428j = XFr.j.f11812t;
        f71939n = MapsKt.mapOf(TuplesKt.to(w6Var, XFr.j.n(c0428j.t(20.0d))), TuplesKt.to(mg4.w6.f70998t, XFr.j.n(c0428j.n(100.0d))));
    }

    public static final void rl(final float f3, final mg4.w6 subscriptionTier, final boolean z2, final Integer num, final Map storageMap, final boolean z3, final String str, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(subscriptionTier, "subscriptionTier");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Composer composerKN = composer.KN(2101484463);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.rl(f3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(subscriptionTier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(num) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(storageMap) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.n(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(str) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2101484463, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudCard (CloudCard.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierRl = AspectRatioKt.rl(SizeKt.ViF(companion, f3), 0.8493f, false, 2, null);
            if (z2) {
                modifierRl = AbstractC1328c.n(modifierRl, Color.az(aD.w6.Y(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(12), Dp.KN(20), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
            }
            float f4 = 12;
            Modifier modifierN = ClipKt.n(modifierRl, RoundedCornerShapeKt.t(Dp.KN(f4)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
            int i9 = j.$EnumSwitchMapping$0[subscriptionTier.ordinal()];
            if (i9 == 1) {
                i5 = 2131232075;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = z3 ? 2131232076 : 2131232072;
            }
            ImageKt.n(PainterResources_androidKt.t(i5, composerKN, 0), null, SizeKt.J2(companion, 0.0f, 1, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composerKN, 25008, 104);
            YzO.rl(Color.az(Color.INSTANCE.n(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), boxScopeInstance.n(SizeKt.xMQ(companion, Dp.KN(100)), companion2.az()), xZD.f1895n, composerKN, 390, 0);
            Modifier modifierKN = SizeKt.KN(boxScopeInstance.n(SizeKt.xMQ(companion, Dp.KN(108)), companion2.rl()), 0.0f, 1, null);
            Brush.Companion companion4 = Brush.INSTANCE;
            Pair[] pairArrBzg = aD.w6.bzg();
            BoxKt.n(BackgroundKt.rl(modifierKN, Brush.Companion.mUb(companion4, (Pair[]) Arrays.copyOf(pairArrBzg, pairArrBzg.length), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composerKN, 0);
            float f5 = 16;
            ImageKt.n(PainterResources_androidKt.t(z2 ? 2131231870 : 2131231875, composerKN, 0), null, SizeKt.Z(PaddingKt.xMQ(boxScopeInstance.n(companion, companion2.ty()), Dp.KN(f5)), Dp.KN(24)), null, null, 0.0f, null, composerKN, 48, b.f61769v);
            composerKN = composerKN;
            Modifier modifierN2 = boxScopeInstance.n(PaddingKt.xMQ(companion, Dp.KN(20)), companion2.nr());
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composerKN.eF(1480335851);
            if (num != null) {
                Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(Dp.KN(4))), aD.w6.I(), null, 2, null), Dp.KN(6), Dp.KN(2));
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierMUb);
                Function0 function0N3 = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N3);
                } else {
                    composerKN.r();
                }
                Composer composerN3 = Updater.n(composerKN);
                Updater.O(composerN3, measurePolicyUo2, companion3.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                Function2 function2Rl3 = companion3.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion3.nr());
                i8 = 0;
                i7 = 2;
                CM.S(StringResources_androidKt.nr(2132017441, new Object[]{num}, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).aYN(), null, aD.w6.M7(), null, null, null, 0, false, 0, null, composerKN, 3072, 0, 2036);
                composerKN = composerKN;
                composerKN.XQ();
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f5)), composerKN, 6);
            } else {
                i7 = 2;
                i8 = 0;
            }
            composerKN.Xw();
            int i10 = i8;
            n.rl(z3, subscriptionTier, storageMap, str, composerKN, ((i3 >> 9) & 7168) | ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 6) & 896));
            composerKN.XQ();
            composerKN.eF(1179382212);
            if (z2) {
                BoxKt.n(BorderKt.O(SizeKt.J2(companion, 0.0f, 1, null), BorderStrokeKt.n(Dp.KN(i7), aD.w6.Y()), RoundedCornerShapeKt.t(Dp.KN(f4))), composerKN, i10);
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.t(f3, subscriptionTier, z2, num, storageMap, z3, str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f3, mg4.w6 w6Var, boolean z2, Integer num, Map map, boolean z3, String str, int i2, Composer composer, int i3) {
        rl(f3, w6Var, z2, num, map, z3, str, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
