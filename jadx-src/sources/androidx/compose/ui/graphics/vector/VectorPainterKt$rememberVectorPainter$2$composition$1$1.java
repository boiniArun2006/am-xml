package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$composition$1$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,474:1\n57#2:475\n61#2:478\n60#3:476\n70#3:479\n22#4:477\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$composition$1$1\n*L\n155#1:475\n155#1:478\n155#1:476\n155#1:479\n155#1:477\n*E\n"})
final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function4 f31902n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f31903t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        n(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Composer composer, int i2) {
        if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(2008312779, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
        }
        this.f31902n.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.f31903t >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.f31903t & 4294967295L))), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
