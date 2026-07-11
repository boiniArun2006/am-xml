package uBO;

import com.google.crypto.tink.shaded.protobuf.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum ci implements SPz.j {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final SPz.n f74296Z = new SPz.n() { // from class: uBO.ci.j
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74300n;

    public static ci n(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74300n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ci(int i2) {
        this.f74300n = i2;
    }
}
