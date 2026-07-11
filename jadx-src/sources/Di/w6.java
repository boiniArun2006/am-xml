package Di;

import Di.CN3;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 extends CN3.I28 {
    private double J2;
    private double KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float[] f1573O;
    private long Uo;
    private final boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f1574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(CN3 graph) {
        super(1);
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f1574t = graph;
        this.nr = true;
        this.f1573O = new float[graph.O() * graph.t()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(double d2) {
        return "Request seek (" + d2 + ")";
    }

    private final void ck(final double d2) {
        XoT.C.Uo(this, new Function0() { // from class: Di.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.Ik(this.f1546n, d2);
            }
        });
        this.J2 = d2;
        this.Uo = 0L;
        this.KN = d2;
    }

    private final void ty() {
        this.KN = this.J2 + (this.Uo / ((double) this.f1574t.J2()));
        KN().n(this.f1573O, qie(), this.f1574t);
        this.Uo += (long) this.f1574t.O();
    }

    public final long az(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        long jJ2 = ((long) (this.J2 * ((double) 1000000000))) + ((this.Uo * ((long) 1000000000)) / ((long) this.f1574t.J2()));
        ty();
        tF.j jVar = tF.j.f73449n;
        jVar.J2();
        jVar.O();
        int length = this.f1573O.length;
        for (int i2 = 0; i2 < length; i2++) {
            byteBuffer.putShort((short) (RangesKt.coerceIn(r2[i2], -1.0f, 1.0f) * 32767.0f));
        }
        return jJ2;
    }

    @Override // Di.CN3.Ml
    public void n(final double d2) {
        XoT.C.Uo(this, new Function0() { // from class: Di.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.HI(d2);
            }
        });
        if (qie() == d2) {
            return;
        }
        ck(d2);
    }

    public double qie() {
        return this.KN;
    }

    @Override // Di.CN3.j
    public void xMQ() {
        tF.j.f73449n.J2();
        tF.n.n(this, null);
        super.xMQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik(w6 w6Var, double d2) {
        return "Seek internal (cts=" + w6Var.qie() + "; timestamp=" + d2 + ")";
    }
}
