package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,498:1\n75#2:499\n1247#3,6:500\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n75#1:499\n84#1:500,6\n*E\n"})
final class ToggleableKt$toggleable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Role f19088O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f19089n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f19090t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.eF(290332169);
        if (ComposerKt.v()) {
            ComposerKt.p5(290332169, i2, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
        }
        Indication indication = (Indication) composer.ty(IndicationKt.n());
        if (indication instanceof IndicationNodeFactory) {
            composer.eF(-2130062114);
            composer.Xw();
            mutableInteractionSource = null;
        } else {
            composer.eF(-2129929496);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = InteractionSourceKt.n();
                composer.o(objIF);
            }
            mutableInteractionSource = (MutableInteractionSource) objIF;
            composer.Xw();
        }
        Modifier modifierN = ToggleableKt.n(Modifier.INSTANCE, this.f19089n, mutableInteractionSource, indication, this.f19090t, this.f19088O, this.J2);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierN;
    }
}
