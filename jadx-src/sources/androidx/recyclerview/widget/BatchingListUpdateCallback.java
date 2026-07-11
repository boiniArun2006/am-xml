package androidx.recyclerview.widget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ListUpdateCallback f40992n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f40994t = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f40991O = -1;
    int J2 = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f40993r = null;

    public void O() {
        int i2 = this.f40994t;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.f40992n.n(this.f40991O, this.J2);
        } else if (i2 == 2) {
            this.f40992n.rl(this.f40991O, this.J2);
        } else if (i2 == 3) {
            this.f40992n.t(this.f40991O, this.J2, this.f40993r);
        }
        this.f40993r = null;
        this.f40994t = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void n(int i2, int i3) {
        int i5;
        if (this.f40994t == 1 && i2 >= (i5 = this.f40991O)) {
            int i7 = this.J2;
            if (i2 <= i5 + i7) {
                this.J2 = i7 + i3;
                this.f40991O = Math.min(i2, i5);
                return;
            }
        }
        O();
        this.f40991O = i2;
        this.J2 = i3;
        this.f40994t = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void rl(int i2, int i3) {
        int i5;
        if (this.f40994t == 2 && (i5 = this.f40991O) >= i2 && i5 <= i2 + i3) {
            this.J2 += i3;
            this.f40991O = i2;
        } else {
            O();
            this.f40991O = i2;
            this.J2 = i3;
            this.f40994t = 2;
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void t(int i2, int i3, Object obj) {
        int i5;
        if (this.f40994t == 3) {
            int i7 = this.f40991O;
            int i8 = this.J2;
            if (i2 <= i7 + i8 && (i5 = i2 + i3) >= i7 && this.f40993r == obj) {
                this.f40991O = Math.min(i2, i7);
                this.J2 = Math.max(i8 + i7, i5) - this.f40991O;
                return;
            }
        }
        O();
        this.f40991O = i2;
        this.J2 = i3;
        this.f40993r = obj;
        this.f40994t = 3;
    }

    public BatchingListUpdateCallback(ListUpdateCallback listUpdateCallback) {
        this.f40992n = listUpdateCallback;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void nr(int i2, int i3) {
        O();
        this.f40992n.nr(i2, i3);
    }
}
