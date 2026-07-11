package androidx.view;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.view.SavedStateReader;
import androidx.view.SavedStateRegistry;
import androidx.view.SavedStateWriter;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", c.f62177j, "()Landroid/os/Bundle;", "", "O", "()V", "", "key", "t", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/SavedStateRegistry;", "", "rl", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/SavedStateHandlesVM;", "nr", "Lkotlin/Lazy;", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,240:1\n27#2:241\n46#2:242\n32#2,4:243\n31#2,7:253\n27#2:266\n46#2:267\n32#2,4:268\n31#2,7:278\n27#2:290\n46#2:291\n32#2,4:292\n31#2,7:302\n126#3:247\n153#3,3:248\n216#3:263\n217#3:265\n126#3:272\n153#3,3:273\n126#3:296\n153#3,3:297\n37#4,2:251\n37#4,2:276\n37#4,2:300\n1#5:260\n1#5:262\n1#5:285\n1#5:287\n1#5:309\n106#6:261\n90#6:264\n106#6:286\n90#6:288\n90#6:289\n106#6:310\n106#6:312\n90#6:313\n46#7:311\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n159#1:241\n159#1:242\n159#1:243,4\n159#1:253,7\n182#1:266\n182#1:267\n182#1:268,4\n182#1:278,7\n200#1:290\n200#1:291\n200#1:292,4\n200#1:302,7\n159#1:247\n159#1:248,3\n166#1:263\n166#1:265\n182#1:272\n182#1:273,3\n200#1:296\n200#1:297,3\n159#1:251,2\n182#1:276,2\n200#1:300,2\n159#1:260\n182#1:285\n200#1:309\n159#1:261\n168#1:264\n182#1:286\n198#1:288\n200#1:289\n200#1:310\n201#1:312\n202#1:313\n200#1:311\n*E\n"})
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SavedStateRegistry savedStateRegistry;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean restored;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = LazyKt.lazy(new Function0() { // from class: androidx.lifecycle.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavedStateHandlesProvider.J2(viewModelStoreOwner);
            }
        });
    }

    private final SavedStateHandlesVM nr() {
        return (SavedStateHandlesVM) this.viewModel.getValue();
    }

    public final void O() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleN = this.savedStateRegistry.n("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleN2 = BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleN3 = SavedStateWriter.n(bundleN2);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.nr(bundleN3, bundle);
        }
        if (bundleN != null) {
            SavedStateWriter.nr(bundleN3, bundleN);
        }
        this.restoredState = bundleN2;
        this.restored = true;
        nr();
    }

    public final Bundle t(String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        O();
        Bundle bundle = this.restoredState;
        if (bundle == null || !SavedStateReader.rl(SavedStateReader.n(bundle), key)) {
            return null;
        }
        Bundle bundleG = SavedStateReader.g(SavedStateReader.n(bundle), key);
        if (bundleG == null) {
            Map mapEmptyMap = MapsKt.emptyMap();
            if (mapEmptyMap.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                for (Map.Entry entry : mapEmptyMap.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleG = BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.n(bundleG);
        }
        SavedStateWriter.T(SavedStateWriter.n(bundle), key);
        if (SavedStateReader.s7N(SavedStateReader.n(bundle))) {
            this.restoredState = null;
        }
        return bundleG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateHandlesVM J2(ViewModelStoreOwner viewModelStoreOwner) {
        return SavedStateHandleSupport.O(viewModelStoreOwner);
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle n() {
        Pair[] pairArr;
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleN = BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleN2 = SavedStateWriter.n(bundleN);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.nr(bundleN2, bundle);
        }
        for (Map.Entry entry2 : nr().getHandles().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleN3 = ((SavedStateHandle) entry2.getValue()).O().n();
            if (!SavedStateReader.s7N(SavedStateReader.n(bundleN3))) {
                SavedStateWriter.g(bundleN2, str, bundleN3);
            }
        }
        this.restored = false;
        return bundleN;
    }
}
