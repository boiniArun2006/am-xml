package yUp;

import Dj7.g9s;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import jOL.Dsr;
import jOL.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {

    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f75676n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list) {
            super(1);
            this.f75676n = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            this.f75676n.get(i2);
            return null;
        }
    }

    public static final class n extends Lambda implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f75677n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List list) {
            super(4);
            this.f75677n = list;
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
                ComposerKt.p5(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            yUp.j jVar = (yUp.j) this.f75677n.get(i2);
            composer.eF(-940917503);
            g9s.t(jVar.rl(), jVar.n(), composer, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(List list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.qie(list.size(), null, new j(list), ComposableLambdaKt.rl(-1091073711, true, new n(list)));
        return Unit.INSTANCE;
    }

    public static final List KN(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F2p.j jVar = (F2p.j) it.next();
            arrayList.add(new yUp.j(jVar.rl(), jVar.n()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(String str, String str2, List list, Function0 function0, int i2, Composer composer, int i3) {
        nr(str, str2, list, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void nr(final String pageTitle, final String pageSubtitle, final List qas, final Function0 onClosePressed, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
        Intrinsics.checkNotNullParameter(pageSubtitle, "pageSubtitle");
        Intrinsics.checkNotNullParameter(qas, "qas");
        Intrinsics.checkNotNullParameter(onClosePressed, "onClosePressed");
        Composer composerKN = composer.KN(634478476);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(pageTitle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(pageSubtitle) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(qas) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onClosePressed) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(634478476, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsContent (QAsContent.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(BackgroundKt.nr(companion, aD.w6.z(), null, 2, null), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Dj7.Wre.rl(aD.w6.z(), composerKN, 6);
            jOL.j jVar = jOL.j.f69432n;
            Dsr dsr = Dsr.f69411n;
            composerKN.eF(184457621);
            boolean z2 = (i3 & 7168) == 2048;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: yUp.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.O(onClosePressed);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            jOL.fuX.Uo(null, pageTitle, jVar, dsr, new w6.j(2131231603, false, (Function0) objIF, 2, null), null, 0.0f, composerKN, ((i3 << 3) & 112) | 3456, 97);
            float f3 = 16;
            TextKt.t(pageSubtitle, PaddingKt.az(companion, Dp.KN(f3), 0.0f, Dp.KN(f3), Dp.KN(f3), 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).N(), composerKN, ((i3 >> 3) & 14) | 48, 0, 65532);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f3));
            Modifier modifierMUb = PaddingKt.mUb(companion, Dp.KN(f3), Dp.KN(8));
            composerKN.eF(184470972);
            boolean zE2 = composerKN.E2(qas);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: yUp.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.J2(qas, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            composer2 = composerKN;
            LazyDslKt.rl(modifierMUb, null, null, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF2, composer2, 24582, 494);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: yUp.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.Uo(pageTitle, pageSubtitle, qas, onClosePressed, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
