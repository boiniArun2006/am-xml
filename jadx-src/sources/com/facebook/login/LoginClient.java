package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.internal.Lu;
import com.facebook.internal.Ml;
import com.facebook.internal.vd;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u0084\u00012\u00020\u0001:\n\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J'\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000f¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u00105J\u0015\u00108\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b8\u0010\u0016J\u0015\u00109\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010\u0016J\u0015\u0010;\u001a\u00020*2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0013¢\u0006\u0004\b>\u0010\u0016J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\u000f\u0010A\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020*H\u0016¢\u0006\u0004\bE\u0010FR*\u0010L\u001a\n\u0012\u0004\u0012\u00020'\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010MR.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0005R$\u0010Y\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0015\u001a\u0004\ba\u00105\"\u0004\bb\u0010cR$\u0010i\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010$R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR0\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010k\u001a\u0004\bp\u0010m\"\u0004\bq\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010MR\u0016\u0010z\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010MR\u0014\u0010}\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0083\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u00105¨\u0006\u008a\u0001"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "KN", "()V", "", "key", "value", "", "accumulate", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/facebook/login/LoginClient$Result;", "outcome", "Z", "(Lcom/facebook/login/LoginClient$Result;)V", "method", "result", "", "loggingExtras", "ck", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Result;Ljava/util/Map;)V", "errorMessage", "errorCode", "Ik", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "ViF", "(Lcom/facebook/login/LoginClient$Request;)V", "rl", "t", "Lcom/facebook/login/LoginMethodHandler;", "mUb", "()Lcom/facebook/login/LoginMethodHandler;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "XQ", "(IILandroid/content/Intent;)Z", "", "qie", "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", "nr", "()Z", "g", "nY", "Uo", "J2", "permission", "O", "(Ljava/lang/String;)I", "pendingResult", "te", "r", "o", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "[Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "handlersToTry", "I", "currentHandler", "Landroidx/fragment/app/Fragment;", "gh", "()Landroidx/fragment/app/Fragment;", "WPU", "Lcom/facebook/login/LoginClient$Ml;", "Lcom/facebook/login/LoginClient$Ml;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$Ml;", "aYN", "(Lcom/facebook/login/LoginClient$Ml;)V", "onCompletedListener", "Lcom/facebook/login/LoginClient$j;", "Lcom/facebook/login/LoginClient$j;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$j;", "S", "(Lcom/facebook/login/LoginClient$j;)V", "backgroundProcessingListener", "getCheckedInternetPermission", "setCheckedInternetPermission", "(Z)V", "checkedInternetPermission", "Lcom/facebook/login/LoginClient$Request;", "HI", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "pendingRequest", "", "Ljava/util/Map;", "getLoggingExtras", "()Ljava/util/Map;", "setLoggingExtras", "(Ljava/util/Map;)V", "getExtraData", "setExtraData", "extraData", "Lcom/facebook/login/c;", "E2", "Lcom/facebook/login/c;", "loginLogger", "e", "numActivitiesReturned", "X", "numTotalIntentsFired", "ty", "()Lcom/facebook/login/c;", "logger", "Landroidx/fragment/app/FragmentActivity;", "xMQ", "()Landroidx/fragment/app/FragmentActivity;", "activity", "az", "inProgress", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "j", "w6", "Ml", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nLoginClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,704:1\n37#2,2:705\n37#2,2:721\n26#3:707\n11653#4,9:708\n13579#4:717\n13580#4:719\n11662#4:720\n1#5:718\n*S KotlinDebug\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient\n*L\n166#1:705,2\n661#1:721,2\n654#1:707\n656#1:708,9\n656#1:717\n656#1:719\n656#1:720\n656#1:718\n*E\n"})
public class LoginClient implements Parcelable {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private C1870c loginLogger;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Ml onCompletedListener;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Fragment fragment;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Map loggingExtras;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private int numTotalIntentsFired;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Request pendingRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int numActivitiesReturned;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map extraData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private LoginMethodHandler[] handlersToTry;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean checkedInternetPermission;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private j backgroundProcessingListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int currentHandler;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final Parcelable.Creator<LoginClient> CREATOR = new n();

    public interface Ml {
        void n(Result result);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bC\u0018\u0000 b2\u00020\u0001:\u0001'B}\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00106\u001a\u0004\b9\u00107\"\u0004\b:\u0010;R\"\u0010?\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010\u001a\"\u0004\b>\u0010\u001eR$\u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00106\u001a\u0004\b@\u00107\"\u0004\bA\u0010;R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00106\u001a\u0004\b+\u00107\"\u0004\bC\u0010;R$\u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u00107\"\u0004\bF\u0010;R$\u0010K\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00106\u001a\u0004\bI\u00107\"\u0004\bJ\u0010;R\"\u0010O\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010=\u001a\u0004\bM\u0010\u001a\"\u0004\bN\u0010\u001eR\u0017\u0010T\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\"\u0010W\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010=\u001a\u0004\bV\u0010\u001a\"\u0004\b=\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010=R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bY\u00106\u001a\u0004\bZ\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b[\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\\\u00106\u001a\u0004\b]\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b1\u0010`R\u0011\u0010a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b8\u0010\u001a¨\u0006c"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "Lcom/facebook/login/Pl;", "loginBehavior", "", "", "permissions", "Lcom/facebook/login/Ml;", "defaultAudience", "authType", "applicationId", "authId", "Lcom/facebook/login/r;", "targetApp", "nonce", "codeVerifier", "codeChallenge", "Lcom/facebook/login/j;", "codeChallengeMethod", "<init>", "(Lcom/facebook/login/Pl;Ljava/util/Set;Lcom/facebook/login/Ml;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/j;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "nY", "()Z", "shouldSkipAccountDeduplication", "", "ViF", "(Z)V", "ck", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lcom/facebook/login/Pl;", "mUb", "()Lcom/facebook/login/Pl;", "t", "Ljava/util/Set;", "ty", "()Ljava/util/Set;", "S", "(Ljava/util/Set;)V", "O", "Lcom/facebook/login/Ml;", "Uo", "()Lcom/facebook/login/Ml;", "J2", "Ljava/lang/String;", "()Ljava/lang/String;", "r", "rl", "setAuthId", "(Ljava/lang/String;)V", "o", "Z", "WPU", "isRerequest", "xMQ", "setDeviceRedirectUriString", "deviceRedirectUriString", "setAuthType", "g", "KN", "setDeviceAuthTargetUserId", "deviceAuthTargetUserId", "E2", "qie", "XQ", "messengerPageId", "e", "HI", "aYN", "resetMessengerState", "X", "Lcom/facebook/login/r;", "gh", "()Lcom/facebook/login/r;", "loginTargetApp", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ik", "isFamilyLogin", "N", "v", "az", "Xw", "jB", "nr", "U", "Lcom/facebook/login/j;", "()Lcom/facebook/login/j;", "isInstagramLogin", "P5", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLoginClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,704:1\n1#2:705\n*E\n"})
    public static final class Request implements Parcelable {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private String messengerPageId;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final String applicationId;

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private boolean shouldSkipAccountDeduplication;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final com.facebook.login.Ml defaultAudience;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private String authType;

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private boolean isFamilyLogin;

        /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
        private final com.facebook.login.j codeChallengeMethod;

        /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
        private final r loginTargetApp;

        /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
        private final String codeVerifier;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private String deviceRedirectUriString;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean resetMessengerState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String deviceAuthTargetUserId;

        /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
        private final String codeChallenge;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Pl loginBehavior;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean isRerequest;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private String authId;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private Set permissions;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final String nonce;

        @JvmField
        public static final Parcelable.Creator<Request> CREATOR = new j();

        public static final class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i2) {
                return new Request[i2];
            }

            j() {
            }
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Request(Pl loginBehavior, Set set, com.facebook.login.Ml defaultAudience, String authType, String applicationId, String authId, r rVar, String str, String str2, String str3, com.facebook.login.j jVar) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.authId = authId;
            this.loginTargetApp = rVar == null ? r.FACEBOOK : rVar;
            if (str == null || str.length() == 0) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                this.nonce = string;
            } else {
                this.nonce = str;
            }
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = jVar;
        }

        /* JADX INFO: renamed from: HI, reason: from getter */
        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        /* JADX INFO: renamed from: Ik, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final com.facebook.login.j getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final void S(Set set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.permissions = set;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final com.facebook.login.Ml getDefaultAudience() {
            return this.defaultAudience;
        }

        public final void ViF(boolean shouldSkipAccountDeduplication) {
            this.shouldSkipAccountDeduplication = shouldSkipAccountDeduplication;
        }

        public final void WPU(boolean z2) {
            this.isRerequest = z2;
        }

        public final void XQ(String str) {
            this.messengerPageId = str;
        }

        public final void Z(boolean z2) {
            this.isFamilyLogin = z2;
        }

        public final void aYN(boolean z2) {
            this.resetMessengerState = z2;
        }

        /* JADX INFO: renamed from: az, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        public final boolean ck() {
            Iterator it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.INSTANCE.O((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final r getLoginTargetApp() {
            return this.loginTargetApp;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final Pl getLoginBehavior() {
            return this.loginBehavior;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* JADX INFO: renamed from: nY, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        /* JADX INFO: renamed from: qie, reason: from getter */
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final boolean r() {
            return this.loginTargetApp == r.INSTAGRAM;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        /* JADX INFO: renamed from: ty, reason: from getter */
        public final Set getPermissions() {
            return this.permissions;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            com.facebook.login.j jVar = this.codeChallengeMethod;
            dest.writeString(jVar != null ? jVar.name() : null);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        private Request(Parcel parcel) {
            com.facebook.login.Ml mlValueOf;
            r rVarValueOf;
            this.loginBehavior = Pl.valueOf(Lu.gh(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                mlValueOf = com.facebook.login.Ml.valueOf(string);
            } else {
                mlValueOf = com.facebook.login.Ml.NONE;
            }
            this.defaultAudience = mlValueOf;
            this.applicationId = Lu.gh(parcel.readString(), "applicationId");
            this.authId = Lu.gh(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Lu.gh(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                rVarValueOf = r.valueOf(string2);
            } else {
                rVarValueOf = r.FACEBOOK;
            }
            this.loginTargetApp = rVarValueOf;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = Lu.gh(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string3 = parcel.readString();
            this.codeChallengeMethod = string3 != null ? com.facebook.login.j.valueOf(string3) : null;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0002./B9\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u00060"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/facebook/login/LoginClient$Result$j;", "code", "Lcom/facebook/AccessToken;", "token", "", "errorMessage", "errorCode", "<init>", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$j;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$j;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lcom/facebook/login/LoginClient$Result$j;", "t", "Lcom/facebook/AccessToken;", "O", "Lcom/facebook/AuthenticationToken;", "J2", "Ljava/lang/String;", "r", "o", "Lcom/facebook/login/LoginClient$Request;", "", "Z", "Ljava/util/Map;", "loggingExtras", "S", "extraData", "g", "j", "w6", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Result implements Parcelable {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        public final String errorMessage;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        public final AuthenticationToken authenticationToken;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        public Map extraData;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        public Map loggingExtras;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final j code;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final Request request;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final String errorCode;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final AccessToken token;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        public static final Parcelable.Creator<Result> CREATOR = new n();

        public enum j {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR(MRAIDPresenter.ERROR);


            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f52912n;

            public final String rl() {
                return this.f52912n;
            }

            j(String str) {
                this.f52912n = str;
            }
        }

        public static final class n implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i2) {
                return new Result[i2];
            }

            n() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$w6, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ Result nr(Companion companion, Request request, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                return companion.t(request, str, str2, str3);
            }

            public final Result O(Request request, AccessToken token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Result(request, j.SUCCESS, token, null, null);
            }

            public final Result n(Request request, String str) {
                return new Result(request, j.CANCEL, null, str, null);
            }

            public final Result rl(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, j.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result t(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, j.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, j code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, flags);
            dest.writeParcelable(this.authenticationToken, flags);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, flags);
            vd.hRu(dest, this.loggingExtras);
            vd.hRu(dest, this.extraData);
        }

        public Result(Request request, j code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = j.valueOf(string == null ? MRAIDPresenter.ERROR : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = vd.Mx(parcel);
            this.extraData = vd.Mx(parcel);
        }
    }

    public interface j {
        void n();

        void rl();
    }

    public static final class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }

        n() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$w6, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String n() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "e2e.toString()");
            return string;
        }

        public final int rl() {
            return Ml.w6.Login.rl();
        }
    }

    public LoginClient(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.currentHandler = -1;
        WPU(fragment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private final void Ik(String method, String result, String errorMessage, String errorCode, Map loggingExtras) {
        Request request = this.pendingRequest;
        if (request == null) {
            ty().mUb("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", method);
        } else {
            ty().t(request.getAuthId(), method, result, errorMessage, errorCode, loggingExtras, request.getIsFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void KN() {
        J2(Result.Companion.nr(Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    private final void Z(Result outcome) {
        Ml ml = this.onCompletedListener;
        if (ml != null) {
            ml.n(outcome);
        }
    }

    private final void ck(String method, Result result, Map loggingExtras) {
        Ik(method, result.code.rl(), result.errorMessage, result.errorCode, loggingExtras);
    }

    private final void n(String key, String value, boolean accumulate) {
        Map map = this.loggingExtras;
        if (map == null) {
            map = new HashMap();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(key) && accumulate) {
            value = ((String) map.get(key)) + ',' + value;
        }
        map.put(key, value);
    }

    private final C1870c ty() {
        String strAz;
        C1870c c1870c = this.loginLogger;
        if (c1870c != null) {
            String strRl = c1870c.rl();
            Request request = this.pendingRequest;
            if (Intrinsics.areEqual(strRl, request != null ? request.getApplicationId() : null)) {
                return c1870c;
            }
        }
        Context contextXMQ = xMQ();
        if (contextXMQ == null) {
            contextXMQ = com.facebook.s4.qie();
        }
        Request request2 = this.pendingRequest;
        if (request2 == null || (strAz = request2.getApplicationId()) == null) {
            strAz = com.facebook.s4.az();
        }
        C1870c c1870c2 = new C1870c(contextXMQ, strAz);
        this.loginLogger = c1870c2;
        return c1870c2;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void J2(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler loginMethodHandlerMUb = mUb();
        if (loginMethodHandlerMUb != null) {
            ck(loginMethodHandlerMUb.getNameForLogging(), outcome, loginMethodHandlerMUb.getMethodLoggingExtras());
        }
        Map map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        Z(outcome);
    }

    public final int O(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        FragmentActivity fragmentActivityXMQ = xMQ();
        if (fragmentActivityXMQ != null) {
            return fragmentActivityXMQ.checkCallingOrSelfPermission(permission);
        }
        return -1;
    }

    public final void S(j jVar) {
        this.backgroundProcessingListener = jVar;
    }

    public final void Uo(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.token == null || !AccessToken.INSTANCE.Uo()) {
            J2(outcome);
        } else {
            te(outcome);
        }
    }

    public final void WPU(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final boolean XQ(int requestCode, int resultCode, Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(CustomTabMainActivity.E2, false)) {
                g();
                return false;
            }
            LoginMethodHandler loginMethodHandlerMUb = mUb();
            if (loginMethodHandlerMUb != null && (!loginMethodHandlerMUb.ty() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return loginMethodHandlerMUb.mUb(requestCode, resultCode, data);
            }
        }
        return false;
    }

    public final void aYN(Ml ml) {
        this.onCompletedListener = ml;
    }

    public final boolean az() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    public final LoginMethodHandler mUb() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i2 = this.currentHandler;
        if (i2 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i2];
    }

    public final boolean nr() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (O("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        FragmentActivity fragmentActivityXMQ = xMQ();
        J2(Result.Companion.nr(Result.INSTANCE, this.pendingRequest, fragmentActivityXMQ != null ? fragmentActivityXMQ.getString(com.facebook.common.Ml.f52357t) : null, fragmentActivityXMQ != null ? fragmentActivityXMQ.getString(com.facebook.common.Ml.rl) : null, null, 8, null));
        return false;
    }

    public final void o() {
        j jVar = this.backgroundProcessingListener;
        if (jVar != null) {
            jVar.rl();
        }
    }

    public LoginMethodHandler[] qie(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        Pl loginBehavior = request.getLoginBehavior();
        if (!request.r()) {
            if (loginBehavior.nr()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!com.facebook.s4.f53006o && loginBehavior.Uo()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!com.facebook.s4.f53006o && loginBehavior.J2()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.rl()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.KN()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.r() && loginBehavior.t()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        return (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
    }

    public final void r() {
        j jVar = this.backgroundProcessingListener;
        if (jVar != null) {
            jVar.n();
        }
    }

    public final void rl(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.INSTANCE.Uo() || nr()) {
            this.pendingRequest = request;
            this.handlersToTry = qie(request);
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:6:0x0013, B:8:0x0021, B:12:0x0040, B:11:0x0031), top: B:18:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void te(Result pendingResult) {
        Result resultRl;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken accessTokenO = AccessToken.INSTANCE.O();
        AccessToken accessToken = pendingResult.token;
        if (accessTokenO != null) {
            try {
                resultRl = Intrinsics.areEqual(accessTokenO.getUserId(), accessToken.getUserId()) ? Result.INSTANCE.rl(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken) : Result.Companion.nr(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
            } catch (Exception e2) {
                J2(Result.Companion.nr(Result.INSTANCE, this.pendingRequest, "Caught exception", e2.getMessage(), null, 8, null));
                return;
            }
        }
        J2(resultRl);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, flags);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, flags);
        vd.hRu(dest, this.loggingExtras);
        vd.hRu(dest, this.extraData);
    }

    public final FragmentActivity xMQ() {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final void ViF(Request request) {
        if (!az()) {
            rl(request);
        }
    }

    public final void g() {
        LoginClient loginClient;
        LoginMethodHandler loginMethodHandlerMUb = mUb();
        if (loginMethodHandlerMUb != null) {
            loginClient = this;
            loginClient.Ik(loginMethodHandlerMUb.getNameForLogging(), "skipped", null, null, loginMethodHandlerMUb.getMethodLoggingExtras());
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i2 = loginClient.currentHandler;
            if (i2 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.currentHandler = i2 + 1;
            if (nY()) {
                return;
            }
        }
        if (loginClient.pendingRequest != null) {
            KN();
        }
    }

    public final boolean nY() {
        String str;
        String str2;
        LoginMethodHandler loginMethodHandlerMUb = mUb();
        if (loginMethodHandlerMUb == null) {
            return false;
        }
        if (loginMethodHandlerMUb.xMQ() && !nr()) {
            n("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int iHI = loginMethodHandlerMUb.HI(request);
        this.numActivitiesReturned = 0;
        if (iHI > 0) {
            C1870c c1870cTy = ty();
            String authId = request.getAuthId();
            String nameForLogging = loginMethodHandlerMUb.getNameForLogging();
            if (request.getIsFamilyLogin()) {
                str2 = "foa_mobile_login_method_start";
            } else {
                str2 = "fb_mobile_login_method_start";
            }
            c1870cTy.O(authId, nameForLogging, str2);
            this.numTotalIntentsFired = iHI;
        } else {
            C1870c c1870cTy2 = ty();
            String authId2 = request.getAuthId();
            String nameForLogging2 = loginMethodHandlerMUb.getNameForLogging();
            if (request.getIsFamilyLogin()) {
                str = "foa_mobile_login_method_not_tried";
            } else {
                str = "fb_mobile_login_method_not_tried";
            }
            c1870cTy2.nr(authId2, nameForLogging2, str);
            n("not_tried", loginMethodHandlerMUb.getNameForLogging(), true);
        }
        if (iHI <= 0) {
            return false;
        }
        return true;
    }

    public final void t() {
        LoginMethodHandler loginMethodHandlerMUb = mUb();
        if (loginMethodHandlerMUb != null) {
            loginMethodHandlerMUb.rl();
        }
    }

    public LoginClient(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.currentHandler = -1;
        Parcelable[] parcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i2];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.az(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i2++;
        }
        this.handlersToTry = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
        this.currentHandler = source.readInt();
        this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
        Map mapMx = vd.Mx(source);
        this.loggingExtras = mapMx != null ? MapsKt.toMutableMap(mapMx) : null;
        Map mapMx2 = vd.Mx(source);
        this.extraData = mapMx2 != null ? MapsKt.toMutableMap(mapMx2) : null;
    }
}
