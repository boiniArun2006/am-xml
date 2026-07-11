package AB;

import HI0.gnv;
import QmE.iF;
import QmE.j;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.RedirectEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mCM.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f27n;
    private static boolean rl;

    static final class j implements AR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f28n;

        j(String str) {
            this.f28n = str;
        }

        @Override // AR.w6
        public final Object n(Continuation continuation) {
            pq.Ml ml = new pq.Ml();
            ml.O("u_check_result", this.f28n);
            return ml;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit Ik(final Context context, final CZF.I28 i28, final cKn.Wre wre, final iF iFVar, final kgE.fuX fux, long j2, Task task) {
        j.fuX fux2;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Object result = task.getResult();
            Intrinsics.checkNotNull(result);
            final String strO = Ge.j.O(Ge.j.nr(((l3D) result).f70669n).get(FileUploadManager.f61572j));
            XoT.C.Uo(context, new Function0() { // from class: AB.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return eO.E2(strO);
                }
            });
            i28.J2(new j(strO));
            jXF.j jVarN = wre.n();
            if (jVarN != null) {
                jVarN.n("u_check", "[" + strO + "]");
            }
            if (Intrinsics.areEqual(strO, c.f62177j)) {
                Bundle bundle = new Bundle();
                bundle.putString(FileUploadManager.f61572j, "[" + strO + "]");
                Unit unit = Unit.INSTANCE;
                fux2 = new j.fuX("u_check_normal", bundle);
            } else if (Intrinsics.areEqual(strO, "up")) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(FileUploadManager.f61572j, "[" + strO + "]");
                Unit unit2 = Unit.INSTANCE;
                fux2 = new j.fuX("u_check_update", bundle2);
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString(FileUploadManager.f61572j, "[" + strO + "]");
                Unit unit3 = Unit.INSTANCE;
                fux2 = new j.fuX("u_check_result", bundle3);
            }
            iFVar.n(fux2);
            switch (strO.hashCode()) {
                case 110:
                    if (strO.equals(c.f62177j)) {
                        FirebaseCrashlytics.getInstance().setCustomKey("suspect", false);
                        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                        jVar.setMandatoryUpdateVer(0);
                        jVar.setLastApkValidation(fux.az());
                        jVar.setUpdateSp(false);
                    }
                    break;
                case 3116:
                    if (strO.equals("am")) {
                        final AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle("Error 7085").setMessage("Please reinstall Alight Motion or contact support-android@alightmotion.com for assistance.").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: AB.qz
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                eO.XQ(dialogInterface);
                            }
                        }).setCancelable(false).create();
                        alertDialogCreate.show();
                        new Handler().postDelayed(new Runnable() { // from class: AB.Pl
                            @Override // java.lang.Runnable
                            public final void run() {
                                eO.S(alertDialogCreate);
                            }
                        }, ((long) 10000) + ((long) (Math.random() * ((double) RedirectEvent.f62793a))));
                    }
                    break;
                case 3677:
                    if (strO.equals("sp")) {
                        FirebaseCrashlytics.getInstance().setCustomKey("suspect", true);
                        com.alightcreative.app.motion.persist.j.INSTANCE.setUpdateSp(true);
                    }
                    break;
                case 3739:
                    if (strO.equals("up")) {
                        com.alightcreative.app.motion.persist.j.INSTANCE.setMandatoryUpdateVer(1028425);
                        new AlertDialog.Builder(context).setTitle("Please Update").setMessage("You must update Alight Motion in order to keep using the app").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: AB.C
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                eO.o(dialogInterface);
                            }
                        }).setCancelable(false).setPositiveButton("Update Now", new DialogInterface.OnClickListener() { // from class: AB.o
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                eO.Z(context, dialogInterface, i2);
                            }
                        }).create().show();
                    }
                    break;
                case 96394:
                    if (strO.equals("acl")) {
                        new Handler().postDelayed(new Runnable() { // from class: AB.aC
                            @Override // java.lang.Runnable
                            public final void run() {
                                eO.r();
                            }
                        }, (long) (((double) 30000) + (Math.random() * ((double) RedirectEvent.f62793a))));
                    }
                    break;
                case 96400:
                    if (strO.equals("acr")) {
                        throw new IllegalStateException("u_check failed");
                    }
                    break;
                case 96704:
                    if (strO.equals("aml")) {
                        new Handler().postDelayed(new Runnable() { // from class: AB.Xo
                            @Override // java.lang.Runnable
                            public final void run() {
                                eO.WPU(context);
                            }
                        }, (long) (((double) 30000) + (Math.random() * ((double) RedirectEvent.f62793a))));
                    }
                    break;
                case 96724:
                    if (strO.equals("ana")) {
                    }
                    break;
                case 2987164:
                    if (strO.equals("abfa")) {
                        com.alightcreative.app.motion.persist.j.INSTANCE.setApkInvalid(true);
                    }
                    break;
            }
        } else {
            XoT.C.Uo(context, new Function0() { // from class: AB.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return eO.nY();
                }
            });
            iFVar.n(new j.fuX("u_check_fail", null, 2, null));
            long jAz = fux.az();
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (jAz - Math.max(jVar2.getFirstAppExec(), jVar2.getLastApkValidation()) > 2592000000L) {
                if (j2 >= 1296000000 || rl) {
                    iFVar.n(new j.fuX("u_check_timeout_warn", null, 2, null));
                    new AlertDialog.Builder(context).setTitle(2132019733).setMessage("An internet connection is required to validate Alight Motion.").setCancelable(false).setPositiveButton(2132020061, new DialogInterface.OnClickListener() { // from class: AB.Ml
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            eO.te(context, fux, i28, wre, iFVar, dialogInterface, i2);
                        }
                    }).create().show();
                } else {
                    iFVar.n(new j.fuX("u_check_timeout", null, 2, null));
                    final AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context).setTitle("Error 3565").setMessage("Please contact support-android@alightmotion.com for assistance.").setCancelable(false).create();
                    alertDialogCreate2.show();
                    new Handler().postDelayed(new Runnable() { // from class: AB.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            eO.g(alertDialogCreate2);
                        }
                    }, (long) (((double) 30000) + (Math.random() * ((double) RedirectEvent.f62793a))));
                }
            } else if (jVar2.getMandatoryUpdateVer() != 0 && jVar2.getMandatoryUpdateVer() == 1028425) {
                new AlertDialog.Builder(context).setTitle("Please Update").setMessage("You must update Alight Motion in order to keep using the app").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: AB.fuX
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        eO.iF(dialogInterface);
                    }
                }).setCancelable(false).setPositiveButton("Update Now", new DialogInterface.OnClickListener() { // from class: AB.Dsr
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        eO.fD(context, dialogInterface, i2);
                    }
                }).create().show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2(String str) {
        return "checkIntegrityResult: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WPU(Context context) {
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle("Error 2989").setMessage("Please reinstall Alight Motion or contact support-android@alightmotion.com for assistance.").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: AB.I28
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                eO.aYN(dialogInterface);
            }
        }).setCancelable(false).create();
        alertDialogCreate.show();
        new Handler().postDelayed(new Runnable() { // from class: AB.Wre
            @Override // java.lang.Runnable
            public final void run() {
                eO.ViF(alertDialogCreate);
            }
        }, ((long) 10000) + ((long) (Math.random() * ((double) RedirectEvent.f62793a))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN(DialogInterface dialogInterface) {
        throw new IllegalStateException("u_check state problem (m)");
    }

    public static final void ck(final Context context, final kgE.fuX iapManager, final CZF.I28 pico, final cKn.Wre theirs, final iF eventLogger) {
        ArrayList arrayList;
        Iterator it;
        int i2;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(pico, "pico");
        Intrinsics.checkNotNullParameter(theirs, "theirs");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        if (f27n) {
            return;
        }
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getFirstAppExec() <= 0) {
            jVar.setFirstAppExec(iapManager.az());
        }
        PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            throw new NotImplementedError(null, 1, null);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
        int[] iArr = new int[width];
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("wh", 2131232337), TuplesKt.to("wv", 2131232346), TuplesKt.to("wc", 2131232335)}).iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            String str = (String) pair.component1();
            Drawable drawable = ContextCompat.getDrawable(context2, ((Number) pair.component2()).intValue());
            bitmapCreateBitmap.eraseColor(-12294520);
            if (drawable != null) {
                it = it2;
                i2 = 0;
                drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                drawable.draw(canvas);
            } else {
                it = it2;
                i2 = 0;
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            for (int i3 = i2; i3 < width; i3++) {
                iArr[i3] = iArr[i3] - iArr[i3 % 20];
            }
            linkedHashMap2.put(str, gnv.o(gnv.HI(iArr)));
            context2 = context;
            linkedHashMap = linkedHashMap2;
            it2 = it;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        if (signatureArr != null) {
            arrayList = new ArrayList(signatureArr.length);
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                byte[] bArrTy = gnv.ty(byteArray);
                Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
                arrayList.add(gnv.o(bArrTy));
            }
        } else {
            arrayList = null;
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("r", linkedHashMap3), TuplesKt.to(CmcdData.STREAMING_FORMAT_SS, arrayList), TuplesKt.to("d", Boolean.FALSE), TuplesKt.to("package", context.getPackageName()), TuplesKt.to("vn", packageInfo.versionName), TuplesKt.to("vc", Integer.valueOf(packageInfo.versionCode)), TuplesKt.to(CmcdData.OBJECT_TYPE_INIT_SEGMENT, context.getPackageManager().getInstallerPackageName(context.getPackageName())), TuplesKt.to("bvn", "5.0.273.1028425"), TuplesKt.to("bvc", 1028425), TuplesKt.to("bp", "com.alightcreative.motion"), TuplesKt.to("bd", IvA.o.f4322n), TuplesKt.to(CmcdConfiguration.KEY_STREAM_TYPE, Long.valueOf(iapManager.az())), TuplesKt.to("mt", Long.valueOf(System.currentTimeMillis())), TuplesKt.to("os", Integer.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("mm", Build.MANUFACTURER + "/" + Build.MODEL));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str2, (String) value);
            } else if (value instanceof Long) {
                bundle.putLong(str2, ((Number) value).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str2, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) value).booleanValue());
            }
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                bundle.putString("r_" + ((String) entry2.getKey()), (String) entry2.getValue());
            }
            if (arrayList != null) {
                int i5 = 0;
                for (Object obj : arrayList) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    bundle.putString("s_" + i5, (String) obj);
                    i5 = i7;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        eventLogger.n(new j.fuX("u_check", bundle));
        long jAz = iapManager.az();
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        final long lastApkValidationAttempt = jAz - jVar2.getLastApkValidationAttempt();
        jVar2.setLastApkValidationAttempt(iapManager.az());
        f27n = true;
        com.google.firebase.functions.n.mUb.t().ck("updateCheck").rl(mapMapOf).continueWith(new com.google.android.gms.tasks.Continuation() { // from class: AB.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return eO.Ik(context, pico, theirs, eventLogger, iapManager, lastApkValidationAttempt, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(DialogInterface dialogInterface) {
        throw new IllegalStateException("u_check failed (m)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nY() {
        return "checkIntegrityFailure";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface) {
        throw new IllegalStateException("u_check failed (m)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        throw new IllegalStateException("u_check state problem");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(AlertDialog alertDialog) {
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(AlertDialog alertDialog) {
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(DialogInterface dialogInterface) {
        if (Math.random() >= 0.35d) {
            f27n = false;
            return;
        }
        throw new IllegalStateException("u_check failed (m)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(Context context, DialogInterface dialogInterface, int i2) {
        ot.j.rl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(Context context, DialogInterface dialogInterface, int i2) {
        ot.j.rl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AlertDialog alertDialog) {
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(Context context, kgE.fuX fux, CZF.I28 i28, cKn.Wre wre, iF iFVar, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        f27n = false;
        rl = true;
        ck(context, fux, i28, wre, iFVar);
    }
}
