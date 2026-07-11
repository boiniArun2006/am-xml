package LM;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.database.Kr.FlTC;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {
    private final Runnable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Scene f5999O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f6000n;
    private final Handler nr;
    private UUID rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SceneHolder f6001t;
    public static final j Uo = new j(null);
    public static final int KN = 8;
    private static final ExecutorService xMQ = Executors.newSingleThreadExecutor();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Wre wre) {
        ty(wre, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6002n = new n();

        private n() {
        }
    }

    public Wre(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6000n = context;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.rl = uuidRandomUUID;
        this.f6001t = SceneKt.SceneHolder$default(null, 1, null);
        this.nr = new Handler();
        this.J2 = new Runnable() { // from class: LM.Ml
            @Override // java.lang.Runnable
            public final void run() {
                Wre.ck(this.f5980n);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI() {
        return "saveProjectImmediate";
    }

    private final File J2() {
        return HI0.afx.aYN(this.f6000n, this.rl);
    }

    private final File O() {
        return HI0.afx.S(this.f6000n, this.rl);
    }

    static /* synthetic */ void Z(Wre wre, File file, String str, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        wre.o(file, str, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(final Wre wre) {
        HI0.qz.t(xMQ, new Function0() { // from class: LM.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wre.Ik(this.f5972n);
            }
        });
    }

    private final void r(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void ty(Wre wre, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        wre.az(z2);
    }

    public final SceneHolder KN() {
        return this.f6001t;
    }

    public final UUID Uo() {
        return this.rl;
    }

    public final void az(boolean z2) {
        synchronized (n.f6002n) {
            this.nr.removeCallbacks(this.J2);
            Scene rootScene = this.f6001t.getRootScene();
            if (this.f5999O != rootScene || (!nr().exists() && z2)) {
                XoT.C.Uo(this, new Function0() { // from class: LM.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.HI();
                    }
                });
                String strSerializeScene$default = SceneSerializerKt.serializeScene$default(rootScene, false, null, false, false, null, 62, null);
                Z(this, J2(), strSerializeScene$default, null, 2, null);
                if (!Intrinsics.areEqual(FilesKt.readText$default(J2(), null, 1, null), strSerializeScene$default)) {
                    throw new IllegalStateException("Project save failed");
                }
                O().delete();
                nr().renameTo(O());
                J2().renameTo(nr());
                this.f5999O = rootScene;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void gh(Bundle bundle, boolean z2) {
        if (bundle != null) {
            XoT.C.nr("Project onSaveInstanceState : '" + nr() + "' (isFinishing=" + z2 + FlTC.qST);
            az(z2 ^ true);
            bundle.putString("projectID", this.rl.toString());
            bundle.putLongArray("nestedSceneIdPath", CollectionsKt.toLongArray(this.f6001t.getEditingNestedSceneIds()));
            bundle.putString("templateLink", this.f6001t.getRootScene().getTemplateLink());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mUb(Bundle bundle, Intent intent) {
        boolean z2;
        File file;
        if (bundle != null) {
            String string = bundle.getString("projectID");
            Intrinsics.checkNotNull(string);
            this.rl = UUID.fromString(string);
            long[] longArray = bundle.getLongArray("nestedSceneIdPath");
            Iterator it = SequencesKt.sequenceOf(nr(), O(), J2(), HI0.afx.r(this.f6000n, this.rl)).iterator();
            z2 = false;
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                file = (File) it.next();
                try {
                    Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(file, null, 1, null), false, false, false, 14, null);
                    this.f6001t.setRootScene(sceneUnserializeScene$default);
                    try {
                        Iterator<T> it2 = sceneUnserializeScene$default.getMediaInfo().values().iterator();
                        while (it2.hasNext()) {
                            MediaUriInfoKt.updateCache((MediaUriInfo) it2.next());
                        }
                        z2 = true;
                        break loop0;
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        z2 = true;
                        String[] list = HI0.afx.az(this.f6000n).list();
                        XoT.C.nr("Project file not found : '" + file + "' (total " + (list != null ? Integer.valueOf(list.length) : null) + " files) : " + (list != null ? ArraysKt.joinToString$default(list, "//", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null));
                        FirebaseCrashlytics.getInstance().recordException(e);
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                }
                XoT.C.nr("Project file not found : '" + file + "' (total " + (list != null ? Integer.valueOf(list.length) : null) + " files) : " + (list != null ? ArraysKt.joinToString$default(list, "//", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null));
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (z2) {
                while (SceneKt.isEditingNestedScene(this.f6001t)) {
                    this.f6001t.endEditingNestedScene();
                }
                if (longArray != null) {
                    for (long j2 : longArray) {
                        this.f6001t.editNestedScene(j2);
                    }
                }
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("projectID");
                long[] longArrayExtra = intent.getLongArrayExtra("nestedSceneIdPath");
                String stringExtra2 = intent.getStringExtra("projectTitle");
                String stringExtra3 = intent.getStringExtra("projectType");
                if (stringExtra3 != null) {
                    SceneType[] sceneTypeArrValues = SceneType.values();
                    Locale ENGLISH = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String upperCase = stringExtra3.toUpperCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    SceneType sceneType = (SceneType) HI0.Ew.n(sceneTypeArrValues, upperCase);
                    if (sceneType == null) {
                        sceneType = SceneType.SCENE;
                    }
                    SceneType sceneType2 = sceneType;
                    int intExtra = intent.getIntExtra("projectWidth", 1280);
                    int intExtra2 = intent.getIntExtra("projectHeight", 720);
                    int intExtra3 = intent.getIntExtra("projectFPHS", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
                    int intExtra4 = intent.getIntExtra("projectBGColor", 0);
                    String stringExtra4 = intent.getStringExtra("templateLink");
                    if (stringExtra != null) {
                        this.rl = UUID.fromString(stringExtra);
                    }
                    if (nr().exists()) {
                        Scene sceneUnserializeScene$default2 = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(nr(), null, 1, null), false, false, false, 14, null);
                        this.f6001t.setRootScene(sceneUnserializeScene$default2);
                        Iterator<T> it3 = sceneUnserializeScene$default2.getMediaInfo().values().iterator();
                        while (it3.hasNext()) {
                            MediaUriInfoKt.updateCache((MediaUriInfo) it3.next());
                        }
                        while (SceneKt.isEditingNestedScene(this.f6001t)) {
                            this.f6001t.endEditingNestedScene();
                        }
                        if (longArrayExtra != null) {
                            for (long j3 : longArrayExtra) {
                                this.f6001t.editNestedScene(j3);
                            }
                        }
                    } else {
                        SceneHolder sceneHolder = this.f6001t;
                        if (stringExtra2 == null) {
                            stringExtra2 = "Untitled Project";
                        }
                        sceneHolder.setScene(new Scene(stringExtra2, 0, RangesKt.coerceIn(intExtra, 16, 4096), RangesKt.coerceIn(intExtra2, 16, 4096), RangesKt.coerceIn(intExtra, 16, 4096), RangesKt.coerceIn(intExtra2, 16, 4096), null, RangesKt.coerceIn(intExtra3, 1200, 12000), HI0.qf.t(intExtra4), null, sceneType2, null, null, 0, 0, 0, false, 0L, null, stringExtra4, 522818, null));
                    }
                }
            } else {
                this.f6001t.setScene(SceneKt.getEMPTY_SCENE());
            }
        }
        this.f5999O = this.f6001t.getRootScene();
    }

    public final File nr() {
        return HI0.afx.Z(this.f6000n, this.rl);
    }

    public final void qie(boolean z2) {
        if (z2) {
            this.f5999O = null;
        }
        this.nr.removeCallbacks(this.J2);
        this.nr.postDelayed(this.J2, 400L);
    }

    public final void xMQ() {
        synchronized (n.f6002n) {
            this.nr.removeCallbacks(this.J2);
            this.f6001t.setRootScene(SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(nr(), null, 1, null), false, false, false, 14, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void o(File file, String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        r(file, bytes);
    }
}
