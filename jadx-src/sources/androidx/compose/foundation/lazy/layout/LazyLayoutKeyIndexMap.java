package androidx.compose.foundation.lazy.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "key", "", "t", "(Ljava/lang/Object;)I", "index", "nr", "(I)Ljava/lang/Object;", "Empty", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyLayoutKeyIndexMap {
    Object nr(int index);

    int t(Object key);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap$Empty;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "<init>", "()V", "", "key", "", "t", "(Ljava/lang/Object;)I", "index", "", c.f62177j, "(I)Ljava/lang/Void;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Empty implements LazyLayoutKeyIndexMap {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Empty f18479n = new Empty();

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void nr(int index) {
            return null;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public int t(Object key) {
            return -1;
        }

        private Empty() {
        }
    }
}
