package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P1", "P2", "P3", "P4", "", "", "<name for destructuring parameter 0>", "", c.f62177j, "([Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentOf$movableContent$4 extends Lambda implements Function3<Object[], Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function6 f30216n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Composer composer, Integer num) {
        n(objArr, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Object[] objArr, Composer composer, int i2) {
        if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1900160788, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:133)");
        }
        this.f30216n.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
