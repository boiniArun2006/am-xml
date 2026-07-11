package com.vungle.ads.internal.signals;

import Du.g9;
import Du.i;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Xo
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B¥\u0001\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0004\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010$R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010(R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00105\u0012\u0004\b:\u00101\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010;\u0012\u0004\b@\u00101\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00105\u0012\u0004\bC\u00101\u001a\u0004\bA\u00107\"\u0004\bB\u00109R(\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010.\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010$\"\u0004\bE\u0010\u0005R.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010;\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010.\u0012\u0004\bK\u00101\u001a\u0004\b\u0013\u0010$\"\u0004\bJ\u0010\u0005R(\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010.\u0012\u0004\bM\u00101\u001a\u0004\b\u0014\u0010$\"\u0004\bL\u0010\u0005R(\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010.\u0012\u0004\bP\u00101\u001a\u0004\bN\u0010$\"\u0004\bO\u0010\u0005R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010.\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010\u0005R(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010.\u0012\u0004\bV\u00101\u001a\u0004\bT\u0010$\"\u0004\bU\u0010\u0005¨\u0006Y"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData;", "", "", "sessionCount", "<init>", "(I)V", "seen1", "", "sessionId", "", "sessionCreationTime", "", "Lcom/vungle/ads/internal/signals/SignaledAd;", "signaledAd", "sessionDuration", "sessionDepthCounter", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "unclosedAd", "isDevice", "isVPNConnected", "overlayGranted", "sensorCount", "httpProxyEnabled", "LDu/i;", "serializationConstructorMarker", "(IILjava/lang/String;JLjava/util/List;JILjava/util/List;IIIIILDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/signals/SessionData;Lgi/Ml;LEJn/Wre;)V", "component1", "()I", "copy", "(I)Lcom/vungle/ads/internal/signals/SessionData;", "toString", "()Ljava/lang/String;", "hashCode", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getSessionCount", "getSessionCount$annotations", "()V", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "J", "getSessionCreationTime", "()J", "setSessionCreationTime", "(J)V", "getSessionCreationTime$annotations", "Ljava/util/List;", "getSignaledAd", "()Ljava/util/List;", "setSignaledAd", "(Ljava/util/List;)V", "getSignaledAd$annotations", "getSessionDuration", "setSessionDuration", "getSessionDuration$annotations", "getSessionDepthCounter", "setSessionDepthCounter", "getSessionDepthCounter$annotations", "getUnclosedAd", "setUnclosedAd", "getUnclosedAd$annotations", "setDevice", "isDevice$annotations", "setVPNConnected", "isVPNConnected$annotations", "getOverlayGranted", "setOverlayGranted", "getOverlayGranted$annotations", "getSensorCount", "setSensorCount", "getSensorCount$annotations", "getHttpProxyEnabled", "setHttpProxyEnabled", "getHttpProxyEnabled$annotations", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData$Companion;", "", "<init>", "()V", "LXA/Ml;", "Lcom/vungle/ads/internal/signals/SessionData;", "serializer", "()LXA/Ml;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Ml serializer() {
            return SessionData$$serializer.INSTANCE;
        }
    }

    public SessionData(int i2) {
        this.sessionCount = i2;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = sessionData.sessionCount;
        }
        return sessionData.copy(i2);
    }

    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    public static /* synthetic */ void getSensorCount$annotations() {
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    public static /* synthetic */ void isDevice$annotations() {
    }

    public static /* synthetic */ void isVPNConnected$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final SessionData copy(int sessionCount) {
        return new SessionData(sessionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionData) && this.sessionCount == ((SessionData) other).sessionCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void write$Self(SessionData self, gi.Ml output, Wre serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.fD(serialDesc, 0, self.sessionCount);
        if (output.r(serialDesc, 1)) {
            output.O(serialDesc, 1, self.sessionId);
        } else {
            String str = self.sessionId;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            if (!Intrinsics.areEqual(str, string)) {
            }
        }
        if (output.r(serialDesc, 2) || self.sessionCreationTime != System.currentTimeMillis() / 1000) {
            output.WPU(serialDesc, 2, self.sessionCreationTime);
        }
        if (output.r(serialDesc, 3) || !Intrinsics.areEqual(self.signaledAd, new ArrayList())) {
            output.S(serialDesc, 3, new Du.Wre(SignaledAd$$serializer.INSTANCE), self.signaledAd);
        }
        if (output.r(serialDesc, 4) || self.sessionDuration != 0) {
            output.WPU(serialDesc, 4, self.sessionDuration);
        }
        if (output.r(serialDesc, 5) || self.sessionDepthCounter != 0) {
            output.fD(serialDesc, 5, self.sessionDepthCounter);
        }
        if (output.r(serialDesc, 6) || !Intrinsics.areEqual(self.unclosedAd, new ArrayList())) {
            output.S(serialDesc, 6, new Du.Wre(UnclosedAd$$serializer.INSTANCE), self.unclosedAd);
        }
        if (output.r(serialDesc, 7) || self.isDevice != 0) {
            output.fD(serialDesc, 7, self.isDevice);
        }
        if (output.r(serialDesc, 8) || self.isVPNConnected != 0) {
            output.fD(serialDesc, 8, self.isVPNConnected);
        }
        if (output.r(serialDesc, 9) || self.overlayGranted != 0) {
            output.fD(serialDesc, 9, self.overlayGranted);
        }
        if (output.r(serialDesc, 10) || self.sensorCount != 0) {
            output.fD(serialDesc, 10, self.sensorCount);
        }
        if (!output.r(serialDesc, 11) && self.httpProxyEnabled == 0) {
            return;
        }
        output.fD(serialDesc, 11, self.httpProxyEnabled);
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    /* JADX INFO: renamed from: isDevice, reason: from getter */
    public final int getIsDevice() {
        return this.isDevice;
    }

    /* JADX INFO: renamed from: isVPNConnected, reason: from getter */
    public final int getIsVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i2) {
        this.isDevice = i2;
    }

    public final void setHttpProxyEnabled(int i2) {
        this.httpProxyEnabled = i2;
    }

    public final void setOverlayGranted(int i2) {
        this.overlayGranted = i2;
    }

    public final void setSensorCount(int i2) {
        this.sensorCount = i2;
    }

    public final void setSessionCreationTime(long j2) {
        this.sessionCreationTime = j2;
    }

    public final void setSessionDepthCounter(int i2) {
        this.sessionDepthCounter = i2;
    }

    public final void setSessionDuration(long j2) {
        this.sessionDuration = j2;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i2) {
        this.isVPNConnected = i2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SessionData(int i2, int i3, String str, long j2, List list, long j3, int i5, List list2, int i7, int i8, int i9, int i10, int i11, i iVar) {
        if (1 != (i2 & 1)) {
            g9.n(i2, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i3;
        if ((i2 & 2) == 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.sessionId = string;
        } else {
            this.sessionId = str;
        }
        if ((i2 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j2;
        }
        if ((i2 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i2 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j3;
        }
        if ((i2 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i5;
        }
        if ((i2 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i2 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i7;
        }
        if ((i2 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i8;
        }
        if ((i2 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i9;
        }
        if ((i2 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i10;
        }
        if ((i2 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i11;
        }
    }
}
