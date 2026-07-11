package Ge;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {
    public static final boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return !Intrinsics.areEqual(obj, (Object) 0);
        }
        if (obj instanceof String) {
            String string = StringsKt.trim((CharSequence) obj).toString();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = string.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "true")) {
                return true;
            }
        }
        return false;
    }

    public static final int rl(Object obj) {
        Integer intOrNull;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) obj)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final Long t(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return StringsKt.toLongOrNull((String) obj);
        }
        return null;
    }

    public static final String O(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj.toString();
    }

    public static final Map nr(Object obj) {
        if (obj == null) {
            return MapsKt.emptyMap();
        }
        if (!(obj instanceof Map)) {
            return MapsKt.emptyMap();
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            arrayList.add(TuplesKt.to(O(key), entry.getValue()));
        }
        return MapsKt.toMap(arrayList);
    }
}
