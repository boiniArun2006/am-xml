package com.vungle.ads.internal.omsdk;

import Vy.C;
import Vy.Wre;
import Vy.aC;
import Vy.fuX;
import Vy.n;
import Vy.qz;
import Vy.w6;
import XA.Ml;
import XA.r;
import android.util.Base64;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.json.I28;
import kotlinx.serialization.json.Q;
import vv.C2408Ml;
import vv.C2410n;
import vv.EnumC2409j;
import vv.EnumC2411w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\u0010¢\u0006\u0004\b%\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b\u0006\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "", "omSdkData", "omSdkJS", "", "isNativeVideo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "LVy/Wre;", "creativeType", "LVy/w6;", "getNativeAdSession", "(LVy/Wre;)LVy/w6;", "Landroid/view/View;", "view", "", TtmlNode.START, "(Landroid/view/View;)V", "stop", "()V", "onStatePlay", "onStatePaused", "onStateCompleted", "", "duration", "volume", "onQuartileStart", "(FF)V", "", "quartile", "onQuartileChanged", "(I)V", "muted", "onMuteChanged", "(Z)V", "onUserInteraction", "impressionOccurred", "Z", "()Z", "Lkotlinx/serialization/json/n;", "json", "Lkotlinx/serialization/json/n;", "LVy/n;", "adSession", "LVy/n;", "LVy/j;", "adEvents", "LVy/j;", "Lvv/n;", "mediaEvents", "Lvv/n;", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeOMTracker {
    private static final String TAG = "NativeAd-OMTracker";
    private Vy.j adEvents;
    private n adSession;
    private final boolean isNativeVideo;
    private final kotlinx.serialization.json.n json;
    private C2410n mediaEvents;

    public NativeOMTracker(String omSdkData, String omSdkJS, boolean z2) {
        Object objM313constructorimpl;
        OmSdkData omSdkData2;
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        Intrinsics.checkNotNullParameter(omSdkJS, "omSdkJS");
        this.isNativeVideo = z2;
        kotlinx.serialization.json.n nVarRl = Q.rl(null, new Function1<I28, Unit>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(I28 i28) {
                invoke2(i28);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(I28 Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.J2(true);
                Json.nr(true);
                Json.O(false);
            }
        }, 1, null);
        this.json = nVarRl;
        try {
            Result.Companion companion = Result.INSTANCE;
            w6 nativeAdSession = z2 ? getNativeAdSession(Wre.VIDEO) : getNativeAdSession(Wre.NATIVE_DISPLAY);
            C cN = C.n("Vungle", BuildConfig.VERSION_NAME);
            byte[] decoded = Base64.decode(omSdkData, 0);
            if (decoded != null) {
                Intrinsics.checkNotNullExpressionValue(decoded, "decoded");
                String str = new String(decoded, Charsets.UTF_8);
                Ml mlRl = r.rl(nVarRl.n(), Reflection.typeOf(OmSdkData.class));
                Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) nVarRl.t(mlRl, str);
            } else {
                omSdkData2 = null;
            }
            if ((omSdkData2 != null ? omSdkData2.getVendorURL() : null) == null) {
                Logger.INSTANCE.e(TAG, "Invalid OMSDK data: missing vendorURL");
            } else {
                qz verificationScriptResource = qz.n(omSdkData2.getVendorKey(), new URL(omSdkData2.getVendorURL()), omSdkData2.getParams());
                Intrinsics.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
                this.adSession = n.n(nativeAdSession, Vy.Ml.rl(cN, omSdkJS, CollectionsKt.listOf(verificationScriptResource), null, null));
            }
            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "error occured when create omsdk adSession:", thM316exceptionOrNullimpl);
        }
    }

    private final w6 getNativeAdSession(Wre creativeType) {
        fuX fux = fuX.BEGIN_TO_RENDER;
        aC aCVar = aC.NATIVE;
        w6 w6VarN = w6.n(creativeType, fux, aCVar, creativeType == Wre.NATIVE_DISPLAY ? aC.NONE : aCVar, false);
        Intrinsics.checkNotNullExpressionValue(w6VarN, "createAdSessionConfigura…          false\n        )");
        return w6VarN;
    }

    public final void impressionOccurred() {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: impressionOccurred");
        try {
            Result.Companion companion = Result.INSTANCE;
            Vy.j jVar = this.adEvents;
            if (jVar != null) {
                jVar.rl();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: renamed from: isNativeVideo, reason: from getter */
    public final boolean getIsNativeVideo() {
        return this.isNativeVideo;
    }

    public final void onMuteChanged(boolean muted) {
        Logger.INSTANCE.d(TAG, "track event: onMuteChanged muted=" + muted);
        Unit unit = null;
        if (muted) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C2410n c2410n = this.mediaEvents;
                if (c2410n != null) {
                    c2410n.qie(0.0f);
                    unit = Unit.INSTANCE;
                }
                Result.m313constructorimpl(unit);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            C2410n c2410n2 = this.mediaEvents;
            if (c2410n2 != null) {
                c2410n2.qie(1.0f);
                unit = Unit.INSTANCE;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final void onQuartileChanged(int quartile) {
        Logger.INSTANCE.d(TAG, "track event: onQuartileChanged quartile=" + quartile);
        Unit unit = null;
        if (quartile == 5) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C2410n c2410n = this.mediaEvents;
                if (c2410n != null) {
                    c2410n.J2();
                    unit = Unit.INSTANCE;
                }
                Result.m313constructorimpl(unit);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        if (quartile == 6) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                C2410n c2410n2 = this.mediaEvents;
                if (c2410n2 != null) {
                    c2410n2.Uo();
                    unit = Unit.INSTANCE;
                }
                Result.m313constructorimpl(unit);
                return;
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th2));
                return;
            }
        }
        if (quartile != 7) {
            return;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            C2410n c2410n3 = this.mediaEvents;
            if (c2410n3 != null) {
                c2410n3.gh();
                unit = Unit.INSTANCE;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th3));
        }
    }

    public final void onQuartileStart(float duration, float volume) {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: onQuartileStart duration=" + duration + " volume=" + volume);
        try {
            Result.Companion companion = Result.INSTANCE;
            C2410n c2410n = this.mediaEvents;
            if (c2410n != null) {
                c2410n.mUb(duration, volume);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStateCompleted() {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: onStateCompleted");
        try {
            Result.Companion companion = Result.INSTANCE;
            C2410n c2410n = this.mediaEvents;
            if (c2410n != null) {
                c2410n.rl();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStatePaused() {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: onStatePaused");
        try {
            Result.Companion companion = Result.INSTANCE;
            C2410n c2410n = this.mediaEvents;
            if (c2410n != null) {
                c2410n.KN();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onStatePlay() {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: onStatePlay");
        try {
            Result.Companion companion = Result.INSTANCE;
            C2410n c2410n = this.mediaEvents;
            if (c2410n != null) {
                c2410n.xMQ();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void onUserInteraction() {
        Unit unit;
        Logger.INSTANCE.d(TAG, "track event: onUserInteraction");
        try {
            Result.Companion companion = Result.INSTANCE;
            C2410n c2410n = this.mediaEvents;
            if (c2410n != null) {
                c2410n.n(EnumC2409j.CLICK);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m313constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m313constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void start(View view) {
        Object objM313constructorimpl;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(TAG, "start OM tracker");
        try {
            Result.Companion companion2 = Result.INSTANCE;
            n nVar = this.adSession;
            if (nVar != null) {
                this.adEvents = Vy.j.n(nVar);
                if (this.isNativeVideo) {
                    this.mediaEvents = C2410n.O(nVar);
                }
                nVar.t(view);
                nVar.nr();
                if (this.isNativeVideo) {
                    C2408Ml c2408MlRl = C2408Ml.rl(false, EnumC2411w6.STANDALONE);
                    Vy.j jVar = this.adEvents;
                    if (jVar != null) {
                        jVar.nr(c2408MlRl);
                    }
                } else {
                    Vy.j jVar2 = this.adEvents;
                    if (jVar2 != null) {
                        jVar2.t();
                    }
                }
                numValueOf = Integer.valueOf(companion.d(TAG, "track event: loaded"));
            } else {
                numValueOf = null;
            }
            objM313constructorimpl = Result.m313constructorimpl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "error occured when start omsdk adSession:", thM316exceptionOrNullimpl);
        }
    }

    public final void stop() {
        n nVar = this.adSession;
        if (nVar != null) {
            nVar.rl();
        }
        this.adSession = null;
        this.adEvents = null;
        this.mediaEvents = null;
    }
}
