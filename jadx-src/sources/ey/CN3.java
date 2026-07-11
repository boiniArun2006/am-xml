package ey;

import LQ.fuX;
import LQ.j;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import com.google.android.exoplayer2.extractor.SeekPoint;
import d2n.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 implements Fs8.j {
    private static final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f63901O;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final F3.j f63902n;
    private final CSs.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yB.j f63903t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f63904O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63905n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f63906r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63907t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63904O = obj;
            this.f63906r |= Integer.MIN_VALUE;
            return CN3.this.rl(this);
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63908O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f63909S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f63912o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63913r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63914t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63912o = obj;
            this.f63909S |= Integer.MIN_VALUE;
            return CN3.this.n(null, this);
        }
    }

    static {
        j.C0832j c0832j = d2n.j.f63374t;
        f63901O = c0832j.rl(50000L);
        J2 = c0832j.rl(50000L);
    }

    public CN3(F3.j audioDecoder, CSs.j assetSampleStream) {
        Intrinsics.checkNotNullParameter(audioDecoder, "audioDecoder");
        Intrinsics.checkNotNullParameter(assetSampleStream, "assetSampleStream");
        this.f63902n = audioDecoder;
        this.rl = assetSampleStream;
        this.f63903t = yB.CN3.n(false);
    }

    private final SeekPoint nr(long j2) {
        SeekPoint seekPoint = this.rl.getSeekPoints(d2n.Ml.xMQ(d2n.Ml.ty(j2, f63901O))).first;
        Intrinsics.checkNotNullExpressionValue(seekPoint, "assetSampleStream.getSee…_TOLERANCE).micros).first");
        if (seekPoint.timeUs > d2n.Ml.xMQ(j2)) {
            return SeekPoint.START;
        }
        if (d2n.CN3.nr(d2n.n.rl(J2, this.f63902n.nr()), j2)) {
            return null;
        }
        long jN = d2n.Ml.f63370t.n(seekPoint.timeUs);
        if (d2n.Ml.KN(j2, jN)) {
            j2 = d2n.I28.rl(jN);
        }
        if (d2n.CN3.nr(new d2n.Wre(jN, j2, null), this.f63902n.nr())) {
            return null;
        }
        return seekPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #3 {all -> 0x00b8, blocks: (B:33:0x009f, B:35:0x00a9, B:39:0x00bc), top: B:75:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: all -> 0x003f, TryCatch #6 {all -> 0x003f, blocks: (B:13:0x003a, B:43:0x00d5, B:45:0x00db, B:47:0x00df, B:48:0x00f7, B:55:0x010e, B:57:0x0116, B:58:0x011e, B:59:0x011f), top: B:77:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #6 {all -> 0x003f, blocks: (B:13:0x003a, B:43:0x00d5, B:45:0x00db, B:47:0x00df, B:48:0x00f7, B:55:0x010e, B:57:0x0116, B:58:0x011e, B:59:0x011f), top: B:77:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Fs8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(d2n.Wre wre, Continuation continuation) throws Throwable {
        w6 w6Var;
        fuX.j jVar;
        Object obj;
        LQ.CN3 fux;
        yB.j jVar2;
        CN3 cn3;
        LQ.CN3 cn32;
        Throwable th;
        SeekPoint seekPointNr;
        UnhandledFailureException unhandledFailureException;
        LQ.CN3 cn33;
        Object objMUb;
        LQ.CN3 cn34;
        Object failure;
        LQ.j jVar3;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f63909S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f63909S = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj2 = w6Var.f63912o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f63909S;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                fux = new LQ.fuX();
                try {
                    if (!d2n.CN3.rl(d2n.n.t(t(), 0L, 1, null), wre)) {
                        throw new IllegalArgumentException(("Requested range (" + wre + ") must be fully contained in " + d2n.n.t(t(), 0L, 1, null) + "].").toString());
                    }
                    jVar2 = this.f63903t;
                    w6Var.f63911n = this;
                    w6Var.f63914t = wre;
                    w6Var.f63908O = fux;
                    w6Var.J2 = fux;
                    w6Var.f63913r = jVar2;
                    w6Var.f63909S = 1;
                    if (jVar2.Z(null, w6Var) != coroutine_suspended) {
                        cn3 = this;
                        cn32 = fux;
                        seekPointNr = cn3.nr(wre.O());
                        if (seekPointNr != null) {
                        }
                        F3.j jVar4 = cn3.f63902n;
                        w6Var.f63911n = cn32;
                        w6Var.f63914t = jVar2;
                        w6Var.f63908O = fux;
                        w6Var.J2 = fux;
                        w6Var.f63913r = null;
                        w6Var.f63909S = 2;
                        objMUb = jVar4.mUb(wre, w6Var);
                        if (objMUb != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                } catch (fuX.j e2) {
                    jVar = e2;
                    obj = fux;
                    if (jVar.rl() != obj) {
                    }
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn34 = (LQ.CN3) w6Var.J2;
                    cn33 = (LQ.CN3) w6Var.f63908O;
                    jVar2 = (yB.j) w6Var.f63914t;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj2);
                            jVar3 = (LQ.j) obj2;
                            if (!(jVar3 instanceof j.n) && (jVar3 instanceof j.w6)) {
                                as.n nVar = (as.n) ((j.w6) jVar3).n();
                                nVar.O().limit(nVar.O().capacity());
                            }
                            as.n nVar2 = (as.n) cn34.O(jVar3);
                            jVar2.T(null);
                            return new j.w6(nVar2);
                        } catch (UnhandledFailureException e3) {
                            unhandledFailureException = e3;
                            failure = unhandledFailureException.getFailure();
                            if (failure instanceof uPp.j) {
                                throw unhandledFailureException;
                            }
                            cn33.n(failure);
                            throw new KotlinNothingValueException();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        jVar2.T(null);
                        throw th;
                    }
                }
                yB.j jVar5 = (yB.j) w6Var.f63913r;
                LQ.CN3 cn35 = (LQ.CN3) w6Var.J2;
                LQ.fuX fux2 = (LQ.fuX) w6Var.f63908O;
                d2n.Wre wre2 = (d2n.Wre) w6Var.f63914t;
                cn3 = (CN3) w6Var.f63911n;
                try {
                    ResultKt.throwOnFailure(obj2);
                    fux = cn35;
                    jVar2 = jVar5;
                    wre = wre2;
                    cn32 = fux2;
                    try {
                        seekPointNr = cn3.nr(wre.O());
                        if (seekPointNr != null) {
                            cn3.rl.n(seekPointNr);
                            fux.O(cn3.f63902n.O());
                        }
                        try {
                            F3.j jVar42 = cn3.f63902n;
                            w6Var.f63911n = cn32;
                            w6Var.f63914t = jVar2;
                            w6Var.f63908O = fux;
                            w6Var.J2 = fux;
                            w6Var.f63913r = null;
                            w6Var.f63909S = 2;
                            objMUb = jVar42.mUb(wre, w6Var);
                            if (objMUb != coroutine_suspended) {
                                cn33 = fux;
                                obj2 = objMUb;
                                cn34 = cn33;
                                jVar3 = (LQ.j) obj2;
                                if (!(jVar3 instanceof j.n)) {
                                    as.n nVar3 = (as.n) ((j.w6) jVar3).n();
                                    nVar3.O().limit(nVar3.O().capacity());
                                }
                                as.n nVar22 = (as.n) cn34.O(jVar3);
                                jVar2.T(null);
                                return new j.w6(nVar22);
                            }
                            return coroutine_suspended;
                        } catch (UnhandledFailureException e4) {
                            unhandledFailureException = e4;
                            cn33 = fux;
                            failure = unhandledFailureException.getFailure();
                            if (failure instanceof uPp.j) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jVar2.T(null);
                        throw th;
                    }
                } catch (fuX.j e5) {
                    jVar = e5;
                    obj = fux2;
                    if (jVar.rl() != obj) {
                        return new j.n(jVar.n());
                    }
                    throw jVar;
                }
            }
        } catch (fuX.j e6) {
            jVar = e6;
            obj = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Fs8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        n nVar;
        CN3 cn3;
        yB.j jVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f63906r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f63906r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f63904O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f63906r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            yB.j jVar2 = this.f63903t;
            nVar.f63905n = this;
            nVar.f63907t = jVar2;
            nVar.f63906r = 1;
            if (jVar2.Z(null, nVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
            jVar = jVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (yB.j) nVar.f63907t;
            cn3 = (CN3) nVar.f63905n;
            ResultKt.throwOnFailure(obj);
        }
        try {
            cn3.f63902n.release();
            cn3.rl.release();
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    public long t() {
        long durationUs = this.rl.getDurationUs();
        return durationUs == -9223372036854775807L ? d2n.j.f63374t.n() : d2n.j.f63374t.rl(durationUs);
    }
}
