package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f42437n;

    private void J2(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void O(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f42437n.remove(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void n(int i2) {
        try {
            Iterator it = this.f42437n.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).n(i2);
            }
        } catch (ConcurrentModificationException e2) {
            J2(e2);
        }
    }

    void nr(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f42437n.add(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void rl(int i2, float f3, int i3) {
        try {
            Iterator it = this.f42437n.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).rl(i2, f3, i3);
            }
        } catch (ConcurrentModificationException e2) {
            J2(e2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void t(int i2) {
        try {
            Iterator it = this.f42437n.iterator();
            while (it.hasNext()) {
                ((ViewPager2.OnPageChangeCallback) it.next()).t(i2);
            }
        } catch (ConcurrentModificationException e2) {
            J2(e2);
        }
    }

    CompositeOnPageChangeCallback(int i2) {
        this.f42437n = new ArrayList(i2);
    }
}
