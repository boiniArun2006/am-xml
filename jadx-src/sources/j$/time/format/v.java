package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class v extends u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentHashMap f69098i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextStyle f69099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f69101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f69102h;

    v(TextStyle textStyle, boolean z2) {
        super(j$.time.temporal.q.f(), "ZoneText(" + textStyle + ")");
        this.f69101g = new HashMap();
        this.f69102h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.f69099e = textStyle;
        this.f69100f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    @Override // j$.time.format.u, j$.time.format.InterfaceC2193f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(y yVar, StringBuilder sb) {
        boolean zH;
        TextStyle textStyle;
        String str;
        TextStyle textStyle2;
        String[] strArr;
        ZoneId zoneId = (ZoneId) yVar.f(j$.time.temporal.q.g());
        if (zoneId == null) {
            return false;
        }
        String strU = zoneId.u();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessorD = yVar.d();
            if (!this.f69100f) {
                if (temporalAccessorD.g(j$.time.temporal.a.INSTANT_SECONDS)) {
                    zH = zoneId.s().h(Instant.s(temporalAccessorD));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (temporalAccessorD.g(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (temporalAccessorD.g(aVar2)) {
                            LocalDateTime localDateTimeN = LocalDate.ofEpochDay(temporalAccessorD.h(aVar)).N(LocalTime.X(temporalAccessorD.h(aVar2)));
                            if (zoneId.s().f(localDateTimeN) == null) {
                                zH = zoneId.s().h(localDateTimeN.J(zoneId).toInstant());
                            }
                        }
                    }
                }
                Locale localeC = yVar.c();
                textStyle = TextStyle.NARROW;
                str = null;
                Map concurrentHashMap = null;
                textStyle2 = this.f69099e;
                if (textStyle2 != textStyle) {
                }
                if (str != null) {
                }
            } else {
                zH = 2;
                Locale localeC2 = yVar.c();
                textStyle = TextStyle.NARROW;
                str = null;
                Map concurrentHashMap2 = null;
                textStyle2 = this.f69099e;
                if (textStyle2 != textStyle) {
                    ConcurrentHashMap concurrentHashMap3 = f69098i;
                    SoftReference softReference = (SoftReference) concurrentHashMap3.get(strU);
                    if (softReference == null || (concurrentHashMap2 = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap2.get(localeC2)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(strU);
                        String[] strArr2 = {strU, timeZone.getDisplayName(false, 1, localeC2), timeZone.getDisplayName(false, 0, localeC2), timeZone.getDisplayName(true, 1, localeC2), timeZone.getDisplayName(true, 0, localeC2), strU, strU};
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        concurrentHashMap2.put(localeC2, strArr2);
                        concurrentHashMap3.put(strU, new SoftReference(concurrentHashMap2));
                        strArr = strArr2;
                    }
                    if (zH == 0) {
                        str = strArr[textStyle2.q() + 1];
                    } else if (zH == 1) {
                        str = strArr[textStyle2.q() + 3];
                    } else {
                        str = strArr[textStyle2.q() + 5];
                    }
                }
                if (str != null) {
                    strU = str;
                }
            }
        }
        sb.append(strU);
        return true;
    }

    @Override // j$.time.format.u
    protected final o a(w wVar) {
        o oVar;
        TextStyle textStyle = TextStyle.NARROW;
        TextStyle textStyle2 = this.f69099e;
        if (textStyle2 == textStyle) {
            return super.a(wVar);
        }
        Locale localeI = wVar.i();
        boolean zK = wVar.k();
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        HashMap map = zK ? this.f69101g : this.f69102h;
        Map.Entry entry = (Map.Entry) map.get(localeI);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (oVar = (o) ((SoftReference) entry.getValue()).get()) != null) {
            return oVar;
        }
        o oVarF = o.f(wVar);
        String[][] zoneStrings = DateFormatSymbols.getInstance(localeI).getZoneStrings();
        int length = zoneStrings.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (setA.contains(str)) {
                    oVarF.a(str, str);
                    String strA = F.a(str, localeI);
                    for (int i3 = textStyle2 != TextStyle.FULL ? 2 : 1; i3 < strArr.length; i3 += 2) {
                        oVarF.a(strArr[i3], strA);
                    }
                }
                i2++;
            } else {
                map.put(localeI, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(oVarF)));
                return oVarF;
            }
        }
    }
}
