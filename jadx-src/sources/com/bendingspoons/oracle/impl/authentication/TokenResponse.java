package com.bendingspoons.oracle.impl.authentication;

import Du.DC;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.iF;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.oracle.models.IdentityToken;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00063"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/TokenResponse;", "", "Lcom/bendingspoons/oracle/models/IdentityToken;", "accessToken", "", "refreshToken", "", "expiresIn", "<init>", "(Lcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/Integer;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/impl/authentication/TokenResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Lcom/bendingspoons/oracle/models/IdentityToken;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bendingspoons/oracle/impl/authentication/TokenResponse;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bendingspoons/oracle/models/IdentityToken;", "getAccessToken", "getAccessToken$annotations", "()V", "Ljava/lang/String;", "getRefreshToken", "getRefreshToken$annotations", "Ljava/lang/Integer;", "getExpiresIn", "getExpiresIn$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class TokenResponse {
    public final IdentityToken accessToken;
    public final Integer expiresIn;
    public final String refreshToken;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ class j implements vd {
        public static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51421n;
        public static final int rl;

        static {
            j jVar = new j();
            f51421n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.impl.authentication.TokenResponse", jVar, 3);
            dc.HI("access_token", false);
            dc.HI("refresh_token", false);
            dc.HI("expires_in", false);
            descriptor = dc;
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            return new Ml[]{com.bendingspoons.oracle.models.j.f51439n, Y5.f2000n, WY.j.Z(iF.f2020n)};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final TokenResponse deserialize(I28 decoder) {
            int i2;
            IdentityToken identityToken;
            String str;
            Integer num;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            IdentityToken identityToken2 = null;
            if (w6VarRl.HI()) {
                IdentityToken identityToken3 = (IdentityToken) w6VarRl.fD(wre, 0, com.bendingspoons.oracle.models.j.f51439n, null);
                String strIk = w6VarRl.Ik(wre, 1);
                identityToken = identityToken3;
                num = (Integer) w6VarRl.e(wre, 2, iF.f2020n, null);
                str = strIk;
                i2 = 7;
            } else {
                boolean z2 = true;
                int i3 = 0;
                String strIk2 = null;
                Integer num2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        identityToken2 = (IdentityToken) w6VarRl.fD(wre, 0, com.bendingspoons.oracle.models.j.f51439n, identityToken2);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        strIk2 = w6VarRl.Ik(wre, 1);
                        i3 |= 2;
                    } else {
                        if (iNY != 2) {
                            throw new UnknownFieldException(iNY);
                        }
                        num2 = (Integer) w6VarRl.e(wre, 2, iF.f2020n, num2);
                        i3 |= 4;
                    }
                }
                i2 = i3;
                identityToken = identityToken2;
                str = strIk2;
                num = num2;
            }
            w6VarRl.t(wre);
            return new TokenResponse(i2, identityToken, str, num, null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, TokenResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            TokenResponse.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.impl.authentication.TokenResponse$n, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51421n;
        }
    }

    public /* synthetic */ TokenResponse(int i2, IdentityToken identityToken, String str, Integer num, i iVar) {
        if (7 != (i2 & 7)) {
            g9.n(i2, 7, j.f51421n.getDescriptor());
        }
        this.accessToken = identityToken;
        this.refreshToken = str;
        this.expiresIn = num;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, IdentityToken identityToken, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identityToken = tokenResponse.accessToken;
        }
        if ((i2 & 2) != 0) {
            str = tokenResponse.refreshToken;
        }
        if ((i2 & 4) != 0) {
            num = tokenResponse.expiresIn;
        }
        return tokenResponse.copy(identityToken, str, num);
    }

    public static /* synthetic */ void getAccessToken$annotations() {
    }

    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IdentityToken getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final TokenResponse copy(@Json(name = "access_token") IdentityToken accessToken, @Json(name = "refresh_token") String refreshToken, @Json(name = "expires_in") Integer expiresIn) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new TokenResponse(accessToken, refreshToken, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, tokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, tokenResponse.refreshToken) && Intrinsics.areEqual(this.expiresIn, tokenResponse.expiresIn);
    }

    public int hashCode() {
        int iHashCode = ((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31;
        Integer num = this.expiresIn;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "TokenResponse(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", expiresIn=" + this.expiresIn + ")";
    }

    public TokenResponse(@Json(name = "access_token") IdentityToken accessToken, @Json(name = "refresh_token") String refreshToken, @Json(name = "expires_in") Integer num) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = num;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(TokenResponse self, gi.Ml output, Wre serialDesc) {
        output.S(serialDesc, 0, com.bendingspoons.oracle.models.j.f51439n, self.accessToken);
        output.O(serialDesc, 1, self.refreshToken);
        output.X(serialDesc, 2, iF.f2020n, self.expiresIn);
    }

    public final IdentityToken getAccessToken() {
        return this.accessToken;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
