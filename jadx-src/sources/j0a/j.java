package j0a;

import SpD.PicoXEvent;
import com.bendingspoons.picox.persistence.internal.entity.PicoXEventEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zL.j f69283n;
    private final int rl;

    /* JADX INFO: renamed from: j0a.j$j, reason: collision with other inner class name */
    static final class C0981j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f69284O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f69285n;

        C0981j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69285n = obj;
            this.f69284O |= Integer.MIN_VALUE;
            return j.this.rl(this);
        }
    }

    public j(zL.j picoXEventDao, int i2) {
        Intrinsics.checkNotNullParameter(picoXEventDao, "picoXEventDao");
        this.f69283n = picoXEventDao;
        this.rl = i2;
    }

    public final Object n(Collection collection, Continuation continuation) {
        zL.j jVar = this.f69283n;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PicoXEvent) it.next()).getEventId());
        }
        Object objN = jVar.n(arrayList, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Continuation continuation) {
        C0981j c0981j;
        if (continuation instanceof C0981j) {
            c0981j = (C0981j) continuation;
            int i2 = c0981j.f69284O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0981j.f69284O = i2 - Integer.MIN_VALUE;
            } else {
                c0981j = new C0981j(continuation);
            }
        }
        Object objRl = c0981j.f69285n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0981j.f69284O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            zL.j jVar = this.f69283n;
            int i5 = this.rl;
            c0981j.f69284O = 1;
            objRl = jVar.rl(i5, c0981j);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
        }
        Iterable iterable = (Iterable) objRl;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((PicoXEventEntity) it.next()).getEventData());
        }
        return arrayList;
    }

    public final Object t(PicoXEvent picoXEvent, Continuation continuation) {
        Object objT = this.f69283n.t(new PicoXEventEntity(picoXEvent.getEventId(), picoXEvent), continuation);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }
}
