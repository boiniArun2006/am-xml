package com.bendingspoons.monopoly.contracts;

import YV.o;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.monopoly.contracts.j;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.ErrorResponse;
import com.bendingspoons.oracle.models.LegalNotifications;
import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Products;
import com.bendingspoons.oracle.models.Settings;
import com.bendingspoons.oracle.models.User;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import d8q.jqQ.QTafcm;
import fE.l3D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import qcD.nehv.Apsps;
import qu.Dsr;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class OraclePurchaseVerifier implements gHt.j {
    private static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f51390t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f51391n;

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f51392O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f51393n;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51393n = obj;
            this.f51392O |= Integer.MIN_VALUE;
            return OraclePurchaseVerifier.this.n(null, this);
        }
    }

    public static final class Ml implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51395n;

        public Ml(Moshi moshi) {
            this.f51395n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51395n, Reflection.typeOf(ErrorResponse.class));
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Request;", "", "purchases", "", "Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Request$Purchase;", "<init>", "(Ljava/util/List;)V", "getPurchases", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Purchase", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 8;

        @Json(name = "purchases")
        private final List<Purchase> purchases;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        @StabilityInferred
        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Request$Purchase;", "", "orderId", "", "packageName", "productId", "purchaseTime", "", "purchaseToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getPackageName", "getProductId", "getPurchaseTime", "()J", "getPurchaseToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Purchase {
            public static final int $stable = 0;
            private final String orderId;
            private final String packageName;
            private final String productId;
            private final long purchaseTime;
            private final String purchaseToken;

            public static /* synthetic */ Purchase copy$default(Purchase purchase, String str, String str2, String str3, long j2, String str4, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = purchase.orderId;
                }
                if ((i2 & 2) != 0) {
                    str2 = purchase.packageName;
                }
                if ((i2 & 4) != 0) {
                    str3 = purchase.productId;
                }
                if ((i2 & 8) != 0) {
                    j2 = purchase.purchaseTime;
                }
                if ((i2 & 16) != 0) {
                    str4 = purchase.purchaseToken;
                }
                String str5 = str4;
                String str6 = str3;
                return purchase.copy(str, str2, str6, j2, str5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPackageName() {
                return this.packageName;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final long getPurchaseTime() {
                return this.purchaseTime;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getPurchaseToken() {
                return this.purchaseToken;
            }

            public final Purchase copy(String orderId, String packageName, String productId, long purchaseTime, String purchaseToken) {
                Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
                return new Purchase(orderId, packageName, productId, purchaseTime, purchaseToken);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Purchase)) {
                    return false;
                }
                Purchase purchase = (Purchase) other;
                return Intrinsics.areEqual(this.orderId, purchase.orderId) && Intrinsics.areEqual(this.packageName, purchase.packageName) && Intrinsics.areEqual(this.productId, purchase.productId) && this.purchaseTime == purchase.purchaseTime && Intrinsics.areEqual(this.purchaseToken, purchase.purchaseToken);
            }

            public int hashCode() {
                String str = this.orderId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.packageName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.productId;
                return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.purchaseTime)) * 31) + this.purchaseToken.hashCode();
            }

            public String toString() {
                return "Purchase(orderId=" + this.orderId + QTafcm.TeBoA + this.packageName + ", productId=" + this.productId + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ")";
            }

            public Purchase(String str, String str2, String str3, long j2, String purchaseToken) {
                Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
                this.orderId = str;
                this.packageName = str2;
                this.productId = str3;
                this.purchaseTime = j2;
                this.purchaseToken = purchaseToken;
            }

            public final String getOrderId() {
                return this.orderId;
            }

            public final String getPackageName() {
                return this.packageName;
            }

            public final String getProductId() {
                return this.productId;
            }

            public final long getPurchaseTime() {
                return this.purchaseTime;
            }

            public final String getPurchaseToken() {
                return this.purchaseToken;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = request.purchases;
            }
            return request.copy(list);
        }

        public final List<Purchase> component1() {
            return this.purchases;
        }

        public final Request copy(List<Purchase> purchases) {
            Intrinsics.checkNotNullParameter(purchases, "purchases");
            return new Request(purchases);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.areEqual(this.purchases, ((Request) other).purchases);
        }

        public int hashCode() {
            return this.purchases.hashCode();
        }

        public String toString() {
            return "Request(purchases=" + this.purchases + ")";
        }

        public Request(List<Purchase> purchases) {
            Intrinsics.checkNotNullParameter(purchases, "purchases");
            this.purchases = purchases;
        }

        public final List<Purchase> getPurchases() {
            return this.purchases;
        }
    }

    @StabilityInferred
    @Keep
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response;", "Lcom/bendingspoons/oracle/models/OracleResponse;", "transactions", "", "", "Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response$TransactionResponse;", "<init>", "(Ljava/util/Map;)V", "getTransactions", "()Ljava/util/Map;", "setTransactions", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "TransactionResponse", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Response extends OracleResponse {
        public static final int $stable = 8;
        private Map<String, TransactionResponse> transactions;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        @StabilityInferred
        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response$TransactionResponse;", "", "productId", "", "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response$TransactionResponse;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TransactionResponse {
            public static final int $stable = 8;
            private Integer errorCode;
            private String productId;

            public static /* synthetic */ TransactionResponse copy$default(TransactionResponse transactionResponse, String str, Integer num, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = transactionResponse.productId;
                }
                if ((i2 & 2) != 0) {
                    num = transactionResponse.errorCode;
                }
                return transactionResponse.copy(str, num);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final TransactionResponse copy(@Json(name = "product_id") String productId, @Json(name = "error_code") Integer errorCode) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                return new TransactionResponse(productId, errorCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TransactionResponse)) {
                    return false;
                }
                TransactionResponse transactionResponse = (TransactionResponse) other;
                return Intrinsics.areEqual(this.productId, transactionResponse.productId) && Intrinsics.areEqual(this.errorCode, transactionResponse.errorCode);
            }

            public int hashCode() {
                int iHashCode = this.productId.hashCode() * 31;
                Integer num = this.errorCode;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "TransactionResponse(productId=" + this.productId + ", errorCode=" + this.errorCode + ")";
            }

            public TransactionResponse(@Json(name = "product_id") String str, @Json(name = "error_code") Integer num) {
                Intrinsics.checkNotNullParameter(str, Apsps.rfyBSsunYNSULV);
                this.productId = str;
                this.errorCode = num;
            }

            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final String getProductId() {
                return this.productId;
            }

            public final void setErrorCode(Integer num) {
                this.errorCode = num;
            }

            public final void setProductId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.productId = str;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                map = response.transactions;
            }
            return response.copy(map);
        }

        public final Map<String, TransactionResponse> component1() {
            return this.transactions;
        }

        public final Response copy(Map<String, TransactionResponse> transactions) {
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            return new Response(transactions);
        }

        @Override // com.bendingspoons.oracle.models.OracleResponse
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.transactions, ((Response) other).transactions);
        }

        @Override // com.bendingspoons.oracle.models.OracleResponse
        public int hashCode() {
            return this.transactions.hashCode();
        }

        public String toString() {
            return "Response(transactions=" + this.transactions + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Response(Map<String, TransactionResponse> transactions) {
            super((Settings) null, (User) null, (Products) null, (String) null, (String) null, (String) null, (LegalNotifications) null, (String) null, 255, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            this.transactions = transactions;
        }

        public final Map<String, TransactionResponse> getTransactions() {
            return this.transactions;
        }

        public final void setTransactions(Map<String, TransactionResponse> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.transactions = map;
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51396n;

        public n(Moshi moshi) {
            this.f51396n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51396n, Reflection.typeOf(Request.class));
        }
    }

    public static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Moshi f51397n;

        public w6(Moshi moshi) {
            this.f51397n = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter invoke() {
            return _MoshiKotlinExtensionsKt.adapter(this.f51397n, Reflection.typeOf(Response.class));
        }
    }

    public OraclePurchaseVerifier(Dsr oracleService) {
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        this.f51391n = oracleService;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // gHt.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(List list, Continuation continuation) {
        I28 i28;
        ErrorResponse errorResponse;
        ErrorResponse errorResponse2;
        Integer errorCode;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f51392O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f51392O = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        I28 i282 = i28;
        Object objN = i282.f51393n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i282.f51392O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Dsr dsr = this.f51391n;
            OracleHttpRequestMethod oracleHttpRequestMethod = OracleHttpRequestMethod.POST;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                arrayList.add(new Request.Purchase(oVar.n(), oVar.rl(), oVar.t(), oVar.O(), oVar.J2()));
            }
            KPz.j jVar = new KPz.j("v2/purchases/verify/google", oracleHttpRequestMethod, null, null, new Request(arrayList), 12, null);
            et.I28 i283 = new et.I28(LazyKt.lazy(new n(zQ.j.n())));
            et.I28 i284 = new et.I28(LazyKt.lazy(new w6(zQ.j.n())));
            et.I28 i285 = new et.I28(LazyKt.lazy(new Ml(zQ.j.n())));
            i282.f51392O = 1;
            objN = Dsr.w6.n(dsr, jVar, i283, i284, i285, null, i282, 16, null);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        x0X.n nVar = (x0X.n) objN;
        if (!(nVar instanceof n.C1266n)) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Response response = (Response) ((n.w6) nVar).n();
            return new j.w6(l3D.rl(response), l3D.n(response));
        }
        NetworkError networkError = (NetworkError) ((n.C1266n) nVar).n();
        NetworkError.j jVar2 = networkError instanceof NetworkError.j ? (NetworkError.j) networkError : null;
        if (jVar2 != null && jVar2.rl() == 400 && (errorResponse2 = (ErrorResponse) jVar2.n()) != null && (errorCode = errorResponse2.getErrorCode()) != null && errorCode.intValue() == 128) {
            ErrorResponse errorResponse3 = (ErrorResponse) jVar2.n();
            String message = errorResponse3 != null ? errorResponse3.getMessage() : null;
            if (message == null) {
                message = "";
            }
            return new j.n(message, null, 2, null);
        }
        String strN = com.bendingspoons.networking.j.n(networkError);
        String strRl = com.bendingspoons.networking.j.rl(networkError);
        pq.Ml ml = new pq.Ml();
        if (jVar2 != null && (errorResponse = (ErrorResponse) jVar2.n()) != null) {
            Integer errorCode2 = errorResponse.getErrorCode();
            if (errorCode2 != null) {
                ml.nr("oracle_error_code", Boxing.boxInt(errorCode2.intValue()));
            }
            String message2 = errorResponse.getMessage();
            if (message2 != null) {
                ml.O("oracle_error_message", message2);
            }
            Integer httpCode = errorResponse.getHttpCode();
            if (httpCode != null) {
                ml.nr("http_code", Boxing.boxInt(httpCode.intValue()));
            }
        }
        Unit unit = Unit.INSTANCE;
        return new j.C0725j(strN, strRl, ml);
    }
}
