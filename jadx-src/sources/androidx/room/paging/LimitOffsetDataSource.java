package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: androidx.room.paging.LimitOffsetDataSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass1 extends InvalidationTracker.Observer {
        final /* synthetic */ LimitOffsetDataSource rl;

        @Override // androidx.room.InvalidationTracker.Observer
        public void t(Set set) {
            this.rl.invalidate();
        }
    }
}
