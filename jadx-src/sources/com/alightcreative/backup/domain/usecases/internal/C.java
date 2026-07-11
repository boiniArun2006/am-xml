package com.alightcreative.backup.domain.usecases.internal;

import GJW.Lu;
import GJW.vd;
import QmE.iF;
import QmE.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C implements wtO.w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f46447t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wtO.Dsr f46448n;
    private final iF rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function1 {
        final /* synthetic */ C J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f46449O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46450n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f46451t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ com.google.firebase.storage.o J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Iterable f46452O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46453n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f46454t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Iterable iterable, Continuation continuation, com.google.firebase.storage.o oVar) {
                super(2, continuation);
                this.f46452O = iterable;
                this.J2 = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f46452O, continuation, this.J2);
                jVar.f46454t = obj;
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.alightcreative.backup.domain.usecases.internal.C$n$j$j, reason: collision with other inner class name */
            public static final class C0652j extends SuspendLambda implements Function2 {
                final /* synthetic */ com.google.firebase.storage.o J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f46455O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f46456n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f46457t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0652j(Object obj, Continuation continuation, com.google.firebase.storage.o oVar) {
                    super(2, continuation);
                    this.f46455O = obj;
                    this.J2 = oVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C0652j c0652j = new C0652j(this.f46455O, continuation, this.J2);
                    c0652j.f46457t = obj;
                    return c0652j;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0652j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    String str;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f46456n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            str = (String) this.f46457t;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        String str2 = (String) this.f46455O;
                        com.google.firebase.storage.o oVarRl = this.J2.rl(str2);
                        Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
                        this.f46457t = str2;
                        this.f46456n = 1;
                        Object objHI = wQ.eO.HI(oVarRl, this);
                        if (objHI == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                        obj = objHI;
                    }
                    return TuplesKt.to(str, obj);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46453n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f46454t;
                Iterable iterable = this.f46452O;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(GJW.C.rl(vdVar, null, null, new C0652j(it.next(), null, this.J2), 3, null));
                }
                this.f46453n = 1;
                Object objN = GJW.Wre.n(arrayList, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objN;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, String str2, C c2, Continuation continuation) {
            super(1, continuation);
            this.f46451t = str;
            this.f46449O = str2;
            this.J2 = c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f46451t, this.f46449O, this.J2, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46450n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                com.google.firebase.storage.o oVarRl = com.google.firebase.storage.I28.J2().ty().rl("cloud");
                Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
                j jVar = new j(CollectionsKt.listOf((Object[]) new String[]{"thumb-med.jpg", "meta.json", "projectfiles.zip"}), null, wQ.eO.Ik(oVarRl, this.f46451t, this.f46449O));
                this.f46450n = 1;
                obj = Lu.J2(jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = MapsKt.toMap((Iterable) obj);
            this.J2.f46448n.nr(this.f46449O);
            boolean zBooleanValue = ((Boolean) MapsKt.getValue(map, "projectfiles.zip")).booleanValue();
            if (zBooleanValue) {
                this.J2.rl.n(j.eO.f8496n);
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    public C(wtO.Dsr linkLocalAndCloudProjectUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(linkLocalAndCloudProjectUseCase, "linkLocalAndCloudProjectUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f46448n = linkLocalAndCloudProjectUseCase;
        this.rl = eventLogger;
    }

    @Override // wtO.w6
    public Object n(String str, String str2, Continuation continuation) {
        return x0X.w6.Uo(new n(str, str2, this, null), continuation);
    }
}
