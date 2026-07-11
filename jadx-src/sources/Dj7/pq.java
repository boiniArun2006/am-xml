package Dj7;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class pq {

    static final class j implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CN3 f1862O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1863n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f1864t;

        j(Function0 function0, String str, CN3 cn3, boolean z2) {
            this.f1863n = function0;
            this.f1864t = str;
            this.f1862O = cn3;
            this.J2 = z2;
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
                ComposerKt.p5(-1050221846, i2, -1, "com.alightcreative.common.compose.components.TabButtonItem.<anonymous>.<anonymous> (TabButtonsRow.kt:110)");
            }
            float f3 = 16;
            eO.J2(this.f1863n, this.f1864t, SizeKt.nr(Modifier.INSTANCE, 0.0f, 1, null), null, this.f1862O, H9N.j.f3810n.rl(composer, 6).N(), 0, 0, 0.0f, null, null, PaddingKt.O(Dp.KN(f3), 0.0f, Dp.KN(f3), Dp.KN(2), 2, null), this.J2, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 48, 1992);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final List options, final Object obj, final Function1 onOptionSelected, Modifier modifier, boolean z2, float f3, float f4, float f5, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        float f6;
        int i9;
        float f7;
        int i10;
        final float f8;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Iterator it;
        Composer composer2;
        final float f9;
        final Modifier modifier3;
        final float f10;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
        Composer composerKN = composer.KN(-402460390);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(options) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((2 & i3) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(obj) : composerKN.E2(obj) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onOptionSelected) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
                z3 = z2;
            } else if ((i2 & 24576) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 16384 : 8192;
            } else {
                z3 = z2;
            }
            i8 = i3 & 32;
            if (i8 == 0) {
                i5 |= 196608;
                f6 = f3;
            } else {
                f6 = f3;
                if ((i2 & 196608) == 0) {
                    i5 |= composerKN.rl(f6) ? 131072 : 65536;
                }
            }
            i9 = i3 & 64;
            if (i9 == 0) {
                i5 |= 1572864;
                f7 = f4;
            } else {
                f7 = f4;
                if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.rl(f7) ? 1048576 : 524288;
                }
            }
            i10 = 128 & i3;
            if (i10 == 0) {
                i5 |= 12582912;
                f8 = f5;
            } else {
                f8 = f5;
                if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.rl(f8) ? 8388608 : 4194304;
                }
            }
            if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                if (i7 != 0) {
                    z3 = true;
                }
                float fKN = i8 == 0 ? Dp.KN(16) : f6;
                float fKN2 = i9 == 0 ? Dp.KN(16) : f7;
                float fKN3 = i10 == 0 ? Dp.KN(12) : f8;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-402460390, i5, -1, "com.alightcreative.common.compose.components.TabButtonsRow (TabButtonsRow.kt:57)");
                }
                Modifier modifierRl = ScrollKt.rl(modifier4, ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
                float f11 = fKN2;
                Updater.O(composerN, measurePolicyRl, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, fKN), composerKN, 0);
                composerKN.eF(1493137282);
                it = options.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final FKk fKk = (FKk) next;
                    String strRl = fKk.rl();
                    boolean zAreEqual = Intrinsics.areEqual(obj, fKk.n());
                    boolean zT2 = fKk.t();
                    Iterator it2 = it;
                    composerKN.eF(-1854701022);
                    boolean zE2 = ((i5 & 896) == 256) | composerKN.E2(fKk);
                    Object objIF = composerKN.iF();
                    if (zE2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: Dj7.Fl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return pq.Uo(onOptionSelected, fKk);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Composer composer3 = composerKN;
                    int i14 = i5;
                    boolean z5 = z3;
                    nr(strRl, z5, zAreEqual, zT2, (Function0) objIF, composer3, (i5 >> 9) & 112);
                    SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, i12 == options.size() + (-1) ? f11 : fKN3), composer3, 0);
                    i5 = i14;
                    composerKN = composer3;
                    z3 = z5;
                    i12 = i13;
                    it = it2;
                }
                boolean z6 = z3;
                composer2 = composerKN;
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                f9 = f11;
                f8 = fKN3;
                modifier3 = modifier4;
                f10 = fKN;
                z4 = z6;
            } else {
                composerKN.wTp();
                z4 = z3;
                f10 = f6;
                composer2 = composerKN;
                f9 = f7;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.R6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return pq.KN(options, obj, onOptionSelected, modifier3, z4, f10, f9, f8, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = 128 & i3;
        if (i10 == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
            if (i11 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierRl2 = ScrollKt.rl(modifier4, ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            float f112 = fKN2;
            Updater.O(composerN, measurePolicyRl2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
            function2Rl = companion2.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion2.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, fKN), composerKN, 0);
                composerKN.eF(1493137282);
                it = options.iterator();
                int i122 = 0;
                while (it.hasNext()) {
                }
                boolean z62 = z3;
                composer2 = composerKN;
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                }
                f9 = f112;
                f8 = fKN3;
                modifier3 = modifier4;
                f10 = fKN;
                z4 = z62;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(List list, Object obj, Function1 function1, Modifier modifier, boolean z2, float f3, float f4, float f5, int i2, int i3, Composer composer, int i5) {
        J2(list, obj, function1, modifier, z2, f3, f4, f5, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(String str, boolean z2, boolean z3, boolean z4, Function0 function0, int i2, Composer composer, int i3) {
        nr(str, z2, z3, z4, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void nr(final String str, final boolean z2, final boolean z3, final boolean z4, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(396370803);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function0) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(396370803, i3, -1, "com.alightcreative.common.compose.components.TabButtonItem (TabButtonsRow.kt:86)");
            }
            long jVwL = (z3 && z2) ? aD.w6.VwL() : aD.w6.QZ6();
            CN3 cn3 = z3 ? CN3.f1598o : CN3.f1595Z;
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
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
            float f3 = 0;
            CardKt.n(AbstractC1328c.n(SizeKt.xMQ(companion, Dp.KN(40)), jVwL, Dp.KN(f3), Dp.KN(12), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), fuX.t(cn3, composerKN, 0), 0L, 0L, null, Dp.KN(f3), ComposableLambdaKt.nr(-1050221846, true, new j(function0, str, cn3, z2), composerKN, 54), composerKN, 1769472, 28);
            composerKN.eF(2103174762);
            if (z4) {
                composer2 = composerKN;
                CardKt.n(OffsetKt.t(boxScopeInstance.n(companion, companion2.az()), 0.0f, Dp.KN(-4), 1, null), RoundedCornerShapeKt.t(Dp.KN((float) 2.67d)), 0L, 0L, null, 0.0f, r.f1876n.n(), composer2, 1572864, 60);
            } else {
                composer2 = composerKN;
            }
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.RzR
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pq.O(str, z2, z3, z4, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function1 function1, FKk fKk) {
        function1.invoke(fKk.n());
        return Unit.INSTANCE;
    }
}
