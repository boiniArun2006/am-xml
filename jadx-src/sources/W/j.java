package W;

import TFv.CN3;
import TFv.Wre;
import cg.Dsr;
import com.alightcreative.account.CreatorProgram;
import kgE.fuX;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f11419n;
    private final Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0410j f11418t = new C0410j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: W.j$j, reason: collision with other inner class name */
    public static final class C0410j {
        public /* synthetic */ C0410j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0410j() {
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f11420n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f11421t;

        /* JADX INFO: renamed from: W.j$n$j, reason: collision with other inner class name */
        public static final class C0411j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f11422n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f11423t;

            /* JADX INFO: renamed from: W.j$n$j$j, reason: collision with other inner class name */
            public static final class C0412j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f11424O;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                Object f11425Z;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f11426n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f11427o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f11428r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f11429t;

                public C0412j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f11426n = obj;
                    this.f11429t |= Integer.MIN_VALUE;
                    return C0411j.this.rl(null, this);
                }
            }

            public C0411j(CN3 cn3, j jVar) {
                this.f11422n = cn3;
                this.f11423t = jVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
            
                if (r1.rl(r4, r2) == r3) goto L46;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0412j c0412j;
                CN3 cn3;
                String uid;
                CN3 cn32;
                CreatorProgram creatorProgram;
                String str;
                C0411j c0411j;
                cg.Wre wre;
                CN3 cn33;
                if (continuation instanceof C0412j) {
                    c0412j = (C0412j) continuation;
                    int i2 = c0412j.f11429t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0412j.f11429t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0412j = new C0412j(continuation);
                    }
                }
                Object obj2 = c0412j.f11426n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0412j.f11429t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    cn3 = this.f11422n;
                    CreatorProgram creatorProgram2 = (CreatorProgram) obj;
                    if (creatorProgram2 != null && (uid = this.f11423t.f11419n.getUid()) != null) {
                        Dsr dsr = this.f11423t.rl;
                        c0412j.f11424O = this;
                        c0412j.f11428r = cn3;
                        c0412j.f11427o = creatorProgram2;
                        c0412j.f11425Z = uid;
                        c0412j.f11429t = 1;
                        Object objRl = dsr.rl(uid, c0412j);
                        if (objRl != coroutine_suspended) {
                            cn32 = cn3;
                            obj2 = objRl;
                            creatorProgram = creatorProgram2;
                            str = uid;
                            c0411j = this;
                        }
                        return coroutine_suspended;
                    }
                    wre = null;
                    c0412j.f11424O = null;
                    c0412j.f11428r = null;
                    c0412j.f11429t = 4;
                } else if (i3 == 1) {
                    str = (String) c0412j.f11425Z;
                    creatorProgram = (CreatorProgram) c0412j.f11427o;
                    cn32 = (CN3) c0412j.f11428r;
                    c0411j = (C0411j) c0412j.f11424O;
                    ResultKt.throwOnFailure(obj2);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    wre = (cg.Wre) c0412j.f11428r;
                    cn33 = (CN3) c0412j.f11424O;
                    ResultKt.throwOnFailure(obj2);
                    cn3 = cn33;
                    c0412j.f11424O = null;
                    c0412j.f11428r = null;
                    c0412j.f11429t = 4;
                }
                cg.Wre wre2 = (cg.Wre) obj2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (wre2 == null || wre2.t() + 43200000 <= jCurrentTimeMillis || wre2.J2() > ((long) creatorProgram.getTokenCount())) {
                    cg.Wre wre3 = new cg.Wre(creatorProgram.getDownloadCount(), creatorProgram.getDownloadCount(), (long) creatorProgram.getTokenCount(), (long) creatorProgram.getTokenCount(), jCurrentTimeMillis);
                    Dsr dsr2 = c0411j.f11423t.rl;
                    c0412j.f11424O = cn32;
                    c0412j.f11428r = wre3;
                    c0412j.f11427o = null;
                    c0412j.f11425Z = null;
                    c0412j.f11429t = 3;
                    if (dsr2.t(wre3, str, c0412j) != coroutine_suspended) {
                        cn33 = cn32;
                        wre = wre3;
                        cn3 = cn33;
                    }
                    return coroutine_suspended;
                }
                cg.Wre wreRl = cg.Wre.rl(wre2, creatorProgram.getDownloadCount(), 0L, (long) creatorProgram.getTokenCount(), 0L, 0L, 26, null);
                Dsr dsr3 = c0411j.f11423t.rl;
                c0412j.f11424O = cn32;
                c0412j.f11428r = wreRl;
                c0412j.f11427o = null;
                c0412j.f11425Z = null;
                c0412j.f11429t = 2;
                if (dsr3.t(wreRl, str, c0412j) != coroutine_suspended) {
                    wre = wreRl;
                    cn33 = cn32;
                    cn3 = cn33;
                }
                return coroutine_suspended;
                c0412j.f11424O = null;
                c0412j.f11428r = null;
                c0412j.f11429t = 4;
            }
        }

        public n(Wre wre, j jVar) {
            this.f11420n = wre;
            this.f11421t = jVar;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f11420n.n(new C0411j(cn3, this.f11421t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public j(fuX iapManager, Dsr creatorProgramRepository) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(creatorProgramRepository, "creatorProgramRepository");
        this.f11419n = iapManager;
        this.rl = creatorProgramRepository;
    }

    public final Wre t() {
        return new n(this.f11419n.XQ(), this);
    }
}
