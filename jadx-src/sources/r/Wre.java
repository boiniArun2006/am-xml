package r;

import GJW.vd;
import GJW.xuv;
import GJW.yg;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.IOException;
import java.text.DecimalFormatSymbols;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class Wre {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FocusRequester f72672O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72673n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C2348n f72674t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(C2348n c2348n, FocusRequester focusRequester, Continuation continuation) {
            super(2, continuation);
            this.f72674t = c2348n;
            this.f72672O = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f72674t, this.f72672O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72673n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f72673n = 1;
                if (yg.rl(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (this.f72674t.n()) {
                FocusRequester.KN(this.f72672O, 0, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72675n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f72676t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f72676t = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f72676t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72675n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f72675n = 1;
                if (yg.rl(10L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MutableState mutableState = this.f72676t;
            Wre.xMQ(mutableState, TextFieldValue.nr(Wre.Uo(mutableState), null, TextRangeKt.rl(0, Wre.Uo(this.f72676t).xMQ().length()), null, 5, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f72677O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72678n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C2348n f72679t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C2348n c2348n, TextFieldValue textFieldValue, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f72679t = c2348n;
            this.f72677O = textFieldValue;
            this.J2 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f72679t, this.f72677O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72678n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f72678n = 1;
                if (yg.rl(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Wre.o(this.f72679t, this.f72677O.xMQ())) {
                this.J2.invoke(String.valueOf(Wre.Ik(this.f72679t, this.f72677O.xMQ())));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ aF1.j f72680O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f72681n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C2348n f72682t;

        w6(TextFieldValue textFieldValue, C2348n c2348n, aF1.j jVar) {
            this.f72681n = textFieldValue;
            this.f72682t = c2348n;
            this.f72680O = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function2 innerTextField, Composer composer, int i2) {
            int i3;
            int i5;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer2.E2(innerTextField) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1147972911, i3, -1, "com.alightcreative.app.motion.numerickeypad.KeypadInputField.<anonymous>.<anonymous>.<anonymous> (KeypadInputField.kt:152)");
            }
            if (this.f72681n.xMQ().length() == 0) {
                composer2.eF(-609123450);
                i5 = i3;
                TextKt.t(String.valueOf(this.f72682t.O()), SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), this.f72680O.az(), TextUnitKt.KN(16), null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.rl()), 0L, 0, false, 0, 0, null, null, composer, 3120, 0, 130544);
                composer2 = composer;
                composer2.Xw();
            } else {
                i5 = i3;
                composer2.eF(-608744072);
                BoxKt.n(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                composer2.Xw();
            }
            innerTextField.invoke(composer2, Integer.valueOf(i5 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void nr(final RowScope KeypadInputField, C2348n c2348n, final String value, final long j2, final Function1 onValueChange, Composer composer, final int i2) {
        int i3;
        char c2;
        float f3;
        RoundedCornerShape roundedCornerShape;
        String strReplace$default;
        Object obj;
        int i5;
        final vd vdVar;
        BoxScopeInstance boxScopeInstance;
        Modifier.Companion companion;
        int i7;
        char c4;
        final MutableState mutableState;
        SolidColor solidColor;
        Continuation continuation;
        Composer composer2;
        final C2348n info = c2348n;
        Intrinsics.checkNotNullParameter(KeypadInputField, "$this$KeypadInputField");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerKN = composer.KN(-1156210522);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(KeypadInputField) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(info) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(value) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.nr(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onValueChange) ? 16384 : 8192;
        }
        int i8 = i3;
        if ((i8 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1156210522, i8, -1, "com.alightcreative.app.motion.numerickeypad.KeypadInputField (KeypadInputField.kt:45)");
            }
            composerKN.eF(-892781956);
            Object objIF = composerKN.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = new FocusRequester();
                composerKN.o(objIF);
            }
            FocusRequester focusRequester = (FocusRequester) objIF;
            composerKN.Xw();
            char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
            float f4 = 4;
            RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(f4));
            if (decimalSeparator != '.') {
                roundedCornerShape = roundedCornerShapeT;
                f3 = f4;
                c2 = decimalSeparator;
                strReplace$default = StringsKt.replace$default(value, '.', decimalSeparator, false, 4, (Object) null);
            } else {
                c2 = decimalSeparator;
                f3 = f4;
                roundedCornerShape = roundedCornerShapeT;
                strReplace$default = value;
            }
            composerKN.eF(-892773781);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion2.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue(strReplace$default, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            TextFieldValue textFieldValueO = TextFieldValue.O(Uo(mutableState2), strReplace$default, 0L, null, 6, null);
            composerKN.eF(-892768735);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion2.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF3);
            }
            final MutableState mutableState3 = (MutableState) objIF3;
            composerKN.Xw();
            aF1.j jVar = (aF1.j) composerKN.ty(aF1.w6.t());
            boolean zO = o(c2348n, value);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion2.n()) {
                objIF4 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF4);
            }
            vd vdVar2 = (vd) objIF4;
            composerKN.eF(-892762548);
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion2.n()) {
                objIF5 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                composerKN.o(objIF5);
            }
            final MutableState mutableState4 = (MutableState) objIF5;
            composerKN.Xw();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierT = BackgroundKt.t(SizeKt.xMQ(RowScope.rl(KeypadInputField, companion3, 1.0f, false, 2, null), Dp.KN(40)), zO ? jVar.mUb() : mUb(mutableState3) ? jVar.nr() : jVar.gh(), roundedCornerShape);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion5.n();
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
            Updater.O(composerN, measurePolicyUo, companion5.t());
            Updater.O(composerN, compositionLocalMapIk, companion5.O());
            Function2 function2Rl = companion5.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion5.nr());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
            Modifier modifierT2 = BackgroundKt.t(SizeKt.nr(SizeKt.KN(PaddingKt.xMQ(companion3, Dp.KN(1)), 0.0f, 1, null), 0.0f, 1, null), mUb(mutableState3) ? jVar.rl() : jVar.gh(), roundedCornerShape);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT2);
            Function0 function0N2 = companion5.n();
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
            Updater.O(composerN2, measurePolicyUo2, companion5.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
            Function2 function2Rl2 = companion5.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion5.nr());
            Modifier modifierN = FocusRequesterModifierKt.n(boxScopeInstance2.n(PaddingKt.mUb(BackgroundKt.nr(SizeKt.iF(SizeKt.KN(companion3, 0.0f, 1, null), null, false, 3, null), Color.INSTANCE.J2(), null, 2, null), Dp.KN(5), Dp.KN(0)), companion4.t()), focusRequester);
            composerKN.eF(1485835642);
            int i9 = i8 & 112;
            int i10 = i8 & 896;
            int i11 = i8 & 57344;
            boolean zE2 = (i10 == 256) | (i9 == 32) | (i11 == 16384) | composerKN.E2(vdVar2);
            Object objIF6 = composerKN.iF();
            if (zE2 || objIF6 == companion2.n()) {
                i5 = i10;
                vdVar = vdVar2;
                boxScopeInstance = boxScopeInstance2;
                companion = companion3;
                i7 = i9;
                c4 = c2;
                obj = new Function1() { // from class: r.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wre.O(info, value, onValueChange, vdVar, mutableState3, mutableState2, (FocusState) obj2);
                    }
                };
                mutableState = mutableState2;
                composerKN.o(obj);
            } else {
                companion = companion3;
                i5 = i10;
                obj = objIF6;
                c4 = c2;
                boxScopeInstance = boxScopeInstance2;
                mutableState = mutableState2;
                i7 = i9;
                vdVar = vdVar2;
            }
            composerKN.Xw();
            Modifier modifierN2 = FocusChangedModifierKt.n(modifierN, (Function1) obj);
            TextStyle textStyleT = TextStyle.t(TextStyle.INSTANCE.n(), zO ? jVar.mUb() : jVar.HI(), TextUnitKt.KN(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.rl(), 0, 0L, null, null, null, 0, 0, null, 16744444, null);
            SolidColor solidColor2 = new SolidColor(jVar.HI(), null);
            composerKN.eF(1485873940);
            boolean zO2 = composerKN.O(c4) | (i5 == 256) | (i11 == 16384) | composerKN.E2(vdVar) | (i7 == 32);
            Object objIF7 = composerKN.iF();
            if (zO2 || objIF7 == companion2.n()) {
                solidColor = solidColor2;
                continuation = null;
                final char c5 = c4;
                info = c2348n;
                Function1 function1 = new Function1() { // from class: r.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wre.J2(c5, value, onValueChange, vdVar, mutableState, mutableState4, info, (TextFieldValue) obj2);
                    }
                };
                composerKN.o(function1);
                objIF7 = function1;
            } else {
                info = c2348n;
                solidColor = solidColor2;
                continuation = null;
            }
            composerKN.Xw();
            int i12 = i7;
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            Continuation continuation2 = continuation;
            boolean z2 = true;
            BasicTextFieldKt.t(textFieldValueO, (Function1) objIF7, modifierN2, false, false, textStyleT, null, null, true, 0, 0, null, null, null, solidColor, ComposableLambdaKt.nr(1147972911, true, new w6(textFieldValueO, info, jVar), composerKN, 54), composerKN, 100663296, 196608, 16088);
            TextKt.t(info.rl(), boxScopeInstance3.n(PaddingKt.xMQ(companion, Dp.KN(f3)), companion4.HI()), zO ? jVar.xMQ() : j2, TextUnitKt.KN(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, 3072, 0, 131056);
            composer2 = composerKN;
            composer2.XQ();
            composer2.XQ();
            Unit unit = Unit.INSTANCE;
            composer2.eF(-892599246);
            if (i12 != 32) {
                z2 = false;
            }
            Object objIF8 = composer2.iF();
            if (z2 || objIF8 == companion2.n()) {
                objIF8 = new Ml(info, focusRequester, continuation2);
                composer2.o(objIF8);
            }
            composer2.Xw();
            EffectsKt.O(unit, (Function2) objIF8, composer2, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final C2348n c2348n2 = info;
            scopeUpdateScopeGh.n(new Function2() { // from class: r.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Wre.KN(KeypadInputField, c2348n2, value, j2, onValueChange, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final float Ik(C2348n c2348n, String value) {
        Intrinsics.checkNotNullParameter(c2348n, PtsLKY.LFmPV);
        Intrinsics.checkNotNullParameter(value, "value");
        Float floatOrNull = StringsKt.toFloatOrNull(value);
        return ck(c2348n, floatOrNull != null ? floatOrNull.floatValue() : c2348n.O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(char c2, String str, Function1 function1, vd vdVar, MutableState mutableState, MutableState mutableState2, C2348n c2348n, TextFieldValue userInputValue) throws IOException {
        Intrinsics.checkNotNullParameter(userInputValue, "userInputValue");
        TextFieldValue textFieldValueO = TextFieldValue.O(userInputValue, new Regex("[^\\d" + c2 + "-]").replace(userInputValue.xMQ(), ""), 0L, null, 6, null);
        if (!StringsKt.isBlank(userInputValue.xMQ()) && StringsKt.isBlank(textFieldValueO.xMQ())) {
            return Unit.INSTANCE;
        }
        String strXMQ = textFieldValueO.xMQ();
        int i2 = 0;
        for (int i3 = 0; i3 < strXMQ.length(); i3++) {
            if (strXMQ.charAt(i3) == c2) {
                i2++;
            }
        }
        if (i2 > 1) {
            return Unit.INSTANCE;
        }
        String strXMQ2 = textFieldValueO.xMQ();
        int i5 = 0;
        for (int i7 = 0; i7 < strXMQ2.length(); i7++) {
            if (strXMQ2.charAt(i7) == '-') {
                i5++;
            }
        }
        if (i5 > 0) {
            if (i5 % 2 == 0) {
                String strXMQ3 = textFieldValueO.xMQ();
                StringBuilder sb = new StringBuilder();
                int length = strXMQ3.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char cCharAt = strXMQ3.charAt(i8);
                    if (cCharAt != '-') {
                        sb.append(cCharAt);
                    }
                }
                textFieldValueO = TextFieldValue.O(textFieldValueO, sb.toString(), TextRangeKt.n(RangesKt.coerceAtLeast(TextRange.ty(textFieldValueO.getSelection()) - (i5 + 1), 0)), null, 4, null);
            } else {
                String strXMQ4 = textFieldValueO.xMQ();
                StringBuilder sb2 = new StringBuilder();
                int length2 = strXMQ4.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    char cCharAt2 = strXMQ4.charAt(i9);
                    if (cCharAt2 != '-') {
                        sb2.append(cCharAt2);
                    }
                }
                textFieldValueO = TextFieldValue.O(textFieldValueO, "-" + sb2.toString(), 0L, null, 6, null);
            }
        }
        xMQ(mutableState, textFieldValueO);
        if (!Intrinsics.areEqual(textFieldValueO.xMQ(), str)) {
            function1.invoke(textFieldValueO.xMQ());
            xuv xuvVarQie = qie(mutableState2);
            if (xuvVarQie != null) {
                xuv.j.rl(xuvVarQie, null, 1, null);
            }
            az(mutableState2, GJW.C.nr(vdVar, null, null, new n(c2348n, textFieldValueO, function1, null), 3, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(RowScope rowScope, C2348n c2348n, String str, long j2, Function1 function1, int i2, Composer composer, int i3) {
        nr(rowScope, c2348n, str, j2, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(C2348n c2348n, String str, Function1 function1, vd vdVar, MutableState mutableState, MutableState mutableState2, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gh(mutableState, it.n());
        if (mUb(mutableState)) {
            GJW.C.nr(vdVar, null, null, new j(mutableState2, null), 3, null);
        } else {
            if (o(c2348n, str)) {
                function1.invoke(String.valueOf(Ik(c2348n, str)));
            }
            if (Intrinsics.areEqual(str, "-") || StringsKt.isBlank(str)) {
                function1.invoke(String.valueOf(c2348n.O()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final float ck(C2348n c2348n, float f3) {
        Intrinsics.checkNotNullParameter(c2348n, "<this>");
        return RangesKt.coerceIn(f3, c2348n.nr(), c2348n.t());
    }

    public static final boolean o(C2348n c2348n, String value) {
        Intrinsics.checkNotNullParameter(c2348n, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        Float floatOrNull = StringsKt.toFloatOrNull((decimalSeparator == '.' || !StringsKt.contains$default((CharSequence) value, decimalSeparator, false, 2, (Object) null)) ? value : StringsKt.replace$default(value, decimalSeparator, '.', false, 4, (Object) null));
        if (floatOrNull != null) {
            return r(c2348n, floatOrNull.floatValue());
        }
        return false;
    }

    public static final boolean r(C2348n c2348n, float f3) {
        Intrinsics.checkNotNullParameter(c2348n, "<this>");
        boolean z2 = false;
        if (c2348n.nr() == c2348n.t()) {
            return false;
        }
        float fNr = c2348n.nr();
        if (f3 <= c2348n.t() && fNr <= f3) {
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Uo(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    private static final void az(MutableState mutableState, xuv xuvVar) {
        mutableState.setValue(xuvVar);
    }

    private static final void gh(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean mUb(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final xuv qie(MutableState mutableState) {
        return (xuv) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }
}
