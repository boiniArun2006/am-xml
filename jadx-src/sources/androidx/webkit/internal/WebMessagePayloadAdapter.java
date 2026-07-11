package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final byte[] f42531O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42532n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f42533t;

    public WebMessagePayloadAdapter(String str) {
        this.f42532n = 0;
        this.f42533t = str;
        this.f42531O = null;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        n(1);
        byte[] bArr = this.f42531O;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        n(0);
        return this.f42533t;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    private void n(int i2) {
        if (this.f42532n == i2) {
            return;
        }
        throw new IllegalStateException("Expected " + i2 + ", but type is " + this.f42532n);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f42532n;
    }

    public WebMessagePayloadAdapter(byte[] bArr) {
        this.f42532n = 1;
        this.f42533t = null;
        this.f42531O = bArr;
    }
}
