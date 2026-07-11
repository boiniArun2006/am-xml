package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P1", "P2", "P3", "Lkotlin/Triple;", "it", "", c.f62177j, "(Lkotlin/Triple;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentOf$movableContent$3 extends Lambda implements Function3<Triple<Object, Object, Object>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function5 f30215n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Triple<Object, Object, Object> triple, Composer composer, Integer num) {
        n(triple, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Triple triple, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.p5(triple) : composer.E2(triple) ? 4 : 2;
        }
        if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1512228753, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:105)");
        }
        this.f30215n.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
