package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1327:1\n75#2:1328\n1247#3,6:1329\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n*L\n313#1:1328\n322#1:1329,6\n*E\n"})
final class ClickableKt$combinedClickable$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Role f16027O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function0 f16028Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f16029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f16030o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f16031r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f16032t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.eF(1969174843);
        if (ComposerKt.v()) {
            ComposerKt.p5(1969174843, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:312)");
        }
        Indication indication = (Indication) composer.ty(IndicationKt.n());
        if (indication instanceof IndicationNodeFactory) {
            composer.eF(-1724200443);
            composer.Xw();
            mutableInteractionSource = null;
        } else {
            composer.eF(-1724067825);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = InteractionSourceKt.n();
                composer.o(objIF);
            }
            mutableInteractionSource = (MutableInteractionSource) objIF;
            composer.Xw();
        }
        Modifier modifierUo = ClickableKt.Uo(Modifier.INSTANCE, mutableInteractionSource, indication, this.f16029n, this.f16032t, this.f16027O, this.J2, this.f16031r, this.f16030o, true, this.f16028Z);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierUo;
    }
}
