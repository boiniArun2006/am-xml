package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/ExitAlwaysScrollBehavior;", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "Landroidx/compose/material3/BottomAppBarState;", c.f62177j, "Landroidx/compose/material3/BottomAppBarState;", "getState", "()Landroidx/compose/material3/BottomAppBarState;", "state", "Landroidx/compose/animation/core/AnimationSpec;", "", "rl", "Landroidx/compose/animation/core/AnimationSpec;", "t", "()Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Lkotlin/Function0;", "", "nr", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "canScroll", "O", "Z", "()Z", "isPinned", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExitAlwaysScrollBehavior implements BottomAppBarScrollBehavior {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final BottomAppBarState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function0 canScroll;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AnimationSpec snapAnimationSpec;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final DecayAnimationSpec flingAnimationSpec;

    /* JADX INFO: renamed from: androidx.compose.material3.ExitAlwaysScrollBehavior$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f25724n = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public BottomAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function0 getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* JADX INFO: renamed from: rl, reason: from getter */
    public DecayAnimationSpec getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* JADX INFO: renamed from: t, reason: from getter */
    public AnimationSpec getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }
}
