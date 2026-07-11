package uBO;

import com.google.crypto.tink.shaded.protobuf.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum s4 implements SPz.j {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final SPz.n f74317g = new SPz.n() { // from class: uBO.s4.j
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74321n;

    public static s4 n(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 == 4) {
            return SHA512;
        }
        if (i2 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f74321n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    s4(int i2) {
        this.f74321n = i2;
    }
}
