package bV;

import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import bV.C1666j;
import cb.InterfaceC1680j;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: renamed from: bV.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1666j implements InterfaceC1680j {
    private final Object rl = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f43319t = new ArrayList();

    /* JADX INFO: renamed from: bV.j$j, reason: collision with other inner class name */
    static final class C0578j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43320O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43321n;

        C0578j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43321n = obj;
            this.f43320O |= Integer.MIN_VALUE;
            return C1666j.this.n(this);
        }
    }

    /* JADX INFO: renamed from: bV.j$n */
    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43324n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f43325t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43325t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return C1666j.this.rl(null, this);
        }
    }

    /* JADX INFO: renamed from: bV.j$w6 */
    static final class w6 extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43326O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43327n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43329t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1666j.this.new w6(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object O(Id.CustomId customId) {
            return customId.getName();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0067). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Set set;
            Iterator it;
            Collection collection;
            List listListOf;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 != 0) {
                if (i2 == 1) {
                    collection = (Collection) this.f43326O;
                    it = (Iterator) this.f43329t;
                    Collection collection2 = (Collection) this.f43327n;
                    ResultKt.throwOnFailure(obj);
                    x0X.n nVar = (x0X.n) obj;
                    if (nVar instanceof n.C1266n) {
                        listListOf = CollectionsKt.listOf(new n.C1266n(bV.w6.t((Exception) ((n.C1266n) nVar).n())));
                    } else if (nVar instanceof n.w6) {
                        Set set2 = (Set) ((n.w6) nVar).n();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new n.w6((Id.CustomId) it2.next()));
                        }
                        listListOf = arrayList;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    collection.add(listListOf);
                    collection = collection2;
                    if (it.hasNext()) {
                        HX.j jVar = (HX.j) it.next();
                        this.f43327n = collection;
                        this.f43329t = it;
                        this.f43326O = collection;
                        this.J2 = 1;
                        obj = HX.n.n(jVar, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection2 = collection;
                        x0X.n nVar2 = (x0X.n) obj;
                        if (nVar2 instanceof n.C1266n) {
                        }
                        collection.add(listListOf);
                        collection = collection2;
                        if (it.hasNext()) {
                            List listFlatten = CollectionsKt.flatten((List) collection);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = listFlatten.iterator();
                            while (it3.hasNext()) {
                                Id.CustomId customId = (Id.CustomId) x0X.w6.nr((x0X.n) it3.next());
                                if (customId != null) {
                                    arrayList2.add(customId);
                                }
                            }
                            List listNr = bV.w6.nr(arrayList2, new Function1() { // from class: bV.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return C1666j.w6.O((Id.CustomId) obj2);
                                }
                            });
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = listFlatten.iterator();
                            while (it4.hasNext()) {
                                zD.j jVar2 = (zD.j) x0X.w6.rl((x0X.n) it4.next());
                                if (jVar2 != null) {
                                    arrayList3.add(jVar2);
                                }
                            }
                            return TuplesKt.to(listNr, arrayList3);
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = C1666j.this.rl;
                C1666j c1666j = C1666j.this;
                synchronized (obj2) {
                    set = CollectionsKt.toSet(c1666j.f43319t);
                }
                Set set3 = set;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set3, 10));
                it = set3.iterator();
                collection = arrayList4;
                if (it.hasNext()) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cb.InterfaceC1680j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C0578j c0578j;
        if (continuation instanceof C0578j) {
            c0578j = (C0578j) continuation;
            int i2 = c0578j.f43320O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0578j.f43320O = i2 - Integer.MIN_VALUE;
            } else {
                c0578j = new C0578j(continuation);
            }
        }
        Object objJ2 = c0578j.f43321n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0578j.f43320O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            c0578j.f43320O = 1;
            objJ2 = J2(c0578j);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ2);
        }
        return CollectionsKt.toSet((Iterable) ((Pair) objJ2).getFirst());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cb.InterfaceC1680j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, Continuation continuation) {
        n nVar;
        Object objPrevious;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objJ2 = nVar.f43325t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            nVar.f43324n = str;
            nVar.J2 = 1;
            objJ2 = J2(nVar);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nVar.f43324n;
            ResultKt.throwOnFailure(objJ2);
        }
        Pair pair = (Pair) objJ2;
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (Intrinsics.areEqual(((Id.CustomId) objPrevious).getName(), str)) {
                break;
            }
        }
        Id.CustomId customId = (Id.CustomId) objPrevious;
        return customId != null ? new n.w6(customId) : list2.isEmpty() ? new n.w6(null) : new n.C1266n(CollectionsKt.first(list2));
    }

    @Override // cb.InterfaceC1680j
    public void t(HX.j provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.rl) {
            this.f43319t.add(provider);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Object J2(Continuation continuation) {
        return Dsr.Uo(OU.n(), new w6(null), continuation);
    }
}
