package VoG;

import ILs.Dsr;
import LQ.fuX;
import LQ.j;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uPp.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DD.j f11327n = new DD.j();
    private I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LQ.j f11328t;

    private interface I28 {
    }

    private final class Ml implements Dsr {

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f11330O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f11331n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f11332r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f11333t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11330O = obj;
                this.f11332r |= Integer.MIN_VALUE;
                return Ml.this.rl(this);
            }
        }

        /* JADX INFO: renamed from: VoG.n$Ml$n, reason: collision with other inner class name */
        static final class C0405n extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f11334O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f11335n;

            C0405n(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11335n = obj;
                this.f11334O |= Integer.MIN_VALUE;
                return Ml.this.nr(this);
            }
        }

        public Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object nr(Continuation continuation) throws Throwable {
            C0405n c0405n;
            if (continuation instanceof C0405n) {
                c0405n = (C0405n) continuation;
                int i2 = c0405n.f11334O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0405n.f11334O = i2 - Integer.MIN_VALUE;
                } else {
                    c0405n = new C0405n(continuation);
                }
            }
            Object objRl = c0405n.f11335n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0405n.f11334O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objRl);
                DD.j jVar = n.this.f11327n;
                c0405n.f11334O = 1;
                objRl = jVar.rl(c0405n);
                if (objRl == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRl);
            }
            I28 i28 = (I28) objRl;
            if (i28 instanceof w6) {
                return new j.w6(((w6) i28).n());
            }
            if (i28 instanceof C0406n) {
                return new j.n(((C0406n) i28).n());
            }
            if (!(i28 instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable thN = ((j) i28).n();
            if (thN == null) {
                return null;
            }
            throw thN;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ILs.Dsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object rl(Continuation continuation) throws Throwable {
            j jVar;
            Ml ml;
            n nVar;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f11332r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f11332r = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f11330O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f11332r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (n.this.f11328t != null) {
                    ml = this;
                    return Boxing.boxBoolean(n.this.f11328t != null);
                }
                n nVar2 = n.this;
                jVar.f11331n = this;
                jVar.f11333t = nVar2;
                jVar.f11332r = 1;
                Object objNr = nr(jVar);
                if (objNr == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = nVar2;
                obj = objNr;
                ml = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) jVar.f11333t;
                ml = (Ml) jVar.f11331n;
                ResultKt.throwOnFailure(obj);
            }
            nVar.f11328t = (LQ.j) obj;
            return Boxing.boxBoolean(n.this.f11328t != null);
        }

        @Override // ILs.Dsr
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public LQ.j next() {
            LQ.j jVar = n.this.f11328t;
            if (jVar == null) {
                throw new IllegalStateException("Unexpected null pending frame when calling next");
            }
            n nVar = n.this;
            if (jVar instanceof j.n) {
                return jVar;
            }
            if (jVar instanceof j.w6) {
                return new j.w6(new Wre(nVar, (VoG.j) ((j.w6) jVar).n()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final class Wre implements VoG.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final VoG.j f11337n;
        final /* synthetic */ n rl;

        public Wre(n nVar, VoG.j outputFrame) {
            Intrinsics.checkNotNullParameter(outputFrame, "outputFrame");
            this.rl = nVar;
            this.f11337n = outputFrame;
        }

        @Override // VoG.j
        public RK.j n() {
            return this.f11337n.n();
        }

        @Override // VoG.j
        public Object rl(Continuation continuation) {
            boolean zAreEqual = Intrinsics.areEqual(this.rl.f11328t, new j.w6(this.f11337n));
            n nVar = this.rl;
            if (zAreEqual) {
                nVar.f11328t = null;
                return this.f11337n.rl(continuation);
            }
            throw new IllegalStateException(("Rendering a frame (" + this.f11337n + ") that is not the pending one (" + nVar.f11328t + ')').toString());
        }
    }

    private static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f11338n;

        public j(Throwable th) {
            this.f11338n = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f11338n, ((j) obj).f11338n);
        }

        public /* synthetic */ j(Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : th);
        }

        public int hashCode() {
            Throwable th = this.f11338n;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final Throwable n() {
            return this.f11338n;
        }

        public String toString() {
            return "Closed(exception=" + this.f11338n + ')';
        }
    }

    /* JADX INFO: renamed from: VoG.n$n, reason: collision with other inner class name */
    private static final class C0406n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f11339n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0406n) && Intrinsics.areEqual(this.f11339n, ((C0406n) obj).f11339n);
        }

        public C0406n(o failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f11339n = failure;
        }

        public int hashCode() {
            return this.f11339n.hashCode();
        }

        public final o n() {
            return this.f11339n;
        }

        public String toString() {
            return "Failed(failure=" + this.f11339n + ')';
        }
    }

    private static final class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final VoG.j f11340n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f11340n, ((w6) obj).f11340n);
        }

        public w6(VoG.j frame) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            this.f11340n = frame;
        }

        public int hashCode() {
            return this.f11340n.hashCode();
        }

        public final VoG.j n() {
            return this.f11340n;
        }

        public String toString() {
            return "FrameAvailable(frame=" + this.f11340n + ')';
        }
    }

    public final void J2(o failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.rl = new C0406n(failure);
        this.f11327n.n(new C0406n(failure), true);
    }

    public final LQ.j KN() throws Throwable {
        fuX fux = new fuX();
        try {
            I28 i28 = this.rl;
            if (i28 != null) {
                if (i28 instanceof j) {
                    Throwable thN = ((j) i28).n();
                    if (thN != null) {
                        throw thN;
                    }
                } else {
                    if (i28 instanceof C0406n) {
                        fux.n(((C0406n) i28).n());
                        throw new KotlinNothingValueException();
                    }
                    if (i28 instanceof w6) {
                        throw new IllegalStateException("Unexpected frame available to close.");
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    public final void O(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.rl = new j(exception);
        this.f11327n.n(new j(exception), true);
    }

    public final Dsr Uo() {
        return new Ml();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nr() {
        this.f11327n.n(new j(null, 1, 0 == true ? 1 : 0), false);
    }

    public final void xMQ(VoG.j outputFrame) {
        Intrinsics.checkNotNullParameter(outputFrame, "outputFrame");
        this.f11327n.t(new w6(outputFrame));
    }
}
