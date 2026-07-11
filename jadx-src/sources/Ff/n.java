package Ff;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.aC;
import com.facebook.appevents.Ml;
import com.facebook.s4;
import com.google.android.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static String f2784O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f2785n = new n();
    private static EV2.j nr;
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f2786t;

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JSONObject f2787n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(JSONObject jSONObject) {
            super(1);
            this.f2787n = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            Object objOpt = this.f2787n.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, C.UTF8_NAME) + '=' + URLEncoder.encode(objOpt.toString(), C.UTF8_NAME);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Ff.n$n, reason: collision with other inner class name */
    public static final class C0099n implements OutcomeReceiver {
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.d(n.t(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
            EV2.j jVarRl = n.rl();
            if (jVarRl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                jVarRl = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            jVarRl.rl("gps_ara_failed", bundle);
        }

        public void onResult(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.d(n.t(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
            EV2.j jVarRl = n.rl();
            if (jVarRl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                jVarRl = null;
            }
            jVarRl.rl("gps_ara_succeed", null);
        }

        C0099n() {
        }
    }

    static {
        String string = n.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "GpsAraTriggersManager::class.java.toString()");
        rl = string;
    }

    public static final void O() {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            f2786t = true;
            nr = new EV2.j(s4.qie());
            f2784O = "https://www." + s4.XQ() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(String applicationId, Ml event) {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            f2785n.KN(applicationId, event);
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    private final boolean nr() {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (!f2786t) {
                return false;
            }
            EV2.j jVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                return true;
            } catch (Error e2) {
                Log.i(rl, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                EV2.j jVar2 = nr;
                if (jVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    jVar = jVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e2.toString());
                Unit unit = Unit.INSTANCE;
                jVar.rl("gps_ara_failed", bundle);
                return false;
            } catch (Exception e3) {
                Log.i(rl, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                EV2.j jVar3 = nr;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    jVar = jVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e3.toString());
                Unit unit2 = Unit.INSTANCE;
                jVar.rl("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    public static final /* synthetic */ EV2.j rl() {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            return nr;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public static final /* synthetic */ String t() {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            return rl;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public final void KN(String applicationId, Ml event) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (Uo(event) && nr()) {
                Context contextQie = s4.qie();
                EV2.j jVar = null;
                try {
                    MeasurementManager measurementManagerN = androidx.privacysandbox.ads.adservices.measurement.C.n(contextQie.getSystemService(aC.n()));
                    if (measurementManagerN == null) {
                        measurementManagerN = MeasurementManager.get(contextQie.getApplicationContext());
                    }
                    if (measurementManagerN == null) {
                        Log.w(rl, "FAILURE_GET_MEASUREMENT_MANAGER");
                        EV2.j jVar2 = nr;
                        if (jVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                            jVar2 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                        Unit unit = Unit.INSTANCE;
                        jVar2.rl("gps_ara_failed", bundle);
                        return;
                    }
                    String strJ2 = J2(event);
                    StringBuilder sb = new StringBuilder();
                    String str = f2784O;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                        str = null;
                    }
                    sb.append(str);
                    sb.append('?');
                    sb.append("app_id");
                    sb.append('=');
                    sb.append(applicationId);
                    sb.append(Typography.amp);
                    sb.append(strJ2);
                    Uri uri = Uri.parse(sb.toString());
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    measurementManagerN.registerTrigger(uri, s4.Z(), androidx.core.os.j.n(new C0099n()));
                } catch (Error e2) {
                    Log.w(rl, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    EV2.j jVar3 = nr;
                    if (jVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        jVar = jVar3;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("gps_ara_failed_reason", e2.toString());
                    Unit unit2 = Unit.INSTANCE;
                    jVar.rl("gps_ara_failed", bundle2);
                } catch (Exception e3) {
                    Log.w(rl, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    EV2.j jVar4 = nr;
                    if (jVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        jVar = jVar4;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("gps_ara_failed_reason", e3.toString());
                    Unit unit3 = Unit.INSTANCE;
                    jVar.rl("gps_ara_failed", bundle3);
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private n() {
    }

    private final String J2(Ml ml) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectT = ml.t();
            if (jSONObjectT != null && jSONObjectT.length() != 0) {
                Iterator<String> itKeys = jSONObjectT.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "params.keys()");
                return SequencesKt.joinToString$default(SequencesKt.mapNotNull(SequencesKt.asSequence(itKeys), new j(jSONObjectT)), "&", null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final boolean Uo(Ml ml) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            String eventName = ml.t().getString("_eventName");
            if (!Intrinsics.areEqual(eventName, "_removed_")) {
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                if (!StringsKt.contains$default((CharSequence) eventName, (CharSequence) "gps", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    public final void xMQ(final String applicationId, final Ml event) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            s4.Z().execute(new Runnable() { // from class: Ff.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.mUb(applicationId, event);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
