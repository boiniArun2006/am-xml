package JLh;

import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import ujA.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Fqb.j {
    private final D2t.n rl;

    /* JADX INFO: renamed from: JLh.j$j, reason: collision with other inner class name */
    static final class C0154j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f4461O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f4462Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4463n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4465r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4466t;

        C0154j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4465r = obj;
            this.f4462Z |= Integer.MIN_VALUE;
            return j.this.t(this);
        }
    }

    public j(D2t.n externalIdStorage) {
        Intrinsics.checkNotNullParameter(externalIdStorage, "externalIdStorage");
        this.rl = externalIdStorage;
    }

    @Override // Fqb.j
    public Object n(Id.Predefined.External.j jVar, Continuation continuation) {
        return this.rl.n(jVar, continuation);
    }

    @Override // Fqb.j
    public Object rl(Id.Predefined.External external, Continuation continuation) {
        return this.rl.rl(external, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007a -> B:21:0x007b). Please report as a decompilation issue!!! */
    @Override // Fqb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        C0154j c0154j;
        Collection arrayList;
        j jVar;
        Iterator it;
        if (continuation instanceof C0154j) {
            c0154j = (C0154j) continuation;
            int i2 = c0154j.f4462Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0154j.f4462Z = i2 - Integer.MIN_VALUE;
            } else {
                c0154j = new C0154j(continuation);
            }
        }
        Object objT = c0154j.f4465r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0154j.f4462Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Set setN = w6.n();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN, 10));
            jVar = this;
            it = setN.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) c0154j.J2;
            it = (Iterator) c0154j.f4461O;
            Collection collection = (Collection) c0154j.f4466t;
            jVar = (j) c0154j.f4463n;
            ResultKt.throwOnFailure(objT);
            arrayList.add((x0X.n) objT);
            arrayList = collection;
            if (it.hasNext()) {
                Id.Predefined.External.j jVar2 = (Id.Predefined.External.j) it.next();
                D2t.n nVar = jVar.rl;
                c0154j.f4463n = jVar;
                c0154j.f4466t = arrayList;
                c0154j.f4461O = it;
                c0154j.J2 = arrayList;
                c0154j.f4462Z = 1;
                objT = nVar.t(jVar2, c0154j);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection = arrayList;
                arrayList.add((x0X.n) objT);
                arrayList = collection;
                if (it.hasNext()) {
                    return x0X.w6.t((List) arrayList);
                }
            }
        }
    }
}
