package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.nKK;
import com.facebook.login.LoginClient;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "", "ty", "()Z", "describeContents", "()I", "", "r", "Ljava/lang/String;", "J2", "()Ljava/lang/String;", "nameForLogging", "o", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String nameForLogging;

    @JvmField
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new j();

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new KatanaProxyLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i2) {
            return new KatanaProxyLoginMethodHandler[i2];
        }

        j() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean ty() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int HI(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z2 = com.facebook.s4.f53007r && com.facebook.internal.Wre.n() != null && request.getLoginBehavior().rl();
        String strN = LoginClient.INSTANCE.n();
        FragmentActivity fragmentActivityXMQ = nr().xMQ();
        String strN2 = request.getApplicationId();
        Set setTy = request.getPermissions();
        boolean zO = request.getIsRerequest();
        boolean zCk = request.ck();
        Ml mlUo = request.getDefaultAudience();
        if (mlUo == null) {
            mlUo = Ml.NONE;
        }
        Ml ml = mlUo;
        String strT = t(request.getAuthId());
        String strT2 = request.getAuthType();
        String strQie = request.getMessengerPageId();
        boolean zHI = request.getResetMessengerState();
        boolean zIk = request.getIsFamilyLogin();
        boolean zNY = request.getShouldSkipAccountDeduplication();
        String strAz = request.getNonce();
        String strNr = request.getCodeChallenge();
        com.facebook.login.j jVarO = request.getCodeChallengeMethod();
        List listTy = nKK.ty(fragmentActivityXMQ, strN2, setTy, strN, zO, zCk, ml, strT, strT2, z2, strQie, zHI, zIk, zNY, strAz, strNr, jVarO != null ? jVarO.name() : null);
        n("e2e", strN);
        Iterator it = listTy.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (g((Intent) it.next(), LoginClient.INSTANCE.rl())) {
                return i2;
            }
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: J2, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "katana_proxy_auth";
    }
}
