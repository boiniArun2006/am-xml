package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    private static final Internal.EnumLiteMap J2 = new Internal.EnumLiteMap<NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NullValue findValueByNumber(int i2) {
            return NullValue.n(i2);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f38104n;

    private static final class NullValueVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Internal.EnumVerifier f38105n = new NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            if (NullValue.n(i2) != null) {
                return true;
            }
            return false;
        }
    }

    public static NullValue n(int i2) {
        if (i2 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38104n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    NullValue(int i2) {
        this.f38104n = i2;
    }
}
