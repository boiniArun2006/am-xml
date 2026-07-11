package androidx.compose.material3;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e¨\u0006\u0010"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "", "rl", "(IIIZ)Ljava/lang/String;", "Ljava/text/NumberFormat;", c.f62177j, "(IIZ)Ljava/text/NumberFormat;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "cachedFormatters", "Ljava/util/Locale;", "CalendarLocale", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarLocale.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,61:1\n361#2,7:62\n*S KotlinDebug\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n*L\n53#1:62,7\n*E\n"})
public final class CalendarLocale_jvmKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final WeakHashMap f24658n = new WeakHashMap();

    private static final NumberFormat n(int i2, int i3, boolean z2) {
        String str = i2 + '.' + i3 + '.' + z2 + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f24658n;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z2);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(i3);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return (NumberFormat) obj2;
    }

    public static /* synthetic */ String t(int i2, int i3, int i5, boolean z2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i3 = 1;
        }
        if ((i7 & 2) != 0) {
            i5 = 40;
        }
        if ((i7 & 4) != 0) {
            z2 = false;
        }
        return rl(i2, i3, i5, z2);
    }

    public static final String rl(int i2, int i3, int i5, boolean z2) {
        return n(i3, i5, z2).format(Integer.valueOf(i2));
    }
}
