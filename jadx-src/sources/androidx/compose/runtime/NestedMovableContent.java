package androidx.compose.runtime;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@InternalComposeApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "Landroidx/compose/runtime/MovableContentStateReference;", AppLovinEventTypes.USER_VIEWED_CONTENT, TtmlNode.RUBY_CONTAINER, "<init>", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", c.f62177j, "Landroidx/compose/runtime/MovableContentStateReference;", "rl", "()Landroidx/compose/runtime/MovableContentStateReference;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class NestedMovableContent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MovableContentStateReference content;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MovableContentStateReference container;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final MovableContentStateReference getContent() {
        return this.content;
    }

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }
}
