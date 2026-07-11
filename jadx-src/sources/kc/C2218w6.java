package kc;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* JADX INFO: renamed from: kc.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2218w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2218w6 f70063n = new C2218w6();
    private static InterfaceC2215Ml rl = new j();

    /* JADX INFO: renamed from: kc.w6$j */
    public static final class j implements InterfaceC2215Ml {
        j() {
        }

        @Override // kc.InterfaceC2215Ml
        public boolean isInitialized() {
            return InneractiveAdManager.wasInitialized();
        }
    }

    public static final InterfaceC2215Ml n() {
        return rl;
    }

    private C2218w6() {
    }
}
