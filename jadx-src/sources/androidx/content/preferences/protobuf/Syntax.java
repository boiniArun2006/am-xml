package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Internal.EnumLiteMap f38166o = new Internal.EnumLiteMap<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Syntax findValueByNumber(int i2) {
            return Syntax.n(i2);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f38169n;

    private static final class SyntaxVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Internal.EnumVerifier f38170n = new SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i2) {
            if (Syntax.n(i2) != null) {
                return true;
            }
            return false;
        }
    }

    public static Syntax n(int i2) {
        if (i2 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i2 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i2 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f38169n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Syntax(int i2) {
        this.f38169n = i2;
    }
}
