package Dj7;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.OnBackPressedCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class rv6 {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f1878n;

        j(Function2 function2) {
            this.f1878n = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(ColumnScope ActivityBottomSheet, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(ActivityBottomSheet, "$this$ActivityBottomSheet");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-824539556, i2, -1, "com.alightcreative.common.compose.components.OpenBottomSheet.<anonymous> (OpenBottomSheet.kt:14)");
            }
            this.f1878n.invoke(composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1879n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f1880t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f1880t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f1880t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1879n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (!this.f1880t.gh()) {
                    ModalBottomSheetState modalBottomSheetState = this.f1880t;
                    this.f1879n = 1;
                    if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(ModalBottomSheetState modalBottomSheetState, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        t(modalBottomSheetState, function0, function2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void t(final ModalBottomSheetState sheetState, final Function0 onBackPressed, final Function2 content, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(-1676850349);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onBackPressed) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(content) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1676850349, i3, -1, "com.alightcreative.common.compose.components.OpenBottomSheet (OpenBottomSheet.kt:12)");
            }
            int i5 = i3 & 14;
            Dj7.n.rl(sheetState, ComposableLambdaKt.nr(-824539556, true, new j(content), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | 48 | i5);
            Unit unit = Unit.INSTANCE;
            composerKN.eF(173683176);
            boolean z2 = i5 == 4 || ((i3 & 8) != 0 && composerKN.E2(sheetState));
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new n(sheetState, null);
                composerKN.o(objIF);
            }
            composerKN.Xw();
            EffectsKt.O(unit, (Function2) objIF, composerKN, 6);
            composerKN.eF(173686515);
            boolean z3 = (i3 & 112) == 32;
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: Dj7.iwV
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return rv6.nr(onBackPressed, (OnBackPressedCallback) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            N.I28.O(null, (Function1) objIF2, composerKN, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return rv6.O(sheetState, onBackPressed, content, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
