package Hih;

import Dk.InterfaceC1335n;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements Hih.j {
    private final InterfaceC1335n rl;

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3941O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f3943Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3944g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3945n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f3946o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3947r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3948t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3943Z = obj;
            this.f3944g |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    public n(InterfaceC1335n concierge) {
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        this.rl = concierge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v23, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v52, types: [T, java.lang.String] */
    @Override // Hih.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        j jVar;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        n nVar;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        x0X.n nVar2;
        Ref.ObjectRef objectRef10;
        Ref.ObjectRef objectRef11;
        Ref.ObjectRef objectRef12;
        n nVar3;
        x0X.n nVar4;
        Ref.ObjectRef objectRef13;
        Ref.ObjectRef objectRef14;
        Ref.ObjectRef objectRef15;
        Ref.ObjectRef objectRef16;
        x0X.n nVar5;
        Ref.ObjectRef objectRef17;
        Ref.ObjectRef objectRef18;
        Ref.ObjectRef objectRef19;
        Ref.ObjectRef objectRef20;
        Ref.ObjectRef objectRef21;
        x0X.n nVar6;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f3944g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f3944g = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objT = jVar.f3943Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f3944g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            Ref.ObjectRef objectRef23 = new Ref.ObjectRef();
            objectRef23.element = "";
            Ref.ObjectRef objectRef24 = new Ref.ObjectRef();
            objectRef24.element = "";
            InterfaceC1335n interfaceC1335n = this.rl;
            Id.Predefined.External.j jVar2 = Id.Predefined.External.j.f51212O;
            jVar.f3945n = this;
            jVar.f3948t = objectRef22;
            jVar.f3941O = objectRef;
            jVar.J2 = objectRef2;
            jVar.f3947r = objectRef23;
            jVar.f3946o = objectRef24;
            jVar.f3944g = 1;
            objT = interfaceC1335n.t(jVar2, jVar);
            if (objT != coroutine_suspended) {
                objectRef3 = objectRef23;
                objectRef4 = objectRef24;
                objectRef5 = objectRef22;
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                objectRef4 = (Ref.ObjectRef) jVar.f3946o;
                objectRef6 = (Ref.ObjectRef) jVar.f3947r;
                objectRef7 = (Ref.ObjectRef) jVar.J2;
                objectRef8 = (Ref.ObjectRef) jVar.f3941O;
                objectRef9 = (Ref.ObjectRef) jVar.f3948t;
                nVar = (n) jVar.f3945n;
                ResultKt.throwOnFailure(objT);
                nVar2 = (x0X.n) objT;
                if (!(nVar2 instanceof n.C1266n)) {
                } else {
                    if (!(nVar2 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Id.Predefined.External external = (Id.Predefined.External) ((n.w6) nVar2).n();
                    if (external != null) {
                        objectRef9.element = external.getValue();
                    }
                }
                InterfaceC1335n interfaceC1335n2 = nVar.rl;
                Id.Predefined.Internal.j jVar3 = Id.Predefined.Internal.j.f51220t;
                jVar.f3945n = nVar;
                jVar.f3948t = objectRef9;
                jVar.f3941O = objectRef8;
                jVar.J2 = objectRef7;
                jVar.f3947r = objectRef6;
                jVar.f3946o = objectRef4;
                jVar.f3944g = 3;
                objT = interfaceC1335n2.O(jVar3, jVar);
                if (objT != coroutine_suspended) {
                    objectRef10 = objectRef6;
                    objectRef11 = objectRef7;
                    objectRef12 = objectRef8;
                    nVar3 = nVar;
                    nVar4 = (x0X.n) objT;
                    if (!(nVar4 instanceof n.C1266n)) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 3) {
                objectRef4 = (Ref.ObjectRef) jVar.f3946o;
                objectRef10 = (Ref.ObjectRef) jVar.f3947r;
                objectRef11 = (Ref.ObjectRef) jVar.J2;
                objectRef12 = (Ref.ObjectRef) jVar.f3941O;
                Ref.ObjectRef objectRef25 = (Ref.ObjectRef) jVar.f3948t;
                n nVar7 = (n) jVar.f3945n;
                ResultKt.throwOnFailure(objT);
                objectRef9 = objectRef25;
                nVar3 = nVar7;
                nVar4 = (x0X.n) objT;
                if (!(nVar4 instanceof n.C1266n)) {
                    throw ((zD.j) ((n.C1266n) nVar4).n()).nr();
                }
                if (!(nVar4 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                objectRef11.element = ((Id.Predefined.Internal) ((n.w6) nVar4).n()).getValue();
                InterfaceC1335n interfaceC1335n3 = nVar3.rl;
                Id.Predefined.Internal.j jVar4 = Id.Predefined.Internal.j.f51217O;
                jVar.f3945n = nVar3;
                jVar.f3948t = objectRef9;
                jVar.f3941O = objectRef12;
                jVar.J2 = objectRef11;
                jVar.f3947r = objectRef10;
                jVar.f3946o = objectRef4;
                jVar.f3944g = 4;
                objT = interfaceC1335n3.O(jVar4, jVar);
                if (objT != coroutine_suspended) {
                    objectRef13 = objectRef10;
                    objectRef14 = objectRef11;
                    objectRef15 = objectRef12;
                    objectRef16 = objectRef9;
                    nVar5 = (x0X.n) objT;
                    if (!(nVar5 instanceof n.C1266n)) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef17 = (Ref.ObjectRef) jVar.f3947r;
                objectRef18 = (Ref.ObjectRef) jVar.J2;
                objectRef19 = (Ref.ObjectRef) jVar.f3941O;
                objectRef20 = (Ref.ObjectRef) jVar.f3948t;
                objectRef21 = (Ref.ObjectRef) jVar.f3945n;
                ResultKt.throwOnFailure(objT);
                nVar6 = (x0X.n) objT;
                if (!(nVar6 instanceof n.C1266n)) {
                    throw ((zD.j) ((n.C1266n) nVar6).n()).nr();
                }
                if (!(nVar6 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                ?? value = ((Id.Predefined.Internal) ((n.w6) nVar6).n()).getValue();
                objectRef17.element = value;
                return new SpD.j((String) objectRef21.element, (String) objectRef20.element, (String) objectRef19.element, (String) objectRef18.element, value);
            }
            objectRef4 = (Ref.ObjectRef) jVar.f3946o;
            objectRef13 = (Ref.ObjectRef) jVar.f3947r;
            objectRef14 = (Ref.ObjectRef) jVar.J2;
            objectRef15 = (Ref.ObjectRef) jVar.f3941O;
            objectRef16 = (Ref.ObjectRef) jVar.f3948t;
            nVar3 = (n) jVar.f3945n;
            ResultKt.throwOnFailure(objT);
            nVar5 = (x0X.n) objT;
            if (!(nVar5 instanceof n.C1266n)) {
                throw ((zD.j) ((n.C1266n) nVar5).n()).nr();
            }
            if (!(nVar5 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            objectRef13.element = ((Id.Predefined.Internal) ((n.w6) nVar5).n()).getValue();
            InterfaceC1335n interfaceC1335n4 = nVar3.rl;
            Id.Predefined.Internal.j jVar5 = Id.Predefined.Internal.j.J2;
            jVar.f3945n = objectRef16;
            jVar.f3948t = objectRef15;
            jVar.f3941O = objectRef14;
            jVar.J2 = objectRef13;
            jVar.f3947r = objectRef4;
            jVar.f3946o = null;
            jVar.f3944g = 5;
            objT = interfaceC1335n4.O(jVar5, jVar);
            if (objT != coroutine_suspended) {
                objectRef17 = objectRef4;
                objectRef18 = objectRef13;
                objectRef19 = objectRef14;
                objectRef20 = objectRef15;
                objectRef21 = objectRef16;
                nVar6 = (x0X.n) objT;
                if (!(nVar6 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
        objectRef4 = (Ref.ObjectRef) jVar.f3946o;
        objectRef3 = (Ref.ObjectRef) jVar.f3947r;
        objectRef2 = (Ref.ObjectRef) jVar.J2;
        objectRef = (Ref.ObjectRef) jVar.f3941O;
        Ref.ObjectRef objectRef26 = (Ref.ObjectRef) jVar.f3948t;
        n nVar8 = (n) jVar.f3945n;
        ResultKt.throwOnFailure(objT);
        objectRef5 = objectRef26;
        nVar = nVar8;
        x0X.n nVar9 = (x0X.n) objT;
        if (nVar9 instanceof n.C1266n) {
        } else {
            if (!(nVar9 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Id.Predefined.External external2 = (Id.Predefined.External) ((n.w6) nVar9).n();
            if (external2 != null) {
                objectRef.element = external2.getValue();
            }
        }
        InterfaceC1335n interfaceC1335n5 = nVar.rl;
        Id.Predefined.External.j jVar6 = Id.Predefined.External.j.J2;
        jVar.f3945n = nVar;
        jVar.f3948t = objectRef5;
        jVar.f3941O = objectRef;
        jVar.J2 = objectRef2;
        jVar.f3947r = objectRef3;
        jVar.f3946o = objectRef4;
        jVar.f3944g = 2;
        objT = interfaceC1335n5.t(jVar6, jVar);
        if (objT != coroutine_suspended) {
            objectRef6 = objectRef3;
            objectRef7 = objectRef2;
            objectRef8 = objectRef;
            objectRef9 = objectRef5;
            nVar2 = (x0X.n) objT;
            if (!(nVar2 instanceof n.C1266n)) {
            }
            InterfaceC1335n interfaceC1335n22 = nVar.rl;
            Id.Predefined.Internal.j jVar32 = Id.Predefined.Internal.j.f51220t;
            jVar.f3945n = nVar;
            jVar.f3948t = objectRef9;
            jVar.f3941O = objectRef8;
            jVar.J2 = objectRef7;
            jVar.f3947r = objectRef6;
            jVar.f3946o = objectRef4;
            jVar.f3944g = 3;
            objT = interfaceC1335n22.O(jVar32, jVar);
            if (objT != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
