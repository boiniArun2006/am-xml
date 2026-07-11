package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final com.google.common.primitives.I28 compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i2, @Nullable int[] iArr) {
        com.google.common.primitives.I28 i28J2;
        this.majorBrand = i2;
        if (iArr != null) {
            i28J2 = com.google.common.primitives.I28.n(iArr);
        } else {
            i28J2 = com.google.common.primitives.I28.J2();
        }
        this.compatibleBrands = i28J2;
    }
}
