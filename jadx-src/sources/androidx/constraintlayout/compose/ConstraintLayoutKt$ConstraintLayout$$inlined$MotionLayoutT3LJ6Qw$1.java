package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout-T3LJ6Qw$1, reason: invalid class name */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", c.f62177j, "(Landroidx/constraintlayout/compose/MotionLayoutScope;Landroidx/compose/runtime/Composer;I)V", "androidx/constraintlayout/compose/MotionLayoutKt$MotionLayout$contentDelegate$1"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt$MotionLayout$contentDelegate$1\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,166:1\n800#2:167\n*E\n"})
public final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1 extends Lambda implements Function3<MotionLayoutScope, Composer, Integer, Unit> {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref f34454O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableState f34455n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f34456r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ InvalidationStrategy f34457t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer, Integer num) {
        n(motionLayoutScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(MotionLayoutScope motionLayoutScope, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(284503157, i2, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.f34455n.setValue(Unit.INSTANCE);
        if (this.f34457t.getOnObservedStateChange() == null && this.f34454O.getValue() == CompositionSource.Unknown) {
            this.f34454O.rl(CompositionSource.Content);
        }
        composer.eF(-2075780874);
        this.J2.invoke(composer, Integer.valueOf((this.f34456r >> 15) & 14));
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
