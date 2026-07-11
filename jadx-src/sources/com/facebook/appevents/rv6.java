package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.Xo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class rv6 {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final QJ f52333n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void O(Map ud) {
            Intrinsics.checkNotNullParameter(ud, "ud");
            Zs.Uo(ud);
        }

        public final rv6 n(String activityName, String str, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new rv6(activityName, str, accessToken);
        }

        public final String nr() {
            return QJ.f52289t.az();
        }

        public final Executor rl() {
            return QJ.f52289t.xMQ();
        }

        public final Xo.n t() {
            return QJ.f52289t.gh();
        }
    }

    public rv6(QJ loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f52333n = loggerImpl;
    }

    public final void O(String str, String str2) {
        this.f52333n.HI(str, str2);
    }

    public final void n() {
        this.f52333n.mUb();
    }

    public final void rl(Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || com.facebook.s4.ck()) {
            this.f52333n.ck("fb_sdk_settings_changed", null, parameters);
        }
    }

    public rv6(Context context) {
        this(new QJ(context, (String) null, (AccessToken) null));
    }

    public final void J2(String str) {
        if (com.facebook.s4.ck()) {
            this.f52333n.ck(str, null, null);
        }
    }

    public final void KN(String str, Double d2, Bundle bundle) {
        if (com.facebook.s4.ck()) {
            this.f52333n.ck(str, d2, bundle);
        }
    }

    public final void Uo(String str, Bundle bundle) {
        if (com.facebook.s4.ck()) {
            this.f52333n.ck(str, null, bundle);
        }
    }

    public final void mUb(BigDecimal bigDecimal, Currency currency, Bundle bundle, vd vdVar) {
        if (com.facebook.s4.ck()) {
            this.f52333n.o(bigDecimal, currency, bundle, vdVar);
        }
    }

    public final void nr(String str, Bundle bundle) {
        if (com.facebook.s4.ck()) {
            this.f52333n.qie(str, bundle);
        }
    }

    public final void t(String str, double d2, Bundle bundle) {
        if (com.facebook.s4.ck()) {
            this.f52333n.gh(str, d2, bundle);
        }
    }

    public final void xMQ(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, vd vdVar) {
        if (com.facebook.s4.ck()) {
            this.f52333n.Ik(str, bigDecimal, currency, bundle, vdVar);
        }
    }

    public rv6(Context context, String str) {
        this(new QJ(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rv6(String activityName, String str, AccessToken accessToken) {
        this(new QJ(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }
}
