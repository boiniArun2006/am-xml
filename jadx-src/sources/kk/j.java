package kk;

import PMG.n;
import b.InterfaceC1648Ml;
import b.InterfaceC1651w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sJa.I28;
import sJa.Ml;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements InterfaceC1651w6 {
    private final I28 rl;

    /* JADX INFO: renamed from: kk.j$j, reason: collision with other inner class name */
    static final class C1036j implements I28.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ao3.n f70121n;
        final /* synthetic */ jT.j nr;
        final /* synthetic */ Function0 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PMG.n f70122t;

        /* JADX INFO: renamed from: kk.j$j$j, reason: collision with other inner class name */
        static final class C1037j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f70123O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f70124n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f70125r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f70126t;

            C1037j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f70123O = obj;
                this.f70125r |= Integer.MIN_VALUE;
                return C1036j.this.n(this);
            }
        }

        C1036j(ao3.n nVar, Function0 function0, PMG.n nVar2, jT.j jVar) {
            this.f70121n = nVar;
            this.rl = function0;
            this.f70122t = nVar2;
            this.nr = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
        
            if (r5.O(r2, r0) == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
        
            if (r5.O(r2, r0) == r1) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sJa.I28.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(Continuation continuation) {
            C1037j c1037j;
            C1036j c1036j;
            List list;
            ao3.n nVar;
            x0X.n nVar2;
            if (continuation instanceof C1037j) {
                c1037j = (C1037j) continuation;
                int i2 = c1037j.f70125r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1037j.f70125r = i2 - Integer.MIN_VALUE;
                } else {
                    c1037j = new C1037j(continuation);
                }
            }
            Object objJ2 = c1037j.f70123O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c1037j.f70125r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objJ2);
                ao3.n nVar3 = this.f70121n;
                c1037j.f70124n = this;
                c1037j.f70125r = 1;
                objJ2 = nVar3.J2(c1037j);
                if (objJ2 != coroutine_suspended) {
                    c1036j = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        ResultKt.throwOnFailure(objJ2);
                        return new I28.w6.C1165w6(InterfaceC1648Ml.n.f43130n);
                    }
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objJ2);
                    return new I28.w6.C1165w6(InterfaceC1648Ml.n.f43130n);
                }
                list = (List) c1037j.f70126t;
                nVar = (ao3.n) c1037j.f70124n;
                ResultKt.throwOnFailure(objJ2);
                nVar2 = (x0X.n) objJ2;
                if (!(nVar2 instanceof n.C1266n)) {
                    n.AbstractC0271n abstractC0271n = (n.AbstractC0271n) ((n.C1266n) nVar2).n();
                    if (abstractC0271n instanceof n.AbstractC0271n.C0272n) {
                        return new I28.w6.C1165w6(InterfaceC1648Ml.n.f43129O);
                    }
                    if (!(abstractC0271n instanceof n.AbstractC0271n.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1037j.f70124n = null;
                    c1037j.f70126t = null;
                    c1037j.f70125r = 3;
                } else {
                    if (!(nVar2 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1037j.f70124n = null;
                    c1037j.f70126t = null;
                    c1037j.f70125r = 4;
                }
                return coroutine_suspended;
            }
            c1036j = (C1036j) c1037j.f70124n;
            ResultKt.throwOnFailure(objJ2);
            x0X.n nVar4 = (x0X.n) objJ2;
            Function0 function0 = c1036j.rl;
            PMG.n nVar5 = c1036j.f70122t;
            jT.j jVar = c1036j.nr;
            ao3.n nVar6 = c1036j.f70121n;
            if (nVar4 instanceof n.C1266n) {
                return new I28.w6.C1165w6(InterfaceC1648Ml.n.f43132t);
            }
            if (!(nVar4 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List list2 = (List) ((n.w6) nVar4).n();
            if (list2.isEmpty()) {
                return I28.w6.n.rl;
            }
            double dDoubleValue = ((Number) function0.invoke()).doubleValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(jVar.n((QAv.j) it.next(), dDoubleValue));
            }
            c1037j.f70124n = nVar6;
            c1037j.f70126t = list2;
            c1037j.f70125r = 2;
            Object objN = nVar5.n(arrayList, c1037j);
            if (objN != coroutine_suspended) {
                list = list2;
                objJ2 = objN;
                nVar = nVar6;
                nVar2 = (x0X.n) objJ2;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
    }

    public j(ao3.n picoEventRetriever, jT.j picoEventAdapter, PMG.n picoEventUploader, InterfaceC1648Ml picoUploadDelayProvider, Function0 timestampProvider, Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(picoEventRetriever, "picoEventRetriever");
        Intrinsics.checkNotNullParameter(picoEventAdapter, "picoEventAdapter");
        Intrinsics.checkNotNullParameter(picoEventUploader, "picoEventUploader");
        Intrinsics.checkNotNullParameter(picoUploadDelayProvider, "picoUploadDelayProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = I28.f73200n.n(picoUploadDelayProvider, dispatcherProvider, new C1036j(picoEventRetriever, timestampProvider, picoEventUploader, picoEventAdapter));
    }

    @Override // b.InterfaceC1651w6
    public void n() {
        this.rl.start();
    }
}
