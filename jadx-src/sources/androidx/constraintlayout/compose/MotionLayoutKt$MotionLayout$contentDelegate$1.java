package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", c.f62177j, "(Landroidx/constraintlayout/compose/MotionLayoutScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
public final class MotionLayoutKt$MotionLayout$contentDelegate$1 extends Lambda implements Function3<MotionLayoutScope, Composer, Integer, Unit> {
    final /* synthetic */ Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref f34704O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableState f34705n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ InvalidationStrategy f34706t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer, Integer num) {
        n(motionLayoutScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(MotionLayoutScope motionLayoutScope, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(284503157, i2, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.f34705n.setValue(Unit.INSTANCE);
        if (this.f34706t.getOnObservedStateChange() == null && this.f34704O.getValue() == CompositionSource.Unknown) {
            this.f34704O.rl(CompositionSource.Content);
        }
        this.J2.invoke(motionLayoutScope, composer, Integer.valueOf(i2 & 14));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
