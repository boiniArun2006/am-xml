package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.view.SavedStateHandle;
import androidx.view.ViewModel;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "", "onCleared", "()V", "", c.f62177j, "Ljava/lang/String;", "IdKey", "Ljava/util/UUID;", "rl", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "t", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "nr", "(Ljava/lang/ref/WeakReference;)V", "saveableStateHolderRef", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class BackStackEntryIdViewModel extends ViewModel {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public WeakReference saveableStateHolderRef;

    public final void nr(WeakReference weakReference) {
        this.saveableStateHolderRef = weakReference;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WeakReference t() {
        WeakReference weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        UUID uuidRandomUUID = (UUID) savedStateHandle.t("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            savedStateHandle.J2("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.id = uuidRandomUUID;
    }

    @Override // androidx.view.ViewModel
    protected void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) t().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.t(this.id);
        }
        t().clear();
    }
}
