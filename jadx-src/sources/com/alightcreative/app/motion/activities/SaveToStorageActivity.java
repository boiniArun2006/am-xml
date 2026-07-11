package com.alightcreative.app.motion.activities;

import CHm.j;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/alightcreative/app/motion/activities/SaveToStorageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "Bu", "", "saveCompleteMessage", "T3L", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "LQmE/iF;", "r", "LQmE/iF;", "QZ6", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "o", "Ljava/lang/Integer;", "exportFormat", "Z", "[Ljava/lang/String;", "projectIds", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "handler", "g", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSaveToStorageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveToStorageActivity.kt\ncom/alightcreative/app/motion/activities/SaveToStorageActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"})
public final class SaveToStorageActivity extends s4q {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler();

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private String[] projectIds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Integer exportFormat;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;
    public static final int E2 = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EF(SaveToStorageActivity saveToStorageActivity, DialogInterface dialogInterface) {
        saveToStorageActivity.setResult(0);
        saveToStorageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void JVN(SaveToStorageActivity saveToStorageActivity, DialogInterface dialogInterface) {
        saveToStorageActivity.setResult(0);
        saveToStorageActivity.finish();
    }

    private final void T3L(String saveCompleteMessage) {
        Toast.makeText(this, saveCompleteMessage, 0).show();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Toy(SaveToStorageActivity saveToStorageActivity, String str) {
        saveToStorageActivity.setResult(-1);
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7b(SaveToStorageActivity saveToStorageActivity, String str) {
        saveToStorageActivity.setResult(-1);
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nO(SaveToStorageActivity saveToStorageActivity, DialogInterface dialogInterface) {
        saveToStorageActivity.setResult(0);
        saveToStorageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ub(SaveToStorageActivity saveToStorageActivity, String str) {
        saveToStorageActivity.setResult(-1);
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0j(SaveToStorageActivity saveToStorageActivity, DialogInterface dialogInterface) {
        saveToStorageActivity.setResult(0);
        saveToStorageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Aum(final SaveToStorageActivity saveToStorageActivity, final Runnable runnable, final ProgressDialog progressDialog, final String str, String str2, final Uri uri) {
        XoT.C.Uo(saveToStorageActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.MoK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.s();
            }
        });
        saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.k
            @Override // java.lang.Runnable
            public final void run() {
                SaveToStorageActivity.Lp6(this.f45302n, runnable, progressDialog, uri, str);
            }
        });
    }

    private final void Bu() {
        List listEmptyList;
        final String stringExtra = getIntent().getStringExtra("mimeType");
        if (stringExtra == null) {
            return;
        }
        final boolean booleanExtra = getIntent().getBooleanExtra("indexMedia", false);
        String stringExtra2 = getIntent().getStringExtra("saveCompleteMessage");
        if (stringExtra2 == null) {
            stringExtra2 = getString(booleanExtra ? 2132020095 : 2132020098);
            Intrinsics.checkNotNull(stringExtra2);
        }
        final String str = stringExtra2;
        final String stringExtra3 = getIntent().getStringExtra("internalPath");
        if (stringExtra3 == null || stringExtra3.length() == 0) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.HD
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SaveToStorageActivity.HBN();
                }
            });
            finish();
            return;
        }
        final File file = new File(stringExtra3);
        if (!file.exists()) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.sK
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SaveToStorageActivity.g6(file);
                }
            });
            finish();
            return;
        }
        final String stringExtra4 = getIntent().getStringExtra("targetPath");
        if (stringExtra3.length() == 0) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.dC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SaveToStorageActivity.Mh();
                }
            });
            finish();
            return;
        }
        Intrinsics.checkNotNull(stringExtra4);
        final File file2 = new File(stringExtra4);
        if (file2.exists()) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.wl0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SaveToStorageActivity.jO(file2);
                }
            });
            if (!booleanExtra) {
                runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.F8
                    @Override // java.lang.Runnable
                    public final void run() {
                        SaveToStorageActivity.Toy(this.f44529n, str);
                    }
                });
                return;
            } else if (Build.VERSION.SDK_INT < 29) {
                MediaScannerConnection.scanFile(this, new String[]{file2.getAbsolutePath()}, new String[]{stringExtra}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.alightcreative.app.motion.activities.KK
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str2, Uri uri) {
                        SaveToStorageActivity.p0N(this.f44599n, str, str2, uri);
                    }
                });
                return;
            } else {
                runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.uQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        SaveToStorageActivity.ub(this.f45692n, str);
                    }
                });
                return;
            }
        }
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(2132020099));
        final Runnable runnable = new Runnable() { // from class: com.alightcreative.app.motion.activities.w8
            @Override // java.lang.Runnable
            public final void run() {
                SaveToStorageActivity.Qu(this.f45710n, progressDialog);
            }
        };
        this.handler.postDelayed(runnable, 250L);
        QmE.iF iFVarQZ6 = QZ6();
        Integer num = this.exportFormat;
        String[] strArr = this.projectIds;
        if (strArr == null || (listEmptyList = ArraysKt.toList(strArr)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        iFVarQZ6.n(new QmE.Pl(num, listEmptyList));
        ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: com.alightcreative.app.motion.activities.L5D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.UF(file2, stringExtra, this, file, runnable, progressDialog, booleanExtra, str, stringExtra3, stringExtra4);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HBN() {
        return "internal path missing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lp6(SaveToStorageActivity saveToStorageActivity, Runnable runnable, ProgressDialog progressDialog, Uri uri, String str) {
        saveToStorageActivity.handler.removeCallbacks(runnable);
        progressDialog.dismiss();
        saveToStorageActivity.setResult(-1, new Intent().putExtra("targetUri", uri.toString()));
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Mh() {
        return "target path missing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uf() {
        return "media scan done";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SaveToStorageActivity saveToStorageActivity, Uri uri, String str) {
        saveToStorageActivity.setResult(-1, new Intent().putExtra("targetUri", uri.toString()));
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g6(File file) {
        return "does not exist: " + file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jO(File file) {
        return "already exists: " + file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o9() {
        return "invoke mediascanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(final SaveToStorageActivity saveToStorageActivity, final String str, String str2, final Uri uri) {
        XoT.C.Uo(saveToStorageActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.WG
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.Uf();
            }
        });
        saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.XX
            @Override // java.lang.Runnable
            public final void run() {
                SaveToStorageActivity.f(this.f44823n, uri, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s() {
        return "media scan done";
    }

    public final QmE.iF QZ6() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 1) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        HI0.Zs.rl(QZ6(), !(grantResults.length == 0) && grantResults[0] == 0, rWZ.fuX.J2, this.projectIds, rWZ.Dsr.f73056n, new Function0() { // from class: com.alightcreative.app.motion.activities.voM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.VwL(this.f45704n);
            }
        }, new Function0() { // from class: com.alightcreative.app.motion.activities.fGM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.mI(this.f45232n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(SaveToStorageActivity saveToStorageActivity, ProgressDialog progressDialog) {
        if (!saveToStorageActivity.isFinishing()) {
            progressDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit UF(final File file, String str, final SaveToStorageActivity saveToStorageActivity, final File file2, final Runnable runnable, final ProgressDialog progressDialog, boolean z2, final String str2, final String str3, final String str4) throws Throwable {
        List listEmptyList;
        List listEmptyList2;
        Uri uri;
        StringBuilder sb;
        String string;
        Throwable th;
        OutputStream outputStreamOpenOutputStream;
        List listEmptyList3;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (Intrinsics.areEqual(str, "video/mp4")) {
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", file.getName());
            contentValues.put("mime_type", str);
            contentValues.put("is_pending", (Integer) 1);
            if (Intrinsics.areEqual(str, "video/mp4")) {
                String str5 = Environment.DIRECTORY_MOVIES;
                sb = new StringBuilder();
                sb.append(str5);
                sb.append("/Alight Motion");
                string = sb.toString();
            } else {
                String str6 = Environment.DIRECTORY_PICTURES;
                sb = new StringBuilder();
                sb.append(str6);
                sb.append("/Alight Motion");
                string = sb.toString();
            }
            contentValues.put("relative_path", string);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? r9 = 0;
            try {
                try {
                    ?? Insert = saveToStorageActivity.getContentResolver().insert(uri, contentValues);
                    objectRef.element = Insert;
                    if (Insert != 0) {
                        outputStreamOpenOutputStream = saveToStorageActivity.getContentResolver().openOutputStream((Uri) objectRef.element);
                        try {
                            if (outputStreamOpenOutputStream != null) {
                                ByteStreamsKt.copyTo(new FileInputStream(file2), outputStreamOpenOutputStream, 1024);
                                contentValues.clear();
                                contentValues.put("is_pending", (Integer) 0);
                                saveToStorageActivity.getContentResolver().update((Uri) objectRef.element, contentValues, null, null);
                                outputStreamOpenOutputStream.close();
                                saveToStorageActivity.handler.removeCallbacks(runnable);
                                progressDialog.dismiss();
                                saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.Bq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SaveToStorageActivity.uG(this.f44347n, objectRef, str2);
                                    }
                                });
                            } else {
                                throw new IOException("Failed to get output stream.");
                            }
                        } catch (IOException e2) {
                            e = e2;
                            QmE.iF iFVarQZ6 = saveToStorageActivity.QZ6();
                            Integer num = saveToStorageActivity.exportFormat;
                            String[] strArr = saveToStorageActivity.projectIds;
                            if (strArr == null || (listEmptyList3 = ArraysKt.toList(strArr)) == null) {
                                listEmptyList3 = CollectionsKt.emptyList();
                            }
                            iFVarQZ6.n(new QmE.qz(num, listEmptyList3, e));
                            Uri uri2 = (Uri) objectRef.element;
                            if (uri2 != null) {
                                saveToStorageActivity.getContentResolver().delete(uri2, null, null);
                            }
                            saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.GS
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SaveToStorageActivity.X4T(e, saveToStorageActivity, file2);
                                }
                            });
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            saveToStorageActivity.handler.removeCallbacks(runnable);
                            progressDialog.dismiss();
                        }
                    } else {
                        throw new IOException("Failed to create new MediaStore record.");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r9 = sb;
                    if (r9 != 0) {
                        r9.close();
                    }
                    saveToStorageActivity.handler.removeCallbacks(runnable);
                    progressDialog.dismiss();
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                outputStreamOpenOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (r9 != 0) {
                }
                saveToStorageActivity.handler.removeCallbacks(runnable);
                progressDialog.dismiss();
                throw th;
            }
        } else {
            XoT.C.Uo(saveToStorageActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.jc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SaveToStorageActivity.Vvq(str3, str4, file);
                }
            });
            try {
                FilesKt.copyTo$default(file2, file, false, 0, 6, null);
                XoT.C.Uo(saveToStorageActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.kI
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveToStorageActivity.o9();
                    }
                });
                QmE.iF iFVarQZ62 = saveToStorageActivity.QZ6();
                Integer num2 = saveToStorageActivity.exportFormat;
                String[] strArr2 = saveToStorageActivity.projectIds;
                if (strArr2 == null || (listEmptyList2 = ArraysKt.toList(strArr2)) == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                iFVarQZ62.n(new QmE.o(num2, listEmptyList2));
                if (!z2) {
                    saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.ZY
                        @Override // java.lang.Runnable
                        public final void run() {
                            SaveToStorageActivity.n7b(this.f44847n, str2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                MediaScannerConnection.scanFile(saveToStorageActivity, new String[]{file.getAbsolutePath()}, new String[]{str}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.alightcreative.app.motion.activities.q9
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str7, Uri uri3) {
                        SaveToStorageActivity.Aum(this.f45602n, runnable, progressDialog, str2, str7, uri3);
                    }
                });
            } catch (IOException e4) {
                QmE.iF iFVarQZ63 = saveToStorageActivity.QZ6();
                Integer num3 = saveToStorageActivity.exportFormat;
                String[] strArr3 = saveToStorageActivity.projectIds;
                if (strArr3 == null || (listEmptyList = ArraysKt.toList(strArr3)) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                iFVarQZ63.n(new QmE.qz(num3, listEmptyList, e4));
                saveToStorageActivity.runOnUiThread(new Runnable() { // from class: com.alightcreative.app.motion.activities.TJC
                    @Override // java.lang.Runnable
                    public final void run() {
                        SaveToStorageActivity.y(e4, saveToStorageActivity, file2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Vvq(String str, String str2, File file) {
        return "copy " + str + " -> " + str2 + ", Q :: " + str2 + ", " + file.getAbsolutePath() + ", " + file.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VwL(SaveToStorageActivity saveToStorageActivity) {
        saveToStorageActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4T(IOException iOException, final SaveToStorageActivity saveToStorageActivity, File file) {
        String message = iOException.getMessage();
        if (message != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "ENOSPC", false, 2, (Object) null)) {
            new AlertDialog.Builder(saveToStorageActivity).o(2132019035).KN(saveToStorageActivity.getResources().getString(2132020039, HI0.gnv.nr(file.length()))).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Nb
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SaveToStorageActivity.Zmq(dialogInterface, i2);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.t5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SaveToStorageActivity.JVN(this.f45671n, dialogInterface);
                }
            }).XQ();
        } else {
            new AlertDialog.Builder(saveToStorageActivity).o(2132017398).KN(iOException.getLocalizedMessage()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.bcg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SaveToStorageActivity.xVH(dialogInterface, i2);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.cX
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SaveToStorageActivity.EF(this.f44929n, dialogInterface);
                }
            }).XQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zmq(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mI(SaveToStorageActivity saveToStorageActivity) {
        saveToStorageActivity.Bu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tFV(SaveToStorageActivity saveToStorageActivity) {
        saveToStorageActivity.Bu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uG(SaveToStorageActivity saveToStorageActivity, Ref.ObjectRef objectRef, String str) {
        List listEmptyList;
        QmE.iF iFVarQZ6 = saveToStorageActivity.QZ6();
        Integer num = saveToStorageActivity.exportFormat;
        String[] strArr = saveToStorageActivity.projectIds;
        if (strArr == null || (listEmptyList = ArraysKt.toList(strArr)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        iFVarQZ6.n(new QmE.o(num, listEmptyList));
        saveToStorageActivity.setResult(-1, new Intent().putExtra("targetUri", String.valueOf(objectRef.element)));
        saveToStorageActivity.T3L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vl(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(IOException iOException, final SaveToStorageActivity saveToStorageActivity, File file) {
        String message = iOException.getMessage();
        if (message != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "ENOSPC", false, 2, (Object) null)) {
            new AlertDialog.Builder(saveToStorageActivity).o(2132019035).KN(saveToStorageActivity.getResources().getString(2132020039, HI0.gnv.nr(file.length()))).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.bx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SaveToStorageActivity.Zn(dialogInterface, i2);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.Vz
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SaveToStorageActivity.nO(this.f44806n, dialogInterface);
                }
            }).XQ();
        } else {
            new AlertDialog.Builder(saveToStorageActivity).o(2132017398).KN(iOException.getLocalizedMessage()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ydh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SaveToStorageActivity.vl(dialogInterface, i2);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.tM
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SaveToStorageActivity.v0j(this.f45678n, dialogInterface);
                }
            }).XQ();
        }
    }

    @Override // com.alightcreative.app.motion.activities.s4q, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Integer numValueOf;
        String[] stringArrayExtra;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String[] strArr = null;
        if (intent != null) {
            numValueOf = Integer.valueOf(intent.getIntExtra("exportFormat", 0));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        this.exportFormat = numValueOf;
        Intent intent2 = getIntent();
        if (intent2 != null && (stringArrayExtra = intent2.getStringArrayExtra("projectIds")) != null && stringArrayExtra.length != 0) {
            strArr = stringArrayExtra;
        }
        this.projectIds = strArr;
        setResult(0);
        setContentView(2131558816);
        HI0.Ml.az(this, j.I28.KN, 1, 2132020233, new Function0() { // from class: com.alightcreative.app.motion.activities.hzB
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveToStorageActivity.tFV(this.f45266n);
            }
        });
    }
}
