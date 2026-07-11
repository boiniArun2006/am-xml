package pTd;

import Dj7.CM;
import R5.Ml;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {

    static final class j implements Function3 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LazyListState f71936O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f71937n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml.j.C0297j f71938t;

        j(boolean z2, Ml.j.C0297j c0297j, LazyListState lazyListState, Function1 function1) {
            this.f71937n = z2;
            this.f71938t = c0297j;
            this.f71936O = lazyListState;
            this.J2 = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            ArrayList arrayList;
            R5.Wre wre;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            int i3 = (i2 & 6) == 0 ? i2 | (composer.p5(BoxWithConstraints) ? 4 : 2) : i2;
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1593115641, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudBackupMainContentColumn.<anonymous> (CloudBackupMainContentColumn.kt:75)");
            }
            String strN = null;
            if (this.f71937n) {
                composer.eF(-728450429);
                float value = ((Dp) ComparisonsKt.minOf(Dp.nr(Dp.KN(BoxWithConstraints.t() - Dp.KN(80))), Dp.nr(Dp.KN(500)))).getValue();
                mg4.w6 w6Var = mg4.w6.f70998t;
                R5.Wre wreRl = this.f71938t.rl();
                Integer numT = wreRl != null ? wreRl.t() : null;
                Map mapQie = this.f71938t.qie();
                boolean zHI = this.f71938t.HI();
                composer.eF(-23482988);
                if (this.f71938t.gh()) {
                    Ml.j.C0297j c0297j = this.f71938t;
                    strN = Xo.n(c0297j, c0297j.rl(), composer, 0, 0);
                }
                composer.Xw();
                Wre.rl(value, w6Var, true, numT, mapQie, zHI, strN, composer, 432);
                composer.Xw();
            } else {
                composer.eF(-727726982);
                float fT = BoxWithConstraints.t();
                int iKN = this.f71938t.KN();
                List listTy = this.f71938t.ty();
                List listTy2 = this.f71938t.ty();
                Ml.j.C0297j c0297j2 = this.f71938t;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTy2, 10));
                Iterator it = listTy2.iterator();
                while (it.hasNext()) {
                    List list = (List) c0297j2.az().get((mg4.w6) it.next());
                    arrayList2.add((list == null || (wre = (R5.Wre) CollectionsKt.getOrNull(list, c0297j2.Uo())) == null) ? null : wre.t());
                }
                Map mapQie2 = this.f71938t.qie();
                LazyListState lazyListState = this.f71936O;
                boolean zHI2 = this.f71938t.HI();
                composer.eF(-23456164);
                if (this.f71938t.gh()) {
                    List listTy3 = this.f71938t.ty();
                    Ml.j.C0297j c0297j3 = this.f71938t;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTy3, 10));
                    Iterator it2 = listTy3.iterator();
                    while (it2.hasNext()) {
                        List list2 = (List) c0297j3.az().get((mg4.w6) it2.next());
                        arrayList.add(Xo.n(c0297j3, list2 != null ? (R5.Wre) CollectionsKt.getOrNull(list2, c0297j3.Uo()) : null, composer, 0, 0));
                    }
                } else {
                    int size = this.f71938t.ty().size();
                    arrayList = new ArrayList(size);
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(null);
                    }
                }
                composer.Xw();
                Dsr.rl(fT, iKN, listTy, arrayList2, mapQie2, lazyListState, zHI2, arrayList, this.J2, composer, 0);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final ColumnScope columnScope, final Ml.j.C0297j viewState, final boolean z2, final LazyListState lazyListState, final Function1 onSubscriptionClicked, final Function1 onCardSnapped, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onCardSnapped, "onCardSnapped");
        Composer composerKN = composer.KN(2091063837);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(viewState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(lazyListState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onCardSnapped) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2091063837, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudBackupMainContentColumn (CloudBackupMainContentColumn.kt:42)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(54)), composerKN, 6);
            String strT = StringResources_androidKt.t(viewState.HI() ? 2132017440 : 2132019851, composerKN, 0);
            Modifier modifierGh = PaddingKt.gh(columnScope.t(companion, Alignment.INSTANCE.Uo()), Dp.KN(25), 0.0f, 2, null);
            long jKN = Color.INSTANCE.KN();
            composerKN.eF(700654860);
            List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{20, 22, 24, 26, 28});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).rl(), 0L, TextUnitKt.KN(((Number) it.next()).intValue()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            composerKN.Xw();
            CM.ty(strT, arrayList, modifierGh, jKN, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 1, composerKN, 100666368, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(20)), composerKN, 6);
            List listXMQ = viewState.xMQ();
            composerKN.eF(700662621);
            if (listXMQ == null) {
                i5 = 24;
                i7 = 6;
            } else {
                i5 = 24;
                i7 = 6;
                mb8.fuX.ty(listXMQ, viewState.Uo(), onSubscriptionClicked, null, composerKN, (i3 >> 6) & 896, 8);
                Unit unit = Unit.INSTANCE;
            }
            composerKN.Xw();
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(i5)), composerKN, i7);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            BoxWithConstraintsKt.n(columnScope.t(companion2, companion3.Uo()), companion3.az(), false, ComposableLambdaKt.nr(-1593115641, true, new j(z2, viewState, lazyListState, onCardSnapped), composerKN, 54), composerKN, 3120, 4);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.t(columnScope, viewState, z2, lazyListState, onSubscriptionClicked, onCardSnapped, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ColumnScope columnScope, Ml.j.C0297j c0297j, boolean z2, LazyListState lazyListState, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        rl(columnScope, c0297j, z2, lazyListState, function1, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
