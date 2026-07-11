package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.g9;
import Du.i;
import Du.iF;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import gi.I28;
import gi.w6;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001dR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/bendingspoons/oracle/models/ErrorResponse;", "", "", MRAIDPresenter.ERROR, "", "message", "", "errorCode", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "seen0", "httpCode", "LDu/i;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/ErrorResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;)Lcom/bendingspoons/oracle/models/ErrorResponse;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getError", "getError$annotations", "()V", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "Ljava/lang/Integer;", "getErrorCode", "getErrorCode$annotations", "getHttpCode", "setHttpCode", "(Ljava/lang/Integer;)V", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class ErrorResponse {

    @Json(name = MRAIDPresenter.ERROR)
    private final boolean error;

    @Json(name = "error_code")
    private final Integer errorCode;
    private Integer httpCode;

    @Json(name = "message")
    private final String message;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51423n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51423n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.ErrorResponse", jVar, 4);
            dc.HI(MRAIDPresenter.ERROR, true);
            dc.HI("message", false);
            dc.HI("error_code", false);
            dc.HI("httpCode", true);
            descriptor = dc;
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml mlZ = WY.j.Z(Y5.f2000n);
            iF iFVar = iF.f2020n;
            return new Ml[]{Dsr.f1956n, mlZ, WY.j.Z(iFVar), WY.j.Z(iFVar)};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final ErrorResponse deserialize(I28 decoder) {
            boolean zMUb;
            int i2;
            String str;
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            if (w6VarRl.HI()) {
                zMUb = w6VarRl.mUb(wre, 0);
                String str2 = (String) w6VarRl.e(wre, 1, Y5.f2000n, null);
                iF iFVar = iF.f2020n;
                Integer num3 = (Integer) w6VarRl.e(wre, 2, iFVar, null);
                num2 = (Integer) w6VarRl.e(wre, 3, iFVar, null);
                num = num3;
                str = str2;
                i2 = 15;
            } else {
                boolean z2 = true;
                zMUb = false;
                String str3 = null;
                Integer num4 = null;
                Integer num5 = null;
                int i3 = 0;
                while (z2) {
                    int iNY = w6VarRl.nY(wre);
                    if (iNY == -1) {
                        z2 = false;
                    } else if (iNY == 0) {
                        zMUb = w6VarRl.mUb(wre, 0);
                        i3 |= 1;
                    } else if (iNY == 1) {
                        str3 = (String) w6VarRl.e(wre, 1, Y5.f2000n, str3);
                        i3 |= 2;
                    } else if (iNY == 2) {
                        num4 = (Integer) w6VarRl.e(wre, 2, iF.f2020n, num4);
                        i3 |= 4;
                    } else {
                        if (iNY != 3) {
                            throw new UnknownFieldException(iNY);
                        }
                        num5 = (Integer) w6VarRl.e(wre, 3, iF.f2020n, num5);
                        i3 |= 8;
                    }
                }
                i2 = i3;
                str = str3;
                num = num4;
                num2 = num5;
            }
            boolean z3 = zMUb;
            w6VarRl.t(wre);
            return new ErrorResponse(i2, z3, str, num, num2, null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, ErrorResponse value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            ErrorResponse.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.ErrorResponse$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51423n;
        }
    }

    public /* synthetic */ ErrorResponse(int i2, boolean z2, String str, Integer num, Integer num2, i iVar) {
        if (6 != (i2 & 6)) {
            g9.n(i2, 6, j.f51423n.getDescriptor());
        }
        this.error = (i2 & 1) == 0 ? false : z2;
        this.message = str;
        this.errorCode = num;
        if ((i2 & 8) == 0) {
            this.httpCode = null;
        } else {
            this.httpCode = num2;
        }
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, boolean z2, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = errorResponse.error;
        }
        if ((i2 & 2) != 0) {
            str = errorResponse.message;
        }
        if ((i2 & 4) != 0) {
            num = errorResponse.errorCode;
        }
        return errorResponse.copy(z2, str, num);
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getErrorCode$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(ErrorResponse self, gi.Ml output, Wre serialDesc) {
        if (output.r(serialDesc, 0) || self.error) {
            output.qie(serialDesc, 0, self.error);
        }
        output.X(serialDesc, 1, Y5.f2000n, self.message);
        iF iFVar = iF.f2020n;
        output.X(serialDesc, 2, iFVar, self.errorCode);
        if (!output.r(serialDesc, 3) && self.httpCode == null) {
            return;
        }
        output.X(serialDesc, 3, iFVar, self.httpCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final ErrorResponse copy(boolean error, String message, Integer errorCode) {
        return new ErrorResponse(error, message, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return this.error == errorResponse.error && Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.errorCode, errorResponse.errorCode);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.error) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResponse(error=" + this.error + ", message=" + this.message + ", errorCode=" + this.errorCode + ")";
    }

    public ErrorResponse(boolean z2, String str, Integer num) {
        this.error = z2;
        this.message = str;
        this.errorCode = num;
    }

    public final boolean getError() {
        return this.error;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setHttpCode(Integer num) {
        this.httpCode = num;
    }

    public /* synthetic */ ErrorResponse(boolean z2, String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, str, num);
    }
}
