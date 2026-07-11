package f52;

import Bj.j;
import GJW.vd;
import GJW.yg;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import f52.C;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class C {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f66434O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66435n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ State f66436t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f66436t = state;
            this.f66434O = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f66436t, this.f66434O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66435n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (C.xMQ(this.f66436t) > 3.0f) {
                    C.KN(this.f66434O, false);
                    return Unit.INSTANCE;
                }
                this.f66435n = 1;
                if (yg.rl(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C.KN(this.f66434O, true);
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f66437O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66438n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LazyStaggeredGridState f66439t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(LazyStaggeredGridState lazyStaggeredGridState, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f66439t = lazyStaggeredGridState;
            this.f66437O = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f66439t, this.f66437O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66438n == 0) {
                ResultKt.throwOnFailure(obj);
                int iO = this.f66439t.o();
                int iZ = this.f66439t.Z();
                LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) CollectionsKt.firstOrNull(this.f66439t.ViF().getVisibleItemsInfo());
                if (lazyStaggeredGridItemInfo == null) {
                    return Unit.INSTANCE;
                }
                MutableState mutableState = this.f66437O;
                boolean z2 = true;
                if (iO < 2 && (iO != 1 || iZ < ((int) (lazyStaggeredGridItemInfo.getSize() & 4294967295L)))) {
                    z2 = false;
                }
                C.J2(mutableState, z2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 implements Function3 {
        final /* synthetic */ List E2;
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ Function1 f66440N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f66441O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f66442S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Function1 f66443T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ MutableState f66444U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function1 f66445X;
        final /* synthetic */ Function0 Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ LazyListState f66446Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f66447e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TemplateFiltersItem.Content f66448g;
        final /* synthetic */ MutableState jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LazyStaggeredGridState f66449n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f66450o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f66451r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f66452t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f66453v;

        static final class CN3 extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function2 f66454n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f66455t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CN3(Function2 function2, List list) {
                super(1);
                this.f66454n = function2;
                this.f66455t = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                return this.f66454n.invoke(Integer.valueOf(i2), this.f66455t.get(i2));
            }
        }

        public static final class Dsr extends Lambda implements Function4 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f66456O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f66457n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ MutableState f66458o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f66459r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f66460t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dsr(List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, MutableState mutableState) {
                super(4);
                this.f66457n = list;
                this.f66460t = function1;
                this.f66456O = function12;
                this.J2 = function13;
                this.f66459r = function14;
                this.f66458o = mutableState;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                n((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
                int i5;
                if ((i3 & 6) == 0) {
                    i5 = (composer.p5(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
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
                    ComposerKt.p5(284833944, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:444)");
                }
                Bj.j jVar = (Bj.j) this.f66457n.get(i2);
                composer.eF(-1517452636);
                if (jVar instanceof j.C0016j) {
                    composer.eF(-1517382546);
                    j.C0016j c0016j = (j.C0016j) jVar;
                    boolean z2 = i2 == 0;
                    boolean zUo = C.Uo(this.f66458o);
                    Function1 function1 = this.f66460t;
                    Function1 function12 = this.f66456O;
                    composer.eF(89604187);
                    boolean zP5 = composer.p5(this.J2) | composer.E2(jVar);
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Ml(this.J2, jVar);
                        composer.o(objIF);
                    }
                    Function0 function0 = (Function0) objIF;
                    composer.Xw();
                    composer.eF(89606751);
                    boolean zP52 = composer.p5(this.f66459r) | composer.E2(jVar);
                    Object objIF2 = composer.iF();
                    if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new I28(this.f66459r, jVar);
                        composer.o(objIF2);
                    }
                    composer.Xw();
                    BQ.C.J2(c0016j, z2, function1, function12, zUo, function0, (Function0) objIF2, null, composer, 0, 128);
                    composer.Xw();
                } else {
                    if (!Intrinsics.areEqual(jVar, j.n.f589n)) {
                        composer.eF(89597247);
                        composer.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.eF(89618398);
                    BQ.C.nr(i2 == 0, null, composer, 0, 2);
                    composer.Xw();
                }
                composer.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class I28 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f66461n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bj.j f66462t;

            I28(Function1 function1, Bj.j jVar) {
                this.f66461n = function1;
                this.f66462t = jVar;
            }

            public final void n() {
                this.f66461n.invoke(((j.C0016j) this.f66462t).n());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f66463n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bj.j f66464t;

            Ml(Function1 function1, Bj.j jVar) {
                this.f66463n = function1;
                this.f66464t = jVar;
            }

            public final void n() {
                this.f66463n.invoke(((j.C0016j) this.f66464t).n());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class Wre implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f66465O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f66466n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ TemplateFiltersItem.Content f66467t;

            Wre(boolean z2, TemplateFiltersItem.Content content, Function0 function0) {
                this.f66466n = z2;
                this.f66467t = content;
                this.f66465O = function0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyStaggeredGridItemScope item, Composer composer, int i2) {
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1293517864, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplatesScreenContent.kt:181)");
                }
                boolean z2 = this.f66466n;
                TemplateFiltersItem.Content content = this.f66467t;
                Function0 function0 = this.f66465O;
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer2, companion);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                if (z2) {
                    composer2.eF(-87833450);
                    ProgressIndicatorKt.nr(boxScopeInstance.n(SizeKt.Z(companion, Dp.KN(32)), companion2.O()), ((aF1.j) composer2.ty(aF1.w6.t())).J2(), 0.0f, 0L, 0, composer2, 0, 28);
                    composer2.Xw();
                } else if (Intrinsics.areEqual(content, TemplateFiltersItem.Content.Saved.f45448O)) {
                    composer2.eF(-86770646);
                    composer2.Xw();
                } else {
                    composer2.eF(-87423165);
                    ButtonKt.O(function0, boxScopeInstance.n(companion, companion2.O()), false, null, ButtonDefaults.f24588n.nY(0L, aD.w6.EWS(), 0L, 0L, composer, (ButtonDefaults.HI << 12) | 48, 13), null, null, null, null, f52.j.f66520n.n(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 492);
                    composer2 = composer;
                    composer2.Xw();
                }
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        public static final class fuX extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f66468n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public fuX(List list) {
                super(1);
                this.f66468n = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                return com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62175h;
            }
        }

        static final class j implements Function3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function0 f66469n;

            j(Function0 function0) {
                this.f66469n = function0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyStaggeredGridItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(918150202, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplatesScreenContent.kt:126)");
                }
                BQ.qz.rl(this.f66469n, null, composer, 0, 2);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class n implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ eQ.fuX f66470O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f66471n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f66472t;

            n(List list, Function1 function1, eQ.fuX fux) {
                this.f66471n = list;
                this.f66472t = function1;
                this.f66470O = fux;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyStaggeredGridItemScope item, Composer composer, int i2) {
                Composer composer2;
                Unit unit;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2053356623, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplatesScreenContent.kt:131)");
                }
                List list = this.f66471n;
                composer.eF(745213828);
                if (list == null) {
                    composer2 = composer;
                    unit = null;
                } else {
                    float f3 = 20;
                    composer2 = composer;
                    PB.C.Uo(this.f66471n, this.f66472t, C.Ik(Modifier.INSTANCE, Dp.KN(f3)), PaddingKt.t(Dp.KN(f3), 0.0f, 2, null), this.f66470O, composer2, 3072, 0);
                    unit = Unit.INSTANCE;
                }
                composer2.Xw();
                if (unit == null) {
                    PB.I28.rl(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6, 0);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: f52.C$w6$w6, reason: collision with other inner class name */
        static final class C0911w6 implements Function3 {
            final /* synthetic */ TemplateFiltersItem.Content J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f66473O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ LazyListState f66474n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MutableState f66475r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f66476t;

            C0911w6(LazyListState lazyListState, List list, Function1 function1, TemplateFiltersItem.Content content, MutableState mutableState) {
                this.f66474n = lazyListState;
                this.f66476t = list;
                this.f66473O = function1;
                this.J2 = content;
                this.f66475r = mutableState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyStaggeredGridItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1102180897, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplatesScreenContent.kt:143)");
                }
                composer.eF(89565947);
                LazyListState lazyListStateRl = C.O(this.f66475r) ? LazyListStateKt.rl(0, 0, composer, 0, 3) : this.f66474n;
                composer.Xw();
                float f3 = 20;
                BQ.CN3.t(lazyListStateRl, this.f66476t, this.f66473O, this.J2, PaddingKt.t(Dp.KN(f3), 0.0f, 2, null), AlphaKt.n(PaddingKt.az(C.Ik(Modifier.INSTANCE, Dp.KN(f3)), 0.0f, 0.0f, 0.0f, Dp.KN(12), 7, null), C.O(this.f66475r) ? 0.0f : 1.0f), composer, 24576, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        w6(LazyStaggeredGridState lazyStaggeredGridState, Function0 function0, List list, Function1 function1, eQ.fuX fux, List list2, LazyListState lazyListState, Function1 function12, TemplateFiltersItem.Content content, List list3, Function1 function13, Function1 function14, Function1 function15, Function1 function16, boolean z2, Function0 function02, MutableState mutableState, MutableState mutableState2) {
            this.f66449n = lazyStaggeredGridState;
            this.f66452t = function0;
            this.f66441O = list;
            this.J2 = function1;
            this.f66451r = fux;
            this.f66450o = list2;
            this.f66446Z = lazyListState;
            this.f66442S = function12;
            this.f66448g = content;
            this.E2 = list3;
            this.f66447e = function13;
            this.f66445X = function14;
            this.f66443T = function15;
            this.f66440N = function16;
            this.f66453v = z2;
            this.Xw = function02;
            this.jB = mutableState;
            this.f66444U = mutableState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object O(int i2, Bj.j item) {
            String strN;
            Intrinsics.checkNotNullParameter(item, "item");
            j.C0016j c0016j = item instanceof j.C0016j ? (j.C0016j) item : null;
            return (c0016j == null || (strN = c0016j.n()) == null) ? Integer.valueOf(i2) : strN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(List list, List list2, Function0 function0, List list3, Function1 function1, eQ.fuX fux, LazyListState lazyListState, Function1 function12, TemplateFiltersItem.Content content, MutableState mutableState, Function1 function13, Function1 function14, Function1 function15, Function1 function16, MutableState mutableState2, boolean z2, Function0 function02, LazyStaggeredGridScope LazyVerticalStaggeredGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
            StaggeredGridItemSpan.Companion companion = StaggeredGridItemSpan.INSTANCE;
            LazyStaggeredGridScope.rl(LazyVerticalStaggeredGrid, null, null, companion.n(), ComposableLambdaKt.rl(918150202, true, new j(function0)), 3, null);
            LazyStaggeredGridScope.rl(LazyVerticalStaggeredGrid, null, null, companion.n(), ComposableLambdaKt.rl(-2053356623, true, new n(list3, function1, fux)), 3, null);
            if (list != null) {
                LazyStaggeredGridScope.rl(LazyVerticalStaggeredGrid, null, null, companion.n(), ComposableLambdaKt.rl(1102180897, true, new C0911w6(lazyListState, list, function12, content, mutableState)), 3, null);
            }
            if (list2 != null) {
                LazyVerticalStaggeredGrid.Uo(list2.size(), new CN3(new Function2() { // from class: f52.qz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.w6.O(((Integer) obj).intValue(), (Bj.j) obj2);
                    }
                }, list2), new fuX(list2), null, ComposableLambdaKt.rl(284833944, true, new Dsr(list2, function13, function14, function15, function16, mutableState2)));
                LazyStaggeredGridScope.rl(LazyVerticalStaggeredGrid, null, null, companion.n(), ComposableLambdaKt.rl(-1293517864, true, new Wre(z2, content, function02)), 3, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void t(BoxScope PullToRefreshBox, Composer composer, int i2) {
            List list;
            Intrinsics.checkNotNullParameter(PullToRefreshBox, "$this$PullToRefreshBox");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(401506544, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent.<anonymous> (TemplatesScreenContent.kt:115)");
            }
            StaggeredGridCells.Fixed fixed = new StaggeredGridCells.Fixed(2);
            float f3 = 12;
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(f3));
            float fKN = Dp.KN(f3);
            float f4 = 20;
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(f4), 0.0f, 2, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(SizeKt.J2(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.KN(16), 7, null);
            LazyStaggeredGridState lazyStaggeredGridState = this.f66449n;
            composer.eF(30044148);
            boolean zE2 = composer.E2(this.f66441O) | composer.p5(this.f66452t) | composer.p5(this.J2) | composer.E2(this.f66451r) | composer.E2(this.f66450o) | composer.p5(this.f66446Z) | composer.p5(this.f66442S) | composer.p5(this.f66448g) | composer.E2(this.E2) | composer.p5(this.f66447e) | composer.p5(this.f66445X) | composer.p5(this.f66443T) | composer.p5(this.f66440N) | composer.n(this.f66453v) | composer.p5(this.Xw);
            final List list2 = this.f66450o;
            final List list3 = this.E2;
            final Function0 function0 = this.f66452t;
            final List list4 = this.f66441O;
            final Function1 function1 = this.J2;
            final eQ.fuX fux = this.f66451r;
            final LazyListState lazyListState = this.f66446Z;
            final Function1 function12 = this.f66442S;
            final TemplateFiltersItem.Content content = this.f66448g;
            final MutableState mutableState = this.jB;
            final Function1 function13 = this.f66447e;
            final Function1 function14 = this.f66445X;
            final Function1 function15 = this.f66443T;
            final Function1 function16 = this.f66440N;
            final MutableState mutableState2 = this.f66444U;
            final boolean z2 = this.f66453v;
            final Function0 function02 = this.Xw;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                Function1 function17 = new Function1() { // from class: f52.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.w6.nr(list2, list3, function0, list4, function1, fux, lazyListState, function12, content, mutableState, function13, function14, function15, function16, mutableState2, z2, function02, (LazyStaggeredGridScope) obj);
                    }
                };
                composer.o(function17);
                objIF = function17;
            }
            composer.Xw();
            LazyStaggeredGridDslKt.t(fixed, modifierAz, lazyStaggeredGridState, paddingValuesT, false, fKN, horizontalOrVerticalTy, null, false, null, (Function1) objIF, composer, 1772592, 0, 912);
            if (C.O(this.jB) && (list = this.f66450o) != null) {
                BQ.CN3.t(this.f66446Z, list, this.f66442S, this.f66448g, PaddingKt.t(Dp.KN(f4), 0.0f, 2, null), PaddingKt.gh(BackgroundKt.nr(companion, ColorResources_androidKt.n(2131100619, composer, 6), null, 2, null), 0.0f, Dp.KN(f3), 1, null), composer, 24576, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(List list, List list2, List list3, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, boolean z2, Function0 function02, boolean z3, Function0 function03, Function1 function15, Function1 function16, Modifier modifier, TemplateFiltersItem.Content content, eQ.fuX fux, int i2, int i3, int i5, Composer composer, int i7) {
        nr(list, list2, list3, function0, function1, function12, function13, function14, z2, function02, z3, function03, function15, function16, modifier, content, fux, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final List list, final List list2, final List list3, final Function0 onYourTemplatesClicked, final Function1 onTagCircleClicked, final Function1 onFilterClicked, final Function1 onTemplateClicked, final Function1 onSaveTemplateClicked, final boolean z2, final Function0 onRefresh, final boolean z3, final Function0 onLoadMoreClicked, final Function1 playerProvider, final Function1 onPlayerRelease, Modifier modifier, TemplateFiltersItem.Content content, eQ.fuX fux, Composer composer, final int i2, final int i3, final int i5) {
        List list4;
        int i7;
        List list5;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TemplateFiltersItem.Content content2;
        LazyStaggeredGridState lazyStaggeredGridStateN;
        Object objIF;
        Composer.Companion companion;
        int i18;
        MutableState mutableState;
        Object objIF2;
        MutableState mutableState2;
        State stateO;
        boolean zP5;
        Object objIF3;
        boolean zP52;
        Object objIF4;
        Composer composer2;
        final Modifier modifier2;
        final TemplateFiltersItem.Content content3;
        final eQ.fuX fux2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i19;
        Intrinsics.checkNotNullParameter(onYourTemplatesClicked, "onYourTemplatesClicked");
        Intrinsics.checkNotNullParameter(onTagCircleClicked, "onTagCircleClicked");
        Intrinsics.checkNotNullParameter(onFilterClicked, "onFilterClicked");
        Intrinsics.checkNotNullParameter(onTemplateClicked, "onTemplateClicked");
        Intrinsics.checkNotNullParameter(onSaveTemplateClicked, "onSaveTemplateClicked");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onLoadMoreClicked, "onLoadMoreClicked");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(onPlayerRelease, "onPlayerRelease");
        Composer composerKN = composer.KN(680097686);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            list4 = list;
        } else if ((i2 & 6) == 0) {
            list4 = list;
            i7 = i2 | (composerKN.E2(list4) ? 4 : 2);
        } else {
            list4 = list;
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            list5 = list2;
        } else {
            list5 = list2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(list5) ? 32 : 16;
            }
        }
        int i20 = i7;
        if ((i5 & 4) != 0) {
            i8 = i20 | RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            int i21 = i20;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i21 |= composerKN.E2(list3) ? 256 : 128;
            }
            i8 = i21;
        }
        if ((i5 & 8) != 0) {
            i9 = i8 | 3072;
        } else {
            int i22 = i8;
            if ((i2 & 3072) == 0) {
                i9 = i22 | (composerKN.E2(onYourTemplatesClicked) ? 2048 : 1024);
            } else {
                i9 = i22;
            }
        }
        if ((i5 & 16) != 0) {
            i9 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i9 |= composerKN.E2(onTagCircleClicked) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i9 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i9 |= composerKN.E2(onFilterClicked) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i9 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i9 |= composerKN.E2(onTemplateClicked) ? 1048576 : 524288;
        }
        if ((i5 & 128) == 0) {
            i19 = (12582912 & i2) == 0 ? composerKN.E2(onSaveTemplateClicked) ? 8388608 : 4194304 : 12582912;
            if ((i5 & 256) == 0) {
                i9 |= 100663296;
            } else {
                if ((100663296 & i2) == 0) {
                    i9 |= composerKN.n(z2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                if ((i5 & 512) != 0) {
                    i10 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((805306368 & i2) == 0) {
                        i10 = composerKN.E2(onRefresh) ? 536870912 : 268435456;
                    }
                    i11 = i9;
                    if ((i5 & 1024) == 0) {
                        i12 = i3 | 6;
                        z4 = z3;
                    } else if ((i3 & 6) == 0) {
                        z4 = z3;
                        i12 = i3 | (composerKN.n(z4) ? 4 : 2);
                    } else {
                        z4 = z3;
                        i12 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i12 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i12 |= composerKN.E2(onLoadMoreClicked) ? 32 : 16;
                    }
                    int i23 = i12;
                    if ((i5 & 4096) == 0) {
                        i23 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i23 |= composerKN.E2(playerProvider) ? 256 : 128;
                    }
                    if ((i5 & 8192) == 0) {
                        i23 |= 3072;
                    } else if ((i3 & 3072) == 0) {
                        i23 |= composerKN.E2(onPlayerRelease) ? 2048 : 1024;
                    }
                    i13 = i5 & 16384;
                    if (i13 != 0) {
                        i14 = i23;
                        if ((i3 & 24576) == 0) {
                            i14 |= composerKN.p5(modifier) ? 16384 : 8192;
                        }
                        i15 = i5 & 32768;
                        if (i15 != 0) {
                            i14 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i14 |= composerKN.p5(content) ? 131072 : 65536;
                        }
                        i16 = i5 & 65536;
                        if (i16 != 0) {
                            i14 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i14 |= composerKN.E2(fux) ? 1048576 : 524288;
                        }
                        i17 = i14;
                        if ((i11 & 306783379) == 306783378 && (599187 & i17) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier2 = modifier;
                            content3 = content;
                            fux2 = fux;
                            composer2 = composerKN;
                        } else {
                            Modifier modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier;
                            TemplateFiltersItem.Content content4 = i15 == 0 ? null : content;
                            eQ.fuX fux3 = i16 == 0 ? null : fux;
                            if (ComposerKt.v()) {
                                content2 = content4;
                            } else {
                                content2 = content4;
                                ComposerKt.p5(680097686, i11, i17, "com.alightcreative.app.motion.activities.main.maintabs.templates.TemplatesScreenContent (TemplatesScreenContent.kt:77)");
                            }
                            lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                            LazyListState lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                            composerKN.eF(1410771328);
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF != companion.n()) {
                                i18 = i11;
                                MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                                composerKN.o(mutableStateO);
                                objIF = mutableStateO;
                            } else {
                                i18 = i11;
                            }
                            mutableState = (MutableState) objIF;
                            composerKN.Xw();
                            composerKN.eF(1410776063);
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
                                composerKN.o(objIF2);
                            }
                            mutableState2 = (MutableState) objIF2;
                            composerKN.Xw();
                            stateO = SPz.O(lazyStaggeredGridStateN, composerKN, 0);
                            Float fValueOf = Float.valueOf(xMQ(stateO));
                            composerKN.eF(1410780399);
                            zP5 = composerKN.p5(stateO);
                            objIF3 = composerKN.iF();
                            if (!zP5 || objIF3 == companion.n()) {
                                objIF3 = new j(stateO, mutableState2, null);
                                composerKN.o(objIF3);
                            }
                            composerKN.Xw();
                            EffectsKt.O(fValueOf, (Function2) objIF3, composerKN, 0);
                            Integer numValueOf = Integer.valueOf(lazyStaggeredGridStateN.o());
                            Integer numValueOf2 = Integer.valueOf(lazyStaggeredGridStateN.Z());
                            composerKN.eF(1410793772);
                            zP52 = composerKN.p5(lazyStaggeredGridStateN);
                            objIF4 = composerKN.iF();
                            if (!zP52 || objIF4 == companion.n()) {
                                objIF4 = new n(lazyStaggeredGridStateN, mutableState, null);
                                composerKN.o(objIF4);
                            }
                            composerKN.Xw();
                            EffectsKt.nr(numValueOf, numValueOf2, (Function2) objIF4, composerKN, 0);
                            eQ.fuX fux4 = fux3;
                            TemplateFiltersItem.Content content5 = content2;
                            composer2 = composerKN;
                            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(401506544, true, new w6(lazyStaggeredGridStateN, onYourTemplatesClicked, list4, onTagCircleClicked, fux4, list5, lazyListStateRl, onFilterClicked, content5, list3, playerProvider, onPlayerRelease, onTemplateClicked, onSaveTemplateClicked, z4, onLoadMoreClicked, mutableState, mutableState2), composer2, 54);
                            int i24 = i18 >> 24;
                            Modifier modifier4 = modifier3;
                            PullToRefreshKt.nr(z2, onRefresh, modifier4, null, null, null, composableLambdaNr, composer2, (i24 & 112) | (i24 & 14) | 1572864 | ((i17 >> 6) & 896), 56);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier2 = modifier4;
                            content3 = content5;
                            fux2 = fux4;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: f52.fuX
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return C.mUb(list, list2, list3, onYourTemplatesClicked, onTagCircleClicked, onFilterClicked, onTemplateClicked, onSaveTemplateClicked, z2, onRefresh, z3, onLoadMoreClicked, playerProvider, onPlayerRelease, modifier2, content3, fux2, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 = i23 | 24576;
                    i15 = i5 & 32768;
                    if (i15 != 0) {
                    }
                    i16 = i5 & 65536;
                    if (i16 != 0) {
                    }
                    i17 = i14;
                    if ((i11 & 306783379) == 306783378) {
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                        LazyListState lazyListStateRl2 = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                        composerKN.eF(1410771328);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                        }
                        mutableState = (MutableState) objIF;
                        composerKN.Xw();
                        composerKN.eF(1410776063);
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                        }
                        mutableState2 = (MutableState) objIF2;
                        composerKN.Xw();
                        stateO = SPz.O(lazyStaggeredGridStateN, composerKN, 0);
                        Float fValueOf2 = Float.valueOf(xMQ(stateO));
                        composerKN.eF(1410780399);
                        zP5 = composerKN.p5(stateO);
                        objIF3 = composerKN.iF();
                        if (!zP5) {
                            objIF3 = new j(stateO, mutableState2, null);
                            composerKN.o(objIF3);
                            composerKN.Xw();
                            EffectsKt.O(fValueOf2, (Function2) objIF3, composerKN, 0);
                            Integer numValueOf3 = Integer.valueOf(lazyStaggeredGridStateN.o());
                            Integer numValueOf22 = Integer.valueOf(lazyStaggeredGridStateN.Z());
                            composerKN.eF(1410793772);
                            zP52 = composerKN.p5(lazyStaggeredGridStateN);
                            objIF4 = composerKN.iF();
                            if (!zP52) {
                                objIF4 = new n(lazyStaggeredGridStateN, mutableState, null);
                                composerKN.o(objIF4);
                                composerKN.Xw();
                                EffectsKt.nr(numValueOf3, numValueOf22, (Function2) objIF4, composerKN, 0);
                                eQ.fuX fux42 = fux3;
                                TemplateFiltersItem.Content content52 = content2;
                                composer2 = composerKN;
                                ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(401506544, true, new w6(lazyStaggeredGridStateN, onYourTemplatesClicked, list4, onTagCircleClicked, fux42, list5, lazyListStateRl2, onFilterClicked, content52, list3, playerProvider, onPlayerRelease, onTemplateClicked, onSaveTemplateClicked, z4, onLoadMoreClicked, mutableState, mutableState2), composer2, 54);
                                int i242 = i18 >> 24;
                                Modifier modifier42 = modifier3;
                                PullToRefreshKt.nr(z2, onRefresh, modifier42, null, null, null, composableLambdaNr2, composer2, (i242 & 112) | (i242 & 14) | 1572864 | ((i17 >> 6) & 896), 56);
                                if (ComposerKt.v()) {
                                }
                                modifier2 = modifier42;
                                content3 = content52;
                                fux2 = fux42;
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 |= i10;
                i11 = i9;
                if ((i5 & 1024) == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                int i232 = i12;
                if ((i5 & 4096) == 0) {
                }
                if ((i5 & 8192) == 0) {
                }
                i13 = i5 & 16384;
                if (i13 != 0) {
                }
                i15 = i5 & 32768;
                if (i15 != 0) {
                }
                i16 = i5 & 65536;
                if (i16 != 0) {
                }
                i17 = i14;
                if ((i11 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            if ((i5 & 512) != 0) {
            }
            i9 |= i10;
            i11 = i9;
            if ((i5 & 1024) == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            int i2322 = i12;
            if ((i5 & 4096) == 0) {
            }
            if ((i5 & 8192) == 0) {
            }
            i13 = i5 & 16384;
            if (i13 != 0) {
            }
            i15 = i5 & 32768;
            if (i15 != 0) {
            }
            i16 = i5 & 65536;
            if (i16 != 0) {
            }
            i17 = i14;
            if ((i11 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i9 |= i19;
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) != 0) {
        }
        i9 |= i10;
        i11 = i9;
        if ((i5 & 1024) == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        int i23222 = i12;
        if ((i5 & 4096) == 0) {
        }
        if ((i5 & 8192) == 0) {
        }
        i13 = i5 & 16384;
        if (i13 != 0) {
        }
        i15 = i5 & 32768;
        if (i15 != 0) {
        }
        i16 = i5 & 65536;
        if (i16 != 0) {
        }
        i17 = i14;
        if ((i11 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier Ik(Modifier modifier, final float f3) {
        return LayoutModifierKt.n(modifier, new Function3() { // from class: f52.Dsr
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C.r(f3, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.xMQ(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult r(float f3, MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(constraints.getValue(), 0, Constraints.qie(constraints.getValue()) + (layout.How(f3) * 2), 0, 0, 13, null));
        return MeasureScope.ER(layout, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1() { // from class: f52.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C.o(placeableDR0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float xMQ(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
