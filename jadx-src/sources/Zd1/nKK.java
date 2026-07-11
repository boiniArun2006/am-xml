package Zd1;

import Dj7.CM;
import Dj7.QaP;
import R5.Ml;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import com.vungle.ads.internal.protos.Sdk;
import eo.AbstractC1969w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class nKK {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f12527O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.C0296Ml f12528n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LazyListState f12529t;

        j(Ml.j.C0296Ml c0296Ml, LazyListState lazyListState, Function1 function1) {
            this.f12528n = c0296Ml;
            this.f12529t = lazyListState;
            this.f12527O = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            ArrayList arrayList;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            int i3 = (i2 & 6) == 0 ? i2 | (composer2.p5(BoxWithConstraints) ? 4 : 2) : i2;
            if ((i3 & 19) == 18 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2137992372, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreenMainContent.<anonymous>.<anonymous> (PlayfulEndScreenMainContent.kt:88)");
            }
            float fT = BoxWithConstraints.t();
            int iUo = this.f12528n.Uo();
            List listAz = this.f12528n.az();
            boolean zTy = this.f12528n.ty();
            Map mapMUb = this.f12528n.mUb();
            LazyListState lazyListState = this.f12529t;
            composer2.eF(774697782);
            if (this.f12528n.xMQ()) {
                List listAz2 = this.f12528n.az();
                Ml.j.C0296Ml c0296Ml = this.f12528n;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAz2, 10));
                Iterator it = listAz2.iterator();
                while (it.hasNext()) {
                    List list = (List) c0296Ml.qie().get((mg4.w6) it.next());
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(D.fuX.Uo(list != null ? (R5.Wre) CollectionsKt.getOrNull(list, c0296Ml.J2()) : null, false, false, false, composer2, 0, 14));
                    composer2 = composer;
                    arrayList2 = arrayList3;
                }
                arrayList = arrayList2;
            } else {
                int size = this.f12528n.az().size();
                ArrayList arrayList4 = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList4.add(null);
                }
                arrayList = arrayList4;
            }
            composer.Xw();
            r.rl(fT, iUo, listAz, zTy, mapMUb, lazyListState, arrayList, this.f12527O, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0572  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Ml.j.C0296Ml viewState, final R5.Wre subscriptionItem, Function1 onTierSelected, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onOtherOptionsClicked, Composer composer, final int i2) {
        int i3;
        int i5;
        Function1 function1;
        float f3;
        Object obj;
        ?? r42;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int i7;
        float fRl;
        int i8;
        int i9;
        Composer composer2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(subscriptionItem, "subscriptionItem");
        Intrinsics.checkNotNullParameter(onTierSelected, "onTierSelected");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onOtherOptionsClicked, "onOtherOptionsClicked");
        Composer composerKN = composer.KN(-207082041);
        int i10 = (i2 & 6) == 0 ? (composerKN.E2(viewState) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i10 |= composerKN.p5(subscriptionItem) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= composerKN.E2(onTierSelected) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i10 |= composerKN.E2(onContinueButtonClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i10 |= composerKN.E2(onManageSubscriptionClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i10 |= composerKN.E2(onOtherOptionsClicked) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            function1 = onTierSelected;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-207082041, i10, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreenMainContent (PlayfulEndScreenMainContent.kt:46)");
            }
            Integer numUo = subscriptionItem.Uo();
            int iIntValue = numUo != null ? numUo.intValue() : 0;
            LazyListState lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String strNr = StringResources_androidKt.nr(2132019881, new Object[]{Integer.valueOf(iIntValue)}, composerKN, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleNr = jVar.rl(composerKN, 6).nr();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            float f4 = 16;
            int i11 = iIntValue;
            CM.xMQ(strNr, PaddingKt.gh(companion, Dp.KN(f4), 0.0f, 2, null), 0L, TextAlign.KN(companion4.n()), textStyleNr, CollectionsKt.listOf(new QaP("green", new P0j.Dsr(false, false, false, false, false, Color.xMQ(aD.w6.Y()), 0L, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null))), composerKN, 48, 4);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composerKN, 6);
            int i12 = n.$EnumSwitchMapping$0[viewState.gh().ordinal()];
            if (i12 == 1) {
                i3 = 1;
            } else if (i12 != 2) {
                if (i12 == 3) {
                    i5 = i10;
                    function1 = onTierSelected;
                    i3 = 1;
                    composerKN.eF(-1406892359);
                    BoxWithConstraintsKt.n(null, companion2.O(), false, ComposableLambdaKt.nr(2137992372, true, new j(viewState, lazyListStateRl, function1), composerKN, 54), composerKN, 3120, 5);
                    composerKN.Xw();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i12 != 4) {
                        composerKN.eF(1617165504);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(-1405718606);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.O(), false);
                    int iN3 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion);
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
                    Composer composerN3 = Updater.n(composerKN);
                    Updater.O(composerN3, measurePolicyUo, companion3.t());
                    Updater.O(composerN3, compositionLocalMapIk2, companion3.O());
                    Function2 function2Rl3 = companion3.rl();
                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO2, companion3.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    int iUo = viewState.Uo();
                    List listAz = viewState.az();
                    boolean zTy = viewState.ty();
                    Map mapMUb = viewState.mUb();
                    composerKN.eF(774733878);
                    if (viewState.xMQ()) {
                        List listAz2 = viewState.az();
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAz2, 10));
                        Iterator it = listAz2.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            List list = (List) viewState.qie().get((mg4.w6) it.next());
                            arrayList.add(D.fuX.Uo(list != null ? (R5.Wre) CollectionsKt.getOrNull(list, viewState.J2()) : null, false, false, false, composerKN, 0, 14));
                            it = it2;
                        }
                        composer2 = composerKN;
                    } else {
                        composer2 = composerKN;
                        int size = viewState.az().size();
                        arrayList = new ArrayList(size);
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList.add(null);
                        }
                    }
                    composer2.Xw();
                    int i14 = 6 | ((i10 << 15) & 29360128);
                    i5 = i10;
                    Composer composer3 = composer2;
                    ArrayList arrayList2 = arrayList;
                    i3 = 1;
                    l3D.rl(boxScopeInstance, iUo, listAz, zTy, mapMUb, lazyListStateRl, arrayList2, onTierSelected, composer3, i14);
                    composerKN = composer3;
                    function1 = onTierSelected;
                    composerKN.XQ();
                    composerKN.Xw();
                    Unit unit2 = Unit.INSTANCE;
                }
                r42 = 0;
                f3 = 0.0f;
                obj = null;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierGh = PaddingKt.gh(SizeKt.KN(companion5, f3, i3, obj), Dp.KN(f4), f3, 2, obj);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, r42);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierGh);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion6.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N3);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion6.t());
                Updater.O(composerN, compositionLocalMapIk3, companion6.O());
                function2Rl = companion6.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO3, companion6.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                boolean z2 = (viewState.n() ? 1 : 0) ^ i3;
                composerKN.eF(774766077);
                if (viewState.xMQ()) {
                    i7 = 6;
                    fRl = Dj7.fuX.rl(Dj7.CN3.f1599r, r42, composerKN, 6, i3);
                } else {
                    fRl = Dp.KN(84);
                    i7 = 6;
                }
                float f5 = fRl;
                composerKN.Xw();
                int i15 = i5 >> 3;
                Composer composer4 = composerKN;
                o.o.t(false, z2, onContinueButtonClicked, f5, composer4, (i15 & 896) | i7, 0);
                composerKN = composer4;
                if (!viewState.n()) {
                    composerKN.eF(-1751831908);
                    SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composerKN, i7);
                    o.Ml.t(onManageSubscriptionClicked, composerKN, (i5 >> 12) & 14);
                    composerKN.Xw();
                    i8 = i15;
                    i9 = 2;
                } else if (viewState.xMQ()) {
                    i8 = i15;
                    i9 = 2;
                    composerKN.eF(-1751524791);
                    composerKN.Xw();
                } else {
                    composerKN.eF(-1751653565);
                    SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composerKN, 6);
                    i8 = i15;
                    i9 = 2;
                    String strUo = D.fuX.Uo(subscriptionItem, false, false, false, composerKN, i15 & 14, 14);
                    composerKN = composerKN;
                    AbstractC1969w6.t(strUo, null, 0, 0, composerKN, 0, 14);
                    composerKN.Xw();
                }
                SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composerKN, 6);
                composerKN.eF(774785737);
                if (viewState.gh() == PlayfulUnlockStyle.CALM) {
                    List listKN = viewState.KN();
                    if (listKN == null) {
                        listKN = CollectionsKt.emptyList();
                    }
                    if (listKN.size() >= i9) {
                        eo.C.O(columnScopeInstance2, StringResources_androidKt.t(2132019807, composerKN, 6), 0L, null, onOtherOptionsClicked, composerKN, 6 | (57344 & i8), 6);
                        SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composerKN, 6);
                    }
                }
                composerKN.Xw();
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                i3 = 1;
            }
            i5 = i10;
            function1 = onTierSelected;
            composerKN.eF(-1407435603);
            String strNr2 = StringResources_androidKt.nr(2132019878, new Object[]{Integer.valueOf(i11)}, composerKN, 6);
            TextStyle textStyleXMQ = jVar.rl(composerKN, 6).xMQ();
            int iN4 = companion4.n();
            f3 = 0.0f;
            obj = null;
            TextKt.t(strNr2, PaddingKt.gh(companion, Dp.KN(f4), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(iN4), 0L, 0, false, 0, 0, null, textStyleXMQ, composerKN, 48, 0, 65020);
            Modifier modifierRl = ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null);
            r42 = 0;
            SpacerKt.n(modifierRl, composerKN, 0);
            composerKN.Xw();
            Unit unit3 = Unit.INSTANCE;
            Modifier.Companion companion52 = Modifier.INSTANCE;
            Modifier modifierGh2 = PaddingKt.gh(SizeKt.KN(companion52, f3, i3, obj), Dp.KN(f4), f3, 2, obj);
            MeasurePolicy measurePolicyN22 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            iN = ComposablesKt.n(composerKN, r42);
            CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
            Modifier modifierO32 = ComposedModifierKt.O(composerKN, modifierGh2);
            ComposeUiNode.Companion companion62 = ComposeUiNode.INSTANCE;
            Function0 function0N32 = companion62.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN22, companion62.t());
            Updater.O(composerN, compositionLocalMapIk32, companion62.O());
            function2Rl = companion62.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO32, companion62.nr());
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.f17468n;
                boolean z22 = (viewState.n() ? 1 : 0) ^ i3;
                composerKN.eF(774766077);
                if (viewState.xMQ()) {
                }
                float f53 = fRl;
                composerKN.Xw();
                int i152 = i5 >> 3;
                Composer composer42 = composerKN;
                o.o.t(false, z22, onContinueButtonClicked, f53, composer42, (i152 & 896) | i7, 0);
                composerKN = composer42;
                if (!viewState.n()) {
                }
                SpacerKt.n(SizeKt.xMQ(companion52, Dp.KN(f4)), composerKN, 6);
                composerKN.eF(774785737);
                if (viewState.gh() == PlayfulUnlockStyle.CALM) {
                }
                composerKN.Xw();
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function1 function12 = function1;
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.Ew
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return nKK.t(viewState, subscriptionItem, function12, onContinueButtonClicked, onManageSubscriptionClicked, onOtherOptionsClicked, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayfulUnlockStyle.values().length];
            try {
                iArr[PlayfulUnlockStyle.CALM_OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayfulUnlockStyle.CALM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayfulUnlockStyle.CARDS_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayfulUnlockStyle.CARDS_VERTICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ml.j.C0296Ml c0296Ml, R5.Wre wre, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        rl(c0296Ml, wre, function1, function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
