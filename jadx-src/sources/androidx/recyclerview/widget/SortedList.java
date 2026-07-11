package androidx.recyclerview.widget;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class SortedList<T> {

    public static class BatchedCallback<T2> extends Callback<T2> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Callback f41200n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final BatchingListUpdateCallback f41201t;

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void O(int i2, int i3) {
            this.f41201t.t(i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return this.f41200n.compare(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void n(int i2, int i3) {
            this.f41201t.n(i2, i3);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void nr(int i2, int i3) {
            this.f41201t.nr(i2, i3);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void rl(int i2, int i3) {
            this.f41201t.rl(i2, i3);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void t(int i2, int i3, Object obj) {
            this.f41201t.t(i2, i3, obj);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract void O(int i2, int i3);

        @Override // java.util.Comparator
        public abstract int compare(Object obj, Object obj2);

        public void t(int i2, int i3, Object obj) {
            O(i2, i3);
        }
    }
}
