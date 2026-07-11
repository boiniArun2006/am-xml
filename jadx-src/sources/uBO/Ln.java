package uBO;

import com.google.crypto.tink.shaded.protobuf.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum Ln implements SPz.j {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final SPz.n f74266S = new SPz.n() { // from class: uBO.Ln.j
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74272n;

    public static Ln n(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74272n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Ln(int i2) {
        this.f74272n = i2;
    }
}
