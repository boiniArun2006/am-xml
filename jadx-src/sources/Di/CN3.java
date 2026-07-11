package Di;

import Di.CN3;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private I28 f1505O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1506n;
    private final double nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f1507t;

    /* JADX INFO: renamed from: Di.CN3$CN3, reason: collision with other inner class name */
    public static abstract class AbstractC0060CN3 implements Wre {
        public void rl() {
        }
    }

    public static abstract class I28 extends j implements Ml {
        /* JADX WARN: Multi-variable type inference failed */
        public I28(int i2) {
            super(i2, null, 2, 0 == true ? 1 : 0);
        }
    }

    public interface Ml {
        void n(double d2);
    }

    public interface Wre {
        void n(float[] fArr, double d2, CN3 cn3);
    }

    public static abstract class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f1508n;
        private volatile List rl;

        public j(int i2, Wre[] wreArr) {
            this.f1508n = i2;
            this.rl = CollectionsKt.emptyList();
            if (wreArr != null) {
                for (Wre wre : wreArr) {
                    nr(wre);
                }
            }
        }

        public void xMQ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(j jVar) {
            return "Audio Source Connected; now " + jVar.rl.size() + " source(s)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(j jVar) {
            return "Audio Source Disconnected; now " + jVar.rl.size() + " source(s)";
        }

        public void J2(Wre source) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!this.rl.contains(source)) {
                throw new IllegalArgumentException("Source is not connected; cannot disconnect");
            }
            this.rl = CollectionsKt.minus(this.rl, source);
            XoT.C.qie(this, new Function0() { // from class: Di.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.j.Uo(this.f1531n);
                }
            });
        }

        protected final Wre KN() {
            Wre wre = (Wre) CollectionsKt.getOrNull(this.rl, 0);
            return wre == null ? w6.f1510n : wre;
        }

        public void nr(Wre source) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.rl.contains(source)) {
                throw new IllegalArgumentException("Source already connected");
            }
            int size = this.rl.size();
            int i2 = this.f1508n;
            if (size < i2) {
                this.rl = CollectionsKt.plus((Collection<? extends Wre>) this.rl, source);
                XoT.C.qie(this, new Function0() { // from class: Di.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CN3.j.O(this.f1514n);
                    }
                });
            } else {
                throw new IllegalArgumentException(("Maximum of " + i2 + " connections already in use").toString());
            }
        }

        public /* synthetic */ j(int i2, Wre[] wreArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i3 & 2) != 0 ? null : wreArr);
        }
    }

    public static final class n extends I28 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f1509t = new n();

        private n() {
            super(0);
        }

        @Override // Di.CN3.Ml
        public void n(double d2) {
        }
    }

    public static final class w6 extends AbstractC0060CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f1510n = new w6();

        @Override // Di.CN3.Wre
        public void n(float[] dst, double d2, CN3 graph) {
            Intrinsics.checkNotNullParameter(dst, "dst");
            Intrinsics.checkNotNullParameter(graph, "graph");
            ArraysKt.fill$default(dst, 0.0f, 0, 0, 6, (Object) null);
        }

        private w6() {
        }
    }

    public CN3(int i2, int i3, int i5) {
        this.f1506n = i2;
        this.rl = i3;
        this.f1507t = i5;
        this.nr = 1.0d / ((double) i2);
        this.f1505O = n.f1509t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN() {
        return "AudioTrackOutputNode: audioGraph.releaseOutputNode";
    }

    public final int J2() {
        return this.f1506n;
    }

    public final int O() {
        return this.f1507t;
    }

    public final void Uo() {
        XoT.C.Uo(this, new Function0() { // from class: Di.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.KN();
            }
        });
        this.f1505O.xMQ();
        this.f1505O = n.f1509t;
    }

    public final double nr() {
        return this.nr;
    }

    public final I28 rl() {
        this.f1505O.xMQ();
        Di.w6 w6Var = new Di.w6(this);
        this.f1505O = w6Var;
        return w6Var;
    }

    public final int t() {
        return this.rl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CN3(int i2, int i3, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        i2 = (i7 & 1) != 0 ? 48000 : i2;
        this(i2, (i7 & 2) != 0 ? 2 : i3, (i7 & 4) != 0 ? i2 / 240 : i5);
    }
}
