package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "t", "()V", "Landroidx/compose/runtime/CompositionContext;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScope;", "rl", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "", c.f62177j, "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,465:1\n1247#2,6:466\n1247#2,6:472\n1247#2,6:478\n1247#2,6:484\n1247#2,6:490\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:466,6\n33#1:472,6\n47#1:478,6\n65#1:484,6\n85#1:490,6\n*E\n"})
public final class ComposablesKt {
    public static final void t() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final int n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(524444915, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
        }
        int iJB = composer.jB();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iJB;
    }

    public static final CompositionContext nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1165786124, i2, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
        }
        CompositionContext compositionContextU = composer.U();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return compositionContextU;
    }

    public static final RecomposeScope rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(394957799, i2, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
        }
        RecomposeScope recomposeScopeNY = composer.nY();
        if (recomposeScopeNY != null) {
            composer.bzg(recomposeScopeNY);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            return recomposeScopeNY;
        }
        throw new IllegalStateException("no recompose scope found");
    }
}
