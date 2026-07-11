package r;

import GJW.vd;
import HI0.rv6;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import r.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class qf {

    static final class j implements Function2 {
        final /* synthetic */ MutableState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f72700O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f72701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f72702o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ vd f72703r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f72704t;

        /* JADX INFO: renamed from: r.qf$j$j, reason: collision with other inner class name */
        static final class C1144j extends SuspendLambda implements Function2 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f72705O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f72706n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MutableState f72707r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f72708t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1144j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1144j(List list, Function1 function1, Function1 function12, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f72708t = list;
                this.f72705O = function1;
                this.J2 = function12;
                this.f72707r = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1144j(this.f72708t, this.f72705O, this.J2, this.f72707r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                float fO;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f72706n == 0) {
                    ResultKt.throwOnFailure(obj);
                    int size = qf.t(this.f72707r).size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C2348n c2348n = (C2348n) this.f72708t.get(i2);
                        String str = (String) qf.t(this.f72707r).get(i2);
                        if (Wre.o(c2348n, str) || str.length() == 0) {
                            MutableState mutableState = this.f72707r;
                            qf.nr(mutableState, rv6.t(qf.t(mutableState), i2, String.valueOf(Wre.Ik(c2348n, str))));
                            Function1 function1 = this.f72705O;
                            List listT = qf.t(this.f72707r);
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT, 10));
                            Iterator it = listT.iterator();
                            while (it.hasNext()) {
                                Float floatOrNull = StringsKt.toFloatOrNull((String) it.next());
                                if (floatOrNull != null) {
                                    fO = floatOrNull.floatValue();
                                } else {
                                    fO = c2348n.O();
                                }
                                arrayList.add(Boxing.boxFloat(fO));
                            }
                            function1.invoke(arrayList);
                        }
                    }
                    this.J2.invoke(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        j(List list, List list2, Function1 function1, MutableState mutableState, vd vdVar, Function1 function12) {
            this.f72701n = list;
            this.f72704t = list2;
            this.f72700O = function1;
            this.J2 = mutableState;
            this.f72703r = vdVar;
            this.f72702o = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(int i2, List list, Function1 function1, MutableState mutableState, C2348n c2348n, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            List mutableList = CollectionsKt.toMutableList((Collection) qf.t(mutableState));
            mutableList.set(i2, newValue);
            qf.nr(mutableState, CollectionsKt.toList(mutableList));
            int size = qf.t(mutableState).size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    C2348n c2348n2 = (C2348n) list.get(i3);
                    String str = (String) qf.t(mutableState).get(i3);
                    if (Wre.o(c2348n2, str) || str.length() == 0) {
                        break;
                    }
                    i3++;
                } else {
                    List listT = qf.t(mutableState);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT, 10));
                    Iterator it = listT.iterator();
                    while (it.hasNext()) {
                        Float floatOrNull = StringsKt.toFloatOrNull((String) it.next());
                        arrayList.add(Float.valueOf(floatOrNull != null ? floatOrNull.floatValue() : c2348n.O()));
                    }
                    function1.invoke(arrayList);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O() {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(vd vdVar, List list, Function1 function1, Function1 function12, MutableState mutableState) {
            GJW.C.nr(vdVar, null, null, new C1144j(list, function1, function12, mutableState, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            final C2348n c2348n;
            Object obj;
            final Function1 function1;
            final MutableState mutableState;
            final List list;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1229129957, i2, -1, "com.alightcreative.app.motion.numerickeypad.NumericKeypad.<anonymous> (NumericKeypad.kt:44)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MutableInteractionSource mutableInteractionSourceN = InteractionSourceKt.n();
            composer.eF(1391292456);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: r.nKK
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.j.O();
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierKN = SizeKt.KN(BackgroundKt.nr(SizeKt.xMQ(ClickableKt.nr(companion, mutableInteractionSourceN, null, false, null, null, (Function0) objIF, 28, null), Dp.KN(247)), ((aF1.j) composer.ty(aF1.w6.t())).n(), null, 2, null), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalN = arrangement.n();
            List list2 = this.f72701n;
            List list3 = this.f72704t;
            Function1 function12 = this.f72700O;
            MutableState mutableState2 = this.J2;
            vd vdVar = this.f72703r;
            Function1 function13 = this.f72702o;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalN, companion2.gh(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
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
            float f3 = 6;
            Function1 function14 = function12;
            vd vdVar2 = vdVar;
            MutableState mutableState3 = mutableState2;
            Function1 function15 = function13;
            Modifier modifierAz = PaddingKt.az(companion, Dp.KN(f3), 0.0f, Dp.KN(f3), 0.0f, 10, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.qie(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierAz);
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
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composer.eF(150493520);
            final int i3 = 0;
            for (Object obj2 : list2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C2348n c2348n2 = (C2348n) obj2;
                String str = (String) qf.t(mutableState3).get(i3);
                long value = ((Color) list3.get(i3)).getValue();
                composer.eF(-1411944877);
                boolean zT2 = composer.t(i3) | composer.E2(list2) | composer.p5(function14) | composer.p5(c2348n2);
                Object objIF2 = composer.iF();
                if (zT2 || objIF2 == Composer.INSTANCE.n()) {
                    c2348n = c2348n2;
                    function1 = function14;
                    mutableState = mutableState3;
                    list = list2;
                    obj = new Function1() { // from class: r.DAz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return qf.j.J2(i3, list, function1, mutableState, c2348n, (String) obj3);
                        }
                    };
                    composer.o(obj);
                } else {
                    mutableState = mutableState3;
                    list = list2;
                    c2348n = c2348n2;
                    obj = objIF2;
                    function1 = function14;
                }
                composer.Xw();
                List list4 = list3;
                vd vdVar3 = vdVar2;
                Function1 function16 = function15;
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                Wre.nr(rowScopeInstance2, c2348n, str, value, (Function1) obj, composer, 6);
                composer.eF(150536375);
                if (i3 < list.size() - 1) {
                    SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, Dp.KN(5)), composer, 6);
                }
                composer.Xw();
                rowScopeInstance = rowScopeInstance2;
                list2 = list;
                function14 = function1;
                mutableState3 = mutableState;
                list3 = list4;
                i3 = i5;
                vdVar2 = vdVar3;
                function15 = function16;
            }
            final Function1 function17 = function14;
            final vd vdVar4 = vdVar2;
            final MutableState mutableState4 = mutableState3;
            final Function1 function18 = function15;
            final List list5 = list2;
            composer.Xw();
            composer.XQ();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(12)), composer, 6);
            Modifier modifierGh = PaddingKt.gh(SizeKt.xMQ(SizeKt.KN(companion4, 0.0f, 1, null), Dp.KN(180)), Dp.KN(f3), 0.0f, 2, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierGh);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0 function0N3 = companion5.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N3);
            } else {
                composer.r();
            }
            Composer composerN3 = Updater.n(composer);
            Updater.O(composerN3, measurePolicyUo, companion5.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
            Function2 function2Rl3 = companion5.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion5.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composer.eF(150550290);
            boolean zE2 = composer.E2(vdVar4) | composer.E2(list5) | composer.p5(function17) | composer.p5(function18);
            Object objIF3 = composer.iF();
            if (zE2 || objIF3 == Composer.INSTANCE.n()) {
                Object obj3 = new Function0() { // from class: r.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.j.Uo(vdVar4, list5, function17, function18, mutableState4);
                    }
                };
                composer.o(obj3);
                objIF3 = obj3;
            }
            composer.Xw();
            AbstractC2350z.o((Function0) objIF3, composer, 0, 0);
            composer.XQ();
            SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN((float) 7.5d)), composer, 6);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(List list, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        rl(list, function1, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void rl(List fields, Function1 onValueChange, Function1 onDismiss, Composer composer, final int i2) {
        int i3;
        final List list;
        final Function1 function1;
        final Function1 function12;
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerKN = composer.KN(1733534299);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(fields) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onValueChange) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onDismiss) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            list = fields;
            function1 = onValueChange;
            function12 = onDismiss;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1733534299, i3, -1, "com.alightcreative.app.motion.numerickeypad.NumericKeypad (NumericKeypad.kt:33)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            vd vdVar = (vd) objIF;
            composerKN.eF(-1472864405);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fields, 10));
                Iterator it = fields.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Regex("\\.0$").replace(String.valueOf(((C2348n) it.next()).O()), ""));
                }
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(arrayList, null, 2, null);
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            list = fields;
            function1 = onValueChange;
            function12 = onDismiss;
            CompositionLocalKt.rl(CompositionLocalsKt.r().nr(new Z()), ComposableLambdaKt.nr(-1229129957, true, new j(list, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(((aF1.j) composerKN.ty(aF1.w6.t())).nr()), Color.xMQ(((aF1.j) composerKN.ty(aF1.w6.t())).HI()), Color.xMQ(((aF1.j) composerKN.ty(aF1.w6.t())).Uo())}), function1, (MutableState) objIF2, vdVar, function12), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r.Ew
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.O(list, function1, function12, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, List list) {
        mutableState.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(MutableState mutableState) {
        return (List) mutableState.getValue();
    }
}
