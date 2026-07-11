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

/* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1, reason: invalid class name */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "androidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,1327:1\n1247#2,6:1328\n433#3,12:1334\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickableWithIndicationIfNeeded$1\n*L\n474#1:1328,6\n*E\n"})
public final class ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Role J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ String f16033O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function0 f16034S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function0 f16035Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Indication f16036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f16037o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f16038r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f16039t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        composer.eF(-1525724089);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
        }
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = InteractionSourceKt.n();
            composer.o(objIF);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
        Modifier modifierZmq = IndicationKt.rl(Modifier.INSTANCE, mutableInteractionSource, this.f16036n).Zmq(new CombinedClickableElement(mutableInteractionSource, null, this.f16039t, this.f16033O, this.J2, this.f16038r, this.f16037o, this.f16035Z, this.f16034S, true, null));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierZmq;
    }
}
