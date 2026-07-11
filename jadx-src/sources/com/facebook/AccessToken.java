package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.facebook.Z;
import com.facebook.internal.Lu;
import com.facebook.internal.vd;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b \u0018\u0000 S2\u00020\u0001:\u0002TUB\u008b\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010)J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b;\u0010:R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b<\u0010:R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0017R\u0017\u0010E\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010\u0017R\u0011\u0010R\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006V"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lcom/facebook/CN3;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/CN3;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "ck", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/StringBuilder;)V", "tokenSource", "rl", "(Lcom/facebook/CN3;Ljava/lang/String;)Lcom/facebook/CN3;", "toString", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "HI", "()Lorg/json/JSONObject;", "describeContents", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Date;", "Uo", "()Ljava/util/Date;", "expires", "", "t", "Ljava/util/Set;", "mUb", "()Ljava/util/Set;", "O", "J2", "r", "Ljava/lang/String;", "qie", "token", "o", "Lcom/facebook/CN3;", "gh", "()Lcom/facebook/CN3;", "source", "Z", "xMQ", "lastRefresh", "S", "g", "az", "E2", "nr", "e", "KN", "ty", "()Z", "isExpired", "X", "j", "w6", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessToken implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Date f52079N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Date f52080T;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CN3 Xw;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Date f52082v;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public final Date dataAccessExpirationTime;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public final Set expiredPermissions;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final Set declinedPermissions;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final String applicationId;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public final Date lastRefresh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String graphDomain;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String userId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Date expires;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final CN3 source;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Set permissions;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CN3.values().length];
            try {
                iArr[CN3.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CN3.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CN3.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public interface j {
        void n(FacebookException facebookException);

        void rl(AccessToken accessToken);
    }

    public static final class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i2) {
            return new AccessToken[i2];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$w6, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final List J2(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n            Collection…Permissions))\n          }");
            return listUnmodifiableList;
        }

        public final void KN(AccessToken accessToken) {
            Wre.J2.O().r(accessToken);
        }

        public final AccessToken O() {
            return Wre.J2.O().xMQ();
        }

        public final boolean Uo() {
            AccessToken accessTokenXMQ = Wre.J2.O().xMQ();
            return (accessTokenXMQ == null || accessTokenXMQ.ty()) ? false : true;
        }

        public final AccessToken n(AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        public final void nr() {
            AccessToken accessTokenXMQ = Wre.J2.O().xMQ();
            if (accessTokenXMQ != null) {
                KN(n(accessTokenXMQ));
            }
        }

        public final AccessToken rl(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt(NodeModuleProcess.PROPERTY_VERSION) > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            CN3 cn3ValueOf = CN3.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List listK = vd.k(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, listK, vd.k(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : vd.k(jSONArrayOptJSONArray), cn3ValueOf, date, date2, date3, strOptString);
        }

        public final AccessToken t(Bundle bundle) {
            String string;
            AccessToken accessToken;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List listJ2 = J2(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List listJ22 = J2(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List listJ23 = J2(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            Z.j jVar = Z.f52226t;
            String strN = jVar.n(bundle);
            if (vd.I(strN)) {
                strN = s4.az();
            }
            String str = strN;
            String strJ2 = jVar.J2(bundle);
            if (strJ2 == null) {
                return null;
            }
            JSONObject jSONObjectJ2 = vd.J2(strJ2);
            if (jSONObjectJ2 != null) {
                try {
                    string = jSONObjectJ2.getString("id");
                    accessToken = null;
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
                accessToken = null;
            }
            if (str == null || string == null) {
                return accessToken;
            }
            return new AccessToken(strJ2, str, string, listJ2, listJ22, listJ23, jVar.O(bundle), jVar.t(bundle), jVar.nr(bundle), null, null, 1024, null);
        }
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, CN3 cn3, Date date, Date date2, Date date3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, cn3, date, date2, date3, (i2 & 1024) != 0 ? "facebook" : str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.permissions, accessToken.permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null ? str2 == null : Intrinsics.areEqual(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f52080T = date;
        f52079N = date;
        f52082v = new Date();
        Xw = CN3.FACEBOOK_APPLICATION_WEB;
        CREATOR = new n();
    }

    private final String ck() {
        return s4.T(Ew.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    private final void n(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append("]");
    }

    private final CN3 rl(CN3 tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i2 = Ml.$EnumSwitchMapping$0[tokenSource.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? tokenSource : CN3.INSTAGRAM_WEB_VIEW : CN3.INSTAGRAM_CUSTOM_CHROME_TAB : CN3.INSTAGRAM_APPLICATION_WEB;
    }

    public final JSONObject HI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put("last_refresh", this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put("application_id", this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put("data_access_expiration_time", this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final Set getExpiredPermissions() {
        return this.expiredPermissions;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Set getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final CN3 getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final Set getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(ck());
        n(sb);
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public final boolean ty() {
        return new Date().after(this.expires);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public AccessToken(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, CN3 cn3, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Lu.Uo(accessToken, "accessToken");
        Lu.Uo(applicationId, "applicationId");
        Lu.Uo(userId, "userId");
        this.expires = date == null ? f52079N : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.permissions = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.declinedPermissions = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = accessToken;
        this.source = rl(cn3 == null ? Xw : cn3, str);
        this.lastRefresh = date2 == null ? f52082v : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? f52079N : date3;
        this.graphDomain = str == null ? "facebook" : str;
    }

    public AccessToken(Parcel parcel) {
        CN3 cn3ValueOf;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = Lu.gh(parcel.readString(), "token");
        String string = parcel.readString();
        if (string != null) {
            cn3ValueOf = CN3.valueOf(string);
        } else {
            cn3ValueOf = Xw;
        }
        this.source = cn3ValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Lu.gh(parcel.readString(), "applicationId");
        this.userId = Lu.gh(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
