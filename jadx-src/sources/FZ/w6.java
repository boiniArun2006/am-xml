package FZ;

import Dk.InterfaceC1335n;
import FZ.n;
import ajd.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bendingspoons.concierge.domain.entities.Id;
import com.caoccao.javet.interop.loader.JavetLibLoadingListener;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.utils.Logger;
import com.squareup.moshi.Moshi;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements FZ.n {
    public static final j mUb = new j(null);
    private final Function1 J2;
    private final YgZ.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f2734O;
    private final Moshi Uo;
    private final InterfaceC1335n nr;
    private final n.InterfaceC0093n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f2735t;
    private final rB.Ml xMQ;

    static final class I28 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2736O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f2737S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2739n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f2740o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2741r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2742t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2740o = obj;
            this.f2737S |= Integer.MIN_VALUE;
            return w6.this.n(null, null, null, null, null, null, this);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2743O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Map f2744S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ String f2745Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f2746g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2747n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2749r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2750t;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, Map map, Context context, Continuation continuation) {
            super(1, continuation);
            this.f2745Z = str;
            this.f2744S = map;
            this.f2746g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return w6.this.new Ml(this.f2745Z, this.f2744S, this.f2746g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[LOOP:0: B:45:0x0126->B:47:0x012c, LOOP_END] */
        /* JADX WARN: Type inference failed for: r2v14, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objO;
            String value;
            Object objO2;
            Ref.ObjectRef objectRef;
            String str;
            Object objJ2;
            String str2;
            Ref.ObjectRef objectRef2;
            Object objInvoke;
            Ref.ObjectRef objectRef3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2749r;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC1335n interfaceC1335n = w6.this.nr;
                Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51217O;
                this.f2749r = 1;
                objO = interfaceC1335n.O(jVar, this);
                if (objO != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    value = (String) this.f2747n;
                    ResultKt.throwOnFailure(obj);
                    objO2 = obj;
                    Id.Predefined.Internal internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objO2);
                    String value2 = internal == null ? internal.getValue() : null;
                    objectRef = new Ref.ObjectRef();
                    String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(this.f2745Z, "%BACKUP_PERSISTENT_ID%", value != null ? "" : value, false, 4, (Object) null), "%NON_BACKUP_PERSISTENT_ID%", value2 != null ? "" : value2, false, 4, (Object) null);
                    w6 w6Var = w6.this;
                    Map map = this.f2744S;
                    this.f2747n = objectRef;
                    this.f2750t = objectRef;
                    this.f2743O = strReplace$default;
                    str = "%TF_DESCRIPTION%";
                    this.J2 = "%TF_DESCRIPTION%";
                    this.f2749r = 3;
                    objJ2 = w6Var.J2(map, this);
                    if (objJ2 != coroutine_suspended) {
                        str2 = strReplace$default;
                        objectRef2 = objectRef;
                        objectRef2.element = StringsKt.replace$default(str2, str, "---AA---" + objJ2 + "---EE---", false, 4, (Object) null);
                        Function1 function1T = w6.this.rl.t();
                        this.f2747n = objectRef;
                        this.f2750t = null;
                        this.f2743O = null;
                        this.J2 = null;
                        this.f2749r = 4;
                        objInvoke = function1T.invoke(this);
                        if (objInvoke != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) this.f2747n;
                    ResultKt.throwOnFailure(obj);
                    objInvoke = obj;
                    for (Map.Entry entry : ((Map) objInvoke).entrySet()) {
                        objectRef3.element = StringsKt.replace$default((String) objectRef3.element, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) objectRef3.element));
                    intent.setFlags(268435456);
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f2746g, intent);
                    return Unit.INSTANCE;
                }
                String str3 = (String) this.J2;
                String str4 = (String) this.f2743O;
                objectRef2 = (Ref.ObjectRef) this.f2750t;
                objectRef = (Ref.ObjectRef) this.f2747n;
                ResultKt.throwOnFailure(obj);
                str = str3;
                str2 = str4;
                objJ2 = obj;
                objectRef2.element = StringsKt.replace$default(str2, str, "---AA---" + objJ2 + "---EE---", false, 4, (Object) null);
                Function1 function1T2 = w6.this.rl.t();
                this.f2747n = objectRef;
                this.f2750t = null;
                this.f2743O = null;
                this.J2 = null;
                this.f2749r = 4;
                objInvoke = function1T2.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    objectRef3 = objectRef;
                    while (r2.hasNext()) {
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse((String) objectRef3.element));
                    intent2.setFlags(268435456);
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f2746g, intent2);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            objO = obj;
            Id.Predefined.Internal internal2 = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objO);
            value = internal2 != null ? internal2.getValue() : null;
            InterfaceC1335n interfaceC1335n2 = w6.this.nr;
            Id.Predefined.Internal.j jVar2 = Id.Predefined.Internal.j.J2;
            this.f2747n = value;
            this.f2749r = 2;
            objO2 = interfaceC1335n2.O(jVar2, this);
            if (objO2 != coroutine_suspended) {
                Id.Predefined.Internal internal3 = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objO2);
                if (internal3 == null) {
                }
                objectRef = new Ref.ObjectRef();
                String strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(this.f2745Z, "%BACKUP_PERSISTENT_ID%", value != null ? "" : value, false, 4, (Object) null), "%NON_BACKUP_PERSISTENT_ID%", value2 != null ? "" : value2, false, 4, (Object) null);
                w6 w6Var2 = w6.this;
                Map map2 = this.f2744S;
                this.f2747n = objectRef;
                this.f2750t = objectRef;
                this.f2743O = strReplace$default2;
                str = "%TF_DESCRIPTION%";
                this.J2 = "%TF_DESCRIPTION%";
                this.f2749r = 3;
                objJ2 = w6Var2.J2(map2, this);
                if (objJ2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2751O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        long f2752S;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        int f2753X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f2754Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2756g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f2758o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2759r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2760t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.E2 = obj;
            this.f2753X |= Integer.MIN_VALUE;
            return w6.this.J2(null, this);
        }
    }

    /* JADX INFO: renamed from: FZ.w6$w6, reason: collision with other inner class name */
    static final class C0095w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2762n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2763t;

        C0095w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2763t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.rl(null, null, null, this);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public w6(n.InterfaceC0093n config, Context context, InterfaceC1335n concierge, Function1 userInfoProvider, Function1 encryptionSettingsProvider, Moshi moshi, YgZ.j deviceInfoProvider, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
        Intrinsics.checkNotNullParameter(encryptionSettingsProvider, "encryptionSettingsProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.rl = config;
        this.f2735t = context;
        this.nr = concierge;
        this.f2734O = userInfoProvider;
        this.J2 = encryptionSettingsProvider;
        this.Uo = moshi;
        this.KN = deviceInfoProvider;
        this.xMQ = d3.j.nr(spiderSense, "customerSupport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x00e2, blocks: (B:53:0x023d, B:54:0x024e, B:56:0x0254, B:57:0x026f, B:49:0x0173, B:32:0x00d3, B:41:0x013f, B:43:0x0149, B:45:0x014f), top: B:72:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0254 A[Catch: all -> 0x00e2, LOOP:0: B:54:0x024e->B:56:0x0254, LOOP_END, TryCatch #1 {all -> 0x00e2, blocks: (B:53:0x023d, B:54:0x024e, B:56:0x0254, B:57:0x026f, B:49:0x0173, B:32:0x00d3, B:41:0x013f, B:43:0x0149, B:45:0x014f), top: B:72:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(Map map, Continuation continuation) {
        n nVar;
        int i2;
        w6 w6Var;
        int iXMQ;
        String str;
        String str2;
        String str3;
        Map map2;
        w6 w6Var2;
        String str4;
        long j2;
        String str5;
        String str6;
        String str7;
        Object objN;
        Map map3;
        Pair[] pairArr;
        Map map4;
        Map map5;
        Pair[] pairArr2;
        int i3;
        Iterator it;
        Map mapMapOf;
        byte[] bArr;
        Object objInvoke;
        byte[] bArr2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i5 = nVar.f2753X;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.f2753X = i5 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objInvoke2 = nVar.E2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = nVar.f2753X;
        if (i7 == 0) {
            i2 = 0;
            ResultKt.throwOnFailure(objInvoke2);
            try {
                String strRl = this.rl.rl();
                YgZ.w6 w6Var3 = YgZ.w6.f12217n;
                String strT = w6Var3.t(this.f2735t);
                long jRl = w6Var3.rl(this.f2735t);
                iXMQ = w6Var3.xMQ();
                String country = Locale.getDefault().getCountry();
                String language = Locale.getDefault().getLanguage();
                InterfaceC1335n interfaceC1335n = this.nr;
                Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.J2;
                nVar.f2757n = this;
                nVar.f2760t = map;
                nVar.f2751O = strRl;
                nVar.J2 = strT;
                nVar.f2759r = country;
                nVar.f2758o = language;
                nVar.f2752S = jRl;
                nVar.f2756g = iXMQ;
                nVar.f2753X = 1;
                Object objO = interfaceC1335n.O(jVar, nVar);
                if (objO != coroutine_suspended) {
                    str = strT;
                    str2 = country;
                    str3 = language;
                    map2 = map;
                    w6Var2 = this;
                    str4 = strRl;
                    objInvoke2 = objO;
                    j2 = jRl;
                    Id.Predefined.Internal internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objInvoke2);
                    if (internal == null) {
                    }
                    Function1 function1 = w6Var2.f2734O;
                    nVar.f2757n = w6Var2;
                    nVar.f2760t = map2;
                    nVar.f2751O = str4;
                    nVar.J2 = str;
                    nVar.f2759r = str2;
                    nVar.f2758o = str3;
                    nVar.f2754Z = value;
                    nVar.f2752S = j2;
                    nVar.f2756g = iXMQ;
                    String str8 = value;
                    nVar.f2753X = 2;
                    objInvoke2 = function1.invoke(nVar);
                    if (objInvoke2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                w6Var = this;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    i2 = 0;
                    iXMQ = nVar.f2756g;
                    long j3 = nVar.f2752S;
                    str6 = (String) nVar.f2754Z;
                    str3 = (String) nVar.f2758o;
                    String str9 = (String) nVar.f2759r;
                    str = (String) nVar.J2;
                    str4 = (String) nVar.f2751O;
                    Map map6 = (Map) nVar.f2760t;
                    w6 w6Var4 = (w6) nVar.f2757n;
                    try {
                        ResultKt.throwOnFailure(objInvoke2);
                        map2 = map6;
                        str5 = str9;
                        w6Var2 = w6Var4;
                        j2 = j3;
                        Wf.w6 w6Var5 = (Wf.w6) objInvoke2;
                        Pair[] pairArr3 = new Pair[3];
                        pairArr3[i2] = TuplesKt.to(PangleCreativeInfo.f62498a, MapsKt.mapOf(TuplesKt.to("bsp_id", str4), TuplesKt.to("app_version", str), TuplesKt.to("bundle_version", String.valueOf(j2)), TuplesKt.to(AppLovinBridge.f61288f, AppLovinBridge.f61290h), TuplesKt.to("android_version", String.valueOf(iXMQ)), TuplesKt.to("device", w6Var2.Uo())));
                        str7 = "user";
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("country", str5), TuplesKt.to("language", str3), TuplesKt.to("backend_id", str6), TuplesKt.to("has_active_subscriptions", Boxing.boxBoolean(!w6Var5.nr().isEmpty())), TuplesKt.to("active_subscription_ids", w6Var5.nr()), TuplesKt.to("active_bundle_subscription_ids", w6Var5.n()), TuplesKt.to("active_non_consumable_product_ids", w6Var5.t()), TuplesKt.to("active_consumable_product_ids", w6Var5.rl()));
                        InterfaceC1335n interfaceC1335n2 = w6Var2.nr;
                        nVar.f2757n = w6Var2;
                        nVar.f2760t = map2;
                        nVar.f2751O = pairArr3;
                        nVar.J2 = mapMutableMapOf;
                        nVar.f2759r = mapMutableMapOf;
                        nVar.f2758o = pairArr3;
                        nVar.f2754Z = "user";
                        nVar.f2756g = 1;
                        nVar.f2753X = 3;
                        objN = interfaceC1335n2.n(nVar);
                        if (objN != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map3 = mapMutableMapOf;
                        pairArr = pairArr3;
                        map4 = map2;
                        map5 = map3;
                        pairArr2 = pairArr;
                        objInvoke2 = objN;
                        i3 = 1;
                        Iterable iterable = (Iterable) objInvoke2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        while (it.hasNext()) {
                        }
                        MapsKt.putAll(map5, arrayList);
                        Unit unit = Unit.INSTANCE;
                        pairArr2[i3] = TuplesKt.to(str7, map3);
                        pairArr[2] = TuplesKt.to(JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM, map4);
                        mapMapOf = MapsKt.mapOf(pairArr);
                        bArr = new byte[16];
                        Random.Companion companion = Random.INSTANCE;
                        companion.nextBytes(bArr);
                        byte[] bArr3 = new byte[16];
                        companion.nextBytes(bArr3);
                        Function1 function12 = w6Var2.J2;
                        nVar.f2757n = w6Var2;
                        nVar.f2760t = mapMapOf;
                        nVar.f2751O = bArr;
                        nVar.J2 = bArr3;
                        nVar.f2759r = null;
                        nVar.f2758o = null;
                        nVar.f2754Z = null;
                        nVar.f2753X = 4;
                        objInvoke = function12.invoke(nVar);
                        if (objInvoke != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        w6Var = w6Var4;
                    }
                } else if (i7 == 3) {
                    i3 = nVar.f2756g;
                    str7 = (String) nVar.f2754Z;
                    pairArr2 = (Pair[]) nVar.f2758o;
                    Map map7 = (Map) nVar.f2759r;
                    map3 = (Map) nVar.J2;
                    i2 = 0;
                    pairArr = (Pair[]) nVar.f2751O;
                    map4 = (Map) nVar.f2760t;
                    w6 w6Var6 = (w6) nVar.f2757n;
                    try {
                        ResultKt.throwOnFailure(objInvoke2);
                        map5 = map7;
                        w6Var2 = w6Var6;
                        Iterable iterable2 = (Iterable) objInvoke2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        for (it = iterable2.iterator(); it.hasNext(); it = it) {
                            Id id = (Id) it.next();
                            arrayList2.add(new Pair(id.getName(), id.getValue()));
                        }
                        MapsKt.putAll(map5, arrayList2);
                        Unit unit2 = Unit.INSTANCE;
                        pairArr2[i3] = TuplesKt.to(str7, map3);
                        pairArr[2] = TuplesKt.to(JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM, map4);
                        mapMapOf = MapsKt.mapOf(pairArr);
                        bArr = new byte[16];
                        Random.Companion companion2 = Random.INSTANCE;
                        companion2.nextBytes(bArr);
                        byte[] bArr32 = new byte[16];
                        companion2.nextBytes(bArr32);
                        Function1 function122 = w6Var2.J2;
                        nVar.f2757n = w6Var2;
                        nVar.f2760t = mapMapOf;
                        nVar.f2751O = bArr;
                        nVar.J2 = bArr32;
                        nVar.f2759r = null;
                        nVar.f2758o = null;
                        nVar.f2754Z = null;
                        nVar.f2753X = 4;
                        objInvoke = function122.invoke(nVar);
                        if (objInvoke != coroutine_suspended) {
                            bArr2 = bArr32;
                            objInvoke2 = objInvoke;
                            w6Var = w6Var2;
                            Wf.n nVar2 = (Wf.n) objInvoke2;
                            String strRl2 = nVar2.rl();
                            String strN = nVar2.n();
                            pl2.n nVar3 = new pl2.n(null, 1, null);
                            String strTrimIndent = StringsKt.trimIndent(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strRl2, "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), "\n", "", false, 4, (Object) null));
                            Charset charsetForName = Charset.forName(C.UTF8_NAME);
                            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                            byte[] bytes = strTrimIndent.getBytes(charsetForName);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            byte[] bArrN = new pl2.n(null, 1, null).n(bArr, nVar3.rl(bytes));
                            pl2.j jVar2 = new pl2.j(null, 1, null);
                            String json = w6Var.Uo.adapter(Map.class).toJson(mapMapOf);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            String json2 = w6Var.Uo.adapter(Map.class).toJson(MapsKt.mapOf(TuplesKt.to("iv", CbW.j.J2(bArr2, i2, 1, null)), TuplesKt.to("payload", CbW.j.nr(jVar2.t(CbW.n.n(json), bArr, bArr2), 2)), TuplesKt.to("key_id", strN), TuplesKt.to("algorithm", "RSA2048PKCS1"), TuplesKt.to("session_key", CbW.j.J2(bArrN, 0, 1, null))));
                            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                            return CbW.j.O(json2, 0, 1, null);
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        w6Var = w6Var6;
                    }
                } else {
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr2 = (byte[]) nVar.J2;
                    bArr = (byte[]) nVar.f2751O;
                    mapMapOf = (Map) nVar.f2760t;
                    w6Var = (w6) nVar.f2757n;
                    try {
                        ResultKt.throwOnFailure(objInvoke2);
                        i2 = 0;
                        Wf.n nVar22 = (Wf.n) objInvoke2;
                        String strRl22 = nVar22.rl();
                        String strN2 = nVar22.n();
                        pl2.n nVar32 = new pl2.n(null, 1, null);
                        String strTrimIndent2 = StringsKt.trimIndent(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strRl22, "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), "\n", "", false, 4, (Object) null));
                        Charset charsetForName2 = Charset.forName(C.UTF8_NAME);
                        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
                        byte[] bytes2 = strTrimIndent2.getBytes(charsetForName2);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        byte[] bArrN2 = new pl2.n(null, 1, null).n(bArr, nVar32.rl(bytes2));
                        pl2.j jVar22 = new pl2.j(null, 1, null);
                        String json3 = w6Var.Uo.adapter(Map.class).toJson(mapMapOf);
                        Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
                        String json22 = w6Var.Uo.adapter(Map.class).toJson(MapsKt.mapOf(TuplesKt.to("iv", CbW.j.J2(bArr2, i2, 1, null)), TuplesKt.to("payload", CbW.j.nr(jVar22.t(CbW.n.n(json3), bArr, bArr2), 2)), TuplesKt.to("key_id", strN2), TuplesKt.to("algorithm", "RSA2048PKCS1"), TuplesKt.to("session_key", CbW.j.J2(bArrN2, 0, 1, null))));
                        Intrinsics.checkNotNullExpressionValue(json22, "toJson(...)");
                        return CbW.j.O(json22, 0, 1, null);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                rB.Ml ml = w6Var.xMQ;
                List listListOf = CollectionsKt.listOf(CreativeInfoManager.f61947b);
                j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
                pq.Ml ml2 = new pq.Ml();
                String message = th.getMessage();
                if (message != null) {
                    ml2.O("errorMessage", message);
                }
                Unit unit3 = Unit.INSTANCE;
                rB.I28.rl(ml, listListOf, enumC0481j, "Unable to encode data needed by customer support", null, ml2, 8, null);
                return null;
            }
            i2 = 0;
            iXMQ = nVar.f2756g;
            long j4 = nVar.f2752S;
            String str10 = (String) nVar.f2758o;
            String str11 = (String) nVar.f2759r;
            String str12 = (String) nVar.J2;
            String str13 = (String) nVar.f2751O;
            map2 = (Map) nVar.f2760t;
            w6Var2 = (w6) nVar.f2757n;
            try {
                ResultKt.throwOnFailure(objInvoke2);
                str = str12;
                str3 = str10;
                str2 = str11;
                str4 = str13;
                j2 = j4;
                Id.Predefined.Internal internal2 = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objInvoke2);
                String value = internal2 == null ? internal2.getValue() : null;
                Function1 function13 = w6Var2.f2734O;
                nVar.f2757n = w6Var2;
                nVar.f2760t = map2;
                nVar.f2751O = str4;
                nVar.J2 = str;
                nVar.f2759r = str2;
                nVar.f2758o = str3;
                nVar.f2754Z = value;
                nVar.f2752S = j2;
                nVar.f2756g = iXMQ;
                String str82 = value;
                nVar.f2753X = 2;
                objInvoke2 = function13.invoke(nVar);
                if (objInvoke2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str5 = str2;
                str6 = str82;
                Wf.w6 w6Var52 = (Wf.w6) objInvoke2;
                Pair[] pairArr32 = new Pair[3];
                pairArr32[i2] = TuplesKt.to(PangleCreativeInfo.f62498a, MapsKt.mapOf(TuplesKt.to("bsp_id", str4), TuplesKt.to("app_version", str), TuplesKt.to("bundle_version", String.valueOf(j2)), TuplesKt.to(AppLovinBridge.f61288f, AppLovinBridge.f61290h), TuplesKt.to("android_version", String.valueOf(iXMQ)), TuplesKt.to("device", w6Var2.Uo())));
                str7 = "user";
                Map mapMutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to("country", str5), TuplesKt.to("language", str3), TuplesKt.to("backend_id", str6), TuplesKt.to("has_active_subscriptions", Boxing.boxBoolean(!w6Var52.nr().isEmpty())), TuplesKt.to("active_subscription_ids", w6Var52.nr()), TuplesKt.to("active_bundle_subscription_ids", w6Var52.n()), TuplesKt.to("active_non_consumable_product_ids", w6Var52.t()), TuplesKt.to("active_consumable_product_ids", w6Var52.rl()));
                InterfaceC1335n interfaceC1335n22 = w6Var2.nr;
                nVar.f2757n = w6Var2;
                nVar.f2760t = map2;
                nVar.f2751O = pairArr32;
                nVar.J2 = mapMutableMapOf2;
                nVar.f2759r = mapMutableMapOf2;
                nVar.f2758o = pairArr32;
                nVar.f2754Z = "user";
                nVar.f2756g = 1;
                nVar.f2753X = 3;
                objN = interfaceC1335n22.n(nVar);
                if (objN != coroutine_suspended) {
                }
            } catch (Throwable th5) {
                th = th5;
                w6Var = w6Var2;
            }
        }
    }

    private final String Uo() {
        String strN = this.KN.n();
        String strRl = this.KN.rl();
        if (StringsKt.startsWith(strRl, strN, true)) {
            return strRl;
        }
        return strN + " " + strRl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // FZ.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, List list, List list2, String str, String str2, Map map, Continuation continuation) {
        I28 i28;
        String str3;
        Context context2;
        Intent intent;
        Intent intent2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f2737S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f2737S = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object obj = i28.f2740o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f2737S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Intent intent3 = new Intent("android.intent.action.SENDTO");
            intent3.setData(Uri.parse("mailto:"));
            intent3.putExtra("android.intent.extra.EMAIL", (String[]) list.toArray(new String[0]));
            intent3.putExtra("android.intent.extra.CC", (String[]) list2.toArray(new String[0]));
            intent3.putExtra("android.intent.extra.SUBJECT", str2);
            i28.f2739n = context;
            i28.f2742t = intent3;
            i28.f2736O = str;
            str3 = "android.intent.extra.TEXT";
            i28.J2 = "android.intent.extra.TEXT";
            i28.f2741r = intent3;
            i28.f2737S = 1;
            Object objJ2 = J2(map, i28);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            context2 = context;
            intent = intent3;
            obj = objJ2;
            intent2 = intent;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent = (Intent) i28.f2741r;
            str3 = (String) i28.J2;
            str = (String) i28.f2736O;
            intent2 = (Intent) i28.f2742t;
            context2 = (Context) i28.f2739n;
            ResultKt.throwOnFailure(obj);
        }
        String str4 = (String) obj;
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra(str3, str + "\n\n---AA---\n" + str4 + "\n---EE---");
        Intent intentCreateChooser = Intent.createChooser(intent2, null);
        intentCreateChooser.setFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intentCreateChooser);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // FZ.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Context context, String str, Map map, Continuation continuation) {
        C0095w6 c0095w6;
        w6 w6Var;
        if (continuation instanceof C0095w6) {
            c0095w6 = (C0095w6) continuation;
            int i2 = c0095w6.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0095w6.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0095w6 = new C0095w6(continuation);
            }
        }
        C0095w6 c0095w62 = c0095w6;
        Object objUo = c0095w62.f2763t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0095w62.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml ml = new Ml(str, map, context, null);
            c0095w62.f2762n = this;
            c0095w62.J2 = 1;
            objUo = x0X.w6.Uo(ml, c0095w62);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            w6Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var = (w6) c0095w62.f2762n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar).n();
            rB.Ml ml2 = w6Var.xMQ;
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"openPageInBrowser", "failed"});
            j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
            pq.Ml ml3 = new pq.Ml();
            String message = th.getMessage();
            if (message != null) {
                ml3.O(MRAIDPresenter.ERROR, message);
            }
            Unit unit = Unit.INSTANCE;
            rB.I28.rl(ml2, listListOf, enumC0481j, "Unable to open the browser", null, ml3, 8, null);
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
