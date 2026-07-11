package androidx.window.sidecar;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/EmptyDecorator;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "<init>", "()V", "Landroidx/window/layout/WindowInfoTracker;", "tracker", c.f62177j, "(Landroidx/window/layout/WindowInfoTracker;)Landroidx/window/layout/WindowInfoTracker;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class EmptyDecorator implements WindowInfoTrackerDecorator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EmptyDecorator f42630n = new EmptyDecorator();

    @Override // androidx.window.sidecar.WindowInfoTrackerDecorator
    public WindowInfoTracker n(WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }

    private EmptyDecorator() {
    }
}
