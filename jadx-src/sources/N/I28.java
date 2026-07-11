package N;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.LocalOnBackPressedDispatcherOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    public static final class j extends OnBackPressedCallback {
        final /* synthetic */ State nr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state) {
            super(true);
            this.nr = state;
        }

        @Override // androidx.view.OnBackPressedCallback
        public void Uo() {
            I28.J2(this.nr).invoke(this);
        }
    }

    public static final class n implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j f6907n;

        public n(j jVar) {
            this.f6907n = jVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f6907n.gh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(OnBackPressedDispatcher onBackPressedDispatcher, Function1 function1, int i2, int i3, Composer composer, int i5) {
        O(onBackPressedDispatcher, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final OnBackPressedDispatcher onBackPressedDispatcher, final Function1 onBackPressed, Composer composer, final int i2, final int i3) {
        int i5;
        Object objIF;
        Composer.Companion companion;
        final j jVar;
        boolean zE2;
        Object objIF2;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerKN = composer.KN(-694749054);
        if ((i2 & 6) == 0) {
            i5 = (((i3 & 1) == 0 && composerKN.E2(onBackPressedDispatcher)) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onBackPressed) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 1) != 0) {
                    OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerN = LocalOnBackPressedDispatcherOwner.f13286n.n(composerKN, LocalOnBackPressedDispatcherOwner.f13287t);
                    onBackPressedDispatcher = onBackPressedDispatcherOwnerN != null ? onBackPressedDispatcherOwnerN.getOnBackPressedDispatcher() : null;
                    i5 &= -15;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-694749054, i5, -1, "com.alightcreative.common.compose.BackPressHandler (BackPressHandler.kt:18)");
                }
                State stateCk = SnapshotStateKt.ck(onBackPressed, composerKN, (i5 >> 3) & 14);
                composerKN.eF(-1553815164);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = new j(stateCk);
                    composerKN.o(objIF);
                }
                jVar = (j) objIF;
                composerKN.Xw();
                composerKN.eF(-1553807759);
                zE2 = composerKN.E2(onBackPressedDispatcher);
                objIF2 = composerKN.iF();
                if (!zE2 || objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: N.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I28.Uo(onBackPressedDispatcher, jVar, (DisposableEffectScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                EffectsKt.rl(onBackPressedDispatcher, (Function1) objIF2, composerKN, i5 & 14);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                if ((i3 & 1) != 0) {
                    i5 &= -15;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                State stateCk2 = SnapshotStateKt.ck(onBackPressed, composerKN, (i5 >> 3) & 14);
                composerKN.eF(-1553815164);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                jVar = (j) objIF;
                composerKN.Xw();
                composerKN.eF(-1553807759);
                zE2 = composerKN.E2(onBackPressedDispatcher);
                objIF2 = composerKN.iF();
                if (!zE2) {
                    objIF2 = new Function1() { // from class: N.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I28.Uo(onBackPressedDispatcher, jVar, (DisposableEffectScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                    composerKN.Xw();
                    EffectsKt.rl(onBackPressedDispatcher, (Function1) objIF2, composerKN, i5 & 14);
                    if (ComposerKt.v()) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: N.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.KN(onBackPressedDispatcher, onBackPressed, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Uo(OnBackPressedDispatcher onBackPressedDispatcher, j jVar, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.KN(jVar);
        }
        return new n(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Fragment fragment, Function0 function0, OnBackPressedDispatcher onBackPressedDispatcher, Function1 function1, int i2, int i3, Composer composer, int i5) {
        xMQ(fragment, function0, onBackPressedDispatcher, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function0 function0, Function1 function1, Fragment fragment, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        if (((Boolean) function0.invoke()).booleanValue()) {
            function1.invoke(BackPressHandler);
        } else {
            BackPressHandler.az(false);
            fragment.requireActivity().onBackPressed();
            BackPressHandler.az(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final Fragment fragment, final Function0 predicate, OnBackPressedDispatcher onBackPressedDispatcher, final Function1 onBackPressed, Composer composer, final int i2, final int i3) {
        int i5;
        boolean zE2;
        Object objIF;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerKN = composer.KN(-532078346);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(fragment) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(predicate) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= ((i3 & 2) == 0 && composerKN.E2(onBackPressedDispatcher)) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onBackPressed) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 2) != 0) {
                    OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerN = LocalOnBackPressedDispatcherOwner.f13286n.n(composerKN, LocalOnBackPressedDispatcherOwner.f13287t);
                    onBackPressedDispatcher = onBackPressedDispatcherOwnerN != null ? onBackPressedDispatcherOwnerN.getOnBackPressedDispatcher() : null;
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-532078346, i5, -1, "com.alightcreative.common.compose.ConditionalBackPressHandler (BackPressHandler.kt:51)");
                }
                composerKN.eF(-680192733);
                zE2 = ((i5 & 112) != 32) | ((i5 & 7168) == 2048) | composerKN.E2(fragment);
                objIF = composerKN.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: N.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I28.mUb(predicate, onBackPressed, fragment, (OnBackPressedCallback) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                O(onBackPressedDispatcher, (Function1) objIF, composerKN, (i5 >> 6) & 14, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                if ((i3 & 2) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composerKN.eF(-680192733);
                zE2 = ((i5 & 112) != 32) | ((i5 & 7168) == 2048) | composerKN.E2(fragment);
                objIF = composerKN.iF();
                if (!zE2) {
                    objIF = new Function1() { // from class: N.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I28.mUb(predicate, onBackPressed, fragment, (OnBackPressedCallback) obj);
                        }
                    };
                    composerKN.o(objIF);
                    composerKN.Xw();
                    O(onBackPressedDispatcher, (Function1) objIF, composerKN, (i5 >> 6) & 14, 0);
                    if (ComposerKt.v()) {
                    }
                }
            }
        }
        final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: N.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.gh(fragment, predicate, onBackPressedDispatcher2, onBackPressed, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 J2(State state) {
        return (Function1) state.getValue();
    }
}
