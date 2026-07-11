package androidx.window.sidecar;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "", "rl", "()Z", "isSeparating", "Landroidx/window/layout/FoldingFeature$Orientation;", c.f62177j, "()Landroidx/window/layout/FoldingFeature$Orientation;", "orientation", "OcclusionType", "Orientation", "State", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FoldingFeature extends DisplayFeature {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", c.f62177j, "Ljava/lang/String;", "rl", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class OcclusionType {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final OcclusionType f42637t = new OcclusionType("NONE");
        public static final OcclusionType nr = new OcclusionType("FULL");

        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        private OcclusionType(String str) {
            this.description = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", c.f62177j, "Ljava/lang/String;", "rl", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Orientation {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Orientation f42639t = new Orientation("VERTICAL");
        public static final Orientation nr = new Orientation("HORIZONTAL");

        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        private Orientation(String str) {
            this.description = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", c.f62177j, "Ljava/lang/String;", "rl", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class State {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final State f42641t = new State("FLAT");
        public static final State nr = new State("HALF_OPENED");

        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        private State(String str) {
            this.description = str;
        }
    }

    Orientation n();

    boolean rl();
}
