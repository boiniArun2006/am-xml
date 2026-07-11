package ILs;

import dzu.nKK;
import dzu.qf;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final qz f4176n = new qz(-1, null, null, 0);
    public static final int rl = qf.O("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f4179t = qf.O("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final nKK nr = new nKK("BUFFERED");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final nKK f4175O = new nKK("SHOULD_BUFFER");
    private static final nKK J2 = new nKK("S_RESUMING_BY_RCV");
    private static final nKK Uo = new nKK("RESUMING_BY_EB");
    private static final nKK KN = new nKK("POISONED");
    private static final nKK xMQ = new nKK("DONE_RCV");
    private static final nKK mUb = new nKK("INTERRUPTED_SEND");
    private static final nKK gh = new nKK("INTERRUPTED_RCV");
    private static final nKK qie = new nKK("CHANNEL_CLOSED");
    private static final nKK az = new nKK("SUSPEND");
    private static final nKK ty = new nKK("SUSPEND_NO_WAITER");
    private static final nKK HI = new nKK("FAILED");
    private static final nKK ck = new nKK("NO_RECEIVE_RESULT");
    private static final nKK Ik = new nKK("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final nKK f4178r = new nKK("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final nKK f4177o = new nKK("NO_CLOSE_CAUSE");

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f4180n = new j();

        j() {
            super(2, Wre.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (qz) obj2);
        }

        public final qz n(long j2, qz qzVar) {
            return Wre.aYN(j2, qzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long WPU(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean te(GJW.Pl pl, Object obj, Function3 function3) {
        Object objG = pl.g(obj, null, function3);
        if (objG == null) {
            return false;
        }
        pl.te(objG);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long S(long j2, boolean z2) {
        return (z2 ? 4611686018427387904L : 0L) + j2;
    }

    public static final KFunction ViF() {
        return j.f4180n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qz aYN(long j2, qz qzVar) {
        return new qz(j2, qzVar, qzVar.ViF(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    static /* synthetic */ boolean iF(GJW.Pl pl, Object obj, Function3 function3, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        return te(pl, obj, function3);
    }

    public static final nKK nY() {
        return qie;
    }
}
