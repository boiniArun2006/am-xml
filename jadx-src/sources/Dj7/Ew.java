package Dj7;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ew {

    public static final class j implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f1614n;

        public j(View view) {
            this.f1614n = view;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f1614n.setKeepScreenOn(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(int i2, Composer composer, int i3) {
        t(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult nr(View view, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        view.setKeepScreenOn(true);
        return new j(view);
    }

    public static final void t(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-2117024352);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2117024352, i2, -1, "com.alightcreative.common.compose.components.KeepScreenOn (KeepScreenOn.kt:8)");
            }
            final View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
            Unit unit = Unit.INSTANCE;
            composerKN.eF(1200610528);
            boolean zE2 = composerKN.E2(view);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: Dj7.afx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ew.nr(view, (DisposableEffectScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            EffectsKt.rl(unit, (Function1) objIF, composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.Z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ew.O(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
