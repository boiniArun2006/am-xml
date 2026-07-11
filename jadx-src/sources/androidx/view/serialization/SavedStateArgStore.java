package androidx.view.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.view.NavType;
import androidx.view.SavedStateHandle;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/serialization/SavedStateArgStore;", "Landroidx/navigation/serialization/ArgStore;", "", "key", "", "rl", "(Ljava/lang/String;)Ljava/lang/Object;", "", c.f62177j, "(Ljava/lang/String;)Z", "Landroidx/lifecycle/SavedStateHandle;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", "Landroidx/navigation/NavType;", "Ljava/util/Map;", "typeMap", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateArgStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
final class SavedStateArgStore extends ArgStore {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SavedStateHandle handle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map typeMap;

    @Override // androidx.view.serialization.ArgStore
    public boolean n(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.handle.rl(key);
    }

    @Override // androidx.view.serialization.ArgStore
    public Object rl(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleN = BundleKt.n(TuplesKt.to(key, this.handle.t(key)));
        Object obj = this.typeMap.get(key);
        if (obj != null) {
            return ((NavType) obj).n(bundleN, key);
        }
        throw new IllegalStateException(("Failed to find type for " + key + " when decoding " + this.handle).toString());
    }
}
