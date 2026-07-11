package oK9;

import com.google.protobuf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum o implements nKK.w6 {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    private static final nKK.Ml J2 = new nKK.Ml() { // from class: oK9.o.j
        @Override // com.google.protobuf.nKK.Ml
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public o findValueByNumber(int i2) {
            return o.rl(i2);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71414n;

    private static final class n implements nKK.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final nKK.I28 f71415n = new n();

        private n() {
        }

        @Override // com.google.protobuf.nKK.I28
        public boolean isInRange(int i2) {
            if (o.rl(i2) != null) {
                return true;
            }
            return false;
        }
    }

    public static o rl(int i2) {
        if (i2 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i2 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static nKK.I28 t() {
        return n.f71415n;
    }

    @Override // com.google.protobuf.nKK.w6
    public final int getNumber() {
        return this.f71414n;
    }

    o(int i2) {
        this.f71414n = i2;
    }
}
