package WS;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements Ml {

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f11512n;

        static {
            int[] iArr = new int[WS.j.values().length];
            f11512n = iArr;
            try {
                iArr[WS.j.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // WS.Ml
    public b1b.n n(String str, WS.j jVar, int i2, int i3, Map map) {
        if (j.f11512n[jVar.ordinal()] == 1) {
            return new X5.j().n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("No encoder available for format " + jVar);
    }
}
