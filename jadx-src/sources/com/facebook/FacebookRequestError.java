package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.vd;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003TUVB\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0016\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\b-\u0010\"R(\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010F\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b/\u0010IR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010R\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bP\u00101\u001a\u0004\bQ\u0010\"¨\u0006W"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "requestStatusCode", "errorCode", "subErrorCode", "", "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", "", "batchRequestResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookException;", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "toString", "()Ljava/lang/String;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "J2", "t", "rl", "O", "Uo", "Ljava/lang/String;", "nr", "r", "getErrorUserTitle", "o", "getErrorUserMessage", "Z", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "S", "getRequestResult", "g", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "E2", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "e", "<set-?>", "X", "Lcom/facebook/FacebookException;", "()Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError$j;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/facebook/FacebookRequestError$j;", "getCategory", "()Lcom/facebook/FacebookRequestError$j;", "category", "N", "getErrorRecoveryMessage", "errorRecoveryMessage", "v", "j", "w6", "Ml", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public final String errorType;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public final String errorRecoveryMessage;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final int subErrorCode;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResult;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public final j category;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public FacebookException exception;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResultBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String errorMessage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Object batchRequestResult;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int requestStatusCode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final String errorUserMessage;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final String errorUserTitle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int errorCode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Ml Xw = new Ml(200, 299);

    @JvmField
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new n();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52177n;
        public final int rl;

        public final boolean n(int i2) {
            return i2 <= this.rl && this.f52177n <= i2;
        }

        public Ml(int i2, int i3) {
            this.f52177n = i2;
            this.rl = i3;
        }
    }

    public enum j {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public static final class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i2) {
            return new FacebookRequestError[i2];
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$w6, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized com.facebook.internal.aC rl() {
            com.facebook.internal.QJ qjJ2 = com.facebook.internal.UGc.J2(s4.az());
            if (qjJ2 == null) {
                return com.facebook.internal.aC.Uo.rl();
            }
            return qjJ2.Uo();
        }

        public Companion() {
        }

        public final FacebookRequestError n(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            String str;
            String strOptString;
            int iOptInt;
            String str2;
            Object obj2;
            boolean z2;
            String str3;
            String strOptString2;
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i2 = singleResult.getInt("code");
                    Object objXw = vd.Xw(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objXw == null || !(objXw instanceof JSONObject)) {
                        str = "body";
                    } else {
                        boolean z3 = true;
                        if (((JSONObject) objXw).has(MRAIDPresenter.ERROR)) {
                            JSONObject jSONObject = (JSONObject) vd.Xw((JSONObject) objXw, MRAIDPresenter.ERROR, null);
                            String strOptString3 = jSONObject != null ? jSONObject.optString("type", null) : null;
                            strOptString = jSONObject != null ? jSONObject.optString("message", null) : null;
                            int iOptInt2 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject != null ? jSONObject.optString("error_user_msg", null) : null;
                            String strOptString4 = jSONObject != null ? jSONObject.optString("error_user_title", null) : null;
                            boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("is_transient", false) : false;
                            str = "body";
                            iOptInt = iOptInt;
                            iOptInt = iOptInt2;
                            str2 = strOptString3;
                            obj2 = objXw;
                            str3 = strOptString4;
                            z2 = zOptBoolean;
                        } else if (((JSONObject) objXw).has("error_code") || ((JSONObject) objXw).has("error_msg") || ((JSONObject) objXw).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objXw).optString("error_reason", null);
                            strOptString = ((JSONObject) objXw).optString("error_msg", null);
                            iOptInt = ((JSONObject) objXw).optInt("error_code", -1);
                            str = "body";
                            iOptInt = ((JSONObject) objXw).optInt("error_subcode", -1);
                            str2 = strOptString5;
                            obj2 = objXw;
                            z2 = false;
                            str3 = null;
                            strOptString2 = null;
                        } else {
                            str = "body";
                            obj2 = objXw;
                            z3 = false;
                            z2 = false;
                            iOptInt = -1;
                            str2 = null;
                            str3 = null;
                            strOptString = null;
                            strOptString2 = null;
                        }
                        if (z3) {
                            return new FacebookRequestError(i2, iOptInt, iOptInt, str2, strOptString, str3, strOptString2, (JSONObject) obj2, singleResult, obj, httpURLConnection, null, z2, null);
                        }
                    }
                    if (!t().n(i2)) {
                        return new FacebookRequestError(i2, -1, -1, null, null, null, null, singleResult.has(str) ? (JSONObject) vd.Xw(singleResult, str, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final Ml t() {
            return FacebookRequestError.Xw;
        }
    }

    public /* synthetic */ FacebookRequestError(int i2, int i3, int i5, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final FacebookException getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String t() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + t() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(t());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public FacebookRequestError(int i2, int i3, int i5, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z2) {
        j jVarT;
        this.requestStatusCode = i2;
        this.errorCode = i3;
        this.subErrorCode = i5;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            jVarT = j.OTHER;
        } else {
            this.exception = new FacebookServiceException(this, t());
            jVarT = INSTANCE.rl().t(i3, i5, z2);
        }
        this.category = jVarT;
        this.errorRecoveryMessage = INSTANCE.rl().nr(jVarT);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
