package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "XQ", "Key", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SnapshotContextElement extends CoroutineContext.Element {

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f30946n;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object n(SnapshotContextElement snapshotContextElement, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(snapshotContextElement, obj, function2);
        }

        public static CoroutineContext nr(SnapshotContextElement snapshotContextElement, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(snapshotContextElement, coroutineContext);
        }

        public static CoroutineContext.Element rl(SnapshotContextElement snapshotContextElement, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(snapshotContextElement, key);
        }

        public static CoroutineContext t(SnapshotContextElement snapshotContextElement, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(snapshotContextElement, key);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotContextElement$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<SnapshotContextElement> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f30946n = new Companion();

        private Companion() {
        }
    }
}
