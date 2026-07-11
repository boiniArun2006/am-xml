package com.alightcreative.account;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.account.IAPBackend;
import com.alightcreative.account.IAPMiddleware;
import com.alightcreative.account.qz;
import com.safedk.android.analytics.AppLovinBridge;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kgE.K;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class IAPMiddleware {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f44111O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IAPBackend f44112n;
    private long nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44113t;

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f44114O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44115n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44116r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44117t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44114O = obj;
            this.f44116r |= Integer.MIN_VALUE;
            return IAPMiddleware.this.aYN(null, null, this);
        }
    }

    static final class I28 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44119n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44120t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44120t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return IAPMiddleware.this.gh(0, false, null, this);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/account/IAPMiddleware$IAPMiddlewareException;", "Lcom/alightcreative/account/IAPException;", "message", "", "<init>", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class IAPMiddlewareException extends IAPException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAPMiddlewareException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/account/IAPMiddleware$IAPVerifyPurchaseError;", "Lcom/alightcreative/account/IAPMiddleware$IAPMiddlewareException;", "message", "", "<init>", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IAPVerifyPurchaseError extends IAPMiddlewareException {
        /* JADX WARN: Multi-variable type inference failed */
        public IAPVerifyPurchaseError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAPVerifyPurchaseError(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public /* synthetic */ IAPVerifyPurchaseError(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Could not verify purchase" : str);
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44122n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44123t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44123t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return IAPMiddleware.this.xMQ(null, this);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f44124O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44125n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44126r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44127t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44124O = obj;
            this.f44126r |= Integer.MIN_VALUE;
            return IAPMiddleware.this.ck(0L, null, this);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f44128n;
        private final Long rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f44128n, jVar.f44128n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            int iHashCode = this.f44128n.hashCode() * 31;
            Long l2 = this.rl;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        public String toString() {
            return "AccountStatusAndLicenses(licenses=" + this.f44128n + ", accountCreatedMillis=" + this.rl + ")";
        }

        public j(List licenses, Long l2) {
            Intrinsics.checkNotNullParameter(licenses, "licenses");
            this.f44128n = licenses;
            this.rl = l2;
        }

        public final List n() {
            return this.f44128n;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44130S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ n[] f44131Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f44132n = new n("SUCCESS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f44135t = new n("ERROR", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f44129O = new n("TRANSIENT_ERROR", 2);
        public static final n J2 = new n("UNKNOWN", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f44134r = new n("THROTTLED", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f44133o = new n("NOT_SIGNED_IN", 5);

        private static final /* synthetic */ n[] n() {
            return new n[]{f44132n, f44135t, f44129O, J2, f44134r, f44133o};
        }

        static {
            n[] nVarArrN = n();
            f44131Z = nVarArrN;
            f44130S = EnumEntriesKt.enumEntries(nVarArrN);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f44131Z.clone();
        }

        private n(String str, int i2) {
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IAPItemType.values().length];
            try {
                iArr[IAPItemType.Subscription.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAPItemType.Consumable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAPItemType.Item.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAPItemType.Pass.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IAPMiddleware(IAPBackend iapBackend) {
        Intrinsics.checkNotNullParameter(iapBackend, "iapBackend");
        this.f44112n = iapBackend;
        this.f44113t = true;
        this.nr = Math.max(com.alightcreative.app.motion.persist.j.INSTANCE.getLatestServerTimeMillis(), System.currentTimeMillis());
        this.f44111O = new LinkedHashMap();
    }

    public static /* synthetic */ Object Ik(IAPMiddleware iAPMiddleware, long j2, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = iAPMiddleware.f44113t ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : "normal";
        }
        return iAPMiddleware.ck(j2, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN() {
        return "IAP:userSessionBegan: !!CLEAR CACHE!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(long j2, IAPMiddleware iAPMiddleware) {
        return "IAP:userSessionBegan: expectedAccountVersion=" + j2 + " uid=" + iAPMiddleware.rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(IAPBackend.UserSessionBeginResponse userSessionBeginResponse) {
        return "IAP:userSessionBegan: response=" + userSessionBeginResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z() {
        return "IAP:userSessionBegan: calling backend";
    }

    public static /* synthetic */ Object mUb(IAPMiddleware iAPMiddleware, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iAPMiddleware.f44113t ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : "normal";
        }
        return iAPMiddleware.xMQ(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o() {
        return "IAP:userSessionBegan: throttled";
    }

    public static /* synthetic */ Object qie(IAPMiddleware iAPMiddleware, int i2, boolean z2, String str, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        if ((i3 & 2) != 0) {
            z2 = iAPMiddleware.f44113t && com.alightcreative.app.motion.persist.j.INSTANCE.getIaptest();
        }
        if ((i3 & 4) != 0) {
            str = iAPMiddleware.f44113t ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : "normal";
        }
        return iAPMiddleware.gh(i2, z2, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "IAP:userSessionBegan: existing resposne for this UID";
    }

    public final void HI(String str) {
        this.rl = str;
    }

    public final void Uo() {
        XoT.C.Uo(this, new Function0() { // from class: kgE.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IAPMiddleware.KN();
            }
        });
        this.f44111O.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object aYN(YV.o oVar, SKUInfo sKUInfo, Continuation continuation) throws IAPVerifyPurchaseError {
        CN3 cn3;
        String str;
        IAPMiddleware iAPMiddleware;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f44116r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f44116r = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objInvoke = cn3.f44114O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f44116r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<IAPBackend.VerifyPurchaseRequest, Continuation<? super IAPBackend.VerifyPurchaseResponse>, Object> verifyPurchase = this.f44112n.getVerifyPurchase();
            String sku = sKUInfo.getSku();
            String strJ2 = oVar.J2();
            String strN = oVar.n();
            if (strN == null) {
                strN = "";
            }
            int i5 = w6.$EnumSwitchMapping$0[sKUInfo.getType().ordinal()];
            if (i5 == 1) {
                str = "subs";
            } else {
                if (i5 != 2 && i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "inapp";
            }
            IAPBackend.VerifyPurchaseRequest verifyPurchaseRequest = new IAPBackend.VerifyPurchaseRequest(sku, strJ2, str, strN);
            cn3.f44115n = this;
            cn3.f44117t = sKUInfo;
            cn3.f44116r = 1;
            objInvoke = verifyPurchase.invoke(verifyPurchaseRequest, cn3);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            iAPMiddleware = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sKUInfo = (SKUInfo) cn3.f44117t;
            iAPMiddleware = (IAPMiddleware) cn3.f44115n;
            ResultKt.throwOnFailure(objInvoke);
        }
        IAPBackend.VerifyPurchaseResponse verifyPurchaseResponse = (IAPBackend.VerifyPurchaseResponse) objInvoke;
        if (Intrinsics.areEqual(verifyPurchaseResponse.getStatus(), "success")) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.getVerifiedPurchaseExpirationTime().put(sKUInfo.getSku(), Boxing.boxLong(verifyPurchaseResponse.getExpiryTimeMillis()));
            Map<String, String> verifiedPurchaseUid = jVar.getVerifiedPurchaseUid();
            String sku2 = sKUInfo.getSku();
            String str2 = iAPMiddleware.rl;
            verifiedPurchaseUid.put(sku2, str2 != null ? str2 : "");
            return new qz.n(verifyPurchaseResponse.getExpiryTimeMillis());
        }
        if (Intrinsics.areEqual(verifyPurchaseResponse.getStatus(), "invalid-token")) {
            return qz.j.f44301n;
        }
        throw new IAPVerifyPurchaseError("Unrecognized Response: " + verifyPurchaseResponse.getStatus());
    }

    public final long az() {
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ck(final long j2, String str, Continuation continuation) throws PackageManager.NameNotFoundException {
        Wre wre;
        String str2;
        IAPMiddleware iAPMiddleware;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f44126r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f44126r = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object obj = wre.f44124O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f44126r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            XoT.C.Uo(this, new Function0() { // from class: kgE.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IAPMiddleware.S(j2, this);
                }
            });
            String str3 = this.rl;
            if (str3 == null) {
                return n.f44133o;
            }
            IAPBackend.UserSessionBeginResponse userSessionBeginResponse = (IAPBackend.UserSessionBeginResponse) this.f44111O.get(str3);
            if (userSessionBeginResponse != null && !Intrinsics.areEqual(userSessionBeginResponse.getResult(), "transient-error")) {
                XoT.C.Uo(this, new Function0() { // from class: kgE.rv6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IAPMiddleware.r();
                    }
                });
                return WPU(userSessionBeginResponse);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.J2;
            int i5 = this.Uo;
            if (jCurrentTimeMillis < i5 * i5 * 1000) {
                XoT.C.Uo(this, new Function0() { // from class: kgE.vd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IAPMiddleware.o();
                    }
                });
                return n.f44134r;
            }
            PackageInfo packageInfo = IvA.n.rl().getApplicationContext().getPackageManager().getPackageInfo(IvA.n.rl().getPackageName(), 64);
            XoT.C.Uo(this, new Function0() { // from class: kgE.Lu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IAPMiddleware.Z();
                }
            });
            Function2<IAPBackend.UserSessionBeginRequest, Continuation<? super IAPBackend.UserSessionBeginResponse>, Object> userSessionBegan = this.f44112n.getUserSessionBegan();
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            String str4 = packageInfo.versionName;
            if (str4 == null) {
                str4 = "unknown";
            }
            IAPBackend.UserSessionBeginRequest userSessionBeginRequest = new IAPBackend.UserSessionBeginRequest(j2, str, AppLovinBridge.f61290h, longVersionCode, str4, 1028425L, "5.0.273.1028425", com.alightcreative.app.motion.persist.j.INSTANCE.getAppInstance(), r4.getAppDay());
            wre.f44125n = this;
            wre.f44127t = str3;
            wre.f44126r = 1;
            Object objInvoke = userSessionBegan.invoke(userSessionBeginRequest, wre);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str3;
            obj = objInvoke;
            iAPMiddleware = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) wre.f44127t;
            iAPMiddleware = (IAPMiddleware) wre.f44125n;
            ResultKt.throwOnFailure(obj);
        }
        final IAPBackend.UserSessionBeginResponse userSessionBeginResponse2 = (IAPBackend.UserSessionBeginResponse) obj;
        XoT.C.Uo(iAPMiddleware, new Function0() { // from class: kgE.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IAPMiddleware.XQ(userSessionBeginResponse2);
            }
        });
        iAPMiddleware.f44111O.put(str2, userSessionBeginResponse2);
        iAPMiddleware.J2 = System.currentTimeMillis();
        iAPMiddleware.Uo++;
        return WPU(userSessionBeginResponse2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(int i2, boolean z2, String str, Continuation continuation) {
        I28 i28;
        IAPMiddleware iAPMiddleware;
        SKUInfo sKUInfo;
        IAPItemType iAPItemType;
        PurchasePeriod purchasePeriodRl;
        K k2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i3 = i28.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i28.J2 = i3 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objInvoke = i28.f44120t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = i28.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<IAPBackend.SKUInfoRequest, Continuation<? super IAPBackend.SKUInfoResponse>, Object> getIAPSkus = this.f44112n.getGetIAPSkus();
            IAPBackend.SKUInfoRequest sKUInfoRequest = new IAPBackend.SKUInfoRequest(i2, z2, str);
            i28.f44119n = this;
            i28.J2 = 1;
            objInvoke = getIAPSkus.invoke(sKUInfoRequest, i28);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            iAPMiddleware = this;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iAPMiddleware = (IAPMiddleware) i28.f44119n;
            ResultKt.throwOnFailure(objInvoke);
        }
        IAPBackend.SKUInfoResponse sKUInfoResponse = (IAPBackend.SKUInfoResponse) objInvoke;
        if (sKUInfoResponse.getMsTime() > 0) {
            iAPMiddleware.nr = sKUInfoResponse.getMsTime();
            com.alightcreative.app.motion.persist.j.INSTANCE.setLatestServerTimeMillis(sKUInfoResponse.getMsTime());
        }
        List<IAPBackend.SKUInfoResponse.SkuInfo> skus = sKUInfoResponse.getSkus();
        ArrayList arrayList = new ArrayList();
        for (IAPBackend.SKUInfoResponse.SkuInfo skuInfo : skus) {
            IAPItemType[] iAPItemTypeArrValues = IAPItemType.values();
            int length = iAPItemTypeArrValues.length;
            int i7 = 0;
            while (true) {
                sKUInfo = null;
                if (i7 >= length) {
                    iAPItemType = null;
                    break;
                }
                iAPItemType = iAPItemTypeArrValues[i7];
                if (Intrinsics.areEqual(iAPItemType.getTag(), skuInfo.getType())) {
                    break;
                }
                i7++;
            }
            if (iAPItemType != null && (purchasePeriodRl = C.rl(skuInfo.getPeriod())) != null) {
                String sku = skuInfo.getSku();
                long expires = skuInfo.getExpires();
                List<String> benefits = skuInfo.getBenefits();
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : benefits) {
                    K[] kArrValues = K.values();
                    int length2 = kArrValues.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            k2 = null;
                            break;
                        }
                        K k3 = kArrValues[i8];
                        if (Intrinsics.areEqual(k3.J2(), str2)) {
                            k2 = k3;
                            break;
                        }
                        i8++;
                    }
                    if (k2 != null) {
                        arrayList2.add(k2);
                    }
                }
                sKUInfo = new SKUInfo(iAPItemType, purchasePeriodRl, sku, expires, CollectionsKt.toSet(arrayList2));
            }
            if (sKUInfo != null) {
                arrayList.add(sKUInfo);
            }
        }
        return arrayList;
    }

    public final void ty(boolean z2) {
        this.f44113t = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(String str, Continuation continuation) throws PackageManager.NameNotFoundException {
        Ml ml;
        IAPMiddleware iAPMiddleware;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objInvoke = ml.f44123t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            PackageInfo packageInfo = IvA.n.rl().getApplicationContext().getPackageManager().getPackageInfo(IvA.n.rl().getPackageName(), 64);
            Function2<IAPBackend.AccountStatusRequest, Continuation<? super IAPBackend.AccountStatusResponse>, Object> getAccountStatusAndLicenses = this.f44112n.getGetAccountStatusAndLicenses();
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            String str2 = packageInfo.versionName;
            if (str2 == null) {
                str2 = "unknown";
            }
            IAPBackend.AccountStatusRequest accountStatusRequest = new IAPBackend.AccountStatusRequest(str, AppLovinBridge.f61290h, longVersionCode, str2, 1028425L, "5.0.273.1028425", com.alightcreative.app.motion.persist.j.INSTANCE.getAppInstance(), r1.getAppDay());
            ml.f44122n = this;
            ml.J2 = 1;
            objInvoke = getAccountStatusAndLicenses.invoke(accountStatusRequest, ml);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            iAPMiddleware = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iAPMiddleware = (IAPMiddleware) ml.f44122n;
            ResultKt.throwOnFailure(objInvoke);
        }
        IAPBackend.AccountStatusResponse accountStatusResponse = (IAPBackend.AccountStatusResponse) objInvoke;
        if (accountStatusResponse.getMsTime() != null && accountStatusResponse.getMsTime().longValue() > 0) {
            iAPMiddleware.nr = accountStatusResponse.getMsTime().longValue();
            com.alightcreative.app.motion.persist.j.INSTANCE.setLatestServerTimeMillis(accountStatusResponse.getMsTime().longValue());
        }
        List<BackendLicenseInfo> licenses = accountStatusResponse.getLicenses();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = licenses.iterator();
        while (it.hasNext()) {
            LicenseInfo licenseInfoT = C.t((BackendLicenseInfo) it.next());
            if (licenseInfoT != null) {
                arrayList.add(licenseInfoT);
            }
        }
        return new j(arrayList, accountStatusResponse.getAccountCreatedMillis());
    }

    private static final n WPU(IAPBackend.UserSessionBeginResponse userSessionBeginResponse) {
        String result = userSessionBeginResponse.getResult();
        int iHashCode = result.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != 96784904) {
                if (iHashCode == 2074671365 && result.equals("transient-error")) {
                    return n.f44129O;
                }
            } else if (result.equals(MRAIDPresenter.ERROR)) {
                return n.f44135t;
            }
        } else if (result.equals("success")) {
            return n.f44132n;
        }
        return n.J2;
    }
}
