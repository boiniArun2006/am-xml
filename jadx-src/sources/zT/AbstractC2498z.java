package zT;

import GJW.vd;
import KA9.AbstractC1381p;
import KA9.Md;
import KA9.Sis;
import KA9.mz;
import M.c7r;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import d8q.jqQ.QTafcm;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import six.I28;
import y.AbstractC2434w6;
import zT.AbstractC2498z;

/* JADX INFO: renamed from: zT.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2498z {

    /* JADX INFO: renamed from: zT.z$Ml */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ PagerState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ six.CN3 f76663O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76664n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f76665r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76666t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(List list, six.CN3 cn3, PagerState pagerState, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f76666t = list;
            this.f76663O = cn3;
            this.J2 = pagerState;
            this.f76665r = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f76666t, this.f76663O, this.J2, this.f76665r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76664n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f76666t.indexOf(this.f76663O) != this.J2.P5()) {
                    this.f76665r.invoke(this.f76666t.get(this.J2.P5()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: zT.z$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f76667O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76668n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PagerState f76669t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(PagerState pagerState, int i2, Continuation continuation) {
            super(2, continuation);
            this.f76669t = pagerState;
            this.f76667O = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f76669t, this.f76667O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f76668n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PagerState pagerState = this.f76669t;
                int i3 = this.f76667O;
                this.f76668n = 1;
                if (PagerState.ty(pagerState, i3, 0.0f, null, this, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: zT.z$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class n implements Function4 {
        final /* synthetic */ Function1 E2;
        final /* synthetic */ I28.j J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f76670N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ c7r.j f76671O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f76672S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f76673T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function1 f76674X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ PagerState f76675Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f76676e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f76677g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f76678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f76679o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f76680r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76681t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function0 f76682v;

        /* JADX INFO: renamed from: zT.z$n$j */
        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, I28.j.class, "onSortMenuTriggered", "onSortMenuTriggered()V", 0);
            }

            public final void n() {
                ((I28.j) this.receiver).KN();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: zT.z$n$n, reason: collision with other inner class name */
        /* synthetic */ class C1303n extends FunctionReferenceImpl implements Function0 {
            C1303n(Object obj) {
                super(0, obj, I28.j.class, "onSortMenuTriggered", "onSortMenuTriggered()V", 0);
            }

            public final void n() {
                ((I28.j) this.receiver).KN();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: zT.z$n$w6 */
        public /* synthetic */ class w6 {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KA9.u.values().length];
                try {
                    iArr[KA9.u.f5007n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KA9.u.f5008t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        n(List list, List list2, c7r.j jVar, I28.j jVar2, Function0 function0, boolean z2, PagerState pagerState, List list3, Function1 function1, Function1 function12, MutableState mutableState, Function1 function13, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Function0 function02) {
            this.f76678n = list;
            this.f76681t = list2;
            this.f76671O = jVar;
            this.J2 = jVar2;
            this.f76680r = function0;
            this.f76679o = z2;
            this.f76675Z = pagerState;
            this.f76672S = list3;
            this.f76677g = function1;
            this.E2 = function12;
            this.f76676e = mutableState;
            this.f76674X = function13;
            this.f76673T = bitmapLruCache;
            this.f76670N = sceneThumbnailMaker;
            this.f76682v = function02;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(PagerScope HorizontalPager, int i2, Composer composer, int i3) {
            six.CN3 cn3;
            List list;
            Composer composer2;
            I28.j jVar;
            int i5;
            String strT;
            String strT2;
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.v()) {
                ComposerKt.p5(-1524989527, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.ProjectListTab.<anonymous>.<anonymous> (ProjectListTab.kt:139)");
            }
            six.CN3 cn32 = (six.CN3) this.f76678n.get(i2);
            List list2 = this.f76681t;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (AbstractC2498z.wTp((ProjectInfo) obj) == cn32) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list3 = (List) pair.component1();
            List list4 = (List) pair.component2();
            c7r.j jVar2 = this.f76671O;
            I28.j jVar3 = this.J2;
            Function0 function0 = this.f76680r;
            boolean z2 = this.f76679o;
            PagerState pagerState = this.f76675Z;
            List list5 = this.f76672S;
            Function1 function1 = this.f76677g;
            Function1 function12 = this.E2;
            MutableState mutableState = this.f76676e;
            Function1 function13 = this.f76674X;
            BitmapLruCache bitmapLruCache = this.f76673T;
            SceneThumbnailMaker sceneThumbnailMaker = this.f76670N;
            Function0 function02 = this.f76682v;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
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
            if (list3.isEmpty() && cn32 == six.CN3.f73279O) {
                composer.eF(32432473);
                six.fuX fux = six.fuX.f73288O;
                int i7 = w6.$EnumSwitchMapping$0[jVar2.O().ordinal()];
                if (i7 == 1) {
                    composer.eF(278147545);
                    strT2 = StringResources_androidKt.t(2132020186, composer, 6);
                    composer.Xw();
                } else {
                    if (i7 != 2) {
                        composer.eF(278144616);
                        composer.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.eF(278151065);
                    strT2 = StringResources_androidKt.t(2132020185, composer, 6);
                    composer.Xw();
                }
                composer.eF(278155210);
                boolean zE2 = composer.E2(jVar3);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(jVar3);
                    composer.o(objIF);
                }
                composer.Xw();
                AbstractC1381p.rl(fux, strT2, (Function0) ((KFunction) objIF), composer, 6);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer, 6);
                float f3 = 24;
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f3));
                Modifier modifierNr = SizeKt.nr(PaddingKt.mUb(companion, Dp.KN(16), Dp.KN(f3)), 0.0f, 1, null);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(horizontalOrVerticalTy, companion2.gh(), composer, 6);
                int iN2 = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierNr);
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
                Updater.O(composerN2, measurePolicyN2, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                TextKt.t(StringResources_androidKt.t(2132019739, composer, 6), null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).v(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                AbstractC2498z.Ik(function02, SizeKt.KN(companion, 0.0f, 1, null), composer, 48, 0);
                composer.XQ();
                composer.Xw();
            } else if (list3.isEmpty()) {
                composer.eF(33900478);
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                KA9.DAz.rl(cn32, !list4.isEmpty(), composer, 0, 0);
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                composer.Xw();
            } else {
                composer.eF(34332618);
                composer.eF(278201407);
                if (cn32 == six.CN3.f73283r) {
                    cn3 = cn32;
                    composer2 = composer;
                    jVar = jVar3;
                    list = list3;
                    i5 = 6;
                    AbstractC2434w6.t(jVar2.qie(), jVar2.gh(), jVar2.xMQ(), PaddingKt.gh(companion, Dp.KN(16), 0.0f, 2, null), jVar2.rl(), function0, composer2, 3072, 0);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(24)), composer2, 6);
                } else {
                    cn3 = cn32;
                    list = list3;
                    composer2 = composer;
                    jVar = jVar3;
                    i5 = 6;
                }
                composer2.Xw();
                six.fuX fuxT = cn3.t();
                int i8 = w6.$EnumSwitchMapping$0[jVar2.O().ordinal()];
                if (i8 == 1) {
                    composer2.eF(278230169);
                    strT = StringResources_androidKt.t(2132020186, composer2, i5);
                    composer2.Xw();
                } else {
                    if (i8 != 2) {
                        composer2.eF(278227240);
                        composer2.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.eF(278233689);
                    strT = StringResources_androidKt.t(2132020185, composer2, i5);
                    composer2.Xw();
                }
                composer2.eF(278237834);
                boolean zE22 = composer2.E2(jVar);
                Object objIF2 = composer2.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new C1303n(jVar);
                    composer2.o(objIF2);
                }
                composer2.Xw();
                AbstractC1381p.rl(fuxT, strT, (Function0) ((KFunction) objIF2), composer2, 0);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer2, i5);
                KA9.o.Uo(jVar, list, z2 && pagerState.S() == i2, list5, jVar2.O(), (LazyListState) jVar.gh().get(i2), function1, function12, mutableState, false, function13, bitmapLruCache, sceneThumbnailMaker, jVar2.mUb(), composer, 100663296, 0, 512);
                composer.Xw();
            }
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: zT.z$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class w6 implements Function3 {
        final /* synthetic */ c7r.j E2;
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ State f76683N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76684O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f76685S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Function1 f76686T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function1 f76687X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f76688Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f76689e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f76690g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ProjectInfo f76691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f76692o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f76693r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.j f76694t;

        /* JADX INFO: renamed from: zT.z$w6$j */
        static final class j implements Function3 {
            final /* synthetic */ c7r.j E2;
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ State f76695N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f76696O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ BitmapLruCache f76697S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            final /* synthetic */ Function1 f76698T;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ Function1 f76699X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Function1 f76700Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1 f76701e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ SceneThumbnailMaker f76702g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ProjectInfo f76703n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function1 f76704o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f76705r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28.j f76706t;

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HI(I28.j jVar) {
                jVar.Uo(null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit qie(I28.j jVar) {
                jVar.Uo(null);
                return Unit.INSTANCE;
            }

            j(ProjectInfo projectInfo, I28.j jVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, c7r.j jVar2, Function1 function16, Function1 function17, Function1 function18, State state) {
                this.f76703n = projectInfo;
                this.f76706t = jVar;
                this.f76696O = function1;
                this.J2 = function12;
                this.f76705r = function13;
                this.f76704o = function14;
                this.f76700Z = function15;
                this.f76697S = bitmapLruCache;
                this.f76702g = sceneThumbnailMaker;
                this.E2 = jVar2;
                this.f76701e = function16;
                this.f76699X = function17;
                this.f76698T = function18;
                this.f76695N = state;
            }

            public final void gh(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i3 & 19) == 18 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(544885152, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.ProjectListTab.<anonymous>.<anonymous> (ProjectListTab.kt:237)");
                }
                ProjectInfo projectInfo = this.f76703n;
                Function0 function0 = null;
                if (projectInfo instanceof ProjectInfo.n) {
                    composer.eF(-954998482);
                    ProjectInfo projectInfo2 = this.f76703n;
                    float fG = AbstractC2498z.g(this.f76695N);
                    float fNr = BoxWithConstraints.nr();
                    composer.eF(-1416273458);
                    boolean zE2 = composer.E2(this.f76706t);
                    final I28.j jVar = this.f76706t;
                    Object objIF = composer.iF();
                    if (zE2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: zT.QJ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.qie(jVar);
                            }
                        };
                        composer.o(objIF);
                    }
                    Function0 function02 = (Function0) objIF;
                    composer.Xw();
                    composer.eF(-1416271137);
                    boolean zP5 = composer.p5(this.f76696O) | composer.p5(this.f76703n);
                    final Function1 function1 = this.f76696O;
                    final ProjectInfo projectInfo3 = this.f76703n;
                    Object objIF2 = composer.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: zT.l3D
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.o(function1, projectInfo3);
                            }
                        };
                        composer.o(objIF2);
                    }
                    Function0 function03 = (Function0) objIF2;
                    composer.Xw();
                    composer.eF(-1416269281);
                    boolean zP52 = composer.p5(this.J2) | composer.p5(this.f76703n);
                    final Function1 function12 = this.J2;
                    final ProjectInfo projectInfo4 = this.f76703n;
                    Object objIF3 = composer.iF();
                    if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function0() { // from class: zT.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.Z(function12, projectInfo4);
                            }
                        };
                        composer.o(objIF3);
                    }
                    Function0 function04 = (Function0) objIF3;
                    composer.Xw();
                    composer.eF(-1416267326);
                    boolean zP53 = composer.p5(this.f76705r) | composer.p5(this.f76703n);
                    final Function1 function13 = this.f76705r;
                    final ProjectInfo projectInfo5 = this.f76703n;
                    Object objIF4 = composer.iF();
                    if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Function0() { // from class: zT.s4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.XQ(function13, projectInfo5);
                            }
                        };
                        composer.o(objIF4);
                    }
                    Function0 function05 = (Function0) objIF4;
                    composer.Xw();
                    Function1 function14 = this.f76704o;
                    composer.eF(-1416264542);
                    if (function14 != null) {
                        final Function1 function15 = this.f76704o;
                        final ProjectInfo projectInfo6 = this.f76703n;
                        composer.eF(278313893);
                        boolean zP54 = composer.p5(function15) | composer.p5(projectInfo6);
                        Object objIF5 = composer.iF();
                        if (zP54 || objIF5 == Composer.INSTANCE.n()) {
                            objIF5 = new Function0() { // from class: zT.UGc
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC2498z.w6.j.az(function15, projectInfo6);
                                }
                            };
                            composer.o(objIF5);
                        }
                        function0 = (Function0) objIF5;
                        composer.Xw();
                    }
                    Function0 function06 = function0;
                    composer.Xw();
                    composer.eF(-1416260609);
                    boolean zP55 = composer.p5(this.f76700Z) | composer.p5(this.f76703n);
                    final Function1 function16 = this.f76700Z;
                    final ProjectInfo projectInfo7 = this.f76703n;
                    Object objIF6 = composer.iF();
                    if (zP55 || objIF6 == Composer.INSTANCE.n()) {
                        objIF6 = new Function0() { // from class: zT.Q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.ty(function16, projectInfo7);
                            }
                        };
                        composer.o(objIF6);
                    }
                    composer.Xw();
                    KA9.g9s.O(projectInfo2, fG, fNr, function02, function03, function04, function05, null, function06, null, (Function0) objIF6, null, null, this.f76697S, this.f76702g, (okd.n) this.E2.mUb().get(((ProjectInfo.n) this.f76703n).getId()), composer, 0, 0, 6784);
                    composer.Xw();
                } else if (projectInfo instanceof ProjectInfo.j) {
                    composer.eF(-954092631);
                    ProjectInfo projectInfo8 = this.f76703n;
                    float fG2 = AbstractC2498z.g(this.f76695N);
                    float fNr2 = BoxWithConstraints.nr();
                    composer.eF(-1416244178);
                    boolean zE22 = composer.E2(this.f76706t);
                    final I28.j jVar2 = this.f76706t;
                    Object objIF7 = composer.iF();
                    if (zE22 || objIF7 == Composer.INSTANCE.n()) {
                        objIF7 = new Function0() { // from class: zT.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.HI(jVar2);
                            }
                        };
                        composer.o(objIF7);
                    }
                    Function0 function07 = (Function0) objIF7;
                    composer.Xw();
                    composer.eF(-1416241494);
                    boolean zP56 = composer.p5(this.f76701e) | composer.p5(this.f76703n);
                    final Function1 function17 = this.f76701e;
                    final ProjectInfo projectInfo9 = this.f76703n;
                    Object objIF8 = composer.iF();
                    if (zP56 || objIF8 == Composer.INSTANCE.n()) {
                        objIF8 = new Function0() { // from class: zT.SPz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.ck(function17, projectInfo9);
                            }
                        };
                        composer.o(objIF8);
                    }
                    Function0 function08 = (Function0) objIF8;
                    composer.Xw();
                    composer.eF(-1416238967);
                    boolean zP57 = composer.p5(this.f76699X) | composer.p5(this.f76703n);
                    final Function1 function18 = this.f76699X;
                    final ProjectInfo projectInfo10 = this.f76703n;
                    Object objIF9 = composer.iF();
                    if (zP57 || objIF9 == Composer.INSTANCE.n()) {
                        objIF9 = new Function0() { // from class: zT.ci
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.Ik(function18, projectInfo10);
                            }
                        };
                        composer.o(objIF9);
                    }
                    Function0 function09 = (Function0) objIF9;
                    composer.Xw();
                    Function0 function010 = this.E2.n(((ProjectInfo.j) this.f76703n).getId()) ? function09 : null;
                    composer.eF(-1416233496);
                    boolean zP58 = composer.p5(this.f76698T) | composer.p5(this.f76703n);
                    final Function1 function19 = this.f76698T;
                    final ProjectInfo projectInfo11 = this.f76703n;
                    Object objIF10 = composer.iF();
                    if (zP58 || objIF10 == Composer.INSTANCE.n()) {
                        objIF10 = new Function0() { // from class: zT.g9s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.w6.j.r(function19, projectInfo11);
                            }
                        };
                        composer.o(objIF10);
                    }
                    composer.Xw();
                    KA9.g9s.O(projectInfo8, fG2, fNr2, function07, null, null, null, null, null, function08, null, function010, (Function0) objIF10, this.f76697S, this.f76702g, (okd.n) this.E2.mUb().get(((ProjectInfo.j) this.f76703n).getId()), composer, 0, 0, 1520);
                    composer.Xw();
                } else {
                    if (projectInfo != null) {
                        composer.eF(-1416280592);
                        composer.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.eF(-1416224434);
                    composer.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                gh((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Ik(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit XQ(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Z(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit az(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit ck(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit ty(Function1 function1, ProjectInfo projectInfo) {
                function1.invoke(projectInfo);
                return Unit.INSTANCE;
            }
        }

        w6(ProjectInfo projectInfo, I28.j jVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, c7r.j jVar2, Function1 function16, Function1 function17, Function1 function18, State state) {
            this.f76691n = projectInfo;
            this.f76694t = jVar;
            this.f76684O = function1;
            this.J2 = function12;
            this.f76693r = function13;
            this.f76692o = function14;
            this.f76688Z = function15;
            this.f76685S = bitmapLruCache;
            this.f76690g = sceneThumbnailMaker;
            this.E2 = jVar2;
            this.f76689e = function16;
            this.f76687X = function17;
            this.f76686T = function18;
            this.f76683N = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-759050038, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.ProjectListTab.<anonymous> (ProjectListTab.kt:234)");
            }
            BoxWithConstraintsKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(544885152, true, new j(this.f76691n, this.f76694t, this.f76684O, this.J2, this.f76693r, this.f76692o, this.f76688Z, this.f76685S, this.f76690g, this.E2, this.f76689e, this.f76687X, this.f76686T, this.f76683N), composer, 54), composer, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(I28.j jVar) {
        jVar.Uo(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final c7r.j viewState, final I28.j listTabState, final List enabledFilterTypes, final PagerState pagerState, final List projectList, final six.CN3 selectedFilterType, final boolean z2, final List selectedProjects, final Function1 onSelectedFilterType, final Function1 onSortSelected, final Function0 onGetMoreSpaceClicked, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function0 function0, Function0 function02, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Composer composer, final int i2, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Function1 function110;
        int i29;
        Function1 function111;
        Function1 function112;
        Function1 function113;
        Function1 function114;
        Function1 function115;
        Function1 function116;
        Function1 function117;
        Function1 function118;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function1 function119;
        BitmapLruCache bitmapLruCache2;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        Object objIF3;
        final vd vdVar;
        MutableState mutableState;
        Modifier.Companion companion2;
        Modifier modifierNr;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean zE2;
        Object objIF4;
        Integer numT;
        final I28.j jVar;
        int i30;
        ProjectInfo projectInfo;
        boolean zE22;
        Object objIF5;
        final Function1 function120;
        final Function1 function121;
        final Function1 function122;
        final Function1 function123;
        final Function1 function124;
        final Function1 function125;
        Composer composer2;
        final Function1 function126;
        final Function1 function127;
        final Function0 function06;
        final Function0 function07;
        final BitmapLruCache bitmapLruCache3;
        final Function1 function128;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(listTabState, "listTabState");
        Intrinsics.checkNotNullParameter(enabledFilterTypes, "enabledFilterTypes");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(selectedFilterType, "selectedFilterType");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(onSelectedFilterType, "onSelectedFilterType");
        Intrinsics.checkNotNullParameter(onSortSelected, "onSortSelected");
        Intrinsics.checkNotNullParameter(onGetMoreSpaceClicked, "onGetMoreSpaceClicked");
        Composer composerKN = composer.KN(1111304690);
        if ((i7 & 1) != 0) {
            i8 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i8 = i2 | (composerKN.E2(viewState) ? 4 : 2);
        } else {
            i8 = i2;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i2 & 48) == 0) {
            i8 |= composerKN.E2(listTabState) ? 32 : 16;
        }
        int i31 = i8;
        if ((i7 & 4) != 0) {
            i31 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i31 |= composerKN.E2(enabledFilterTypes) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i31 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i31 |= composerKN.p5(pagerState) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i31 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i31 |= composerKN.E2(projectList) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i31 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i31 |= composerKN.p5(selectedFilterType) ? 131072 : 65536;
        }
        if ((i7 & 64) != 0) {
            i31 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i31 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((i7 & 128) != 0) {
            i31 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i31 |= composerKN.E2(selectedProjects) ? 8388608 : 4194304;
        }
        if ((i7 & 256) != 0) {
            i31 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i31 |= composerKN.E2(onSelectedFilterType) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i7 & 512) != 0) {
            i31 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i31 |= composerKN.E2(onSortSelected) ? 536870912 : 268435456;
        }
        int i32 = i31;
        if ((i7 & 1024) != 0) {
            i9 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i9 = (composerKN.E2(onGetMoreSpaceClicked) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        int i33 = i7 & 2048;
        if (i33 != 0) {
            i9 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i10 = i33;
                i9 |= composerKN.E2(function1) ? 32 : 16;
            }
            i11 = i7 & 4096;
            if (i11 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                i12 = i11;
            } else {
                i12 = i11;
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i9 |= composerKN.E2(function12) ? 256 : 128;
                }
            }
            i13 = i7 & 8192;
            if (i13 == 0) {
                i9 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i9 |= composerKN.E2(function13) ? 2048 : 1024;
            }
            i14 = i7 & 16384;
            if (i14 != 0) {
                if ((i3 & 24576) == 0) {
                    i9 |= composerKN.E2(function14) ? 16384 : 8192;
                }
                i15 = i7 & 32768;
                if (i15 != 0) {
                    i9 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    i9 |= composerKN.E2(function15) ? 131072 : 65536;
                }
                i16 = i7 & 65536;
                if (i16 != 0) {
                    i9 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i9 |= composerKN.E2(function16) ? 1048576 : 524288;
                }
                i17 = i7 & 131072;
                if (i17 != 0) {
                    i9 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i9 |= composerKN.E2(function17) ? 8388608 : 4194304;
                }
                i18 = i7 & 262144;
                if (i18 != 0) {
                    i9 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i9 |= composerKN.E2(function18) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i19 = i7 & 524288;
                if (i19 != 0) {
                    i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i9 |= composerKN.E2(function19) ? 536870912 : 268435456;
                }
                i20 = i7 & 1048576;
                if (i20 != 0) {
                    i21 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i21 = i5 | (composerKN.E2(function0) ? 4 : 2);
                } else {
                    i21 = i5;
                }
                i22 = i7 & 2097152;
                if (i22 != 0) {
                    i21 |= 48;
                } else if ((i5 & 48) == 0) {
                    i21 |= composerKN.E2(function02) ? 32 : 16;
                }
                int i34 = i21;
                i23 = i7 & 4194304;
                if (i23 != 0) {
                    i24 = i14;
                    i26 = i34 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    i25 = i5;
                } else {
                    int i35 = i34;
                    i24 = i14;
                    i25 = i5;
                    if ((i25 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i35 |= composerKN.p5(bitmapLruCache) ? 256 : 128;
                    }
                    i26 = i35;
                }
                i27 = i7 & 8388608;
                if (i27 != 0) {
                    i28 = i26 | 3072;
                } else {
                    int i36 = i26;
                    if ((i25 & 3072) == 0) {
                        i36 |= composerKN.E2(sceneThumbnailMaker) ? 2048 : 1024;
                    }
                    i28 = i36;
                }
                if ((i32 & 306783379) == 306783378 && (306783379 & i9) == 306783378 && (i28 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function126 = function1;
                    function120 = function13;
                    function128 = function14;
                    function122 = function15;
                    function121 = function16;
                    function123 = function17;
                    function124 = function18;
                    function125 = function19;
                    function06 = function0;
                    function07 = function02;
                    bitmapLruCache3 = bitmapLruCache;
                    sceneThumbnailMaker2 = sceneThumbnailMaker;
                    composer2 = composerKN;
                    function127 = function12;
                } else {
                    if (i10 == 0) {
                        composerKN.eF(217159374);
                        Object objIF6 = composerKN.iF();
                        if (objIF6 == Composer.INSTANCE.n()) {
                            objIF6 = new Function1() { // from class: zT.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.Z((ProjectInfo) obj);
                                }
                            };
                            composerKN.o(objIF6);
                        }
                        function110 = (Function1) objIF6;
                        composerKN.Xw();
                    } else {
                        function110 = function1;
                    }
                    if (i12 == 0) {
                        composerKN.eF(217160910);
                        Object objIF7 = composerKN.iF();
                        i29 = i28;
                        if (objIF7 == Composer.INSTANCE.n()) {
                            objIF7 = new Function1() { // from class: zT.qz
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.iF((ProjectInfo.n) obj);
                                }
                            };
                            composerKN.o(objIF7);
                        }
                        function111 = (Function1) objIF7;
                        composerKN.Xw();
                    } else {
                        i29 = i28;
                        function111 = function12;
                    }
                    if (i13 == 0) {
                        composerKN.eF(217162446);
                        Object objIF8 = composerKN.iF();
                        function112 = function111;
                        if (objIF8 == Composer.INSTANCE.n()) {
                            objIF8 = new Function1() { // from class: zT.Pl
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.X((ProjectInfo.n) obj);
                                }
                            };
                            composerKN.o(objIF8);
                        }
                        composerKN.Xw();
                        function113 = (Function1) objIF8;
                    } else {
                        function112 = function111;
                        function113 = function13;
                    }
                    if (i24 == 0) {
                        composerKN.eF(217164078);
                        Object objIF9 = composerKN.iF();
                        if (objIF9 == Composer.INSTANCE.n()) {
                            objIF9 = new Function1() { // from class: zT.Xo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.T((ProjectInfo.n) obj);
                                }
                            };
                            composerKN.o(objIF9);
                        }
                        composerKN.Xw();
                        function114 = (Function1) objIF9;
                    } else {
                        function114 = function14;
                    }
                    if (i15 == 0) {
                        composerKN.eF(217165614);
                        Object objIF10 = composerKN.iF();
                        if (objIF10 == Composer.INSTANCE.n()) {
                            objIF10 = new Function1() { // from class: zT.eO
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.N((ProjectInfo.n) obj);
                                }
                            };
                            composerKN.o(objIF10);
                        }
                        composerKN.Xw();
                        function115 = (Function1) objIF10;
                    } else {
                        function115 = function15;
                    }
                    Function1 function129 = i16 == 0 ? null : function16;
                    if (i17 == 0) {
                        composerKN.eF(217169422);
                        Object objIF11 = composerKN.iF();
                        if (objIF11 == Composer.INSTANCE.n()) {
                            objIF11 = new Function1() { // from class: zT.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.XQ((ProjectInfo.j) obj);
                                }
                            };
                            composerKN.o(objIF11);
                        }
                        composerKN.Xw();
                        function116 = (Function1) objIF11;
                    } else {
                        function116 = function17;
                    }
                    if (i18 == 0) {
                        composerKN.eF(217171278);
                        Object objIF12 = composerKN.iF();
                        if (objIF12 == Composer.INSTANCE.n()) {
                            objIF12 = new Function1() { // from class: zT.w6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.S((ProjectInfo.j) obj);
                                }
                            };
                            composerKN.o(objIF12);
                        }
                        composerKN.Xw();
                        function117 = (Function1) objIF12;
                    } else {
                        function117 = function18;
                    }
                    if (i19 == 0) {
                        composerKN.eF(217173102);
                        Object objIF13 = composerKN.iF();
                        if (objIF13 == Composer.INSTANCE.n()) {
                            objIF13 = new Function1() { // from class: zT.Ml
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC2498z.WPU((ProjectInfo.j) obj);
                                }
                            };
                            composerKN.o(objIF13);
                        }
                        composerKN.Xw();
                        function118 = (Function1) objIF13;
                    } else {
                        function118 = function19;
                    }
                    if (i20 == 0) {
                        composerKN.eF(217174638);
                        Object objIF14 = composerKN.iF();
                        if (objIF14 == Composer.INSTANCE.n()) {
                            objIF14 = new Function0() { // from class: zT.I28
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC2498z.aYN();
                                }
                            };
                            composerKN.o(objIF14);
                        }
                        function03 = (Function0) objIF14;
                        composerKN.Xw();
                    } else {
                        function03 = function0;
                    }
                    if (i22 == 0) {
                        composerKN.eF(217175950);
                        Object objIF15 = composerKN.iF();
                        function04 = function03;
                        if (objIF15 == Composer.INSTANCE.n()) {
                            objIF15 = new Function0() { // from class: zT.Wre
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC2498z.ViF();
                                }
                            };
                            composerKN.o(objIF15);
                        }
                        function05 = (Function0) objIF15;
                        composerKN.Xw();
                    } else {
                        function04 = function03;
                        function05 = function02;
                    }
                    BitmapLruCache bitmapLruCache4 = i23 == 0 ? null : bitmapLruCache;
                    SceneThumbnailMaker sceneThumbnailMaker3 = i27 == 0 ? null : sceneThumbnailMaker;
                    if (ComposerKt.v()) {
                        function119 = function110;
                        bitmapLruCache2 = bitmapLruCache4;
                    } else {
                        function119 = function110;
                        bitmapLruCache2 = bitmapLruCache4;
                        ComposerKt.p5(1111304690, i32, i9, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.ProjectListTab (ProjectListTab.kt:95)");
                    }
                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    composerKN.eF(217181815);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF != companion.n()) {
                        objIF = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L))), null, 2, null);
                        composerKN.o(objIF);
                    }
                    final MutableState mutableState2 = (MutableState) objIF;
                    composerKN.Xw();
                    composerKN.eF(217183871);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = SnapshotStateKt.O(new Function0() { // from class: zT.fuX
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2498z.nY(density, mutableState2);
                            }
                        });
                        composerKN.o(objIF2);
                    }
                    State state = (State) objIF2;
                    composerKN.Xw();
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                        composerKN.o(objIF3);
                    }
                    vdVar = (vd) objIF3;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierNr2 = BackgroundKt.nr(companion3, aD.w6.W(), null, 2, null);
                    composerKN.eF(217192797);
                    if (listTabState.nr()) {
                        mutableState = mutableState2;
                        companion2 = companion3;
                        modifierNr = companion2;
                    } else {
                        composerKN.eF(217195059);
                        Object objIF16 = composerKN.iF();
                        mutableState = mutableState2;
                        if (objIF16 == companion.n()) {
                            objIF16 = InteractionSourceKt.n();
                            composerKN.o(objIF16);
                        }
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF16;
                        composerKN.Xw();
                        composerKN.eF(217199483);
                        boolean zE23 = composerKN.E2(listTabState);
                        Object objIF17 = composerKN.iF();
                        if (zE23 || objIF17 == companion.n()) {
                            objIF17 = new Function0() { // from class: zT.Dsr
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC2498z.te(listTabState);
                                }
                            };
                            composerKN.o(objIF17);
                        }
                        composerKN.Xw();
                        modifierNr = ClickableKt.nr(companion3, mutableInteractionSource, null, false, null, null, (Function0) objIF17, 28, null);
                        companion2 = companion3;
                    }
                    composerKN.Xw();
                    Modifier modifierZmq = modifierNr2.Zmq(modifierNr);
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion4.n();
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
                    Updater.O(composerN, measurePolicyN, companion4.t());
                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                    function2Rl = companion4.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion4.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    composerKN.eF(-1834759545);
                    if (!viewState.KN()) {
                        Sis.t(function05, composerKN, (i29 >> 3) & 14, 0);
                    }
                    composerKN.Xw();
                    float f3 = 24;
                    SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
                    boolean z3 = !z2;
                    boolean zUo = viewState.Uo();
                    boolean zKN = viewState.KN();
                    boolean zJ2 = viewState.J2();
                    composerKN.eF(-1834744166);
                    int i37 = 234881024 & i32;
                    int i38 = i32 & 7168;
                    Function0 function08 = function05;
                    zE2 = (i37 != 67108864) | composerKN.E2(enabledFilterTypes) | composerKN.E2(vdVar) | (i38 != 2048);
                    objIF4 = composerKN.iF();
                    if (!zE2 || objIF4 == companion.n()) {
                        objIF4 = new Function1() { // from class: zT.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC2498z.fD(onSelectedFilterType, enabledFilterTypes, vdVar, pagerState, (six.CN3) obj);
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    composerKN.Xw();
                    Md.O(selectedFilterType, z3, zUo, zKN, zJ2, (Function1) objIF4, composerKN, (i32 >> 15) & 14);
                    SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
                    Function0 function09 = function04;
                    BitmapLruCache bitmapLruCache5 = bitmapLruCache2;
                    SceneThumbnailMaker sceneThumbnailMaker4 = sceneThumbnailMaker3;
                    Function1 function130 = function119;
                    PagerKt.n(pagerState, null, null, null, pagerState.T() - 1, 0.0f, null, null, !z2, false, null, null, null, null, ComposableLambdaKt.nr(-1524989527, true, new n(enabledFilterTypes, projectList, viewState, listTabState, onGetMoreSpaceClicked, z2, pagerState, selectedProjects, onSortSelected, function130, mutableState, function112, bitmapLruCache5, sceneThumbnailMaker4, function09), composerKN, 54), composerKN, (i32 >> 9) & 14, 24576, 16110);
                    composerKN.XQ();
                    numT = listTabState.t();
                    composerKN.eF(217381206);
                    if (numT != null) {
                        jVar = listTabState;
                        i30 = 0;
                        projectInfo = null;
                    } else {
                        int iIntValue = numT.intValue();
                        composerKN.eF(217384269);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : projectList) {
                            if (wTp((ProjectInfo) obj) == selectedFilterType) {
                                arrayList.add(obj);
                            }
                        }
                        ProjectInfo projectInfo2 = (ProjectInfo) CollectionsKt.getOrNull(arrayList, iIntValue);
                        composerKN.eF(217384848);
                        if (projectInfo2 == null) {
                            composerKN.eF(-1416293838);
                            jVar = listTabState;
                            boolean zE24 = composerKN.E2(jVar);
                            Object objIF18 = composerKN.iF();
                            if (zE24 || objIF18 == Composer.INSTANCE.n()) {
                                objIF18 = new Function0() { // from class: zT.C
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AbstractC2498z.E2(jVar);
                                    }
                                };
                                composerKN.o(objIF18);
                            }
                            composerKN.Xw();
                            i30 = 0;
                            EffectsKt.KN((Function0) objIF18, composerKN, 0);
                        } else {
                            jVar = listTabState;
                            i30 = 0;
                        }
                        composerKN.Xw();
                        composerKN.Xw();
                        projectInfo = projectInfo2;
                    }
                    composerKN.Xw();
                    Function1 function131 = function113;
                    Function1 function132 = function118;
                    Function1 function133 = function129;
                    Function1 function134 = function115;
                    Function1 function135 = function114;
                    Function1 function136 = function116;
                    Function1 function137 = function117;
                    AnimatedVisibilityKt.mUb(projectInfo == null ? 1 : i30, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, i30, null, 6, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-759050038, true, new w6(projectInfo, jVar, function112, function131, function135, function133, function134, bitmapLruCache5, sceneThumbnailMaker4, viewState, function136, function137, function132, state), composerKN, 54), composerKN, 196992, 18);
                    Integer numValueOf = Integer.valueOf(pagerState.P5());
                    composerKN.eF(217461314);
                    zE22 = composerKN.E2(enabledFilterTypes) | ((i32 & 458752) != 131072) | (i38 != 2048) | (i37 == 67108864);
                    objIF5 = composerKN.iF();
                    if (!zE22 || objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new Ml(enabledFilterTypes, selectedFilterType, pagerState, onSelectedFilterType, null);
                        composerKN.o(objIF5);
                    }
                    composerKN.Xw();
                    EffectsKt.O(numValueOf, (Function2) objIF5, composerKN, 0);
                    if (viewState.nr() != null) {
                        mz.rl(r0.intValue() * 0.01f, composerKN, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function120 = function131;
                    function121 = function133;
                    function122 = function134;
                    function123 = function136;
                    function124 = function137;
                    function125 = function132;
                    composer2 = composerKN;
                    function126 = function130;
                    function127 = function112;
                    function06 = function09;
                    function07 = function08;
                    bitmapLruCache3 = bitmapLruCache5;
                    function128 = function135;
                    sceneThumbnailMaker2 = sceneThumbnailMaker4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: zT.o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return AbstractC2498z.e(viewState, listTabState, enabledFilterTypes, pagerState, projectList, selectedFilterType, z2, selectedProjects, onSelectedFilterType, onSortSelected, onGetMoreSpaceClicked, function126, function127, function120, function128, function122, function121, function123, function124, function125, function06, function07, bitmapLruCache3, sceneThumbnailMaker2, i2, i3, i5, i7, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i9 |= 24576;
            i15 = i7 & 32768;
            if (i15 != 0) {
            }
            i16 = i7 & 65536;
            if (i16 != 0) {
            }
            i17 = i7 & 131072;
            if (i17 != 0) {
            }
            i18 = i7 & 262144;
            if (i18 != 0) {
            }
            i19 = i7 & 524288;
            if (i19 != 0) {
            }
            i20 = i7 & 1048576;
            if (i20 != 0) {
            }
            i22 = i7 & 2097152;
            if (i22 != 0) {
            }
            int i342 = i21;
            i23 = i7 & 4194304;
            if (i23 != 0) {
            }
            i27 = i7 & 8388608;
            if (i27 != 0) {
            }
            if ((i32 & 306783379) == 306783378) {
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i24 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i27 == 0) {
                }
                if (ComposerKt.v()) {
                }
                final Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                composerKN.eF(217181815);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF != companion.n()) {
                }
                final MutableState mutableState22 = (MutableState) objIF;
                composerKN.Xw();
                composerKN.eF(217183871);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                State state2 = (State) objIF2;
                composerKN.Xw();
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                }
                vdVar = (vd) objIF3;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierNr22 = BackgroundKt.nr(companion32, aD.w6.W(), null, 2, null);
                composerKN.eF(217192797);
                if (listTabState.nr()) {
                }
                composerKN.Xw();
                Modifier modifierZmq2 = modifierNr22.Zmq(modifierNr);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierZmq2);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion42.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion42.t());
                Updater.O(composerN, compositionLocalMapIk2, companion42.O());
                function2Rl = companion42.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion42.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    composerKN.eF(-1834759545);
                    if (!viewState.KN()) {
                    }
                    composerKN.Xw();
                    float f32 = 24;
                    SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f32)), composerKN, 6);
                    boolean z32 = !z2;
                    boolean zUo2 = viewState.Uo();
                    boolean zKN2 = viewState.KN();
                    boolean zJ22 = viewState.J2();
                    composerKN.eF(-1834744166);
                    int i372 = 234881024 & i32;
                    int i382 = i32 & 7168;
                    Function0 function082 = function05;
                    zE2 = (i372 != 67108864) | composerKN.E2(enabledFilterTypes) | composerKN.E2(vdVar) | (i382 != 2048);
                    objIF4 = composerKN.iF();
                    if (!zE2) {
                        objIF4 = new Function1() { // from class: zT.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AbstractC2498z.fD(onSelectedFilterType, enabledFilterTypes, vdVar, pagerState, (six.CN3) obj2);
                            }
                        };
                        composerKN.o(objIF4);
                        composerKN.Xw();
                        Md.O(selectedFilterType, z32, zUo2, zKN2, zJ22, (Function1) objIF4, composerKN, (i32 >> 15) & 14);
                        SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f32)), composerKN, 6);
                        Function0 function092 = function04;
                        BitmapLruCache bitmapLruCache52 = bitmapLruCache2;
                        SceneThumbnailMaker sceneThumbnailMaker42 = sceneThumbnailMaker3;
                        Function1 function1302 = function119;
                        PagerKt.n(pagerState, null, null, null, pagerState.T() - 1, 0.0f, null, null, !z2, false, null, null, null, null, ComposableLambdaKt.nr(-1524989527, true, new n(enabledFilterTypes, projectList, viewState, listTabState, onGetMoreSpaceClicked, z2, pagerState, selectedProjects, onSortSelected, function1302, mutableState, function112, bitmapLruCache52, sceneThumbnailMaker42, function092), composerKN, 54), composerKN, (i32 >> 9) & 14, 24576, 16110);
                        composerKN.XQ();
                        numT = listTabState.t();
                        composerKN.eF(217381206);
                        if (numT != null) {
                        }
                        composerKN.Xw();
                        Function1 function1312 = function113;
                        Function1 function1322 = function118;
                        Function1 function1332 = function129;
                        Function1 function1342 = function115;
                        Function1 function1352 = function114;
                        Function1 function1362 = function116;
                        Function1 function1372 = function117;
                        AnimatedVisibilityKt.mUb(projectInfo == null ? 1 : i30, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, i30, null, 6, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-759050038, true, new w6(projectInfo, jVar, function112, function1312, function1352, function1332, function1342, bitmapLruCache52, sceneThumbnailMaker42, viewState, function1362, function1372, function1322, state2), composerKN, 54), composerKN, 196992, 18);
                        Integer numValueOf2 = Integer.valueOf(pagerState.P5());
                        composerKN.eF(217461314);
                        zE22 = composerKN.E2(enabledFilterTypes) | ((i32 & 458752) != 131072) | (i382 != 2048) | (i372 == 67108864);
                        objIF5 = composerKN.iF();
                        if (!zE22) {
                            objIF5 = new Ml(enabledFilterTypes, selectedFilterType, pagerState, onSelectedFilterType, null);
                            composerKN.o(objIF5);
                            composerKN.Xw();
                            EffectsKt.O(numValueOf2, (Function2) objIF5, composerKN, 0);
                            if (viewState.nr() != null) {
                            }
                            if (ComposerKt.v()) {
                            }
                            function120 = function1312;
                            function121 = function1332;
                            function122 = function1342;
                            function123 = function1362;
                            function124 = function1372;
                            function125 = function1322;
                            composer2 = composerKN;
                            function126 = function1302;
                            function127 = function112;
                            function06 = function092;
                            function07 = function082;
                            bitmapLruCache3 = bitmapLruCache52;
                            function128 = function1352;
                            sceneThumbnailMaker2 = sceneThumbnailMaker42;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i33;
        i11 = i7 & 4096;
        if (i11 == 0) {
        }
        i13 = i7 & 8192;
        if (i13 == 0) {
        }
        i14 = i7 & 16384;
        if (i14 != 0) {
        }
        i15 = i7 & 32768;
        if (i15 != 0) {
        }
        i16 = i7 & 65536;
        if (i16 != 0) {
        }
        i17 = i7 & 131072;
        if (i17 != 0) {
        }
        i18 = i7 & 262144;
        if (i18 != 0) {
        }
        i19 = i7 & 524288;
        if (i19 != 0) {
        }
        i20 = i7 & 1048576;
        if (i20 != 0) {
        }
        i22 = i7 & 2097152;
        if (i22 != 0) {
        }
        int i3422 = i21;
        i23 = i7 & 4194304;
        if (i23 != 0) {
        }
        i27 = i7 & 8388608;
        if (i27 != 0) {
        }
        if ((i32 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Ik(final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(1176467857);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onClick) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1176467857, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.ExploreTemplatesCTA (ProjectListTab.kt:289)");
                }
                Arrangement arrangement = Arrangement.f17400n;
                float fKN = Dp.KN(18);
                Alignment.Companion companion = Alignment.INSTANCE;
                Arrangement.Horizontal horizontalHI = arrangement.HI(fKN, companion.Uo());
                Alignment.Vertical verticalXMQ = companion.xMQ();
                modifier3 = modifier4;
                float f3 = 12;
                Modifier modifierN = ClipKt.n(PaddingKt.xMQ(mA.w6.t(ClickableKt.J2(modifier3, false, null, null, onClick, 7, null), aD.w6.ER(), RoundedCornerShapeKt.t(Dp.KN(f3)), Dp.KN(2), Dp.KN(f3), Dp.KN(f3), 0, 32, null), Dp.KN(20)), RoundedCornerShapeKt.t(Dp.KN(f3)));
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalHI, verticalXMQ, composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
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
                Updater.O(composerN, measurePolicyRl, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composer2 = composerKN;
                TextKt.t(StringResources_androidKt.t(2132019024, composerKN, 6), null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).jB(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                IconKt.t(PainterResources_androidKt.t(2131231533, composer2, 6), null, PaddingKt.xMQ(BackgroundKt.t(SizeKt.Z(Modifier.INSTANCE, Dp.KN(52)), ((aF1.j) composer2.ty(aF1.w6.t())).ck(), RoundedCornerShapeKt.J2()), Dp.KN(f3)), aD.w6.EWS(), composer2, 3120, 0);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: zT.CN3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2498z.r(onClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i5 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Arrangement arrangement2 = Arrangement.f17400n;
            float fKN2 = Dp.KN(18);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalHI2 = arrangement2.HI(fKN2, companion3.Uo());
            Alignment.Vertical verticalXMQ2 = companion3.xMQ();
            modifier3 = modifier4;
            float f32 = 12;
            Modifier modifierN2 = ClipKt.n(PaddingKt.xMQ(mA.w6.t(ClickableKt.J2(modifier3, false, null, null, onClick, 7, null), aD.w6.ER(), RoundedCornerShapeKt.t(Dp.KN(f32)), Dp.KN(2), Dp.KN(f32), Dp.KN(f32), 0, 32, null), Dp.KN(20)), RoundedCornerShapeKt.t(Dp.KN(f32)));
            MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalHI2, verticalXMQ2, composerKN, 54);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion22.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                composer2 = composerKN;
                TextKt.t(StringResources_androidKt.t(2132019024, composerKN, 6), null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).jB(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                IconKt.t(PainterResources_androidKt.t(2131231533, composer2, 6), null, PaddingKt.xMQ(BackgroundKt.t(SizeKt.Z(Modifier.INSTANCE, Dp.KN(52)), ((aF1.j) composer2.ty(aF1.w6.t())).ck(), RoundedCornerShapeKt.J2()), Dp.KN(f32)), aD.w6.EWS(), composer2, 3120, 0);
                composer2.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(ProjectInfo.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(ProjectInfo.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, QTafcm.oZxtTxXqh);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(ProjectInfo.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(ProjectInfo.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(ProjectInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(c7r.j jVar, I28.j jVar2, List list, PagerState pagerState, List list2, six.CN3 cn3, boolean z2, List list3, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, Function0 function02, Function0 function03, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, int i2, int i3, int i5, int i7, Composer composer, int i8) {
        o(jVar, jVar2, list, pagerState, list2, cn3, z2, list3, function1, function12, function0, function13, function14, function15, function16, function17, function18, function19, function110, function111, function02, function03, bitmapLruCache, sceneThumbnailMaker, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), RecomposeScopeImplKt.n(i5), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(Function1 function1, List list, vd vdVar, PagerState pagerState, six.CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        GJW.C.nr(vdVar, null, null, new j(pagerState, list.indexOf(it), null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        Ik(function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final six.CN3 wTp(ProjectInfo projectInfo) {
        return six.CN3.f73281n.n(projectInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(State state) {
        return ((Dp) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp nY(Density density, MutableState mutableState) {
        return Dp.nr(density.bzg(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).getPackedValue() & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(I28.j jVar) {
        jVar.O();
        return Unit.INSTANCE;
    }
}
