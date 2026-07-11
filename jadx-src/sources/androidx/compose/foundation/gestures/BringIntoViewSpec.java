package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "", "offset", "size", "containerSize", c.f62177j, "(FFF)F", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BringIntoViewSpec {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16581n;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "<init>", "()V", "", "offset", "size", "containerSize", c.f62177j, "(FFF)F", "Landroidx/compose/animation/core/AnimationSpec;", "rl", "Landroidx/compose/animation/core/AnimationSpec;", "t", "()Landroidx/compose/animation/core/AnimationSpec;", "DefaultScrollAnimationSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f16581n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final AnimationSpec DefaultScrollAnimationSpec = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
        };

        public final float n(float offset, float size, float containerSize) {
            float f3 = size + offset;
            if (offset >= 0.0f && f3 <= containerSize) {
                return 0.0f;
            }
            if (offset < 0.0f && f3 > containerSize) {
                return 0.0f;
            }
            float f4 = f3 - containerSize;
            return Math.abs(offset) < Math.abs(f4) ? offset : f4;
        }

        public final BringIntoViewSpec rl() {
            return DefaultBringIntoViewSpec;
        }

        public final AnimationSpec t() {
            return DefaultScrollAnimationSpec;
        }

        private Companion() {
        }
    }

    default float n(float offset, float size, float containerSize) {
        return INSTANCE.n(offset, size, containerSize);
    }
}
