package CHm;

import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    private static final String[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String[] f836O;
    private static final String[] Uo;
    private static final String[] nr;
    public static final C0020j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f837t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f838n;

    public static final class I28 extends j {
        public static final I28 KN = new I28();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "WriteStorage";
        }

        private I28() {
            super(j.J2, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            return 1416735981;
        }
    }

    public static final class Ml extends j {
        public static final Ml KN = new Ml();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public String toString() {
            return "ReadVisualMedia";
        }

        private Ml() {
            super(j.f837t, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            return 1573262365;
        }
    }

    /* JADX INFO: renamed from: CHm.j$j, reason: collision with other inner class name */
    public static final class C0020j {
        public /* synthetic */ C0020j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0020j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean J2() {
            return Build.VERSION.SDK_INT >= 34;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean O() {
            return Build.VERSION.SDK_INT >= 33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nr() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static final class n extends j {
        public static final n KN = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "ReadAudio";
        }

        private n() {
            super(j.nr, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            return -844687825;
        }
    }

    public static final class w6 extends j {
        public static final w6 KN = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "ReadStorage";
        }

        private w6() {
            super(j.f836O, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            return -1219196268;
        }
    }

    public /* synthetic */ j(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    static {
        Map mapMapOf;
        C0020j c0020j = new C0020j(null);
        rl = c0020j;
        if (c0020j.J2()) {
            Boolean bool = Boolean.FALSE;
            mapMapOf = MapsKt.mapOf(TuplesKt.to("android.permission.READ_MEDIA_IMAGES", bool), TuplesKt.to("android.permission.READ_MEDIA_VIDEO", bool), TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", Boolean.TRUE));
        } else if (c0020j.O()) {
            Boolean bool2 = Boolean.TRUE;
            mapMapOf = MapsKt.mapOf(TuplesKt.to("android.permission.READ_MEDIA_IMAGES", bool2), TuplesKt.to("android.permission.READ_MEDIA_VIDEO", bool2));
        } else {
            mapMapOf = MapsKt.mapOf(TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE", Boolean.TRUE));
        }
        f837t = mapMapOf;
        nr = c0020j.O() ? new String[]{"android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        String[] strArr = c0020j.J2() ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : c0020j.O() ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        f836O = strArr;
        String[] strArr2 = c0020j.nr() ? new String[0] : new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        J2 = strArr2;
        Uo = (String[]) ArraysKt.plus((Object[]) strArr, (Object[]) strArr2);
    }

    public /* synthetic */ j(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final boolean J2() {
        Map map = this.f838n;
        if (map.isEmpty()) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (ArraysKt.contains(Uo, ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    public final Map O() {
        return this.f838n;
    }

    private j(Map map) {
        this.f838n = map;
    }

    private j(String[] strArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            linkedHashMap.put(str, Boolean.TRUE);
        }
        this(linkedHashMap, (DefaultConstructorMarker) null);
    }
}
