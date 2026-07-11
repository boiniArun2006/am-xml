package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AsyncListDiffer<T> {
    private static final Executor KN = new MainThreadExecutor();
    private List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f40973O;
    int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ListUpdateCallback f40974n;
    private final List nr;
    final AsyncDifferConfig rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Executor f40975t;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f40976O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f40977n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AsyncListDiffer f40978r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f40979t;

        @Override // java.lang.Runnable
        public void run() {
            final DiffUtil.DiffResult diffResultRl = DiffUtil.rl(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int O() {
                    return AnonymousClass1.this.f40977n.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean n(int i2, int i3) {
                    Object obj = AnonymousClass1.this.f40977n.get(i2);
                    Object obj2 = AnonymousClass1.this.f40979t.get(i3);
                    if (obj != null && obj2 != null) {
                        return AnonymousClass1.this.f40978r.rl.n().n(obj, obj2);
                    }
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int nr() {
                    return AnonymousClass1.this.f40979t.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean rl(int i2, int i3) {
                    Object obj = AnonymousClass1.this.f40977n.get(i2);
                    Object obj2 = AnonymousClass1.this.f40979t.get(i3);
                    return (obj == null || obj2 == null) ? obj == null && obj2 == null : AnonymousClass1.this.f40978r.rl.n().rl(obj, obj2);
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public Object t(int i2, int i3) {
                    Object obj = AnonymousClass1.this.f40977n.get(i2);
                    Object obj2 = AnonymousClass1.this.f40979t.get(i3);
                    if (obj == null || obj2 == null) {
                        throw new AssertionError();
                    }
                    return AnonymousClass1.this.f40978r.rl.n().t(obj, obj2);
                }
            });
            this.f40978r.f40975t.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    AsyncListDiffer asyncListDiffer = anonymousClass1.f40978r;
                    if (asyncListDiffer.Uo == anonymousClass1.f40976O) {
                        asyncListDiffer.rl(anonymousClass1.f40979t, diffResultRl, anonymousClass1.J2);
                    }
                }
            });
        }
    }

    public interface ListListener<T> {
        void n(List list, List list2);
    }

    private static class MainThreadExecutor implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Handler f40983n = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f40983n.post(runnable);
        }

        MainThreadExecutor() {
        }
    }

    private void t(List list, Runnable runnable) {
        Iterator it = this.nr.iterator();
        while (it.hasNext()) {
            ((ListListener) it.next()).n(list, this.J2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public List n() {
        return this.J2;
    }

    void rl(List list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List list2 = this.J2;
        this.f40973O = list;
        this.J2 = Collections.unmodifiableList(list);
        diffResult.rl(this.f40974n);
        t(list2, runnable);
    }
}
