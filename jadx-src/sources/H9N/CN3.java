package H9N;

import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Colors f3805n;
    private static final ProvidableCompositionLocal rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ProvidableCompositionLocal f3806t;

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f3807n;

        j(Function2 function2) {
            this.f3807n = function2;
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
                ComposerKt.p5(-1239532949, i2, -1, "com.alightcreative.common.compose.theme.AlightTheme.<anonymous> (Theme.kt:38)");
            }
            MaterialThemeKt.n(CN3.f3805n, Fo.Ml.n(), null, this.f3807n, composer, 54, 4);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        long jKN = companion.KN();
        long jN = companion.n();
        long jKN2 = companion.KN();
        long jN2 = companion.n();
        f3805n = ColorsKt.nr(jKN, 0L, jKN2, 0L, companion.n(), aD.w6.nY(), 0L, jN, jN2, companion.KN(), companion.KN(), 0L, 2122, null);
        rl = CompositionLocalKt.Uo(new Function0() { // from class: H9N.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.Uo();
            }
        });
        f3806t = CompositionLocalKt.Uo(new Function0() { // from class: H9N.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.J2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function2 function2, int i2, Composer composer, int i3) {
        nr(function2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void nr(final Function2 content, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(-1643456725);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(content) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1643456725, i3, -1, "com.alightcreative.common.compose.theme.AlightTheme (Theme.kt:32)");
            }
            CompositionLocalKt.t(new ProvidedValue[]{rl.nr(Fo.n.t()), f3806t.nr(aD.n.n()), ElevationOverlayKt.nr().nr(null)}, ComposableLambdaKt.nr(-1239532949, true, new j(content), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: H9N.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CN3.O(content, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aD.j J2() {
        return aD.n.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fo.j Uo() {
        return Fo.n.t();
    }
}
