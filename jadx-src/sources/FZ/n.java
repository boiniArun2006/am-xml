package FZ;

import Dk.InterfaceC1335n;
import FZ.n;
import TFv.Wre;
import TFv.fuX;
import android.content.Context;
import bH.CN3;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Settings;
import com.bendingspoons.oracle.models.User;
import fb.AbstractC2109j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f2724n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        static final class Ml extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f2725n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f2726t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Ml(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f2726t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new Ml(this.f2726t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f2725n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Wre wreT = qu.Wre.t(this.f2726t);
                    this.f2725n = 1;
                    obj = fuX.ViF(wreT, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((OracleResponse) obj).getSettings().getPrivacyRequestUrlTemplate();
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: FZ.n$j$j, reason: collision with other inner class name */
        static final class C0091j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f2727n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f2728t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0091j(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f2728t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0091j(this.f2728t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f2727n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Wre wreT = qu.Wre.t(this.f2728t);
                    this.f2727n = 1;
                    obj = fuX.ViF(wreT, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                User me = ((OracleResponse) obj).getMe();
                List<User.ActiveSubscription> activeSubscriptions = me.getActiveSubscriptions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(activeSubscriptions, 10));
                Iterator<T> it = activeSubscriptions.iterator();
                while (it.hasNext()) {
                    arrayList.add(((User.ActiveSubscription) it.next()).getId());
                }
                List<String> nonConsumablesIds = me.getNonConsumablesIds();
                List<User.BundleSubscription> activeBundleSubscriptions = me.getActiveBundleSubscriptions();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(activeBundleSubscriptions, 10));
                Iterator<T> it2 = activeBundleSubscriptions.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((User.BundleSubscription) it2.next()).getProductId());
                }
                return new Wf.w6(arrayList, nonConsumablesIds, arrayList2, CollectionsKt.toList(me.getAvailableConsumableCredits().keySet()));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0091j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: FZ.n$j$n, reason: collision with other inner class name */
        static final class C0092n extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f2729n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f2730t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0092n(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f2730t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0092n(this.f2730t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f2729n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Wre wreT = qu.Wre.t(this.f2730t);
                    this.f2729n = 1;
                    obj = fuX.ViF(wreT, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Settings settings = ((OracleResponse) obj).getSettings();
                return new Wf.n(settings.getEncryptionPublicKey(), settings.getEncryptionKeyId());
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0092n) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class w6 extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f2731n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f2732t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f2732t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new w6(this.f2732t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f2731n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Wre wreT = qu.Wre.t(this.f2732t);
                    this.f2731n = 1;
                    obj = fuX.ViF(wreT, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Settings settings = ((OracleResponse) obj).getSettings();
                return new Wf.j(settings.getPrivacyRequestEmail(), CollectionsKt.listOf(settings.getPrivacyRequestEmailCC()));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n O(InterfaceC0093n interfaceC0093n, Context context, InterfaceC1335n interfaceC1335n, Function1 function1, Function1 function12, rB.Ml ml, CN3 cn3, Function1 function13, Function1 function14) {
            FZ.w6 w6Var = new FZ.w6(interfaceC0093n, context, interfaceC1335n, function1, function12, et.w6.rl(), new YgZ.n(), ml);
            if (cn3 != null) {
                uCY.j.n(cn3, context, w6Var, function13, function14);
            }
            return w6Var;
        }

        public final n nr(InterfaceC0093n config, Context context, InterfaceC1335n concierge, I28 oracleResponseStore, rB.Ml spiderSense, CN3 cn3) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return t(config, context, concierge, new C0091j(oracleResponseStore, null), new C0092n(oracleResponseStore, null), new w6(oracleResponseStore, null), new Ml(oracleResponseStore, null), spiderSense, cn3);
        }

        public final n t(final InterfaceC0093n config, final Context context, final InterfaceC1335n concierge, final Function1 userInfoProvider, final Function1 encryptionSettingsProvider, final Function1 emailTargetsProvider, final Function1 privacyRequestUrlTemplateProvider, final rB.Ml spiderSense, final CN3 cn3) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
            Intrinsics.checkNotNullParameter(encryptionSettingsProvider, "encryptionSettingsProvider");
            Intrinsics.checkNotNullParameter(emailTargetsProvider, "emailTargetsProvider");
            Intrinsics.checkNotNullParameter(privacyRequestUrlTemplateProvider, "privacyRequestUrlTemplateProvider");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return (n) n(new Function0() { // from class: FZ.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.O(config, context, concierge, userInfoProvider, encryptionSettingsProvider, spiderSense, cn3, emailTargetsProvider, privacyRequestUrlTemplateProvider);
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: FZ.n$n, reason: collision with other inner class name */
    public interface InterfaceC0093n {

        /* JADX INFO: renamed from: FZ.n$n$j */
        public static final class j {

            /* JADX INFO: renamed from: FZ.n$n$j$j, reason: collision with other inner class name */
            static final class C0094j extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f2733n;

                C0094j(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C0094j(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f2733n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return MapsKt.emptyMap();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((C0094j) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            public static Function1 n(InterfaceC0093n interfaceC0093n) {
                return new C0094j(null);
            }
        }

        String rl();

        Function1 t();
    }

    public static final class w6 {
        public static /* synthetic */ Object n(n nVar, Context context, String str, Map map, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPageInBrowserAsync");
            }
            if ((i2 & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return nVar.rl(context, str, map, continuation);
        }

        public static /* synthetic */ Object rl(n nVar, Context context, List list, List list2, String str, String str2, Map map, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSupportEmailAsync");
            }
            if ((i2 & 4) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            List list3 = list2;
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i2 & 32) != 0) {
                map = MapsKt.emptyMap();
            }
            return nVar.n(context, list, list3, str, str3, map, continuation);
        }
    }

    Object n(Context context, List list, List list2, String str, String str2, Map map, Continuation continuation);

    Object rl(Context context, String str, Map map, Continuation continuation);
}
