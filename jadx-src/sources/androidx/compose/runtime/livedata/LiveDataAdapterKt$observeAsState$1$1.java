package androidx.compose.runtime.livedata;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.view.LifecycleOwner;
import androidx.view.LiveData;
import androidx.view.Observer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "rl", "(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,70:1\n64#2,5:71\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n*L\n66#1:71,5\n*E\n"})
final class LiveDataAdapterKt$observeAsState$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MutableState f30885O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LiveData f30886n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f30887t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataAdapterKt$observeAsState$1$1(LiveData liveData, LifecycleOwner lifecycleOwner, MutableState mutableState) {
        super(1);
        this.f30886n = liveData;
        this.f30887t = lifecycleOwner;
        this.f30885O = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final MutableState mutableState = this.f30885O;
        final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.j
            @Override // androidx.view.Observer
            public final void onChanged(Object obj) {
                LiveDataAdapterKt$observeAsState$1$1.t(mutableState, obj);
            }
        };
        this.f30886n.mUb(this.f30887t, observer);
        final LiveData liveData = this.f30886n;
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void n() {
                liveData.HI(observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableState mutableState, Object obj) {
        mutableState.setValue(obj);
    }
}
