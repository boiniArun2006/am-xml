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
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/CallbackResponse;", "", "", "authCode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/impl/authentication/CallbackResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bendingspoons/oracle/impl/authentication/CallbackResponse;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthCode", "getAuthCode$annotations", "()V", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class CallbackResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final String authCode;

    public /* synthetic */ class j implements vd {
        public static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51414n;
        public static final int rl;

        @Override // Du.vd
        public final Ml[] childSerializers() {
            return new Ml[]{Y5.f2000n};
        }

        static {
            j jVar = new j();
            f51414n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.impl.authentication.CallbackResponse", jVar, 1);
            dc.HI(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, false);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final CallbackResponse deserialize(I28 decoder) {
            String strIk;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            int i2 = 1;
            i iVar = null;
            if (w6VarRl.HI()) {
                strIk = w6VarRl.Ik(wre, 0);
            } else {
                boolean z2 = true;
                int i3 = 0;
                strIk = null;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else {
                        if (iNY != 0) {
                            throw new UnknownFieldException(iNY);
                        }
                        strIk = w6VarRl.Ik(wre, 0);
                        i3 = 1;
                    }
                }
                i2 = i3;
            }
            w6VarRl.t(wre);
            return new CallbackResponse(i2, strIk, iVar);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, CallbackResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            CallbackResponse.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.impl.authentication.CallbackResponse$n, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51414n;
        }
    }

    public /* synthetic */ CallbackResponse(int i2, String str, i iVar) {
        if (1 != (i2 & 1)) {
            g9.n(i2, 1, j.f51414n.getDescriptor());
        }
        this.authCode = str;
    }

    public static /* synthetic */ CallbackResponse copy$default(CallbackResponse callbackResponse, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = callbackResponse.authCode;
        }
        return callbackResponse.copy(str);
    }

    public static /* synthetic */ void getAuthCode$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(CallbackResponse self, gi.Ml output, Wre serialDesc) {
        output.O(serialDesc, 0, self.authCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    public final CallbackResponse copy(@Json(name = SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE) String authCode) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        return new CallbackResponse(authCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallbackResponse) && Intrinsics.areEqual(this.authCode, ((CallbackResponse) other).authCode);
    }

    public int hashCode() {
        return this.authCode.hashCode();
    }

    public String toString() {
        return "CallbackResponse(authCode=" + this.authCode + ")";
    }

    public CallbackResponse(@Json(name = SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE) String authCode) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        this.authCode = authCode;
    }

    public final String getAuthCode() {
        return this.authCode;
    }
}
