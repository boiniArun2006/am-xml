package androidx.view.internal;

import TFv.Lu;
import TFv.SPz;
import TFv.fuX;
import TFv.rv6;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.view.SavedStateRegistry;
import androidx.view.SavedStateWriter;
import androidx.view.internal.SavedStateHandleImpl;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R(\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R+\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010+\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "key", "", "rl", "(Ljava/lang/String;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "LTFv/rv6;", "Uo", "(Ljava/lang/String;Ljava/lang/Object;)LTFv/rv6;", "LTFv/SPz;", "O", "(Ljava/lang/String;Ljava/lang/Object;)LTFv/SPz;", "t", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "mUb", "(Ljava/lang/String;Ljava/lang/Object;)V", "KN", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "gh", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "", c.f62177j, "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "regular", "providers", "flows", "nr", "mutableFlows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "J2", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateHandleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,129:1\n381#2,7:130\n381#2,7:137\n27#3:144\n46#3:145\n32#3,4:146\n31#3,7:156\n126#4:150\n153#4,3:151\n37#5,2:154\n1#6:163\n106#7:164\n46#8:165\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n*L\n60#1:130,7\n76#1:137,7\n47#1:144\n47#1:145\n47#1:146,4\n47#1:156,7\n47#1:150\n47#1:151,3\n47#1:154,2\n47#1:163\n47#1:164\n47#1:165\n*E\n"})
public final class SavedStateHandleImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map regular;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Map mutableFlows;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map providers;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Map flows;

    public SavedStateHandleImpl(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = MapsKt.toMutableMap(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: n7.j
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle n() {
                return SavedStateHandleImpl.xMQ(this.f71004n);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle xMQ(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.mUb((String) entry.getKey(), ((SPz) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.mUb((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).n());
        }
        Map map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleN = BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.n(bundleN);
        return bundleN;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final Object KN(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objRemove = this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return objRemove;
    }

    public final SPz O(String key, Object initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = this.mutableFlows;
        Object objN = map.get(key);
        if (objN == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            objN = Lu.n(this.regular.get(key));
            map.put(key, objN);
        }
        SPz sPz = (SPz) objN;
        Intrinsics.checkNotNull(sPz, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return sPz;
    }

    public final rv6 Uo(String key, Object initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = this.flows;
        Object objN = map.get(key);
        if (objN == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            objN = Lu.n(this.regular.get(key));
            map.put(key, objN);
        }
        rv6 rv6VarT = fuX.t((SPz) objN);
        Intrinsics.checkNotNull(rv6VarT, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return rv6VarT;
    }

    public final void gh(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.providers.put(key, provider);
    }

    public final void mUb(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        SPz sPz = (SPz) this.flows.get(key);
        if (sPz != null) {
            sPz.setValue(value);
        }
        SPz sPz2 = (SPz) this.mutableFlows.get(key);
        if (sPz2 != null) {
            sPz2.setValue(value);
        }
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Map getMutableFlows() {
        return this.mutableFlows;
    }

    public final boolean rl(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    public final Object t(String key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SPz sPz = (SPz) this.mutableFlows.get(key);
            if (sPz != null && (value = sPz.getValue()) != null) {
                return value;
            }
            return this.regular.get(key);
        } catch (ClassCastException unused) {
            KN(key);
            return null;
        }
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
