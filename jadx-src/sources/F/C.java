package F;

import Dj7.AbstractC1329m;
import Dj7.u;
import F.C;
import MO.z;
import NBO.j;
import NBO.n;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import jOL.w6;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class C {

    static final class j implements Function2 {
        final /* synthetic */ z E2;
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ Function3 f2440N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f2441O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ z f2442S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ MutableState f2443T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ MutableState f2444X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f2445Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f2446e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f2447g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f2448n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f2449o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f2450r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f2451t;

        j(boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z4, z zVar, z zVar2, z zVar3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Function3 function3) {
            this.f2448n = z2;
            this.f2451t = z3;
            this.f2441O = function0;
            this.J2 = function02;
            this.f2450r = function03;
            this.f2449o = function1;
            this.f2445Z = z4;
            this.f2442S = zVar;
            this.f2447g = zVar2;
            this.E2 = zVar3;
            this.f2446e = mutableState;
            this.f2444X = mutableState2;
            this.f2443T = mutableState3;
            this.f2440N = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C.mUb(mutableState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(Function0 function0, Function0 function02, String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            if (Intrinsics.areEqual(id, "ranking")) {
                function0.invoke();
            } else if (Intrinsics.areEqual(id, "my-account")) {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
            Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
            FocusManager.qie(focusManager, false, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C.KN(mutableState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C.J2(mutableState, it);
            return Unit.INSTANCE;
        }

        public final void Uo(Composer composer, int i2) {
            final MutableState mutableState;
            final MutableState mutableState2;
            final MutableState mutableState3;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1857730693, i2, -1, "com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileContent.<anonymous> (EditProfileScreen.kt:103)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(companion, 0.0f, 1, null), aD.w6.z(), null, 2, null);
            Function0 function0 = this.f2450r;
            boolean z2 = this.f2445Z;
            z zVar = this.f2442S;
            z zVar2 = this.f2447g;
            z zVar3 = this.E2;
            MutableState mutableState4 = this.f2446e;
            MutableState mutableState5 = this.f2444X;
            MutableState mutableState6 = this.f2443T;
            final Function3 function3 = this.f2440N;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
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
            Dj7.Wre.rl(aD.w6.z(), composer, 6);
            jOL.fuX.Uo(null, StringResources_androidKt.t(2132017635, composer, 6), jOL.j.f69432n, jOL.Dsr.f69411n, new w6.j(2131231603, false, function0, 2, null), null, 0.0f, composer, 3456, 97);
            float f3 = 16;
            TextKt.t(StringResources_androidKt.t(z2 ? 2132017606 : 2132017608, composer, 0), PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).N(), composer, 432, 0, 65528);
            Modifier modifierUo = ScrollKt.Uo(PaddingKt.gh(ColumnScope.rl(columnScopeInstance, companion, 1.0f, false, 2, null), Dp.KN(f3), 0.0f, 2, null), ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierUo);
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
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(48)), composer, 6);
            String strO = C.O(mutableState4);
            String str = "@" + StringResources_androidKt.t(2132017611, composer, 6);
            String strT = StringResources_androidKt.t(2132017610, composer, 6);
            composer.eF(1930990085);
            String strT2 = zVar == null ? null : StringResources_androidKt.t(zVar.rl(), composer, 0);
            composer.Xw();
            eO eOVar = new eO();
            KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
            int iKN = companion4.KN();
            ImeAction.Companion companion5 = ImeAction.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, iKN, companion5.nr(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            composer.eF(1930979057);
            Object objIF = composer.iF();
            Composer.Companion companion6 = Composer.INSTANCE;
            if (objIF == companion6.n()) {
                mutableState = mutableState4;
                objIF = new Function1() { // from class: F.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.j.xMQ(mutableState, (String) obj);
                    }
                };
                composer.o(objIF);
            } else {
                mutableState = mutableState4;
            }
            composer.Xw();
            final MutableState mutableState7 = mutableState;
            u.qz.nr(strO, (Function1) objIF, null, str, 2131231809, strT, null, strT2, null, null, null, null, null, null, keyboardOptions, null, eOVar, composer, 24624, 24576, 48964);
            float f4 = 32;
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f4)), composer, 6);
            String strUo = C.Uo(mutableState5);
            String str2 = "@" + StringResources_androidKt.t(2132017611, composer, 6);
            String strT3 = StringResources_androidKt.t(2132017605, composer, 6);
            composer.eF(1931017221);
            String strT4 = zVar2 == null ? null : StringResources_androidKt.t(zVar2.rl(), composer, 0);
            composer.Xw();
            eO eOVar2 = new eO();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion4.KN(), companion5.nr(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            composer.eF(1931005812);
            Object objIF2 = composer.iF();
            if (objIF2 == companion6.n()) {
                mutableState2 = mutableState5;
                objIF2 = new Function1() { // from class: F.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.j.mUb(mutableState2, (String) obj);
                    }
                };
                composer.o(objIF2);
            } else {
                mutableState2 = mutableState5;
            }
            composer.Xw();
            final MutableState mutableState8 = mutableState2;
            u.qz.nr(strUo, (Function1) objIF2, null, str2, 2131231808, strT3, null, strT4, null, null, null, null, null, null, keyboardOptions2, null, eOVar2, composer, 24624, 24576, 48964);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f4)), composer, 6);
            final FocusManager focusManager = (FocusManager) composer.ty(CompositionLocalsKt.Uo());
            String strXMQ = C.xMQ(mutableState6);
            String str3 = "@" + StringResources_androidKt.t(2132017611, composer, 6);
            String strT5 = StringResources_androidKt.t(2132017613, composer, 6);
            composer.eF(1931045989);
            String strT6 = zVar3 == null ? null : StringResources_androidKt.t(zVar3.rl(), composer, 0);
            composer.Xw();
            eO eOVar3 = new eO();
            KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, companion4.KN(), companion5.rl(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            composer.eF(1931058455);
            boolean zE2 = composer.E2(focusManager);
            Object objIF3 = composer.iF();
            if (zE2 || objIF3 == companion6.n()) {
                objIF3 = new Function1() { // from class: F.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.j.gh(focusManager, (KeyboardActionScope) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objIF3, null, null, null, null, null, 62, null);
            composer.eF(1931034834);
            Object objIF4 = composer.iF();
            if (objIF4 == companion6.n()) {
                mutableState3 = mutableState6;
                objIF4 = new Function1() { // from class: F.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.j.KN(mutableState3, (String) obj);
                    }
                };
                composer.o(objIF4);
            } else {
                mutableState3 = mutableState6;
            }
            composer.Xw();
            final MutableState mutableState9 = mutableState3;
            u.qz.nr(strXMQ, (Function1) objIF4, null, str3, 2131231810, strT5, null, strT6, null, null, null, null, null, null, keyboardOptions3, keyboardActions, eOVar3, composer, 24624, 24576, 16196);
            composer.XQ();
            Modifier modifierXMQ = PaddingKt.xMQ(companion, Dp.KN(f3));
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierXMQ);
            Function0 function0N3 = companion3.n();
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
            Updater.O(composerN3, measurePolicyUo, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            String strT7 = StringResources_androidKt.t(z2 ? 2132017617 : 2132017607, composer, 0);
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            boolean z3 = (StringsKt.isBlank(C.O(mutableState7)) && StringsKt.isBlank(C.Uo(mutableState8)) && StringsKt.isBlank(C.xMQ(mutableState9))) ? false : true;
            composer.eF(1931077974);
            boolean zP5 = composer.p5(function3);
            Object objIF5 = composer.iF();
            if (zP5 || objIF5 == companion6.n()) {
                objIF5 = new Function0() { // from class: F.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C.j.qie(function3, mutableState7, mutableState8, mutableState9);
                    }
                };
                composer.o(objIF5);
            }
            composer.Xw();
            Dj7.eO.J2((Function0) objIF5, strT7, modifierKN, null, null, null, 0, 0, 0.0f, null, null, null, z3, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 4088);
            composer.XQ();
            composer.XQ();
            u.rl(this.f2448n, 0L, composer, 0, 2);
            if (this.f2451t) {
                List listListOf = CollectionsKt.listOf((Object[]) new NBO.n[]{new n.C0236n(2131231319), new n.w6(StringResources_androidKt.t(2132017621, composer, 6)), new n.j(StringResources_androidKt.t(2132017620, composer, 6))});
                List listListOf2 = CollectionsKt.listOf((Object[]) new j.C0235j[]{new j.C0235j("ranking", StringResources_androidKt.t(2132017626, composer, 6), Dj7.CN3.f1597n), new j.C0235j("my-account", StringResources_androidKt.t(2132017616, composer, 6), Dj7.CN3.f1593O)});
                composer.eF(-1406341680);
                boolean zP52 = composer.p5(this.f2441O) | composer.p5(this.J2);
                final Function0 function02 = this.f2441O;
                final Function0 function03 = this.J2;
                Object objIF6 = composer.iF();
                if (zP52 || objIF6 == companion6.n()) {
                    objIF6 = new Function1() { // from class: F.aC
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.j.az(function02, function03, (String) obj);
                        }
                    };
                    composer.o(objIF6);
                }
                composer.Xw();
                AbstractC1329m.xMQ(true, listListOf, listListOf2, (Function1) objIF6, this.f2450r, this.f2449o, composer, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uo((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(Function3 function3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
            function3.invoke(StringsKt.trim((CharSequence) C.O(mutableState)).toString(), StringsKt.trim((CharSequence) C.Uo(mutableState2)).toString(), StringsKt.trim((CharSequence) C.xMQ(mutableState3)).toString());
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f2452O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Xo f2453n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.app.motion.ranking.ui.editprofile.Wre f2454t;

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, com.alightcreative.app.motion.ranking.ui.editprofile.Wre.class, "onGoToMyAccountButtonClick", "onGoToMyAccountButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.ranking.ui.editprofile.Wre) this.receiver).S();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, com.alightcreative.app.motion.ranking.ui.editprofile.Wre.class, "onCloseButtonClick", "onCloseButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.ranking.ui.editprofile.Wre) this.receiver).o();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: F.C$n$n, reason: collision with other inner class name */
        /* synthetic */ class C0088n extends AdaptedFunctionReference implements Function3 {
            C0088n(Object obj) {
                super(3, obj, com.alightcreative.app.motion.ranking.ui.editprofile.Wre.class, "onConfirmButtonClick", "onConfirmButtonClick(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            }

            public final void n(String p0, String p1, String p2) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(p2, "p2");
                ((com.alightcreative.app.motion.ranking.ui.editprofile.Wre) this.receiver).Z(p0, p1, p2);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, com.alightcreative.app.motion.ranking.ui.editprofile.Wre.class, "onSeeTheRankingButtonClick", "onSeeTheRankingButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.ranking.ui.editprofile.Wre) this.receiver).WPU();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        n(Xo xo, com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre, Function1 function1) {
            this.f2453n = xo;
            this.f2454t = wre;
            this.f2452O = function1;
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
                ComposerKt.p5(1560150253, i2, -1, "com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileScreen.<anonymous> (EditProfileScreen.kt:61)");
            }
            boolean zMUb = this.f2453n.mUb();
            boolean zXMQ = this.f2453n.xMQ();
            boolean zGh = this.f2453n.gh();
            String strNr = this.f2453n.nr();
            z zVarUo = this.f2453n.Uo();
            String strT = this.f2453n.t();
            z zVarJ2 = this.f2453n.J2();
            String strO = this.f2453n.O();
            z zVarKN = this.f2453n.KN();
            com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre = this.f2454t;
            composer.eF(72721732);
            boolean zE2 = composer.E2(wre);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(wre);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre2 = this.f2454t;
            composer.eF(72723974);
            boolean zE22 = composer.E2(wre2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new C0088n(wre2);
                composer.o(objIF2);
            }
            Function3 function3 = (Function3) objIF2;
            composer.Xw();
            com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre3 = this.f2454t;
            composer.eF(72726476);
            boolean zE23 = composer.E2(wre3);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(wre3);
                composer.o(objIF3);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF3);
            com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre4 = this.f2454t;
            composer.eF(72729164);
            boolean zE24 = composer.E2(wre4);
            Object objIF4 = composer.iF();
            if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Ml(wre4);
                composer.o(objIF4);
            }
            composer.Xw();
            C.t(zMUb, zXMQ, zGh, strNr, zVarUo, strT, zVarJ2, strO, zVarKN, function0, function3, function02, (Function0) ((KFunction) objIF4), this.f2452O, composer, 0, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void gh(final com.alightcreative.app.motion.ranking.ui.editprofile.Wre viewModel, final Function1 getUriFromResource, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        Composer composerKN = composer.KN(1030603065);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(viewModel) : composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(getUriFromResource) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1030603065, i3, -1, "com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileScreen (EditProfileScreen.kt:57)");
            }
            Xo xo = (Xo) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            if (xo != null) {
                N.fuX.rl(ComposableLambdaKt.nr(1560150253, true, new n(xo, viewModel, getUriFromResource), composerKN, 54), composerKN, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: F.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.qie(viewModel, getUriFromResource, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(boolean z2, boolean z3, boolean z4, String str, z zVar, String str2, z zVar2, String str3, z zVar3, Function0 function0, Function3 function3, Function0 function02, Function0 function03, Function1 function1, int i2, int i3, Composer composer, int i5) {
        t(z2, z3, z4, str, zVar, str2, zVar2, str3, zVar3, function0, function3, function02, function03, function1, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(com.alightcreative.app.motion.ranking.ui.editprofile.Wre wre, Function1 function1, int i2, Composer composer, int i3) {
        gh(wre, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final boolean z2, final boolean z3, final boolean z4, final String str, final z zVar, final String str2, final z zVar2, final String str3, final z zVar3, final Function0 function0, final Function3 function3, final Function0 function02, final Function0 function03, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z5;
        boolean z6;
        z zVar4;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1908718084);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            z5 = z3;
            i5 |= composerKN.n(z5) ? 32 : 16;
        } else {
            z5 = z3;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z6 = z4;
            i5 |= composerKN.n(z6) ? 256 : 128;
        } else {
            z6 = z4;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            zVar4 = zVar;
            i5 |= composerKN.p5(zVar4) ? 16384 : 8192;
        } else {
            zVar4 = zVar;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerKN.p5(str2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.p5(zVar2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.p5(str3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.p5(zVar3) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.E2(function0) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(function3) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function02) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function03) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.E2(function1) ? 2048 : 1024;
        }
        int i9 = i7;
        if ((i5 & 306783379) == 306783378 && (i9 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1908718084, i5, i9, "com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileContent (EditProfileScreen.kt:97)");
            }
            composerKN.eF(-511025873);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                i8 = 2;
                objIF = SnapshotStateKt__SnapshotStateKt.O(str, null, 2, null);
                composerKN.o(objIF);
            } else {
                i8 = 2;
            }
            MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-511023310);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(str2, null, i8, null);
                composerKN.o(objIF2);
            }
            MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            composerKN.eF(-511020720);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(str3, null, i8, null);
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            H9N.CN3.nr(ComposableLambdaKt.nr(1857730693, true, new j(z5, z6, function02, function03, function0, function1, z2, zVar4, zVar2, zVar3, mutableState, mutableState2, (MutableState) objIF3, function3), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: F.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.nr(z2, z3, z4, str, zVar, str2, zVar2, str3, zVar3, function0, function3, function02, function03, function1, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(MutableState mutableState) {
        return (String) mutableState.getValue();
    }
}
