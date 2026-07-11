package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.sidecar.FoldingFeature;
import androidx.window.sidecar.HardwareFoldingFeature;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/window/core/Bounds;", "bounds", "", "t", "(Landroid/app/Activity;Landroidx/window/core/Bounds;)Z", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/FoldingFeature;", c.f62177j, "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/FoldingFeature;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/WindowLayoutInfo;", "rl", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionsWindowLayoutInfoAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExtensionsWindowLayoutInfoAdapter f42636n = new ExtensionsWindowLayoutInfoAdapter();

    private final boolean t(Activity activity, Bounds bounds) {
        Rect rectN = WindowMetricsCalculatorCompat.rl.n(activity).n();
        if (bounds.O()) {
            return false;
        }
        if (bounds.nr() != rectN.width() && bounds.n() != rectN.height()) {
            return false;
        }
        if (bounds.nr() >= rectN.width() || bounds.n() >= rectN.height()) {
            return (bounds.nr() == rectN.width() && bounds.n() == rectN.height()) ? false : true;
        }
        return false;
    }

    public final FoldingFeature n(Activity activity, FoldingFeature oemFeature) {
        HardwareFoldingFeature.Type typeN;
        FoldingFeature.State state;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            typeN = HardwareFoldingFeature.Type.INSTANCE.n();
        } else {
            if (type != 2) {
                return null;
            }
            typeN = HardwareFoldingFeature.Type.INSTANCE.rl();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.f42641t;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.nr;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (!t(activity, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds2), typeN, state);
    }

    public final WindowLayoutInfo rl(Activity activity, WindowLayoutInfo info) {
        FoldingFeature foldingFeatureN;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = f42636n;
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                foldingFeatureN = extensionsWindowLayoutInfoAdapter.n(activity, feature);
            } else {
                foldingFeatureN = null;
            }
            if (foldingFeatureN != null) {
                arrayList.add(foldingFeatureN);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }

    private ExtensionsWindowLayoutInfoAdapter() {
    }
}
