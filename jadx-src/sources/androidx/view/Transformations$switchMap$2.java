package androidx.view;

import androidx.arch.core.util.Function;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/lifecycle/Transformations$switchMap$2", "Landroidx/lifecycle/Observer;", "value", "", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", c.f62177j, "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "liveData", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Transformations$switchMap$2 implements Observer {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MediatorLiveData f39002O;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private LiveData liveData;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function f39004t;

    @Override // androidx.view.Observer
    public void onChanged(Object value) {
        LiveData liveData = (LiveData) this.f39004t.apply(value);
        LiveData liveData2 = this.liveData;
        if (liveData2 == liveData) {
            return;
        }
        if (liveData2 != null) {
            MediatorLiveData mediatorLiveData = this.f39002O;
            Intrinsics.checkNotNull(liveData2);
            mediatorLiveData.r(liveData2);
        }
        this.liveData = liveData;
        if (liveData != null) {
            MediatorLiveData mediatorLiveData2 = this.f39002O;
            Intrinsics.checkNotNull(liveData);
            final MediatorLiveData mediatorLiveData3 = this.f39002O;
            mediatorLiveData2.Ik(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: androidx.lifecycle.aC
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Transformations$switchMap$2.rl(mediatorLiveData3, obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rl(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.ck(obj);
        return Unit.INSTANCE;
    }
}
