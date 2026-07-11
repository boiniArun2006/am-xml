package cbf;

import GJW.vd;
import ajd.j;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import cbf.Dsr;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f43664O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43665n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ rB.Ml f43666t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(rB.Ml ml, Context context, Continuation continuation) {
            super(2, continuation);
            this.f43666t = ml;
            this.f43664O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f43666t, this.f43664O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43665n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rB.Ml ml = this.f43666t;
                Context context = this.f43664O;
                this.f43665n = 1;
                if (ml.rl(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f43667O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f43668n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f43669r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f43670t;

        n(Function0 function0, boolean z2, boolean z3, List list, Function1 function1) {
            this.f43668n = function0;
            this.f43670t = z2;
            this.f43667O = z3;
            this.J2 = list;
            this.f43669r = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            mutableState.setValue(it);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            final MutableState mutableState;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-663559233, i2, -1, "com.bendingspoons.secretmenu.spidersense.SpiderSenseUserRecognizerScreenContent.<anonymous> (SpiderSenseUserRecognizerScreen.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierUo = ScrollKt.Uo(BackgroundKt.nr(SizeKt.J2(companion, 0.0f, 1, null), Color.INSTANCE.KN(), null, 2, null), ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
            float f3 = 5;
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(f3));
            final Function0 function0 = this.f43668n;
            boolean z2 = this.f43670t;
            boolean z3 = this.f43667O;
            List list = this.J2;
            final Function1 function1 = this.f43669r;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composer, 54);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierUo);
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
            composer.eF(-1865947290);
            Object objIF = composer.iF();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objIF == companion3.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState2 = (MutableState) objIF;
            composer.Xw();
            composer.eF(-1865944769);
            boolean zP5 = composer.p5(function0);
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == companion3.n()) {
                objIF2 = new Function0() { // from class: cbf.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.n.O(function0);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            ButtonKt.n((Function0) objIF2, null, false, null, null, null, null, null, null, cbf.j.f43684n.n(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 510);
            float f4 = 15;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composer, 6);
            long jKN = TextUnitKt.KN(20);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.t("User Info", null, 0L, jKN, null, companion4.rl(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 199686, 0, 131030);
            TextKt.t("👉 isSpooner: " + z2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            TextKt.t("🌟 isPremium: " + z3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composer, 6);
            TextKt.t("Experiments", null, 0L, TextUnitKt.KN(20), null, companion4.rl(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 199686, 0, 131030);
            Composer composer2 = composer;
            if (list.isEmpty()) {
                composer2.eF(-2008968834);
                TextKt.t("No active experiments", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
                composer2 = composer;
                composer2.Xw();
            } else {
                composer2.eF(-2008899766);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TextKt.t("- " + ((String) it.next()), null, 0L, TextUnitKt.KN(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 3072, 0, 131062);
                    composer2 = composer;
                }
                composer2.Xw();
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composer2, 6);
            long jKN2 = TextUnitKt.KN(20);
            FontWeight.Companion companion6 = FontWeight.INSTANCE;
            TextKt.t("Send custom event", null, 0L, jKN2, null, companion6.rl(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 199686, 0, 131030);
            String str = (String) mutableState2.getValue();
            Modifier modifierKN = SizeKt.KN(companion5, 0.0f, 1, null);
            composer.eF(-1865904254);
            Object objIF3 = composer.iF();
            Composer.Companion companion7 = Composer.INSTANCE;
            if (objIF3 == companion7.n()) {
                mutableState = mutableState2;
                objIF3 = new Function1() { // from class: cbf.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Dsr.n.J2(mutableState, (String) obj);
                    }
                };
                composer.o(objIF3);
            } else {
                mutableState = mutableState2;
            }
            composer.Xw();
            cbf.j jVar = cbf.j.f43684n;
            final MutableState mutableState3 = mutableState;
            TextFieldKt.rl(str, (Function1) objIF3, modifierKN, false, false, null, null, jVar.rl(), null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, composer, 12583344, 0, 0, 8388472);
            composer.eF(-1865897823);
            boolean zP52 = composer.p5(function1);
            Object objIF4 = composer.iF();
            if (zP52 || objIF4 == companion7.n()) {
                objIF4 = new Function0() { // from class: cbf.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.n.Uo(function1, mutableState3);
                    }
                };
                composer.o(objIF4);
            }
            composer.Xw();
            ButtonKt.n((Function0) objIF4, null, !StringsKt.isBlank((CharSequence) mutableState3.getValue()), null, null, null, null, null, null, jVar.t(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 506);
            SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f4)), composer, 6);
            TextKt.t("Explanation", null, 0L, TextUnitKt.KN(20), null, companion6.rl(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 199686, 0, 131030);
            TextKt.t("This secret menu item allows you to send a custom event to the SpiderSense backend. Put a custom string (for example, your handle) in the TextField above and click \"Send event.\" The event will have \"spidersense_user_recognizer\" among its categories and the string you selected in the \"custom_string\" info.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(f3)), composer, 6);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function1 function1, MutableState mutableState) {
            function1.invoke(mutableState.getValue());
            mutableState.setValue("");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(rB.Ml ml, Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List listListOf = CollectionsKt.listOf("spidersense_user_recognizer");
        j.EnumC0481j enumC0481j = j.EnumC0481j.f13105t;
        pq.Ml ml2 = new pq.Ml();
        ml2.O("custom_string", StringsKt.trim((CharSequence) it).toString());
        Unit unit = Unit.INSTANCE;
        rB.I28.rl(ml, listListOf, enumC0481j, null, null, ml2, 12, null);
        Toast.makeText(context, "Event sent", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(rB.Ml ml, int i2, Composer composer, int i3) {
        O(ml, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void O(final rB.Ml spiderSense, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Composer composerKN = composer.KN(305801641);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(spiderSense) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(305801641, i3, -1, "com.bendingspoons.secretmenu.spidersense.SpiderSenseUserRecognizerScreen (SpiderSenseUserRecognizerScreen.kt:40)");
            }
            final Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF = compositionScopedCoroutineScopeCanceller;
            }
            final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
            composerKN.eF(32538890);
            boolean zE2 = composerKN.E2(spiderSense) | composerKN.E2(context);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: cbf.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Dsr.J2(spiderSense, context, (String) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            Function1 function1 = (Function1) objIF2;
            composerKN.Xw();
            composerKN.eF(32551584);
            boolean zE22 = composerKN.E2(coroutineScope) | composerKN.E2(spiderSense) | composerKN.E2(context);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function0() { // from class: cbf.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.Uo(coroutineScope, spiderSense, context);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            xMQ(function1, (Function0) objIF3, spiderSense.mUb(), spiderSense.Uo(), spiderSense.nr(), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: cbf.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.KN(spiderSense, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(vd vdVar, rB.Ml ml, Context context) {
        GJW.C.nr(vdVar, null, null, new j(ml, context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function1 function1, Function0 function0, boolean z2, boolean z3, List list, int i2, Composer composer, int i3) {
        xMQ(function1, function0, z2, z3, list, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(final Function1 function1, final Function0 function0, final boolean z2, final boolean z3, final List list, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(-1091432924);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(list) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1091432924, i3, -1, "com.bendingspoons.secretmenu.spidersense.SpiderSenseUserRecognizerScreenContent (SpiderSenseUserRecognizerScreen.kt:72)");
            }
            composer2 = composerKN;
            SurfaceKt.n(PaddingKt.xMQ(BackgroundKt.nr(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.KN(), null, 2, null), Dp.KN(16)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-663559233, true, new n(function0, z2, z3, list, function1), composerKN, 54), composer2, 12582918, 126);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: cbf.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.mUb(function1, function0, z2, z3, list, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
