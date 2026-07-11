package com.bendingspoons.oracle.impl.authentication;

import Du.DC;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthorizeResponse;", "", "", "authURL", "productJWT", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/impl/authentication/AuthorizeResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/oracle/impl/authentication/AuthorizeResponse;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthURL", "getAuthURL$annotations", "()V", "getProductJWT", "getProductJWT$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class AuthorizeResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final String authURL;
    public final String productJWT;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public /* synthetic */ class j implements vd {
        public static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51413n;
        public static final int rl;

        static {
            j jVar = new j();
            f51413n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.impl.authentication.AuthorizeResponse", jVar, 2);
            dc.HI("auth_url", false);
            dc.HI("product_jwt", false);
            descriptor = dc;
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Y5 y5 = Y5.f2000n;
            return new Ml[]{y5, WY.j.Z(y5)};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final AuthorizeResponse deserialize(I28 decoder) {
            String strIk;
            String str;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            i iVar = null;
            if (w6VarRl.HI()) {
                strIk = w6VarRl.Ik(wre, 0);
                str = (String) w6VarRl.e(wre, 1, Y5.f2000n, null);
                i2 = 3;
            } else {
                boolean z2 = true;
                int i3 = 0;
                strIk = null;
                String str2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        strIk = w6VarRl.Ik(wre, 0);
                        i3 |= 1;
                    } else {
                        if (iNY != 1) {
                            throw new UnknownFieldException(iNY);
                        }
                        str2 = (String) w6VarRl.e(wre, 1, Y5.f2000n, str2);
                        i3 |= 2;
                    }
                }
                str = str2;
                i2 = i3;
            }
            w6VarRl.t(wre);
            return new AuthorizeResponse(i2, strIk, str, iVar);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, AuthorizeResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            AuthorizeResponse.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.impl.authentication.AuthorizeResponse$n, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51413n;
        }
    }

    public /* synthetic */ AuthorizeResponse(int i2, String str, String str2, i iVar) {
        if (3 != (i2 & 3)) {
            g9.n(i2, 3, j.f51413n.getDescriptor());
        }
        this.authURL = str;
        this.productJWT = str2;
    }

    public static /* synthetic */ AuthorizeResponse copy$default(AuthorizeResponse authorizeResponse, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = authorizeResponse.authURL;
        }
        if ((i2 & 2) != 0) {
            str2 = authorizeResponse.productJWT;
        }
        return authorizeResponse.copy(str, str2);
    }

    public static /* synthetic */ void getAuthURL$annotations() {
    }

    public static /* synthetic */ void getProductJWT$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthURL() {
        return this.authURL;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductJWT() {
        return this.productJWT;
    }

    public final AuthorizeResponse copy(@Json(name = "auth_url") String authURL, @Json(name = "product_jwt") String productJWT) {
        Intrinsics.checkNotNullParameter(authURL, "authURL");
        return new AuthorizeResponse(authURL, productJWT);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizeResponse)) {
            return false;
        }
        AuthorizeResponse authorizeResponse = (AuthorizeResponse) other;
        return Intrinsics.areEqual(this.authURL, authorizeResponse.authURL) && Intrinsics.areEqual(this.productJWT, authorizeResponse.productJWT);
    }

    public int hashCode() {
        int iHashCode = this.authURL.hashCode() * 31;
        String str = this.productJWT;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AuthorizeResponse(authURL=" + this.authURL + ", productJWT=" + this.productJWT + ")";
    }

    public AuthorizeResponse(@Json(name = "auth_url") String authURL, @Json(name = "product_jwt") String str) {
        Intrinsics.checkNotNullParameter(authURL, "authURL");
        this.authURL = authURL;
        this.productJWT = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(AuthorizeResponse self, gi.Ml output, Wre serialDesc) {
        output.O(serialDesc, 0, self.authURL);
        output.X(serialDesc, 1, Y5.f2000n, self.productJWT);
    }

    public final String getAuthURL() {
        return this.authURL;
    }

    public final String getProductJWT() {
        return this.productJWT;
    }
}
