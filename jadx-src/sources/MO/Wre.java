package MO;

import Dj7.u;
import MO.Wre;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import cg.o;
import jOL.w6;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ eO f6568n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.app.motion.activities.creatorprogram.redeem.aC f6569t;

        /* JADX INFO: renamed from: MO.Wre$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0228j extends FunctionReferenceImpl implements Function0 {
            C0228j(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.creatorprogram.redeem.aC.class, "onCloseButtonClick", "onCloseButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.creatorprogram.redeem.aC) this.receiver).Z();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function6 {
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                n((cg.o) obj, (cg.j) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
                return Unit.INSTANCE;
            }

            n(Object obj) {
                super(6, obj, com.alightcreative.app.motion.activities.creatorprogram.redeem.aC.class, "onRedeemButtonClick", "onRedeemButtonClick(Lcom/alightcreative/app/motion/activities/creatorprogram/Reward;Lcom/alightcreative/app/motion/activities/creatorprogram/AmazonRegion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void n(cg.o p0, cg.j p1, String p2, String p3, String p4, String p5) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(p2, "p2");
                Intrinsics.checkNotNullParameter(p3, "p3");
                Intrinsics.checkNotNullParameter(p4, "p4");
                Intrinsics.checkNotNullParameter(p5, "p5");
                ((com.alightcreative.app.motion.activities.creatorprogram.redeem.aC) this.receiver).S(p0, p1, p2, p3, p4, p5);
            }
        }

        /* synthetic */ class w6 extends AdaptedFunctionReference implements Function1 {
            w6(Object obj) {
                super(1, obj, com.alightcreative.app.motion.activities.creatorprogram.redeem.aC.class, "onRewardSelected", "onRewardSelected(Lcom/alightcreative/app/motion/activities/creatorprogram/Reward;)Lkotlinx/coroutines/Job;", 8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((cg.o) obj);
                return Unit.INSTANCE;
            }

            public final void n(cg.o p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.app.motion.activities.creatorprogram.redeem.aC) this.receiver).WPU(p0);
            }
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-2022188252, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensScreen.<anonymous> (RedeemTokensScreen.kt:56)");
            }
            List listUo = this.f6568n.Uo();
            cg.o oVarKN = this.f6568n.KN();
            z zVarJ2 = this.f6568n.J2();
            z zVarNr = this.f6568n.nr();
            z zVarO = this.f6568n.O();
            z zVarT = this.f6568n.t();
            boolean zXMQ = this.f6568n.xMQ();
            boolean zMUb = this.f6568n.mUb();
            com.alightcreative.app.motion.activities.creatorprogram.redeem.aC aCVar = this.f6569t;
            composer.eF(-824450931);
            boolean zE2 = composer.E2(aCVar);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new C0228j(aCVar);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            com.alightcreative.app.motion.activities.creatorprogram.redeem.aC aCVar2 = this.f6569t;
            composer.eF(-824448722);
            boolean zE22 = composer.E2(aCVar2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(aCVar2);
                composer.o(objIF2);
            }
            composer.Xw();
            Function6 function6 = (Function6) ((KFunction) objIF2);
            com.alightcreative.app.motion.activities.creatorprogram.redeem.aC aCVar3 = this.f6569t;
            composer.eF(-824446581);
            boolean zE23 = composer.E2(aCVar3);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(aCVar3);
                composer.o(objIF3);
            }
            composer.Xw();
            Wre.nr(listUo, oVarKN, zVarJ2, zVarNr, zVarO, zVarT, zXMQ, zMUb, function0, function6, (Function1) objIF3, composer, 0, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(eO eOVar, com.alightcreative.app.motion.activities.creatorprogram.redeem.aC aCVar) {
            this.f6568n = eOVar;
            this.f6569t = aCVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ MutableState E2;
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ MutableState f6570N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f6571O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ z f6572S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ MutableState f6573T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ MutableState f6574X;
        final /* synthetic */ boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ z f6575Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f6576e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f6577g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f6578n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ z f6579o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f6580r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ cg.o f6581t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function6 f6582v;

        n(boolean z2, cg.o oVar, Function0 function0, List list, Function1 function1, z zVar, z zVar2, z zVar3, z zVar4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Function6 function6, boolean z3) {
            this.f6578n = z2;
            this.f6581t = oVar;
            this.f6571O = function0;
            this.J2 = list;
            this.f6580r = function1;
            this.f6579o = zVar;
            this.f6575Z = zVar2;
            this.f6572S = zVar3;
            this.f6577g = zVar4;
            this.E2 = mutableState;
            this.f6576e = mutableState2;
            this.f6574X = mutableState3;
            this.f6573T = mutableState4;
            this.f6570N = mutableState5;
            this.f6582v = function6;
            this.Xw = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HI(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
            Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
            FocusManager.qie(focusManager, false, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Ik(MutableState mutableState, cg.j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Wre.qie(mutableState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Wre.Uo(mutableState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ck(cg.j region, Context context) {
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(context, "<unused var>");
            return region.rl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(cg.o reward, Context context) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(context, "context");
            return Wre.X(reward, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(String str, MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Wre.ck(mutableState, str + it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(String str, MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Wre.ty(mutableState, str + it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Wre.xMQ(mutableState, it);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mUb((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void mUb(Composer composer, int i2) {
            float f3;
            Modifier.Companion companion;
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            MutableState mutableState4;
            MutableState mutableState5;
            Function6 function6;
            cg.o oVar;
            final MutableState mutableState6;
            boolean z2;
            String strT;
            final MutableState mutableState7;
            boolean z3;
            String strT2;
            boolean z4;
            String strT3;
            final MutableState mutableState8;
            final String str;
            boolean z5;
            String strT4;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1015431238, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensScreen.<anonymous> (RedeemTokensScreen.kt:102)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(companion2, 0.0f, 1, null), aD.w6.z(), null, 2, null);
            cg.o oVar2 = this.f6581t;
            Function0 function0 = this.f6571O;
            List list = this.J2;
            Function1 function1 = this.f6580r;
            z zVar = this.f6579o;
            z zVar2 = this.f6575Z;
            z zVar3 = this.f6572S;
            z zVar4 = this.f6577g;
            final MutableState mutableState9 = this.E2;
            final MutableState mutableState10 = this.f6576e;
            MutableState mutableState11 = this.f6574X;
            MutableState mutableState12 = this.f6573T;
            MutableState mutableState13 = this.f6570N;
            Function6 function62 = this.f6582v;
            boolean z6 = this.Xw;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
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
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Dj7.Wre.rl(aD.w6.z(), composer, 6);
            jOL.fuX.Uo(null, StringResources_androidKt.t(Wre.N(oVar2.t()), composer, 0), jOL.j.f69432n, jOL.Dsr.f69411n, new w6.j(2131231603, false, function0, 2, null), null, 0.0f, composer, 3456, 97);
            float f4 = 16;
            Modifier modifierUo = ScrollKt.Uo(PaddingKt.gh(ColumnScope.rl(columnScopeInstance, companion2, 1.0f, false, 2, null), Dp.KN(f4), 0.0f, 2, null), ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion3.gh(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierUo);
            Function0 function0N2 = companion4.n();
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
            Updater.O(composerN2, measurePolicyN2, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(8)), composer, 6);
            ImageKt.n(PainterResources_androidKt.t(Wre.e(oVar2.t()), composer, 0), null, ClipKt.n(SizeKt.KN(companion2, 0.0f, 1, null), RoundedCornerShapeKt.t(Dp.KN(12))), null, ContentScale.INSTANCE.nr(), 0.0f, null, composer, 24624, 104);
            Composer composer2 = composer;
            float f5 = 32;
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f5)), composer2, 6);
            composer2.eF(131479996);
            Object objIF = composer2.iF();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objIF == companion5.n()) {
                objIF = new Function2() { // from class: MO.CN3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.n.gh((cg.o) obj, (Context) obj2);
                    }
                };
                composer2.o(objIF);
            }
            composer2.Xw();
            u.Dsr.KN(list, oVar2, (Function2) objIF, function1, StringResources_androidKt.t(Wre.T(oVar2.t()), composer2, 0), null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 32);
            composer2.eF(131487772);
            if (oVar2.t() == o.C.f43815t) {
                SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f5)), composer2, 6);
                List list2 = ArraysKt.toList(cg.j.values());
                cg.j jVarGh = Wre.gh(mutableState9);
                composer2.eF(131497004);
                Object objIF2 = composer2.iF();
                if (objIF2 == companion5.n()) {
                    objIF2 = new Function2() { // from class: MO.fuX
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wre.n.ck((cg.j) obj, (Context) obj2);
                        }
                    };
                    composer2.o(objIF2);
                }
                Function2 function2 = (Function2) objIF2;
                composer2.Xw();
                composer2.eF(131499325);
                Object objIF3 = composer2.iF();
                if (objIF3 == companion5.n()) {
                    objIF3 = new Function1() { // from class: MO.Dsr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Wre.n.Ik(mutableState9, (cg.j) obj);
                        }
                    };
                    composer2.o(objIF3);
                }
                composer2.Xw();
                u.Dsr.KN(list2, jVarGh, function2, (Function1) objIF3, StringResources_androidKt.t(2132017556, composer2, 6), StringResources_androidKt.t(2132017557, composer2, 6), composer2, 3456, 0);
            }
            composer2.Xw();
            composer2.eF(131510640);
            if (oVar2.t() == o.C.f43812O) {
                SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f5)), composer2, 6);
                StringBuilder sb = new StringBuilder();
                final String str2 = "+62";
                sb.append("+62");
                sb.append(" 012 345 6789");
                String string = sb.toString();
                composer2.eF(131521777);
                Object objIF4 = composer2.iF();
                if (objIF4 == companion5.n()) {
                    objIF4 = new Function1() { // from class: MO.aC
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Wre.n.r(str2, mutableState10, (String) obj);
                        }
                    };
                    composer2.o(objIF4);
                }
                Function1 function12 = (Function1) objIF4;
                composer2.Xw();
                String strT5 = StringResources_androidKt.t(2132017576, composer2, 6);
                String strT6 = StringResources_androidKt.t(2132017577, composer2, 6);
                composer2.eF(131532121);
                if (zVar == null) {
                    strT3 = null;
                    z4 = false;
                } else {
                    z4 = false;
                    strT3 = StringResources_androidKt.t(zVar.rl(), composer2, 0);
                }
                composer2.Xw();
                KeyboardType.Companion companion6 = KeyboardType.INSTANCE;
                int iUo = companion6.Uo();
                ImeAction.Companion companion7 = ImeAction.INSTANCE;
                mutableState = mutableState9;
                mutableState2 = mutableState10;
                f3 = f5;
                mutableState4 = mutableState12;
                mutableState5 = mutableState13;
                function6 = function62;
                oVar = oVar2;
                companion = companion2;
                u.qz.nr("", function12, null, string, null, strT5, strT6, strT3, "🇮🇩", null, null, null, null, null, new KeyboardOptions(0, (Boolean) null, iUo, companion7.nr(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), null, new cg.C("+62"), composer, 100663350, 24576, 48660);
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer, 6);
                composer.eF(131551032);
                Object objIF5 = composer.iF();
                if (objIF5 == companion5.n()) {
                    mutableState8 = mutableState11;
                    str = "+62";
                    objIF5 = new Function1() { // from class: MO.C
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Wre.n.qie(str, mutableState8, (String) obj);
                        }
                    };
                    composer.o(objIF5);
                } else {
                    mutableState8 = mutableState11;
                    str = "+62";
                }
                Function1 function13 = (Function1) objIF5;
                composer.Xw();
                String strT7 = StringResources_androidKt.t(2132017560, composer, 6);
                composer.eF(131558701);
                if (zVar2 == null) {
                    strT4 = null;
                    z5 = false;
                } else {
                    z5 = false;
                    strT4 = StringResources_androidKt.t(zVar2.rl(), composer, 0);
                }
                composer.Xw();
                mutableState3 = mutableState8;
                u.qz.nr("", function13, null, string, null, strT7, null, strT4, "🇮🇩", null, null, null, null, null, new KeyboardOptions(0, (Boolean) null, companion6.Uo(), companion7.nr(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), null, new cg.C(str), composer, 100663350, 24576, 48724);
                composer2 = composer;
            } else {
                f3 = f5;
                companion = companion2;
                mutableState = mutableState9;
                mutableState2 = mutableState10;
                mutableState3 = mutableState11;
                mutableState4 = mutableState12;
                mutableState5 = mutableState13;
                function6 = function62;
                oVar = oVar2;
            }
            composer2.Xw();
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer2, 6);
            composer2.eF(131579260);
            Object objIF6 = composer2.iF();
            if (objIF6 == companion5.n()) {
                mutableState6 = mutableState4;
                objIF6 = new Function1() { // from class: MO.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.n.az(mutableState6, (String) obj);
                    }
                };
                composer2.o(objIF6);
            } else {
                mutableState6 = mutableState4;
            }
            Function1 function14 = (Function1) objIF6;
            composer2.Xw();
            String strT8 = StringResources_androidKt.t(2132017564, composer2, 6);
            String strT9 = StringResources_androidKt.t(2132017562, composer2, 6);
            composer2.eF(131586841);
            if (zVar3 == null) {
                strT = null;
                z2 = false;
            } else {
                int iRl = zVar3.rl();
                z2 = false;
                strT = StringResources_androidKt.t(iRl, composer2, 0);
            }
            composer2.Xw();
            KeyboardType.Companion companion8 = KeyboardType.INSTANCE;
            int iT = companion8.t();
            ImeAction.Companion companion9 = ImeAction.INSTANCE;
            final MutableState mutableState14 = mutableState6;
            u.qz.nr("", function14, null, strT8, null, strT9, null, strT, null, null, null, null, null, null, new KeyboardOptions(0, (Boolean) null, iT, companion9.nr(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), null, null, composer, 54, 24576, 114516);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer, 6);
            final FocusManager focusManager = (FocusManager) composer.ty(CompositionLocalsKt.Uo());
            composer.eF(131601859);
            Object objIF7 = composer.iF();
            if (objIF7 == companion5.n()) {
                mutableState7 = mutableState5;
                objIF7 = new Function1() { // from class: MO.qz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.n.ty(mutableState7, (String) obj);
                    }
                };
                composer.o(objIF7);
            } else {
                mutableState7 = mutableState5;
            }
            Function1 function15 = (Function1) objIF7;
            composer.Xw();
            String strT10 = StringResources_androidKt.t(2132017564, composer, 6);
            String strT11 = StringResources_androidKt.t(2132017558, composer, 6);
            composer.eF(131610137);
            if (zVar4 == null) {
                strT2 = null;
                z3 = false;
            } else {
                z3 = false;
                strT2 = StringResources_androidKt.t(zVar4.rl(), composer, 0);
            }
            composer.Xw();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion8.t(), companion9.rl(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            composer.eF(131620427);
            boolean zE2 = composer.E2(focusManager);
            Object objIF8 = composer.iF();
            if (zE2 || objIF8 == companion5.n()) {
                objIF8 = new Function1() { // from class: MO.Pl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.n.HI(focusManager, (KeyboardActionScope) obj);
                    }
                };
                composer.o(objIF8);
            }
            composer.Xw();
            final MutableState mutableState15 = mutableState7;
            u.qz.nr("", function15, null, strT10, null, strT11, null, strT2, null, null, null, null, null, null, keyboardOptions, new KeyboardActions((Function1) objIF8, null, null, null, null, null, 62, null), null, composer, 54, 24576, 81748);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer, 6);
            composer.XQ();
            Modifier modifierXMQ = PaddingKt.xMQ(companion, Dp.KN(f4));
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierXMQ);
            Function0 function0N3 = companion4.n();
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
            Updater.O(composerN3, measurePolicyUo, companion4.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
            Function2 function2Rl3 = companion4.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion4.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            String strT12 = StringResources_androidKt.t(2132017587, composer, 6);
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            composer.eF(131634786);
            final Function6 function63 = function6;
            final cg.o oVar3 = oVar;
            boolean zP5 = composer.p5(function63) | composer.p5(oVar3);
            Object objIF9 = composer.iF();
            if (zP5 || objIF9 == companion5.n()) {
                final MutableState mutableState16 = mutableState;
                final MutableState mutableState17 = mutableState2;
                final MutableState mutableState18 = mutableState3;
                Function0 function02 = new Function0() { // from class: MO.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.n.o(function63, oVar3, mutableState16, mutableState17, mutableState18, mutableState14, mutableState15);
                    }
                };
                composer.o(function02);
                objIF9 = function02;
            }
            composer.Xw();
            Dj7.eO.J2((Function0) objIF9, strT12, modifierKN, null, null, null, 0, 0, 0.0f, null, null, null, z6, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 4088);
            composer.XQ();
            composer.XQ();
            u.rl(this.f6578n, 0L, composer, 0, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Function6 function6, cg.o oVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
            function6.invoke(oVar, Wre.gh(mutableState), Wre.az(mutableState2), Wre.HI(mutableState3), Wre.J2(mutableState4), Wre.KN(mutableState5));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final List list, final cg.o oVar, final z zVar, final z zVar2, final z zVar3, final z zVar4, final boolean z2, final boolean z3, final Function0 function0, final Function6 function6, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        z zVar5;
        z zVar6;
        z zVar7;
        z zVar8;
        boolean z4;
        Function0 function02;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1321474435);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(oVar) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            zVar5 = zVar;
            i5 |= composerKN.p5(zVar5) ? 256 : 128;
        } else {
            zVar5 = zVar;
        }
        if ((i2 & 3072) == 0) {
            zVar6 = zVar2;
            i5 |= composerKN.p5(zVar6) ? 2048 : 1024;
        } else {
            zVar6 = zVar2;
        }
        if ((i2 & 24576) == 0) {
            zVar7 = zVar3;
            i5 |= composerKN.p5(zVar7) ? 16384 : 8192;
        } else {
            zVar7 = zVar3;
        }
        if ((196608 & i2) == 0) {
            zVar8 = zVar4;
            i5 |= composerKN.p5(zVar8) ? 131072 : 65536;
        } else {
            zVar8 = zVar4;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z4 = z3;
            i5 |= composerKN.n(z4) ? 8388608 : 4194304;
        } else {
            z4 = z3;
        }
        if ((100663296 & i2) == 0) {
            function02 = function0;
            i5 |= composerKN.E2(function02) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            function02 = function0;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(function6) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(function1) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i5 & 306783379) == 306783378 && (i7 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1321474435, i5, i7, "com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensScreen (RedeemTokensScreen.kt:94)");
            }
            composerKN.eF(-1884882261);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(ArraysKt.first(cg.j.values()), null, 2, null);
                composerKN.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-1884879664);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                i8 = 2;
                objIF2 = SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                composerKN.o(objIF2);
            } else {
                i8 = 2;
            }
            MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            composerKN.eF(-1884877680);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O("", null, i8, null);
                composerKN.o(objIF3);
            }
            MutableState mutableState3 = (MutableState) objIF3;
            composerKN.Xw();
            composerKN.eF(-1884876112);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = SnapshotStateKt__SnapshotStateKt.O("", null, i8, null);
                composerKN.o(objIF4);
            }
            MutableState mutableState4 = (MutableState) objIF4;
            composerKN.Xw();
            composerKN.eF(-1884874320);
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
                objIF5 = SnapshotStateKt__SnapshotStateKt.O("", null, i8, null);
                composerKN.o(objIF5);
            }
            composerKN.Xw();
            H9N.CN3.nr(ComposableLambdaKt.nr(1015431238, true, new n(z2, oVar, function02, list, function1, zVar5, zVar6, zVar7, zVar8, mutableState, mutableState2, mutableState3, mutableState4, (MutableState) objIF5, function6, z4), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: MO.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.mUb(list, oVar, zVar, zVar2, zVar3, zVar4, z2, z3, function0, function6, function1, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public /* synthetic */ class w6 {
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
    public static final int N(o.C c2) {
        int i2 = w6.$EnumSwitchMapping$0[c2.ordinal()];
        if (i2 == 1) {
            return 2132017555;
        }
        if (i2 == 2) {
            return 2132017554;
        }
        if (i2 == 3) {
            return 2132017592;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(com.alightcreative.app.motion.activities.creatorprogram.redeem.aC aCVar, int i2, Composer composer, int i3) {
        t(aCVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(o.C c2) {
        int i2 = w6.$EnumSwitchMapping$0[c2.ordinal()];
        if (i2 == 1) {
            return 2132017565;
        }
        if (i2 == 2) {
            return 2132017591;
        }
        if (i2 == 3) {
            return 2132017565;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X(cg.o oVar, Context context) {
        if (oVar instanceof o.n) {
            String string = context.getString(2132017568, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (oVar instanceof o.j) {
            String string2 = context.getString(2132017569, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (oVar instanceof o.w6) {
            String string3 = context.getString(2132017570, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (oVar instanceof o.Ml) {
            String string4 = context.getString(2132017571, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (oVar instanceof o.I28) {
            String string5 = context.getString(2132017572, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (oVar instanceof o.Wre) {
            String string6 = context.getString(2132017573, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (oVar instanceof o.Dsr) {
            String string7 = context.getString(2132017574, Long.valueOf(oVar.rl()));
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (!(oVar instanceof o.aC)) {
            throw new NoWhenBranchMatchedException();
        }
        String string8 = context.getString(2132017575, Long.valueOf(oVar.rl()));
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        return string8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(o.C c2) {
        int i2 = w6.$EnumSwitchMapping$0[c2.ordinal()];
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
    public static final Unit mUb(List list, cg.o oVar, z zVar, z zVar2, z zVar3, z zVar4, boolean z2, boolean z3, Function0 function0, Function6 function6, Function1 function1, int i2, int i3, Composer composer, int i5) {
        nr(list, oVar, zVar, zVar2, zVar3, zVar4, z2, z3, function0, function6, function1, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
        return Unit.INSTANCE;
    }

    public static final void t(final com.alightcreative.app.motion.activities.creatorprogram.redeem.aC viewModel, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerKN = composer.KN(-525473093);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-525473093, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensScreen (RedeemTokensScreen.kt:53)");
            }
            eO eOVar = (eO) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            if (eOVar != null) {
                N.fuX.rl(ComposableLambdaKt.nr(-2022188252, true, new j(eOVar, viewModel), composerKN, 54), composerKN, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: MO.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.O(viewModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cg.j gh(MutableState mutableState) {
        return (cg.j) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(MutableState mutableState, cg.j jVar) {
        mutableState.setValue(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
