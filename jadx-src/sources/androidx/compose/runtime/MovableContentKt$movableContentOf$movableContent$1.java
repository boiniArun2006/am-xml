package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", c.f62177j, "(Ljava/lang/Void;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentOf$movableContent$1 extends Lambda implements Function3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function2 f30213n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        n((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void n(Void r3, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-514040016, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:36)");
        }
        this.f30213n.invoke(composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
