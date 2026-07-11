package uW;

import androidx.view.Lifecycle;
import androidx.view.LiveData;
import androidx.view.MutableLiveData;
import androidx.view.ViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 extends ViewModel {
    private final MutableLiveData J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f74428O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f74429n;
    private final LiveData nr;
    private Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MutableLiveData f74430t;

    public void O(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }

    public abstract void Uo();

    public w6(Function1 mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f74429n = mapper;
        Object obj = this.rl;
        MutableLiveData mutableLiveData = new MutableLiveData(obj != null ? mapper.invoke(obj) : null);
        this.f74430t = mutableLiveData;
        this.nr = mutableLiveData;
        this.J2 = new MutableLiveData(CollectionsKt.emptyList());
    }

    public final void J2() {
        List list = (List) this.J2.J2();
        if (list != null) {
            List mutableList = CollectionsKt.toMutableList((Collection) list);
            CollectionsKt.removeFirstOrNull(mutableList);
            this.J2.ck(mutableList);
        }
    }

    public final void KN(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        O(lifecycle);
        if (this.f74428O) {
            return;
        }
        this.f74428O = true;
        Uo();
    }

    public final void gh(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object obj = this.rl;
        if (obj != null) {
            block.invoke(obj);
        }
    }

    public final void mUb(Object obj) {
        if (obj != null) {
            this.rl = obj;
            this.f74430t.ck(this.f74429n.invoke(obj));
        }
    }

    public final Object nr() {
        return this.rl;
    }

    public final LiveData rl() {
        return this.J2;
    }

    public final LiveData t() {
        return this.nr;
    }

    public final void xMQ(Object obj) {
        List list = (List) this.J2.J2();
        if (list != null) {
            List mutableList = CollectionsKt.toMutableList((Collection) list);
            mutableList.add(obj);
            this.J2.ck(mutableList);
        }
    }
}
