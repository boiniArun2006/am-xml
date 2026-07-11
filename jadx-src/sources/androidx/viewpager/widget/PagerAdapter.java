package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class PagerAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataSetObservable f42348n = new DataSetObservable();
    private DataSetObserver rl;

    public void HI(View view, int i2, Object obj) {
    }

    void Ik(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.rl = dataSetObserver;
        }
    }

    public int J2(Object obj) {
        return -1;
    }

    public float KN(int i2) {
        return 1.0f;
    }

    public abstract int O();

    public CharSequence Uo(int i2) {
        return null;
    }

    public void az(Parcelable parcelable, ClassLoader classLoader) {
    }

    public abstract boolean gh(View view, Object obj);

    public void r(View view) {
    }

    public void t(View view) {
    }

    public Parcelable ty() {
        return null;
    }

    public void Z(DataSetObserver dataSetObserver) {
        this.f42348n.unregisterObserver(dataSetObserver);
    }

    public void n(View view, int i2, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void qie(DataSetObserver dataSetObserver) {
        this.f42348n.registerObserver(dataSetObserver);
    }

    public Object xMQ(View view, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void ck(ViewGroup viewGroup, int i2, Object obj) {
        HI(viewGroup, i2, obj);
    }

    public Object mUb(ViewGroup viewGroup, int i2) {
        return xMQ(viewGroup, i2);
    }

    public void nr(ViewGroup viewGroup) {
        t(viewGroup);
    }

    public void o(ViewGroup viewGroup) {
        r(viewGroup);
    }

    public void rl(ViewGroup viewGroup, int i2, Object obj) {
        n(viewGroup, i2, obj);
    }
}
