package com.alightcreative.app.motion.activities.creatorprogram.rewardlist;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import cg.o;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.Wre;
import com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6;
import com.alightcreative.time.Kw.znsSxz;
import jOL.Dsr;
import jOL.fuX;
import jOL.w6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f45026O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f45027n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f45028t;

        public static final class I28 implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Integer.valueOf(w6.Z((o.C) obj)), Integer.valueOf(w6.Z((o.C) obj2)));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class Ml extends Lambda implements Function4 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f45029O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f45030n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Map f45031t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ml(List list, Map map, Function1 function1) {
                super(4);
                this.f45030n = list;
                this.f45031t = map;
                this.f45029O = function1;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i5;
                Long lValueOf;
                Composer composer2;
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
                    ComposerKt.p5(-632812321, i5, -1, znsSxz.GLZMO);
                }
                o.C c2 = (o.C) this.f45030n.get(i2);
                composer.eF(1071369511);
                List list = (List) this.f45031t.get(c2);
                if (list != null) {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    lValueOf = Long.valueOf(((o) it.next()).rl());
                    while (it.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((o) it.next()).rl());
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                composer.eF(1420036573);
                if (lValueOf != null) {
                    int iO = w6.o(c2);
                    int iR = w6.r(c2);
                    long jLongValue = lValueOf.longValue();
                    composer.eF(1420045855);
                    boolean zP5 = composer.p5(this.f45029O) | composer.p5(c2);
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new C0629j(this.f45029O, c2);
                        composer.o(objIF);
                    }
                    composer.Xw();
                    composer2 = composer;
                    w6.qie(iO, iR, jLongValue, (Function0) objIF, composer2, 0);
                } else {
                    composer2 = composer;
                }
                composer2.Xw();
                composer2.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6$j$j, reason: collision with other inner class name */
        static final class C0629j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f45032n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ o.C f45033t;

            C0629j(Function1 function1, o.C c2) {
                this.f45032n = function1;
                this.f45033t = c2;
            }

            public final void n() {
                this.f45032n.invoke(this.f45033t);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        public static final class n extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f45034n = new n();

            public n() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Object obj) {
                return null;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6$j$w6, reason: collision with other inner class name */
        public static final class C0630w6 extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f45035n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f45036t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0630w6(Function1 function1, List list) {
                super(1);
                this.f45035n = function1;
                this.f45036t = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                return this.f45035n.invoke(this.f45036t.get(i2));
            }
        }

        j(Function0 function0, long j2, List list, Function1 function1) {
            this.f45027n = function0;
            this.f45028t = j2;
            this.f45026O = list;
            this.J2 = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(List list, Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.O(LazyColumn, null, null, SNU.j.f9748n.n(), 3, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                o.C cT = ((o) obj).t();
                Object arrayList = linkedHashMap.get(cT);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cT, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            List listSortedWith = CollectionsKt.sortedWith(linkedHashMap.keySet(), new I28());
            LazyColumn.qie(listSortedWith.size(), null, new C0630w6(n.f45034n, listSortedWith), ComposableLambdaKt.rl(-632812321, true, new Ml(listSortedWith, linkedHashMap, function1)));
            LazyListScope.O(LazyColumn, null, null, SNU.j.f9748n.rl(), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1489255270, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListScreen.<anonymous> (CreatorRewardListScreen.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(companion, aD.w6.z(), null, 2, null);
            Function0 function0 = this.f45027n;
            long j2 = this.f45028t;
            final List list = this.f45026O;
            final Function1 function1 = this.J2;
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), Alignment.INSTANCE.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Dj7.Wre.rl(aD.w6.z(), composer, 6);
            fuX.Uo(null, StringResources_androidKt.t(2132017567, composer, 6), jOL.j.f69432n, Dsr.f69411n, new w6.j(2131231603, false, function0, 2, null), null, 0.0f, composer, 3456, 97);
            float f3 = 16;
            TextKt.t(StringResources_androidKt.nr(2132017566, new Object[]{Long.valueOf(j2)}, composer, 6), PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).N(), composer, 432, 0, 65528);
            float f4 = 12;
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f4)), composer, 6);
            Modifier modifierGh = PaddingKt.gh(SizeKt.J2(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f4));
            composer.eF(-1546676212);
            boolean zE2 = composer.E2(list) | composer.p5(function1);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.j.t(list, function1, (LazyListScope) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            LazyDslKt.rl(modifierGh, null, null, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composer, 24582, 494);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f45037O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f45038n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f45039t;

        n(int i2, long j2, int i3) {
            this.f45038n = i2;
            this.f45039t = j2;
            this.f45037O = i3;
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
                ComposerKt.p5(1560656906, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.RewardCard.<anonymous> (CreatorRewardListScreen.kt:148)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion.Uo();
            int i3 = this.f45038n;
            long j2 = this.f45039t;
            int i5 = this.f45037O;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, companion2);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            ImageKt.n(PainterResources_androidKt.t(i5, composer, 0), null, SizeKt.KN(companion2, 0.0f, 1, null), null, ContentScale.INSTANCE.nr(), 0.0f, null, composer, 25008, 104);
            BoxKt.n(BackgroundKt.rl(boxScopeInstance.O(companion2), Brush.Companion.xMQ(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(aD.w6.g()), Color.xMQ(Color.INSTANCE.J2())}), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composer, 0);
            composer.XQ();
            String strT = StringResources_androidKt.t(i3, composer, 0);
            float f3 = 12;
            Modifier modifierAz = PaddingKt.az(SizeKt.KN(companion2, 0.0f, 1, null), Dp.KN(f3), Dp.KN(f3), Dp.KN(f3), 0.0f, 8, null);
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, modifierAz, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).ViF(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            TextKt.t(StringResources_androidKt.nr(2132017590, new Object[]{Long.valueOf(j2)}, composer, 6), PaddingKt.az(SizeKt.KN(companion2, 0.0f, 1, null), Dp.KN(f3), 0.0f, Dp.KN(f3), Dp.KN(f3), 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).e(), composer, 432, 0, 65528);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6$w6, reason: collision with other inner class name */
    public /* synthetic */ class C0631w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.C.values().length];
            try {
                iArr[o.C.f43815t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.C.f43813n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.C.f43812O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(int i2, int i3, long j2, Function0 function0, int i5, Composer composer, int i7) {
        qie(i2, i3, j2, function0, composer, RecomposeScopeImplKt.n(i5 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(long j2, List list, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        J2(j2, list, function1, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(I28 i28, int i2, Composer composer, int i3) {
        Uo(i28, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void J2(final long j2, final List list, final Function1 function1, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1246115293);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1246115293, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListScreen (CreatorRewardListScreen.kt:63)");
            }
            H9N.CN3.nr(ComposableLambdaKt.nr(1489255270, true, new j(function0, j2, list, function1), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: SNU.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6.gh(j2, list, function1, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(I28 i28, o.C it) {
        Intrinsics.checkNotNullParameter(it, "it");
        i28.Ik(it);
        return Unit.INSTANCE;
    }

    public static final void Uo(final I28 viewModel, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerKN = composer.KN(-1738588637);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1738588637, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListScreen (CreatorRewardListScreen.kt:45)");
            }
            Wre wre = (Wre) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            if (wre instanceof Wre.j) {
                Wre.j jVar = (Wre.j) wre;
                long jRl = jVar.rl();
                List listN = jVar.n();
                composerKN.eF(419270630);
                boolean zE2 = composerKN.E2(viewModel);
                Object objIF = composerKN.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: SNU.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6.KN(viewModel, (o.C) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                Function1 function1 = (Function1) objIF;
                composerKN.Xw();
                composerKN.eF(419272745);
                boolean zE22 = composerKN.E2(viewModel);
                Object objIF2 = composerKN.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: SNU.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6.xMQ(viewModel);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                J2(jRl, listN, function1, (Function0) objIF2, composerKN, 0);
            } else if (wre != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: SNU.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6.mUb(viewModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(o.C c2) {
        int i2 = C0631w6.$EnumSwitchMapping$0[c2.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(o.C c2) {
        int i2 = C0631w6.$EnumSwitchMapping$0[c2.ordinal()];
        if (i2 == 1) {
            return 2132017555;
        }
        if (i2 == 2) {
            return 2132017553;
        }
        if (i2 == 3) {
            return 2132017592;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(final int i2, final int i3, final long j2, final Function0 function0, Composer composer, final int i5) {
        int i7;
        Function0 function02;
        Composer composer2;
        Composer composerKN = composer.KN(95845412);
        if ((i5 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerKN.t(i3) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            function02 = function0;
            i7 |= composerKN.E2(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(95845412, i7, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.RewardCard (CreatorRewardListScreen.kt:141)");
            }
            composer2 = composerKN;
            CardKt.rl(function02, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.t(Dp.KN(12)), Color.INSTANCE.KN(), 0L, null, 0.0f, null, ComposableLambdaKt.nr(1560656906, true, new n(i2, j2, i3), composerKN, 54), composer2, ((i7 >> 9) & 14) | 805330992, 484);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: SNU.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.activities.creatorprogram.rewardlist.w6.az(i2, i3, j2, function0, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(o.C c2) {
        int i2 = C0631w6.$EnumSwitchMapping$0[c2.ordinal()];
        if (i2 == 1) {
            return 2131231315;
        }
        if (i2 == 2) {
            return 2131231314;
        }
        if (i2 == 3) {
            return 2131231318;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(I28 i28) {
        i28.ck();
        return Unit.INSTANCE;
    }
}
