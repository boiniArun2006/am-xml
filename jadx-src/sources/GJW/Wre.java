package GJW;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3459O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3460n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3461r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3462t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3461r |= Integer.MIN_VALUE;
            return Wre.nr(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3463O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3464n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3465t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3465t = obj;
            this.f3463O |= Integer.MIN_VALUE;
            return Wre.t(null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    public static final Object rl(P[] pArr, Continuation continuation) {
        return pArr.length == 0 ? CollectionsKt.emptyList() : new I28(pArr).t(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(xuv[] xuvVarArr, Continuation continuation) {
        j jVar;
        int i2;
        xuv[] xuvVarArr2;
        int length;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.f3461r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f3461r = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = jVar.f3461r;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            i2 = 0;
            xuvVarArr2 = xuvVarArr;
            length = xuvVarArr.length;
            if (i2 < length) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = jVar.f3459O;
            i2 = jVar.f3462t;
            xuv[] xuvVarArr3 = (xuv[]) jVar.f3460n;
            ResultKt.throwOnFailure(obj);
            xuvVarArr2 = xuvVarArr3;
            i2++;
            if (i2 < length) {
                xuv xuvVar = xuvVarArr2[i2];
                jVar.f3460n = xuvVarArr2;
                jVar.f3462t = i2;
                jVar.f3459O = length;
                jVar.f3461r = 1;
                if (xuvVar.join(jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                if (i2 < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(Collection collection, Continuation continuation) {
        n nVar;
        Iterator it;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f3463O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f3463O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f3465t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f3463O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            it = collection.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) nVar.f3464n;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            xuv xuvVar = (xuv) it.next();
            nVar.f3464n = it;
            nVar.f3463O = 1;
            if (xuvVar.join(nVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object n(Collection collection, Continuation continuation) {
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return new I28((P[]) collection.toArray(new P[0])).t(continuation);
    }
}
