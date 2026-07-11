package NDY;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo implements com.google.zxing.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aC f6987n = new aC();

    @Override // com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.UPC_A) {
            return this.f6987n.n("0".concat(String.valueOf(str)), com.google.zxing.j.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(jVar)));
    }
}
