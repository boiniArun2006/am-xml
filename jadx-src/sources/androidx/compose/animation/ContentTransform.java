package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "Landroidx/compose/animation/EnterTransition;", "targetContentEnter", "Landroidx/compose/animation/ExitTransition;", "initialContentExit", "", "targetContentZIndex", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "<init>", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", c.f62177j, "Landroidx/compose/animation/EnterTransition;", "t", "()Landroidx/compose/animation/EnterTransition;", "rl", "Landroidx/compose/animation/ExitTransition;", "()Landroidx/compose/animation/ExitTransition;", "<set-?>", "Landroidx/compose/runtime/MutableFloatState;", "nr", "()F", "setTargetContentZIndex", "(F)V", "Landroidx/compose/animation/SizeTransform;", "()Landroidx/compose/animation/SizeTransform;", "O", "(Landroidx/compose/animation/SizeTransform;)V", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,958:1\n79#2:959\n112#2,2:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n197#1:959\n197#1:960,2\n*E\n"})
public final class ContentTransform {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnterTransition targetContentEnter;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private SizeTransform sizeTransform;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ExitTransition initialContentExit;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState targetContentZIndex;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f3, SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex = PrimitiveSnapshotStateKt.n(f3);
        this.sizeTransform = sizeTransform;
    }

    public final void O(SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public final float nr() {
        return this.targetContentZIndex.n();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f3, SizeTransform sizeTransform, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransition, exitTransition, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? AnimatedContentKt.nr(false, null, 3, null) : sizeTransform);
    }
}
