package Dj7;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ExposedDropdownMenuDefaults;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Mf {

    static final class I28 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f1647n;

        I28(Function2 function2) {
            this.f1647n = function2;
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
                ComposerKt.p5(464378893, i2, -1, "com.alightcreative.common.compose.components.SelectorWrapper.<anonymous> (Selector.kt:101)");
            }
            this.f1647n.invoke(composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1648n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FocusRequester f1649t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(FocusRequester focusRequester, Continuation continuation) {
            super(2, continuation);
            this.f1649t = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f1649t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1648n == 0) {
                ResultKt.throwOnFailure(obj);
                FocusRequester.KN(this.f1649t, 0, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f1650O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o7q f1651n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f1652r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f1653t;

        /* JADX INFO: renamed from: Dj7.Mf$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0061j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[o7q.values().length];
                try {
                    iArr[o7q.f1857n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o7q.f1858t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(o7q o7qVar, String str, String str2, Function1 function1, String str3) {
            this.f1651n = o7qVar;
            this.f1653t = str;
            this.f1650O = str2;
            this.J2 = function1;
            this.f1652r = str3;
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
                ComposerKt.p5(-298095867, i2, -1, "com.alightcreative.common.compose.components.OpenFieldSelector.<anonymous> (Selector.kt:57)");
            }
            int i3 = C0061j.$EnumSwitchMapping$0[this.f1651n.ordinal()];
            if (i3 == 1) {
                composer.eF(-1215241650);
                String str = this.f1653t;
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str == null) {
                    str = this.f1650O;
                }
                Mf.HI(str, this.f1651n, composer, 0);
                composer.Xw();
            } else {
                if (i3 != 2) {
                    composer.eF(-454844610);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-1215016094);
                Mf.Ik(this.f1653t, this.J2, this.f1652r, composer, 0, 0);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1654n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o7q f1655t;

        n(String str, o7q o7qVar) {
            this.f1654n = str;
            this.f1655t = o7qVar;
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
                ComposerKt.p5(489791992, i2, -1, "com.alightcreative.common.compose.components.Selector.<anonymous> (Selector.kt:42)");
            }
            Mf.HI(this.f1654n, this.f1655t, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f1656n;

        w6(String str) {
            this.f1656n = str;
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
                ComposerKt.p5(-829813527, i2, -1, "com.alightcreative.common.compose.components.SelectorTextField.<anonymous> (Selector.kt:130)");
            }
            String str = this.f1656n;
            if (str != null) {
                TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public /* synthetic */ class Wre {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o7q.values().length];
            try {
                iArr[o7q.f1857n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o7q.f1858t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(final String str, final o7q o7qVar, Composer composer, final int i2) {
        int i3;
        long jX4T;
        Composer composer2;
        Composer composerKN = composer.KN(-1837662442);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(o7qVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1837662442, i3, -1, "com.alightcreative.common.compose.components.SelectorText (Selector.kt:106)");
            }
            Modifier modifierMUb = PaddingKt.mUb(Modifier.INSTANCE, Dp.KN(16), Dp.KN(20));
            TextStyle textStyleN = H9N.j.f3810n.rl(composerKN, 6).N();
            int i5 = Wre.$EnumSwitchMapping$0[o7qVar.ordinal()];
            if (i5 == 1) {
                jX4T = aD.w6.X4T();
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jX4T = aD.w6.ub();
            }
            composer2 = composerKN;
            TextKt.t(str, modifierMUb, jX4T, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleN, composer2, (i3 & 14) | 48, 0, 65528);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.fg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Mf.ck(str, o7qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Ik(final String str, final Function1 function1, String str2, Composer composer, final int i2, final int i3) {
        String str3;
        int i5;
        int i7;
        String str4;
        Object objIF;
        Composer.Companion companion;
        Composer composer2;
        Object objIF2;
        final String str5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1963367108);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            str3 = str;
        } else if ((i2 & 6) == 0) {
            str3 = str;
            i5 = (composerKN.p5(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function1) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    str4 = str2;
                    i5 |= composerKN.p5(str4) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    str5 = str4;
                } else {
                    String str6 = i7 == 0 ? null : str4;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1963367108, i5, -1, "com.alightcreative.common.compose.components.SelectorTextField (Selector.kt:123)");
                    }
                    composerKN.eF(-1046603307);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = new FocusRequester();
                        composerKN.o(objIF);
                    }
                    FocusRequester focusRequester = (FocusRequester) objIF;
                    composerKN.Xw();
                    Modifier modifierN = FocusRequesterModifierKt.n(Modifier.INSTANCE, focusRequester);
                    TextStyle textStyleN = H9N.j.f3810n.rl(composerKN, 6).N();
                    ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-829813527, true, new w6(str6), composerKN, 54);
                    ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = ExposedDropdownMenuDefaults.f22003n;
                    String str7 = str6;
                    long jUb = aD.w6.ub();
                    Color.Companion companion2 = Color.INSTANCE;
                    TextFieldKt.nr(str3, function1, modifierN, false, false, textStyleN, null, composableLambdaNr, null, null, false, null, null, null, false, 0, 0, null, null, exposedDropdownMenuDefaults.rl(jUb, companion2.J2(), companion2.J2(), aD.w6.ub(), 0L, companion2.J2(), companion2.J2(), companion2.J2(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, aD.w6.HBN(), 0L, composerKN, 14355894, 0, (ExposedDropdownMenuDefaults.rl << 6) | 6, 3145488), composerKN, (i5 & 14) | 12582912 | (i5 & 112), 0, 524120);
                    composer2 = composerKN;
                    Unit unit = Unit.INSTANCE;
                    composer2.eF(-1046577947);
                    objIF2 = composer2.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new Ml(focusRequester, null);
                        composer2.o(objIF2);
                    }
                    composer2.Xw();
                    EffectsKt.O(unit, (Function2) objIF2, composer2, 6);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    str5 = str7;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.KH
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Mf.r(str, function1, str5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            str4 = str2;
            if ((i5 & 147) == 146) {
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(-1046603307);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                FocusRequester focusRequester2 = (FocusRequester) objIF;
                composerKN.Xw();
                Modifier modifierN2 = FocusRequesterModifierKt.n(Modifier.INSTANCE, focusRequester2);
                TextStyle textStyleN2 = H9N.j.f3810n.rl(composerKN, 6).N();
                ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-829813527, true, new w6(str6), composerKN, 54);
                ExposedDropdownMenuDefaults exposedDropdownMenuDefaults2 = ExposedDropdownMenuDefaults.f22003n;
                String str72 = str6;
                long jUb2 = aD.w6.ub();
                Color.Companion companion22 = Color.INSTANCE;
                TextFieldKt.nr(str3, function1, modifierN2, false, false, textStyleN2, null, composableLambdaNr2, null, null, false, null, null, null, false, 0, 0, null, null, exposedDropdownMenuDefaults2.rl(jUb2, companion22.J2(), companion22.J2(), aD.w6.ub(), 0L, companion22.J2(), companion22.J2(), companion22.J2(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, aD.w6.HBN(), 0L, composerKN, 14355894, 0, (ExposedDropdownMenuDefaults.rl << 6) | 6, 3145488), composerKN, (i5 & 14) | 12582912 | (i5 & 112), 0, 524120);
                composer2 = composerKN;
                Unit unit2 = Unit.INSTANCE;
                composer2.eF(-1046577947);
                objIF2 = composer2.iF();
                if (objIF2 == companion.n()) {
                }
                composer2.Xw();
                EffectsKt.O(unit2, (Function2) objIF2, composer2, 6);
                if (ComposerKt.v()) {
                }
                str5 = str72;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        str4 = str2;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Modifier modifier, o7q o7qVar, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        o(modifier, o7qVar, function0, function2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(String str, o7q o7qVar, int i2, Composer composer, int i3) {
        HI(str, o7qVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(String str, String str2, String str3, Function1 function1, Modifier modifier, o7q o7qVar, Function0 function0, int i2, int i3, Composer composer, int i5) {
        xMQ(str, str2, str3, function1, modifier, o7qVar, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb() {
        return Unit.INSTANCE;
    }

    private static final void o(final Modifier modifier, final o7q o7qVar, final Function0 function0, final Function2 function2, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        o7q o7qVar2;
        long jQu;
        Composer composerKN = composer.KN(-1550479151);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            o7qVar2 = o7qVar;
            i3 |= composerKN.p5(o7qVar2) ? 32 : 16;
        } else {
            o7qVar2 = o7qVar;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1550479151, i3, -1, "com.alightcreative.common.compose.components.SelectorWrapper (Selector.kt:81)");
            }
            composerKN.eF(1209551429);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            if (XQ(PressInteractionKt.n(mutableInteractionSource, composerKN, 6))) {
                jQu = aD.w6.UF();
            } else {
                int i5 = Wre.$EnumSwitchMapping$0[o7qVar2.ordinal()];
                if (i5 == 1) {
                    jQu = aD.w6.Qu();
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jQu = aD.w6.f();
                }
            }
            long j2 = jQu;
            RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(12));
            composerKN.eF(1209568735);
            boolean z2 = (i3 & 896) == 256;
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: Dj7.LEl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Mf.S(function0);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            SurfaceKt.n(ClickableKt.nr(modifier2, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), roundedCornerShapeT, j2, 0L, null, 0.0f, ComposableLambdaKt.nr(464378893, true, new I28(function2), composerKN, 54), composerKN, 1572864, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.gnv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Mf.Z(modifier, o7qVar, function0, function2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void qie(final String text, Modifier modifier, o7q o7qVar, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        final Modifier modifier2;
        final o7q o7qVar2;
        final Function0 function03;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerKN = composer.KN(569087634);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(o7qVar) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
            o7qVar2 = o7qVar;
            function03 = function0;
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i8 != 0) {
                o7qVar = o7q.f1857n;
            }
            o7q o7qVar3 = o7qVar;
            if (i9 != 0) {
                composerKN.eF(1939828215);
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Dj7.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Mf.az();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                function02 = (Function0) objIF;
            } else {
                function02 = function0;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(569087634, i5, -1, "com.alightcreative.common.compose.components.Selector (Selector.kt:40)");
            }
            int i10 = i5 >> 3;
            Modifier modifier3 = modifier;
            o(modifier3, o7qVar3, function02, ComposableLambdaKt.nr(489791992, true, new n(text, o7qVar3), composerKN, 54), composerKN, (i10 & 14) | 3072 | (i10 & 112) | (i10 & 896));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
            o7qVar2 = o7qVar3;
            function03 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.O
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Mf.ty(text, modifier2, o7qVar2, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, Function1 function1, String str2, int i2, int i3, Composer composer, int i5) {
        Ik(str, function1, str2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(String str, Modifier modifier, o7q o7qVar, Function0 function0, int i2, int i3, Composer composer, int i5) {
        qie(str, modifier, o7qVar, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final String textWhileUnselected, final String currentText, final String hint, final Function1 onValueChange, Modifier modifier, o7q o7qVar, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        o7q o7qVar2;
        int i8;
        Function0 function02;
        int i9;
        Composer composer2;
        final o7q o7qVar3;
        final Function0 function03;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(textWhileUnselected, "textWhileUnselected");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerKN = composer.KN(816574891);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(textWhileUnselected) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(currentText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(hint) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onValueChange) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    o7qVar2 = o7qVar;
                    i5 |= composerKN.p5(o7qVar2) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                    if ((1572864 & i2) == 0) {
                        function02 = function0;
                        i5 |= composerKN.E2(function02) ? 1048576 : 524288;
                    }
                    i9 = i5;
                    if ((599187 & i9) == 599186 || !composerKN.xMQ()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            o7qVar2 = o7q.f1857n;
                        }
                        if (i8 != 0) {
                            composerKN.eF(-1803165477);
                            Object objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0() { // from class: Dj7.mz
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Mf.mUb();
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            function02 = (Function0) objIF;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(816574891, i9, -1, "com.alightcreative.common.compose.components.OpenFieldSelector (Selector.kt:55)");
                        }
                        o7q o7qVar4 = o7qVar2;
                        int i11 = i9 >> 12;
                        composer2 = composerKN;
                        Modifier modifier3 = modifier2;
                        Function0 function04 = function02;
                        o(modifier3, o7qVar4, function04, ComposableLambdaKt.nr(-298095867, true, new j(o7qVar4, currentText, textWhileUnselected, onValueChange, hint), composerKN, 54), composer2, (i11 & 896) | (i11 & 14) | 3072 | (i11 & 112));
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier2 = modifier3;
                        o7qVar3 = o7qVar4;
                        function03 = function04;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        o7qVar3 = o7qVar2;
                        function03 = function02;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.OU
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Mf.gh(textWhileUnselected, currentText, hint, onValueChange, modifier4, o7qVar3, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                function02 = function0;
                i9 = i5;
                if ((599187 & i9) == 599186) {
                    if (i10 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    o7q o7qVar42 = o7qVar2;
                    int i112 = i9 >> 12;
                    composer2 = composerKN;
                    Modifier modifier32 = modifier2;
                    Function0 function042 = function02;
                    o(modifier32, o7qVar42, function042, ComposableLambdaKt.nr(-298095867, true, new j(o7qVar42, currentText, textWhileUnselected, onValueChange, hint), composerKN, 54), composer2, (i112 & 896) | (i112 & 14) | 3072 | (i112 & 112));
                    if (ComposerKt.v()) {
                    }
                    modifier2 = modifier32;
                    o7qVar3 = o7qVar42;
                    function03 = function042;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            o7qVar2 = o7qVar;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            i9 = i5;
            if ((599187 & i9) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        o7qVar2 = o7qVar;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        i9 = i5;
        if ((599187 & i9) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean XQ(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
