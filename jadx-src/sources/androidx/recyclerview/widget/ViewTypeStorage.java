package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SparseArray f41244n;
        int rl;

        class WrapperViewTypeLookup implements ViewTypeLookup {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private SparseIntArray f41245n;
            final /* synthetic */ IsolatedViewTypeStorage nr;
            private SparseIntArray rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final NestedAdapterWrapper f41246t;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int n(int i2) {
                int iIndexOfKey = this.rl.indexOfKey(i2);
                if (iIndexOfKey >= 0) {
                    return this.rl.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.f41246t.f41140t);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int rl(int i2) {
                int iIndexOfKey = this.f41245n.indexOfKey(i2);
                if (iIndexOfKey > -1) {
                    return this.f41245n.valueAt(iIndexOfKey);
                }
                int iRl = this.nr.rl(this.f41246t);
                this.f41245n.put(i2, iRl);
                this.rl.put(iRl, i2);
                return iRl;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper n(int i2) {
            NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.f41244n.get(i2);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
        }

        int rl(NestedAdapterWrapper nestedAdapterWrapper) {
            int i2 = this.rl;
            this.rl = i2 + 1;
            this.f41244n.put(i2, nestedAdapterWrapper);
            return i2;
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SparseArray f41247n;

        class WrapperViewTypeLookup implements ViewTypeLookup {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final NestedAdapterWrapper f41248n;
            final /* synthetic */ SharedIdRangeViewTypeStorage rl;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int n(int i2) {
                return i2;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int rl(int i2) {
                List arrayList = (List) this.rl.f41247n.get(i2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.rl.f41247n.put(i2, arrayList);
                }
                if (!arrayList.contains(this.f41248n)) {
                    arrayList.add(this.f41248n);
                }
                return i2;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper n(int i2) {
            List list = (List) this.f41247n.get(i2);
            if (list != null && !list.isEmpty()) {
                return (NestedAdapterWrapper) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
        }
    }

    public interface ViewTypeLookup {
        int n(int i2);

        int rl(int i2);
    }

    NestedAdapterWrapper n(int i2);
}
