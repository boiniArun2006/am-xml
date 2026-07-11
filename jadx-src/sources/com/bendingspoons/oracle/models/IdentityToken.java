package com.bendingspoons.oracle.models;

import XA.Ml;
import XA.Xo;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import com.squareup.moshi.JsonClass;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u000bR\u0011\u0010\"\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/bendingspoons/oracle/models/IdentityToken;", "", "", "token", "Lcom/bendingspoons/oracle/models/IdentityToken$n;", "type", "Ljava/util/Date;", "expirationDate", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/oracle/models/IdentityToken$n;Ljava/util/Date;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/bendingspoons/oracle/models/IdentityToken$n;", "component3", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Lcom/bendingspoons/oracle/models/IdentityToken$n;Ljava/util/Date;)Lcom/bendingspoons/oracle/models/IdentityToken;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "Lcom/bendingspoons/oracle/models/IdentityToken$n;", "getType", "Ljava/util/Date;", "getExpirationDate", "getSub", "sub", "isLoggedIn", "()Z", "Companion", c.f62177j, "j", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo(with = j.class)
public final /* data */ class IdentityToken {
    private final Date expirationDate;
    private final String token;
    private final n type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.IdentityToken$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] n(String str) {
            String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(str, "-", "+", false, 4, (Object) null), "_", "/", false, 4, (Object) null);
            int length = strReplace$default.length();
            int iCeil = ((int) (((double) 4) * Math.ceil(((double) length) / 4.0d))) - length;
            if (iCeil > 0) {
                strReplace$default = strReplace$default + StringsKt.repeat(l.ae, iCeil);
            }
            try {
                return Base64.decode(strReplace$default, 0);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }

        public final IdentityToken rl(String token) {
            n c0726n;
            Intrinsics.checkNotNullParameter(token, "token");
            List listSplit$default = StringsKt.split$default((CharSequence) token, new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                throw new IllegalArgumentException("Could not decode JWT: Invalid format");
            }
            byte[] bArrN = n((String) listSplit$default.get(1));
            if (bArrN == null) {
                throw new IllegalArgumentException("Could not decode JWT: Invalid base64");
            }
            JSONObject jSONObject = new JSONObject(new String(bArrN, Charsets.UTF_8));
            long jOptLong = jSONObject.optLong(l.f62670y, 0L);
            if (jOptLong == 0) {
                throw new IllegalArgumentException("Could not decode JWT: Missing exp claim");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
            if (jSONObjectOptJSONObject == null) {
                throw new IllegalArgumentException("Could not decode JWT: Missing payload");
            }
            String strOptString = jSONObjectOptJSONObject.optString("sub");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() <= 0) {
                throw new IllegalArgumentException("Could not decode JWT: Missing sub claim");
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("identity_type");
            if (Intrinsics.areEqual(strOptString2, "strong")) {
                c0726n = new n.j(strOptString);
            } else {
                if (!Intrinsics.areEqual(strOptString2, "weak")) {
                    throw new IllegalArgumentException("Could not decode JWT: Invalid identity_type");
                }
                c0726n = new n.C0726n(strOptString);
            }
            return new IdentityToken(token, c0726n, new Date(jOptLong * ((long) 1000)));
        }

        public final Ml serializer() {
            return j.f51439n;
        }
    }

    public static abstract class n {

        public static final class j extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f51424n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.f51424n, ((j) obj).f51424n);
            }

            public int hashCode() {
                return this.f51424n.hashCode();
            }

            public String toString() {
                return "Strong(sub=" + this.f51424n + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String sub) {
                super(null);
                Intrinsics.checkNotNullParameter(sub, "sub");
                this.f51424n = sub;
            }

            public final String n() {
                return this.f51424n;
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.IdentityToken$n$n, reason: collision with other inner class name */
        public static final class C0726n extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f51425n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0726n) && Intrinsics.areEqual(this.f51425n, ((C0726n) obj).f51425n);
            }

            public int hashCode() {
                return this.f51425n.hashCode();
            }

            public String toString() {
                return "Weak(sub=" + this.f51425n + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0726n(String sub) {
                super(null);
                Intrinsics.checkNotNullParameter(sub, "sub");
                this.f51425n = sub;
            }

            public final String n() {
                return this.f51425n;
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public static /* synthetic */ IdentityToken copy$default(IdentityToken identityToken, String str, n nVar, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = identityToken.token;
        }
        if ((i2 & 2) != 0) {
            nVar = identityToken.type;
        }
        if ((i2 & 4) != 0) {
            date = identityToken.expirationDate;
        }
        return identityToken.copy(str, nVar, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final n getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final IdentityToken copy(String token, n type, Date expirationDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new IdentityToken(token, type, expirationDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityToken)) {
            return false;
        }
        IdentityToken identityToken = (IdentityToken) other;
        return Intrinsics.areEqual(this.token, identityToken.token) && Intrinsics.areEqual(this.type, identityToken.type) && Intrinsics.areEqual(this.expirationDate, identityToken.expirationDate);
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.type.hashCode()) * 31) + this.expirationDate.hashCode();
    }

    public String toString() {
        return "IdentityToken(token=" + this.token + ", type=" + this.type + ", expirationDate=" + this.expirationDate + ")";
    }

    public IdentityToken(String token, n type, Date expirationDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.token = token;
        this.type = type;
        this.expirationDate = expirationDate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getSub() {
        n nVar = this.type;
        if (nVar instanceof n.C0726n) {
            return ((n.C0726n) nVar).n();
        }
        if (nVar instanceof n.j) {
            return ((n.j) nVar).n();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getToken() {
        return this.token;
    }

    public final n getType() {
        return this.type;
    }

    public final boolean isLoggedIn() {
        n nVar = this.type;
        if (nVar instanceof n.C0726n) {
            return false;
        }
        if (nVar instanceof n.j) {
            return new Date().before(this.expirationDate);
        }
        throw new NoWhenBranchMatchedException();
    }
}
