package kk;

import PMG.n;
import b.InterfaceC1651w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sJa.I28;
import sJa.Ml;
import sJa.fuX;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements InterfaceC1651w6 {
    private final I28 rl;

    static final class j implements I28.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ao3.n f70128n;
        final /* synthetic */ jT.j nr;
        final /* synthetic */ Function0 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PMG.n f70129t;

        /* JADX INFO: renamed from: kk.w6$j$j, reason: collision with other inner class name */
        static final class C1038j extends ContinuationImpl {
            /* synthetic */ Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f70130O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f70131n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f70132o;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f70134t;

            C1038j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.J2 = obj;
                this.f70132o |= Integer.MIN_VALUE;
                return j.this.n(this);
            }
        }

        j(ao3.n nVar, Function0 function0, PMG.n nVar2, jT.j jVar) {
            this.f70128n = nVar;
            this.rl = function0;
            this.f70129t = nVar2;
            this.nr = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        
            if (r5.O(r2, r0) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
        
            if (r5.O(r2, r0) == r1) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sJa.I28.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(Continuation continuation) {
            C1038j c1038j;
            j jVar;
            x0X.n nVar;
            ao3.n nVar2;
            List list;
            x0X.n nVar3;
            if (continuation instanceof C1038j) {
                c1038j = (C1038j) continuation;
                int i2 = c1038j.f70132o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1038j.f70132o = i2 - Integer.MIN_VALUE;
                } else {
                    c1038j = new C1038j(continuation);
                }
            }
            Object objJ2 = c1038j.J2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c1038j.f70132o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objJ2);
                ao3.n nVar4 = this.f70128n;
                c1038j.f70131n = this;
                c1038j.f70132o = 1;
                objJ2 = nVar4.J2(c1038j);
                if (objJ2 != coroutine_suspended) {
                    jVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 == 1) {
                jVar = (j) c1038j.f70131n;
                ResultKt.throwOnFailure(objJ2);
            } else {
                if (i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objJ2);
                    return fuX.n(I28.w6.f73202n);
                }
                list = (List) c1038j.f70130O;
                nVar2 = (ao3.n) c1038j.f70134t;
                nVar = (x0X.n) c1038j.f70131n;
                ResultKt.throwOnFailure(objJ2);
                nVar3 = (x0X.n) objJ2;
                if (!(nVar3 instanceof n.C1266n)) {
                    n.AbstractC0271n abstractC0271n = (n.AbstractC0271n) ((n.C1266n) nVar3).n();
                    if (abstractC0271n instanceof n.AbstractC0271n.j) {
                        c1038j.f70131n = nVar;
                        c1038j.f70134t = null;
                        c1038j.f70130O = null;
                        c1038j.f70132o = 3;
                    } else {
                        if (!(abstractC0271n instanceof n.AbstractC0271n.C0272n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    return fuX.n(I28.w6.f73202n);
                }
                if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1038j.f70131n = nVar;
                c1038j.f70134t = null;
                c1038j.f70130O = null;
                c1038j.f70132o = 4;
            }
            nVar = (x0X.n) objJ2;
            Function0 function0 = jVar.rl;
            PMG.n nVar5 = jVar.f70129t;
            jT.j jVar2 = jVar.nr;
            ao3.n nVar6 = jVar.f70128n;
            if (!(nVar instanceof n.C1266n)) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list2 = (List) ((n.w6) nVar).n();
                if (!list2.isEmpty()) {
                    double dDoubleValue = ((Number) function0.invoke()).doubleValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jVar2.n((QAv.j) it.next(), dDoubleValue));
                    }
                    c1038j.f70131n = nVar;
                    c1038j.f70134t = nVar6;
                    c1038j.f70130O = list2;
                    c1038j.f70132o = 2;
                    objJ2 = nVar5.n(arrayList, c1038j);
                    if (objJ2 != coroutine_suspended) {
                        nVar2 = nVar6;
                        list = list2;
                        nVar3 = (x0X.n) objJ2;
                        if (!(nVar3 instanceof n.C1266n)) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            return fuX.n(I28.w6.f73202n);
        }
    }

    public w6(ao3.n picoEventRetriever, jT.j picoEventAdapter, PMG.n picoEventUploader, q3M.n pollingDelayProvider, Function0 timestampProvider, Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(picoEventRetriever, "picoEventRetriever");
        Intrinsics.checkNotNullParameter(picoEventAdapter, "picoEventAdapter");
        Intrinsics.checkNotNullParameter(picoEventUploader, "picoEventUploader");
        Intrinsics.checkNotNullParameter(pollingDelayProvider, "pollingDelayProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = I28.f73200n.n(pollingDelayProvider, dispatcherProvider, new j(picoEventRetriever, timestampProvider, picoEventUploader, picoEventAdapter));
    }

    @Override // b.InterfaceC1651w6
    public void n() {
        this.rl.start();
    }
}
