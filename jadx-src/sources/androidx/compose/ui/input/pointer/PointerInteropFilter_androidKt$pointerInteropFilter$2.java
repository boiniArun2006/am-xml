package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n1247#2,6:340\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n78#1:340,6\n*E\n"})
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f32126n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RequestDisallowInterceptTouchEvent f32127t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        composer.eF(374375707);
        if (ComposerKt.v()) {
            ComposerKt.p5(374375707, i2, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
        }
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new PointerInteropFilter();
            composer.o(objIF);
        }
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objIF;
        pointerInteropFilter.O(this.f32126n);
        pointerInteropFilter.J2(this.f32127t);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return pointerInteropFilter;
    }
}
