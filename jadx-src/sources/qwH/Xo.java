package qwH;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface Xo {

    public interface Ml extends Xo {

        public static final class j {
            public static /* synthetic */ void n(Ml ml, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                ml.xMQ(qfVar);
            }

            public static /* synthetic */ void rl(Ml ml, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                ml.r(qfVar);
            }

            public static /* synthetic */ void t(Ml ml, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                ml.nr(qfVar);
            }
        }

        void Uo(Pl pl);

        void nr(qf qfVar);

        void r(qf qfVar);

        void xMQ(qf qfVar);
    }

    public interface j extends Xo {

        /* JADX INFO: renamed from: qwH.Xo$j$j, reason: collision with other inner class name */
        public static final class C1124j {
            public static /* synthetic */ void n(j jVar, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                jVar.Ik(qfVar);
            }

            public static /* synthetic */ void rl(j jVar, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                jVar.XQ(qfVar);
            }

            public static /* synthetic */ void t(j jVar, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                jVar.KN(qfVar);
            }
        }

        void HI(l3D l3d);

        void Ik(qf qfVar);

        void KN(qf qfVar);

        void XQ(qf qfVar);

        void gh(Pl pl);

        void t(DAz dAz);
    }

    public interface n extends j, w6, Ml {
    }

    public interface w6 extends Xo {

        public static final class j {
            public static /* synthetic */ void n(w6 w6Var, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                w6Var.O(qfVar);
            }

            public static /* synthetic */ void rl(w6 w6Var, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                w6Var.az(qfVar);
            }

            public static /* synthetic */ void t(w6 w6Var, qf qfVar, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
                }
                if ((i2 & 1) != 0) {
                    qfVar = qf.f72606t;
                }
                w6Var.J2(qfVar);
            }
        }

        void J2(qf qfVar);

        void O(qf qfVar);

        void Z(int i2, int i3);

        void az(qf qfVar);
    }

    void ck(String str);
}
