package com.alightcreative.account;

import HI0.Lu;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.account.IAPBackend;
import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.AppLovinBridge;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import mCM.QJ;
import mCM.l3D;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\b\u001c\u001d\u001e\u001f !\"#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R7\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR7\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\nR7\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0015\u0010\nR7\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001a\u0010\n¨\u0006$"}, d2 = {"Lcom/alightcreative/account/IAPBackend;", "", "<init>", "()V", "getIAPSkus", "Lkotlin/Function2;", "Lcom/alightcreative/account/IAPBackend$SKUInfoRequest;", "Lkotlin/coroutines/Continuation;", "Lcom/alightcreative/account/IAPBackend$SKUInfoResponse;", "getGetIAPSkus", "()Lkotlin/jvm/functions/Function2;", "getIAPSkus$delegate", "Lkotlin/Lazy;", "getAccountStatusAndLicenses", "Lcom/alightcreative/account/IAPBackend$AccountStatusRequest;", "Lcom/alightcreative/account/IAPBackend$AccountStatusResponse;", "getGetAccountStatusAndLicenses", "getAccountStatusAndLicenses$delegate", "verifyPurchase", "Lcom/alightcreative/account/IAPBackend$VerifyPurchaseRequest;", "Lcom/alightcreative/account/IAPBackend$VerifyPurchaseResponse;", "getVerifyPurchase", "verifyPurchase$delegate", "userSessionBegan", "Lcom/alightcreative/account/IAPBackend$UserSessionBeginRequest;", "Lcom/alightcreative/account/IAPBackend$UserSessionBeginResponse;", "getUserSessionBegan", "userSessionBegan$delegate", "SKUInfoRequest", "SKUInfoResponse", "AccountStatusRequest", "AccountStatusResponse", "VerifyPurchaseRequest", "VerifyPurchaseResponse", "UserSessionBeginRequest", "UserSessionBeginResponse", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIAPBackend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IAPBackend.kt\ncom/alightcreative/account/IAPBackend\n+ 2 Functions.kt\ncom/alightcreative/firebase/FunctionsKt\n*L\n1#1,106:1\n66#2,5:107\n48#2,2:112\n48#2,2:114\n66#2,5:116\n*S KotlinDebug\n*F\n+ 1 IAPBackend.kt\ncom/alightcreative/account/IAPBackend\n*L\n13#1:107,5\n14#1:112,2\n15#1:114,2\n16#1:116,5\n*E\n"})
public final class IAPBackend {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: getIAPSkus$delegate, reason: from kotlin metadata */
    private final Lazy getIAPSkus = LazyKt.lazy(new Function0() { // from class: kgE.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IAPBackend.getIAPSkus_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: getAccountStatusAndLicenses$delegate, reason: from kotlin metadata */
    private final Lazy getAccountStatusAndLicenses = LazyKt.lazy(new Function0() { // from class: kgE.w6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IAPBackend.getAccountStatusAndLicenses_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: verifyPurchase$delegate, reason: from kotlin metadata */
    private final Lazy verifyPurchase = LazyKt.lazy(new Function0() { // from class: kgE.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IAPBackend.verifyPurchase_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: userSessionBegan$delegate, reason: from kotlin metadata */
    private final Lazy userSessionBegan = LazyKt.lazy(new Function0() { // from class: kgE.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IAPBackend.userSessionBegan_delegate$lambda$3();
        }
    });

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006'"}, d2 = {"Lcom/alightcreative/account/IAPBackend$AccountStatusRequest;", "", "acctTestMode", "", AppLovinBridge.f61288f, "amVersionCode", "", "amVersionName", "amBuildCode", "amBuildName", "appInstance", "appDay", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "getAcctTestMode", "()Ljava/lang/String;", "getPlatform", "getAmVersionCode", "()J", "getAmVersionName", "getAmBuildCode", "getAmBuildName", "getAppInstance", "getAppDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountStatusRequest {
        public static final int $stable = 0;
        private final String acctTestMode;
        private final long amBuildCode;
        private final String amBuildName;
        private final long amVersionCode;
        private final String amVersionName;
        private final long appDay;
        private final String appInstance;
        private final String platform;

        public static /* synthetic */ AccountStatusRequest copy$default(AccountStatusRequest accountStatusRequest, String str, String str2, long j2, String str3, long j3, String str4, String str5, long j4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = accountStatusRequest.acctTestMode;
            }
            if ((i2 & 2) != 0) {
                str2 = accountStatusRequest.platform;
            }
            if ((i2 & 4) != 0) {
                j2 = accountStatusRequest.amVersionCode;
            }
            if ((i2 & 8) != 0) {
                str3 = accountStatusRequest.amVersionName;
            }
            if ((i2 & 16) != 0) {
                j3 = accountStatusRequest.amBuildCode;
            }
            if ((i2 & 32) != 0) {
                str4 = accountStatusRequest.amBuildName;
            }
            if ((i2 & 64) != 0) {
                str5 = accountStatusRequest.appInstance;
            }
            if ((i2 & 128) != 0) {
                j4 = accountStatusRequest.appDay;
            }
            String str6 = str3;
            long j5 = j2;
            return accountStatusRequest.copy(str, str2, j5, str6, j3, str4, str5, j4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getAmVersionCode() {
            return this.amVersionCode;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAmVersionName() {
            return this.amVersionName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getAmBuildCode() {
            return this.amBuildCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAmBuildName() {
            return this.amBuildName;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAppInstance() {
            return this.appInstance;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final long getAppDay() {
            return this.appDay;
        }

        public final AccountStatusRequest copy(String acctTestMode, String platform, long amVersionCode, String amVersionName, long amBuildCode, String amBuildName, String appInstance, long appDay) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(amVersionName, "amVersionName");
            Intrinsics.checkNotNullParameter(amBuildName, "amBuildName");
            Intrinsics.checkNotNullParameter(appInstance, "appInstance");
            return new AccountStatusRequest(acctTestMode, platform, amVersionCode, amVersionName, amBuildCode, amBuildName, appInstance, appDay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountStatusRequest)) {
                return false;
            }
            AccountStatusRequest accountStatusRequest = (AccountStatusRequest) other;
            return Intrinsics.areEqual(this.acctTestMode, accountStatusRequest.acctTestMode) && Intrinsics.areEqual(this.platform, accountStatusRequest.platform) && this.amVersionCode == accountStatusRequest.amVersionCode && Intrinsics.areEqual(this.amVersionName, accountStatusRequest.amVersionName) && this.amBuildCode == accountStatusRequest.amBuildCode && Intrinsics.areEqual(this.amBuildName, accountStatusRequest.amBuildName) && Intrinsics.areEqual(this.appInstance, accountStatusRequest.appInstance) && this.appDay == accountStatusRequest.appDay;
        }

        public int hashCode() {
            return (((((((((((((this.acctTestMode.hashCode() * 31) + this.platform.hashCode()) * 31) + Long.hashCode(this.amVersionCode)) * 31) + this.amVersionName.hashCode()) * 31) + Long.hashCode(this.amBuildCode)) * 31) + this.amBuildName.hashCode()) * 31) + this.appInstance.hashCode()) * 31) + Long.hashCode(this.appDay);
        }

        public String toString() {
            return "AccountStatusRequest(acctTestMode=" + this.acctTestMode + ", platform=" + this.platform + ", amVersionCode=" + this.amVersionCode + ", amVersionName=" + this.amVersionName + ", amBuildCode=" + this.amBuildCode + ", amBuildName=" + this.amBuildName + ", appInstance=" + this.appInstance + ", appDay=" + this.appDay + ")";
        }

        public AccountStatusRequest(String acctTestMode, String platform, long j2, String amVersionName, long j3, String amBuildName, String appInstance, long j4) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(amVersionName, "amVersionName");
            Intrinsics.checkNotNullParameter(amBuildName, "amBuildName");
            Intrinsics.checkNotNullParameter(appInstance, "appInstance");
            this.acctTestMode = acctTestMode;
            this.platform = platform;
            this.amVersionCode = j2;
            this.amVersionName = amVersionName;
            this.amBuildCode = j3;
            this.amBuildName = amBuildName;
            this.appInstance = appInstance;
            this.appDay = j4;
        }

        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        public final long getAmBuildCode() {
            return this.amBuildCode;
        }

        public final String getAmBuildName() {
            return this.amBuildName;
        }

        public final long getAmVersionCode() {
            return this.amVersionCode;
        }

        public final String getAmVersionName() {
            return this.amVersionName;
        }

        public final long getAppDay() {
            return this.appDay;
        }

        public final String getAppInstance() {
            return this.appInstance;
        }

        public final String getPlatform() {
            return this.platform;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, d2 = {"Lcom/alightcreative/account/IAPBackend$AccountStatusResponse;", "", "result", "", "msTime", "", "licenses", "", "Lcom/alightcreative/account/BackendLicenseInfo;", "accountCreatedMillis", "warnings", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "getResult", "()Ljava/lang/String;", "getMsTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLicenses", "()Ljava/util/List;", "getAccountCreatedMillis", "getWarnings", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/alightcreative/account/IAPBackend$AccountStatusResponse;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountStatusResponse {
        public static final int $stable = 8;
        private final Long accountCreatedMillis;
        private final List<BackendLicenseInfo> licenses;
        private final Long msTime;
        private final String result;
        private final List<String> warnings;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountStatusResponse copy$default(AccountStatusResponse accountStatusResponse, String str, Long l2, List list, Long l5, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = accountStatusResponse.result;
            }
            if ((i2 & 2) != 0) {
                l2 = accountStatusResponse.msTime;
            }
            if ((i2 & 4) != 0) {
                list = accountStatusResponse.licenses;
            }
            if ((i2 & 8) != 0) {
                l5 = accountStatusResponse.accountCreatedMillis;
            }
            if ((i2 & 16) != 0) {
                list2 = accountStatusResponse.warnings;
            }
            List list3 = list2;
            List list4 = list;
            return accountStatusResponse.copy(str, l2, list4, l5, list3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getMsTime() {
            return this.msTime;
        }

        public final List<BackendLicenseInfo> component3() {
            return this.licenses;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getAccountCreatedMillis() {
            return this.accountCreatedMillis;
        }

        public final List<String> component5() {
            return this.warnings;
        }

        public final AccountStatusResponse copy(String result, Long msTime, List<BackendLicenseInfo> licenses, Long accountCreatedMillis, List<String> warnings) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(licenses, "licenses");
            return new AccountStatusResponse(result, msTime, licenses, accountCreatedMillis, warnings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountStatusResponse)) {
                return false;
            }
            AccountStatusResponse accountStatusResponse = (AccountStatusResponse) other;
            return Intrinsics.areEqual(this.result, accountStatusResponse.result) && Intrinsics.areEqual(this.msTime, accountStatusResponse.msTime) && Intrinsics.areEqual(this.licenses, accountStatusResponse.licenses) && Intrinsics.areEqual(this.accountCreatedMillis, accountStatusResponse.accountCreatedMillis) && Intrinsics.areEqual(this.warnings, accountStatusResponse.warnings);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            Long l2 = this.msTime;
            int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.licenses.hashCode()) * 31;
            Long l5 = this.accountCreatedMillis;
            int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
            List<String> list = this.warnings;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AccountStatusResponse(result=" + this.result + ", msTime=" + this.msTime + ", licenses=" + this.licenses + ", accountCreatedMillis=" + this.accountCreatedMillis + ", warnings=" + this.warnings + ")";
        }

        public AccountStatusResponse(String result, Long l2, List<BackendLicenseInfo> licenses, Long l5, List<String> list) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(licenses, "licenses");
            this.result = result;
            this.msTime = l2;
            this.licenses = licenses;
            this.accountCreatedMillis = l5;
            this.warnings = list;
        }

        public final Long getAccountCreatedMillis() {
            return this.accountCreatedMillis;
        }

        public final List<BackendLicenseInfo> getLicenses() {
            return this.licenses;
        }

        public final Long getMsTime() {
            return this.msTime;
        }

        public final String getResult() {
            return this.result;
        }

        public final List<String> getWarnings() {
            return this.warnings;
        }
    }

    public static final class Ml extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43972O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43973n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ QJ f43974o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f43975r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43976t;

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f43977n;

            public j(String str) {
                this.f43977n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFunc/Calling: " + this.f43977n;
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f43978n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f43979t;

            public n(String str, String str2) {
                this.f43978n = str;
                this.f43979t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f43978n + ": IN / " + this.f43979t;
            }
        }

        public static final class w6 implements Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f43980n;
            final /* synthetic */ kotlin.coroutines.Continuation nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f43981t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43982n;

                public CN3(String str) {
                    this.f43982n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43982n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43983n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f43984t;

                public I28(String str, Throwable th) {
                    this.f43983n = str;
                    this.f43984t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43983n + ": Parse error! " + this.f43984t;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$Ml$w6$Ml, reason: collision with other inner class name */
            public static final class C0603Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f43985O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43986n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f43987t;

                public C0603Ml(String str, int i2, String str2) {
                    this.f43986n = str;
                    this.f43987t = i2;
                    this.f43985O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43986n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f43987t), 4, (char) 0, 2, (Object) null) + ": " + this.f43985O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43988n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f43989t;

                public Wre(String str, Object obj) {
                    this.f43988n = str;
                    this.f43989t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43988n + ": RESULT: " + this.f43989t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43990n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f43991t;

                public j(String str, Task task) {
                    this.f43990n = str;
                    this.f43991t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f43990n;
                    Task task = this.f43991t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f43991t.isCanceled();
                    boolean zIsComplete = this.f43991t.isComplete();
                    Exception exception = this.f43991t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43992n;

                public n(String str) {
                    this.f43992n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43992n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$Ml$w6$w6, reason: collision with other inner class name */
            public static final class C0604w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f43993n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f43994t;

                public C0604w6(String str, String str2) {
                    this.f43993n = str;
                    this.f43994t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f43993n + ": RESPONSE: len=" + this.f43994t.length();
                }
            }

            public w6(QJ qj, JsonAdapter jsonAdapter, String str, kotlin.coroutines.Continuation continuation) {
                this.f43980n = qj;
                this.rl = jsonAdapter;
                this.f43981t = str;
                this.nr = continuation;
            }

            public final void n(Task task) {
                Object objM313constructorimpl;
                Object obj;
                Object objM313constructorimpl2;
                Object objM313constructorimpl3;
                Object objM313constructorimpl4;
                Object objM313constructorimpl5;
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f43980n, new j(this.f43981t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        kotlin.coroutines.Continuation continuation = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl6)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl6) ? null : objM313constructorimpl6;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl3 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl6);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl);
                            objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl));
                        }
                        continuation.resumeWith(objM313constructorimpl3);
                        return;
                    }
                    XoT.C.Uo(this.f43980n, new n(this.f43981t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f43980n, new C0604w6(this.f43981t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    QJ qj = this.f43980n;
                    String str = this.f43981t;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new C0603Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f43980n, new Wre(this.f43981t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            kotlin.coroutines.Continuation continuation2 = this.nr;
                            if (Result.m320isSuccessimpl(objM313constructorimpl7)) {
                                obj = Result.m319isFailureimpl(objM313constructorimpl7) ? null : objM313constructorimpl7;
                                Intrinsics.checkNotNull(obj);
                                objM313constructorimpl5 = Result.m313constructorimpl(obj);
                            } else {
                                Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl7);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl2);
                                objM313constructorimpl5 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl2));
                            }
                            continuation2.resumeWith(objM313constructorimpl5);
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f43980n, new I28(this.f43981t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        kotlin.coroutines.Continuation continuation3 = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl8)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl8) ? null : objM313constructorimpl8;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl4 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl8);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl3);
                            objM313constructorimpl4 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl3));
                        }
                        continuation3.resumeWith(objM313constructorimpl4);
                        return;
                    }
                }
                XoT.C.Uo(this.f43980n, new CN3(this.f43981t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    kotlin.coroutines.Continuation continuation4 = this.nr;
                    if (Result.m320isSuccessimpl(objM313constructorimpl9)) {
                        obj = Result.m319isFailureimpl(objM313constructorimpl9) ? null : objM313constructorimpl9;
                        Intrinsics.checkNotNull(obj);
                        objM313constructorimpl2 = Result.m313constructorimpl(obj);
                    } else {
                        Throwable thM316exceptionOrNullimpl4 = Result.m316exceptionOrNullimpl(objM313constructorimpl9);
                        Intrinsics.checkNotNull(thM316exceptionOrNullimpl4);
                        objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl4));
                    }
                    continuation4.resumeWith(objM313constructorimpl2);
                    return;
                }
                Result.Companion companion4 = Result.INSTANCE;
                Object objM313constructorimpl10 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                kotlin.coroutines.Continuation continuation5 = this.nr;
                if (Result.m320isSuccessimpl(objM313constructorimpl10)) {
                    obj = Result.m319isFailureimpl(objM313constructorimpl10) ? null : objM313constructorimpl10;
                    Intrinsics.checkNotNull(obj);
                    objM313constructorimpl = Result.m313constructorimpl(obj);
                } else {
                    Throwable thM316exceptionOrNullimpl5 = Result.m316exceptionOrNullimpl(objM313constructorimpl10);
                    Intrinsics.checkNotNull(thM316exceptionOrNullimpl5);
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl5));
                }
                continuation5.resumeWith(objM313constructorimpl);
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation create(Object obj, kotlin.coroutines.Continuation continuation) {
            Ml ml = new Ml(this.f43975r, this.f43974o, continuation);
            ml.J2 = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.Continuation continuation) {
            return ((Ml) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(String str, QJ qj, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f43975r = str;
            this.f43974o = qj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43972O;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.J2;
            XoT.C.KN("FFunc", new j(this.f43975r));
            QJ qj = this.f43974o;
            String str = this.f43975r;
            this.J2 = obj2;
            this.f43973n = qj;
            this.f43976t = str;
            this.f43972O = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            JsonAdapter jsonAdapterAdapter = Lu.n().adapter(VerifyPurchaseRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj2);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, Lu.n().adapter(VerifyPurchaseResponse.class), str, safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            return orThrow;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/account/IAPBackend$SKUInfoRequest;", "", "apiVersion", "", "iaptest", "", "acctTestMode", "", "<init>", "(IZLjava/lang/String;)V", "getApiVersion", "()I", "getIaptest", "()Z", "getAcctTestMode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SKUInfoRequest {
        public static final int $stable = 0;
        private final String acctTestMode;
        private final int apiVersion;
        private final boolean iaptest;

        public static /* synthetic */ SKUInfoRequest copy$default(SKUInfoRequest sKUInfoRequest, int i2, boolean z2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = sKUInfoRequest.apiVersion;
            }
            if ((i3 & 2) != 0) {
                z2 = sKUInfoRequest.iaptest;
            }
            if ((i3 & 4) != 0) {
                str = sKUInfoRequest.acctTestMode;
            }
            return sKUInfoRequest.copy(i2, z2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getApiVersion() {
            return this.apiVersion;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIaptest() {
            return this.iaptest;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        public final SKUInfoRequest copy(int apiVersion, boolean iaptest, String acctTestMode) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            return new SKUInfoRequest(apiVersion, iaptest, acctTestMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SKUInfoRequest)) {
                return false;
            }
            SKUInfoRequest sKUInfoRequest = (SKUInfoRequest) other;
            return this.apiVersion == sKUInfoRequest.apiVersion && this.iaptest == sKUInfoRequest.iaptest && Intrinsics.areEqual(this.acctTestMode, sKUInfoRequest.acctTestMode);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.apiVersion) * 31) + Boolean.hashCode(this.iaptest)) * 31) + this.acctTestMode.hashCode();
        }

        public String toString() {
            return "SKUInfoRequest(apiVersion=" + this.apiVersion + ", iaptest=" + this.iaptest + ", acctTestMode=" + this.acctTestMode + ")";
        }

        public SKUInfoRequest(int i2, boolean z2, String acctTestMode) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            this.apiVersion = i2;
            this.iaptest = z2;
            this.acctTestMode = acctTestMode;
        }

        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        public final int getApiVersion() {
            return this.apiVersion;
        }

        public final boolean getIaptest() {
            return this.iaptest;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/account/IAPBackend$SKUInfoResponse;", "", "msTime", "", "skus", "", "Lcom/alightcreative/account/IAPBackend$SKUInfoResponse$SkuInfo;", "<init>", "(JLjava/util/List;)V", "getMsTime", "()J", "getSkus", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "SkuInfo", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SKUInfoResponse {
        public static final int $stable = 8;
        private final long msTime;
        private final List<SkuInfo> skus;

        @StabilityInferred
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0010HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/alightcreative/account/IAPBackend$SKUInfoResponse$SkuInfo;", "", "type", "", "period", AppLovinEventParameters.PRODUCT_IDENTIFIER, "expires", "", "benefits", "", "can_purchase", "", "main_option", "show", "", "default_priority", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;ZZLjava/util/Set;I)V", "getType", "()Ljava/lang/String;", "getPeriod", "getSku", "getExpires", "()J", "getBenefits", "()Ljava/util/List;", "getCan_purchase", "()Z", "getMain_option", "getShow", "()Ljava/util/Set;", "getDefault_priority", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SkuInfo {
            public static final int $stable = 8;
            private final List<String> benefits;
            private final boolean can_purchase;
            private final int default_priority;
            private final long expires;
            private final boolean main_option;
            private final String period;
            private final Set<String> show;
            private final String sku;
            private final String type;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SkuInfo copy$default(SkuInfo skuInfo, String str, String str2, String str3, long j2, List list, boolean z2, boolean z3, Set set, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = skuInfo.type;
                }
                if ((i3 & 2) != 0) {
                    str2 = skuInfo.period;
                }
                if ((i3 & 4) != 0) {
                    str3 = skuInfo.sku;
                }
                if ((i3 & 8) != 0) {
                    j2 = skuInfo.expires;
                }
                if ((i3 & 16) != 0) {
                    list = skuInfo.benefits;
                }
                if ((i3 & 32) != 0) {
                    z2 = skuInfo.can_purchase;
                }
                if ((i3 & 64) != 0) {
                    z3 = skuInfo.main_option;
                }
                if ((i3 & 128) != 0) {
                    set = skuInfo.show;
                }
                if ((i3 & 256) != 0) {
                    i2 = skuInfo.default_priority;
                }
                int i5 = i2;
                boolean z4 = z3;
                List list2 = list;
                long j3 = j2;
                String str4 = str3;
                return skuInfo.copy(str, str2, str4, j3, list2, z2, z4, set, i5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getSku() {
                return this.sku;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final long getExpires() {
                return this.expires;
            }

            public final List<String> component5() {
                return this.benefits;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final boolean getCan_purchase() {
                return this.can_purchase;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final boolean getMain_option() {
                return this.main_option;
            }

            public final Set<String> component8() {
                return this.show;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final int getDefault_priority() {
                return this.default_priority;
            }

            public final SkuInfo copy(String type, String period, String sku, long expires, List<String> benefits, boolean can_purchase, boolean main_option, Set<String> show, int default_priority) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(sku, "sku");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                Intrinsics.checkNotNullParameter(show, "show");
                return new SkuInfo(type, period, sku, expires, benefits, can_purchase, main_option, show, default_priority);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SkuInfo)) {
                    return false;
                }
                SkuInfo skuInfo = (SkuInfo) other;
                return Intrinsics.areEqual(this.type, skuInfo.type) && Intrinsics.areEqual(this.period, skuInfo.period) && Intrinsics.areEqual(this.sku, skuInfo.sku) && this.expires == skuInfo.expires && Intrinsics.areEqual(this.benefits, skuInfo.benefits) && this.can_purchase == skuInfo.can_purchase && this.main_option == skuInfo.main_option && Intrinsics.areEqual(this.show, skuInfo.show) && this.default_priority == skuInfo.default_priority;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.period;
                return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sku.hashCode()) * 31) + Long.hashCode(this.expires)) * 31) + this.benefits.hashCode()) * 31) + Boolean.hashCode(this.can_purchase)) * 31) + Boolean.hashCode(this.main_option)) * 31) + this.show.hashCode()) * 31) + Integer.hashCode(this.default_priority);
            }

            public String toString() {
                return "SkuInfo(type=" + this.type + ", period=" + this.period + ", sku=" + this.sku + ", expires=" + this.expires + ", benefits=" + this.benefits + ", can_purchase=" + this.can_purchase + ", main_option=" + this.main_option + ", show=" + this.show + ", default_priority=" + this.default_priority + ")";
            }

            public SkuInfo(String type, String str, String sku, long j2, List<String> benefits, boolean z2, boolean z3, Set<String> show, int i2) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(sku, "sku");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                Intrinsics.checkNotNullParameter(show, "show");
                this.type = type;
                this.period = str;
                this.sku = sku;
                this.expires = j2;
                this.benefits = benefits;
                this.can_purchase = z2;
                this.main_option = z3;
                this.show = show;
                this.default_priority = i2;
            }

            public final List<String> getBenefits() {
                return this.benefits;
            }

            public final boolean getCan_purchase() {
                return this.can_purchase;
            }

            public final int getDefault_priority() {
                return this.default_priority;
            }

            public final long getExpires() {
                return this.expires;
            }

            public final boolean getMain_option() {
                return this.main_option;
            }

            public final String getPeriod() {
                return this.period;
            }

            public final Set<String> getShow() {
                return this.show;
            }

            public final String getSku() {
                return this.sku;
            }

            public final String getType() {
                return this.type;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SKUInfoResponse copy$default(SKUInfoResponse sKUInfoResponse, long j2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = sKUInfoResponse.msTime;
            }
            if ((i2 & 2) != 0) {
                list = sKUInfoResponse.skus;
            }
            return sKUInfoResponse.copy(j2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getMsTime() {
            return this.msTime;
        }

        public final List<SkuInfo> component2() {
            return this.skus;
        }

        public final SKUInfoResponse copy(long msTime, List<SkuInfo> skus) {
            Intrinsics.checkNotNullParameter(skus, "skus");
            return new SKUInfoResponse(msTime, skus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SKUInfoResponse)) {
                return false;
            }
            SKUInfoResponse sKUInfoResponse = (SKUInfoResponse) other;
            return this.msTime == sKUInfoResponse.msTime && Intrinsics.areEqual(this.skus, sKUInfoResponse.skus);
        }

        public int hashCode() {
            return (Long.hashCode(this.msTime) * 31) + this.skus.hashCode();
        }

        public String toString() {
            return "SKUInfoResponse(msTime=" + this.msTime + ", skus=" + this.skus + ")";
        }

        public SKUInfoResponse(long j2, List<SkuInfo> skus) {
            Intrinsics.checkNotNullParameter(skus, "skus");
            this.msTime = j2;
            this.skus = skus;
        }

        public final long getMsTime() {
            return this.msTime;
        }

        public final List<SkuInfo> getSkus() {
            return this.skus;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/alightcreative/account/IAPBackend$UserSessionBeginRequest;", "", "expectedAccountVersion", "", "acctTestMode", "", AppLovinBridge.f61288f, "amVersionCode", "amVersionName", "amBuildCode", "amBuildName", "appInstance", "appDay", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "getExpectedAccountVersion", "()J", "getAcctTestMode", "()Ljava/lang/String;", "getPlatform", "getAmVersionCode", "getAmVersionName", "getAmBuildCode", "getAmBuildName", "getAppInstance", "getAppDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserSessionBeginRequest {
        public static final int $stable = 0;
        private final String acctTestMode;
        private final long amBuildCode;
        private final String amBuildName;
        private final long amVersionCode;
        private final String amVersionName;
        private final long appDay;
        private final String appInstance;
        private final long expectedAccountVersion;
        private final String platform;

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getExpectedAccountVersion() {
            return this.expectedAccountVersion;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getAmVersionCode() {
            return this.amVersionCode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAmVersionName() {
            return this.amVersionName;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getAmBuildCode() {
            return this.amBuildCode;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAmBuildName() {
            return this.amBuildName;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAppInstance() {
            return this.appInstance;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final long getAppDay() {
            return this.appDay;
        }

        public final UserSessionBeginRequest copy(long expectedAccountVersion, String acctTestMode, String platform, long amVersionCode, String amVersionName, long amBuildCode, String amBuildName, String appInstance, long appDay) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(amVersionName, "amVersionName");
            Intrinsics.checkNotNullParameter(amBuildName, "amBuildName");
            Intrinsics.checkNotNullParameter(appInstance, "appInstance");
            return new UserSessionBeginRequest(expectedAccountVersion, acctTestMode, platform, amVersionCode, amVersionName, amBuildCode, amBuildName, appInstance, appDay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserSessionBeginRequest)) {
                return false;
            }
            UserSessionBeginRequest userSessionBeginRequest = (UserSessionBeginRequest) other;
            return this.expectedAccountVersion == userSessionBeginRequest.expectedAccountVersion && Intrinsics.areEqual(this.acctTestMode, userSessionBeginRequest.acctTestMode) && Intrinsics.areEqual(this.platform, userSessionBeginRequest.platform) && this.amVersionCode == userSessionBeginRequest.amVersionCode && Intrinsics.areEqual(this.amVersionName, userSessionBeginRequest.amVersionName) && this.amBuildCode == userSessionBeginRequest.amBuildCode && Intrinsics.areEqual(this.amBuildName, userSessionBeginRequest.amBuildName) && Intrinsics.areEqual(this.appInstance, userSessionBeginRequest.appInstance) && this.appDay == userSessionBeginRequest.appDay;
        }

        public int hashCode() {
            return (((((((((((((((Long.hashCode(this.expectedAccountVersion) * 31) + this.acctTestMode.hashCode()) * 31) + this.platform.hashCode()) * 31) + Long.hashCode(this.amVersionCode)) * 31) + this.amVersionName.hashCode()) * 31) + Long.hashCode(this.amBuildCode)) * 31) + this.amBuildName.hashCode()) * 31) + this.appInstance.hashCode()) * 31) + Long.hashCode(this.appDay);
        }

        public String toString() {
            return "UserSessionBeginRequest(expectedAccountVersion=" + this.expectedAccountVersion + ", acctTestMode=" + this.acctTestMode + ", platform=" + this.platform + ", amVersionCode=" + this.amVersionCode + ", amVersionName=" + this.amVersionName + ", amBuildCode=" + this.amBuildCode + ", amBuildName=" + this.amBuildName + ", appInstance=" + this.appInstance + ", appDay=" + this.appDay + ")";
        }

        public UserSessionBeginRequest(long j2, String acctTestMode, String platform, long j3, String amVersionName, long j4, String amBuildName, String appInstance, long j5) {
            Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(amVersionName, "amVersionName");
            Intrinsics.checkNotNullParameter(amBuildName, "amBuildName");
            Intrinsics.checkNotNullParameter(appInstance, "appInstance");
            this.expectedAccountVersion = j2;
            this.acctTestMode = acctTestMode;
            this.platform = platform;
            this.amVersionCode = j3;
            this.amVersionName = amVersionName;
            this.amBuildCode = j4;
            this.amBuildName = amBuildName;
            this.appInstance = appInstance;
            this.appDay = j5;
        }

        public final String getAcctTestMode() {
            return this.acctTestMode;
        }

        public final long getAmBuildCode() {
            return this.amBuildCode;
        }

        public final String getAmBuildName() {
            return this.amBuildName;
        }

        public final long getAmVersionCode() {
            return this.amVersionCode;
        }

        public final String getAmVersionName() {
            return this.amVersionName;
        }

        public final long getAppDay() {
            return this.appDay;
        }

        public final String getAppInstance() {
            return this.appInstance;
        }

        public final long getExpectedAccountVersion() {
            return this.expectedAccountVersion;
        }

        public final String getPlatform() {
            return this.platform;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/account/IAPBackend$UserSessionBeginResponse;", "", "result", "", "<init>", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserSessionBeginResponse {
        public static final int $stable = 0;
        private final String result;

        public static /* synthetic */ UserSessionBeginResponse copy$default(UserSessionBeginResponse userSessionBeginResponse, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = userSessionBeginResponse.result;
            }
            return userSessionBeginResponse.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        public final UserSessionBeginResponse copy(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new UserSessionBeginResponse(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserSessionBeginResponse) && Intrinsics.areEqual(this.result, ((UserSessionBeginResponse) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "UserSessionBeginResponse(result=" + this.result + ")";
        }

        public UserSessionBeginResponse(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final String getResult() {
            return this.result;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/account/IAPBackend$VerifyPurchaseRequest;", "", "productId", "", "token", "skuType", "orderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getToken", "getSkuType", "getOrderId", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerifyPurchaseRequest {
        public static final int $stable = 0;
        private final String orderId;
        private final String productId;
        private final String skuType;
        private final String token;

        public static /* synthetic */ VerifyPurchaseRequest copy$default(VerifyPurchaseRequest verifyPurchaseRequest, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = verifyPurchaseRequest.productId;
            }
            if ((i2 & 2) != 0) {
                str2 = verifyPurchaseRequest.token;
            }
            if ((i2 & 4) != 0) {
                str3 = verifyPurchaseRequest.skuType;
            }
            if ((i2 & 8) != 0) {
                str4 = verifyPurchaseRequest.orderId;
            }
            return verifyPurchaseRequest.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSkuType() {
            return this.skuType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        public final VerifyPurchaseRequest copy(String productId, String token, String skuType, String orderId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            return new VerifyPurchaseRequest(productId, token, skuType, orderId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyPurchaseRequest)) {
                return false;
            }
            VerifyPurchaseRequest verifyPurchaseRequest = (VerifyPurchaseRequest) other;
            return Intrinsics.areEqual(this.productId, verifyPurchaseRequest.productId) && Intrinsics.areEqual(this.token, verifyPurchaseRequest.token) && Intrinsics.areEqual(this.skuType, verifyPurchaseRequest.skuType) && Intrinsics.areEqual(this.orderId, verifyPurchaseRequest.orderId);
        }

        public int hashCode() {
            return (((((this.productId.hashCode() * 31) + this.token.hashCode()) * 31) + this.skuType.hashCode()) * 31) + this.orderId.hashCode();
        }

        public String toString() {
            return "VerifyPurchaseRequest(productId=" + this.productId + ", token=" + this.token + ", skuType=" + this.skuType + ", orderId=" + this.orderId + ")";
        }

        public VerifyPurchaseRequest(String productId, String token, String skuType, String orderId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.productId = productId;
            this.token = token;
            this.skuType = skuType;
            this.orderId = orderId;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getSkuType() {
            return this.skuType;
        }

        public final String getToken() {
            return this.token;
        }
    }

    @StabilityInferred
    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u0084\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\rHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$¨\u00068"}, d2 = {"Lcom/alightcreative/account/IAPBackend$VerifyPurchaseResponse;", "", "status", "", "source", "cached", "", "msTime", "startTimeMillis", "expiryTimeMillis", "autoRenewing", "", "cancelReason", "", "valid", "accountLinkStatus", "testPurchase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JJLjava/lang/Boolean;Ljava/lang/Integer;ZLjava/lang/String;Z)V", "getStatus", "()Ljava/lang/String;", "getSource", "getCached", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMsTime", "getStartTimeMillis", "()J", "getExpiryTimeMillis", "getAutoRenewing", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelReason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValid", "()Z", "getAccountLinkStatus", "getTestPurchase", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JJLjava/lang/Boolean;Ljava/lang/Integer;ZLjava/lang/String;Z)Lcom/alightcreative/account/IAPBackend$VerifyPurchaseResponse;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerifyPurchaseResponse {
        public static final int $stable = 0;
        private final String accountLinkStatus;
        private final Boolean autoRenewing;
        private final Long cached;
        private final Integer cancelReason;
        private final long expiryTimeMillis;
        private final Long msTime;
        private final String source;
        private final long startTimeMillis;
        private final String status;
        private final boolean testPurchase;
        private final boolean valid;

        public static /* synthetic */ VerifyPurchaseResponse copy$default(VerifyPurchaseResponse verifyPurchaseResponse, String str, String str2, Long l2, Long l5, long j2, long j3, Boolean bool, Integer num, boolean z2, String str3, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = verifyPurchaseResponse.status;
            }
            return verifyPurchaseResponse.copy(str, (i2 & 2) != 0 ? verifyPurchaseResponse.source : str2, (i2 & 4) != 0 ? verifyPurchaseResponse.cached : l2, (i2 & 8) != 0 ? verifyPurchaseResponse.msTime : l5, (i2 & 16) != 0 ? verifyPurchaseResponse.startTimeMillis : j2, (i2 & 32) != 0 ? verifyPurchaseResponse.expiryTimeMillis : j3, (i2 & 64) != 0 ? verifyPurchaseResponse.autoRenewing : bool, (i2 & 128) != 0 ? verifyPurchaseResponse.cancelReason : num, (i2 & 256) != 0 ? verifyPurchaseResponse.valid : z2, (i2 & 512) != 0 ? verifyPurchaseResponse.accountLinkStatus : str3, (i2 & 1024) != 0 ? verifyPurchaseResponse.testPurchase : z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAccountLinkStatus() {
            return this.accountLinkStatus;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getTestPurchase() {
            return this.testPurchase;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getCached() {
            return this.cached;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getMsTime() {
            return this.msTime;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getExpiryTimeMillis() {
            return this.expiryTimeMillis;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getAutoRenewing() {
            return this.autoRenewing;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getCancelReason() {
            return this.cancelReason;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getValid() {
            return this.valid;
        }

        public final VerifyPurchaseResponse copy(String status, String source, Long cached, Long msTime, long startTimeMillis, long expiryTimeMillis, Boolean autoRenewing, Integer cancelReason, boolean valid, String accountLinkStatus, boolean testPurchase) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountLinkStatus, "accountLinkStatus");
            return new VerifyPurchaseResponse(status, source, cached, msTime, startTimeMillis, expiryTimeMillis, autoRenewing, cancelReason, valid, accountLinkStatus, testPurchase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyPurchaseResponse)) {
                return false;
            }
            VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) other;
            return Intrinsics.areEqual(this.status, verifyPurchaseResponse.status) && Intrinsics.areEqual(this.source, verifyPurchaseResponse.source) && Intrinsics.areEqual(this.cached, verifyPurchaseResponse.cached) && Intrinsics.areEqual(this.msTime, verifyPurchaseResponse.msTime) && this.startTimeMillis == verifyPurchaseResponse.startTimeMillis && this.expiryTimeMillis == verifyPurchaseResponse.expiryTimeMillis && Intrinsics.areEqual(this.autoRenewing, verifyPurchaseResponse.autoRenewing) && Intrinsics.areEqual(this.cancelReason, verifyPurchaseResponse.cancelReason) && this.valid == verifyPurchaseResponse.valid && Intrinsics.areEqual(this.accountLinkStatus, verifyPurchaseResponse.accountLinkStatus) && this.testPurchase == verifyPurchaseResponse.testPurchase;
        }

        public int hashCode() {
            int iHashCode = ((this.status.hashCode() * 31) + this.source.hashCode()) * 31;
            Long l2 = this.cached;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l5 = this.msTime;
            int iHashCode3 = (((((iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31) + Long.hashCode(this.startTimeMillis)) * 31) + Long.hashCode(this.expiryTimeMillis)) * 31;
            Boolean bool = this.autoRenewing;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.cancelReason;
            return ((((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.valid)) * 31) + this.accountLinkStatus.hashCode()) * 31) + Boolean.hashCode(this.testPurchase);
        }

        public String toString() {
            return "VerifyPurchaseResponse(status=" + this.status + ", source=" + this.source + ", cached=" + this.cached + ", msTime=" + this.msTime + ", startTimeMillis=" + this.startTimeMillis + ", expiryTimeMillis=" + this.expiryTimeMillis + ", autoRenewing=" + this.autoRenewing + ", cancelReason=" + this.cancelReason + ", valid=" + this.valid + ", accountLinkStatus=" + this.accountLinkStatus + ", testPurchase=" + this.testPurchase + ")";
        }

        public VerifyPurchaseResponse(String status, String source, Long l2, Long l5, long j2, long j3, Boolean bool, Integer num, boolean z2, String accountLinkStatus, boolean z3) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountLinkStatus, "accountLinkStatus");
            this.status = status;
            this.source = source;
            this.cached = l2;
            this.msTime = l5;
            this.startTimeMillis = j2;
            this.expiryTimeMillis = j3;
            this.autoRenewing = bool;
            this.cancelReason = num;
            this.valid = z2;
            this.accountLinkStatus = accountLinkStatus;
            this.testPurchase = z3;
        }

        public final String getAccountLinkStatus() {
            return this.accountLinkStatus;
        }

        public final Boolean getAutoRenewing() {
            return this.autoRenewing;
        }

        public final Long getCached() {
            return this.cached;
        }

        public final Integer getCancelReason() {
            return this.cancelReason;
        }

        public final long getExpiryTimeMillis() {
            return this.expiryTimeMillis;
        }

        public final Long getMsTime() {
            return this.msTime;
        }

        public final String getSource() {
            return this.source;
        }

        public final long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        public final String getStatus() {
            return this.status;
        }

        public final boolean getTestPurchase() {
            return this.testPurchase;
        }

        public final boolean getValid() {
            return this.valid;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43995O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ QJ f43997o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f43998r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43999t;

        /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$j$j, reason: collision with other inner class name */
        public static final class C0605j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44000n;

            public C0605j(String str) {
                this.f44000n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFunc/Calling: " + this.f44000n;
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44001n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44002t;

            public n(String str, String str2) {
                this.f44001n = str;
                this.f44002t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f44001n + ": IN / " + this.f44002t;
            }
        }

        public static final class w6 implements Continuation {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f44003n;
            final /* synthetic */ kotlin.coroutines.Continuation nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44004t;

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44005n;

                public CN3(String str) {
                    this.f44005n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44005n + ": FAIL";
                }
            }

            public static final class I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44006n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f44007t;

                public I28(String str, Throwable th) {
                    this.f44006n = str;
                    this.f44007t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44006n + ": Parse error! " + this.f44007t;
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f44008O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44009n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f44010t;

                public Ml(String str, int i2, String str2) {
                    this.f44009n = str;
                    this.f44010t = i2;
                    this.f44008O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44009n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f44010t), 4, (char) 0, 2, (Object) null) + ": " + this.f44008O;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44011n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44012t;

                public Wre(String str, Object obj) {
                    this.f44011n = str;
                    this.f44012t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44011n + ": RESULT: " + this.f44012t;
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$j$w6$j, reason: collision with other inner class name */
            public static final class C0606j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44013n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f44014t;

                public C0606j(String str, Task task) {
                    this.f44013n = str;
                    this.f44014t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f44013n;
                    Task task = this.f44014t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f44014t.isCanceled();
                    boolean zIsComplete = this.f44014t.isComplete();
                    Exception exception = this.f44014t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44015n;

                public n(String str) {
                    this.f44015n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44015n + ": SUCCESS";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$j$w6$w6, reason: collision with other inner class name */
            public static final class C0607w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44016n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f44017t;

                public C0607w6(String str, String str2) {
                    this.f44016n = str;
                    this.f44017t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44016n + ": RESPONSE: len=" + this.f44017t.length();
                }
            }

            public w6(QJ qj, JsonAdapter jsonAdapter, String str, kotlin.coroutines.Continuation continuation) {
                this.f44003n = qj;
                this.rl = jsonAdapter;
                this.f44004t = str;
                this.nr = continuation;
            }

            public final void n(Task task) {
                Object objM313constructorimpl;
                Object obj;
                Object objM313constructorimpl2;
                Object objM313constructorimpl3;
                Object objM313constructorimpl4;
                Object objM313constructorimpl5;
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f44003n, new C0606j(this.f44004t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        kotlin.coroutines.Continuation continuation = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl6)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl6) ? null : objM313constructorimpl6;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl3 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl6);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl);
                            objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl));
                        }
                        continuation.resumeWith(objM313constructorimpl3);
                        return;
                    }
                    XoT.C.Uo(this.f44003n, new n(this.f44004t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f44003n, new C0607w6(this.f44004t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    QJ qj = this.f44003n;
                    String str = this.f44004t;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new Ml(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f44003n, new Wre(this.f44004t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            kotlin.coroutines.Continuation continuation2 = this.nr;
                            if (Result.m320isSuccessimpl(objM313constructorimpl7)) {
                                obj = Result.m319isFailureimpl(objM313constructorimpl7) ? null : objM313constructorimpl7;
                                Intrinsics.checkNotNull(obj);
                                objM313constructorimpl5 = Result.m313constructorimpl(obj);
                            } else {
                                Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl7);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl2);
                                objM313constructorimpl5 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl2));
                            }
                            continuation2.resumeWith(objM313constructorimpl5);
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f44003n, new I28(this.f44004t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        kotlin.coroutines.Continuation continuation3 = this.nr;
                        if (Result.m320isSuccessimpl(objM313constructorimpl8)) {
                            obj = Result.m319isFailureimpl(objM313constructorimpl8) ? null : objM313constructorimpl8;
                            Intrinsics.checkNotNull(obj);
                            objM313constructorimpl4 = Result.m313constructorimpl(obj);
                        } else {
                            Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl8);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl3);
                            objM313constructorimpl4 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl3));
                        }
                        continuation3.resumeWith(objM313constructorimpl4);
                        return;
                    }
                }
                XoT.C.Uo(this.f44003n, new CN3(this.f44004t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    kotlin.coroutines.Continuation continuation4 = this.nr;
                    if (Result.m320isSuccessimpl(objM313constructorimpl9)) {
                        obj = Result.m319isFailureimpl(objM313constructorimpl9) ? null : objM313constructorimpl9;
                        Intrinsics.checkNotNull(obj);
                        objM313constructorimpl2 = Result.m313constructorimpl(obj);
                    } else {
                        Throwable thM316exceptionOrNullimpl4 = Result.m316exceptionOrNullimpl(objM313constructorimpl9);
                        Intrinsics.checkNotNull(thM316exceptionOrNullimpl4);
                        objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl4));
                    }
                    continuation4.resumeWith(objM313constructorimpl2);
                    return;
                }
                Result.Companion companion4 = Result.INSTANCE;
                Object objM313constructorimpl10 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                kotlin.coroutines.Continuation continuation5 = this.nr;
                if (Result.m320isSuccessimpl(objM313constructorimpl10)) {
                    obj = Result.m319isFailureimpl(objM313constructorimpl10) ? null : objM313constructorimpl10;
                    Intrinsics.checkNotNull(obj);
                    objM313constructorimpl = Result.m313constructorimpl(obj);
                } else {
                    Throwable thM316exceptionOrNullimpl5 = Result.m316exceptionOrNullimpl(objM313constructorimpl10);
                    Intrinsics.checkNotNull(thM316exceptionOrNullimpl5);
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl5));
                }
                continuation5.resumeWith(objM313constructorimpl);
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation create(Object obj, kotlin.coroutines.Continuation continuation) {
            j jVar = new j(this.f43998r, this.f43997o, continuation);
            jVar.J2 = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.Continuation continuation) {
            return ((j) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, QJ qj, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f43998r = str;
            this.f43997o = qj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43995O;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.J2;
            XoT.C.KN("FFunc", new C0605j(this.f43998r));
            QJ qj = this.f43997o;
            String str = this.f43998r;
            this.J2 = obj2;
            this.f43996n = qj;
            this.f43999t = str;
            this.f43995O = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            JsonAdapter jsonAdapterAdapter = Lu.n().adapter(AccountStatusRequest.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter);
            String json = jsonAdapterAdapter.toJson(obj2);
            Intrinsics.checkNotNull(json);
            XoT.C.Uo(qj, new n(str, json));
            qj.rl(new JSONObject(json)).continueWith(new w6(qj, Lu.n().adapter(AccountStatusResponse.class), str, safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            return orThrow;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ QJ E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44018O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f44019S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f44020Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f44021g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44022n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f44023o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44024r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44025t;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class I28 implements Continuation {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f44026O;
            final /* synthetic */ String Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f44027n;
            final /* synthetic */ Ref.ObjectRef nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44028t;

            public static final class C implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44029O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44030n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44031t;

                public C(String str, Object obj, List list) {
                    this.f44030n = str;
                    this.f44031t = obj;
                    this.f44029O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44030n + " (success=" + Result.m320isSuccessimpl(this.f44031t) + "; continuations=" + this.f44029O.size() + ")";
                }
            }

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f44032O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44033n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f44034t;

                public CN3(String str, int i2, String str2) {
                    this.f44033n = str;
                    this.f44034t = i2;
                    this.f44032O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44033n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f44034t), 4, (char) 0, 2, (Object) null) + ": " + this.f44032O;
                }
            }

            public static final class Dsr implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44035O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44036n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44037t;

                public Dsr(String str, Object obj, List list) {
                    this.f44036n = str;
                    this.f44037t = obj;
                    this.f44035O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44036n + " (success=" + Result.m320isSuccessimpl(this.f44037t) + "; continuations=" + this.f44035O.size() + ")";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$n$I28$I28, reason: collision with other inner class name */
            public static final class C0608I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44038n;

                public C0608I28(String str) {
                    this.f44038n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44038n + ": SUCCESS";
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44039n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f44040t;

                public Ml(String str, Task task) {
                    this.f44039n = str;
                    this.f44040t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f44039n;
                    Task task = this.f44040t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f44040t.isCanceled();
                    boolean zIsComplete = this.f44040t.isComplete();
                    Exception exception = this.f44040t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44041n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f44042t;

                public Wre(String str, String str2) {
                    this.f44041n = str;
                    this.f44042t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44041n + ": RESPONSE: len=" + this.f44042t.length();
                }
            }

            public static final class aC implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44043n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44044t;

                public aC(String str, Object obj) {
                    this.f44043n = str;
                    this.f44044t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44043n + ": RESULT: " + this.f44044t;
                }
            }

            public static final class fuX implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44045n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f44046t;

                public fuX(String str, Throwable th) {
                    this.f44045n = str;
                    this.f44046t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44045n + ": Parse error! " + this.f44046t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44047n;

                public j(String str) {
                    this.f44047n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44047n + ": FAIL";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$n$I28$n, reason: collision with other inner class name */
            public static final class C0609n implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44048O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44049n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44050t;

                public C0609n(String str, Object obj, List list) {
                    this.f44049n = str;
                    this.f44050t = obj;
                    this.f44048O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44049n + " (success=" + Result.m320isSuccessimpl(this.f44050t) + "; continuations=" + this.f44048O.size() + ")";
                }
            }

            public static final class o implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44051O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44052n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44053t;

                public o(String str, Object obj, List list) {
                    this.f44052n = str;
                    this.f44053t = obj;
                    this.f44051O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44052n + " (success=" + Result.m320isSuccessimpl(this.f44053t) + "; continuations=" + this.f44051O.size() + ")";
                }
            }

            public static final class w6 implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44054O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44055n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44056t;

                public w6(String str, Object obj, List list) {
                    this.f44055n = str;
                    this.f44056t = obj;
                    this.f44054O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44055n + " (success=" + Result.m320isSuccessimpl(this.f44056t) + "; continuations=" + this.f44054O.size() + ")";
                }
            }

            public I28(QJ qj, JsonAdapter jsonAdapter, String str, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, List list, String str2) {
                this.f44027n = qj;
                this.rl = jsonAdapter;
                this.f44028t = str;
                this.nr = objectRef;
                this.f44026O = objectRef2;
                this.J2 = list;
                this.Uo = str2;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v19, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v24, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.ArrayList] */
            public final void n(Task task) {
                Object objM313constructorimpl;
                Object objM313constructorimpl2;
                Object objM313constructorimpl3;
                Object objM313constructorimpl4;
                Object objM313constructorimpl5;
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f44027n, new Ml(this.f44028t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        XoT.C.KN("FFuncPool", new o(this.Uo, objM313constructorimpl6, this.J2));
                        this.nr.element = null;
                        this.f44026O.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation : this.J2) {
                            if (Result.m320isSuccessimpl(objM313constructorimpl6)) {
                                Object obj = Result.m319isFailureimpl(objM313constructorimpl6) ? null : objM313constructorimpl6;
                                Intrinsics.checkNotNull(obj);
                                objM313constructorimpl3 = Result.m313constructorimpl(obj);
                            } else {
                                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl6);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl);
                                objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl));
                            }
                            continuation.resumeWith(objM313constructorimpl3);
                        }
                        return;
                    }
                    XoT.C.Uo(this.f44027n, new C0608I28(this.f44028t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f44027n, new Wre(this.f44028t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    QJ qj = this.f44027n;
                    String str = this.f44028t;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new CN3(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f44027n, new aC(this.f44028t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            XoT.C.KN("FFuncPool", new C(this.Uo, objM313constructorimpl7, this.J2));
                            this.nr.element = null;
                            this.f44026O.element = new ArrayList();
                            for (kotlin.coroutines.Continuation continuation2 : this.J2) {
                                if (Result.m320isSuccessimpl(objM313constructorimpl7)) {
                                    Object obj3 = Result.m319isFailureimpl(objM313constructorimpl7) ? null : objM313constructorimpl7;
                                    Intrinsics.checkNotNull(obj3);
                                    objM313constructorimpl5 = Result.m313constructorimpl(obj3);
                                } else {
                                    Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl7);
                                    Intrinsics.checkNotNull(thM316exceptionOrNullimpl2);
                                    objM313constructorimpl5 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl2));
                                }
                                continuation2.resumeWith(objM313constructorimpl5);
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f44027n, new fuX(this.f44028t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        XoT.C.KN("FFuncPool", new Dsr(this.Uo, objM313constructorimpl8, this.J2));
                        this.nr.element = null;
                        this.f44026O.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation3 : this.J2) {
                            if (Result.m320isSuccessimpl(objM313constructorimpl8)) {
                                Object obj4 = Result.m319isFailureimpl(objM313constructorimpl8) ? null : objM313constructorimpl8;
                                Intrinsics.checkNotNull(obj4);
                                objM313constructorimpl4 = Result.m313constructorimpl(obj4);
                            } else {
                                Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl8);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl3);
                                objM313constructorimpl4 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl3));
                            }
                            continuation3.resumeWith(objM313constructorimpl4);
                        }
                        return;
                    }
                }
                XoT.C.Uo(this.f44027n, new j(this.f44028t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    XoT.C.KN("FFuncPool", new C0609n(this.Uo, objM313constructorimpl9, this.J2));
                    this.nr.element = null;
                    this.f44026O.element = new ArrayList();
                    for (kotlin.coroutines.Continuation continuation4 : this.J2) {
                        if (Result.m320isSuccessimpl(objM313constructorimpl9)) {
                            Object obj5 = Result.m319isFailureimpl(objM313constructorimpl9) ? null : objM313constructorimpl9;
                            Intrinsics.checkNotNull(obj5);
                            objM313constructorimpl2 = Result.m313constructorimpl(obj5);
                        } else {
                            Throwable thM316exceptionOrNullimpl4 = Result.m316exceptionOrNullimpl(objM313constructorimpl9);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl4);
                            objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl4));
                        }
                        continuation4.resumeWith(objM313constructorimpl2);
                    }
                    return;
                }
                Result.Companion companion4 = Result.INSTANCE;
                Object objM313constructorimpl10 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                XoT.C.KN("FFuncPool", new w6(this.Uo, objM313constructorimpl10, this.J2));
                this.nr.element = null;
                this.f44026O.element = new ArrayList();
                for (kotlin.coroutines.Continuation continuation5 : this.J2) {
                    if (Result.m320isSuccessimpl(objM313constructorimpl10)) {
                        Object obj6 = Result.m319isFailureimpl(objM313constructorimpl10) ? null : objM313constructorimpl10;
                        Intrinsics.checkNotNull(obj6);
                        objM313constructorimpl = Result.m313constructorimpl(obj6);
                    } else {
                        Throwable thM316exceptionOrNullimpl5 = Result.m316exceptionOrNullimpl(objM313constructorimpl10);
                        Intrinsics.checkNotNull(thM316exceptionOrNullimpl5);
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl5));
                    }
                    continuation5.resumeWith(objM313constructorimpl);
                }
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44057n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44058t;

            public Ml(String str, String str2) {
                this.f44057n = str;
                this.f44058t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f44057n + ": IN / " + this.f44058t;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Wre implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Throwable f44059n;

            public Wre(Throwable th) {
                this.f44059n = th;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Failed: " + this.f44059n.getMessage();
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44060n;

            public j(String str) {
                this.f44060n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Pooling: " + this.f44060n;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$n$n, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class C0610n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44061n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f44062t;

            public C0610n(String str, Ref.ObjectRef objectRef) {
                this.f44061n = str;
                this.f44062t = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Pooled: " + this.f44061n + " (" + ((List) this.f44062t.element).size() + ")";
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class w6 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44063n;

            public w6(String str) {
                this.f44063n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Calling: " + this.f44063n;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation create(Object obj, kotlin.coroutines.Continuation continuation) {
            n nVar = new n(this.f44020Z, this.f44019S, this.f44021g, this.E2, continuation);
            nVar.f44023o = obj;
            return nVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.Iterable, java.util.List] */
        /* JADX WARN: Type inference failed for: r15v1, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44024r;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r15 = this.f44023o;
                T t3 = this.f44020Z.element;
                String str = YmsTEL.uIERMzb;
                if (t3 == 0 || !Intrinsics.areEqual(t3, (Object) r15)) {
                    XoT.C.KN(str, new w6(this.f44019S));
                    Ref.ObjectRef objectRef = this.f44020Z;
                    Ref.ObjectRef objectRef2 = this.f44021g;
                    QJ qj = this.E2;
                    String str2 = this.f44019S;
                    this.f44023o = r15;
                    this.f44022n = objectRef;
                    this.f44025t = objectRef2;
                    this.f44018O = qj;
                    this.J2 = str2;
                    this.f44024r = 2;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    ?? MutableListOf = CollectionsKt.mutableListOf(safeContinuation);
                    objectRef.element = r15;
                    objectRef2.element = MutableListOf;
                    try {
                        JsonAdapter jsonAdapterAdapter = Lu.n().adapter(SKUInfoRequest.class);
                        Intrinsics.checkNotNull(jsonAdapterAdapter);
                        String json = jsonAdapterAdapter.toJson(r15);
                        Intrinsics.checkNotNull(json);
                        XoT.C.Uo(qj, new Ml(str2, json));
                        qj.rl(new JSONObject(json)).continueWith(new I28(qj, Lu.n().adapter(SKUInfoResponse.class), str2, objectRef, objectRef2, MutableListOf, str2));
                    } catch (Throwable th) {
                        XoT.C.KN(str, new Wre(th));
                        objectRef.element = null;
                        objectRef2.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation : MutableListOf) {
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
                        }
                    }
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    XoT.C.KN(str, new j(this.f44019S));
                    Ref.ObjectRef objectRef3 = this.f44021g;
                    String str3 = this.f44019S;
                    this.f44023o = objectRef3;
                    this.f44022n = str3;
                    this.f44024r = 1;
                    SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    ((List) objectRef3.element).add(safeContinuation2);
                    XoT.C.KN(str, new C0610n(str3, objectRef3));
                    Object orThrow = safeContinuation2.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (orThrow != coroutine_suspended) {
                        return orThrow;
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.Continuation continuation) {
            return ((n) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, String str, Ref.ObjectRef objectRef2, QJ qj, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f44020Z = objectRef;
            this.f44019S = str;
            this.f44021g = objectRef2;
            this.E2 = qj;
        }
    }

    public static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ QJ E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44064O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f44065S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f44066Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f44067g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44068n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f44069o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44070r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44071t;

        public static final class I28 implements Continuation {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f44072O;
            final /* synthetic */ String Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f44073n;
            final /* synthetic */ Ref.ObjectRef nr;
            final /* synthetic */ JsonAdapter rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44074t;

            public static final class C implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44075O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44076n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44077t;

                public C(String str, Object obj, List list) {
                    this.f44076n = str;
                    this.f44077t = obj;
                    this.f44075O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44076n + " (success=" + Result.m320isSuccessimpl(this.f44077t) + "; continuations=" + this.f44075O.size() + ")";
                }
            }

            public static final class CN3 implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ String f44078O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44079n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f44080t;

                public CN3(String str, int i2, String str2) {
                    this.f44079n = str;
                    this.f44080t = i2;
                    this.f44078O = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44079n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f44080t), 4, (char) 0, 2, (Object) null) + ": " + this.f44078O;
                }
            }

            public static final class Dsr implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44081O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44082n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44083t;

                public Dsr(String str, Object obj, List list) {
                    this.f44082n = str;
                    this.f44083t = obj;
                    this.f44081O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44082n + " (success=" + Result.m320isSuccessimpl(this.f44083t) + "; continuations=" + this.f44081O.size() + ")";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$w6$I28$I28, reason: collision with other inner class name */
            public static final class C0611I28 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44084n;

                public C0611I28(String str) {
                    this.f44084n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44084n + ": SUCCESS";
                }
            }

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44085n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Task f44086t;

                public Ml(String str, Task task) {
                    this.f44085n = str;
                    this.f44086t = task;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String message;
                    String str = this.f44085n;
                    Task task = this.f44086t;
                    boolean zIsSuccessful = task.isSuccessful();
                    boolean zIsCanceled = this.f44086t.isCanceled();
                    boolean zIsComplete = this.f44086t.isComplete();
                    Exception exception = this.f44086t.getException();
                    if (exception == null || (message = exception.getMessage()) == null) {
                        message = "NONE";
                    }
                    return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                }
            }

            public static final class Wre implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44087n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f44088t;

                public Wre(String str, String str2) {
                    this.f44087n = str;
                    this.f44088t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44087n + ": RESPONSE: len=" + this.f44088t.length();
                }
            }

            public static final class aC implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44089n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44090t;

                public aC(String str, Object obj) {
                    this.f44089n = str;
                    this.f44090t = obj;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44089n + ": RESULT: " + this.f44090t;
                }
            }

            public static final class fuX implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44091n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f44092t;

                public fuX(String str, Throwable th) {
                    this.f44091n = str;
                    this.f44092t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44091n + ": Parse error! " + this.f44092t;
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44093n;

                public j(String str) {
                    this.f44093n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f44093n + ": FAIL";
                }
            }

            public static final class n implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44094O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44095n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44096t;

                public n(String str, Object obj, List list) {
                    this.f44095n = str;
                    this.f44096t = obj;
                    this.f44094O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44095n + " (success=" + Result.m320isSuccessimpl(this.f44096t) + "; continuations=" + this.f44094O.size() + ")";
                }
            }

            public static final class o implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44097O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44098n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44099t;

                public o(String str, Object obj, List list) {
                    this.f44098n = str;
                    this.f44099t = obj;
                    this.f44097O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44098n + " (success=" + Result.m320isSuccessimpl(this.f44099t) + "; continuations=" + this.f44097O.size() + ")";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$w6$I28$w6, reason: collision with other inner class name */
            public static final class C0612w6 implements Function0 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ List f44100O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f44101n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f44102t;

                public C0612w6(String str, Object obj, List list) {
                    this.f44101n = str;
                    this.f44102t = obj;
                    this.f44100O = list;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FFuncPool/Completed: " + this.f44101n + " (success=" + Result.m320isSuccessimpl(this.f44102t) + "; continuations=" + this.f44100O.size() + ")";
                }
            }

            public I28(QJ qj, JsonAdapter jsonAdapter, String str, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, List list, String str2) {
                this.f44073n = qj;
                this.rl = jsonAdapter;
                this.f44074t = str;
                this.nr = objectRef;
                this.f44072O = objectRef2;
                this.J2 = list;
                this.Uo = str2;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v19, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v24, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.ArrayList] */
            public final void n(Task task) {
                Object objM313constructorimpl;
                Object objM313constructorimpl2;
                Object objM313constructorimpl3;
                Object objM313constructorimpl4;
                Object objM313constructorimpl5;
                Intrinsics.checkNotNullParameter(task, "task");
                XoT.C.Uo(this.f44073n, new Ml(this.f44074t, task));
                if (task.isSuccessful()) {
                    l3D l3d = (l3D) task.getResult();
                    if (l3d == null) {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM313constructorimpl6 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                        XoT.C.KN("FFuncPool", new o(this.Uo, objM313constructorimpl6, this.J2));
                        this.nr.element = null;
                        this.f44072O.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation : this.J2) {
                            if (Result.m320isSuccessimpl(objM313constructorimpl6)) {
                                Object obj = Result.m319isFailureimpl(objM313constructorimpl6) ? null : objM313constructorimpl6;
                                Intrinsics.checkNotNull(obj);
                                objM313constructorimpl3 = Result.m313constructorimpl(obj);
                            } else {
                                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl6);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl);
                                objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl));
                            }
                            continuation.resumeWith(objM313constructorimpl3);
                        }
                        return;
                    }
                    XoT.C.Uo(this.f44073n, new C0611I28(this.f44074t));
                    Moshi moshiN = Lu.n();
                    Object obj2 = l3d.f70669n;
                    JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                    Intrinsics.checkNotNull(jsonAdapterAdapter);
                    JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                    Intrinsics.checkNotNull(jsonAdapterIndent);
                    String json = jsonAdapterIndent.toJson(obj2);
                    Intrinsics.checkNotNull(json);
                    XoT.C.Uo(this.f44073n, new Wre(this.f44074t, json));
                    Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                    QJ qj = this.f44073n;
                    String str = this.f44074t;
                    int i2 = 0;
                    for (String str2 : sequenceLineSequence) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        XoT.C.Uo(qj, new CN3(str, i2, str2));
                        i2 = i3;
                    }
                    try {
                        Object objFromJson = this.rl.fromJson(json);
                        XoT.C.Uo(this.f44073n, new aC(this.f44074t, objFromJson));
                        if (objFromJson != null) {
                            Object objM313constructorimpl7 = Result.m313constructorimpl(objFromJson);
                            XoT.C.KN("FFuncPool", new C(this.Uo, objM313constructorimpl7, this.J2));
                            this.nr.element = null;
                            this.f44072O.element = new ArrayList();
                            for (kotlin.coroutines.Continuation continuation2 : this.J2) {
                                if (Result.m320isSuccessimpl(objM313constructorimpl7)) {
                                    Object obj3 = Result.m319isFailureimpl(objM313constructorimpl7) ? null : objM313constructorimpl7;
                                    Intrinsics.checkNotNull(obj3);
                                    objM313constructorimpl5 = Result.m313constructorimpl(obj3);
                                } else {
                                    Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl7);
                                    Intrinsics.checkNotNull(thM316exceptionOrNullimpl2);
                                    objM313constructorimpl5 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl2));
                                }
                                continuation2.resumeWith(objM313constructorimpl5);
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        XoT.C.Uo(this.f44073n, new fuX(this.f44074t, th));
                        Result.Companion companion2 = Result.INSTANCE;
                        Object objM313constructorimpl8 = Result.m313constructorimpl(ResultKt.createFailure(th));
                        XoT.C.KN("FFuncPool", new Dsr(this.Uo, objM313constructorimpl8, this.J2));
                        this.nr.element = null;
                        this.f44072O.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation3 : this.J2) {
                            if (Result.m320isSuccessimpl(objM313constructorimpl8)) {
                                Object obj4 = Result.m319isFailureimpl(objM313constructorimpl8) ? null : objM313constructorimpl8;
                                Intrinsics.checkNotNull(obj4);
                                objM313constructorimpl4 = Result.m313constructorimpl(obj4);
                            } else {
                                Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl8);
                                Intrinsics.checkNotNull(thM316exceptionOrNullimpl3);
                                objM313constructorimpl4 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl3));
                            }
                            continuation3.resumeWith(objM313constructorimpl4);
                        }
                        return;
                    }
                }
                XoT.C.Uo(this.f44073n, new j(this.f44074t));
                Exception exception = task.getException();
                if (exception != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Object objM313constructorimpl9 = Result.m313constructorimpl(ResultKt.createFailure(exception));
                    XoT.C.KN("FFuncPool", new n(this.Uo, objM313constructorimpl9, this.J2));
                    this.nr.element = null;
                    this.f44072O.element = new ArrayList();
                    for (kotlin.coroutines.Continuation continuation4 : this.J2) {
                        if (Result.m320isSuccessimpl(objM313constructorimpl9)) {
                            Object obj5 = Result.m319isFailureimpl(objM313constructorimpl9) ? null : objM313constructorimpl9;
                            Intrinsics.checkNotNull(obj5);
                            objM313constructorimpl2 = Result.m313constructorimpl(obj5);
                        } else {
                            Throwable thM316exceptionOrNullimpl4 = Result.m316exceptionOrNullimpl(objM313constructorimpl9);
                            Intrinsics.checkNotNull(thM316exceptionOrNullimpl4);
                            objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl4));
                        }
                        continuation4.resumeWith(objM313constructorimpl2);
                    }
                    return;
                }
                Result.Companion companion4 = Result.INSTANCE;
                Object objM313constructorimpl10 = Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")));
                XoT.C.KN("FFuncPool", new C0612w6(this.Uo, objM313constructorimpl10, this.J2));
                this.nr.element = null;
                this.f44072O.element = new ArrayList();
                for (kotlin.coroutines.Continuation continuation5 : this.J2) {
                    if (Result.m320isSuccessimpl(objM313constructorimpl10)) {
                        Object obj6 = Result.m319isFailureimpl(objM313constructorimpl10) ? null : objM313constructorimpl10;
                        Intrinsics.checkNotNull(obj6);
                        objM313constructorimpl = Result.m313constructorimpl(obj6);
                    } else {
                        Throwable thM316exceptionOrNullimpl5 = Result.m316exceptionOrNullimpl(objM313constructorimpl10);
                        Intrinsics.checkNotNull(thM316exceptionOrNullimpl5);
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(thM316exceptionOrNullimpl5));
                    }
                    continuation5.resumeWith(objM313constructorimpl);
                }
            }

            @Override // com.google.android.gms.tasks.Continuation
            public /* bridge */ /* synthetic */ Object then(Task task) {
                n(task);
                return Unit.INSTANCE;
            }
        }

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44103n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f44104t;

            public Ml(String str, String str2) {
                this.f44103n = str;
                this.f44104t = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "typedCall:" + this.f44103n + ": IN / " + this.f44104t;
            }
        }

        public static final class Wre implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Throwable f44105n;

            public Wre(Throwable th) {
                this.f44105n = th;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Failed: " + this.f44105n.getMessage();
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44106n;

            public j(String str) {
                this.f44106n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Pooling: " + this.f44106n;
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44107n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f44108t;

            public n(String str, Ref.ObjectRef objectRef) {
                this.f44107n = str;
                this.f44108t = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Pooled: " + this.f44107n + " (" + ((List) this.f44108t.element).size() + ")";
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.account.IAPBackend$w6$w6, reason: collision with other inner class name */
        public static final class C0613w6 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f44109n;

            public C0613w6(String str) {
                this.f44109n = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FFuncPool/Calling: " + this.f44109n;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation create(Object obj, kotlin.coroutines.Continuation continuation) {
            w6 w6Var = new w6(this.f44066Z, this.f44065S, this.f44067g, this.E2, continuation);
            w6Var.f44069o = obj;
            return w6Var;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.Iterable, java.util.List] */
        /* JADX WARN: Type inference failed for: r15v1, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44070r;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r15 = this.f44069o;
                T t3 = this.f44066Z.element;
                if (t3 == 0 || !Intrinsics.areEqual(t3, (Object) r15)) {
                    XoT.C.KN("FFuncPool", new C0613w6(this.f44065S));
                    Ref.ObjectRef objectRef = this.f44066Z;
                    Ref.ObjectRef objectRef2 = this.f44067g;
                    QJ qj = this.E2;
                    String str = this.f44065S;
                    this.f44069o = r15;
                    this.f44068n = objectRef;
                    this.f44071t = objectRef2;
                    this.f44064O = qj;
                    this.J2 = str;
                    this.f44070r = 2;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    ?? MutableListOf = CollectionsKt.mutableListOf(safeContinuation);
                    objectRef.element = r15;
                    objectRef2.element = MutableListOf;
                    try {
                        JsonAdapter jsonAdapterAdapter = Lu.n().adapter(UserSessionBeginRequest.class);
                        Intrinsics.checkNotNull(jsonAdapterAdapter);
                        String json = jsonAdapterAdapter.toJson(r15);
                        Intrinsics.checkNotNull(json);
                        XoT.C.Uo(qj, new Ml(str, json));
                        qj.rl(new JSONObject(json)).continueWith(new I28(qj, Lu.n().adapter(UserSessionBeginResponse.class), str, objectRef, objectRef2, MutableListOf, str));
                    } catch (Throwable th) {
                        XoT.C.KN("FFuncPool", new Wre(th));
                        objectRef.element = null;
                        objectRef2.element = new ArrayList();
                        for (kotlin.coroutines.Continuation continuation : MutableListOf) {
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
                        }
                    }
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    XoT.C.KN("FFuncPool", new j(this.f44065S));
                    Ref.ObjectRef objectRef3 = this.f44067g;
                    String str2 = this.f44065S;
                    this.f44069o = objectRef3;
                    this.f44068n = str2;
                    this.f44070r = 1;
                    SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(this));
                    ((List) objectRef3.element).add(safeContinuation2);
                    XoT.C.KN("FFuncPool", new n(str2, objectRef3));
                    Object orThrow = safeContinuation2.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (orThrow != coroutine_suspended) {
                        return orThrow;
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.Continuation continuation) {
            return ((w6) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Ref.ObjectRef objectRef, String str, Ref.ObjectRef objectRef2, QJ qj, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f44066Z = objectRef;
            this.f44065S = str;
            this.f44067g = objectRef2;
            this.E2 = qj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 getAccountStatusAndLicenses_delegate$lambda$1() {
        return new j("getAccountStatusAndLicenses", com.google.firebase.functions.n.mUb.t().ck("getAccountStatusAndLicenses"), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    public static final Function2 getIAPSkus_delegate$lambda$0() {
        XoT.C.KN("FFuncPool", new wQ.I28("getIAPSkus"));
        QJ qjCk = com.google.firebase.functions.n.mUb.t().ck("getIAPSkus");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ArrayList();
        return new n(objectRef, "getIAPSkus", objectRef2, qjCk, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    public static final Function2 userSessionBegan_delegate$lambda$3() {
        XoT.C.KN("FFuncPool", new wQ.I28("userSessionBegan"));
        QJ qjCk = com.google.firebase.functions.n.mUb.t().ck("userSessionBegan");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ArrayList();
        return new w6(objectRef, "userSessionBegan", objectRef2, qjCk, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 verifyPurchase_delegate$lambda$2() {
        return new Ml("verifyPurchase", com.google.firebase.functions.n.mUb.t().ck("verifyPurchase"), null);
    }

    public final Function2<AccountStatusRequest, kotlin.coroutines.Continuation<? super AccountStatusResponse>, Object> getGetAccountStatusAndLicenses() {
        return (Function2) this.getAccountStatusAndLicenses.getValue();
    }

    public final Function2<SKUInfoRequest, kotlin.coroutines.Continuation<? super SKUInfoResponse>, Object> getGetIAPSkus() {
        return (Function2) this.getIAPSkus.getValue();
    }

    public final Function2<UserSessionBeginRequest, kotlin.coroutines.Continuation<? super UserSessionBeginResponse>, Object> getUserSessionBegan() {
        return (Function2) this.userSessionBegan.getValue();
    }

    public final Function2<VerifyPurchaseRequest, kotlin.coroutines.Continuation<? super VerifyPurchaseResponse>, Object> getVerifyPurchase() {
        return (Function2) this.verifyPurchase.getValue();
    }
}
