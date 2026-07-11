package Dj7;

import VV.qz;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class lej {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1832O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1833n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f1834t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f3, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f1834t = f3;
            this.f1832O = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f1834t, this.f1832O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1833n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long j2 = (long) this.f1834t;
                this.f1833n = 1;
                if (GJW.yg.rl(j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f1832O.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(int i2, Modifier modifier, boolean z2, boolean z3, ContentScale contentScale, Function0 function0, int i3, int i5, Composer composer, int i7) {
        t(i2, modifier, z2, z3, contentScale, function0, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final int i2, final Modifier modifier, final boolean z2, boolean z3, ContentScale contentScale, Function0 function0, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        boolean z4;
        int i9;
        ContentScale contentScale2;
        int i10;
        Function0 function02;
        int i11;
        Function0 function03;
        boolean z5;
        final VV.fuX fuxT;
        boolean zP5;
        Object objIF;
        Function0 function04;
        final Function0 function05;
        final ContentScale contentScale3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerKN = composer.KN(-744036485);
        if ((i5 & 1) != 0) {
            i8 = i3 | 6;
            i7 = i2;
        } else {
            i7 = i2;
            if ((i3 & 6) == 0) {
                i8 = (composerKN.t(i7) ? 4 : 2) | i3;
            } else {
                i8 = i3;
            }
        }
        if ((i5 & 2) != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.n(z2) ? 256 : 128;
        }
        int i12 = i5 & 8;
        if (i12 != 0) {
            i8 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                z4 = z3;
                i8 |= composerKN.n(z4) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i8 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    contentScale2 = contentScale;
                    i8 |= composerKN.p5(contentScale2) ? 16384 : 8192;
                }
                i10 = i5 & 32;
                if (i10 == 0) {
                    if ((196608 & i3) == 0) {
                        function02 = function0;
                        i8 |= composerKN.E2(function02) ? 131072 : 65536;
                    }
                    i11 = i8;
                    if ((74899 & i11) == 74898 || !composerKN.xMQ()) {
                        boolean z7 = i12 == 0 ? true : z4;
                        ContentScale contentScaleO = i9 == 0 ? ContentScale.INSTANCE.O() : contentScale2;
                        if (i10 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-744036485, i11, -1, "com.alightcreative.common.compose.components.LottieAnimation (LottieAnimation.kt:34)");
                        }
                        function03 = function02;
                        VV.C cR = VV.Xo.r(qz.j.n(qz.j.rl(i7)), "lottie", null, null, null, null, composerKN, 48, 60);
                        z5 = z7;
                        fuxT = VV.j.t(nr(cR), z5, false, false, null, 0.0f, !z2 ? Integer.MAX_VALUE : 1, null, false, false, composerKN, (i11 >> 6) & 112, 956);
                        FQq.Dsr dsrNr = nr(cR);
                        composerKN.eF(-347456415);
                        zP5 = composerKN.p5(fuxT);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0() { // from class: Dj7.qf
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(lej.O(fuxT));
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        ContentScale contentScale4 = contentScaleO;
                        VV.I28.n(dsrNr, (Function0) objIF, modifier, false, false, false, false, null, false, null, null, contentScale4, false, false, null, null, false, composerKN, (i11 << 3) & 896, (i11 >> 9) & 112, 129016);
                        composerKN = composerKN;
                        if (z5 || z2) {
                            function04 = function03;
                        } else {
                            function04 = function03;
                            if (function04 != null) {
                                FQq.Dsr dsrNr2 = nr(cR);
                                Float fValueOf = dsrNr2 != null ? Float.valueOf(dsrNr2.nr()) : null;
                                if (fValueOf != null) {
                                    float fFloatValue = fValueOf.floatValue();
                                    Unit unit = Unit.INSTANCE;
                                    composerKN.eF(545029251);
                                    boolean zRl = composerKN.rl(fFloatValue) | ((i11 & 458752) == 131072);
                                    Object objIF2 = composerKN.iF();
                                    if (zRl || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new j(fFloatValue, function04, null);
                                        composerKN.o(objIF2);
                                    }
                                    composerKN.Xw();
                                    EffectsKt.O(unit, (Function2) objIF2, composerKN, 6);
                                }
                            }
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        function05 = function04;
                        contentScale3 = contentScale4;
                        z6 = z5;
                    } else {
                        composerKN.wTp();
                        z6 = z4;
                        contentScale3 = contentScale2;
                        function05 = function02;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.Ln
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return lej.J2(i2, modifier, z2, z6, contentScale3, function05, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 |= 196608;
                function02 = function0;
                i11 = i8;
                if ((74899 & i11) == 74898) {
                    if (i12 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    function03 = function02;
                    VV.C cR2 = VV.Xo.r(qz.j.n(qz.j.rl(i7)), "lottie", null, null, null, null, composerKN, 48, 60);
                    z5 = z7;
                    fuxT = VV.j.t(nr(cR2), z5, false, false, null, 0.0f, !z2 ? Integer.MAX_VALUE : 1, null, false, false, composerKN, (i11 >> 6) & 112, 956);
                    FQq.Dsr dsrNr3 = nr(cR2);
                    composerKN.eF(-347456415);
                    zP5 = composerKN.p5(fuxT);
                    objIF = composerKN.iF();
                    if (!zP5) {
                        objIF = new Function0() { // from class: Dj7.qf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(lej.O(fuxT));
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        ContentScale contentScale42 = contentScaleO;
                        VV.I28.n(dsrNr3, (Function0) objIF, modifier, false, false, false, false, null, false, null, null, contentScale42, false, false, null, null, false, composerKN, (i11 << 3) & 896, (i11 >> 9) & 112, 129016);
                        composerKN = composerKN;
                        if (z5) {
                            function04 = function03;
                            if (ComposerKt.v()) {
                            }
                            function05 = function04;
                            contentScale3 = contentScale42;
                            z6 = z5;
                        }
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            contentScale2 = contentScale;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            function02 = function0;
            i11 = i8;
            if ((74899 & i11) == 74898) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        z4 = z3;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        contentScale2 = contentScale;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        function02 = function0;
        i11 = i8;
        if ((74899 & i11) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(VV.fuX fux) {
        return ((Number) fux.getValue()).floatValue();
    }

    private static final FQq.Dsr nr(VV.C c2) {
        return (FQq.Dsr) c2.getValue();
    }
}
