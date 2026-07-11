package androidx.view;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap qie = new SafeIterableMap();

    private static class Source<V> implements Observer<V> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f38930O = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final LiveData f38931n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Observer f38932t;

        void n() {
            this.f38931n.gh(this);
        }

        @Override // androidx.view.Observer
        public void onChanged(Object obj) {
            if (this.f38930O != this.f38931n.Uo()) {
                this.f38930O = this.f38931n.Uo();
                this.f38932t.onChanged(obj);
            }
        }

        void rl() {
            this.f38931n.HI(this);
        }

        Source(LiveData liveData, Observer observer) {
            this.f38931n = liveData;
            this.f38932t = observer;
        }
    }

    public void Ik(LiveData liveData, Observer observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source source = new Source(liveData, observer);
        Source source2 = (Source) this.qie.Uo(liveData, source);
        if (source2 != null && source2.f38932t != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (source2 == null && KN()) {
            source.n();
        }
    }

    @Override // androidx.view.LiveData
    protected void az() {
        Iterator it = this.qie.iterator();
        while (it.hasNext()) {
            ((Source) ((Map.Entry) it.next()).getValue()).rl();
        }
    }

    @Override // androidx.view.LiveData
    protected void qie() {
        Iterator it = this.qie.iterator();
        while (it.hasNext()) {
            ((Source) ((Map.Entry) it.next()).getValue()).n();
        }
    }

    public void r(LiveData liveData) {
        Source source = (Source) this.qie.KN(liveData);
        if (source != null) {
            source.rl();
        }
    }
}
