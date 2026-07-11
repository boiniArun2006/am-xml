package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
interface StableIdStorage {

    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f41203n;

        class WrapperStableIdLookup implements StableIdLookup {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final LongSparseArray f41204n;
            final /* synthetic */ IsolatedStableIdStorage rl;

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long n(long j2) {
                Long lValueOf = (Long) this.f41204n.O(j2);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(this.rl.n());
                    this.f41204n.gh(j2, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        long n() {
            long j2 = this.f41203n;
            this.f41203n = 1 + j2;
            return j2;
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1, reason: invalid class name */
        class AnonymousClass1 implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long n(long j2) {
                return -1L;
            }
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1, reason: invalid class name */
        class AnonymousClass1 implements StableIdLookup {
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long n(long j2) {
                return j2;
            }
        }
    }

    public interface StableIdLookup {
        long n(long j2);
    }
}
