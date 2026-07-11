package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Cancel", "Press", "Release", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PressInteraction extends Interaction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Cancel;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", c.f62177j, "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancel implements PressInteraction {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Press press;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Press getPress() {
            return this.press;
        }

        public Cancel(Press press) {
            this.press = press;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/ui/geometry/Offset;", "pressPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Press implements PressInteraction {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final long pressPosition;

        public /* synthetic */ Press(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private Press(long j2) {
            this.pressPosition = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Release;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", c.f62177j, "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Release implements PressInteraction {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Press press;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Press getPress() {
            return this.press;
        }

        public Release(Press press) {
            this.press = press;
        }
    }
}
