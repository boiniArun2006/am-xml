package j;

import HI0.gnv;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f69247n;

    public static /* synthetic */ boolean t(Xo xo, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return xo.rl(z2);
    }

    public Xo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f69247n = context;
    }

    private final qz n() throws IOException {
        String strReplace$default = StringsKt.replace$default(Build.PRODUCT + ":" + Build.BOARD, ',', '-', false, 4, (Object) null);
        Locale locale = Locale.ROOT;
        String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        byte[] bArrAz = gnv.az(upperCase);
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        String lowerCase = gnv.o(bArrAz).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strSubstring = lowerCase.substring(0, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        InputStream inputStreamOpen = this.f69247n.getAssets().open("data/device_capabilities.csv");
        try {
            Intrinsics.checkNotNull(inputStreamOpen);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                qz qzVarNr = nr(TextStreamsKt.lineSequence(bufferedReader), strSubstring);
                CloseableKt.closeFinally(bufferedReader, null);
                CloseableKt.closeFinally(inputStreamOpen, null);
                return qzVarNr;
            } finally {
            }
        } finally {
        }
    }

    private final qz nr(Sequence sequence, String str) {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"device_hash", "maxLayers720", "maxLayers1080", GDEJgAYrPQHfw.wRPekaEbjJTK, "maxLayers2160", "maxRes"});
        int i2 = 0;
        for (Object obj : sequence) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            String str2 = (String) obj;
            int i3 = i2 + 1;
            List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(CollectionsKt.first(listSplit$default), str)) {
                Map map = MapsKt.toMap(CollectionsKt.zip(listListOf, listSplit$default));
                try {
                    return new qz(Integer.parseInt((String) MapsKt.getValue(map, "maxLayers720")), Integer.parseInt((String) MapsKt.getValue(map, "maxLayers1080")), Integer.parseInt((String) MapsKt.getValue(map, "maxLayers1440")), Integer.parseInt((String) MapsKt.getValue(map, "maxLayers2160")), Integer.parseInt((String) MapsKt.getValue(map, "maxRes")));
                } catch (NumberFormatException e2) {
                    Log.d("CapabilityCheck", "Capability DB issue at line=" + i3 + " : " + str2 + "\nException: " + e2.getMessage());
                } catch (NoSuchElementException e3) {
                    Log.d("CapabilityCheck", "Capability DB issue at line=" + i3 + " : " + str2 + "\nException: " + e3.getMessage());
                }
            }
            i2 = i3;
        }
        return null;
    }

    public final boolean rl(boolean z2) throws IOException {
        qz qzVarN = n();
        if (qzVarN != null && System.currentTimeMillis() > 1647600000000L) {
            Log.d("CapabilityCheck", "Capability data found in the local database: " + qzVarN);
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setDeviceCapsAvailableInDb(true);
            if (z2) {
                jVar.setMaxLayers720(qzVarN.nr());
                jVar.setMaxLayers1080(qzVarN.n());
                jVar.setMaxLayers1440(qzVarN.rl());
                jVar.setMaxLayers2160(qzVarN.t());
                jVar.setMaxRes(qzVarN.O());
                jVar.setMaxResWithVideo(qzVarN.J2());
                jVar.setDeviceCapsCheckProd(Build.PRODUCT);
                jVar.setDeviceCapsCheckBypassed(false);
                jVar.setDeviceCapsCheckAttempts(0);
                jVar.setDeviceCapsCheckSuccess(true);
                jVar.setDeviceCapsCheckSource("Database");
                jVar.setDeviceCapsCheckVer(4);
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
                firebaseCrashlytics.setCustomKey("maxLayers720", jVar.getMaxLayers720());
                firebaseCrashlytics.setCustomKey("maxLayers1080", jVar.getMaxLayers1080());
                firebaseCrashlytics.setCustomKey("maxLayers1440", jVar.getMaxLayers1440());
                firebaseCrashlytics.setCustomKey("maxLayers2160", jVar.getMaxLayers2160());
                firebaseCrashlytics.setCustomKey("maxRes", jVar.getMaxRes());
                firebaseCrashlytics.setCustomKey("maxResWithVideo", jVar.getMaxResWithVideo());
                firebaseCrashlytics.setCustomKey("deviceCapsCheckAttempts", jVar.getDeviceCapsCheckAttempts());
                firebaseCrashlytics.setCustomKey("deviceCapsCheckBypassed", jVar.getDeviceCapsCheckBypassed());
            }
            return true;
        }
        com.alightcreative.app.motion.persist.j.INSTANCE.setDeviceCapsAvailableInDb(false);
        return false;
    }
}
