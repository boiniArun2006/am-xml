package androidx.work;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface Operation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final State.SUCCESS f42739n;
    public static final State.IN_PROGRESS rl;

    public static abstract class State {

        public static final class FAILURE extends State {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Throwable f42740n;

            public Throwable n() {
                return this.f42740n;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f42740n.getMessage());
            }

            public FAILURE(Throwable th) {
                this.f42740n = th;
            }
        }

        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        State() {
        }
    }

    static {
        f42739n = new State.SUCCESS();
        rl = new State.IN_PROGRESS();
    }
}
