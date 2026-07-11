package fwX;

import CZF.I28;
import WN.j;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import ao3.w6;
import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoEventEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements ao3.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0928j f66984O = new C0928j(null);
    private I28.w6 nr;
    private final DV.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f66985t;

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66986O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66987n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66988r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66989t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66986O = obj;
            this.f66988r |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class Dsr extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ QAv.j f66990O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66991n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(QAv.j jVar, Continuation continuation) {
            super(1, continuation);
            this.f66990O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Dsr(this.f66990O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66991n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException(qfEYuUHwj.uHOzuOWzY);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                I28.w6 w6VarXMQ = j.this.xMQ();
                I28.w6 w6Var = I28.w6.J2;
                if (w6VarXMQ != w6Var) {
                    DV.j jVar = j.this.rl;
                    String id$pico_release = this.f66990O.n().getId$pico_release();
                    QAv.j jVar2 = this.f66990O;
                    if (j.this.xMQ() == I28.w6.f985O) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    PicoEventEntity picoEventEntity = new PicoEventEntity(id$pico_release, jVar2, z2);
                    this.f66991n = 1;
                    if (jVar.rl(picoEventEntity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalStateException(("Cannot store events when state is " + w6Var + ".").toString());
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Dsr) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66994n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66995t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66995t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.J2(this);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Collection f66996O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66997n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Collection collection, Continuation continuation) {
            super(1, continuation);
            this.f66996O = collection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Ml(this.f66996O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66997n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DV.j jVar = j.this.rl;
                Collection collection = this.f66996O;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((QAv.j) it.next()).n().getId$pico_release());
                }
                this.f66997n = 1;
                if (jVar.n(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66999n;

        Wre(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66999n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DV.j jVar = j.this.rl;
                int i3 = j.this.f66985t;
                this.f66999n = 1;
                obj = jVar.t(i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((PicoEventEntity) it.next()).getEventData());
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67002n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f67003t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67003t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.t(null, this);
        }
    }

    /* JADX INFO: renamed from: fwX.j$j, reason: collision with other inner class name */
    public static final class C0928j {
        public /* synthetic */ C0928j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0928j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final x0X.n rl(x0X.n nVar) {
            if (nVar instanceof n.C1266n) {
                Throwable th = (Throwable) ((n.C1266n) nVar).n();
                return new n.C1266n(new WN.j(j.w6.J2, j.EnumC0415j.f11467O, j.n.f11480t, th.getMessage(), th));
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67005n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f67006t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67006t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.O(null, this);
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[I28.w6.values().length];
            try {
                iArr[I28.w6.f985O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I28.w6.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I28.w6.f989r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(DV.j picoEventDao, int i2) {
        Intrinsics.checkNotNullParameter(picoEventDao, "picoEventDao");
        this.rl = picoEventDao;
        this.f66985t = i2;
        this.nr = I28.w6.f987n.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ao3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J2(Continuation continuation) {
        I28 i28;
        C0928j c0928j;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.J2 = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object obj = i28.f66995t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C0928j c0928j2 = f66984O;
            Wre wre = new Wre(null);
            i28.f66994n = c0928j2;
            i28.J2 = 1;
            Object objUo = x0X.w6.Uo(wre, i28);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            c0928j = c0928j2;
            obj = objUo;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0928j = (C0928j) i28.f66994n;
            ResultKt.throwOnFailure(obj);
        }
        return c0928j.rl((x0X.n) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ao3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Collection collection, Continuation continuation) {
        w6 w6Var;
        C0928j c0928j;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.f67006t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C0928j c0928j2 = f66984O;
            Ml ml = new Ml(collection, null);
            w6Var.f67005n = c0928j2;
            w6Var.J2 = 1;
            Object objUo = x0X.w6.Uo(ml, w6Var);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objUo;
            c0928j = c0928j2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0928j = (C0928j) w6Var.f67005n;
            ResultKt.throwOnFailure(obj);
        }
        return c0928j.rl((x0X.n) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r8.nr(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r8.O(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ao3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(I28.w6 w6Var, Continuation continuation) {
        CN3 cn3;
        j jVar;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f66988r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f66988r = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object obj = cn3.f66986O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f66988r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I28.w6 w6Var2 = this.nr;
            if (w6Var2 == w6Var) {
                return Unit.INSTANCE;
            }
            if (w6Var2 == I28.w6.f989r) {
                DV.j jVar2 = this.rl;
                int i5 = n.$EnumSwitchMapping$0[w6Var.ordinal()];
                if (i5 == 1) {
                    cn3.f66987n = this;
                    cn3.f66989t = w6Var;
                    cn3.f66988r = 1;
                } else if (i5 == 2) {
                    cn3.f66987n = this;
                    cn3.f66989t = w6Var;
                    cn3.f66988r = 2;
                } else if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            jVar = this;
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var = (I28.w6) cn3.f66989t;
            jVar = (j) cn3.f66987n;
            ResultKt.throwOnFailure(obj);
        }
        jVar.nr = w6Var;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ao3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(QAv.j jVar, Continuation continuation) {
        fuX fux;
        C0928j c0928j;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object obj = fux.f67003t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C0928j c0928j2 = f66984O;
            Dsr dsr = new Dsr(jVar, null);
            fux.f67002n = c0928j2;
            fux.J2 = 1;
            Object objUo = x0X.w6.Uo(dsr, fux);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objUo;
            c0928j = c0928j2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0928j = (C0928j) fux.f67002n;
            ResultKt.throwOnFailure(obj);
        }
        return c0928j.rl((x0X.n) obj);
    }

    public final I28.w6 xMQ() {
        return this.nr;
    }

    @Override // ao3.w6
    public ao3.j nr() {
        return w6.n.n(this);
    }

    @Override // ao3.w6
    public ao3.n rl() {
        return w6.n.rl(this);
    }
}
