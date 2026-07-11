package LRV;

import GJW.vd;
import LRV.fuX;
import LRV.j;
import TFv.Lu;
import TFv.SPz;
import TFv.Z;
import TFv.nKK;
import TFv.r;
import TFv.rv6;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class fuX extends ViewModel {
    public static final w6 KN = new w6(null);
    public static final int xMQ = 8;
    private final SPz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f6101O;
    private final r Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UX1.j f6102n;
    private final boolean nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f6103t;

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LRV.j f6104O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6105n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(LRV.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f6104O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new I28(this.f6104O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r5.rl(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6105n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                UX1.j jVar = fuX.this.f6102n;
                String url = this.f6104O.getUrl();
                this.f6105n = 1;
                if (jVar.t(url, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            r rVar = fuX.this.Uo;
            n.j jVar2 = n.j.f6113n;
            this.f6105n = 2;
        }
    }

    public interface Ml {

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class j implements Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final List f6107n;
            private final int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final int f6108t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return Intrinsics.areEqual(this.f6107n, jVar.f6107n) && this.rl == jVar.rl && this.f6108t == jVar.f6108t;
            }

            public j(List availableEndpoints, int i2, int i3) {
                Intrinsics.checkNotNullParameter(availableEndpoints, "availableEndpoints");
                this.f6107n = availableEndpoints;
                this.rl = i2;
                this.f6108t = i3;
            }

            public int hashCode() {
                return (((this.f6107n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f6108t);
            }

            public final List n() {
                return this.f6107n;
            }

            public final int rl() {
                return this.rl;
            }

            public final int t() {
                return this.f6108t;
            }

            public String toString() {
                return "Content(availableEndpoints=" + this.f6107n + ", currentEndpointIndex=" + this.rl + ", defaultEndpointIndex=" + this.f6108t + obbPUqyhtS.iURLVq;
            }
        }

        public static final class n implements Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f6109n = new n();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public String toString() {
                return "Loading";
            }

            private n() {
            }

            public int hashCode() {
                return 973157609;
            }
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6110n;

        /* JADX INFO: renamed from: LRV.fuX$j$j, reason: collision with other inner class name */
        static final class C0209j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ fuX f6112n;

            C0209j(fuX fux) {
                this.f6112n = fux;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(String str, Continuation continuation) {
                Object next;
                Ml.j jVar;
                SPz sPz = this.f6112n.J2;
                if (str == null) {
                    jVar = new Ml.j(this.f6112n.f6101O, this.f6112n.f6103t, this.f6112n.f6103t);
                } else {
                    Iterator it = this.f6112n.rl.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((j.n) next).getUrl(), str)) {
                            break;
                        }
                    }
                    LRV.j c0210j = (j.n) next;
                    if (c0210j == null) {
                        fuX fux = this.f6112n;
                        c0210j = fux.nr ? new j.C0210j(str) : fux.gh();
                    }
                    if (c0210j instanceof j.n) {
                        jVar = new Ml.j(this.f6112n.f6101O, aC.rl(this.f6112n.f6101O.indexOf(c0210j)), this.f6112n.f6103t);
                    } else {
                        if (!(c0210j instanceof j.C0210j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator it2 = this.f6112n.f6101O.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (((LRV.j) it2.next()) instanceof j.C0210j) {
                                break;
                            }
                            i2++;
                        }
                        int iRl = aC.rl(i2);
                        List mutableList = CollectionsKt.toMutableList((Collection) this.f6112n.f6101O);
                        mutableList.set(iRl, c0210j);
                        jVar = new Ml.j(mutableList, iRl, this.f6112n.f6103t);
                    }
                }
                sPz.setValue(jVar);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6110n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreRl = fuX.this.f6102n.rl();
                C0209j c0209j = new C0209j(fuX.this);
                this.f6110n = 1;
                if (wreRl.n(c0209j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static abstract class n {

        public static final class j extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f6113n = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public String toString() {
                return "ResetApp";
            }

            public int hashCode() {
                return 2016856276;
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fuX t(UX1.j jVar, List list, int i2, boolean z2, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new fuX(jVar, list, i2, z2);
        }

        public final ViewModelProvider.Factory rl(final UX1.j datastore, final List endpoints, final int i2, final boolean z2) {
            Intrinsics.checkNotNullParameter(datastore, "datastore");
            Intrinsics.checkNotNullParameter(endpoints, "endpoints");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(fuX.class), new Function1() { // from class: LRV.Dsr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.w6.t(datastore, endpoints, i2, z2, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.rl();
        }
    }

    public fuX(UX1.j overridesDatastore, List predefinedEndpoints, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(overridesDatastore, "overridesDatastore");
        Intrinsics.checkNotNullParameter(predefinedEndpoints, "predefinedEndpoints");
        this.f6102n = overridesDatastore;
        this.rl = predefinedEndpoints;
        this.f6103t = i2;
        this.nr = z2;
        this.f6101O = z2 ? CollectionsKt.plus((Collection) predefinedEndpoints, (Iterable) CollectionsKt.listOf(new j.C0210j(""))) : predefinedEndpoints;
        this.J2 = Lu.n(Ml.n.f6109n);
        this.Uo = nKK.rl(0, 0, null, 7, null);
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LRV.j gh() {
        return (LRV.j) this.rl.get(this.f6103t);
    }

    public final void az(LRV.j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GJW.C.nr(ViewModelKt.n(this), null, null, new I28(value, null), 3, null);
    }

    public final Z mUb() {
        return this.Uo;
    }

    public final rv6 qie() {
        return this.J2;
    }
}
