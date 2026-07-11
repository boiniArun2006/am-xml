package stX;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface CN3 {

    public static final class I28 implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f73343n;

        public I28(String expected) {
            Intrinsics.checkNotNullParameter(expected, "expected");
            this.f73343n = expected;
        }

        @Override // stX.CN3
        public String n() {
            return "expected '" + this.f73343n + '\'';
        }
    }

    public static final class Ml implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f73344n;

        @Override // stX.CN3
        public String n() {
            return "expected at most " + this.f73344n + " digits";
        }

        public Ml(int i2) {
            this.f73344n = i2;
        }
    }

    public static final class j implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f73345n;

        public j(Object conflicting) {
            Intrinsics.checkNotNullParameter(conflicting, "conflicting");
            this.f73345n = conflicting;
        }

        @Override // stX.CN3
        public String n() {
            return "attempted to overwrite the existing value '" + this.f73345n + '\'';
        }
    }

    public static final class n implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f73346n = new n();

        @Override // stX.CN3
        public String n() {
            return "expected an Int value";
        }

        private n() {
        }
    }

    public static final class w6 implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f73347n;

        @Override // stX.CN3
        public String n() {
            return "expected at least " + this.f73347n + " digits";
        }

        public w6(int i2) {
            this.f73347n = i2;
        }
    }

    String n();
}
