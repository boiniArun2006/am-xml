package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public abstract class StatusRunnable<T> implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SettableFuture f43005n;

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass1 extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f43006O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f43007t;

        @Override // androidx.work.impl.utils.StatusRunnable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public List n() {
            return (List) WorkSpec.f42947Z.apply(this.f43007t.HI().GR().g(this.f43006O));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass2 extends StatusRunnable<WorkInfo> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ UUID f43008O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f43009t;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public WorkInfo n() {
            WorkSpec.WorkInfoPojo workInfoPojoKN = this.f43009t.HI().GR().KN(this.f43008O.toString());
            if (workInfoPojoKN != null) {
                return workInfoPojoKN.n();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass3 extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f43010O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f43011t;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public List n() {
            return (List) WorkSpec.f42947Z.apply(this.f43011t.HI().GR().aYN(this.f43010O));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$4, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass4 extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f43012O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f43013t;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public List n() {
            return (List) WorkSpec.f42947Z.apply(this.f43013t.HI().GR().az(this.f43012O));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$5, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass5 extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ WorkQuery f43014O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f43015t;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public List n() {
            return (List) WorkSpec.f42947Z.apply(this.f43015t.HI().J().n(RawQueries.rl(this.f43014O)));
        }
    }

    abstract Object n();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f43005n.HI(n());
        } catch (Throwable th) {
            this.f43005n.ck(th);
        }
    }
}
