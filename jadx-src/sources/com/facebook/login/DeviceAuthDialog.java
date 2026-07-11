package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.rv6;
import com.facebook.internal.Ln;
import com.facebook.internal.Lu;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0003lGmB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0015¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0003JC\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010]R\u0016\u0010e\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010]R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "B", "(Lcom/facebook/login/LoginClient$Request;)V", "", "", "X", "()Ljava/util/Map;", "N", "()Ljava/lang/String;", "", "isSmartLogin", "wTp", "(Z)Landroid/view/View;", "", "nHg", "(Z)I", "Lcom/facebook/FacebookException;", "ex", "Xw", "(Lcom/facebook/FacebookException;)V", "bzg", "rV9", "()Z", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "currentRequestState", "FX", "(Lcom/facebook/login/DeviceAuthDialog$RequestState;)V", "P5", "E", "userId", "Lcom/facebook/login/DeviceAuthDialog$n;", "permissions", "accessToken", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "M7", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$n;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "", "expiresIn", "jB", "(Ljava/lang/String;JLjava/lang/Long;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$n;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", "t", "Landroid/widget/TextView;", "confirmationCode", "O", "instructions", "Lcom/facebook/login/DeviceAuthMethodHandler;", "J2", "Lcom/facebook/login/DeviceAuthMethodHandler;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Lcom/facebook/SPz;", "o", "Lcom/facebook/SPz;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "Z", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "S", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "g", "isBeingDestroyed", "E2", "isRetry", "e", "Lcom/facebook/login/LoginClient$Request;", "Lcom/facebook/GraphRequest;", "s7N", "()Lcom/facebook/GraphRequest;", "pollRequest", "j", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceAuthDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAuthDialog.kt\ncom/facebook/login/DeviceAuthDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,545:1\n1#2:546\n*E\n"})
public class DeviceAuthDialog extends DialogFragment {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean isRetry;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private DeviceAuthMethodHandler deviceAuthMethodHandler;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private TextView instructions;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private volatile RequestState currentRequestState;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private volatile ScheduledFuture scheduledPoll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private LoginClient.Request request;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isBeingDestroyed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private View progressBar;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private volatile com.facebook.SPz currentGraphRequestPoll;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean completed = new AtomicBoolean();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private TextView confirmationCode;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f52842T = "device/login";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f52841N = "device/login_status";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f52844v = 1349174;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001\u001dB\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\t\"\u0004\b\"\u0010\rR\"\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b!\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "nr", "()Ljava/lang/String;", "userCode", "", "KN", "(Ljava/lang/String;)V", "", "lastPoll", "J2", "(J)V", "", "xMQ", "()Z", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/String;", "authorizationUri", "t", "O", "Uo", "requestCode", "J", "rl", "()J", "interval", "r", "o", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RequestState implements Parcelable {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private long interval;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private String requestCode;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private String authorizationUri;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long lastPoll;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private String userCode;

        @JvmField
        public static final Parcelable.Creator<RequestState> CREATOR = new j();

        public static final class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i2) {
                return new RequestState[i2];
            }

