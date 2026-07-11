package mb8;

import Dj7.CM;
import Dj7.QaP;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.account.PurchasePeriod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mb8.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f70817O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f70818n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f70819t;

        /* JADX INFO: renamed from: mb8.fuX$j$j, reason: collision with other inner class name */
        static final class C1059j extends SuspendLambda implements Function2 {
            final /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f70820O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70821n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Animatable f70822r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MutableIntState f70823t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1059j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1059j(MutableIntState mutableIntState, List list, int i2, Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.f70823t = mutableIntState;
                this.f70820O = list;
                this.J2 = i2;
                this.f70822r = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1059j(this.f70823t, this.f70820O, this.J2, this.f70822r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f70821n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.f70822r;
                    Float fBoxFloat = Boxing.boxFloat((this.f70823t.J2() / this.f70820O.size()) * this.J2);
                    this.f70821n = 1;
                    if (Animatable.J2(animatable, fBoxFloat, null, null, null, this, 14, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableIntState f70824O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70825n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f70826r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Animatable f70827t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Animatable animatable, MutableIntState mutableIntState, List list, int i2, Continuation continuation) {
                super(2, continuation);
                this.f70827t = animatable;
                this.f70824O = mutableIntState;
                this.J2 = list;
                this.f70826r = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f70827t, this.f70824O, this.J2, this.f70826r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f70825n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.f70827t;
                    Float fBoxFloat = Boxing.boxFloat((this.f70824O.J2() / this.J2.size()) * this.f70826r);
                    this.f70825n = 1;
                    if (animatable.XQ(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(List list, int i2, Function1 function1) {
            this.f70818n = list;
            this.f70819t = i2;
            this.f70817O = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            Function1 function1;
            vd vdVar;
            List list;
            Animatable animatable;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-393598748, i2, -1, "com.alightcreative.monetization.ui.components.switches.LargeComparisonSwitch.<anonymous> (ComparisonSwitch.kt:74)");
            }
            composer.eF(1674342860);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                composer.o(objIF);
            }
            Animatable animatable2 = (Animatable) objIF;
            composer.Xw();
            composer.eF(1674344434);
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotIntStateKt.n(0);
                composer.o(objIF2);
            }
            MutableIntState mutableIntState = (MutableIntState) objIF2;
            composer.Xw();
            composer.eF(1674346162);
            Object objIF3 = composer.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotIntStateKt.n(0);
                composer.o(objIF3);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objIF3;
            composer.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWPU = fuX.WPU(PaddingKt.mUb(SizeKt.KN(companion2, 0.0f, 1, null), Dp.KN(5), Dp.KN(4)), mutableIntState, mutableIntState2);
            List list2 = this.f70818n;
            int i3 = this.f70819t;
            Function1 function12 = this.f70817O;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierWPU);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyUo, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            List list3 = list2;
            Function1 function13 = function12;
            boolean z2 = true;
            fuX.qie(BoxScopeInstance.f17448n, mutableIntState.J2(), mutableIntState2.J2(), ((Number) animatable2.ty()).floatValue(), list2.size(), aD.w6.nHg(), composer, 196614);
            Composer composer2 = composer;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.KN(companion2, 0.0f, 1, null), Color.INSTANCE.J2(), null, 2, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion3.qie(), composer2, 0);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierNr);
            Function0 function0N2 = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyRl, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Object objIF4 = composer2.iF();
            if (objIF4 == companion.n()) {
                objIF4 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2);
                composer2.o(objIF4);
            }
            final vd vdVar2 = (vd) objIF4;
            composer2.eF(2024546722);
            final int i5 = 0;
            for (Object obj : list3) {
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                R5.Wre wre = (R5.Wre) obj;
                Modifier modifierGh = SizeKt.gh(RowScope.rl(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.KN(56), 0.0f, 2, null);
                boolean z3 = i3 == i5 ? z2 : false;
                long jDR0 = aD.w6.dR0();
                composer2.eF(78778818);
                final List list4 = list3;
                boolean zP5 = composer2.p5(function13) | composer2.t(i5) | composer2.E2(vdVar2) | composer2.E2(list4) | composer2.E2(animatable2);
                Object objIF5 = composer2.iF();
                if (zP5 || objIF5 == Composer.INSTANCE.n()) {
                    final Animatable animatable3 = animatable2;
                    final Function1 function14 = function13;
                    Function0 function0 = new Function0() { // from class: mb8.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return fuX.j.t(function14, i5, vdVar2, mutableIntState2, list4, animatable3);
                        }
                    };
                    function1 = function14;
                    vdVar = vdVar2;
                    list = list4;
                    animatable = animatable3;
                    composer2.o(function0);
                    objIF5 = function0;
                } else {
                    list = list4;
                    vdVar = vdVar2;
                    function1 = function13;
                    animatable = animatable2;
                }
                Function0 function02 = (Function0) objIF5;
                composer2.Xw();
                Composer composer3 = composer2;
                fuX.Uo(modifierGh, z3, wre, true, jDR0, function02, composer3, 27648);
                composer2 = composer3;
                animatable2 = animatable;
                i5 = i7;
                list3 = list;
                function13 = function1;
                vdVar2 = vdVar;
                z2 = true;
            }
            Composer composer4 = composer2;
            Animatable animatable4 = animatable2;
            composer4.Xw();
            composer4.XQ();
            composer4.XQ();
            Unit unit = Unit.INSTANCE;
            composer4.eF(1674402377);
            boolean zE2 = composer4.E2(animatable4) | composer4.E2(this.f70818n) | composer4.t(this.f70819t);
            List list5 = this.f70818n;
            int i8 = this.f70819t;
            Object objIF6 = composer4.iF();
            if (zE2 || objIF6 == Composer.INSTANCE.n()) {
                n nVar = new n(animatable4, mutableIntState2, list5, i8, null);
                composer4.o(nVar);
                objIF6 = nVar;
            }
            composer4.Xw();
            EffectsKt.O(unit, (Function2) objIF6, composer4, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, int i2, vd vdVar, MutableIntState mutableIntState, List list, Animatable animatable) {
            function1.invoke(Integer.valueOf(i2));
            GJW.C.nr(vdVar, null, null, new C1059j(mutableIntState, list, i2, animatable, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f70828O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f70829n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f70830t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f70831O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70832n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Animatable f70833r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MutableIntState f70834t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(MutableIntState mutableIntState, List list, int i2, Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.f70834t = mutableIntState;
                this.f70831O = list;
                this.J2 = i2;
                this.f70833r = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f70834t, this.f70831O, this.J2, this.f70833r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f70832n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.f70833r;
                    Float fBoxFloat = Boxing.boxFloat((this.f70834t.J2() / this.f70831O.size()) * this.J2);
                    this.f70832n = 1;
                    if (animatable.XQ(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: mb8.fuX$n$n, reason: collision with other inner class name */
        static final class C1060n extends SuspendLambda implements Function2 {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableIntState f70835O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f70836n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f70837r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Animatable f70838t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1060n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1060n(Animatable animatable, MutableIntState mutableIntState, List list, int i2, Continuation continuation) {
                super(2, continuation);
                this.f70838t = animatable;
                this.f70835O = mutableIntState;
                this.J2 = list;
                this.f70837r = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1060n(this.f70838t, this.f70835O, this.J2, this.f70837r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f70836n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.f70838t;
                    Float fBoxFloat = Boxing.boxFloat((this.f70835O.J2() / this.J2.size()) * this.f70837r);
                    this.f70836n = 1;
                    if (animatable.XQ(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        n(List list, int i2, Function1 function1) {
            this.f70829n = list;
            this.f70830t = i2;
            this.f70828O = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, int i2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            mutableState.setValue(fuX.Z((List) mutableState.getValue(), i2, (int) (it.n() >> 32)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            Function1 function1;
            vd vdVar;
            MutableIntState mutableIntState;
            List list;
            Animatable animatable;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1196888071, i2, -1, "com.alightcreative.monetization.ui.components.switches.SmallComparisonSwitch.<anonymous> (ComparisonSwitch.kt:149)");
            }
            composer.eF(-248277448);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                composer.o(objIF);
            }
            Animatable animatable2 = (Animatable) objIF;
            composer.Xw();
            composer.eF(-248275874);
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotIntStateKt.n(0);
                composer.o(objIF2);
            }
            MutableIntState mutableIntState2 = (MutableIntState) objIF2;
            composer.Xw();
            composer.eF(-248274146);
            Object objIF3 = composer.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotIntStateKt.n(0);
                composer.o(objIF3);
            }
            MutableIntState mutableIntState3 = (MutableIntState) objIF3;
            composer.Xw();
            composer.eF(-248272109);
            List list2 = this.f70829n;
            Object objIF4 = composer.iF();
            if (objIF4 == companion.n()) {
                int size = list2.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(0);
                }
                objIF4 = SnapshotStateKt__SnapshotStateKt.O(arrayList, null, 2, null);
                composer.o(objIF4);
            }
            final MutableState mutableState = (MutableState) objIF4;
            composer.Xw();
            composer.eF(-248267479);
            Object objIF5 = composer.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF5 == companion2.n()) {
                objIF5 = SnapshotStateKt.O(new Function0() { // from class: mb8.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(fuX.n.Uo(mutableState));
                    }
                });
                composer.o(objIF5);
            }
            State state = (State) objIF5;
            composer.Xw();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWPU = fuX.WPU(PaddingKt.xMQ(companion3, Dp.KN(2)), mutableIntState2, mutableIntState3);
            List list3 = this.f70829n;
            int i5 = this.f70830t;
            Function1 function12 = this.f70828O;
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierWPU);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion5.n();
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
            Updater.O(composerN, measurePolicyUo, companion5.t());
            Updater.O(composerN, compositionLocalMapIk, companion5.O());
            Function2 function2Rl = companion5.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion5.nr());
            List list4 = list3;
            MutableIntState mutableIntState4 = mutableIntState3;
            fuX.qie(BoxScopeInstance.f17448n, mutableIntState2.J2(), mutableIntState3.J2(), ((Number) animatable2.ty()).floatValue(), list3.size(), aD.w6.dR0(), composer, 196614);
            Composer composer2 = composer;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.X(companion3, null, false, 3, null), Color.INSTANCE.J2(), null, 2, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion4.qie(), composer2, 0);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierNr);
            Function0 function0N2 = companion5.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyRl, companion5.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
            Function2 function2Rl2 = companion5.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion5.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Object objIF6 = composer2.iF();
            if (objIF6 == companion2.n()) {
                objIF6 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2);
                composer2.o(objIF6);
            }
            final vd vdVar2 = (vd) objIF6;
            composer2.eF(827111973);
            final int i7 = 0;
            for (Object obj : list4) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                R5.Wre wre = (R5.Wre) obj;
                Modifier.Companion companion6 = Modifier.INSTANCE;
                composer2.eF(-277894095);
                boolean zT2 = composer2.t(i7);
                Object objIF7 = composer2.iF();
                if (zT2 || objIF7 == Composer.INSTANCE.n()) {
                    objIF7 = new Function1() { // from class: mb8.aC
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return fuX.n.J2(mutableState, i7, (LayoutCoordinates) obj2);
                        }
                    };
                    composer2.o(objIF7);
                }
                composer2.Xw();
                Modifier modifierG = SizeKt.g(OnPlacedModifierKt.n(companion6, (Function1) objIF7), Dp.nr(((Density) composer2.ty(CompositionLocalsKt.J2())).rV9(((Number) state.getValue()).intValue())).getValue(), 0.0f, 2, null);
                boolean z2 = i5 == i7;
                long jXw = aD.w6.Xw();
                composer2.eF(-277875061);
                final List list5 = list4;
                boolean zP5 = composer2.p5(function12) | composer2.t(i7) | composer2.E2(vdVar2) | composer2.E2(list5) | composer2.E2(animatable2);
                Object objIF8 = composer2.iF();
                if (zP5 || objIF8 == Composer.INSTANCE.n()) {
                    final Animatable animatable3 = animatable2;
                    final Function1 function13 = function12;
                    final MutableIntState mutableIntState5 = mutableIntState4;
                    Function0 function0 = new Function0() { // from class: mb8.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return fuX.n.O(function13, i7, vdVar2, mutableIntState5, list5, animatable3);
                        }
                    };
                    function1 = function13;
                    vdVar = vdVar2;
                    mutableIntState = mutableIntState5;
                    list = list5;
                    animatable = animatable3;
                    composer2.o(function0);
                    objIF8 = function0;
                } else {
                    mutableIntState = mutableIntState4;
                    list = list5;
                    vdVar = vdVar2;
                    function1 = function12;
                    animatable = animatable2;
                }
                composer2.Xw();
                Composer composer3 = composer2;
                fuX.Uo(modifierG, z2, wre, false, jXw, (Function0) objIF8, composer3, 27648);
                composer2 = composer3;
                animatable2 = animatable;
                i7 = i8;
                mutableIntState4 = mutableIntState;
                list4 = list;
                function12 = function1;
                vdVar2 = vdVar;
            }
            MutableIntState mutableIntState6 = mutableIntState4;
            Animatable animatable4 = animatable2;
            composer2.Xw();
            composer2.XQ();
            composer2.XQ();
            Unit unit = Unit.INSTANCE;
            composer2.eF(-248204107);
            boolean zE2 = composer2.E2(animatable4) | composer2.E2(this.f70829n) | composer2.t(this.f70830t);
            List list6 = this.f70829n;
            int i9 = this.f70830t;
            Object objIF9 = composer2.iF();
            if (zE2 || objIF9 == Composer.INSTANCE.n()) {
                objIF9 = new C1060n(animatable4, mutableIntState6, list6, i9, null);
                composer2.o(objIF9);
            }
            composer2.Xw();
            EffectsKt.O(unit, (Function2) objIF9, composer2, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, int i2, vd vdVar, MutableIntState mutableIntState, List list, Animatable animatable) {
            function1.invoke(Integer.valueOf(i2));
            GJW.C.nr(vdVar, null, null, new j(mutableIntState, list, i2, animatable, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int Uo(MutableState mutableState) {
            return ((Number) CollectionsKt.maxOrThrow((Iterable<Double>) mutableState.getValue())).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(List list, int i2, Function1 function1, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        ty(list, i2, function1, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Modifier modifier, boolean z2, R5.Wre wre, boolean z3, long j2, Function0 function0, int i2, Composer composer, int i3) {
        Uo(modifier, z2, wre, z3, j2, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final Modifier modifier, final boolean z2, final R5.Wre wre, final boolean z3, final long j2, Function0 function0, Composer composer, final int i2) {
        int i3;
        R5.Wre wre2;
        long j3;
        final Function0 function02;
        Composer composer2;
        Composer composerKN = composer.KN(-2111305821);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            wre2 = wre;
            i3 |= composerKN.p5(wre2) ? 256 : 128;
        } else {
            wre2 = wre;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            j3 = j2;
            i3 |= composerKN.nr(j3) ? 16384 : 8192;
        } else {
            j3 = j2;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function0) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            function02 = function0;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2111305821, i3, -1, "com.alightcreative.monetization.ui.components.switches.ComparisonItem (ComparisonSwitch.kt:248)");
            }
            Modifier modifierN = ClipKt.n(BackgroundKt.t(modifier, Color.INSTANCE.J2(), RoundedCornerShapeKt.n(50)), RoundedCornerShapeKt.n(50));
            composerKN.eF(-1679456619);
            boolean z4 = (458752 & i3) == 131072;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                function02 = function0;
                objIF = new Function0() { // from class: mb8.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.xMQ(function02);
                    }
                };
                composerKN.o(objIF);
            } else {
                function02 = function0;
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.O(), false);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierMUb = PaddingKt.mUb(Modifier.INSTANCE, Dp.KN(20), Dp.KN(8));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb);
            Function0 function0N2 = companion2.n();
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
            Updater.O(composerN2, measurePolicyN, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            long jDR0 = !z2 ? aD.w6.dR0() : j3;
            String strS = S(wre2.ty(), composerKN, 0);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iN3 = companion3.n();
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strS, null, jDR0, 0L, null, null, null, 0L, null, TextAlign.KN(iN3), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).XQ(), composerKN, 0, 0, 65018);
            composerKN.eF(774874774);
            if (z3) {
                CM.xMQ(XQ(wre.ty(), wre.O(), composerKN, 0), null, aD.w6.N(), TextAlign.KN(companion3.n()), jVar.rl(composerKN, 6).Ik(), CollectionsKt.listOf(new QaP(TtmlNode.BOLD, new P0j.Dsr(false, false, false, true, false, null, 0L, null, 247, null))), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                composer2 = composerKN;
            } else {
                composer2 = composerKN;
            }
            composer2.Xw();
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function03 = function02;
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.KN(modifier, z2, wre, z3, j2, function03, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier WPU(Modifier modifier, final MutableState mutableState, final MutableState mutableState2) {
        return OnGloballyPositionedModifierKt.n(modifier, new Function1() { // from class: mb8.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.aYN(mutableState, mutableState2, (LayoutCoordinates) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(MutableState mutableState, MutableState mutableState2, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        long jN = it.n();
        mutableState.setValue(Integer.valueOf((int) (4294967295L & jN)));
        mutableState2.setValue(Integer.valueOf((int) (jN >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(BoxScope boxScope, int i2, int i3, float f3, int i5, long j2, int i7, Composer composer, int i8) {
        qie(boxScope, i2, i3, f3, i5, j2, composer, RecomposeScopeImplKt.n(i7 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(List list, int i2, Function1 function1, int i3, Composer composer, int i5) {
        mUb(list, i2, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final void mUb(final List tierSubscriptionItems, final int i2, final Function1 onSubscriptionClicked, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(tierSubscriptionItems, "tierSubscriptionItems");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Composer composerKN = composer.KN(716253697);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.E2(tierSubscriptionItems) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSubscriptionClicked) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(716253697, i5, -1, "com.alightcreative.monetization.ui.components.switches.LargeComparisonSwitch (ComparisonSwitch.kt:68)");
            }
            CardKt.n(null, RoundedCornerShapeKt.n(50), aD.w6.e(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-393598748, true, new j(tierSubscriptionItems, i2, onSubscriptionClicked), composerKN, 54), composerKN, 1769856, 25);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.gh(tierSubscriptionItems, i2, onSubscriptionClicked, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(final BoxScope boxScope, final int i2, final int i3, final float f3, final int i5, final long j2, Composer composer, final int i7) {
        int i8;
        Composer composer2;
        Composer composerKN = composer.KN(-995256073);
        if ((i7 & 6) == 0) {
            i8 = (composerKN.p5(boxScope) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.t(i3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= composerKN.rl(f3) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= composerKN.t(i5) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= composerKN.nr(j2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-995256073, i8, -1, "com.alightcreative.monetization.ui.components.switches.SelectedCheckboxCover (ComparisonSwitch.kt:227)");
            }
            composer2 = composerKN;
            CardKt.n(boxScope.n(OffsetKt.t(SizeKt.ViF(SizeKt.xMQ(Modifier.INSTANCE, ((Density) composerKN.ty(CompositionLocalsKt.J2())).rV9(i2)), Dp.KN(((Density) composerKN.ty(CompositionLocalsKt.J2())).rV9(i3) / i5)), ((Density) composerKN.ty(CompositionLocalsKt.J2())).bzg(f3), 0.0f, 2, null), Alignment.INSTANCE.KN()), RoundedCornerShapeKt.n(50), j2, 0L, null, 0.0f, o.f70848n.n(), composer2, ((i8 >> 9) & 896) | 1572864, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mb8.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.az(boxScope, i2, i3, f3, i5, j2, i7, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final List tierSubscriptionItems, final int i2, final Function1 onSubscriptionClicked, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(tierSubscriptionItems, "tierSubscriptionItems");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Composer composerKN = composer.KN(1993539466);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(tierSubscriptionItems) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(onSubscriptionClicked) ? 256 : 128;
        }
        int i8 = i5 & 8;
        if (i8 == 0) {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i7 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1993539466, i7, -1, "com.alightcreative.monetization.ui.components.switches.SmallComparisonSwitch (ComparisonSwitch.kt:142)");
                }
                CardKt.n(modifier4, RoundedCornerShapeKt.n(50), aD.w6.E2(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(1196888071, true, new n(tierSubscriptionItems, i2, onSubscriptionClicked), composerKN, 54), composerKN, ((i7 >> 9) & 14) | 1769856, 24);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: mb8.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return fuX.HI(tierSubscriptionItems, i2, onSubscriptionClicked, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 3072;
        modifier2 = modifier;
        if ((i7 & 1171) == 1170) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            CardKt.n(modifier4, RoundedCornerShapeKt.n(50), aD.w6.E2(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(1196888071, true, new n(tierSubscriptionItems, i2, onSubscriptionClicked), composerKN, 54), composerKN, ((i7 >> 9) & 14) | 1769856, 24);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final String S(PurchasePeriod purchasePeriod, Composer composer, int i2) {
        String strT;
        composer.eF(-61131086);
        if (ComposerKt.v()) {
            ComposerKt.p5(-61131086, i2, -1, "com.alightcreative.monetization.ui.components.switches.getTitle (ComparisonSwitch.kt:292)");
        }
        PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
        if (Intrinsics.areEqual(purchasePeriod, companion.t())) {
            composer.eF(1812367578);
            strT = StringResources_androidKt.t(2132019863, composer, 6);
            composer.Xw();
        } else if (Intrinsics.areEqual(purchasePeriod, companion.n())) {
            composer.eF(1812370363);
            strT = StringResources_androidKt.t(2132019856, composer, 6);
            composer.Xw();
        } else {
            composer.eF(1812372538);
            strT = StringResources_androidKt.t(2132019862, composer, 6);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strT;
    }

    private static final String XQ(PurchasePeriod purchasePeriod, String str, Composer composer, int i2) {
        String strNr;
        composer.eF(1014334610);
        if (ComposerKt.v()) {
            ComposerKt.p5(1014334610, i2, -1, "com.alightcreative.monetization.ui.components.switches.getPrice (ComparisonSwitch.kt:300)");
        }
        PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
        if (Intrinsics.areEqual(purchasePeriod, companion.t())) {
            composer.eF(-1490400771);
            strNr = StringResources_androidKt.nr(2132017498, new Object[]{str}, composer, 6);
            composer.Xw();
        } else if (Intrinsics.areEqual(purchasePeriod, companion.n())) {
            composer.eF(-1490397410);
            strNr = StringResources_androidKt.nr(2132017496, new Object[]{str}, composer, 6);
            composer.Xw();
        } else {
            composer.eF(-1490394659);
            strNr = StringResources_androidKt.nr(2132017497, new Object[]{str}, composer, 6);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return strNr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Z(List list, int i2, int i3) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (mutableList.size() <= i2) {
            int size = (i2 - mutableList.size()) + 1;
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(0);
            }
            CollectionsKt.addAll(mutableList, arrayList);
        }
        mutableList.set(i2, Integer.valueOf(i3));
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
