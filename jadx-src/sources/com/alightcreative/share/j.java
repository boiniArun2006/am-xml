package com.alightcreative.share;

import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.alightcreative.app.motion.activities.SaveToStorageActivity;
import com.alightcreative.share.n;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static WeakReference f46899n = null;
    private static String rl = "";

    /* JADX INFO: renamed from: com.alightcreative.share.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class C0678j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ken.n.values().length];
            try {
                iArr[Ken.n.f5626n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ken.n.f5628t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ken.n.f5625O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent S(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(iF iFVar, Ken.n nVar, final Function1 function1, final n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WPU(it, iFVar, nVar, new Function0() { // from class: Ken.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.share.j.M(function1, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M7(iF iFVar, Ken.n nVar, final Function1 function1, final n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WPU(it, iFVar, nVar, new Function0() { // from class: Ken.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.share.j.p5(function1, it);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void N(Activity activity, File data, String mimeType, String chooseDialogTitle, final iF eventLogger, final Ken.n shareEventLogType, final Function1 logOnFirebase) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(shareEventLogType, "shareEventLogType");
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(FileProvider.KN(activity, "com.alightcreative.app.motion.fileprovider", data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            int i2 = C0678j.$EnumSwitchMapping$0[shareEventLogType.ordinal()];
            if (i2 == 1) {
                eventLogger.n(new j.Kk1(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i2 == 2) {
                eventLogger.n(new j.Fl(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (Result.m319isFailureimpl(objM313constructorimpl)) {
            objM313constructorimpl = null;
        }
        Uri uri = (Uri) objM313constructorimpl;
        if (uri == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(mimeType);
        f46899n = new WeakReference(new Function1() { // from class: Ken.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.M7(eventLogger, shareEventLogType, logOnFirebase, (com.alightcreative.share.n) obj);
            }
        });
        rl = mimeType;
        XQ(activity, intent, chooseDialogTitle, eventLogger, shareEventLogType, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P5(n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void T(final Activity activity, final File data, final File file, final boolean z2, final int i2, final int i3, final String mimeType, String chooseDialogTitle, final iF eventLogger, final Ken.n shareEventLogType, final Function1 logOnFirebase) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(shareEventLogType, "shareEventLogType");
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(FileProvider.KN(activity, "com.alightcreative.app.motion.fileprovider", data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            int i5 = C0678j.$EnumSwitchMapping$0[shareEventLogType.ordinal()];
            if (i5 == 1) {
                eventLogger.n(new j.Kk1(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i5 == 2) {
                eventLogger.n(new j.Fl(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (Result.m319isFailureimpl(objM313constructorimpl)) {
            objM313constructorimpl = null;
        }
        Uri uri = (Uri) objM313constructorimpl;
        if (uri == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(mimeType);
        f46899n = new WeakReference(new Function1() { // from class: Ken.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.Xw(eventLogger, shareEventLogType, logOnFirebase, (com.alightcreative.share.n) obj);
            }
        });
        rl = mimeType;
        Z(activity, intent, chooseDialogTitle, eventLogger, shareEventLogType, new Function1() { // from class: Ken.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.U(file, activity, data, mimeType, i3, z2, i2, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent U(File file, Activity activity, File file2, String str, int i2, boolean z2, int i3, Intent launchShareChooser) {
        Intrinsics.checkNotNullParameter(launchShareChooser, "$this$launchShareChooser");
        if (file == null) {
            return launchShareChooser;
        }
        Intent intentPutExtra = launchShareChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new LabeledIntent[]{new LabeledIntent(new Intent(activity.getBaseContext(), (Class<?>) SaveToStorageActivity.class).putExtra("internalPath", file2.getAbsolutePath()).putExtra("targetPath", file.getAbsolutePath()).putExtra("mimeType", str).putExtra("saveCompleteMessage", activity.getString(i2)).putExtra("indexMedia", z2), activity.getPackageName(), i3, 2131231737)});
        Intrinsics.checkNotNull(intentPutExtra);
        return intentPutExtra;
    }

    public static /* synthetic */ void ViF(Activity activity, String str, String str2, iF iFVar, Ken.n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            nVar = Ken.n.f5625O;
        }
        Ken.n nVar2 = nVar;
        if ((i2 & 16) != 0) {
            function1 = new Function1() { // from class: Ken.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.alightcreative.share.j.nY((com.alightcreative.share.n) obj2);
                }
            };
        }
        aYN(activity, str, str2, iFVar, nVar2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void WPU(n nVar, iF iFVar, Ken.n nVar2, Function0 function0) {
        int i2 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (nVar instanceof n.C0679n) {
            function0.invoke();
            int i3 = C0678j.$EnumSwitchMapping$0[nVar2.ordinal()];
            if (i3 == 1) {
                iFVar.n(new j.Kk1(((n.C0679n) nVar).rl(), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                return;
            } else if (i3 == 2) {
                iFVar.n(new j.Fl(((n.C0679n) nVar).rl(), str, i2, objArr3 == true ? 1 : 0));
                return;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(nVar instanceof n.j)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = C0678j.$EnumSwitchMapping$0[nVar2.ordinal()];
        if (i5 == 1) {
            iFVar.n(new j.Kk1(null, ((n.j) nVar).n()));
        } else if (i5 == 2) {
            iFVar.n(new j.Fl(null, ((n.j) nVar).n()));
        } else if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ void XQ(Activity activity, Intent intent, String str, iF iFVar, Ken.n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            nVar = Ken.n.f5625O;
        }
        Ken.n nVar2 = nVar;
        if ((i2 & 16) != 0) {
            function1 = new Function1() { // from class: Ken.Xo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.alightcreative.share.j.S((Intent) obj2);
                }
            };
        }
        Z(activity, intent, str, iFVar, nVar2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(iF iFVar, Ken.n nVar, final Function1 function1, final n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WPU(it, iFVar, nVar, new Function0() { // from class: Ken.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.share.j.jB(function1, it);
            }
        });
        return Unit.INSTANCE;
    }

    private static final void Z(Activity activity, Intent intent, String str, iF iFVar, Ken.n nVar, Function1 function1) {
        Object objM313constructorimpl;
        Intent intent2 = new Intent(activity, (Class<?>) ChooserResultReceiver.class);
        int i2 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728;
        intent.addFlags(1);
        Intent intentCreateChooser = Intent.createChooser(intent, str, PendingIntent.getBroadcast(activity, 0, intent2, i2).getIntentSender());
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(intentCreateChooser);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, (Intent) function1.invoke(intentCreateChooser));
            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            int i3 = C0678j.$EnumSwitchMapping$0[nVar.ordinal()];
            if (i3 == 1) {
                iFVar.n(new j.Kk1(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i3 == 2) {
                iFVar.n(new j.Fl(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void aYN(Activity activity, String text, String chooseDialogTitle, final iF eventLogger, final Ken.n shareEventLogType, final Function1 logOnFirebase) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(shareEventLogType, "shareEventLogType");
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "Import Alight Motion Project: " + text);
        intent.setType("text/plain");
        f46899n = new WeakReference(new Function1() { // from class: Ken.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.g(eventLogger, shareEventLogType, logOnFirebase, (com.alightcreative.share.n) obj);
            }
        });
        rl = "text/plain";
        XQ(activity, intent, chooseDialogTitle, eventLogger, shareEventLogType, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bzg(n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(iF iFVar, Ken.n nVar, final Function1 function1, final n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WPU(it, iFVar, nVar, new Function0() { // from class: Ken.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.share.j.X(function1, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eF(n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void fD(Activity activity, Uri uri, String str, String str2, iF iFVar, Ken.n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            nVar = Ken.n.f5625O;
        }
        Ken.n nVar2 = nVar;
        if ((i2 & 32) != 0) {
            function1 = new Function1() { // from class: Ken.Wre
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.alightcreative.share.j.E2((com.alightcreative.share.n) obj2);
                }
            };
        }
        iF(activity, uri, str, str2, iFVar, nVar2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(iF iFVar, Ken.n nVar, final Function1 function1, final n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WPU(it, iFVar, nVar, new Function0() { // from class: Ken.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.share.j.te(function1, it);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void iF(Activity activity, Uri contentUri, String mimeType, String chooseDlgMsg, final iF eventLogger, final Ken.n shareEventLogType, final Function1 logOnFirebase) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(chooseDlgMsg, "chooseDlgMsg");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(shareEventLogType, "shareEventLogType");
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", contentUri);
        intent.setType(mimeType);
        f46899n = new WeakReference(new Function1() { // from class: Ken.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.e(eventLogger, shareEventLogType, logOnFirebase, (com.alightcreative.share.n) obj);
            }
        });
        rl = mimeType;
        XQ(activity, intent, chooseDlgMsg, eventLogger, shareEventLogType, null, 16, null);
    }

    public static final void nHg(Activity activity, String data, String mimeType, String filename, String chooseDialogTitle, iF eventLogger, Ken.n shareEventLogType, Function1 logOnFirebase) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(shareEventLogType, "shareEventLogType");
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        s7N(activity, bytes, mimeType, filename, chooseDialogTitle, eventLogger, shareEventLogType, logOnFirebase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void rV9(Activity activity, String str, String str2, String str3, String str4, iF iFVar, Ken.n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            nVar = Ken.n.f5625O;
        }
        nHg(activity, str, str2, str3, str4, iFVar, nVar, (i2 & 64) != 0 ? new Function1() { // from class: Ken.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return com.alightcreative.share.j.eF((com.alightcreative.share.n) obj2);
            }
        } : function1);
    }

    public static final void s7N(Activity activity, byte[] data, String mimeType, String filename, String chooseDialogTitle, final iF eventLogger, final Ken.n nVar, final Function1 logOnFirebase) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(nVar, qfEYuUHwj.MFrMZdyefginIc);
        Intrinsics.checkNotNullParameter(logOnFirebase, "logOnFirebase");
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        if (StringsKt.contains$default((CharSequence) filename, (CharSequence) KfLR.TeyKjswFKv, false, 2, (Object) null) || filename.length() <= 0) {
            throw new IllegalArgumentException(("'filename' must be not be empty and may not contain slashes: '" + filename + "'").toString());
        }
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(FilesKt.resolve(FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK), "t" + System.currentTimeMillis()), filename);
        if (fileResolve.exists()) {
            throw new IllegalStateException("Check failed.");
        }
        File parentFile = fileResolve.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FilesKt.writeBytes(fileResolve, data);
        objM313constructorimpl = Result.m313constructorimpl(FileProvider.KN(activity, "com.alightcreative.app.motion.fileprovider", fileResolve));
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            int i2 = C0678j.$EnumSwitchMapping$0[nVar.ordinal()];
            if (i2 == 1) {
                eventLogger.n(new j.Kk1(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i2 == 2) {
                eventLogger.n(new j.Fl(null, thM316exceptionOrNullimpl.getMessage()));
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Uri uri = (Uri) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
        if (uri == null) {
            return;
        }
        f46899n = new WeakReference(new Function1() { // from class: Ken.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.E(eventLogger, nVar, logOnFirebase, (com.alightcreative.share.n) obj);
            }
        });
        rl = mimeType;
        Intent intent = new Intent();
        intent.setAction(aNrWBQYwFf.HjMALo);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(mimeType);
        XQ(activity, intent, chooseDialogTitle, eventLogger, nVar, null, 16, null);
    }

    public static /* synthetic */ void v(Activity activity, File file, String str, String str2, iF iFVar, Ken.n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            nVar = Ken.n.f5625O;
        }
        Ken.n nVar2 = nVar;
        if ((i2 & 32) != 0) {
            function1 = new Function1() { // from class: Ken.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.alightcreative.share.j.P5((com.alightcreative.share.n) obj2);
                }
            };
        }
        N(activity, file, str, str2, iFVar, nVar2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(Function1 function1, n nVar) {
        function1.invoke(nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Function1 function1, n nVar) {
        function1.invoke(nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(Function1 function1, n nVar) {
        function1.invoke(nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p5(Function1 function1, n nVar) {
        function1.invoke(nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(Function1 function1, n nVar) {
        function1.invoke(nVar);
        return Unit.INSTANCE;
    }
}
