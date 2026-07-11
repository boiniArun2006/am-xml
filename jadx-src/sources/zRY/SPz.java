package zRY;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class SPz {

    public static final class Ml extends Lambda implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f76498n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f76499t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(List list, Function1 function1) {
            super(4);
            this.f76498n = list;
            this.f76499t = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            tN.fuX fux = (tN.fuX) this.f76498n.get(i2);
            composer.eF(1259740655);
            tN.CN3 cn3Nr = fux.nr();
            boolean zT2 = fux.t();
            composer.eF(871925578);
            boolean zP5 = composer.p5(this.f76499t) | composer.p5(fux);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.f76499t, fux);
                composer.o(objIF);
            }
            composer.Xw();
            SPz.O(cn3Nr, zT2, (Function0) objIF, composer, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76500n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tN.fuX f76501t;

        j(Function1 function1, tN.fuX fux) {
            this.f76500n = function1;
            this.f76501t = fux;
        }

        public final void n() {
            this.f76500n.invoke(this.f76501t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f76502n = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76503n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76504t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function1 function1, List list) {
            super(1);
            this.f76503n = function1;
            this.f76504t = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            return this.f76503n.invoke(this.f76504t.get(i2));
        }
    }

    public /* synthetic */ class I28 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tN.CN3.values().length];
            try {
                iArr[tN.CN3.f73454n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tN.CN3.f73455t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void KN(final List typeFilters, final Function1 onTypeFilterSelected, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
        Intrinsics.checkNotNullParameter(onTypeFilterSelected, "onTypeFilterSelected");
        Composer composerKN = composer.KN(-887739145);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(typeFilters) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onTypeFilterSelected) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-887739145, i3, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentTypeRow (PremadeContentTypeRow.kt:39)");
            }
            Modifier modifierXMQ = SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(28));
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(16), 0.0f, 2, null);
            composerKN.eF(267017152);
            boolean zE2 = ((i3 & 112) == 32) | composerKN.E2(typeFilters);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: zRY.s4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SPz.xMQ(typeFilters, onTypeFilterSelected, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            LazyDslKt.O(modifierXMQ, null, paddingValuesT, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composerKN, 24966, 490);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.UGc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SPz.mUb(typeFilters, onTypeFilterSelected, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void O(final tN.CN3 typeFilter, final boolean z2, final Function0 onTypeFilterSelected, Composer composer, final int i2) {
        int i3;
        long jETf;
        int i5;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(typeFilter, "typeFilter");
        Intrinsics.checkNotNullParameter(onTypeFilterSelected, "onTypeFilterSelected");
        Composer composerKN = composer.KN(2060325924);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(typeFilter) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onTypeFilterSelected) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2060325924, i3, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentTypeItem (PremadeContentTypeRow.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 6;
            Modifier modifierN = ClipKt.n(SizeKt.nr(companion, 0.0f, 1, null), RoundedCornerShapeKt.t(Dp.KN(f3)));
            int[] iArr = I28.$EnumSwitchMapping$0;
            int i9 = iArr[typeFilter.ordinal()];
            if (i9 == 1) {
                jETf = aD.w6.eTf();
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jETf = aD.w6.ijL();
            }
            Modifier modifierT = BackgroundKt.t(modifierN, jETf, RoundedCornerShapeKt.t(Dp.KN(f3)));
            composerKN.eF(-567840706);
            boolean z3 = (i3 & 896) == 256;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: zRY.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SPz.J2(onTypeFilterSelected);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierN2 = AlphaKt.n(PaddingKt.gh(ClickableKt.J2(modifierT, false, null, null, (Function0) objIF, 7, null), Dp.KN(9), 0.0f, 2, null), z2 ? 1.0f : 0.5f);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(f3)), Alignment.INSTANCE.xMQ(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN2);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            int i10 = iArr[typeFilter.ordinal()];
            if (i10 != 1) {
                i5 = 2;
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = 2131231892;
            } else {
                i5 = 2;
                i7 = 2131231893;
            }
            int i11 = i5;
            ImageKt.n(PainterResources_androidKt.t(i7, composerKN, 0), null, SizeKt.Z(companion, Dp.KN(12)), null, ContentScale.INSTANCE.nr(), 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, aD.w6.F(), 0, 2, null), composerKN, 1597872, 40);
            int i12 = iArr[typeFilter.ordinal()];
            if (i12 == 1) {
                i8 = 2132019041;
            } else {
                if (i12 != i11) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = 2132019040;
            }
            String upperCase = StringResources_androidKt.t(i8, composerKN, 0).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.t(upperCase, null, aD.w6.F(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).P5(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            composerKN = composerKN;
            composerKN.eF(-1581905072);
            if (z2) {
                ImageKt.n(PainterResources_androidKt.t(2131231608, composerKN, 6), null, null, null, null, 0.0f, null, composerKN, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SPz.Uo(typeFilter, z2, onTypeFilterSelected, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(tN.CN3 cn3, boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        O(cn3, z2, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(List list, Function1 function1, int i2, Composer composer, int i3) {
        KN(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.qie(list.size(), null, new w6(n.f76502n, list), ComposableLambdaKt.rl(-632812321, true, new Ml(list, function1)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
