package oK9;

import com.google.protobuf.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum Ml implements nKK.w6 {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final nKK.Ml f71378o = new nKK.Ml() { // from class: oK9.Ml.j
        @Override // com.google.protobuf.nKK.Ml
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Ml findValueByNumber(int i2) {
            return Ml.rl(i2);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71381n;

    private static final class n implements nKK.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final nKK.I28 f71382n = new n();

        private n() {
        }

        @Override // com.google.protobuf.nKK.I28
        public boolean isInRange(int i2) {
            if (Ml.rl(i2) != null) {
                return true;
            }
            return false;
        }
    }

    public static Ml rl(int i2) {
        if (i2 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return FOREGROUND;
        }
        if (i2 == 2) {
            return BACKGROUND;
        }
        if (i2 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static nKK.I28 t() {
        return n.f71382n;
    }

    @Override // com.google.protobuf.nKK.w6
    public final int getNumber() {
        return this.f71381n;
    }

    Ml(int i2) {
        this.f71381n = i2;
    }
}
