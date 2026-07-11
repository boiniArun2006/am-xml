package w;

import Dk.InterfaceC1335n;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2412j {

    /* JADX INFO: renamed from: w.j$j, reason: collision with other inner class name */
    static final class C1246j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f74773O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74774n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f74775o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f74776r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74777t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74776r = obj;
            this.f74775o |= Integer.MIN_VALUE;
            return AbstractC2412j.n(null, this);
        }

        C1246j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[LOOP:1: B:37:0x00f4->B:39:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(InterfaceC1335n interfaceC1335n, Continuation continuation) {
        C1246j c1246j;
        Object[] objArr;
        InterfaceC1335n interfaceC1335n2;
        int i2;
        Object[] objArr2;
        Object[] objArr3;
        InterfaceC1335n interfaceC1335n3;
        Object[] objArr4;
        Object[] objArr5;
        Iterator it;
        if (continuation instanceof C1246j) {
            c1246j = (C1246j) continuation;
            int i3 = c1246j.f74775o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1246j.f74775o = i3 - Integer.MIN_VALUE;
            } else {
                c1246j = new C1246j(continuation);
            }
        }
        Object objO = c1246j.f74776r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c1246j.f74775o;
        int i7 = 2;
        int i8 = 1;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objO);
            objArr = new x0X.n[3];
            Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51220t;
            c1246j.f74774n = interfaceC1335n;
            c1246j.f74777t = objArr;
            c1246j.f74773O = objArr;
            c1246j.J2 = 0;
            c1246j.f74775o = 1;
            objO = interfaceC1335n.O(jVar, c1246j);
            if (objO != coroutine_suspended) {
                interfaceC1335n2 = interfaceC1335n;
                i2 = 0;
                objArr2 = objArr;
            }
            return coroutine_suspended;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = c1246j.J2;
                objArr4 = (x0X.n[]) c1246j.f74777t;
                objArr5 = (x0X.n[]) c1246j.f74774n;
                ResultKt.throwOnFailure(objO);
                objArr4[i7] = objO;
                List listListOfNotNull = CollectionsKt.listOfNotNull(objArr5);
                ArrayList<Id.Predefined.Internal> arrayList = new ArrayList();
                it = listListOfNotNull.iterator();
                while (it.hasNext()) {
                    Id.Predefined.Internal internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) it.next());
                    if (internal != null) {
                        arrayList.add(internal);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                for (Id.Predefined.Internal internal2 : arrayList) {
                    Pair pair = TuplesKt.to(internal2.getName(), internal2.getValue());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return linkedHashMap;
            }
            i8 = c1246j.J2;
            Object[] objArr6 = (x0X.n[]) c1246j.f74773O;
            objArr = (x0X.n[]) c1246j.f74777t;
            interfaceC1335n3 = (InterfaceC1335n) c1246j.f74774n;
            ResultKt.throwOnFailure(objO);
            objArr3 = objArr6;
            objArr3[i8] = objO;
            Id.Predefined.Internal.j jVar2 = Id.Predefined.Internal.j.J2;
            c1246j.f74774n = objArr;
            c1246j.f74777t = objArr;
            c1246j.f74773O = null;
            c1246j.J2 = 2;
            c1246j.f74775o = 3;
            objO = interfaceC1335n3.O(jVar2, c1246j);
            if (objO != coroutine_suspended) {
                objArr4 = objArr;
                objArr5 = objArr4;
                objArr4[i7] = objO;
                List listListOfNotNull2 = CollectionsKt.listOfNotNull(objArr5);
                ArrayList<Id.Predefined.Internal> arrayList2 = new ArrayList();
                it = listListOfNotNull2.iterator();
                while (it.hasNext()) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                while (r9.hasNext()) {
                }
                return linkedHashMap2;
            }
            return coroutine_suspended;
        }
        i2 = c1246j.J2;
        Object[] objArr7 = (x0X.n[]) c1246j.f74773O;
        Object[] objArr8 = (x0X.n[]) c1246j.f74777t;
        interfaceC1335n2 = (InterfaceC1335n) c1246j.f74774n;
        ResultKt.throwOnFailure(objO);
        objArr2 = objArr7;
        objArr = objArr8;
        objArr2[i2] = objO;
        Id.Predefined.Internal.j jVar3 = Id.Predefined.Internal.j.f51217O;
        c1246j.f74774n = interfaceC1335n2;
        c1246j.f74777t = objArr;
        c1246j.f74773O = objArr;
        c1246j.J2 = 1;
        c1246j.f74775o = 2;
        objO = interfaceC1335n2.O(jVar3, c1246j);
        if (objO != coroutine_suspended) {
            objArr3 = objArr;
            interfaceC1335n3 = interfaceC1335n2;
            objArr3[i8] = objO;
            Id.Predefined.Internal.j jVar22 = Id.Predefined.Internal.j.J2;
            c1246j.f74774n = objArr;
            c1246j.f74777t = objArr;
            c1246j.f74773O = null;
            c1246j.J2 = 2;
            c1246j.f74775o = 3;
            objO = interfaceC1335n3.O(jVar22, c1246j);
            if (objO != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
