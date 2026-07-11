package kc;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kc.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2217n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2217n f70062n = new C2217n();

    public static final InneractiveFullscreenUnitController n() {
        return new InneractiveFullscreenUnitController();
    }

    public static final NativeAdUnitController rl() {
        return new NativeAdUnitController();
    }

    public static final NativeAdVideoContentController t() {
        return new NativeAdVideoContentController();
    }

    private C2217n() {
    }

    public static final InneractiveAdSpot nr() {
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        Intrinsics.checkNotNullExpressionValue(inneractiveAdSpotCreateSpot, "createSpot(...)");
        return inneractiveAdSpotCreateSpot;
    }
}
