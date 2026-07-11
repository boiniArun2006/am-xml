package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Dsr;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010%R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\"\u0012\u0004\b*\u0010'\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010%¨\u0006."}, d2 = {"Lcom/bendingspoons/oracle/models/LegalNotifications;", "", "", "toNotifyPrivacyPolicy", "toNotifyTermsOfService", "<init>", "(ZZ)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(IZZLDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/LegalNotifications;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/bendingspoons/oracle/models/LegalNotifications;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getToNotifyPrivacyPolicy", "setToNotifyPrivacyPolicy", "(Z)V", "getToNotifyPrivacyPolicy$annotations", "()V", "getToNotifyTermsOfService", "setToNotifyTermsOfService", "getToNotifyTermsOfService$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class LegalNotifications {
    private boolean toNotifyPrivacyPolicy;
    private boolean toNotifyTermsOfService;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51426n;
        public static final int rl;

        private j() {
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Dsr dsr = Dsr.f1956n;
            return new Ml[]{dsr, dsr};
        }

        static {
            j jVar = new j();
            f51426n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.LegalNotifications", jVar, 2);
            dc.HI("to_notify_privacy_policy", true);
            dc.HI("to_notify_terms_of_service", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final LegalNotifications deserialize(I28 decoder) {
            boolean zMUb;
            boolean zMUb2;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            if (w6VarRl.HI()) {
                zMUb = w6VarRl.mUb(wre, 0);
                zMUb2 = w6VarRl.mUb(wre, 1);
                i2 = 3;
            } else {
                boolean z2 = true;
                zMUb = false;
                boolean zMUb3 = false;
                int i3 = 0;
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
                        zMUb3 = w6VarRl.mUb(wre, 1);
                        i3 |= 2;
                    }
                }
                zMUb2 = zMUb3;
                i2 = i3;
            }
            w6VarRl.t(wre);
            return new LegalNotifications(i2, zMUb, zMUb2, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, LegalNotifications value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            LegalNotifications.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.LegalNotifications$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51426n;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LegalNotifications() {
        boolean z2 = false;
        this(z2, z2, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LegalNotifications copy$default(LegalNotifications legalNotifications, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = legalNotifications.toNotifyPrivacyPolicy;
        }
        if ((i2 & 2) != 0) {
            z3 = legalNotifications.toNotifyTermsOfService;
        }
        return legalNotifications.copy(z2, z3);
    }

    public static /* synthetic */ void getToNotifyPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void getToNotifyTermsOfService$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$oracle_release(LegalNotifications self, gi.Ml output, Wre serialDesc) {
        if (output.r(serialDesc, 0) || self.toNotifyPrivacyPolicy) {
            output.qie(serialDesc, 0, self.toNotifyPrivacyPolicy);
        }
        if (output.r(serialDesc, 1) || self.toNotifyTermsOfService) {
            output.qie(serialDesc, 1, self.toNotifyTermsOfService);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getToNotifyPrivacyPolicy() {
        return this.toNotifyPrivacyPolicy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getToNotifyTermsOfService() {
        return this.toNotifyTermsOfService;
    }

    public final LegalNotifications copy(@Json(name = "to_notify_privacy_policy") boolean toNotifyPrivacyPolicy, @Json(name = "to_notify_terms_of_service") boolean toNotifyTermsOfService) {
        return new LegalNotifications(toNotifyPrivacyPolicy, toNotifyTermsOfService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalNotifications)) {
            return false;
        }
        LegalNotifications legalNotifications = (LegalNotifications) other;
        return this.toNotifyPrivacyPolicy == legalNotifications.toNotifyPrivacyPolicy && this.toNotifyTermsOfService == legalNotifications.toNotifyTermsOfService;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.toNotifyPrivacyPolicy) * 31) + Boolean.hashCode(this.toNotifyTermsOfService);
    }

    public String toString() {
        return "LegalNotifications(toNotifyPrivacyPolicy=" + this.toNotifyPrivacyPolicy + ", toNotifyTermsOfService=" + this.toNotifyTermsOfService + ")";
    }

    public /* synthetic */ LegalNotifications(int i2, boolean z2, boolean z3, i iVar) {
        if ((i2 & 1) == 0) {
            this.toNotifyPrivacyPolicy = false;
        } else {
            this.toNotifyPrivacyPolicy = z2;
        }
        if ((i2 & 2) == 0) {
            this.toNotifyTermsOfService = false;
        } else {
            this.toNotifyTermsOfService = z3;
        }
    }

    public final boolean getToNotifyPrivacyPolicy() {
        return this.toNotifyPrivacyPolicy;
    }

    public final boolean getToNotifyTermsOfService() {
        return this.toNotifyTermsOfService;
    }

    public final void setToNotifyPrivacyPolicy(boolean z2) {
        this.toNotifyPrivacyPolicy = z2;
    }

    public final void setToNotifyTermsOfService(boolean z2) {
        this.toNotifyTermsOfService = z2;
    }

    public LegalNotifications(@Json(name = "to_notify_privacy_policy") boolean z2, @Json(name = "to_notify_terms_of_service") boolean z3) {
        this.toNotifyPrivacyPolicy = z2;
        this.toNotifyTermsOfService = z3;
    }

    public /* synthetic */ LegalNotifications(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
    }
}
