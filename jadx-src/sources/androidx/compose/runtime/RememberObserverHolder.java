package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "Landroidx/compose/runtime/RememberObserver;", "wrapped", "Landroidx/compose/runtime/Anchor;", TtmlNode.ANNOTATION_POSITION_AFTER, "<init>", "(Landroidx/compose/runtime/RememberObserver;Landroidx/compose/runtime/Anchor;)V", c.f62177j, "Landroidx/compose/runtime/RememberObserver;", "rl", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "(Landroidx/compose/runtime/RememberObserver;)V", "Landroidx/compose/runtime/Anchor;", "()Landroidx/compose/runtime/Anchor;", "setAfter", "(Landroidx/compose/runtime/Anchor;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RememberObserverHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private RememberObserver wrapped;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Anchor after;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Anchor getAfter() {
        return this.after;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public RememberObserverHolder(RememberObserver rememberObserver, Anchor anchor) {
        this.wrapped = rememberObserver;
        this.after = anchor;
    }
}
