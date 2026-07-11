package qwH;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class u {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final co4.afx f72613O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f72614n = new u();
    private static final co4.afx nr;
    private static final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final co4.afx f72615t;

    public static final class w6 implements co4.qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final co4.r f72619n = new co4.r(new MutablePropertyReference1Impl() { // from class: qwH.u.w6.j
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((vd) obj).n();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((vd) obj).gh((Boolean) obj2);
            }
        });

        @Override // co4.qz
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public boolean rl(vd obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Integer numO = obj.O();
            if ((numO != null ? numO.intValue() : 0) == 0) {
                Integer numXMQ = obj.xMQ();
                if ((numXMQ != null ? numXMQ.intValue() : 0) == 0) {
                    Integer numWPU = obj.WPU();
                    if ((numWPU != null ? numWPU.intValue() : 0) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // co4.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public co4.r n() {
            return this.f72619n;
        }

        w6() {
        }
    }

    static {
        w6 w6Var = new w6();
        rl = w6Var;
        f72615t = new co4.afx(new co4.r(new MutablePropertyReference1Impl() { // from class: qwH.u.Ml
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((vd) obj).O();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((vd) obj).Ik((Integer) obj2);
            }
        }), 0, 18, null, 0, w6Var, 8, null);
        nr = new co4.afx(new co4.r(new MutablePropertyReference1Impl() { // from class: qwH.u.j
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((vd) obj).xMQ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((vd) obj).ty((Integer) obj2);
            }
        }), 0, 59, null, 0, w6Var, 8, null);
        f72613O = new co4.afx(new co4.r(new MutablePropertyReference1Impl() { // from class: qwH.u.n
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((vd) obj).WPU();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((vd) obj).r((Integer) obj2);
            }
        }), 0, 59, null, 0, w6Var, 8, null);
    }

    public final co4.afx n() {
        return nr;
    }

    public final co4.afx rl() {
        return f72613O;
    }

    public final co4.afx t() {
        return f72615t;
    }

    private u() {
    }
}
