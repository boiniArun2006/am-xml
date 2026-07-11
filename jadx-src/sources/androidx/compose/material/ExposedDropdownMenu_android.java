package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntRect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/WindowBoundsCalculator;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/WindowBoundsCalculator;", "Lkotlin/Function0;", "", "block", c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "Landroidx/compose/ui/unit/IntRect;", "t", "(Landroid/view/View;)Landroidx/compose/ui/unit/IntRect;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "ExposedDropdownMenu_android")
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n75#2:95\n75#2:102\n1247#3,6:96\n1247#3,6:103\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n*L\n37#1:95\n43#1:102\n38#1:96,6\n44#1:103,6\n*E\n"})
public final class ExposedDropdownMenu_android {
    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect t(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.nr(rect);
    }

    public static final void n(final Function0 function0, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(1063434120);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function0)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        boolean z3 = true;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1063434120, i3, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            final View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
            boolean zE2 = composerKN.E2(view);
            if ((i3 & 14) != 4) {
                z3 = false;
            }
            boolean z4 = zE2 | z3;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                onGlobalLayoutListener.n();
                            }
                        };
                    }
                };
                composerKN.o(objIF);
            }
            EffectsKt.rl(view, (Function1) objIF, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    ExposedDropdownMenu_android.n(function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final WindowBoundsCalculator nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1216067952, i2, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        View view = (View) composer.ty(AndroidCompositionLocals_androidKt.gh());
        boolean zP5 = composer.p5(view);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new WindowBoundsCalculator(view);
            composer.o(objIF);
        }
        WindowBoundsCalculator windowBoundsCalculator = (WindowBoundsCalculator) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowBoundsCalculator;
    }
}
