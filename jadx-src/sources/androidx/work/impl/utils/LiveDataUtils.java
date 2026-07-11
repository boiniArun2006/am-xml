package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.view.MediatorLiveData;
import androidx.view.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class LiveDataUtils {

    /* JADX INFO: renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass1 implements Observer<Object> {
        final /* synthetic */ Function J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f42986O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f42987n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MediatorLiveData f42988r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TaskExecutor f42989t;

        @Override // androidx.view.Observer
        public void onChanged(final Object obj) {
            this.f42989t.rl(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AnonymousClass1.this.f42986O) {
                        try {
                            Object objApply = AnonymousClass1.this.J2.apply(obj);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj2 = anonymousClass1.f42987n;
                            if (obj2 == null && objApply != null) {
                                anonymousClass1.f42987n = objApply;
                                anonymousClass1.f42988r.ty(objApply);
                            } else if (obj2 != null && !obj2.equals(objApply)) {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                anonymousClass12.f42987n = objApply;
                                anonymousClass12.f42988r.ty(objApply);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }
}
