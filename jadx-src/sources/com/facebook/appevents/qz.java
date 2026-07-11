package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.Xo;
import com.facebook.internal.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qz {
    private static ScheduledFuture J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f52331n = new qz();
    private static final String rl = qz.class.getName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f52332t = 100;
    private static volatile I28 nr = new I28();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ScheduledExecutorService f52330O = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable Uo = new Runnable() { // from class: com.facebook.appevents.CN3
        @Override // java.lang.Runnable
        public final void run() {
            qz.HI();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI() {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            J2 = null;
            if (Xo.rl.nr() != Xo.n.EXPLICIT_ONLY) {
                ty(lej.TIMER);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final void Ik(final j accessTokenAppId, GraphRequest request, com.facebook.g9s response, final psW appEvents, M flushState) {
        String string;
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError facebookRequestErrorRl = response.rl();
            String str = "Success";
            iwV iwv = iwV.SUCCESS;
            if (facebookRequestErrorRl != null) {
                if (facebookRequestErrorRl.getErrorCode() == -1) {
                    str = "Failed: No Connectivity";
                    iwv = iwV.NO_CONNECTIVITY;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), facebookRequestErrorRl.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    iwv = iwV.SERVER_ERROR;
                }
            }
            if (com.facebook.s4.T(com.facebook.Ew.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.WPU()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                Z.j jVar = com.facebook.internal.Z.f52780O;
                com.facebook.Ew ew = com.facebook.Ew.APP_EVENTS;
                String TAG = rl;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                jVar.t(ew, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.Ik()), str, string);
            }
            appEvents.rl(facebookRequestErrorRl != null);
            iwV iwv2 = iwV.NO_CONNECTIVITY;
            if (iwv == iwv2) {
                com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.appevents.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        qz.r(accessTokenAppId, appEvents);
                    }
                });
            }
            if (iwv == iwV.SUCCESS || flushState.rl() == iwv2) {
                return;
            }
            flushState.nr(iwv);
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(j accessTokenAppId, Ml appEvent) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            nr.n(accessTokenAppId, appEvent);
            if (Xo.rl.nr() != Xo.n.EXPLICIT_ONLY && nr.nr() > f52332t) {
                ty(lej.EVENT_THRESHOLD);
            } else if (J2 == null) {
                J2 = f52330O.schedule(Uo, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final void Uo(final j accessTokenAppId, final Ml appEvent) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f52330O.execute(new Runnable() { // from class: com.facebook.appevents.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    qz.KN(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final M XQ(lej reason, I28 appEventCollection) {
        if (VmF.j.nr(qz.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            M m2 = new M();
            List listGh = gh(appEventCollection, m2);
            if (listGh.isEmpty()) {
                return null;
            }
            Z.j jVar = com.facebook.internal.Z.f52780O;
            com.facebook.Ew ew = com.facebook.Ew.APP_EVENTS;
            String TAG = rl;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            jVar.t(ew, TAG, "Flushing %d events due to %s.", Integer.valueOf(m2.n()), reason.toString());
            Iterator it = listGh.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).gh();
            }
            return m2;
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z() {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Pl.rl(nr);
            nr = new I28();
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(lej reason) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            ty(reason);
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final Set ck() {
        if (VmF.j.nr(qz.class)) {
            return null;
        }
        try {
            return nr.J2();
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
            return null;
        }
    }

    public static final List gh(I28 appEventCollection, M flushResults) {
        if (VmF.j.nr(qz.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean zNY = com.facebook.s4.nY(com.facebook.s4.qie());
            ArrayList arrayList = new ArrayList();
            for (j jVar : appEventCollection.J2()) {
                psW pswT = appEventCollection.t(jVar);
                if (pswT == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestXMQ = xMQ(jVar, pswT, zNY, flushResults);
                if (graphRequestXMQ != null) {
                    arrayList.add(graphRequestXMQ);
                    if (Suk.Ml.f10035n.J2()) {
                        Suk.CN3.qie(graphRequestXMQ);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(j accessTokenAppId, GraphRequest postRequest, psW appEvents, M flushState, com.facebook.g9s response) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            Ik(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final void o() {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            f52330O.execute(new Runnable() { // from class: com.facebook.appevents.C
                @Override // java.lang.Runnable
                public final void run() {
                    qz.Z();
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final void qie(final lej reason) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f52330O.execute(new Runnable() { // from class: com.facebook.appevents.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    qz.az(reason);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(j accessTokenAppId, psW appEvents) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Pl.n(accessTokenAppId, appEvents);
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final void ty(lej reason) {
        if (VmF.j.nr(qz.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            nr.rl(Wre.n());
            try {
                M mXQ = XQ(reason, nr);
                if (mXQ != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", mXQ.n());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", mXQ.rl());
                    LocalBroadcastManager.rl(com.facebook.s4.qie()).nr(intent);
                }
            } catch (Exception e2) {
                Log.w(rl, "Caught unexpected exception while flushing app events: ", e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
        }
    }

    public static final GraphRequest xMQ(final j accessTokenAppId, final psW appEvents, boolean z2, final M flushState) {
        if (VmF.j.nr(qz.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String strRl = accessTokenAppId.rl();
            com.facebook.internal.QJ qjXQ = com.facebook.internal.UGc.XQ(strRl, false);
            GraphRequest.w6 w6Var = GraphRequest.ty;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strRl}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            final GraphRequest graphRequestG = w6Var.g(null, str, null, null);
            graphRequestG.E2(true);
            Bundle bundleXQ = graphRequestG.XQ();
            if (bundleXQ == null) {
                bundleXQ = new Bundle();
            }
            bundleXQ.putString("access_token", accessTokenAppId.n());
            String strNr = rv6.rl.nr();
            if (strNr != null) {
                bundleXQ.putString("device_token", strNr);
            }
            String strQie = QJ.f52289t.qie();
            if (strQie != null) {
                bundleXQ.putString("install_referrer", strQie);
            }
            graphRequestG.T(bundleXQ);
            int iO = appEvents.O(graphRequestG, com.facebook.s4.qie(), qjXQ != null ? qjXQ.aYN() : false, z2);
            if (iO == 0) {
                return null;
            }
            flushState.t(flushState.n() + iO);
            graphRequestG.fD(new GraphRequest.n() { // from class: com.facebook.appevents.aC
                @Override // com.facebook.GraphRequest.n
                public final void n(com.facebook.g9s g9sVar) {
                    qz.mUb(accessTokenAppId, graphRequestG, appEvents, flushState, g9sVar);
                }
            });
            return graphRequestG;
        } catch (Throwable th) {
            VmF.j.rl(th, qz.class);
            return null;
        }
    }

    private qz() {
    }
}
