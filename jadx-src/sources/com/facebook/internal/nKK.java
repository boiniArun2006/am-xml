package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import d8q.jqQ.QTafcm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class nKK {
    private static final AtomicBoolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Map f52806O;
    private static final Integer[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final nKK f52807n;
    private static final List nr;
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f52808t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class CN3 extends I28 {
        @Override // com.facebook.internal.nKK.I28
        public String nr() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }

        @Override // com.facebook.internal.nKK.I28
        public String t() {
            return "com.facebook.katana.ProxyAuth";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private TreeSet f52809n;

        public void J2() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:7:0x0009, B:13:0x001a, B:15:0x001e, B:17:0x0024, B:12:0x0012), top: B:22:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void n(boolean z2) {
            if (!z2) {
                try {
                    TreeSet treeSet = this.f52809n;
                    if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                        this.f52809n = nKK.rl(nKK.f52807n, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            TreeSet treeSet2 = this.f52809n;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                J2();
            }
        }

        public abstract String nr();

        public abstract String t();

        public String O() {
            return "id_token,token,signed_request,graph_domain";
        }

        public final TreeSet rl() {
            TreeSet treeSet = this.f52809n;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                n(false);
            }
            return this.f52809n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class Ml extends I28 {
        public Void Uo() {
            return null;
        }

        @Override // com.facebook.internal.nKK.I28
        public String nr() {
            return "com.facebook.orca";
        }

        @Override // com.facebook.internal.nKK.I28
        public /* bridge */ /* synthetic */ String t() {
            return (String) Uo();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Wre {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f52810t = new j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private I28 f52811n;
        private int rl;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final Wre n(I28 i28, int i2) {
                Wre wre = new Wre(null);
                wre.f52811n = i28;
                wre.rl = i2;
                return wre;
            }

            public final Wre rl() {
                Wre wre = new Wre(null);
                wre.rl = -1;
                return wre;
            }
        }

        public /* synthetic */ Wre(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Wre() {
        }

        public final int t() {
            return this.rl;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class j extends I28 {
        public Void Uo() {
            return null;
        }

        @Override // com.facebook.internal.nKK.I28
        public String nr() {
            return "com.facebook.arstudio.player";
        }

        @Override // com.facebook.internal.nKK.I28
        public /* bridge */ /* synthetic */ String t() {
            return (String) Uo();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class n extends I28 {
        @Override // com.facebook.internal.nKK.I28
        public String O() {
            return "token,signed_request,graph_domain,granted_scopes";
        }

        @Override // com.facebook.internal.nKK.I28
        public String nr() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.nKK.I28
        public String t() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class w6 extends I28 {
        @Override // com.facebook.internal.nKK.I28
        public String nr() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.nKK.I28
        public String t() {
            return "com.facebook.katana.ProxyAuth";
        }

        private final boolean Uo() {
            if (com.facebook.s4.qie().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.nKK.I28
        public void J2() {
            if (Uo()) {
                Log.w(nKK.t(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private final Intent gh(I28 i28, String str, Collection collection, String str2, boolean z2, com.facebook.login.Ml ml, String str3, String str4, boolean z3, String str5, boolean z4, com.facebook.login.r rVar, boolean z5, boolean z6, String str6, String str7, String str8) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            String strT = i28.t();
            if (strT == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(i28.nr(), strT).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            intentPutExtra.putExtra("facebook_sdk_version", com.facebook.s4.te());
            if (!vd.GR(collection)) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!vd.I(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra("response_type", i28.O());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra("return_scopes", "true");
            if (z2) {
                intentPutExtra.putExtra("default_audience", ml.rl());
            }
            intentPutExtra.putExtra("legacy_override", com.facebook.s4.WPU());
            intentPutExtra.putExtra("auth_type", str4);
            if (z3) {
                intentPutExtra.putExtra(QTafcm.GlrPYqX, true);
            }
            intentPutExtra.putExtra("messenger_page_id", str5);
            intentPutExtra.putExtra("reset_messenger_state", z4);
            if (z5) {
                intentPutExtra.putExtra("fx_app", rVar.toString());
            }
            if (z6) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public static final List ty(Context context, String str, Collection collection, String str2, boolean z2, boolean z3, com.facebook.login.Ml ml, String str3, String str4, boolean z4, String str5, boolean z5, boolean z6, boolean z7, String str6, String str7, String str8) {
        List list;
        List list2 = null;
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            String applicationId = str;
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Collection permissions = collection;
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            String e2e = str2;
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            com.facebook.login.Ml defaultAudience = ml;
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            String clientState = str3;
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            String authType = str4;
            Intrinsics.checkNotNullParameter(authType, "authType");
            List list3 = f52808t;
            ArrayList arrayList = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                list = list2;
                try {
                    Intent intentGh = f52807n.gh((I28) it.next(), applicationId, permissions, e2e, z3, defaultAudience, clientState, authType, z4, str5, z5, com.facebook.login.r.FACEBOOK, z6, z7, str6, str7, str8);
                    if (intentGh != null) {
                        arrayList2.add(intentGh);
                    }
                    applicationId = str;
                    permissions = collection;
                    e2e = str2;
                    defaultAudience = ml;
                    clientState = str3;
                    authType = str4;
                    arrayList = arrayList2;
                    list2 = list;
                } catch (Throwable th) {
                    th = th;
                    VmF.j.rl(th, nKK.class);
                    return list;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            list = list2;
        }
    }

    static {
        nKK nkk = new nKK();
        f52807n = nkk;
        rl = nKK.class.getName();
        f52808t = nkk.J2();
        nr = nkk.O();
        f52806O = nkk.nr();
        J2 = new AtomicBoolean(false);
        Uo = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f A[EXC_TOP_SPLITTER, LOOP:0: B:47:0x006f->B:28:0x0075, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[Catch: all -> 0x0091, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TreeSet HI(I28 i28) {
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = com.facebook.s4.qie().getContentResolver();
            String[] strArr = {NodeModuleProcess.PROPERTY_VERSION};
            Uri uriUo = Uo(i28);
            try {
                try {
                    providerInfoResolveContentProvider = com.facebook.s4.qie().getPackageManager().resolveContentProvider(i28.nr() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e2) {
                    Log.e(rl, "Failed to query content resolver.", e2);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriUo, strArr, null, null, null);
                        } catch (NullPointerException unused) {
                            Log.e(rl, "Failed to query content resolver.");
                            cursorQuery = null;
                            if (cursorQuery != null) {
                            }
                            if (cursorQuery != null) {
                            }
                            return treeSet;
                        }
                    } catch (IllegalArgumentException unused2) {
                        Log.e(rl, "Failed to query content resolver.");
                        cursorQuery = null;
                        if (cursorQuery != null) {
                        }
                        if (cursorQuery != null) {
                        }
                        return treeSet;
                    } catch (SecurityException unused3) {
                        Log.e(rl, "Failed to query content resolver.");
                        cursorQuery = null;
                        if (cursorQuery != null) {
                        }
                        if (cursorQuery != null) {
                        }
                        return treeSet;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(NodeModuleProcess.PROPERTY_VERSION))));
                            } catch (Throwable th2) {
                                cursor = cursorQuery;
                                th = th2;
                                if (cursor != null) {
                                }
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Throwable th4) {
            VmF.j.rl(th4, this);
            return null;
        }
    }

    public static final FacebookException Ik(Bundle bundle) {
        if (VmF.j.nr(nKK.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !StringsKt.equals(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int KN(TreeSet treeSet, int i2, int[] versionSpec) {
        if (VmF.j.nr(nKK.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (true) {
                if (!itDescendingIterator.hasNext()) {
                    break;
                }
                Integer fbAppVersion = (Integer) itDescendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                iMax = Math.max(iMax, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    break;
                }
            }
            return -1;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return 0;
        }
    }

    public static final int S(Intent intent) {
        if (VmF.j.nr(nKK.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF() {
        if (VmF.j.nr(nKK.class)) {
            return;
        }
        try {
            try {
                Iterator it = f52808t.iterator();
                while (it.hasNext()) {
                    ((I28) it.next()).n(true);
                }
            } finally {
                J2.set(false);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
        }
    }

    public static final boolean WPU(int i2) {
        if (VmF.j.nr(nKK.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(Uo, Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return false;
        }
    }

    public static final Bundle XQ(Intent intent) {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !WPU(S(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final int Z() {
        if (VmF.j.nr(nKK.class)) {
            return 0;
        }
        try {
            return Uo[0].intValue();
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return 0;
        }
    }

    public static final void aYN() {
        if (VmF.j.nr(nKK.class)) {
            return;
        }
        try {
            if (J2.compareAndSet(false, true)) {
                com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.internal.Ew
                    @Override // java.lang.Runnable
                    public final void run() {
                        nKK.ViF();
                    }
                });
            }
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
        }
    }

    public static final Intent az(Intent requestIntent, Bundle bundle, FacebookException facebookException) {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID uuidCk = ck(requestIntent);
            if (uuidCk == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", S(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidCk.toString());
            if (facebookException != null) {
                bundle2.putBundle(MRAIDPresenter.ERROR, xMQ(facebookException));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final UUID ck(Intent intent) {
        String stringExtra;
        if (VmF.j.nr(nKK.class) || intent == null) {
            return null;
        }
        try {
            if (WPU(S(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final Intent g(Context context, Intent intent, I28 i28) {
        ResolveInfo resolveInfoResolveService;
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (C.n(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final Intent mUb(Context context, String applicationId, Collection permissions, String e2e, boolean z2, boolean z3, com.facebook.login.Ml defaultAudience, String clientState, String authType, String str, boolean z4, boolean z5, boolean z6) {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            n nVar = new n();
            return nY(context, f52807n.gh(nVar, applicationId, permissions, e2e, z3, defaultAudience, clientState, authType, false, str, z4, com.facebook.login.r.INSTAGRAM, z5, z6, "", null, null), nVar);
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final Intent nY(Context context, Intent intent, I28 i28) {
        ResolveInfo resolveInfoResolveActivity;
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (C.n(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final int o(int i2) {
        if (VmF.j.nr(nKK.class)) {
            return 0;
        }
        try {
            return f52807n.r(f52808t, new int[]{i2}).t();
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return 0;
        }
    }

    public static final Intent qie(Context context) {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (I28 i28 : f52808t) {
                Intent intentG = g(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(i28.nr()).addCategory("android.intent.category.DEFAULT"), i28);
                if (intentG != null) {
                    return intentG;
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet rl(nKK nkk, I28 i28) {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            return nkk.HI(i28);
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final /* synthetic */ String t() {
        if (VmF.j.nr(nKK.class)) {
            return null;
        }
        try {
            return rl;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    public static final Bundle xMQ(FacebookException facebookException) {
        if (VmF.j.nr(nKK.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (!(facebookException instanceof FacebookOperationCanceledException)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th) {
            VmF.j.rl(th, nKK.class);
            return null;
        }
    }

    private nKK() {
    }

    private final List J2() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new w6(), new CN3());
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final List O() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new j());
            arrayListArrayListOf.addAll(J2());
            return arrayListArrayListOf;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Uri Uo(I28 i28) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + i28.nr() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(uri, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Map nr() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Ml());
            List list = f52808t;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", nr);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Wre r(List list, int[] iArr) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            aYN();
            if (list == null) {
                return Wre.f52810t.rl();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                I28 i28 = (I28) it.next();
                int iKN = KN(i28.rl(), Z(), iArr);
                if (iKN != -1) {
                    return Wre.f52810t.n(i28, iKN);
                }
            }
            return Wre.f52810t.rl();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
