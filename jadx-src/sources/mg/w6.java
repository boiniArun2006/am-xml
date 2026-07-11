package mg;

import GJW.Dsr;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import LQ.CN3;
import LQ.fuX;
import LQ.j;
import android.graphics.Bitmap;
import d2n.Ml;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements kG.Wre {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CoroutineContext f70970O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f70971S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Oe.w6 f70972Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f6d.j f70973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d2n.Wre f70974o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f70975r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lT.j f70976t;

    static final class I28 extends Lambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f70977n = new I28();

        I28() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d2n.Ml.rl(n(((d2n.Ml) obj).Ik(), ((d2n.j) obj2).WPU()));
        }

        public final long n(long j2, long j3) {
            return d2n.Ml.HI(j2, j3);
        }
    }

    static final class Ml extends Lambda implements Function1 {
        Ml() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return d2n.j.rl(n(((Number) obj).intValue()));
        }

        public final long n(int i2) {
            return d2n.j.f63374t.t(RangesKt.coerceAtLeast(w6.this.f70973n.O(i2), 1L));
        }
    }

    static final class Wre extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f70979n = new Wre();

        Wre() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final d2n.Wre invoke(Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return new d2n.Wre(((d2n.Ml) pair.component1()).Ik(), ((d2n.Ml) pair.component2()).Ik(), null);
        }
    }

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f70980O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70981n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70982r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70983t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70980O = obj;
            this.f70982r |= Integer.MIN_VALUE;
            return w6.this.rl(0L, this);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ CN3 J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70985n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f70986r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f70987t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(CN3 cn3, long j2, Continuation continuation) {
            super(2, continuation);
            this.J2 = cn3;
            this.f70986r = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = w6.this.new n(this.J2, this.f70986r, continuation);
            nVar.f70987t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70985n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f70987t;
                List list = w6.this.f70975r;
                long j2 = this.f70986r;
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (d2n.CN3.nr((d2n.Wre) it.next(), j2)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (w6.this.f70973n.Uo() > i2) {
                    w6.this.f70973n.J2();
                }
                while (w6.this.f70973n.Uo() < i2) {
                    Lu.Uo(vdVar);
                    w6.this.f70973n.nr();
                    if (w6.this.f70973n.Uo() != i2) {
                        this.J2.O(w6.this.HI());
                    }
                }
                Lu.Uo(vdVar);
                return w6.this.ck((Bitmap) this.J2.O(w6.this.HI()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: mg.w6$w6, reason: collision with other inner class name */
    static final class C1062w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1062w6 f70988n = new C1062w6();

        C1062w6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Integer n(int i2) {
            return Integer.valueOf(i2 + 1);
        }
    }

    public w6(f6d.j gifDecoder, lT.j gifBitmapProvider, CoroutineContext decodingContext) {
        Intrinsics.checkNotNullParameter(gifDecoder, "gifDecoder");
        Intrinsics.checkNotNullParameter(gifBitmapProvider, "gifBitmapProvider");
        Intrinsics.checkNotNullParameter(decodingContext, "decodingContext");
        this.f70973n = gifDecoder;
        this.f70976t = gifBitmapProvider;
        this.f70970O = decodingContext;
        Sequence map = SequencesKt.map(SequencesKt.generateSequence(0, C1062w6.f70988n), new Ml());
        Ml.j jVar = d2n.Ml.f63370t;
        List list = SequencesKt.toList(SequencesKt.take(SequencesKt.map(SequencesKt.zipWithNext(SequencesKt.scan(map, d2n.Ml.rl(jVar.J2()), I28.f70977n)), Wre.f70979n), gifDecoder.n()));
        this.f70975r = list;
        this.f70974o = new d2n.Wre(jVar.J2(), ((d2n.Wre) CollectionsKt.last(list)).nr(), null);
        this.f70972Z = new Oe.w6(gifDecoder.getWidth(), gifDecoder.getHeight());
    }

    @Override // w9.fuX
    public void release() {
        this.J2 = true;
        this.f70973n.clear();
        Bitmap bitmap = this.f70971S;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LQ.j HI() throws fuX.j, InterruptedException {
        LQ.j nVar;
        fuX fux = new fuX();
        try {
            Bitmap bitmap = this.f70971S;
            if (bitmap != null) {
                this.f70976t.n(bitmap);
                this.f70971S = null;
            }
            j.C0208j c0208j = LQ.j.f6082n;
            try {
                try {
                    nVar = new j.w6(this.f70973n.t());
                } catch (Exception e2) {
                    nVar = new j.n(e2);
                }
                if (nVar instanceof j.n) {
                    nVar = new j.n(new kG.n("GIFDecoder cannot decode gif: " + ((Exception) ((j.n) nVar).n())));
                } else if (!(nVar instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Bitmap bitmap2 = (Bitmap) fux.O(nVar);
                if (bitmap2 == null) {
                    fux.n(new kG.Ml("GIFDecoder returned null frame"));
                    throw new KotlinNothingValueException();
                }
                this.f70971S = bitmap2;
                int status = this.f70973n.getStatus();
                if (status == 0) {
                    return new j.w6(bitmap2);
                }
                if (status == 1) {
                    fux.n(new kG.n("GIFDecoder returned status " + status));
                    throw new KotlinNothingValueException();
                }
                if (status != 3) {
                    fux.n(new kG.Ml("GIFDecoder returned status " + status));
                    throw new KotlinNothingValueException();
                }
                fux.n(new kG.w6("GIFDecoder returned status " + status));
                throw new KotlinNothingValueException();
            } catch (InterruptedException e3) {
                throw e3;
            } catch (CancellationException e4) {
                throw e4;
            }
        } catch (fuX.j e5) {
            if (e5.rl() == fux) {
                return new j.n(e5.n());
            }
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kG.j ck(Bitmap bitmap) {
        return new kG.j((d2n.Wre) this.f70975r.get(this.f70973n.Uo()), getSize(), bitmap);
    }

    @Override // kG.Wre
    public d2n.Wre getRange() {
        return this.f70974o;
    }

    @Override // kG.Wre
    public Oe.w6 getSize() {
        return this.f70972Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kG.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(long j2, Continuation continuation) throws fuX.j {
        j jVar;
        w6 w6Var;
        fuX.j jVar2;
        w6 w6Var2;
        fuX fux;
        Object nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f70982r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f70982r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f70980O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f70982r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            if (this.J2) {
                throw new IllegalStateException("Cannot retrieve frame using a released GIFrameProvider");
            }
            if (!d2n.CN3.nr(getRange(), j2)) {
                throw new IllegalArgumentException(("Time requested (" + ((Object) d2n.Ml.ck(j2)) + ") is not in the valid range (" + getRange() + ')').toString());
            }
            fuX fux2 = new fuX();
            try {
                CoroutineContext coroutineContext = this.f70970O;
                w6Var = this;
                try {
                    n nVar2 = w6Var.new n(fux2, j2, null);
                    jVar.f70981n = w6Var;
                    jVar.f70983t = fux2;
                    jVar.f70982r = 1;
                    objUo = Dsr.Uo(coroutineContext, nVar2, jVar);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w6Var2 = w6Var;
                    fux = fux2;
                    nVar = new j.w6((kG.j) objUo);
                } catch (fuX.j e2) {
                    e = e2;
                    jVar2 = e;
                    w6Var2 = w6Var;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                        throw jVar2;
                    }
                    nVar = new j.n(jVar2.n());
                    if (nVar instanceof j.n) {
                    }
                    return nVar;
                }
            } catch (fuX.j e3) {
                e = e3;
                w6Var = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux = (fuX) jVar.f70983t;
            w6Var2 = (w6) jVar.f70981n;
            try {
                ResultKt.throwOnFailure(objUo);
                try {
                    nVar = new j.w6((kG.j) objUo);
                } catch (fuX.j e4) {
                    jVar2 = e4;
                    if (jVar2.rl() != fux) {
                    }
                }
            } catch (fuX.j e5) {
                jVar2 = e5;
                if (jVar2.rl() != fux) {
                }
            }
        }
        if (nVar instanceof j.n) {
            boolean z2 = nVar instanceof j.w6;
        } else {
            w6Var2.release();
        }
        return nVar;
    }

    public /* synthetic */ w6(f6d.j jVar, lT.j jVar2, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, jVar2, (i2 & 4) != 0 ? OU.rl() : coroutineContext);
    }
}
