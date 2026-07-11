package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f52293t = Xo.class.getCanonicalName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final QJ f52294n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void J2(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            QJ.f52289t.ty(context, str);
        }

        public final void KN() {
            QJ.f52289t.Z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Xo Uo(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Xo(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void n(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            QJ.f52289t.J2(application, null);
        }

        public final n nr() {
            return QJ.f52289t.gh();
        }

        public final void rl(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            QJ.f52289t.J2(application, str);
        }

        public final String t(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return QJ.f52289t.mUb(context);
        }

        public final String O() {
            return w6.rl();
        }
    }

    public enum n {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ Xo(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    private Xo(Context context, String str, AccessToken accessToken) {
        this.f52294n = new QJ(context, str, accessToken);
    }

    public final void n() {
        this.f52294n.mUb();
    }

    public final void rl(String str, Bundle bundle) {
        this.f52294n.qie(str, bundle);
    }
}
