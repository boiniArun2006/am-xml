package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "", "root", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;Z)V", c.f62177j, "Landroidx/compose/runtime/tooling/CompositionObserver;", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "t", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "rl", "Z", "()Z", "setRoot", "(Z)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CompositionObserverHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CompositionObserver observer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean root;

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z2) {
        this.observer = compositionObserver;
        this.root = z2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final CompositionObserver getObserver() {
        return this.observer;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getRoot() {
        return this.root;
    }

    public final void t(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : compositionObserver, (i2 & 2) != 0 ? false : z2);
    }
}
