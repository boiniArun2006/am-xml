package z8;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: z8.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2484Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2484Dsr f76360n = new C2484Dsr();

    /* JADX INFO: renamed from: z8.Dsr$j */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f76361n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f76362t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f76361n, jVar.f76361n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f76362t == jVar.f76362t;
        }

        public j(String marketingName, String retailBranding, boolean z2) {
            Intrinsics.checkNotNullParameter(marketingName, "marketingName");
            Intrinsics.checkNotNullParameter(retailBranding, "retailBranding");
            this.f76361n = marketingName;
            this.rl = retailBranding;
            this.f76362t = z2;
        }

        public int hashCode() {
            return (((this.f76361n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f76362t);
        }

        public final String n() {
            return this.f76361n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "ExtendedDeviceInfo(marketingName=" + this.f76361n + ", retailBranding=" + this.rl + ", ambiguous=" + this.f76362t + ")";
        }
    }

    public final Map n(Resources resources, ActivityManager activityManager) {
        String str;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        List lines$default = FilesKt.readLines$default(new File("/proc/cpuinfo"), null, 1, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines$default) {
            if (StringsKt.contains$default((CharSequence) obj, (CharSequence) ":", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default((CharSequence) it.next(), new char[]{':'}, false, 2, 2, (Object) null);
            Pair pair = TuplesKt.to(StringsKt.trim((CharSequence) listSplit$default.get(0)).toString(), StringsKt.trim((CharSequence) listSplit$default.get(1)).toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        j jVar = new j("", "", true);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        Pair pair2 = TuplesKt.to("Asset Number", "AN_____");
        Pair pair3 = TuplesKt.to("Serial Number", "________");
        Pair pair4 = TuplesKt.to("Purchase Date", "_____");
        Pair pair5 = TuplesKt.to("Report Date", new Date().toString());
        Pair pair6 = TuplesKt.to("Marketing Name", jVar.n());
        Pair pair7 = TuplesKt.to("Retail Branding", jVar.rl());
        Pair pair8 = TuplesKt.to("Chipset", AbstractC2487Wre.mUb().n());
        Pair pair9 = TuplesKt.to("Build.PRODUCT", Build.PRODUCT);
        Pair pair10 = TuplesKt.to("Build.BOARD", Build.BOARD);
        Pair pair11 = TuplesKt.to("Build.BOOTLOADER", Build.BOOTLOADER);
        Pair pair12 = TuplesKt.to("Build.BRAND", Build.BRAND);
        Pair pair13 = TuplesKt.to("Build.DEVICE", Build.DEVICE);
        Pair pair14 = TuplesKt.to("Build.DISPLAY", Build.DISPLAY);
        Pair pair15 = TuplesKt.to("Build.FINGERPRINT", Build.FINGERPRINT);
        Pair pair16 = TuplesKt.to("Build.HARDWARE", Build.HARDWARE);
        Pair pair17 = TuplesKt.to("Build.ID", Build.ID);
        Pair pair18 = TuplesKt.to("Build.MODEL", Build.MODEL);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        Pair pair19 = TuplesKt.to("Build.SUPPORTED_ABIS", ArraysKt.joinToString$default(SUPPORTED_ABIS, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Pair pair20 = TuplesKt.to("Build.TAGS", Build.TAGS);
        Pair pair21 = TuplesKt.to("Build.TYPE", Build.TYPE);
        Pair pair22 = TuplesKt.to("Build.VERSION.RELEASE", Build.VERSION.RELEASE);
        int i2 = Build.VERSION.SDK_INT;
        Pair pair23 = TuplesKt.to("Build.VERSION.SDK_INT", String.valueOf(i2));
        Pair pair24 = TuplesKt.to("Build.VERSION.PREVIEW_SDK_INT", String.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        Pair pair25 = TuplesKt.to("Build.VERSION.BASE_OS", Build.VERSION.BASE_OS);
        Pair pair26 = TuplesKt.to("Build.VERSION.SECURITY_PATCH", Build.VERSION.SECURITY_PATCH);
        Pair pair27 = TuplesKt.to("Build.VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL);
        Pair pair28 = TuplesKt.to("Build.VERSION.CODENAME", Build.VERSION.CODENAME);
        Pair pair29 = TuplesKt.to("activityManager.memoryClass", String.valueOf(activityManager.getMemoryClass()));
        Pair pair30 = TuplesKt.to("activityManager.largeMemoryClass", String.valueOf(activityManager.getLargeMemoryClass()));
        Pair pair31 = TuplesKt.to("activityManager.launcherLargeIconDensity", String.valueOf(activityManager.getLauncherLargeIconDensity()));
        Pair pair32 = TuplesKt.to("activityManager.launcherLargeIconSize", String.valueOf(activityManager.getLauncherLargeIconSize()));
        Pair pair33 = TuplesKt.to("memInfo.totalMem", String.valueOf(memoryInfo.totalMem));
        Pair pair34 = TuplesKt.to("memInfo.threshold", String.valueOf(memoryInfo.threshold));
        String str2 = (String) linkedHashMap.get("CPU implementer");
        if (str2 == null) {
            str2 = "";
        }
        Pair pair35 = TuplesKt.to("cpuInfo[CPU implementer]", str2);
        String str3 = (String) linkedHashMap.get("CPU architecture");
        if (str3 == null) {
            str3 = "";
        }
        Pair pair36 = TuplesKt.to("cpuInfo[CPU architecture]", str3);
        String str4 = (String) linkedHashMap.get("CPU variant");
        if (str4 == null) {
            str4 = "";
        }
        Pair pair37 = TuplesKt.to("cpuInfo[CPU variant]", str4);
        String str5 = (String) linkedHashMap.get("CPU part");
        if (str5 == null) {
            str5 = "";
        }
        Pair pair38 = TuplesKt.to("cpuInfo[CPU part]", str5);
        String str6 = (String) linkedHashMap.get("CPU revision");
        Pair pair39 = TuplesKt.to("cpuInfo[CPU revision]", str6 != null ? str6 : "");
        Pair pair40 = TuplesKt.to("resources.displayMetrics.density", String.valueOf(resources.getDisplayMetrics().density));
        Pair pair41 = TuplesKt.to("resources.displayMetrics.widthPixels,heightPixels", resources.getDisplayMetrics().widthPixels + "," + resources.getDisplayMetrics().heightPixels);
        Pair pair42 = TuplesKt.to("resources.displayMetrics.scaledDensity", String.valueOf(resources.getDisplayMetrics().scaledDensity));
        Pair pair43 = TuplesKt.to("resources.displayMetrics.xdpi,ydpi", resources.getDisplayMetrics().xdpi + "," + resources.getDisplayMetrics().ydpi);
        int i3 = resources.getDisplayMetrics().densityDpi;
        Pair pair44 = TuplesKt.to("resources.displayMetrics.densityDpi", i3 != 120 ? i3 != 160 ? i3 != 240 ? i3 != 320 ? i3 != 480 ? i3 != 640 ? String.valueOf(resources.getDisplayMetrics().densityDpi) : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi");
        int i5 = resources.getConfiguration().screenLayout & 48;
        Pair pair45 = TuplesKt.to("resources.configuration.screenLayout&SCREENLAYOUT_LONG_MASK", i5 != 0 ? i5 != 16 ? i5 != 32 ? String.valueOf(resources.getConfiguration().screenLayout & 48) : "yes (long)" : "no (normal)" : "undefined");
        int i7 = resources.getConfiguration().screenLayout & 15;
        Pair pair46 = TuplesKt.to("resources.configuration.screenLayout&SCREENLAYOUT_SIZE_MASK", i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? String.valueOf(resources.getConfiguration().screenLayout & 15) : "xlarge" : "large" : "normal" : "small" : "undefined");
        int layoutDirection = resources.getConfiguration().getLayoutDirection();
        if (layoutDirection == 0) {
            str = "LTR";
        } else if (layoutDirection != 1) {
            str = "Unknown " + resources.getConfiguration().getLayoutDirection();
        } else {
            str = "RTL";
        }
        Pair pair47 = TuplesKt.to("resources.configuration.layoutDirection", str);
        Pair pair48 = TuplesKt.to("resources.configuration.densityDpi", String.valueOf(resources.getConfiguration().densityDpi));
        Pair pair49 = TuplesKt.to("resources.configuration.fontScale", String.valueOf(resources.getConfiguration().fontScale));
        Pair pair50 = TuplesKt.to("resources.configuration.mcc", String.valueOf(resources.getConfiguration().mcc));
        Pair pair51 = TuplesKt.to("resources.configuration.mnc", String.valueOf(resources.getConfiguration().mnc));
        Pair pair52 = TuplesKt.to("resources.configuration.screenWidthDp,screenHeightDp", resources.getConfiguration().screenWidthDp + ", " + resources.getConfiguration().screenHeightDp);
        Pair pair53 = TuplesKt.to("resources.configuration.smallestScreenWidthDp", String.valueOf(resources.getConfiguration().smallestScreenWidthDp));
        Pair pair54 = TuplesKt.to("resources.configuration.isScreenHdr", i2 >= 26 ? String.valueOf(resources.getConfiguration().isScreenHdr()) : "N/A");
        Pair pair55 = TuplesKt.to("resources.configuration.isScreenRound", String.valueOf(resources.getConfiguration().isScreenRound()));
        Pair pair56 = TuplesKt.to("resources.configuration.isScreenWideColorGamut", i2 >= 26 ? String.valueOf(resources.getConfiguration().isScreenWideColorGamut()) : "N/A");
        Pair pair57 = TuplesKt.to("ro.board.platform", AbstractC2488aC.n("ro.board.platform"));
        Pair pair58 = TuplesKt.to("ro.hardware", AbstractC2488aC.n("ro.hardware"));
        Pair pair59 = TuplesKt.to("ro.arch", AbstractC2488aC.n("ro.arch"));
        Pair pair60 = TuplesKt.to("ro.mediatek.platform", AbstractC2488aC.n("ro.mediatek.platform"));
        Pair pair61 = TuplesKt.to("ro.chipname", AbstractC2488aC.n("ro.chipname"));
        Integer intOrNull = StringsKt.toIntOrNull(AbstractC2488aC.n("ro.opengles.version"));
        String string = Integer.toString(intOrNull != null ? intOrNull.intValue() : 0, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return MapsKt.mapOf(pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, TuplesKt.to("ro.opengles.version", "0x" + string), TuplesKt.to("Decoders", CollectionsKt.joinToString$default(AbstractC2487Wre.mUb().rl(), ",", null, null, 0, null, null, 62, null)), TuplesKt.to("Encoders", CollectionsKt.joinToString$default(AbstractC2487Wre.mUb().t(), ",", null, null, 0, null, null, 62, null)));
    }

    private C2484Dsr() {
    }
}