            j() {
            }
        }

        public RequestState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected RequestState(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        public final void J2(long lastPoll) {
            this.lastPoll = lastPoll;
        }

        public final void KN(String userCode) {
            this.userCode = userCode;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{userCode}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            this.authorizationUri = str;
        }

        public final void O(long j2) {
            this.interval = j2;
        }

        public final void Uo(String str) {
            this.requestCode = str;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final String getUserCode() {
            return this.userCode;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getRequestCode() {
            return this.requestCode;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }

        public final boolean xMQ() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n rl(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                String permission = jSONObjectOptJSONObject.optString("permission");
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (permission.length() != 0 && !Intrinsics.areEqual(permission, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                arrayList2.add(permission);
                            }
                        } else if (strOptString.equals("granted")) {
                            arrayList.add(permission);
                        }
                    } else if (strOptString.equals("expired")) {
                        arrayList3.add(permission);
                    }
                }
            }
            return new n(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f52859n;
        private List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f52860t;

        public n(List grantedPermissions, List declinedPermissions, List expiredPermissions) {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f52859n = grantedPermissions;
            this.rl = declinedPermissions;
            this.f52860t = expiredPermissions;
        }

        public final List n() {
            return this.rl;
        }

        public final List rl() {
            return this.f52860t;
        }

        public final List t() {
            return this.f52859n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class w6 extends Dialog {
        w6(FragmentActivity fragmentActivity, int i2) {
            super(fragmentActivity, i2);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.rV9()) {
                super.onBackPressed();
            }
        }
    }

    public Map X() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        com.facebook.SPz sPz = this.currentGraphRequestPoll;
        if (sPz != null) {
            sPz.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    protected boolean rV9() {
        return true;
    }

    private final void E() {
        RequestState requestState = this.currentRequestState;
        Long lValueOf = requestState != null ? Long.valueOf(requestState.getInterval()) : null;
        if (lValueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.INSTANCE.n().schedule(new Runnable() { // from class: com.facebook.login.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.M(this.f52958n);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    private final void FX(RequestState currentRequestState) {
        this.currentRequestState = currentRequestState;
        TextView textView = this.confirmationCode;
        View view = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            textView = null;
        }
        textView.setText(currentRequestState.getUserCode());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), aT.j.t(currentRequestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.progressBar;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.isRetry && aT.j.J2(currentRequestState.getUserCode())) {
            new rv6(getContext()).J2("fb_smart_login_service");
        }
        if (currentRequestState.xMQ()) {
            E();
        } else {
            P5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DeviceAuthDialog this$0, com.facebook.g9s response) {
        FacebookException facebookException;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.isBeingDestroyed) {
            return;
        }
        if (response.rl() != null) {
            FacebookRequestError facebookRequestErrorRl = response.rl();
            if (facebookRequestErrorRl == null || (facebookException = facebookRequestErrorRl.getException()) == null) {
                facebookException = new FacebookException();
            }
            this$0.Xw(facebookException);
            return;
        }
        JSONObject jSONObjectT = response.t();
        if (jSONObjectT == null) {
            jSONObjectT = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.KN(jSONObjectT.getString("user_code"));
            requestState.Uo(jSONObjectT.getString("code"));
            requestState.O(jSONObjectT.getLong("interval"));
            this$0.FX(requestState);
        } catch (JSONException e2) {
            this$0.Xw(new FacebookException(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DeviceAuthDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P5();
    }

    private final void P5() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.J2(new Date().getTime());
        }
        this.currentGraphRequestPoll = s7N().qie();
    }

    private final void T(String userId, n permissions, String accessToken, Date expirationTime, Date dataAccessExpirationTime) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.XQ(accessToken, com.facebook.s4.az(), userId, permissions.t(), permissions.n(), permissions.rl(), com.facebook.CN3.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DeviceAuthDialog this$0, String accessToken, Date date, Date date2, com.facebook.g9s response) {
        DeviceAuthDialog deviceAuthDialog;
        JSONException jSONException;
        EnumSet enumSetXQ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorRl = response.rl();
        if (facebookRequestErrorRl != null) {
            FacebookException exception = facebookRequestErrorRl.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            this$0.Xw(exception);
            return;
        }
        try {
            JSONObject jSONObjectT = response.t();
            if (jSONObjectT == null) {
                try {
                    jSONObjectT = new JSONObject();
                } catch (JSONException e2) {
                    jSONException = e2;
                    deviceAuthDialog = this$0;
                    deviceAuthDialog.Xw(new FacebookException(jSONException));
                    return;
                }
            }
            String string = jSONObjectT.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            n nVarRl = INSTANCE.rl(jSONObjectT);
            String string2 = jSONObjectT.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                aT.j.n(requestState.getUserCode());
            }
            com.facebook.internal.QJ qjJ2 = com.facebook.internal.UGc.J2(com.facebook.s4.az());
            if (!Intrinsics.areEqual((qjJ2 == null || (enumSetXQ = qjJ2.XQ()) == null) ? null : Boolean.valueOf(enumSetXQ.contains(Ln.RequireConfirm)), Boolean.TRUE) || this$0.isRetry) {
                this$0.T(string, nVarRl, accessToken, date, date2);
            } else {
                this$0.isRetry = true;
                this$0.M7(string, nVarRl, accessToken, string2, date, date2);
            }
        } catch (JSONException e3) {
            deviceAuthDialog = this$0;
            jSONException = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DeviceAuthDialog this$0, com.facebook.g9s response) {
        FacebookException facebookException;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorRl = response.rl();
        if (facebookRequestErrorRl == null) {
            try {
                JSONObject jSONObjectT = response.t();
                if (jSONObjectT == null) {
                    jSONObjectT = new JSONObject();
                }
                String string = jSONObjectT.getString("access_token");
                Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                this$0.jB(string, jSONObjectT.getLong("expires_in"), Long.valueOf(jSONObjectT.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e2) {
                this$0.Xw(new FacebookException(e2));
                return;
            }
        }
        int subErrorCode = facebookRequestErrorRl.getSubErrorCode();
        if (subErrorCode == f52844v || subErrorCode == 1349172) {
            this$0.E();
            return;
        }
        if (subErrorCode == 1349152) {
            RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                aT.j.n(requestState.getUserCode());
            }
            LoginClient.Request request = this$0.request;
            if (request != null) {
                this$0.B(request);
                return;
            } else {
                this$0.bzg();
                return;
            }
        }
        if (subErrorCode == 1349173) {
            this$0.bzg();
            return;
        }
        FacebookRequestError facebookRequestErrorRl2 = response.rl();
        if (facebookRequestErrorRl2 == null || (facebookException = facebookRequestErrorRl2.getException()) == null) {
            facebookException = new FacebookException();
        }
        this$0.Xw(facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eF(DeviceAuthDialog this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewWTp = this$0.wTp(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewWTp);
        }
        LoginClient.Request request = this$0.request;
        if (request != null) {
            this$0.B(request);
        }
    }

    private final void jB(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        final Date date3 = date;
        final Date date4 = date2;
        GraphRequest graphRequestAYN = GraphRequest.ty.aYN(new AccessToken(accessToken, com.facebook.s4.az(), "0", null, null, null, null, date2, null, date3, null, 1024, null), "me", new GraphRequest.n() { // from class: com.facebook.login.Dsr
            @Override // com.facebook.GraphRequest.n
            public final void n(com.facebook.g9s g9sVar) {
                DeviceAuthDialog.U(this.f52864n, accessToken, date4, date3, g9sVar);
            }
        });
        graphRequestAYN.X(com.facebook.afx.GET);
        graphRequestAYN.T(bundle);
        graphRequestAYN.qie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(DeviceAuthDialog this$0, String userId, n permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        this$0.T(userId, permissions, accessToken, date, date2);
    }

    private final GraphRequest s7N() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState != null ? requestState.getRequestCode() : null);
        bundle.putString("access_token", N());
        return GraphRequest.ty.te(null, f52841N, bundle, new GraphRequest.n() { // from class: com.facebook.login.CN3
            @Override // com.facebook.GraphRequest.n
            public final void n(com.facebook.g9s g9sVar) {
                DeviceAuthDialog.e(this.f52834n, g9sVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DeviceAuthDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bzg();
    }

    public void B(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        vd.C(bundle, "redirect_uri", request.getDeviceRedirectUriString());
        vd.C(bundle, "target_user_id", request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", N());
        Map mapX = X();
        bundle.putString("device_info", aT.j.nr(mapX != null ? MapsKt.toMutableMap(mapX) : null));
        GraphRequest.ty.te(null, f52842T, bundle, new GraphRequest.n() { // from class: com.facebook.login.fuX
            @Override // com.facebook.GraphRequest.n
            public final void n(com.facebook.g9s g9sVar) {
                DeviceAuthDialog.J(this.f52971n, g9sVar);
            }
        }).qie();
    }

    public String N() {
        return Lu.rl() + '|' + Lu.t();
    }

    protected void Xw(FacebookException ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                aT.j.n(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.Z(ex);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    protected void bzg() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                aT.j.n(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.o();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    protected int nHg(boolean isSmartLogin) {
        return isSmartLogin ? com.facebook.common.w6.nr : com.facebook.common.w6.rl;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RequestState requestState;
        LoginClient loginClientFD;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        QJ qj = (QJ) ((FacebookActivity) fragmentActivityRequireActivity).getCurrentFragment();
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) ((qj == null || (loginClientFD = qj.fD()) == null) ? null : loginClientFD.mUb());
        if (savedInstanceState != null && (requestState = (RequestState) savedInstanceState.getParcelable("request_state")) != null) {
            FX(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        bzg();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, FijIa.fyxqlvYic);
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable("request_state", this.currentRequestState);
        }
    }

    private final void M7(final String userId, final n permissions, final String accessToken, String name, final Date expirationTime, final Date dataAccessExpirationTime) {
        String string = getResources().getString(com.facebook.common.Ml.Uo);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(com.facebook.common.Ml.J2);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(com.facebook.common.Ml.f52355O);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str, new DialogInterface.OnClickListener() { // from class: com.facebook.login.aC
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DeviceAuthDialog.p5(this.f52962n, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i2);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.C
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DeviceAuthDialog.eF(this.f52833n, dialogInterface, i2);
            }
        });
        builder.create().show();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean z2;
        w6 w6Var = new w6(requireActivity(), com.facebook.common.I28.rl);
        if (aT.j.O() && !this.isRetry) {
            z2 = true;
        } else {
            z2 = false;
        }
        w6Var.setContentView(wTp(z2));
        return w6Var;
    }

    protected View wTp(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View viewInflate = layoutInflater.inflate(nHg(isSmartLogin), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.n.J2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(com.facebook.common.n.f52359O);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.confirmationCode = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(com.facebook.common.n.f52360n);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.I28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.v(this.f52870n, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(com.facebook.common.n.rl);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        this.instructions = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(com.facebook.common.Ml.f52356n)));
        return viewInflate;
    }
}
