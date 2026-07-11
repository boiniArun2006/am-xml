package r4;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import r4.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E14.Ml f72783n;

        /* JADX INFO: renamed from: r4.Wre$j$j, reason: collision with other inner class name */
        static final class C1147j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ E14.Ml f72784n;

            C1147j(E14.Ml ml) {
                this.f72784n = ml;
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
                    ComposerKt.p5(1478201238, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecretMenuScreenContent.kt:34)");
                }
                TextKt.t(this.f72784n.rl(), PaddingKt.mUb(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(16), Dp.KN(8)), Color.INSTANCE.n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getHeadlineSmall(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(E14.Ml ml) {
            this.f72783n = ml;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope stickyHeader, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2010023355, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecretMenuScreenContent.kt:30)");
            }
            SurfaceKt.n(null, null, Color.INSTANCE.KN(), 0L, 0.0f, Dp.KN(4), null, ComposableLambdaKt.nr(1478201238, true, new C1147j(this.f72783n), composer, 54), composer, 12779904, 91);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E14.w6 f72785n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f72786t;

        n(E14.w6 w6Var, Function1 function1) {
            this.f72785n = w6Var;
            this.f72786t = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1658135361, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecretMenuScreenContent.kt:49)");
            }
            E14.w6 w6Var = this.f72785n;
            composer.eF(-2017552930);
            boolean zP5 = composer.p5(this.f72786t) | composer.p5(this.f72785n);
            final Function1 function1 = this.f72786t;
            final E14.w6 w6Var2 = this.f72785n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: r4.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.n.t(function1, w6Var2);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            w6.t(null, w6Var, (Function0) objIF, composer, 0, 1);
            DividerKt.rl(null, 0.0f, 0L, composer, 0, 7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, E14.w6 w6Var) {
            function1.invoke(w6Var.nr());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(List list, Function1 function1, int i2, Composer composer, int i3) {
        t(list, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(List list, Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E14.Ml ml = (E14.Ml) it.next();
            if (ml.rl() != null) {
                LazyListScope.t(LazyColumn, null, null, ComposableLambdaKt.rl(2010023355, true, new j(ml)), 3, null);
            }
            Iterator it2 = ml.n().iterator();
            while (it2.hasNext()) {
                LazyListScope.O(LazyColumn, null, null, ComposableLambdaKt.rl(1658135361, true, new n((E14.w6) it2.next(), function1)), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void t(final List state, final Function1 onItemClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Composer composerKN = composer.KN(583463861);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onItemClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(583463861, i3, -1, "com.bendingspoons.secretmenu.ui.mainscreen.compose.SecretMenuScreenContent (SecretMenuScreenContent.kt:25)");
            }
            composerKN.eF(-2092536168);
            boolean zE2 = composerKN.E2(state) | ((i3 & 112) == 32);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: r4.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Wre.nr(state, onItemClicked, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            LazyDslKt.t(null, null, null, false, null, null, null, false, (Function1) objIF, composerKN, 0, 255);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r4.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.O(state, onItemClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
