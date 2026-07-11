package androidx.constraintlayout.core;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class Pools {

    interface Pool<T> {
        Object acquire();

        boolean n(Object obj);

        void rl(Object[] objArr, int i2);
    }

    static class SimplePool<T> implements Pool<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object[] f34997n;
        private int rl;

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void rl(Object[] objArr, int i2) {
            if (i2 > objArr.length) {
                i2 = objArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                int i5 = this.rl;
                Object[] objArr2 = this.f34997n;
                if (i5 < objArr2.length) {
                    objArr2[i5] = obj;
                    this.rl = i5 + 1;
                }
            }
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public Object acquire() {
            int i2 = this.rl;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f34997n;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.rl = i2 - 1;
            return obj;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean n(Object obj) {
            int i2 = this.rl;
            Object[] objArr = this.f34997n;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = obj;
            this.rl = i2 + 1;
            return true;
        }

        SimplePool(int i2) {
            if (i2 > 0) {
                this.f34997n = new Object[i2];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }
}
