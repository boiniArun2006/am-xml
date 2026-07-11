package TFv;

import GJW.yg;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class M implements Ln {
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f10293t;

    static final class j extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ int f10294O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10295n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f10296t;

        j(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return n((CN3) obj, ((Number) obj2).intValue(), (Continuation) obj3);
        }

        public final Object n(CN3 cn3, int i2, Continuation continuation) {
            j jVar = M.this.new j(continuation);
            jVar.f10296t = cn3;
            jVar.f10294O = i2;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.rl(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.rl(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 TFv.CN3) = (r1v3 TFv.CN3), (r1v4 TFv.CN3), (r1v11 TFv.CN3) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CN3 cn3;
            long j2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10295n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                cn3 = (CN3) this.f10296t;
                                ResultKt.throwOnFailure(obj);
                                u uVar = u.f10479O;
                                this.f10296t = null;
                                this.f10295n = 5;
                            }
                        } else {
                            cn3 = (CN3) this.f10296t;
                            ResultKt.throwOnFailure(obj);
                            j2 = M.this.f10293t;
                            this.f10296t = cn3;
                            this.f10295n = 4;
                            if (yg.rl(j2, this) != coroutine_suspended) {
                                u uVar2 = u.f10479O;
                                this.f10296t = null;
                                this.f10295n = 5;
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        cn3 = (CN3) this.f10296t;
                        ResultKt.throwOnFailure(obj);
                        if (M.this.f10293t <= 0) {
                            u uVar3 = u.f10482t;
                            this.f10296t = cn3;
                            this.f10295n = 3;
                            if (cn3.rl(uVar3, this) != coroutine_suspended) {
                                j2 = M.this.f10293t;
                                this.f10296t = cn3;
                                this.f10295n = 4;
                                if (yg.rl(j2, this) != coroutine_suspended) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            cn3 = (CN3) this.f10296t;
            if (this.f10294O <= 0) {
                long j3 = M.this.rl;
                this.f10296t = cn3;
                this.f10295n = 2;
                if (yg.rl(j3, this) != coroutine_suspended) {
                    if (M.this.f10293t <= 0) {
                    }
                }
            } else {
                u uVar4 = u.f10480n;
                this.f10295n = 1;
            }
            return coroutine_suspended;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10297n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10298t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(continuation);
            nVar.f10298t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10297n == 0) {
                ResultKt.throwOnFailure(obj);
                if (((u) this.f10298t) != u.f10480n) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation continuation) {
            return ((n) create(uVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public String toString() {
        List listCreateListBuilder = CollectionsKt.createListBuilder(2);
        if (this.rl > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.rl + "ms");
        }
        if (this.f10293t < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.f10293t + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m2 = (M) obj;
        return this.rl == m2.rl && this.f10293t == m2.f10293t;
    }

    public int hashCode() {
        return (Long.hashCode(this.rl) * 31) + Long.hashCode(this.f10293t);
    }

    @Override // TFv.Ln
    public Wre n(rv6 rv6Var) {
        return fuX.Ik(fuX.Z(fuX.P5(rv6Var, new j(null)), new n(null)));
    }

    public M(long j2, long j3) {
        this.rl = j2;
        this.f10293t = j3;
        if (j2 >= 0) {
            if (j3 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
    }
}
