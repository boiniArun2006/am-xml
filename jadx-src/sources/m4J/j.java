package m4J;

import Dk.I28;
import androidx.content.core.DataStore;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4J.j;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements D2t.n {
    private final DataStore rl;

    static final class CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.External.AppSetId f70595O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70596n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(Id.Predefined.External.AppSetId appSetId, Continuation continuation) {
            super(1, continuation);
            this.f70595O = appSetId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new CN3(this.f70595O, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Id.Predefined.External.AppSetId appSetId, I28.n nVar) {
            nVar.qie((Dk.w6) Dk.w6.ck().gh(appSetId.getValue()).xMQ(appSetId.getExpirationTimestamp()).mUb(appSetId.getScope()).build());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70596n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                final Id.Predefined.External.AppSetId appSetId = this.f70595O;
                Function1 function1 = new Function1() { // from class: m4J.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.CN3.xMQ(appSetId, (I28.n) obj2);
                    }
                };
                this.f70596n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70598n;

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70598n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                Dk.I28 i28Ik = Dk.I28.Ik();
                this.f70598n = 1;
                obj = nKx.j.rl(dataStore, i28Ik, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Dk.I28 i28 = (Dk.I28) obj;
            if (i28.o()) {
                String strHI = i28.ck().HI();
                Intrinsics.checkNotNullExpressionValue(strHI, "getValue(...)");
                return new Id.Predefined.External.AppSetId(strHI, i28.ck().az(), i28.ck().ty());
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70600n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70600n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                Dk.I28 i28Ik = Dk.I28.Ik();
                this.f70600n = 1;
                obj = nKx.j.rl(dataStore, i28Ik, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Dk.I28 i28 = (Dk.I28) obj;
            if (i28.r()) {
                String strHI = i28.HI().HI();
                Intrinsics.checkNotNullExpressionValue(strHI, "getValue(...)");
                return new Id.Predefined.External.AAID(strHI, i28.HI().az());
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.External.AAID f70602O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70603n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Id.Predefined.External.AAID aaid, Continuation continuation) {
            super(1, continuation);
            this.f70602O = aaid;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Wre(this.f70602O, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Id.Predefined.External.AAID aaid, I28.n nVar) {
            nVar.gh((Dk.w6) Dk.w6.ck().gh(aaid.getValue()).xMQ(aaid.getExpirationTimestamp()).build());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70603n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                final Id.Predefined.External.AAID aaid = this.f70602O;
                Function1 function1 = new Function1() { // from class: m4J.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.Wre.xMQ(aaid, (I28.n) obj2);
                    }
                };
                this.f70603n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70605n;

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new n(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(I28.n nVar) {
            nVar.xMQ();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70605n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                Function1 function1 = new Function1() { // from class: m4J.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.n.xMQ((I28.n) obj2);
                    }
                };
                this.f70605n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70607n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new w6(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(I28.n nVar) {
            nVar.mUb();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70607n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                Function1 function1 = new Function1() { // from class: m4J.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return j.w6.xMQ((I28.n) obj2);
                    }
                };
                this.f70607n = 1;
                if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: m4J.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C1051j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Id.Predefined.External.j.values().length];
            try {
                iArr[Id.Predefined.External.j.f51212O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Id.Predefined.External.j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(DataStore externalIdsDatastore) {
        Intrinsics.checkNotNullParameter(externalIdsDatastore, "externalIdsDatastore");
        this.rl = externalIdsDatastore;
    }

    private final Object J2(Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.J2, new w6(null), continuation);
    }

    private final Object KN(Continuation continuation) {
        return QV.j.n(j.w6.J2, j.EnumC1290j.J2, new I28(null), continuation);
    }

    private final Object O(Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.J2, new n(null), continuation);
    }

    private final Object Uo(Continuation continuation) {
        return QV.j.n(j.w6.J2, j.EnumC1290j.J2, new Ml(null), continuation);
    }

    private final Object mUb(Id.Predefined.External.AppSetId appSetId, Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.J2, new CN3(appSetId, null), continuation);
    }

    private final Object xMQ(Id.Predefined.External.AAID aaid, Continuation continuation) {
        return QV.j.rl(j.w6.J2, j.EnumC1290j.J2, new Wre(aaid, null), continuation);
    }

    @Override // D2t.n
    public Object n(Id.Predefined.External.j jVar, Continuation continuation) {
        int i2 = C1051j.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            Object objUo = Uo(continuation);
            return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : (x0X.n) objUo;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object objKN = KN(continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : (x0X.n) objKN;
    }

    @Override // D2t.n
    public Object rl(Id.Predefined.External external, Continuation continuation) {
        if (external instanceof Id.Predefined.External.AAID) {
            return xMQ((Id.Predefined.External.AAID) external, continuation);
        }
        if (external instanceof Id.Predefined.External.AppSetId) {
            return mUb((Id.Predefined.External.AppSetId) external, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // D2t.n
    public Object t(Id.Predefined.External.j jVar, Continuation continuation) {
        int i2 = C1051j.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            return O(continuation);
        }
        if (i2 == 2) {
            return J2(continuation);
        }
        throw new NoWhenBranchMatchedException();
    }
}
