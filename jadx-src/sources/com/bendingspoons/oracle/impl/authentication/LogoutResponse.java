package com.bendingspoons.oracle.impl.authentication;

import Du.DC;
import Du.Dsr;
import Du.g9;
import Du.i;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006."}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/LogoutResponse;", "", "", "success", "Lcom/bendingspoons/oracle/models/IdentityToken;", "identityToken", "<init>", "(ZLcom/bendingspoons/oracle/models/IdentityToken;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(IZLcom/bendingspoons/oracle/models/IdentityToken;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/impl/authentication/LogoutResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/bendingspoons/oracle/models/IdentityToken;", "copy", "(ZLcom/bendingspoons/oracle/models/IdentityToken;)Lcom/bendingspoons/oracle/impl/authentication/LogoutResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "getSuccess$annotations", "()V", "Lcom/bendingspoons/oracle/models/IdentityToken;", "getIdentityToken", "getIdentityToken$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class LogoutResponse {
    public final IdentityToken identityToken;
    public final boolean success;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ class j implements vd {
        public static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51415n;
        public static final int rl;

        @Override // Du.vd
        public final Ml[] childSerializers() {
            return new Ml[]{Dsr.f1956n, com.bendingspoons.oracle.models.j.f51439n};
        }

        static {
            j jVar = new j();
            f51415n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.impl.authentication.LogoutResponse", jVar, 2);
            dc.HI("success", false);
            dc.HI("weak_jwt", false);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final LogoutResponse deserialize(I28 decoder) {
            boolean zMUb;
            IdentityToken identityToken;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            i iVar = null;
            if (w6VarRl.HI()) {
                zMUb = w6VarRl.mUb(wre, 0);
                identityToken = (IdentityToken) w6VarRl.fD(wre, 1, com.bendingspoons.oracle.models.j.f51439n, null);
                i2 = 3;
            } else {
                boolean z2 = true;
                zMUb = false;
                int i3 = 0;
                IdentityToken identityToken2 = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        zMUb = w6VarRl.mUb(wre, 0);
                        i3 |= 1;
                    } else {
                        if (iNY != 1) {
                            throw new UnknownFieldException(iNY);
                        }
                        identityToken2 = (IdentityToken) w6VarRl.fD(wre, 1, com.bendingspoons.oracle.models.j.f51439n, identityToken2);
                        i3 |= 2;
                    }
                }
                identityToken = identityToken2;
                i2 = i3;
            }
            w6VarRl.t(wre);
            return new LogoutResponse(i2, zMUb, identityToken, iVar);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, LogoutResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            LogoutResponse.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.impl.authentication.LogoutResponse$n, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51415n;
        }
    }

    public /* synthetic */ LogoutResponse(int i2, boolean z2, IdentityToken identityToken, i iVar) {
        if (3 != (i2 & 3)) {
            g9.n(i2, 3, j.f51415n.getDescriptor());
        }
        this.success = z2;
        this.identityToken = identityToken;
    }

    public static /* synthetic */ LogoutResponse copy$default(LogoutResponse logoutResponse, boolean z2, IdentityToken identityToken, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = logoutResponse.success;
        }
        if ((i2 & 2) != 0) {
            identityToken = logoutResponse.identityToken;
        }
        return logoutResponse.copy(z2, identityToken);
    }

    public static /* synthetic */ void getIdentityToken$annotations() {
    }

    public static /* synthetic */ void getSuccess$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IdentityToken getIdentityToken() {
        return this.identityToken;
    }

    public final LogoutResponse copy(@Json(name = "success") boolean success, @Json(name = "weak_jwt") IdentityToken identityToken) {
        Intrinsics.checkNotNullParameter(identityToken, "identityToken");
        return new LogoutResponse(success, identityToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutResponse)) {
            return false;
        }
        LogoutResponse logoutResponse = (LogoutResponse) other;
        return this.success == logoutResponse.success && Intrinsics.areEqual(this.identityToken, logoutResponse.identityToken);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.identityToken.hashCode();
    }

    public String toString() {
        return "LogoutResponse(success=" + this.success + ", identityToken=" + this.identityToken + ")";
    }

    public LogoutResponse(@Json(name = "success") boolean z2, @Json(name = "weak_jwt") IdentityToken identityToken) {
        Intrinsics.checkNotNullParameter(identityToken, "identityToken");
        this.success = z2;
        this.identityToken = identityToken;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(LogoutResponse self, gi.Ml output, Wre serialDesc) {
        output.qie(serialDesc, 0, self.success);
        output.S(serialDesc, 1, com.bendingspoons.oracle.models.j.f51439n, self.identityToken);
    }

    public final IdentityToken getIdentityToken() {
        return this.identityToken;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
